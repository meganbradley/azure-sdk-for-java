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

public class EntityCreate {
    public static void main(String[] args) {
        // BEGIN: com.azure.analytics.purview.catalog.generated.entitycreateorupdate.entitycreate
        EntityClient entityClient =
                new EntityClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        BinaryData entity =
                BinaryData.fromString(
                        "{\"entity\":{\"attributes\":{\"name\":\"ExampleStorageAccount\",\"description\":null,\"createTime\":0,\"modifiedTime\":0,\"owner\":\"ExampleOwner\",\"publicAccessLevel\":null,\"qualifiedName\":\"https://exampleaccount.core.windows.net\"},\"contacts\":{\"Expert\":[{\"info\":\"Example Expert Info\",\"id\":\"30435ff9-9b96-44af-a5a9-e05c8b1ae2df\"}],\"Owner\":[{\"info\":\"Example Owner Info\",\"id\":\"30435ff9-9b96-44af-a5a9-e05c8b1ae2df\"}]},\"createdBy\":\"ExampleCreator\",\"status\":\"ACTIVE\",\"typeName\":\"azure_storage_account\",\"updatedBy\":\"ExampleUpdator\",\"version\":0},\"referredEntities\":{}}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response = entityClient.createOrUpdateWithResponse(entity, requestOptions);
        // END: com.azure.analytics.purview.catalog.generated.entitycreateorupdate.entitycreate
    }
}
