// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.desktopvirtualization.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.desktopvirtualization.fluent.models.DesktopInner;
import com.azure.resourcemanager.desktopvirtualization.models.DesktopList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DesktopListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DesktopList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"objectId\":\"frvtpuqu\",\"description\":\"qlgkfbtn\",\"friendlyName\":\"aongbj\",\"iconHash\":\"tujitcjedft\"},\"id\":\"ae\",\"name\":\"kojvd\",\"type\":\"pzfoqoui\"},{\"properties\":{\"objectId\":\"arz\",\"description\":\"zuf\",\"friendlyName\":\"ciqopidoa\",\"iconHash\":\"iodhkhazxkhnz\"},\"id\":\"nlwntoe\",\"name\":\"okdwb\",\"type\":\"hksz\"}],\"nextLink\":\"mrv\"}")
                .toObject(DesktopList.class);
        Assertions.assertEquals("qlgkfbtn", model.value().get(0).description());
        Assertions.assertEquals("aongbj", model.value().get(0).friendlyName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DesktopList model =
            new DesktopList()
                .withValue(
                    Arrays
                        .asList(
                            new DesktopInner().withDescription("qlgkfbtn").withFriendlyName("aongbj"),
                            new DesktopInner().withDescription("zuf").withFriendlyName("ciqopidoa")));
        model = BinaryData.fromObject(model).toObject(DesktopList.class);
        Assertions.assertEquals("qlgkfbtn", model.value().get(0).description());
        Assertions.assertEquals("aongbj", model.value().get(0).friendlyName());
    }
}
