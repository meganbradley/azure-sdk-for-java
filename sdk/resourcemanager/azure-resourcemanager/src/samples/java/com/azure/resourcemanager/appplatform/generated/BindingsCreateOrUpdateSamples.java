// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.generated;

import com.azure.resourcemanager.appplatform.fluent.models.BindingResourceInner;
import com.azure.resourcemanager.appplatform.models.BindingResourceProperties;
import java.util.HashMap;
import java.util.Map;

/** Samples for Bindings CreateOrUpdate. */
public final class BindingsCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/appplatform/resource-manager/Microsoft.AppPlatform/preview/2023-03-01-preview/examples/Bindings_CreateOrUpdate.json
     */
    /**
     * Sample code: Bindings_CreateOrUpdate.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void bindingsCreateOrUpdate(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .springServices()
            .manager()
            .serviceClient()
            .getBindings()
            .createOrUpdate(
                "myResourceGroup",
                "myservice",
                "myapp",
                "mybinding",
                new BindingResourceInner()
                    .withProperties(
                        new BindingResourceProperties()
                            .withResourceId(
                                "/subscriptions/00000000-0000-0000-0000-000000000000/resourceGroups/myResourceGroup/providers/Microsoft.DocumentDB/databaseAccounts/my-cosmosdb-1")
                            .withKey("fakeTokenPlaceholder")
                            .withBindingParameters(mapOf("apiType", "SQL", "databaseName", "db1"))),
                com.azure.core.util.Context.NONE);
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
