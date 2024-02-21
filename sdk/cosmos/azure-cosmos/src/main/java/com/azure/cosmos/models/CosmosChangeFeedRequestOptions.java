// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.models;

import com.azure.cosmos.CosmosDiagnosticsThresholds;
import com.azure.cosmos.implementation.CosmosPagedFluxOptions;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.ImplementationBridgeHelpers;
import com.azure.cosmos.implementation.apachecommons.collections.list.UnmodifiableList;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedMode;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedStartFromInternal;
import com.azure.cosmos.implementation.changefeed.common.ChangeFeedState;
import com.azure.cosmos.implementation.feedranges.FeedRangeContinuation;
import com.azure.cosmos.implementation.feedranges.FeedRangeInternal;
import com.azure.cosmos.implementation.query.CompositeContinuationToken;
import com.azure.cosmos.implementation.spark.OperationContextAndListenerTuple;
import com.azure.cosmos.util.Beta;
import com.fasterxml.jackson.databind.JsonNode;

import java.time.Instant;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkArgument;
import static com.azure.cosmos.implementation.guava25.base.Preconditions.checkNotNull;

/**
 * Encapsulates options that can be specified for an operation within a change feed request.
 */
public final class CosmosChangeFeedRequestOptions {
    private static final int DEFAULT_MAX_ITEM_COUNT = 100;
    private static final int DEFAULT_MAX_PREFETCH_PAGE_COUNT = 1;
    private final ChangeFeedState continuationState;
    private final FeedRangeInternal feedRangeInternal;
    private final Map<String, Object> properties;
    private int maxItemCount;
    private int maxPrefetchPageCount;
    private ChangeFeedMode mode;
    private ChangeFeedStartFromInternal startFromInternal;
    private boolean isSplitHandlingDisabled;
    private boolean quotaInfoEnabled;
    private String throughputControlGroupName;
    private Map<String, String> customOptions;
    private OperationContextAndListenerTuple operationContextAndListenerTuple;
    private Function<JsonNode, ?> itemFactoryMethod;
    private CosmosDiagnosticsThresholds thresholds;
    private List<String> excludeRegions;

    private CosmosChangeFeedRequestOptions(
        FeedRangeInternal feedRange,
        ChangeFeedStartFromInternal startFromInternal,
        ChangeFeedMode mode,
        ChangeFeedState continuationState) {
        super();

        if (feedRange == null) {
            throw new NullPointerException("feedRange");
        }

        if (startFromInternal == null) {
            throw new NullPointerException("startFromInternal");
        }

        this.maxItemCount = DEFAULT_MAX_ITEM_COUNT;
        this.maxPrefetchPageCount = DEFAULT_MAX_PREFETCH_PAGE_COUNT;
        this.feedRangeInternal = feedRange;
        this.startFromInternal = startFromInternal;
        this.continuationState = continuationState;

        if (mode != ChangeFeedMode.INCREMENTAL && mode != ChangeFeedMode.FULL_FIDELITY) {
            throw new IllegalArgumentException(
                String.format(
                    "Argument 'mode' has unsupported change feed mode %s",
                    mode.toString()));
        }

        this.mode = mode;
        if (this.mode == ChangeFeedMode.FULL_FIDELITY) {
            this.addCustomOptionsForFullFidelityMode();
        }

        this.properties = new HashMap<>();
        this.isSplitHandlingDisabled = false;
    }

    ChangeFeedState getContinuation() {
        return this.continuationState;
    }

    /**
     * Gets the feed range.
     *
     * @return the feed range.
     */
    public FeedRange getFeedRange() {
        return this.feedRangeInternal;
    }

    /**
     * Gets the maximum number of items to be returned in the enumeration
     * operation.
     *
     * @return the max number of items.
     */
    public int getMaxItemCount() {
        return this.maxItemCount;
    }

    /**
     * Sets the maximum number of items to be returned in the enumeration
     * operation.
     *
     * @param maxItemCount the max number of items.
     * @return the FeedOptionsBase.
     */
    public CosmosChangeFeedRequestOptions setMaxItemCount(int maxItemCount) {
        this.maxItemCount = maxItemCount;
        return this;
    }

    /**
     * Gets the maximum number of pages that will be prefetched from the backend asynchronously
     * in the background. By pre-fetching these changes the throughput of processing the
     * change feed records can be increased because the processing doesn't have to stop while
     * waiting for the IO operations to retrieve a new page form the backend to complete. The
     * only scenario where it can be useful to disable prefetching pages (with
     * setMaxPrefetchPageCount(0))
     * would be when the caller only plans to retrieve just one page - so any prefetched pages
     * would not be used anyway.
     *
     * @return the modified change feed request options.
     */
    public int getMaxPrefetchPageCount() {
        return this.maxPrefetchPageCount;
    }

