// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.redisenterprise.fluent;

import com.azure.core.http.HttpPipeline;
import java.time.Duration;

/**
 * The interface for RedisEnterpriseManagementClient class.
 */
public interface RedisEnterpriseManagementClient {
    /**
     * Gets The ID of the target subscription.
     * 
     * @return the subscriptionId value.
     */
    String getSubscriptionId();

    /**
     * Gets server parameter.
     * 
     * @return the endpoint value.
     */
    String getEndpoint();

    /**
     * Gets Api Version.
     * 
     * @return the apiVersion value.
     */
    String getApiVersion();

    /**
     * Gets The HTTP pipeline to send requests through.
     * 
     * @return the httpPipeline value.
     */
    HttpPipeline getHttpPipeline();

    /**
     * Gets The default poll interval for long-running operation.
     * 
     * @return the defaultPollInterval value.
     */
    Duration getDefaultPollInterval();

    /**
     * Gets the OperationsClient object to access its operations.
     * 
     * @return the OperationsClient object.
     */
    OperationsClient getOperations();

    /**
     * Gets the OperationsStatusClient object to access its operations.
     * 
     * @return the OperationsStatusClient object.
     */
    OperationsStatusClient getOperationsStatus();

    /**
     * Gets the RedisEnterprisesClient object to access its operations.
     * 
     * @return the RedisEnterprisesClient object.
     */
    RedisEnterprisesClient getRedisEnterprises();

    /**
     * Gets the DatabasesClient object to access its operations.
     * 
     * @return the DatabasesClient object.
     */
    DatabasesClient getDatabases();

    /**
     * Gets the PrivateEndpointConnectionsClient object to access its operations.
     * 
     * @return the PrivateEndpointConnectionsClient object.
     */
    PrivateEndpointConnectionsClient getPrivateEndpointConnections();

    /**
     * Gets the PrivateLinkResourcesClient object to access its operations.
     * 
     * @return the PrivateLinkResourcesClient object.
     */
    PrivateLinkResourcesClient getPrivateLinkResources();
}
