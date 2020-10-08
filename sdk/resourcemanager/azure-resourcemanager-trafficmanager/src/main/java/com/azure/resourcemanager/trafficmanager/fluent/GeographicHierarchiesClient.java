// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.trafficmanager.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.trafficmanager.fluent.models.TrafficManagerGeographicHierarchyInner;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in GeographicHierarchiesClient. */
public interface GeographicHierarchiesClient {
    /**
     * Gets the default Geographic Hierarchy used by the Geographic traffic routing method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default Geographic Hierarchy used by the Geographic traffic routing method.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<TrafficManagerGeographicHierarchyInner>> getDefaultWithResponseAsync();

    /**
     * Gets the default Geographic Hierarchy used by the Geographic traffic routing method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default Geographic Hierarchy used by the Geographic traffic routing method.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<TrafficManagerGeographicHierarchyInner> getDefaultAsync();

    /**
     * Gets the default Geographic Hierarchy used by the Geographic traffic routing method.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default Geographic Hierarchy used by the Geographic traffic routing method.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    TrafficManagerGeographicHierarchyInner getDefault();

    /**
     * Gets the default Geographic Hierarchy used by the Geographic traffic routing method.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the default Geographic Hierarchy used by the Geographic traffic routing method.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<TrafficManagerGeographicHierarchyInner> getDefaultWithResponse(Context context);
}
