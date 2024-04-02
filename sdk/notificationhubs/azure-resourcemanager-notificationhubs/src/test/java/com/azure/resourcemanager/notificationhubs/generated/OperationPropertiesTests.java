// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.notificationhubs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.notificationhubs.models.OperationProperties;
import com.azure.resourcemanager.notificationhubs.models.ServiceSpecification;

public final class OperationPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationProperties model = BinaryData.fromString(
            "{\"serviceSpecification\":{\"logSpecifications\":[{\"name\":\"de\",\"displayName\":\"jzicwifsjt\",\"blobDuration\":\"zfbishcbkhaj\",\"categoryGroups\":[\"eamdp\",\"agalpbuxwgipwhon\",\"wkgshwa\",\"kix\"]},{\"name\":\"injep\",\"displayName\":\"tmryw\",\"blobDuration\":\"zoqftiyqzrnkcqvy\",\"categoryGroups\":[\"hzls\",\"cohoq\",\"nwvlryavwhheunmm\"]}],\"metricSpecifications\":[{\"name\":\"xzko\",\"displayName\":\"cukoklyaxuconu\",\"displayDescription\":\"zf\",\"unit\":\"eyp\",\"aggregationType\":\"rmjmwvvjektc\",\"availabilities\":[{\"timeGrain\":\"hwlrsf\",\"blobDuration\":\"zpwv\"},{\"timeGrain\":\"dqgbiqylihkaetc\",\"blobDuration\":\"vfcivfsnkymuc\"}],\"supportedTimeGrainTypes\":[\"jf\",\"ebrjcxe\",\"fuwutttxf\"],\"metricFilterPattern\":\"rbirphxe\",\"fillGapWithZero\":false},{\"name\":\"ahfn\",\"displayName\":\"kyqxjvuujqgidokg\",\"displayDescription\":\"jyoxgvclt\",\"unit\":\"sncghkjeszz\",\"aggregationType\":\"ijhtxf\",\"availabilities\":[{\"timeGrain\":\"fsm\",\"blobDuration\":\"eh\"}],\"supportedTimeGrainTypes\":[\"ec\",\"godebfqkkrbmpu\",\"gr\",\"wflzlfbxzpuzy\"],\"metricFilterPattern\":\"spnqzahmgkb\",\"fillGapWithZero\":true}]}}")
            .toObject(OperationProperties.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationProperties model = new OperationProperties().withServiceSpecification(new ServiceSpecification());
        model = BinaryData.fromObject(model).toObject(OperationProperties.class);
    }
}
