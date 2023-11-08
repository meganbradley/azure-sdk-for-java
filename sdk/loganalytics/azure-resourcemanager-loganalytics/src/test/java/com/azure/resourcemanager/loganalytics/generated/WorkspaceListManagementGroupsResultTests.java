// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.loganalytics.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.loganalytics.fluent.models.ManagementGroupInner;
import com.azure.resourcemanager.loganalytics.models.WorkspaceListManagementGroupsResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class WorkspaceListManagementGroupsResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        WorkspaceListManagementGroupsResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"serverCount\":319916389,\"isGateway\":false,\"name\":\"elmqk\",\"id\":\"ahvljuaha\",\"created\":\"2021-02-11T00:39:32Z\",\"dataReceived\":\"2021-02-06T01:31:14Z\",\"version\":\"mdua\",\"sku\":\"exq\"}},{\"properties\":{\"serverCount\":792525510,\"isGateway\":true,\"name\":\"sr\",\"id\":\"gvxp\",\"created\":\"2021-07-02T00:35:52Z\",\"dataReceived\":\"2021-02-22T15:36:44Z\",\"version\":\"fmisg\",\"sku\":\"nbbelda\"}},{\"properties\":{\"serverCount\":1782633502,\"isGateway\":true,\"name\":\"ourqhakau\",\"id\":\"shsfwxosowzxcu\",\"created\":\"2021-06-04T05:08:46Z\",\"dataReceived\":\"2020-12-22T21:46:37Z\",\"version\":\"xdje\",\"sku\":\"pucwwfvovbvme\"}},{\"properties\":{\"serverCount\":1911093580,\"isGateway\":false,\"name\":\"zceuojgjrw\",\"id\":\"eiotwmcdytdx\",\"created\":\"2021-01-14T13:52:52Z\",\"dataReceived\":\"2021-04-02T04:04:33Z\",\"version\":\"jawgqwg\",\"sku\":\"ni\"}}]}")
                .toObject(WorkspaceListManagementGroupsResult.class);
        Assertions.assertEquals(319916389, model.value().get(0).serverCount());
        Assertions.assertEquals(false, model.value().get(0).isGateway());
        Assertions.assertEquals("elmqk", model.value().get(0).name());
        Assertions.assertEquals("ahvljuaha", model.value().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T00:39:32Z"), model.value().get(0).created());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-06T01:31:14Z"), model.value().get(0).dataReceived());
        Assertions.assertEquals("mdua", model.value().get(0).version());
        Assertions.assertEquals("exq", model.value().get(0).sku());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        WorkspaceListManagementGroupsResult model =
            new WorkspaceListManagementGroupsResult()
                .withValue(
                    Arrays
                        .asList(
                            new ManagementGroupInner()
                                .withServerCount(319916389)
                                .withIsGateway(false)
                                .withName("elmqk")
                                .withId("ahvljuaha")
                                .withCreated(OffsetDateTime.parse("2021-02-11T00:39:32Z"))
                                .withDataReceived(OffsetDateTime.parse("2021-02-06T01:31:14Z"))
                                .withVersion("mdua")
                                .withSku("exq"),
                            new ManagementGroupInner()
                                .withServerCount(792525510)
                                .withIsGateway(true)
                                .withName("sr")
                                .withId("gvxp")
                                .withCreated(OffsetDateTime.parse("2021-07-02T00:35:52Z"))
                                .withDataReceived(OffsetDateTime.parse("2021-02-22T15:36:44Z"))
                                .withVersion("fmisg")
                                .withSku("nbbelda"),
                            new ManagementGroupInner()
                                .withServerCount(1782633502)
                                .withIsGateway(true)
                                .withName("ourqhakau")
                                .withId("shsfwxosowzxcu")
                                .withCreated(OffsetDateTime.parse("2021-06-04T05:08:46Z"))
                                .withDataReceived(OffsetDateTime.parse("2020-12-22T21:46:37Z"))
                                .withVersion("xdje")
                                .withSku("pucwwfvovbvme"),
                            new ManagementGroupInner()
                                .withServerCount(1911093580)
                                .withIsGateway(false)
                                .withName("zceuojgjrw")
                                .withId("eiotwmcdytdx")
                                .withCreated(OffsetDateTime.parse("2021-01-14T13:52:52Z"))
                                .withDataReceived(OffsetDateTime.parse("2021-04-02T04:04:33Z"))
                                .withVersion("jawgqwg")
                                .withSku("ni")));
        model = BinaryData.fromObject(model).toObject(WorkspaceListManagementGroupsResult.class);
        Assertions.assertEquals(319916389, model.value().get(0).serverCount());
        Assertions.assertEquals(false, model.value().get(0).isGateway());
        Assertions.assertEquals("elmqk", model.value().get(0).name());
        Assertions.assertEquals("ahvljuaha", model.value().get(0).id());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-11T00:39:32Z"), model.value().get(0).created());
        Assertions.assertEquals(OffsetDateTime.parse("2021-02-06T01:31:14Z"), model.value().get(0).dataReceived());
        Assertions.assertEquals("mdua", model.value().get(0).version());
        Assertions.assertEquals("exq", model.value().get(0).sku());
    }
}
