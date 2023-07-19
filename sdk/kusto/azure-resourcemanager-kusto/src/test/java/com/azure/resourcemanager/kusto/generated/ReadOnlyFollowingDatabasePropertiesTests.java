// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.fluent.models.ReadOnlyFollowingDatabaseProperties;
import java.time.Duration;
import org.junit.jupiter.api.Assertions;

public final class ReadOnlyFollowingDatabasePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReadOnlyFollowingDatabaseProperties model =
            BinaryData
                .fromString(
                    "{\"provisioningState\":\"Failed\",\"softDeletePeriod\":\"PT16H20M50S\",\"hotCachePeriod\":\"PT105H24M9S\",\"statistics\":{\"size\":88.15698},\"leaderClusterResourceId\":\"utr\",\"attachedDatabaseConfigurationName\":\"upauut\",\"principalsModificationKind\":\"Replace\",\"tableLevelSharingProperties\":{\"tablesToInclude\":[\"hej\"],\"tablesToExclude\":[\"zpnfqntcypsxj\"],\"externalTablesToInclude\":[\"imwkslircizj\",\"vydfceacvlhvygdy\",\"t\"],\"externalTablesToExclude\":[\"twnawjslbiwkojgc\",\"ztsfmznbaeqp\",\"chqnrnrpxehuwry\"],\"materializedViewsToInclude\":[\"aifmvikl\",\"ydv\"],\"materializedViewsToExclude\":[\"ejd\",\"nxcvds\",\"hnjivo\"],\"functionsToInclude\":[\"novqfzge\",\"jdftuljltd\",\"ceamtm\",\"zuo\"],\"functionsToExclude\":[\"wcw\"]},\"originalDatabaseName\":\"ioknssxmoj\",\"databaseShareOrigin\":\"Direct\",\"suspensionDetails\":{\"suspensionStartDate\":\"2021-02-27T14:03:02Z\"}}")
                .toObject(ReadOnlyFollowingDatabaseProperties.class);
        Assertions.assertEquals(Duration.parse("PT105H24M9S"), model.hotCachePeriod());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReadOnlyFollowingDatabaseProperties model =
            new ReadOnlyFollowingDatabaseProperties().withHotCachePeriod(Duration.parse("PT105H24M9S"));
        model = BinaryData.fromObject(model).toObject(ReadOnlyFollowingDatabaseProperties.class);
        Assertions.assertEquals(Duration.parse("PT105H24M9S"), model.hotCachePeriod());
    }
}
