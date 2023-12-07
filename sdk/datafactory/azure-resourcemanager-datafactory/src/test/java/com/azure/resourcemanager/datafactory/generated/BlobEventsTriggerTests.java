// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.BlobEventTypes;
import com.azure.resourcemanager.datafactory.models.BlobEventsTrigger;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BlobEventsTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BlobEventsTrigger model = BinaryData.fromString(
            "{\"type\":\"BlobEventsTrigger\",\"typeProperties\":{\"blobPathBeginsWith\":\"bzjvzgyzenveiy\",\"blobPathEndsWith\":\"ngtylvdumpm\",\"ignoreEmptyBlobs\":true,\"events\":[\"Microsoft.Storage.BlobDeleted\",\"Microsoft.Storage.BlobDeleted\"],\"scope\":\"chdy\"},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"m\",\"name\":\"gdjbl\"},\"parameters\":{\"auetzp\":\"dataeclf\"}}],\"description\":\"cfgrtgnvlrm\",\"runtimeState\":\"Stopped\",\"annotations\":[\"dataxsybnwogvkc\"],\"\":{\"lvinxwtxtetwqk\":\"datavrqkmpqs\",\"rvkneo\":\"datazauumzwlr\",\"zvugqwxslisgfx\":\"dataplng\",\"llgrckoxkpjzyc\":\"datayfeqajtzquhqrj\"}}")
            .toObject(BlobEventsTrigger.class);
        Assertions.assertEquals("cfgrtgnvlrm", model.description());
        Assertions.assertEquals("m", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("gdjbl", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("bzjvzgyzenveiy", model.blobPathBeginsWith());
        Assertions.assertEquals("ngtylvdumpm", model.blobPathEndsWith());
        Assertions.assertEquals(true, model.ignoreEmptyBlobs());
        Assertions.assertEquals(BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED, model.events().get(0));
        Assertions.assertEquals("chdy", model.scope());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BlobEventsTrigger model
            = new BlobEventsTrigger().withDescription("cfgrtgnvlrm").withAnnotations(Arrays.asList("dataxsybnwogvkc"))
                .withPipelines(Arrays.asList(new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("m").withName("gdjbl"))
                    .withParameters(mapOf("auetzp", "dataeclf"))))
                .withBlobPathBeginsWith("bzjvzgyzenveiy").withBlobPathEndsWith("ngtylvdumpm").withIgnoreEmptyBlobs(true)
                .withEvents(Arrays.asList(BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED,
                    BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED))
                .withScope("chdy");
        model = BinaryData.fromObject(model).toObject(BlobEventsTrigger.class);
        Assertions.assertEquals("cfgrtgnvlrm", model.description());
        Assertions.assertEquals("m", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("gdjbl", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals("bzjvzgyzenveiy", model.blobPathBeginsWith());
        Assertions.assertEquals("ngtylvdumpm", model.blobPathEndsWith());
        Assertions.assertEquals(true, model.ignoreEmptyBlobs());
        Assertions.assertEquals(BlobEventTypes.MICROSOFT_STORAGE_BLOB_DELETED, model.events().get(0));
        Assertions.assertEquals("chdy", model.scope());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
