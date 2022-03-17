// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.CollectionClient;
import com.azure.analytics.purview.catalog.CollectionClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class CollectionCreateOrUpdate {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.collectioncreateorupdate.collectioncreateorupdate
        CollectionClient collectionClient =
                new CollectionClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        BinaryData entity =
                BinaryData.fromString(
                        "{\"entity\":{\"attributes\":{\"name\":\"exampleaccount\",\"qualifiedName\":\"https://exampleaccount.core.windows.net\"},\"typeName\":\"azure_storage_account\"},\"referredEntities\":{}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                collectionClient.createOrUpdateWithResponse("ExampleCollection", entity, requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.collectioncreateorupdate.collectioncreateorupdate
    }
}
