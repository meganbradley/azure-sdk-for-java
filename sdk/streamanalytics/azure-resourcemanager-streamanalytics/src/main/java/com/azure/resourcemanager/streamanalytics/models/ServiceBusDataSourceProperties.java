// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The common properties that are associated with Service Bus data sources (Queues, Topics, Event Hubs, etc.).
 */
@Fluent
public class ServiceBusDataSourceProperties {
    /*
     * The namespace that is associated with the desired Event Hub, Service Bus Queue, Service Bus Topic, etc. Required
     * on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "serviceBusNamespace")
    private String serviceBusNamespace;

    /*
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "sharedAccessPolicyName")
    private String sharedAccessPolicyName;

    /*
     * The shared access policy key for the specified shared access policy. Required on PUT (CreateOrReplace) requests.
     */
    @JsonProperty(value = "sharedAccessPolicyKey")
    private String sharedAccessPolicyKey;

    /*
     * Authentication Mode.
     */
    @JsonProperty(value = "authenticationMode")
    private AuthenticationMode authenticationMode;

    /**
     * Creates an instance of ServiceBusDataSourceProperties class.
     */
    public ServiceBusDataSourceProperties() {
    }

    /**
     * Get the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.serviceBusNamespace;
    }

    /**
     * Set the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the ServiceBusDataSourceProperties object itself.
     */
    public ServiceBusDataSourceProperties withServiceBusNamespace(String serviceBusNamespace) {
        this.serviceBusNamespace = serviceBusNamespace;
        return this;
    }

    /**
     * Get the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sharedAccessPolicyName value.
     */
    public String sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * Set the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set.
     * @return the ServiceBusDataSourceProperties object itself.
     */
    public ServiceBusDataSourceProperties withSharedAccessPolicyName(String sharedAccessPolicyName) {
        this.sharedAccessPolicyName = sharedAccessPolicyName;
        return this;
    }

    /**
     * Get the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sharedAccessPolicyKey value.
     */
    public String sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * Set the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set.
     * @return the ServiceBusDataSourceProperties object itself.
     */
    public ServiceBusDataSourceProperties withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        this.sharedAccessPolicyKey = sharedAccessPolicyKey;
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.authenticationMode;
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the ServiceBusDataSourceProperties object itself.
     */
    public ServiceBusDataSourceProperties withAuthenticationMode(AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
