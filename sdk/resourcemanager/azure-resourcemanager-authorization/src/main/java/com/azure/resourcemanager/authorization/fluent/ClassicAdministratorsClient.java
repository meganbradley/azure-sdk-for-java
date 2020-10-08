// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.ClassicAdministratorInner;

/** An instance of this class provides access to all the operations defined in ClassicAdministratorsClient. */
public interface ClassicAdministratorsClient {
    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service administrator, account administrator, and co-administrators for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<ClassicAdministratorInner> listAsync();

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service administrator, account administrator, and co-administrators for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClassicAdministratorInner> list();

    /**
     * Gets service administrator, account administrator, and co-administrators for the subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return service administrator, account administrator, and co-administrators for the subscription.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<ClassicAdministratorInner> list(Context context);
}
