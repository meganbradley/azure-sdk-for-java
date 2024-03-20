// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import com.azure.resourcemanager.support.models.FilesListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FilesListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FilesListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"createdOn\":\"2021-02-16T22:04:52Z\",\"chunkSize\":2009471016,\"fileSize\":1405607916,\"numberOfChunks\":200190444},\"id\":\"sytgadgvraea\",\"name\":\"neqn\",\"type\":\"arrwlquu\"},{\"properties\":{\"createdOn\":\"2021-07-01T04:35:37Z\",\"chunkSize\":1823399080,\"fileSize\":216133532,\"numberOfChunks\":2115532997},\"id\":\"pfpubjibww\",\"name\":\"f\",\"type\":\"ohqkvpuvksgpls\"}],\"nextLink\":\"nynfsynljphuo\"}")
            .toObject(FilesListResult.class);
        Assertions.assertEquals(2009471016, model.value().get(0).chunkSize());
        Assertions.assertEquals(1405607916, model.value().get(0).fileSize());
        Assertions.assertEquals(200190444, model.value().get(0).numberOfChunks());
        Assertions.assertEquals("nynfsynljphuo", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FilesListResult model = new FilesListResult().withValue(Arrays.asList(
            new FileDetailsInner().withChunkSize(2009471016).withFileSize(1405607916).withNumberOfChunks(200190444),
            new FileDetailsInner().withChunkSize(1823399080).withFileSize(216133532).withNumberOfChunks(2115532997)))
            .withNextLink("nynfsynljphuo");
        model = BinaryData.fromObject(model).toObject(FilesListResult.class);
        Assertions.assertEquals(2009471016, model.value().get(0).chunkSize());
        Assertions.assertEquals(1405607916, model.value().get(0).fileSize());
        Assertions.assertEquals(200190444, model.value().get(0).numberOfChunks());
        Assertions.assertEquals("nynfsynljphuo", model.nextLink());
    }
}
