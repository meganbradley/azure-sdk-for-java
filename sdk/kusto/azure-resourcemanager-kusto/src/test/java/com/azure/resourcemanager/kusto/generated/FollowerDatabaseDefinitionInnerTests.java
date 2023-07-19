// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.FollowerDatabaseDefinitionInner;
import org.junit.jupiter.api.Assertions;

public final class FollowerDatabaseDefinitionInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FollowerDatabaseDefinitionInner model =
            BinaryData
                .fromString(
                    "{\"clusterResourceId\":\"mouexhdzx\",\"attachedDatabaseConfigurationName\":\"bqe\",\"databaseName\":\"nxqbzvddn\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[\"eic\",\"twnpzaoqvuhrhcf\",\"cyddglmjthjqk\"],\"tablesToExclude\":[\"eicxmqciwqvhkhi\",\"uigdtopbobjog\",\"m\",\"w\"],\"externalTablesToInclude\":[\"a\"],\"externalTablesToExclude\":[\"z\",\"yvvtpgvdfgio\"],\"materializedViewsToInclude\":[\"tutqxlngxlefgug\",\"xkrxdqmi\",\"tthzrvqd\",\"abhjybi\"],\"materializedViewsToExclude\":[\"oqfbowskanyk\"],\"functionsToInclude\":[\"cuiywgqyw\",\"ndrvynhzg\",\"phrcgyncoc\",\"ecfvmm\"],\"functionsToExclude\":[\"fsxlzevgbmqjqa\"]},\"databaseShareOrigin\":\"Direct\"}")
                .toObject(FollowerDatabaseDefinitionInner.class);
        Assertions.assertEquals("mouexhdzx", model.clusterResourceId());
        Assertions.assertEquals("bqe", model.attachedDatabaseConfigurationName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FollowerDatabaseDefinitionInner model =
            new FollowerDatabaseDefinitionInner()
                .withClusterResourceId("mouexhdzx")
                .withAttachedDatabaseConfigurationName("bqe");
        model = BinaryData.fromObject(model).toObject(FollowerDatabaseDefinitionInner.class);
        Assertions.assertEquals("mouexhdzx", model.clusterResourceId());
        Assertions.assertEquals("bqe", model.attachedDatabaseConfigurationName());
    }
}
