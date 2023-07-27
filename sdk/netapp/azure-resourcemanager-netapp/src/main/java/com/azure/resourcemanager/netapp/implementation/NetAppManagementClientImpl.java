// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.netapp.fluent.AccountBackupsClient;
import com.azure.resourcemanager.netapp.fluent.AccountsClient;
import com.azure.resourcemanager.netapp.fluent.BackupPoliciesClient;
import com.azure.resourcemanager.netapp.fluent.BackupsClient;
import com.azure.resourcemanager.netapp.fluent.NetAppManagementClient;
import com.azure.resourcemanager.netapp.fluent.NetAppResourceQuotaLimitsClient;
import com.azure.resourcemanager.netapp.fluent.NetAppResourcesClient;
import com.azure.resourcemanager.netapp.fluent.OperationsClient;
import com.azure.resourcemanager.netapp.fluent.PoolsClient;
import com.azure.resourcemanager.netapp.fluent.SnapshotPoliciesClient;
import com.azure.resourcemanager.netapp.fluent.SnapshotsClient;
import com.azure.resourcemanager.netapp.fluent.SubvolumesClient;
import com.azure.resourcemanager.netapp.fluent.VolumeGroupsClient;
import com.azure.resourcemanager.netapp.fluent.VolumeQuotaRulesClient;
import com.azure.resourcemanager.netapp.fluent.VolumesClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the NetAppManagementClientImpl type. */
@ServiceClient(builder = NetAppManagementClientBuilder.class)
public final class NetAppManagementClientImpl implements NetAppManagementClient {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The NetAppResourcesClient object to access its operations. */
    private final NetAppResourcesClient netAppResources;

    /**
     * Gets the NetAppResourcesClient object to access its operations.
     *
     * @return the NetAppResourcesClient object.
     */
    public NetAppResourcesClient getNetAppResources() {
        return this.netAppResources;
    }

    /** The NetAppResourceQuotaLimitsClient object to access its operations. */
    private final NetAppResourceQuotaLimitsClient netAppResourceQuotaLimits;

    /**
     * Gets the NetAppResourceQuotaLimitsClient object to access its operations.
     *
     * @return the NetAppResourceQuotaLimitsClient object.
     */
    public NetAppResourceQuotaLimitsClient getNetAppResourceQuotaLimits() {
        return this.netAppResourceQuotaLimits;
    }

    /** The AccountsClient object to access its operations. */
    private final AccountsClient accounts;

    /**
     * Gets the AccountsClient object to access its operations.
     *
     * @return the AccountsClient object.
     */
    public AccountsClient getAccounts() {
        return this.accounts;
    }

    /** The PoolsClient object to access its operations. */
    private final PoolsClient pools;

    /**
     * Gets the PoolsClient object to access its operations.
     *
     * @return the PoolsClient object.
     */
    public PoolsClient getPools() {
        return this.pools;
    }

    /** The VolumesClient object to access its operations. */
    private final VolumesClient volumes;

    /**
     * Gets the VolumesClient object to access its operations.
     *
     * @return the VolumesClient object.
     */
    public VolumesClient getVolumes() {
        return this.volumes;
    }

    /** The SnapshotsClient object to access its operations. */
    private final SnapshotsClient snapshots;

    /**
     * Gets the SnapshotsClient object to access its operations.
     *
     * @return the SnapshotsClient object.
     */
    public SnapshotsClient getSnapshots() {
        return this.snapshots;
    }

    /** The SnapshotPoliciesClient object to access its operations. */
    private final SnapshotPoliciesClient snapshotPolicies;

    /**
     * Gets the SnapshotPoliciesClient object to access its operations.
     *
     * @return the SnapshotPoliciesClient object.
     */
    public SnapshotPoliciesClient getSnapshotPolicies() {
        return this.snapshotPolicies;
    }

    /** The BackupsClient object to access its operations. */
    private final BackupsClient backups;

    /**
     * Gets the BackupsClient object to access its operations.
     *
     * @return the BackupsClient object.
     */
    public BackupsClient getBackups() {
        return this.backups;
    }

    /** The AccountBackupsClient object to access its operations. */
    private final AccountBackupsClient accountBackups;

    /**
     * Gets the AccountBackupsClient object to access its operations.
     *
     * @return the AccountBackupsClient object.
     */
    public AccountBackupsClient getAccountBackups() {
        return this.accountBackups;
    }

    /** The BackupPoliciesClient object to access its operations. */
    private final BackupPoliciesClient backupPolicies;

    /**
     * Gets the BackupPoliciesClient object to access its operations.
     *
     * @return the BackupPoliciesClient object.
     */
    public BackupPoliciesClient getBackupPolicies() {
        return this.backupPolicies;
    }

    /** The VolumeQuotaRulesClient object to access its operations. */
    private final VolumeQuotaRulesClient volumeQuotaRules;

    /**
     * Gets the VolumeQuotaRulesClient object to access its operations.
     *
     * @return the VolumeQuotaRulesClient object.
     */
    public VolumeQuotaRulesClient getVolumeQuotaRules() {
        return this.volumeQuotaRules;
    }

    /** The VolumeGroupsClient object to access its operations. */
    private final VolumeGroupsClient volumeGroups;

    /**
     * Gets the VolumeGroupsClient object to access its operations.
     *
     * @return the VolumeGroupsClient object.
     */
    public VolumeGroupsClient getVolumeGroups() {
        return this.volumeGroups;
    }

    /** The SubvolumesClient object to access its operations. */
    private final SubvolumesClient subvolumes;

    /**
     * Gets the SubvolumesClient object to access its operations.
     *
     * @return the SubvolumesClient object.
     */
    public SubvolumesClient getSubvolumes() {
        return this.subvolumes;
    }

    /**
     * Initializes an instance of NetAppManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    NetAppManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2022-11-01";
        this.operations = new OperationsClientImpl(this);
        this.netAppResources = new NetAppResourcesClientImpl(this);
        this.netAppResourceQuotaLimits = new NetAppResourceQuotaLimitsClientImpl(this);
        this.accounts = new AccountsClientImpl(this);
        this.pools = new PoolsClientImpl(this);
        this.volumes = new VolumesClientImpl(this);
        this.snapshots = new SnapshotsClientImpl(this);
        this.snapshotPolicies = new SnapshotPoliciesClientImpl(this);
        this.backups = new BackupsClientImpl(this);
        this.accountBackups = new AccountBackupsClientImpl(this);
        this.backupPolicies = new BackupPoliciesClientImpl(this);
        this.volumeQuotaRules = new VolumeQuotaRulesClientImpl(this);
        this.volumeGroups = new VolumeGroupsClientImpl(this);
        this.subvolumes = new SubvolumesClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(NetAppManagementClientImpl.class);
}
