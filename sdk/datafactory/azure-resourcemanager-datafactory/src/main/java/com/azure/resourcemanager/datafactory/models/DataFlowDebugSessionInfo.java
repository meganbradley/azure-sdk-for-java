// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugSessionInfoInner;
import java.util.Map;

/**
 * An immutable client-side representation of DataFlowDebugSessionInfo.
 */
public interface DataFlowDebugSessionInfo {
    /**
     * Gets the dataFlowName property: The name of the data flow.
     * 
     * @return the dataFlowName value.
     */
    String dataFlowName();

    /**
     * Gets the computeType property: Compute type of the cluster.
     * 
     * @return the computeType value.
     */
    String computeType();

    /**
     * Gets the coreCount property: Core count of the cluster.
     * 
     * @return the coreCount value.
     */
    Integer coreCount();

    /**
     * Gets the nodeCount property: Node count of the cluster. (deprecated property).
     * 
     * @return the nodeCount value.
     */
    Integer nodeCount();

    /**
     * Gets the integrationRuntimeName property: Attached integration runtime name of data flow debug session.
     * 
     * @return the integrationRuntimeName value.
     */
    String integrationRuntimeName();

    /**
     * Gets the sessionId property: The ID of data flow debug session.
     * 
     * @return the sessionId value.
     */
    String sessionId();

    /**
     * Gets the startTime property: Start time of data flow debug session.
     * 
     * @return the startTime value.
     */
    String startTime();

    /**
     * Gets the timeToLiveInMinutes property: Compute type of the cluster.
     * 
     * @return the timeToLiveInMinutes value.
     */
    Integer timeToLiveInMinutes();

    /**
     * Gets the lastActivityTime property: Last activity time of data flow debug session.
     * 
     * @return the lastActivityTime value.
     */
    String lastActivityTime();

    /**
     * Gets the additionalProperties property: Data flow debug session info.
     * 
     * @return the additionalProperties value.
     */
    Map<String, Object> additionalProperties();

    /**
     * Gets the inner com.azure.resourcemanager.datafactory.fluent.models.DataFlowDebugSessionInfoInner object.
     * 
     * @return the inner object.
     */
    DataFlowDebugSessionInfoInner innerModel();
}
