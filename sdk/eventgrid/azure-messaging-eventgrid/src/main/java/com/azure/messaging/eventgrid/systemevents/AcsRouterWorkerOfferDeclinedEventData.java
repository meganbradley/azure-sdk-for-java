// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Communication.RouterWorkerOfferDeclined event.
 */
@Fluent
public final class AcsRouterWorkerOfferDeclinedEventData extends AcsRouterWorkerEventData {
    /*
     * Router Worker Offer Declined Queue Id
     */
    private String queueId;

    /*
     * Router Worker Offer Declined Offer Id
     */
    private String offerId;

    /**
     * Creates an instance of AcsRouterWorkerOfferDeclinedEventData class.
     */
    public AcsRouterWorkerOfferDeclinedEventData() {
    }

    /**
     * Get the queueId property: Router Worker Offer Declined Queue Id.
     * 
     * @return the queueId value.
     */
    public String getQueueId() {
        return this.queueId;
    }

    /**
     * Set the queueId property: Router Worker Offer Declined Queue Id.
     * 
     * @param queueId the queueId value to set.
     * @return the AcsRouterWorkerOfferDeclinedEventData object itself.
     */
    public AcsRouterWorkerOfferDeclinedEventData setQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    /**
     * Get the offerId property: Router Worker Offer Declined Offer Id.
     * 
     * @return the offerId value.
     */
    public String getOfferId() {
        return this.offerId;
    }

    /**
     * Set the offerId property: Router Worker Offer Declined Offer Id.
     * 
     * @param offerId the offerId value to set.
     * @return the AcsRouterWorkerOfferDeclinedEventData object itself.
     */
    public AcsRouterWorkerOfferDeclinedEventData setOfferId(String offerId) {
        this.offerId = offerId;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterWorkerOfferDeclinedEventData setWorkerId(String workerId) {
        super.setWorkerId(workerId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterWorkerOfferDeclinedEventData setJobId(String jobId) {
        super.setJobId(jobId);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterWorkerOfferDeclinedEventData setChannelReference(String channelReference) {
        super.setChannelReference(channelReference);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AcsRouterWorkerOfferDeclinedEventData setChannelId(String channelId) {
        super.setChannelId(channelId);
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("jobId", getJobId());
        jsonWriter.writeStringField("channelReference", getChannelReference());
        jsonWriter.writeStringField("channelId", getChannelId());
        jsonWriter.writeStringField("workerId", getWorkerId());
        jsonWriter.writeStringField("queueId", this.queueId);
        jsonWriter.writeStringField("offerId", this.offerId);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of AcsRouterWorkerOfferDeclinedEventData from the JsonReader.
     * 
     * @param jsonReader The JsonReader being read.
     * @return An instance of AcsRouterWorkerOfferDeclinedEventData if the JsonReader was pointing to an instance of it,
     * or null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the AcsRouterWorkerOfferDeclinedEventData.
     */
    public static AcsRouterWorkerOfferDeclinedEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            AcsRouterWorkerOfferDeclinedEventData deserializedAcsRouterWorkerOfferDeclinedEventData
                = new AcsRouterWorkerOfferDeclinedEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();

                if ("jobId".equals(fieldName)) {
                    deserializedAcsRouterWorkerOfferDeclinedEventData.setJobId(reader.getString());
                } else if ("channelReference".equals(fieldName)) {
                    deserializedAcsRouterWorkerOfferDeclinedEventData.setChannelReference(reader.getString());
                } else if ("channelId".equals(fieldName)) {
                    deserializedAcsRouterWorkerOfferDeclinedEventData.setChannelId(reader.getString());
                } else if ("workerId".equals(fieldName)) {
                    deserializedAcsRouterWorkerOfferDeclinedEventData.setWorkerId(reader.getString());
                } else if ("queueId".equals(fieldName)) {
                    deserializedAcsRouterWorkerOfferDeclinedEventData.queueId = reader.getString();
                } else if ("offerId".equals(fieldName)) {
                    deserializedAcsRouterWorkerOfferDeclinedEventData.offerId = reader.getString();
                } else {
                    reader.skipChildren();
                }
            }

            return deserializedAcsRouterWorkerOfferDeclinedEventData;
        });
    }
}
