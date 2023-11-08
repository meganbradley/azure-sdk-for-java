// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devtestlabs.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devtestlabs.models.ImportLabVirtualMachineRequest;
import org.junit.jupiter.api.Assertions;

public final class ImportLabVirtualMachineRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ImportLabVirtualMachineRequest model =
            BinaryData
                .fromString(
                    "{\"sourceVirtualMachineResourceId\":\"cigeleohdbvqvw\",\"destinationVirtualMachineName\":\"jopwbeonrlkwz\"}")
                .toObject(ImportLabVirtualMachineRequest.class);
        Assertions.assertEquals("cigeleohdbvqvw", model.sourceVirtualMachineResourceId());
        Assertions.assertEquals("jopwbeonrlkwz", model.destinationVirtualMachineName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ImportLabVirtualMachineRequest model =
            new ImportLabVirtualMachineRequest()
                .withSourceVirtualMachineResourceId("cigeleohdbvqvw")
                .withDestinationVirtualMachineName("jopwbeonrlkwz");
        model = BinaryData.fromObject(model).toObject(ImportLabVirtualMachineRequest.class);
        Assertions.assertEquals("cigeleohdbvqvw", model.sourceVirtualMachineResourceId());
        Assertions.assertEquals("jopwbeonrlkwz", model.destinationVirtualMachineName());
    }
}
