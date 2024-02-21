// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.messaging.eventgrid.systemevents;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Map;

/**
 * Schema of the Data property of an EventGridEvent for a Microsoft.Resources.ResourceDeleteSuccess event. This is
 * raised when a resource delete operation succeeds.
 */
@Fluent
public final class ResourceDeleteSuccessEventData implements JsonSerializable<ResourceDeleteSuccessEventData> {

    /*
     * The tenant ID of the resource.
     */
    private String tenantId;

    /*
     * The subscription ID of the resource.
     */
    private String subscriptionId;

    /*
     * The resource group of the resource.
     */
    private String resourceGroup;

    /*
     * The resource provider performing the operation.
     */
    private String resourceProvider;

    /*
     * The URI of the resource in the operation.
     */
    private String resourceUri;

    /*
     * The operation that was performed.
     */
    private String operationName;

    /*
     * The status of the operation.
     */
    private String status;

    /*
     * The requested authorization for the operation.
     */
    private ResourceAuthorization authorization;

    /*
     * The properties of the claims.
     */
    private Map<String, String> claims;

    /*
     * An operation ID used for troubleshooting.
     */
    private String correlationId;

    /*
     * The details of the operation.
     */
    private ResourceHttpRequest httpRequest;

    /**
     * Creates an instance of ResourceDeleteSuccessEventData class.
     */
    public ResourceDeleteSuccessEventData() {
    }

    /**
     * Get the tenantId property: The tenant ID of the resource.
     *
     * @return the tenantId value.
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The tenant ID of the resource.
     *
     * @param tenantId the tenantId value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the subscriptionId property: The subscription ID of the resource.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Set the subscriptionId property: The subscription ID of the resource.
     *
     * @param subscriptionId the subscriptionId value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /**
     * Get the resourceGroup property: The resource group of the resource.
     *
     * @return the resourceGroup value.
     */
    public String getResourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup property: The resource group of the resource.
     *
     * @param resourceGroup the resourceGroup value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the resourceProvider property: The resource provider performing the operation.
     *
     * @return the resourceProvider value.
     */
    public String getResourceProvider() {
        return this.resourceProvider;
    }

    /**
     * Set the resourceProvider property: The resource provider performing the operation.
     *
     * @param resourceProvider the resourceProvider value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setResourceProvider(String resourceProvider) {
        this.resourceProvider = resourceProvider;
        return this;
    }

    /**
     * Get the resourceUri property: The URI of the resource in the operation.
     *
     * @return the resourceUri value.
     */
    public String getResourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: The URI of the resource in the operation.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Get the operationName property: The operation that was performed.
     *
     * @return the operationName value.
     */
    public String getOperationName() {
        return this.operationName;
    }

    /**
     * Set the operationName property: The operation that was performed.
     *
     * @param operationName the operationName value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setOperationName(String operationName) {
        this.operationName = operationName;
        return this;
    }

    /**
     * Get the status property: The status of the operation.
     *
     * @return the status value.
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * Set the status property: The status of the operation.
     *
     * @param status the status value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * Get the authorization property: The requested authorization for the operation.
     *
     * @return the authorization value.
     */
    public ResourceAuthorization getResourceAuthorization() {
        return this.authorization;
    }

    /**
     * Set the authorization property: The requested authorization for the operation.
     *
     * @param authorization the authorization value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setResourceAuthorization(ResourceAuthorization authorization) {
        this.authorization = authorization;
        return this;
    }

    /**
     * Get the claims property: The properties of the claims.
     *
     * @return the claims value.
     */
    public Map<String, String> getResourceClaims() {
        return this.claims;
    }

