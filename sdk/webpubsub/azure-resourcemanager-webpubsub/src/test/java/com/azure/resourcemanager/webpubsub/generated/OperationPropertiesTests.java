// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.webpubsub.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.webpubsub.models.LogSpecification;
import com.azure.resourcemanager.webpubsub.models.MetricSpecification;
import com.azure.resourcemanager.webpubsub.models.OperationProperties;
import com.azure.resourcemanager.webpubsub.models.ServiceSpecification;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class OperationPropertiesTests {
    @Test
    public void testDeserialize() {
        OperationProperties model =
            BinaryData
                .fromString(
                    "{\"serviceSpecification\":{\"metricSpecifications\":[{\"name\":\"hanufhfcbjysagi\",\"displayName\":\"xqhabi\",\"displayDescription\":\"ikxwc\",\"unit\":\"yscnpqxu\",\"aggregationType\":\"vyq\",\"fillGapWithZero\":\"wby\",\"category\":\"k\",\"dimensions\":[]},{\"name\":\"umjgrtfwvuk\",\"displayName\":\"audccsnhs\",\"displayDescription\":\"nyejhkryhtnap\",\"unit\":\"wlokjyem\",\"aggregationType\":\"vnipjox\",\"fillGapWithZero\":\"nchgej\",\"category\":\"odmailzyd\",\"dimensions\":[]}],\"logSpecifications\":[{\"name\":\"yahux\",\"displayName\":\"pmqnja\"},{\"name\":\"ixjsprozvcputeg\",\"displayName\":\"wmfdatscmdvpjhul\"},{\"name\":\"uvm\",\"displayName\":\"ozkrwfndiodjpslw\"},{\"name\":\"dpvwryoqpsoaccta\",\"displayName\":\"kljla\"}]}}")
                .toObject(OperationProperties.class);
        Assertions.assertEquals("hanufhfcbjysagi", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("xqhabi", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions
            .assertEquals("ikxwc", model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("yscnpqxu", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("vyq", model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("wby", model.serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("k", model.serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("yahux", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("pmqnja", model.serviceSpecification().logSpecifications().get(0).displayName());
    }

    @Test
    public void testSerialize() {
        OperationProperties model =
            new OperationProperties()
                .withServiceSpecification(
                    new ServiceSpecification()
                        .withMetricSpecifications(
                            Arrays
                                .asList(
                                    new MetricSpecification()
                                        .withName("hanufhfcbjysagi")
                                        .withDisplayName("xqhabi")
                                        .withDisplayDescription("ikxwc")
                                        .withUnit("yscnpqxu")
                                        .withAggregationType("vyq")
                                        .withFillGapWithZero("wby")
                                        .withCategory("k")
                                        .withDimensions(Arrays.asList()),
                                    new MetricSpecification()
                                        .withName("umjgrtfwvuk")
                                        .withDisplayName("audccsnhs")
                                        .withDisplayDescription("nyejhkryhtnap")
                                        .withUnit("wlokjyem")
                                        .withAggregationType("vnipjox")
                                        .withFillGapWithZero("nchgej")
                                        .withCategory("odmailzyd")
                                        .withDimensions(Arrays.asList())))
                        .withLogSpecifications(
                            Arrays
                                .asList(
                                    new LogSpecification().withName("yahux").withDisplayName("pmqnja"),
                                    new LogSpecification()
                                        .withName("ixjsprozvcputeg")
                                        .withDisplayName("wmfdatscmdvpjhul"),
                                    new LogSpecification().withName("uvm").withDisplayName("ozkrwfndiodjpslw"),
                                    new LogSpecification().withName("dpvwryoqpsoaccta").withDisplayName("kljla"))));
        model = BinaryData.fromObject(model).toObject(OperationProperties.class);
        Assertions.assertEquals("hanufhfcbjysagi", model.serviceSpecification().metricSpecifications().get(0).name());
        Assertions.assertEquals("xqhabi", model.serviceSpecification().metricSpecifications().get(0).displayName());
        Assertions
            .assertEquals("ikxwc", model.serviceSpecification().metricSpecifications().get(0).displayDescription());
        Assertions.assertEquals("yscnpqxu", model.serviceSpecification().metricSpecifications().get(0).unit());
        Assertions.assertEquals("vyq", model.serviceSpecification().metricSpecifications().get(0).aggregationType());
        Assertions.assertEquals("wby", model.serviceSpecification().metricSpecifications().get(0).fillGapWithZero());
        Assertions.assertEquals("k", model.serviceSpecification().metricSpecifications().get(0).category());
        Assertions.assertEquals("yahux", model.serviceSpecification().logSpecifications().get(0).name());
        Assertions.assertEquals("pmqnja", model.serviceSpecification().logSpecifications().get(0).displayName());
    }
}
