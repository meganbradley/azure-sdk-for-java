// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ScanInner;
import com.azure.resourcemanager.security.models.ScanProperties;
import com.azure.resourcemanager.security.models.ScanState;
import com.azure.resourcemanager.security.models.ScanTriggerType;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class ScanInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScanInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"triggerType\":\"OnDemand\",\"state\":\"FailedToRun\",\"server\":\"scmnlziji\",\"database\":\"ehgmvflnwyv\",\"sqlVersion\":\"xrerlniylylyf\",\"startTime\":\"2021-07-06T13:46:49Z\",\"endTime\":\"2021-10-13T07:30Z\",\"highSeverityFailedRulesCount\":940843916,\"mediumSeverityFailedRulesCount\":1491604791,\"lowSeverityFailedRulesCount\":315348665,\"totalPassedRulesCount\":2049313385,\"totalFailedRulesCount\":1986729733,\"totalRulesCount\":260996663,\"isBaselineApplied\":true,\"lastScanTime\":\"2021-06-25T10:35:09Z\"},\"id\":\"cdxa\",\"name\":\"bujftaben\",\"type\":\"bklqpxz\"}")
                .toObject(ScanInner.class);
        Assertions.assertEquals(ScanTriggerType.ON_DEMAND, model.properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED_TO_RUN, model.properties().state());
        Assertions.assertEquals("scmnlziji", model.properties().server());
        Assertions.assertEquals("ehgmvflnwyv", model.properties().database());
        Assertions.assertEquals("xrerlniylylyf", model.properties().sqlVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-06T13:46:49Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-13T07:30Z"), model.properties().endTime());
        Assertions.assertEquals(940843916, model.properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1491604791, model.properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(315348665, model.properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(2049313385, model.properties().totalPassedRulesCount());
        Assertions.assertEquals(1986729733, model.properties().totalFailedRulesCount());
        Assertions.assertEquals(260996663, model.properties().totalRulesCount());
        Assertions.assertEquals(true, model.properties().isBaselineApplied());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T10:35:09Z"), model.properties().lastScanTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScanInner model =
            new ScanInner()
                .withProperties(
                    new ScanProperties()
                        .withTriggerType(ScanTriggerType.ON_DEMAND)
                        .withState(ScanState.FAILED_TO_RUN)
                        .withServer("scmnlziji")
                        .withDatabase("ehgmvflnwyv")
                        .withSqlVersion("xrerlniylylyf")
                        .withStartTime(OffsetDateTime.parse("2021-07-06T13:46:49Z"))
                        .withEndTime(OffsetDateTime.parse("2021-10-13T07:30Z"))
                        .withHighSeverityFailedRulesCount(940843916)
                        .withMediumSeverityFailedRulesCount(1491604791)
                        .withLowSeverityFailedRulesCount(315348665)
                        .withTotalPassedRulesCount(2049313385)
                        .withTotalFailedRulesCount(1986729733)
                        .withTotalRulesCount(260996663)
                        .withIsBaselineApplied(true)
                        .withLastScanTime(OffsetDateTime.parse("2021-06-25T10:35:09Z")));
        model = BinaryData.fromObject(model).toObject(ScanInner.class);
        Assertions.assertEquals(ScanTriggerType.ON_DEMAND, model.properties().triggerType());
        Assertions.assertEquals(ScanState.FAILED_TO_RUN, model.properties().state());
        Assertions.assertEquals("scmnlziji", model.properties().server());
        Assertions.assertEquals("ehgmvflnwyv", model.properties().database());
        Assertions.assertEquals("xrerlniylylyf", model.properties().sqlVersion());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-06T13:46:49Z"), model.properties().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-13T07:30Z"), model.properties().endTime());
        Assertions.assertEquals(940843916, model.properties().highSeverityFailedRulesCount());
        Assertions.assertEquals(1491604791, model.properties().mediumSeverityFailedRulesCount());
        Assertions.assertEquals(315348665, model.properties().lowSeverityFailedRulesCount());
        Assertions.assertEquals(2049313385, model.properties().totalPassedRulesCount());
        Assertions.assertEquals(1986729733, model.properties().totalFailedRulesCount());
        Assertions.assertEquals(260996663, model.properties().totalRulesCount());
        Assertions.assertEquals(true, model.properties().isBaselineApplied());
        Assertions.assertEquals(OffsetDateTime.parse("2021-06-25T10:35:09Z"), model.properties().lastScanTime());
    }
}
