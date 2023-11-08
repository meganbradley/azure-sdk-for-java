// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.InboundNatRule;
import com.azure.resourcemanager.devtestlabs.models.SharedPublicIpAddressConfiguration;
import com.azure.resourcemanager.devtestlabs.models.TransportProtocol;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SharedPublicIpAddressConfigurationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SharedPublicIpAddressConfiguration model =
            BinaryData
                .fromString(
                    "{\"inboundNatRules\":[{\"transportProtocol\":\"Tcp\",\"frontendPort\":1513768261,\"backendPort\":930430831},{\"transportProtocol\":\"Tcp\",\"frontendPort\":845097361,\"backendPort\":182360383}]}")
                .toObject(SharedPublicIpAddressConfiguration.class);
        Assertions.assertEquals(TransportProtocol.TCP, model.inboundNatRules().get(0).transportProtocol());
        Assertions.assertEquals(1513768261, model.inboundNatRules().get(0).frontendPort());
        Assertions.assertEquals(930430831, model.inboundNatRules().get(0).backendPort());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SharedPublicIpAddressConfiguration model =
            new SharedPublicIpAddressConfiguration()
                .withInboundNatRules(
                    Arrays
                        .asList(
                            new InboundNatRule()
                                .withTransportProtocol(TransportProtocol.TCP)
                                .withFrontendPort(1513768261)
                                .withBackendPort(930430831),
                            new InboundNatRule()
                                .withTransportProtocol(TransportProtocol.TCP)
                                .withFrontendPort(845097361)
                                .withBackendPort(182360383)));
        model = BinaryData.fromObject(model).toObject(SharedPublicIpAddressConfiguration.class);
        Assertions.assertEquals(TransportProtocol.TCP, model.inboundNatRules().get(0).transportProtocol());
        Assertions.assertEquals(1513768261, model.inboundNatRules().get(0).frontendPort());
        Assertions.assertEquals(930430831, model.inboundNatRules().get(0).backendPort());
    }
}
