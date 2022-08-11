// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.Region;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.eventgrid.fluent.models.DomainInner;
import java.util.List;
import java.util.Map;

/** An immutable client-side representation of Domain. */
public interface Domain {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the location property: The geo-location where the resource lives.
     *
     * @return the location value.
     */
    String location();

    /**
     * Gets the tags property: Resource tags.
     *
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * Gets the systemData property: The system metadata relating to the Event Grid Domain resource.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the identity property: Identity information for the Event Grid Domain resource.
     *
     * @return the identity value.
     */
    IdentityInfo identity();

    /**
     * Gets the privateEndpointConnections property: List of private endpoint connections.
     *
     * @return the privateEndpointConnections value.
     */
    List<PrivateEndpointConnection> privateEndpointConnections();

    /**
     * Gets the provisioningState property: Provisioning state of the Event Grid Domain Resource.
     *
     * @return the provisioningState value.
     */
    DomainProvisioningState provisioningState();

    /**
     * Gets the endpoint property: Endpoint for the Event Grid Domain Resource which is used for publishing the events.
     *
     * @return the endpoint value.
     */
    String endpoint();

    /**
     * Gets the inputSchema property: This determines the format that Event Grid should expect for incoming events
     * published to the Event Grid Domain Resource.
     *
     * @return the inputSchema value.
     */
    InputSchema inputSchema();

    /**
     * Gets the inputSchemaMapping property: Information about the InputSchemaMapping which specified the info about
     * mapping event payload.
     *
     * @return the inputSchemaMapping value.
     */
    InputSchemaMapping inputSchemaMapping();

    /**
     * Gets the metricResourceId property: Metric resource id for the Event Grid Domain Resource.
     *
     * @return the metricResourceId value.
     */
    String metricResourceId();

    /**
     * Gets the publicNetworkAccess property: This determines if traffic is allowed over public network. By default it
     * is enabled. You can further restrict to specific IPs by configuring &lt;seealso
     * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
     *
     * @return the publicNetworkAccess value.
     */
    PublicNetworkAccess publicNetworkAccess();

    /**
     * Gets the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of all IPs.
     * Note: These are considered only if PublicNetworkAccess is enabled.
     *
     * @return the inboundIpRules value.
     */
    List<InboundIpRule> inboundIpRules();

    /**
     * Gets the disableLocalAuth property: This boolean is used to enable or disable local auth. Default value is false.
     * When the property is set to true, only AAD token will be used to authenticate if user is allowed to publish to
     * the domain.
     *
     * @return the disableLocalAuth value.
     */
    Boolean disableLocalAuth();

    /**
     * Gets the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation mechanism
     * for 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, creation
     * of domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property
     * is true. When this property is null or set to true, Event Grid is responsible of automatically creating the
     * domain topic when the first event subscription is created at the scope of the domain topic. If this property is
     * set to false, then creating the first event subscription will require creating a domain topic by the user. The
     * self-management mode can be used if the user wants full control of when the domain topic is created, while
     * auto-managed mode provides the flexibility to perform less operations and manage fewer resources by the user.
     * Also, note that in auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
     *
     * @return the autoCreateTopicWithFirstSubscription value.
     */
    Boolean autoCreateTopicWithFirstSubscription();

    /**
     * Gets the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion mechanism for
     * 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context, deletion of
     * domain topic can be auto-managed (when true) or self-managed (when false). The default value for this property is
     * true. When this property is set to true, Event Grid is responsible of automatically deleting the domain topic
     * when the last event subscription at the scope of the domain topic is deleted. If this property is set to false,
     * then the user needs to manually delete the domain topic when it is no longer needed (e.g., when last event
     * subscription is deleted and the resource needs to be cleaned up). The self-management mode can be used if the
     * user wants full control of when the domain topic needs to be deleted, while auto-managed mode provides the
     * flexibility to perform less operations and manage fewer resources by the user.
     *
     * @return the autoDeleteTopicWithLastSubscription value.
     */
    Boolean autoDeleteTopicWithLastSubscription();

