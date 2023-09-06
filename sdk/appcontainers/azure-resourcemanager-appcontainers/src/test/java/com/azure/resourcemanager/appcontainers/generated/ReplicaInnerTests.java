// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.appcontainers.fluent.models.ReplicaInner;
import com.azure.resourcemanager.appcontainers.models.ReplicaContainer;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ReplicaInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ReplicaInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"createdTime\":\"2021-07-06T19:00:01Z\",\"runningState\":\"Running\",\"runningStateDetails\":\"ux\",\"containers\":[{\"name\":\"ldsyuuximerqfob\",\"containerId\":\"znkbykutwpfhpagm\",\"ready\":true,\"started\":true,\"restartCount\":803916344,\"runningState\":\"Running\",\"runningStateDetails\":\"doakgtdlmkkzevdl\",\"logStreamEndpoint\":\"wpusdsttwvogv\",\"execEndpoint\":\"ejdcngqqmoakuf\"}],\"initContainers\":[{\"name\":\"rwr\",\"containerId\":\"rtwaenuuzko\",\"ready\":false,\"started\":false,\"restartCount\":2010767026,\"runningState\":\"Waiting\",\"runningStateDetails\":\"yuhhziu\",\"logStreamEndpoint\":\"fozbhdmsmlmzqhof\",\"execEndpoint\":\"maequiahxicslfa\"},{\"name\":\"z\",\"containerId\":\"yylhalnswhccsp\",\"ready\":true,\"started\":true,\"restartCount\":2011273129,\"runningState\":\"Terminated\",\"runningStateDetails\":\"cywuggwol\",\"logStreamEndpoint\":\"czbwemhairsbr\",\"execEndpoint\":\"dwmsweypqwd\"},{\"name\":\"gicccnxqhuex\",\"containerId\":\"ttlstvlzywemhz\",\"ready\":true,\"started\":true,\"restartCount\":1411475506,\"runningState\":\"Terminated\",\"runningStateDetails\":\"iypbsfgytgusl\",\"logStreamEndpoint\":\"adcy\",\"execEndpoint\":\"ukyhejhzis\"}]},\"id\":\"gfpelolppvksrpqv\",\"name\":\"jzraehtwdwrf\",\"type\":\"swibyr\"}")
                .toObject(ReplicaInner.class);
        Assertions.assertEquals("ldsyuuximerqfob", model.containers().get(0).name());
        Assertions.assertEquals("znkbykutwpfhpagm", model.containers().get(0).containerId());
        Assertions.assertEquals(true, model.containers().get(0).ready());
        Assertions.assertEquals(true, model.containers().get(0).started());
        Assertions.assertEquals(803916344, model.containers().get(0).restartCount());
        Assertions.assertEquals("rwr", model.initContainers().get(0).name());
        Assertions.assertEquals("rtwaenuuzko", model.initContainers().get(0).containerId());
        Assertions.assertEquals(false, model.initContainers().get(0).ready());
        Assertions.assertEquals(false, model.initContainers().get(0).started());
        Assertions.assertEquals(2010767026, model.initContainers().get(0).restartCount());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ReplicaInner model =
            new ReplicaInner()
                .withContainers(
                    Arrays
                        .asList(
                            new ReplicaContainer()
                                .withName("ldsyuuximerqfob")
                                .withContainerId("znkbykutwpfhpagm")
                                .withReady(true)
                                .withStarted(true)
                                .withRestartCount(803916344)))
                .withInitContainers(
                    Arrays
                        .asList(
                            new ReplicaContainer()
                                .withName("rwr")
                                .withContainerId("rtwaenuuzko")
                                .withReady(false)
                                .withStarted(false)
                                .withRestartCount(2010767026),
                            new ReplicaContainer()
                                .withName("z")
                                .withContainerId("yylhalnswhccsp")
                                .withReady(true)
                                .withStarted(true)
                                .withRestartCount(2011273129),
                            new ReplicaContainer()
                                .withName("gicccnxqhuex")
                                .withContainerId("ttlstvlzywemhz")
                                .withReady(true)
                                .withStarted(true)
                                .withRestartCount(1411475506)));
        model = BinaryData.fromObject(model).toObject(ReplicaInner.class);
        Assertions.assertEquals("ldsyuuximerqfob", model.containers().get(0).name());
        Assertions.assertEquals("znkbykutwpfhpagm", model.containers().get(0).containerId());
        Assertions.assertEquals(true, model.containers().get(0).ready());
        Assertions.assertEquals(true, model.containers().get(0).started());
        Assertions.assertEquals(803916344, model.containers().get(0).restartCount());
        Assertions.assertEquals("rwr", model.initContainers().get(0).name());
        Assertions.assertEquals("rtwaenuuzko", model.initContainers().get(0).containerId());
        Assertions.assertEquals(false, model.initContainers().get(0).ready());
        Assertions.assertEquals(false, model.initContainers().get(0).started());
        Assertions.assertEquals(2010767026, model.initContainers().get(0).restartCount());
    }
}
