// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Resource collection API of RoleInstances. */
public interface RoleInstances {
    /**
     * Starts a role instance of a vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String locationName, String vendorName, String serviceKey, String roleInstanceName);

    /**
     * Starts a role instance of a vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void start(String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context);

    /**
     * Powers off (stop) a role instance of a vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String locationName, String vendorName, String serviceKey, String roleInstanceName);

    /**
     * Powers off (stop) a role instance of a vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void stop(String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context);

    /**
     * Restarts a role instance of a vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String locationName, String vendorName, String serviceKey, String roleInstanceName);

    /**
     * Restarts a role instance of a vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void restart(String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context);

    /**
     * Gets the information of role instance of vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information of role instance of vendor network function along with {@link Response}.
     */
    Response<RoleInstance> getWithResponse(
        String locationName, String vendorName, String serviceKey, String roleInstanceName, Context context);

    /**
     * Gets the information of role instance of vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param roleInstanceName The name of the role instance of the vendor network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the information of role instance of vendor network function.
     */
    RoleInstance get(String locationName, String vendorName, String serviceKey, String roleInstanceName);

    /**
     * Lists the information of role instances of vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of role instances of vendor network function as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RoleInstance> list(String locationName, String vendorName, String serviceKey);

    /**
     * Lists the information of role instances of vendor network function.
     *
     * @param locationName The Azure region where the network function resource was created by customer.
     * @param vendorName The name of the vendor.
     * @param serviceKey The GUID for the vendor network function.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return list of role instances of vendor network function as paginated response with {@link PagedIterable}.
     */
    PagedIterable<RoleInstance> list(String locationName, String vendorName, String serviceKey, Context context);
}