    /**
     * Gets the dataResidencyBoundary property: Data Residency Boundary of the resource.
     *
     * @return the dataResidencyBoundary value.
     */
    DataResidencyBoundary dataResidencyBoundary();

    /**
     * Gets the region of the resource.
     *
     * @return the region of the resource.
     */
    Region region();

    /**
     * Gets the name of the resource region.
     *
     * @return the name of the resource region.
     */
    String regionName();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.eventgrid.fluent.models.DomainInner object.
     *
     * @return the inner object.
     */
    DomainInner innerModel();

    /** The entirety of the Domain definition. */
    interface Definition
        extends DefinitionStages.Blank,
            DefinitionStages.WithLocation,
            DefinitionStages.WithResourceGroup,
            DefinitionStages.WithCreate {
    }
    /** The Domain definition stages. */
    interface DefinitionStages {
        /** The first stage of the Domain definition. */
        interface Blank extends WithLocation {
        }
        /** The stage of the Domain definition allowing to specify location. */
        interface WithLocation {
            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(Region location);

            /**
             * Specifies the region for the resource.
             *
             * @param location The geo-location where the resource lives.
             * @return the next definition stage.
             */
            WithResourceGroup withRegion(String location);
        }
        /** The stage of the Domain definition allowing to specify parent resource. */
        interface WithResourceGroup {
            /**
             * Specifies resourceGroupName.
             *
             * @param resourceGroupName The name of the resource group within the user's subscription.
             * @return the next definition stage.
             */
            WithCreate withExistingResourceGroup(String resourceGroupName);
        }
        /**
         * The stage of the Domain definition which contains all the minimum required properties for the resource to be
         * created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithTags,
                DefinitionStages.WithIdentity,
                DefinitionStages.WithInputSchema,
                DefinitionStages.WithInputSchemaMapping,
                DefinitionStages.WithPublicNetworkAccess,
                DefinitionStages.WithInboundIpRules,
                DefinitionStages.WithDisableLocalAuth,
                DefinitionStages.WithAutoCreateTopicWithFirstSubscription,
                DefinitionStages.WithAutoDeleteTopicWithLastSubscription,
                DefinitionStages.WithDataResidencyBoundary {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            Domain create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            Domain create(Context context);
        }
        /** The stage of the Domain definition allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Resource tags..
             *
             * @param tags Resource tags.
             * @return the next definition stage.
             */
            WithCreate withTags(Map<String, String> tags);
        }
        /** The stage of the Domain definition allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity information for the Event Grid Domain resource..
             *
             * @param identity Identity information for the Event Grid Domain resource.
             * @return the next definition stage.
             */
            WithCreate withIdentity(IdentityInfo identity);
        }
        /** The stage of the Domain definition allowing to specify inputSchema. */
        interface WithInputSchema {
            /**
             * Specifies the inputSchema property: This determines the format that Event Grid should expect for incoming
             * events published to the Event Grid Domain Resource..
             *
             * @param inputSchema This determines the format that Event Grid should expect for incoming events published
             *     to the Event Grid Domain Resource.
             * @return the next definition stage.
             */
            WithCreate withInputSchema(InputSchema inputSchema);
        }
        /** The stage of the Domain definition allowing to specify inputSchemaMapping. */
        interface WithInputSchemaMapping {
            /**
             * Specifies the inputSchemaMapping property: Information about the InputSchemaMapping which specified the
             * info about mapping event payload..
             *
             * @param inputSchemaMapping Information about the InputSchemaMapping which specified the info about mapping
             *     event payload.
             * @return the next definition stage.
             */
            WithCreate withInputSchemaMapping(InputSchemaMapping inputSchemaMapping);
        }
        /** The stage of the Domain definition allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules" /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainProperties.InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            WithCreate withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Domain definition allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            WithCreate withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
        /** The stage of the Domain definition allowing to specify disableLocalAuth. */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: This boolean is used to enable or disable local auth. Default
             * value is false. When the property is set to true, only AAD token will be used to authenticate if user is
             * allowed to publish to the domain..
             *
             * @param disableLocalAuth This boolean is used to enable or disable local auth. Default value is false.
             *     When the property is set to true, only AAD token will be used to authenticate if user is allowed to
             *     publish to the domain.
             * @return the next definition stage.
             */
            WithCreate withDisableLocalAuth(Boolean disableLocalAuth);
        }
        /** The stage of the Domain definition allowing to specify autoCreateTopicWithFirstSubscription. */
        interface WithAutoCreateTopicWithFirstSubscription {
            /**
             * Specifies the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation
             * mechanism for 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this
             * context, creation of domain topic can be auto-managed (when true) or self-managed (when false). The
             * default value for this property is true. When this property is null or set to true, Event Grid is
             * responsible of automatically creating the domain topic when the first event subscription is created at
             * the scope of the domain topic. If this property is set to false, then creating the first event
             * subscription will require creating a domain topic by the user. The self-management mode can be used if
             * the user wants full control of when the domain topic is created, while auto-managed mode provides the
             * flexibility to perform less operations and manage fewer resources by the user. Also, note that in
             * auto-managed creation mode, user is allowed to create the domain topic on demand if needed..
             *
             * @param autoCreateTopicWithFirstSubscription This Boolean is used to specify the creation mechanism for
             *     'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context,
             *     creation of domain topic can be auto-managed (when true) or self-managed (when false). The default
             *     value for this property is true. When this property is null or set to true, Event Grid is responsible
             *     of automatically creating the domain topic when the first event subscription is created at the scope
             *     of the domain topic. If this property is set to false, then creating the first event subscription
             *     will require creating a domain topic by the user. The self-management mode can be used if the user
             *     wants full control of when the domain topic is created, while auto-managed mode provides the
             *     flexibility to perform less operations and manage fewer resources by the user. Also, note that in
             *     auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
             * @return the next definition stage.
             */
            WithCreate withAutoCreateTopicWithFirstSubscription(Boolean autoCreateTopicWithFirstSubscription);
        }
        /** The stage of the Domain definition allowing to specify autoDeleteTopicWithLastSubscription. */
        interface WithAutoDeleteTopicWithLastSubscription {
            /**
             * Specifies the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion
             * mechanism for 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this
             * context, deletion of domain topic can be auto-managed (when true) or self-managed (when false). The
             * default value for this property is true. When this property is set to true, Event Grid is responsible of
             * automatically deleting the domain topic when the last event subscription at the scope of the domain topic
             * is deleted. If this property is set to false, then the user needs to manually delete the domain topic
             * when it is no longer needed (e.g., when last event subscription is deleted and the resource needs to be
             * cleaned up). The self-management mode can be used if the user wants full control of when the domain topic
             * needs to be deleted, while auto-managed mode provides the flexibility to perform less operations and
             * manage fewer resources by the user..
             *
             * @param autoDeleteTopicWithLastSubscription This Boolean is used to specify the deletion mechanism for
             *     'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context,
             *     deletion of domain topic can be auto-managed (when true) or self-managed (when false). The default
             *     value for this property is true. When this property is set to true, Event Grid is responsible of
             *     automatically deleting the domain topic when the last event subscription at the scope of the domain
             *     topic is deleted. If this property is set to false, then the user needs to manually delete the domain
             *     topic when it is no longer needed (e.g., when last event subscription is deleted and the resource
             *     needs to be cleaned up). The self-management mode can be used if the user wants full control of when
             *     the domain topic needs to be deleted, while auto-managed mode provides the flexibility to perform
             *     less operations and manage fewer resources by the user.
             * @return the next definition stage.
             */
            WithCreate withAutoDeleteTopicWithLastSubscription(Boolean autoDeleteTopicWithLastSubscription);
        }
        /** The stage of the Domain definition allowing to specify dataResidencyBoundary. */
        interface WithDataResidencyBoundary {
            /**
             * Specifies the dataResidencyBoundary property: Data Residency Boundary of the resource..
             *
             * @param dataResidencyBoundary Data Residency Boundary of the resource.
             * @return the next definition stage.
             */
            WithCreate withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary);
        }
    }
    /**
     * Begins update for the Domain resource.
     *
     * @return the stage of resource update.
     */
    Domain.Update update();

    /** The template for Domain update. */
    interface Update
        extends UpdateStages.WithTags,
            UpdateStages.WithIdentity,
            UpdateStages.WithPublicNetworkAccess,
            UpdateStages.WithInboundIpRules,
            UpdateStages.WithDisableLocalAuth,
            UpdateStages.WithAutoCreateTopicWithFirstSubscription,
            UpdateStages.WithAutoDeleteTopicWithLastSubscription,
            UpdateStages.WithDataResidencyBoundary {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        Domain apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        Domain apply(Context context);
    }
    /** The Domain update stages. */
    interface UpdateStages {
        /** The stage of the Domain update allowing to specify tags. */
        interface WithTags {
            /**
             * Specifies the tags property: Tags of the domains resource..
             *
             * @param tags Tags of the domains resource.
             * @return the next definition stage.
             */
            Update withTags(Map<String, String> tags);
        }
        /** The stage of the Domain update allowing to specify identity. */
        interface WithIdentity {
            /**
             * Specifies the identity property: Identity information for the resource..
             *
             * @param identity Identity information for the resource.
             * @return the next definition stage.
             */
            Update withIdentity(IdentityInfo identity);
        }
        /** The stage of the Domain update allowing to specify publicNetworkAccess. */
        interface WithPublicNetworkAccess {
            /**
             * Specifies the publicNetworkAccess property: This determines if traffic is allowed over public network. By
             * default it is enabled. You can further restrict to specific IPs by configuring &lt;seealso
             * cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties"
                 + ".InboundIpRules"
             * /&gt;.
             *
             * @param publicNetworkAccess This determines if traffic is allowed over public network. By default it is
             *     enabled. You can further restrict to specific IPs by configuring &lt;seealso
             *     cref="P:Microsoft.Azure.Events.ResourceProvider.Common.Contracts.DomainUpdateParameterProperties"
                 + ".InboundIpRules"
             *     /&gt;.
             * @return the next definition stage.
             */
            Update withPublicNetworkAccess(PublicNetworkAccess publicNetworkAccess);
        }
        /** The stage of the Domain update allowing to specify inboundIpRules. */
        interface WithInboundIpRules {
            /**
             * Specifies the inboundIpRules property: This can be used to restrict traffic from specific IPs instead of
             * all IPs. Note: These are considered only if PublicNetworkAccess is enabled..
             *
             * @param inboundIpRules This can be used to restrict traffic from specific IPs instead of all IPs. Note:
             *     These are considered only if PublicNetworkAccess is enabled.
             * @return the next definition stage.
             */
            Update withInboundIpRules(List<InboundIpRule> inboundIpRules);
        }
        /** The stage of the Domain update allowing to specify disableLocalAuth. */
        interface WithDisableLocalAuth {
            /**
             * Specifies the disableLocalAuth property: This boolean is used to enable or disable local auth. Default
             * value is false. When the property is set to true, only AAD token will be used to authenticate if user is
             * allowed to publish to the domain..
             *
             * @param disableLocalAuth This boolean is used to enable or disable local auth. Default value is false.
             *     When the property is set to true, only AAD token will be used to authenticate if user is allowed to
             *     publish to the domain.
             * @return the next definition stage.
             */
            Update withDisableLocalAuth(Boolean disableLocalAuth);
        }
        /** The stage of the Domain update allowing to specify autoCreateTopicWithFirstSubscription. */
        interface WithAutoCreateTopicWithFirstSubscription {
            /**
             * Specifies the autoCreateTopicWithFirstSubscription property: This Boolean is used to specify the creation
             * mechanism for 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this
             * context, creation of domain topic can be auto-managed (when true) or self-managed (when false). The
             * default value for this property is true. When this property is null or set to true, Event Grid is
             * responsible of automatically creating the domain topic when the first event subscription is created at
             * the scope of the domain topic. If this property is set to false, then creating the first event
             * subscription will require creating a domain topic by the user. The self-management mode can be used if
             * the user wants full control of when the domain topic is created, while auto-managed mode provides the
             * flexibility to perform less operations and manage fewer resources by the user. Also, note that in
             * auto-managed creation mode, user is allowed to create the domain topic on demand if needed..
             *
             * @param autoCreateTopicWithFirstSubscription This Boolean is used to specify the creation mechanism for
             *     'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context,
             *     creation of domain topic can be auto-managed (when true) or self-managed (when false). The default
             *     value for this property is true. When this property is null or set to true, Event Grid is responsible
             *     of automatically creating the domain topic when the first event subscription is created at the scope
             *     of the domain topic. If this property is set to false, then creating the first event subscription
             *     will require creating a domain topic by the user. The self-management mode can be used if the user
             *     wants full control of when the domain topic is created, while auto-managed mode provides the
             *     flexibility to perform less operations and manage fewer resources by the user. Also, note that in
             *     auto-managed creation mode, user is allowed to create the domain topic on demand if needed.
             * @return the next definition stage.
             */
            Update withAutoCreateTopicWithFirstSubscription(Boolean autoCreateTopicWithFirstSubscription);
        }
        /** The stage of the Domain update allowing to specify autoDeleteTopicWithLastSubscription. */
        interface WithAutoDeleteTopicWithLastSubscription {
            /**
             * Specifies the autoDeleteTopicWithLastSubscription property: This Boolean is used to specify the deletion
             * mechanism for 'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this
             * context, deletion of domain topic can be auto-managed (when true) or self-managed (when false). The
             * default value for this property is true. When this property is set to true, Event Grid is responsible of
             * automatically deleting the domain topic when the last event subscription at the scope of the domain topic
             * is deleted. If this property is set to false, then the user needs to manually delete the domain topic
             * when it is no longer needed (e.g., when last event subscription is deleted and the resource needs to be
             * cleaned up). The self-management mode can be used if the user wants full control of when the domain topic
             * needs to be deleted, while auto-managed mode provides the flexibility to perform less operations and
             * manage fewer resources by the user..
             *
             * @param autoDeleteTopicWithLastSubscription This Boolean is used to specify the deletion mechanism for
             *     'all' the Event Grid Domain Topics associated with this Event Grid Domain resource. In this context,
             *     deletion of domain topic can be auto-managed (when true) or self-managed (when false). The default
             *     value for this property is true. When this property is set to true, Event Grid is responsible of
             *     automatically deleting the domain topic when the last event subscription at the scope of the domain
             *     topic is deleted. If this property is set to false, then the user needs to manually delete the domain
             *     topic when it is no longer needed (e.g., when last event subscription is deleted and the resource
             *     needs to be cleaned up). The self-management mode can be used if the user wants full control of when
             *     the domain topic needs to be deleted, while auto-managed mode provides the flexibility to perform
             *     less operations and manage fewer resources by the user.
             * @return the next definition stage.
             */
            Update withAutoDeleteTopicWithLastSubscription(Boolean autoDeleteTopicWithLastSubscription);
        }
        /** The stage of the Domain update allowing to specify dataResidencyBoundary. */
        interface WithDataResidencyBoundary {
            /**
             * Specifies the dataResidencyBoundary property: The data residency boundary for the domain..
             *
             * @param dataResidencyBoundary The data residency boundary for the domain.
             * @return the next definition stage.
             */
            Update withDataResidencyBoundary(DataResidencyBoundary dataResidencyBoundary);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    Domain refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    Domain refresh(Context context);

    /**
     * List the two keys used to publish to a domain.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain.
     */
    DomainSharedAccessKeys listSharedAccessKeys();

    /**
     * List the two keys used to publish to a domain.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain along with {@link Response}.
     */
    Response<DomainSharedAccessKeys> listSharedAccessKeysWithResponse(Context context);

    /**
     * Regenerate a shared access key for a domain.
     *
     * @param regenerateKeyRequest Request body to regenerate key.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain.
     */
    DomainSharedAccessKeys regenerateKey(DomainRegenerateKeyRequest regenerateKeyRequest);

    /**
     * Regenerate a shared access key for a domain.
     *
     * @param regenerateKeyRequest Request body to regenerate key.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return shared access keys of the Domain along with {@link Response}.
     */
    Response<DomainSharedAccessKeys> regenerateKeyWithResponse(
        DomainRegenerateKeyRequest regenerateKeyRequest, Context context);
}