    /**
     * Sets the maximum number of pages that will be prefetched from the backend asynchronously
     * in the background. By pre-fetching these changes the throughput of processing the
     * change feed records can be increased because the processing doesn't have to stop while
     * waiting for the IO operations to retrieve a new page form the backend to complete. The
     * only scenario where it can be useful to disable prefetching pages (with
     * setMaxPrefetchPageCount(0))
     * would be when the caller only plans to retrieve just one page - so any prefetched pages
     * would not be used anyway.
     *
     * @param maxPrefetchPageCount the max number of pages that will be prefetched from the backend
     *                             asynchronously in the background
     * @return the modified change feed request options.
     */
    public CosmosChangeFeedRequestOptions setMaxPrefetchPageCount(int maxPrefetchPageCount) {
        checkArgument(
            maxPrefetchPageCount > 0,
            "Argument 'maxPrefetchCount' must be larger than 0.");
        this.maxPrefetchPageCount = maxPrefetchPageCount;

        return this;
    }

    /**
     * Gets the quotaInfoEnabled setting for change feed request in the Azure Cosmos DB database service.
     * quotaInfoEnabled is used to enable/disable getting quota related stats
     *
     * @return true if quotaInfoEnabled is enabled
     */
    public boolean isQuotaInfoEnabled() {
        return quotaInfoEnabled;
    }

    /**
     * Gets the quotaInfoEnabled setting for change feed request in the Azure Cosmos DB database service.
     * quotaInfoEnabled is used to enable/disable getting quota related stats
     *
     * @param quotaInfoEnabled a boolean value indicating whether quotaInfoEnabled is enabled or not
     */
    public void setQuotaInfoEnabled(boolean quotaInfoEnabled) {
        this.quotaInfoEnabled = quotaInfoEnabled;
    }

    /**
     * Allows overriding the diagnostic thresholds for a specific operation.
     * @param operationSpecificThresholds the diagnostic threshold override for this operation
     * @return the CosmosQueryRequestOptions.
     */
    public CosmosChangeFeedRequestOptions setDiagnosticsThresholds(
        CosmosDiagnosticsThresholds operationSpecificThresholds) {

        this.thresholds = operationSpecificThresholds;
        return this;
    }

    /**
     * Gets the diagnostic thresholds used as an override for a specific operation. If no operation specific
     * diagnostic threshold has been specified, this method will return null, although at runtime the default
     * thresholds specified at the client-level will be used.
     * @return the diagnostic thresholds used as an override for a specific operation.
     */
    public CosmosDiagnosticsThresholds getDiagnosticsThresholds() {
        return this.thresholds;
    }

    boolean isSplitHandlingDisabled() {
        return this.isSplitHandlingDisabled;
    }

    CosmosChangeFeedRequestOptions disableSplitHandling() {
        this.isSplitHandlingDisabled = true;
        return this;
    }

    ChangeFeedMode getMode() {
        return this.mode;
    }

    /**
     * Gets the properties
     *
     * @return Map of request options properties
     */
    Map<String, Object> getProperties() {
        return properties;
    }

    ChangeFeedStartFromInternal getStartFromSettings() {
        return this.startFromInternal;
    }

    /**
     * Creates a new {@link CosmosChangeFeedRequestOptions} instance to start processing
     * change feed items from the beginning of the change feed
     *
     * @param feedRange The {@link FeedRange} that is used to define the scope (entire container,
     *                  logical partition or subset of a container)
     * @return a new {@link CosmosChangeFeedRequestOptions} instance
     */
    public static CosmosChangeFeedRequestOptions createForProcessingFromBeginning(FeedRange feedRange) {
        checkNotNull(feedRange, "Argument 'feedRange' must not be null.");

        return new CosmosChangeFeedRequestOptions(
            FeedRangeInternal.convert(feedRange),
            ChangeFeedStartFromInternal.createFromBeginning(),
            ChangeFeedMode.INCREMENTAL,
            null);
    }

    /**
     * Creates a new {@link CosmosChangeFeedRequestOptions} instance to start processing
     * change feed items from a previous continuation
     *
     * @param continuation The continuation that was retrieved from a previously retrieved
     *                     FeedResponse
     * @return a new {@link CosmosChangeFeedRequestOptions} instance
     */
    public static CosmosChangeFeedRequestOptions createForProcessingFromContinuation(
        String continuation) {

        final ChangeFeedState changeFeedState = ChangeFeedState.fromString(continuation);

        return createForProcessingFromContinuation(changeFeedState);
    }

