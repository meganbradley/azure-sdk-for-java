// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.OSDetails;
import org.junit.jupiter.api.Assertions;

public final class OSDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OSDetails model =
            BinaryData
                .fromString(
                    "{\"osType\":\"dqigmg\",\"productType\":\"inztxl\",\"osEdition\":\"khnjcmrnkfm\",\"oSVersion\":\"cqtwmlmhjnqtq\",\"oSMajorVersion\":\"hj\",\"oSMinorVersion\":\"vragpokddx\"}")
                .toObject(OSDetails.class);
        Assertions.assertEquals("dqigmg", model.osType());
        Assertions.assertEquals("inztxl", model.productType());
        Assertions.assertEquals("khnjcmrnkfm", model.osEdition());
        Assertions.assertEquals("cqtwmlmhjnqtq", model.oSVersion());
        Assertions.assertEquals("hj", model.oSMajorVersion());
        Assertions.assertEquals("vragpokddx", model.oSMinorVersion());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OSDetails model =
            new OSDetails()
                .withOsType("dqigmg")
                .withProductType("inztxl")
                .withOsEdition("khnjcmrnkfm")
                .withOSVersion("cqtwmlmhjnqtq")
                .withOSMajorVersion("hj")
                .withOSMinorVersion("vragpokddx");
        model = BinaryData.fromObject(model).toObject(OSDetails.class);
        Assertions.assertEquals("dqigmg", model.osType());
        Assertions.assertEquals("inztxl", model.productType());
        Assertions.assertEquals("khnjcmrnkfm", model.osEdition());
        Assertions.assertEquals("cqtwmlmhjnqtq", model.oSVersion());
        Assertions.assertEquals("hj", model.oSMajorVersion());
        Assertions.assertEquals("vragpokddx", model.oSMinorVersion());
    }
}
