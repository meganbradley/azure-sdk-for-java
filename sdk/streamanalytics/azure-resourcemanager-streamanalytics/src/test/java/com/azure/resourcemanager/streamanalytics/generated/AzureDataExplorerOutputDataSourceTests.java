// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.streamanalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.streamanalytics.models.AuthenticationMode;
import com.azure.resourcemanager.streamanalytics.models.AzureDataExplorerOutputDataSource;
import org.junit.jupiter.api.Assertions;

public final class AzureDataExplorerOutputDataSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureDataExplorerOutputDataSource model = BinaryData.fromString(
            "{\"type\":\"Microsoft.Kusto/clusters/databases\",\"properties\":{\"cluster\":\"ss\",\"database\":\"u\",\"table\":\"bdsrez\",\"authenticationMode\":\"UserToken\"}}")
            .toObject(AzureDataExplorerOutputDataSource.class);
        Assertions.assertEquals("ss", model.cluster());
        Assertions.assertEquals("u", model.database());
        Assertions.assertEquals("bdsrez", model.table());
        Assertions.assertEquals(AuthenticationMode.USER_TOKEN, model.authenticationMode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureDataExplorerOutputDataSource model = new AzureDataExplorerOutputDataSource().withCluster("ss")
            .withDatabase("u").withTable("bdsrez").withAuthenticationMode(AuthenticationMode.USER_TOKEN);
        model = BinaryData.fromObject(model).toObject(AzureDataExplorerOutputDataSource.class);
        Assertions.assertEquals("ss", model.cluster());
        Assertions.assertEquals("u", model.database());
        Assertions.assertEquals("bdsrez", model.table());
        Assertions.assertEquals(AuthenticationMode.USER_TOKEN, model.authenticationMode());
    }
}