    /**
     * Set the claims property: The properties of the claims.
     *
     * @param claims the claims value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setResourceClaims(Map<String, String> claims) {
        this.claims = claims;
        return this;
    }

    /**
     * Get the correlationId property: An operation ID used for troubleshooting.
     *
     * @return the correlationId value.
     */
    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     * Set the correlationId property: An operation ID used for troubleshooting.
     *
     * @param correlationId the correlationId value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setCorrelationId(String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     * Get the httpRequest property: The details of the operation.
     *
     * @return the httpRequest value.
     */
    public ResourceHttpRequest getResourceHttpRequest() {
        return this.httpRequest;
    }

    /**
     * Set the httpRequest property: The details of the operation.
     *
     * @param httpRequest the httpRequest value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     */
    public ResourceDeleteSuccessEventData setResourceHttpRequest(ResourceHttpRequest httpRequest) {
        this.httpRequest = httpRequest;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("tenantId", this.tenantId);
        jsonWriter.writeStringField("subscriptionId", this.subscriptionId);
        jsonWriter.writeStringField("resourceGroup", this.resourceGroup);
        jsonWriter.writeStringField("resourceProvider", this.resourceProvider);
        jsonWriter.writeStringField("resourceUri", this.resourceUri);
        jsonWriter.writeStringField("operationName", this.operationName);
        jsonWriter.writeStringField("status", this.status);
        jsonWriter.writeJsonField("authorization", this.authorization);
        jsonWriter.writeMapField("claims", this.claims, (writer, element) -> writer.writeString(element));
        jsonWriter.writeStringField("correlationId", this.correlationId);
        jsonWriter.writeJsonField("httpRequest", this.httpRequest);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of ResourceDeleteSuccessEventData from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of ResourceDeleteSuccessEventData if the JsonReader was pointing to an instance of it, or
     * null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the ResourceDeleteSuccessEventData.
     */
    public static ResourceDeleteSuccessEventData fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(reader -> {
            ResourceDeleteSuccessEventData deserializedResourceDeleteSuccessEventData
                = new ResourceDeleteSuccessEventData();
            while (reader.nextToken() != JsonToken.END_OBJECT) {
                String fieldName = reader.getFieldName();
                reader.nextToken();
                if ("tenantId".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.tenantId = reader.getString();
                } else if ("subscriptionId".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.subscriptionId = reader.getString();
                } else if ("resourceGroup".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.resourceGroup = reader.getString();
                } else if ("resourceProvider".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.resourceProvider = reader.getString();
                } else if ("resourceUri".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.resourceUri = reader.getString();
                } else if ("operationName".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.operationName = reader.getString();
                } else if ("status".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.status = reader.getString();
                } else if ("authorization".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.authorization = ResourceAuthorization.fromJson(reader);
                } else if ("claims".equals(fieldName)) {
                    Map<String, String> claims = reader.readMap(reader1 -> reader1.getString());
                    deserializedResourceDeleteSuccessEventData.claims = claims;
                } else if ("correlationId".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.correlationId = reader.getString();
                } else if ("httpRequest".equals(fieldName)) {
                    deserializedResourceDeleteSuccessEventData.httpRequest = ResourceHttpRequest.fromJson(reader);
                } else {
                    reader.skipChildren();
                }
            }
            return deserializedResourceDeleteSuccessEventData;
        });
    }

    private static final ClientLogger LOGGER = new ClientLogger(ResourceDeleteSuccessEventData.class);

    private static final SerializerAdapter DEFAULT_SERIALIZER_ADAPTER = JacksonAdapter.createDefaultSerializerAdapter();

    /**
     * Get the claims property: The properties of the claims.
     *
     * @return the claims value.
     * @deprecated This method is no longer supported since v4.9.0.
     * <p>
     * Use {@link ResourceDeleteSuccessEventData#getResourceClaims()} instead.
     */
    @Deprecated
    public String getClaims() {
        final Map<String, String> resourceClaims = getResourceClaims();
        if (!resourceClaims.isEmpty()) {
            try {
                return DEFAULT_SERIALIZER_ADAPTER.serialize(resourceClaims, SerializerEncoding.JSON);
            } catch (IOException ex) {
                throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
            }
        }
        return null;
    }

    /**
     * Set the claims property: The properties of the claims.
     *
     * @param claims the claims value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     * @deprecated This method is no longer supported since v4.9.0.
     * <p>
     * Use {@link ResourceDeleteSuccessEventData#setResourceClaims(Map)} instead.
     */
    @Deprecated
    public ResourceDeleteSuccessEventData setClaims(String claims) {
        try {
            setResourceClaims(DEFAULT_SERIALIZER_ADAPTER.deserialize(claims, Map.class, SerializerEncoding.JSON));
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
        return this;
    }

    /**
     * Get the httpRequest property: The details of the operation.
     *
     * @return the httpRequest value.
     * @deprecated This method is no longer supported since v4.9.0.
     * <p>
     * Use {@link ResourceDeleteSuccessEventData#getResourceHttpRequest()} instead.
     */
    @Deprecated
    public String getHttpRequest() {
        ResourceHttpRequest resourceHttpRequest = getResourceHttpRequest();
        try {
            return DEFAULT_SERIALIZER_ADAPTER.serialize(resourceHttpRequest, SerializerEncoding.JSON);
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    /**
     * Set the httpRequest property: The details of the operation.
     *
     * @param httpRequest the httpRequest value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     * @deprecated This method is no longer supported since v4.9.0.
     * <p>
     * Use {@link ResourceDeleteSuccessEventData#setResourceHttpRequest(ResourceHttpRequest)} instead.
     */
    @Deprecated
    public ResourceDeleteSuccessEventData setHttpRequest(String httpRequest) {
        try {
            setResourceHttpRequest(DEFAULT_SERIALIZER_ADAPTER.deserialize(httpRequest, ResourceHttpRequest.class,
                SerializerEncoding.JSON));
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
        return this;
    }

    /**
     * Get the authorization property: The requested authorization for the operation.
     *
     * @return the authorization value.
     * @deprecated This method is no longer supported since v4.9.0.
     * <p>
     * Use {@link ResourceDeleteSuccessEventData#getResourceAuthorization()} instead.
     */
    @Deprecated
    public String getAuthorization() {
        final ResourceAuthorization resourceAuthorization = getResourceAuthorization();
        try {
            return DEFAULT_SERIALIZER_ADAPTER.serialize(resourceAuthorization, SerializerEncoding.JSON);
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
    }

    /**
     * Set the authorization property: The requested authorization for the operation.
     *
     * @param authorization the authorization value to set.
     * @return the ResourceDeleteSuccessEventData object itself.
     * @deprecated This method is no longer supported since v4.9.0.
     * <p>
     * Use {@link ResourceDeleteSuccessEventData#setResourceAuthorization(ResourceAuthorization)} instead.
     */
    @Deprecated
    public ResourceDeleteSuccessEventData setAuthorization(String authorization) {
        try {
            setResourceAuthorization(DEFAULT_SERIALIZER_ADAPTER.deserialize(authorization, ResourceAuthorization.class,
                SerializerEncoding.JSON));
        } catch (IOException ex) {
            throw LOGGER.logExceptionAsError(new UncheckedIOException(ex));
        }
        return this;
    }
}
