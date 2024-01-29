// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elasticsan.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elasticsan.fluent.models.VolumeInner;
import com.azure.resourcemanager.elasticsan.models.ManagedByInfo;
import com.azure.resourcemanager.elasticsan.models.SourceCreationData;
import com.azure.resourcemanager.elasticsan.models.VolumeCreateOption;
import org.junit.jupiter.api.Assertions;

public final class VolumeInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VolumeInner model = BinaryData.fromString(
            "{\"properties\":{\"volumeId\":\"hfnljkyq\",\"creationData\":{\"createSource\":\"VolumeSnapshot\",\"sourceId\":\"j\"},\"sizeGiB\":8463316449918745617,\"storageTarget\":{\"targetIqn\":\"kgj\",\"targetPortalHostname\":\"yoxgvcltbgsnc\",\"targetPortalPort\":1435851366,\"provisioningState\":\"Succeeded\",\"status\":\"Invalid\"},\"managedBy\":{\"resourceId\":\"bijhtxfvgxbf\"},\"provisioningState\":\"Pending\"},\"id\":\"eh\",\"name\":\"pvecxgodeb\",\"type\":\"qkkrb\"}")
            .toObject(VolumeInner.class);
        Assertions.assertEquals(VolumeCreateOption.VOLUME_SNAPSHOT, model.creationData().createSource());
        Assertions.assertEquals("j", model.creationData().sourceId());
        Assertions.assertEquals(8463316449918745617L, model.sizeGiB());
        Assertions.assertEquals("bijhtxfvgxbf", model.managedBy().resourceId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VolumeInner model = new VolumeInner()
            .withCreationData(
                new SourceCreationData().withCreateSource(VolumeCreateOption.VOLUME_SNAPSHOT).withSourceId("j"))
            .withSizeGiB(8463316449918745617L).withManagedBy(new ManagedByInfo().withResourceId("bijhtxfvgxbf"));
        model = BinaryData.fromObject(model).toObject(VolumeInner.class);
        Assertions.assertEquals(VolumeCreateOption.VOLUME_SNAPSHOT, model.creationData().createSource());
        Assertions.assertEquals("j", model.creationData().sourceId());
        Assertions.assertEquals(8463316449918745617L, model.sizeGiB());
        Assertions.assertEquals("bijhtxfvgxbf", model.managedBy().resourceId());
    }
}
