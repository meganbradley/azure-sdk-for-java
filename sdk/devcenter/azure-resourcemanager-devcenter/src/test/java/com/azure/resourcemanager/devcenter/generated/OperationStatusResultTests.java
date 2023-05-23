// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.OperationStatusResult;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationStatusResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationStatusResult model =
            BinaryData
                .fromString(
                    "{\"id\":\"uwz\",\"name\":\"xbmp\",\"status\":\"cjefuzmu\",\"percentComplete\":73.7088,\"startTime\":\"2021-05-23T17:52:43Z\",\"endTime\":\"2021-04-26T02:21:23Z\",\"operations\":[{\"id\":\"p\",\"name\":\"ebmnzbtbhjpglk\",\"status\":\"gohdneuelfphsd\",\"percentComplete\":1.3561428,\"startTime\":\"2021-01-12T01:21:46Z\",\"endTime\":\"2021-12-10T07:50:41Z\",\"operations\":[]},{\"id\":\"wq\",\"name\":\"v\",\"status\":\"zx\",\"percentComplete\":30.199152,\"startTime\":\"2021-10-23T21:40:50Z\",\"endTime\":\"2021-09-22T18:34:57Z\",\"operations\":[]},{\"id\":\"osggbhc\",\"name\":\"fwdsj\",\"status\":\"ka\",\"percentComplete\":55.007015,\"startTime\":\"2021-03-15T03:19:59Z\",\"endTime\":\"2021-08-17T16:46:36Z\",\"operations\":[]},{\"id\":\"fgdkzzew\",\"name\":\"vhqcrail\",\"status\":\"pnppfuf\",\"percentComplete\":70.69832,\"startTime\":\"2021-05-23T16:48:47Z\",\"endTime\":\"2021-03-11T09:23:13Z\",\"operations\":[]}]}")
                .toObject(OperationStatusResult.class);
        Assertions.assertEquals("uwz", model.id());
        Assertions.assertEquals("xbmp", model.name());
        Assertions.assertEquals("cjefuzmu", model.status());
        Assertions.assertEquals(73.7088F, model.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-23T17:52:43Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T02:21:23Z"), model.endTime());
        Assertions.assertEquals("p", model.operations().get(0).id());
        Assertions.assertEquals("ebmnzbtbhjpglk", model.operations().get(0).name());
        Assertions.assertEquals("gohdneuelfphsd", model.operations().get(0).status());
        Assertions.assertEquals(1.3561428F, model.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-12T01:21:46Z"), model.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-10T07:50:41Z"), model.operations().get(0).endTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationStatusResult model =
            new OperationStatusResult()
                .withId("uwz")
                .withName("xbmp")
                .withStatus("cjefuzmu")
                .withPercentComplete(73.7088F)
                .withStartTime(OffsetDateTime.parse("2021-05-23T17:52:43Z"))
                .withEndTime(OffsetDateTime.parse("2021-04-26T02:21:23Z"))
                .withOperations(
                    Arrays
                        .asList(
                            new OperationStatusResult()
                                .withId("p")
                                .withName("ebmnzbtbhjpglk")
                                .withStatus("gohdneuelfphsd")
                                .withPercentComplete(1.3561428F)
                                .withStartTime(OffsetDateTime.parse("2021-01-12T01:21:46Z"))
                                .withEndTime(OffsetDateTime.parse("2021-12-10T07:50:41Z"))
                                .withOperations(Arrays.asList()),
                            new OperationStatusResult()
                                .withId("wq")
                                .withName("v")
                                .withStatus("zx")
                                .withPercentComplete(30.199152F)
                                .withStartTime(OffsetDateTime.parse("2021-10-23T21:40:50Z"))
                                .withEndTime(OffsetDateTime.parse("2021-09-22T18:34:57Z"))
                                .withOperations(Arrays.asList()),
                            new OperationStatusResult()
                                .withId("osggbhc")
                                .withName("fwdsj")
                                .withStatus("ka")
                                .withPercentComplete(55.007015F)
                                .withStartTime(OffsetDateTime.parse("2021-03-15T03:19:59Z"))
                                .withEndTime(OffsetDateTime.parse("2021-08-17T16:46:36Z"))
                                .withOperations(Arrays.asList()),
                            new OperationStatusResult()
                                .withId("fgdkzzew")
                                .withName("vhqcrail")
                                .withStatus("pnppfuf")
                                .withPercentComplete(70.69832F)
                                .withStartTime(OffsetDateTime.parse("2021-05-23T16:48:47Z"))
                                .withEndTime(OffsetDateTime.parse("2021-03-11T09:23:13Z"))
                                .withOperations(Arrays.asList())));
        model = BinaryData.fromObject(model).toObject(OperationStatusResult.class);
        Assertions.assertEquals("uwz", model.id());
        Assertions.assertEquals("xbmp", model.name());
        Assertions.assertEquals("cjefuzmu", model.status());
        Assertions.assertEquals(73.7088F, model.percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-23T17:52:43Z"), model.startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-26T02:21:23Z"), model.endTime());
        Assertions.assertEquals("p", model.operations().get(0).id());
        Assertions.assertEquals("ebmnzbtbhjpglk", model.operations().get(0).name());
        Assertions.assertEquals("gohdneuelfphsd", model.operations().get(0).status());
        Assertions.assertEquals(1.3561428F, model.operations().get(0).percentComplete());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-12T01:21:46Z"), model.operations().get(0).startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-12-10T07:50:41Z"), model.operations().get(0).endTime());
    }
}
