// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.catalog.generated;

import com.azure.analytics.purview.catalog.GlossaryClient;
import com.azure.analytics.purview.catalog.GlossaryClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class GlossaryUpdateGlossaryCategory {
    public static void main(String[] args) {
        // BEGIN:
        // com.azure.analytics.purview.catalog.generated.glossaryupdateglossarycategory.glossaryupdateglossarycategory
        GlossaryClient glossaryClient =
                new GlossaryClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint("{Endpoint}")
                        .buildClient();
        BinaryData glossaryCategory =
                BinaryData.fromString(
                        "{\"name\":\"ExampleCategory1\",\"anchor\":{\"glossaryGuid\":\"c018ddaf-7c21-4b37-a838-dae5f110c3d8\",\"relationGuid\":\"7bdcef93-a57a-4d1d-95ab-9d3036f394a0\"},\"childrenCategories\":[{\"categoryGuid\":\"0d6766f6-f4b6-435b-bda2-d3edc358998e\"}],\"guid\":\"ed7458f0-9463-48a5-b5c6-4f785fb34e12\",\"lastModifiedTS\":\"1\",\"parentCategory\":{\"categoryGuid\":\"e47c4584-daca-4f9e-9092-194e04692c9a\"},\"qualifiedName\":\"ExampleCategory1@Glossary\",\"terms\":[{\"relationGuid\":\"6aebf5ac-0c83-40c0-98bf-958fe9c99007\",\"termGuid\":\"54688d39-b298-4104-9e80-f2a16f44aaea\"}]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<BinaryData> response =
                glossaryClient.updateGlossaryCategoryWithResponse(
                        "ed7458f0-9463-48a5-b5c6-4f785fb34e12", glossaryCategory, requestOptions);
        // END:
        // com.azure.analytics.purview.catalog.generated.glossaryupdateglossarycategory.glossaryupdateglossarycategory
    }
}
