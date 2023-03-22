// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.OperationInner;
import com.azure.resourcemanager.security.models.OperationDisplay;
import com.azure.resourcemanager.security.models.OperationList;
import java.util.Arrays;

public final class OperationListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"nwashrtd\",\"origin\":\"cnqxwbpokulpi\",\"display\":{\"provider\":\"aasipqi\",\"resource\":\"byuqerpqlp\",\"operation\":\"cciuqgbdbutau\",\"description\":\"btkuwhh\"}},{\"name\":\"ykojoxafnndlpic\",\"origin\":\"o\",\"display\":{\"provider\":\"cdyhbpkkpwdreqn\",\"resource\":\"vq\",\"operation\":\"vljxywsu\",\"description\":\"yrs\"}}],\"nextLink\":\"sytgadgvraea\"}")
                .toObject(OperationList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationList model =
            new OperationList()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner().withDisplay(new OperationDisplay()),
                            new OperationInner().withDisplay(new OperationDisplay())));
        model = BinaryData.fromObject(model).toObject(OperationList.class);
    }
}