    static CosmosChangeFeedRequestOptions createForProcessingFromContinuation(
        ChangeFeedState changeFeedState) {

        FeedRangeInternal feedRange = changeFeedState.getFeedRange();
        FeedRangeContinuation continuation = changeFeedState.getContinuation();
        ChangeFeedMode mode = changeFeedState.getMode();

        if (continuation != null) {
            CompositeContinuationToken continuationToken =
                continuation.getCurrentContinuationToken();
            if (continuationToken != null) {
                String etag = continuationToken.getToken();
                return new CosmosChangeFeedRequestOptions(
                    feedRange,
                    ChangeFeedStartFromInternal.createFromETagAndFeedRange(etag, feedRange),
                    mode,
                    changeFeedState);
            }

            return new CosmosChangeFeedRequestOptions(
                feedRange,
                ChangeFeedStartFromInternal.createFromBeginning(),
                mode,
                changeFeedState);
        }

        return new CosmosChangeFeedRequestOptions(
            feedRange,
            changeFeedState.getStartFromSettings(),
            mode,
            changeFeedState);
    }

    /**
     * Creates a new {@link CosmosChangeFeedRequestOptions} instance to start processing
     * change feed items from the current time - so only events for all future changes will be
     * retrieved
     *
     * @param feedRange The {@link FeedRange} that is used to define the scope (entire container,
     *                  logical partition or subset of a container)
     * @return a new {@link CosmosChangeFeedRequestOptions} instance
     */
    public static CosmosChangeFeedRequestOptions createForProcessingFromNow(FeedRange feedRange) {
        if (feedRange == null) {
            throw new NullPointerException("feedRange");
        }

        return new CosmosChangeFeedRequestOptions(
            FeedRangeInternal.convert(feedRange),
            ChangeFeedStartFromInternal.createFromNow(),
            ChangeFeedMode.INCREMENTAL,
            null);
    }

    /**
     * Creates a new {@link CosmosChangeFeedRequestOptions} instance to start processing
     * change feed items from a certain point in time
     *
     * @param pointInTime The point in time from which processing of change feed events should start
     * @param feedRange   The {@link FeedRange} that is used to define the scope (entire container,
     *                    logical partition or subset of a container)
     * @return a new {@link CosmosChangeFeedRequestOptions} instance
     */
    public static CosmosChangeFeedRequestOptions createForProcessingFromPointInTime(
        Instant pointInTime,
        FeedRange feedRange) {

        if (pointInTime == null) {
            throw new NullPointerException("pointInTime");
        }

        if (feedRange == null) {
            throw new NullPointerException("feedRange");
        }

        return new CosmosChangeFeedRequestOptions(
            FeedRangeInternal.convert(feedRange),
            ChangeFeedStartFromInternal.createFromPointInTime(pointInTime),
            ChangeFeedMode.INCREMENTAL,
            null);
    }

    void setRequestContinuation(String etag) {
        this.startFromInternal = ChangeFeedStartFromInternal.createFromETagAndFeedRange(
            etag,
            this.feedRangeInternal);
    }

    CosmosChangeFeedRequestOptions withCosmosPagedFluxOptions(
        CosmosPagedFluxOptions pagedFluxOptions) {

        if (pagedFluxOptions == null) {
            return this;
        }

        CosmosChangeFeedRequestOptions effectiveRequestOptions = this;

        if (pagedFluxOptions.getRequestContinuation() != null) {
            effectiveRequestOptions =
                CosmosChangeFeedRequestOptions.createForProcessingFromContinuation(
                    pagedFluxOptions.getRequestContinuation());
            effectiveRequestOptions.setMaxPrefetchPageCount(this.getMaxPrefetchPageCount());
            effectiveRequestOptions.setThroughputControlGroupName(this.getThroughputControlGroupName());
        }

        if (pagedFluxOptions.getMaxItemCount() != null) {
            effectiveRequestOptions.setMaxItemCount(pagedFluxOptions.getMaxItemCount());
        }

        return effectiveRequestOptions;
    }

