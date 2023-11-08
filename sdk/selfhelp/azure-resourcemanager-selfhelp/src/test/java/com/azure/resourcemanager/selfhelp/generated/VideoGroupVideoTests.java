// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.selfhelp.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.selfhelp.models.VideoGroupVideo;
import org.junit.jupiter.api.Assertions;

public final class VideoGroupVideoTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        VideoGroupVideo model =
            BinaryData.fromString("{\"src\":\"nkoukn\",\"title\":\"dwtiukbldngkp\"}").toObject(VideoGroupVideo.class);
        Assertions.assertEquals("nkoukn", model.src());
        Assertions.assertEquals("dwtiukbldngkp", model.title());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        VideoGroupVideo model = new VideoGroupVideo().withSrc("nkoukn").withTitle("dwtiukbldngkp");
        model = BinaryData.fromObject(model).toObject(VideoGroupVideo.class);
        Assertions.assertEquals("nkoukn", model.src());
        Assertions.assertEquals("dwtiukbldngkp", model.title());
    }
}
