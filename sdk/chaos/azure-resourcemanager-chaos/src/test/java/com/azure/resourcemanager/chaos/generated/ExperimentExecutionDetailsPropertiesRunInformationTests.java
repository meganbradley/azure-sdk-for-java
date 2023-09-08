// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.chaos.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.chaos.models.ExperimentExecutionDetailsPropertiesRunInformation;

public final class ExperimentExecutionDetailsPropertiesRunInformationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExperimentExecutionDetailsPropertiesRunInformation model =
            BinaryData
                .fromString(
                    "{\"steps\":[{\"stepName\":\"thuma\",\"stepId\":\"lbg\",\"status\":\"duiertgcc\",\"branches\":[{\"branchName\":\"olpsslqlf\",\"branchId\":\"dnbbglzps\",\"status\":\"ydmcwyhzdxssa\",\"actions\":[{},{},{},{}]},{\"branchName\":\"nvdfznuda\",\"branchId\":\"vxzbncb\",\"status\":\"lpstdbhhxsrzdz\",\"actions\":[{},{},{}]},{\"branchName\":\"scdntnevf\",\"branchId\":\"jmygtdsslswtmwer\",\"status\":\"fzp\",\"actions\":[{},{},{}]}]},{\"stepName\":\"mwabnetshhszhedp\",\"stepId\":\"wiwubm\",\"status\":\"besldnkwwtppjflc\",\"branches\":[{\"branchName\":\"okonzmnsikvmkqz\",\"branchId\":\"qkdltfz\",\"status\":\"hhvh\",\"actions\":[{}]},{\"branchName\":\"odkwobd\",\"branchId\":\"xtibqdxbxwakbog\",\"status\":\"ndlkzgxhurip\",\"actions\":[{},{}]},{\"branchName\":\"dxunkbebxmubyyn\",\"branchId\":\"lrb\",\"status\":\"koievseo\",\"actions\":[{}]},{\"branchName\":\"l\",\"branchId\":\"muwlauwzizxbm\",\"status\":\"cjefuzmu\",\"actions\":[{},{},{}]}]}]}")
                .toObject(ExperimentExecutionDetailsPropertiesRunInformation.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExperimentExecutionDetailsPropertiesRunInformation model =
            new ExperimentExecutionDetailsPropertiesRunInformation();
        model = BinaryData.fromObject(model).toObject(ExperimentExecutionDetailsPropertiesRunInformation.class);
    }
}
