// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.EntityClient;
import com.azure.analytics.purview.catalog.EntityClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class EntityGetClassification {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.entitygetclassification.entitygetclassification
        EntityClient entityClient =
                new EntityClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                entityClient.getClassificationWithResponse(
                        "9347abc5-7b86-4b82-a1e2-ad77c7c3cac3", "MICROSOFT.PERSONAL.DATE_OF_BIRTH", requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.entitygetclassification.entitygetclassification
    }
}
