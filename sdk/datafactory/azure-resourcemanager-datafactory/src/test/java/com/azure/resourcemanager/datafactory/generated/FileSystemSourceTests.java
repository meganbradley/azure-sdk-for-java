// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FileSystemSource;

public final class FileSystemSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FileSystemSource model = BinaryData.fromString(
            "{\"type\":\"ssmaaxz\",\"recursive\":\"datafekstrmsbmdg\",\"additionalColumns\":\"datakeuplorn\",\"sourceRetryCount\":\"datalnvupi\",\"sourceRetryWait\":\"databzyhtbjyycaco\",\"maxConcurrentConnections\":\"datavoyltmxqalq\",\"disableMetricsCollection\":\"dataymjww\",\"\":{\"w\":\"datanefellhdsgogdu\",\"cbvuvwdp\":\"dataalt\"}}")
            .toObject(FileSystemSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FileSystemSource model = new FileSystemSource().withSourceRetryCount("datalnvupi")
            .withSourceRetryWait("databzyhtbjyycaco")
            .withMaxConcurrentConnections("datavoyltmxqalq")
            .withDisableMetricsCollection("dataymjww")
            .withRecursive("datafekstrmsbmdg")
            .withAdditionalColumns("datakeuplorn");
        model = BinaryData.fromObject(model).toObject(FileSystemSource.class);
    }
}