    /**
     * Changes the change feed mode so that the change feed will contain events for creations,
     * deletes as well as all intermediary snapshots for updates. Enabling AllVersionsAndDeletes
     * change feed mode requires configuring a retention duration in the change feed policy of the
     * container. {@link ChangeFeedPolicy}
     * <p>
     * Intermediary snapshots of changes as well as deleted documents would be
     * available for processing for retention window before they vanish.
     * When enabling AllVersionsAndDeletes mode you will only be able to process change feed events
     * within the retention window configured in the change feed policy of the container.
     * If you attempt to process a change feed after more than the retention window
     * an error (Status Code 400) will be returned because the events for intermediary
     * updates and deletes have vanished.
     * It would still be possible to process changes using LatestVersion mode even when
     * configuring a AllVersionsAndDeletes change feed policy with retention window on the container
     * and when using LatestVersion mode it doesn't matter whether your are out of the retention
     * window or not - but no events for deletes or intermediary updates would be included.
     * When events are not getting processed within the retention window it is also possible
     * to continue processing future events in AllVersionsAndDeletes mode by querying the change feed
     * with a new CosmosChangeFeedRequestOptions instance.
     * </p>
     *
     * @return a {@link CosmosChangeFeedRequestOptions} instance with AllVersionsAndDeletes mode enabled
     * @deprecated use {@link CosmosChangeFeedRequestOptions#allVersionsAndDeletes()} instead.
     */
    @Beta(value = Beta.SinceVersion.V4_12_0, warningText =
        Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    @Deprecated //since = "V4_37_0", forRemoval = true
    public CosmosChangeFeedRequestOptions fullFidelity() {

        if (!this.startFromInternal.supportsFullFidelityRetention()) {
            throw new IllegalStateException(
                "Full fidelity retention is not supported for the chosen change feed start from " +
                    "option. Use CosmosChangeFeedRequestOptions.createForProcessingFromNow or " +
                    "CosmosChangeFeedRequestOptions.createFromContinuation instead."
            );
        }

        this.mode = ChangeFeedMode.FULL_FIDELITY;
        this.addCustomOptionsForFullFidelityMode();
        return this;
    }

    /**
     * Changes the change feed mode so that the change feed will contain events for creations,
     * deletes as well as all intermediary snapshots for updates. Enabling AllVersionsAndDeletes
     * change feed mode requires configuring a retention duration in the change feed policy of the
     * container. {@link ChangeFeedPolicy}
     * <p>
     * Intermediary snapshots of changes as well as deleted documents would be
     * available for processing for 8 minutes before they vanish.
     * When enabling AllVersionsAndDeletes mode you will only be able to process change feed events
     * within the retention window configured in the change feed policy of the container.
     * If you attempt to process a change feed after more than the retention window
     * an error (Status Code 400) will be returned because the events for intermediary
     * updates and deletes have vanished.
     * It would still be possible to process changes using LatestVersion mode even when
     * configuring a AllVersionsAndDeletes change feed policy with retention window on the container
     * and when using LatestVersion mode it doesn't matter whether your are out of the retention
     * window or not - but no events for deletes or intermediary updates would be included.
     * When events are not getting processed within the retention window it is also possible
     * to continue processing future events in AllVersionsAndDeletes mode by querying the change feed
     * with a new CosmosChangeFeedRequestOptions instance.
     * </p>
     *
     * @return a {@link CosmosChangeFeedRequestOptions} instance with AllVersionsAndDeletes mode enabled
     */
    @Beta(value = Beta.SinceVersion.V4_37_0, warningText = Beta.PREVIEW_SUBJECT_TO_CHANGE_WARNING)
    public CosmosChangeFeedRequestOptions allVersionsAndDeletes() {

        if (!this.startFromInternal.supportsFullFidelityRetention()) {
            throw new IllegalStateException(
                "All Versions and Deletes mode is not supported for the chosen change feed start from " +
                    "option. Use CosmosChangeFeedRequestOptions.createForProcessingFromNow or " +
                    "CosmosChangeFeedRequestOptions.createFromContinuation instead."
            );
        }

        this.mode = ChangeFeedMode.FULL_FIDELITY;
        this.addCustomOptionsForFullFidelityMode();
        return this;
    }

    /**
     * Get the throughput control group name.
     *
     * @return The throughput control group name.
     */
    public String getThroughputControlGroupName() {
        return this.throughputControlGroupName;
    }

    /**
     * Set the throughput control group name.
     *
     * @param throughputControlGroupName The throughput control group name.
     * @return A {@link CosmosChangeFeedRequestOptions}.
     */
    public CosmosChangeFeedRequestOptions setThroughputControlGroupName(String throughputControlGroupName) {
        this.throughputControlGroupName = throughputControlGroupName;
        return this;
    }

    /**
     * List of regions to exclude for the request/retries. Example "East US" or "East US, West US"
     * These regions will be excluded from the preferred regions list
     *
     * @param excludeRegions list of regions
     * @return the {@link CosmosChangeFeedRequestOptions}
     */
    public CosmosChangeFeedRequestOptions setExcludedRegions(List<String> excludeRegions) {
        this.excludeRegions = excludeRegions;
        return this;
    }

    /**
     * Gets the list of regions to be excluded for the request/retries. These regions are excluded
     * from the preferred region list.
     *
     * @return a list of excluded regions
     * */
    public List<String> getExcludedRegions() {
        if (this.excludeRegions == null) {
            return null;
        }
        return UnmodifiableList.unmodifiableList(this.excludeRegions);
    }

    /**
     * Sets the custom change feed request option value by key
     *
     * @param name  a string representing the custom option's name
     * @param value a string representing the custom option's value
     *
     * @return the CosmosChangeFeedRequestOptions.
     */
    CosmosChangeFeedRequestOptions setHeader(String name, String value) {
        if (this.customOptions == null) {
            this.customOptions = new HashMap<>();
        }
        this.customOptions.put(name, value);
        return this;
    }

    /**
     * Gets the custom change feed request options
     *
     * @return Map of custom request options
     */
    Map<String, String> getHeaders() {
        return this.customOptions;
    }

    void setOperationContextAndListenerTuple(OperationContextAndListenerTuple operationContextAndListenerTuple) {
        this.operationContextAndListenerTuple = operationContextAndListenerTuple;
    }

    OperationContextAndListenerTuple getOperationContextAndListenerTuple() {
        return this.operationContextAndListenerTuple;
    }

    Function<JsonNode, ?> getItemFactoryMethod() { return this.itemFactoryMethod; }

    CosmosChangeFeedRequestOptions setItemFactoryMethod(Function<JsonNode, ?> factoryMethod) {
        this.itemFactoryMethod = factoryMethod;
        return this;
    }

    private void addCustomOptionsForFullFidelityMode() {
        this.setHeader(
            HttpConstants.HttpHeaders.CHANGE_FEED_WIRE_FORMAT_VERSION,
            HttpConstants.ChangeFeedWireFormatVersions.SEPARATE_METADATA_WITH_CRTS);
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    // the following helper/accessor only helps to access this class outside of this package.//
    ///////////////////////////////////////////////////////////////////////////////////////////
    static void initialize() {
        ImplementationBridgeHelpers.CosmosChangeFeedRequestOptionsHelper.setCosmosChangeFeedRequestOptionsAccessor(
            new ImplementationBridgeHelpers.CosmosChangeFeedRequestOptionsHelper.CosmosChangeFeedRequestOptionsAccessor() {

                @Override
                public CosmosChangeFeedRequestOptions setHeader(CosmosChangeFeedRequestOptions changeFeedRequestOptions, String name, String value) {
                    return changeFeedRequestOptions.setHeader(name, value);
                }

                @Override
                public Map<String, String> getHeader(CosmosChangeFeedRequestOptions changeFeedRequestOptions) {
                    return changeFeedRequestOptions.getHeaders();
                }

                @Override
                public void setOperationContext
                    (
                        CosmosChangeFeedRequestOptions changeFeedRequestOptions,
                        OperationContextAndListenerTuple operationContextAndListenerTuple
                    ) {

                    changeFeedRequestOptions.setOperationContextAndListenerTuple(operationContextAndListenerTuple);
                }

                @Override
                public OperationContextAndListenerTuple getOperationContext
                    (
                        CosmosChangeFeedRequestOptions changeFeedRequestOptions
                    ) {

                    return changeFeedRequestOptions.getOperationContextAndListenerTuple();
                }

                @Override
                @SuppressWarnings("unchecked")
                public <T> Function<JsonNode, T> getItemFactoryMethod(
                    CosmosChangeFeedRequestOptions options, Class<T> classOfT) {

                    return (Function<JsonNode, T>)options.getItemFactoryMethod();
                }

                @Override
                public CosmosChangeFeedRequestOptions setItemFactoryMethod(
                    CosmosChangeFeedRequestOptions options,
                    Function<JsonNode, ?> factoryMethod) {

                    return options.setItemFactoryMethod(factoryMethod);
                }

                @Override
                public CosmosDiagnosticsThresholds getDiagnosticsThresholds(CosmosChangeFeedRequestOptions options) {
                    return options.thresholds;
                }

                @Override
                public List<String> getExcludeRegions(CosmosChangeFeedRequestOptions cosmosChangeFeedRequestOptions) {
                    return cosmosChangeFeedRequestOptions.excludeRegions;
                }
            });
    }

    static { initialize(); }
}
