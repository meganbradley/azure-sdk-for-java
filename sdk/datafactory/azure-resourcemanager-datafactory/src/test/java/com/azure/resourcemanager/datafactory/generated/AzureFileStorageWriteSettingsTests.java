// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.AzureFileStorageWriteSettings;
import com.azure.resourcemanager.datafactory.models.MetadataItem;
import java.util.Arrays;

public final class AzureFileStorageWriteSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureFileStorageWriteSettings model = BinaryData.fromString(
            "{\"type\":\"AzureFileStorageWriteSettings\",\"maxConcurrentConnections\":\"datapobjufksddxk\",\"disableMetricsCollection\":\"datawxlylxfpvoylf\",\"copyBehavior\":\"datasrgu\",\"metadata\":[{\"name\":\"datahauivgbim\",\"value\":\"dataedqgyrvulz\"},{\"name\":\"datavckpdp\",\"value\":\"datanrjqskikqd\"},{\"name\":\"dataybqtlvofjjsetiz\",\"value\":\"datanadn\"},{\"name\":\"datasbpxlserqgxnh\",\"value\":\"dataccd\"}],\"\":{\"jbhmpmeglo\":\"datayb\"}}")
            .toObject(AzureFileStorageWriteSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureFileStorageWriteSettings model
            = new AzureFileStorageWriteSettings().withMaxConcurrentConnections("datapobjufksddxk")
                .withDisableMetricsCollection("datawxlylxfpvoylf").withCopyBehavior("datasrgu")
                .withMetadata(Arrays.asList(new MetadataItem().withName("datahauivgbim").withValue("dataedqgyrvulz"),
                    new MetadataItem().withName("datavckpdp").withValue("datanrjqskikqd"),
                    new MetadataItem().withName("dataybqtlvofjjsetiz").withValue("datanadn"),
                    new MetadataItem().withName("datasbpxlserqgxnh").withValue("dataccd")));
        model = BinaryData.fromObject(model).toObject(AzureFileStorageWriteSettings.class);
    }
}
