// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hdinsight.containers.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hdinsight.containers.fluent.models.ClusterInstanceViewResultInner;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewPropertiesStatus;
import com.azure.resourcemanager.hdinsight.containers.models.ClusterInstanceViewsResult;
import com.azure.resourcemanager.hdinsight.containers.models.ServiceStatus;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ClusterInstanceViewsResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ClusterInstanceViewsResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"rgjhxb\",\"properties\":{\"status\":{\"ready\":\"dtlwwrlkd\",\"reason\":\"ncvokotllxdyhg\",\"message\":\"ocogj\"},\"serviceStatuses\":[{\"kind\":\"dtbnnha\",\"ready\":\"oocrkvcikhnv\",\"message\":\"mqg\"},{\"kind\":\"qqu\",\"ready\":\"zikywgg\",\"message\":\"allatmelwuipic\"},{\"kind\":\"jzkzi\",\"ready\":\"gvvcnayrhyr\",\"message\":\"xmueed\"}]}},{\"name\":\"drd\",\"properties\":{\"status\":{\"ready\":\"stkwqqtch\",\"reason\":\"lmfmtdaay\",\"message\":\"v\"},\"serviceStatuses\":[{\"kind\":\"gpiohgwxrtfudxe\",\"ready\":\"xg\",\"message\":\"agvrvmnpkuk\"},{\"kind\":\"himdbl\",\"ready\":\"gwimfn\",\"message\":\"fjxwmsz\"},{\"kind\":\"kfoqreyfkzikfj\",\"ready\":\"wneaiv\",\"message\":\"czelpcirel\"}]}},{\"name\":\"feaenwab\",\"properties\":{\"status\":{\"ready\":\"atklddxbjhwuaa\",\"reason\":\"zjosp\",\"message\":\"oulpjrv\"},\"serviceStatuses\":[{\"kind\":\"glrvimjwosytxi\",\"ready\":\"cskfcktqumiekk\",\"message\":\"zikhl\"}]}}],\"nextLink\":\"jhdgqggebdunyga\"}")
                .toObject(ClusterInstanceViewsResult.class);
        Assertions.assertEquals("rgjhxb", model.value().get(0).name());
        Assertions.assertEquals("dtlwwrlkd", model.value().get(0).status().ready());
        Assertions.assertEquals("ncvokotllxdyhg", model.value().get(0).status().reason());
        Assertions.assertEquals("ocogj", model.value().get(0).status().message());
        Assertions.assertEquals("dtbnnha", model.value().get(0).serviceStatuses().get(0).kind());
        Assertions.assertEquals("oocrkvcikhnv", model.value().get(0).serviceStatuses().get(0).ready());
        Assertions.assertEquals("mqg", model.value().get(0).serviceStatuses().get(0).message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ClusterInstanceViewsResult model =
            new ClusterInstanceViewsResult()
                .withValue(
                    Arrays
                        .asList(
                            new ClusterInstanceViewResultInner()
                                .withName("rgjhxb")
                                .withStatus(
                                    new ClusterInstanceViewPropertiesStatus()
                                        .withReady("dtlwwrlkd")
                                        .withReason("ncvokotllxdyhg")
                                        .withMessage("ocogj"))
                                .withServiceStatuses(
                                    Arrays
                                        .asList(
                                            new ServiceStatus()
                                                .withKind("dtbnnha")
                                                .withReady("oocrkvcikhnv")
                                                .withMessage("mqg"),
                                            new ServiceStatus()
                                                .withKind("qqu")
                                                .withReady("zikywgg")
                                                .withMessage("allatmelwuipic"),
                                            new ServiceStatus()
                                                .withKind("jzkzi")
                                                .withReady("gvvcnayrhyr")
                                                .withMessage("xmueed"))),
                            new ClusterInstanceViewResultInner()
                                .withName("drd")
                                .withStatus(
                                    new ClusterInstanceViewPropertiesStatus()
                                        .withReady("stkwqqtch")
                                        .withReason("lmfmtdaay")
                                        .withMessage("v"))
                                .withServiceStatuses(
                                    Arrays
                                        .asList(
                                            new ServiceStatus()
                                                .withKind("gpiohgwxrtfudxe")
                                                .withReady("xg")
                                                .withMessage("agvrvmnpkuk"),
                                            new ServiceStatus()
                                                .withKind("himdbl")
                                                .withReady("gwimfn")
                                                .withMessage("fjxwmsz"),
                                            new ServiceStatus()
                                                .withKind("kfoqreyfkzikfj")
                                                .withReady("wneaiv")
                                                .withMessage("czelpcirel"))),
                            new ClusterInstanceViewResultInner()
                                .withName("feaenwab")
                                .withStatus(
                                    new ClusterInstanceViewPropertiesStatus()
                                        .withReady("atklddxbjhwuaa")
                                        .withReason("zjosp")
                                        .withMessage("oulpjrv"))
                                .withServiceStatuses(
                                    Arrays
                                        .asList(
                                            new ServiceStatus()
                                                .withKind("glrvimjwosytxi")
                                                .withReady("cskfcktqumiekk")
                                                .withMessage("zikhl")))));
        model = BinaryData.fromObject(model).toObject(ClusterInstanceViewsResult.class);
        Assertions.assertEquals("rgjhxb", model.value().get(0).name());
        Assertions.assertEquals("dtlwwrlkd", model.value().get(0).status().ready());
        Assertions.assertEquals("ncvokotllxdyhg", model.value().get(0).status().reason());
        Assertions.assertEquals("ocogj", model.value().get(0).status().message());
        Assertions.assertEquals("dtbnnha", model.value().get(0).serviceStatuses().get(0).kind());
        Assertions.assertEquals("oocrkvcikhnv", model.value().get(0).serviceStatuses().get(0).ready());
        Assertions.assertEquals("mqg", model.value().get(0).serviceStatuses().get(0).message());
    }
}
