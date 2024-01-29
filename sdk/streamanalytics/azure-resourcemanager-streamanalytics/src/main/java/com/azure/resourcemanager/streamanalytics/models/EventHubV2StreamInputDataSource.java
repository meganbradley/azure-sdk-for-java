// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.streamanalytics.fluent.models.EventHubStreamInputDataSourceProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Describes an Event Hub input data source that contains stream data.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Microsoft.EventHub/EventHub")
@Fluent
public final class EventHubV2StreamInputDataSource extends StreamInputDataSource {
    /*
     * The properties that are associated with an Event Hub input containing stream data. Required on PUT
     * (CreateOrReplace) requests.
     */
    @JsonProperty(value = "properties")
    private EventHubStreamInputDataSourceProperties innerProperties;

    /**
     * Creates an instance of EventHubV2StreamInputDataSource class.
     */
    public EventHubV2StreamInputDataSource() {
    }

    /**
     * Get the innerProperties property: The properties that are associated with an Event Hub input containing stream
     * data. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the innerProperties value.
     */
    private EventHubStreamInputDataSourceProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the consumerGroupName property: The name of an Event Hub Consumer Group that should be used to read events
     * from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to
     * receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer
     * group.
     * 
     * @return the consumerGroupName value.
     */
    public String consumerGroupName() {
        return this.innerProperties() == null ? null : this.innerProperties().consumerGroupName();
    }

    /**
     * Set the consumerGroupName property: The name of an Event Hub Consumer Group that should be used to read events
     * from the Event Hub. Specifying distinct consumer group names for multiple inputs allows each of those inputs to
     * receive the same events from the Event Hub. If not specified, the input uses the Event Hub’s default consumer
     * group.
     * 
     * @param consumerGroupName the consumerGroupName value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withConsumerGroupName(String consumerGroupName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withConsumerGroupName(consumerGroupName);
        return this;
    }

    /**
     * Get the prefetchCount property: The number of messages that the message receiver can simultaneously request.
     * 
     * @return the prefetchCount value.
     */
    public Integer prefetchCount() {
        return this.innerProperties() == null ? null : this.innerProperties().prefetchCount();
    }

    /**
     * Set the prefetchCount property: The number of messages that the message receiver can simultaneously request.
     * 
     * @param prefetchCount the prefetchCount value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withPrefetchCount(Integer prefetchCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withPrefetchCount(prefetchCount);
        return this;
    }

    /**
     * Get the eventHubName property: The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the eventHubName value.
     */
    public String eventHubName() {
        return this.innerProperties() == null ? null : this.innerProperties().eventHubName();
    }

    /**
     * Set the eventHubName property: The name of the Event Hub. Required on PUT (CreateOrReplace) requests.
     * 
     * @param eventHubName the eventHubName value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withEventHubName(String eventHubName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withEventHubName(eventHubName);
        return this;
    }

    /**
     * Get the partitionCount property: The partition count of the event hub data source. Range 1 - 256.
     * 
     * @return the partitionCount value.
     */
    public Integer partitionCount() {
        return this.innerProperties() == null ? null : this.innerProperties().partitionCount();
    }

    /**
     * Set the partitionCount property: The partition count of the event hub data source. Range 1 - 256.
     * 
     * @param partitionCount the partitionCount value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withPartitionCount(Integer partitionCount) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withPartitionCount(partitionCount);
        return this;
    }

    /**
     * Get the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the serviceBusNamespace value.
     */
    public String serviceBusNamespace() {
        return this.innerProperties() == null ? null : this.innerProperties().serviceBusNamespace();
    }

    /**
     * Set the serviceBusNamespace property: The namespace that is associated with the desired Event Hub, Service Bus
     * Queue, Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @param serviceBusNamespace the serviceBusNamespace value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withServiceBusNamespace(String serviceBusNamespace) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withServiceBusNamespace(serviceBusNamespace);
        return this;
    }

    /**
     * Get the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sharedAccessPolicyName value.
     */
    public String sharedAccessPolicyName() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedAccessPolicyName();
    }

    /**
     * Set the sharedAccessPolicyName property: The shared access policy name for the Event Hub, Service Bus Queue,
     * Service Bus Topic, etc. Required on PUT (CreateOrReplace) requests.
     * 
     * @param sharedAccessPolicyName the sharedAccessPolicyName value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withSharedAccessPolicyName(String sharedAccessPolicyName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withSharedAccessPolicyName(sharedAccessPolicyName);
        return this;
    }

    /**
     * Get the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @return the sharedAccessPolicyKey value.
     */
    public String sharedAccessPolicyKey() {
        return this.innerProperties() == null ? null : this.innerProperties().sharedAccessPolicyKey();
    }

    /**
     * Set the sharedAccessPolicyKey property: The shared access policy key for the specified shared access policy.
     * Required on PUT (CreateOrReplace) requests.
     * 
     * @param sharedAccessPolicyKey the sharedAccessPolicyKey value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withSharedAccessPolicyKey(String sharedAccessPolicyKey) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withSharedAccessPolicyKey(sharedAccessPolicyKey);
        return this;
    }

    /**
     * Get the authenticationMode property: Authentication Mode.
     * 
     * @return the authenticationMode value.
     */
    public AuthenticationMode authenticationMode() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationMode();
    }

    /**
     * Set the authenticationMode property: Authentication Mode.
     * 
     * @param authenticationMode the authenticationMode value to set.
     * @return the EventHubV2StreamInputDataSource object itself.
     */
    public EventHubV2StreamInputDataSource withAuthenticationMode(AuthenticationMode authenticationMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new EventHubStreamInputDataSourceProperties();
        }
        this.innerProperties().withAuthenticationMode(authenticationMode);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
