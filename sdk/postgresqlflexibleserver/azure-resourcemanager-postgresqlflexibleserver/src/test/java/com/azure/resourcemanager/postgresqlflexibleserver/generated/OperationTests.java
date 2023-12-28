// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.Operation;
import org.junit.jupiter.api.Assertions;

public final class OperationTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        Operation model =
            BinaryData
                .fromString(
                    "{\"name\":\"bqwrvtldgm\",\"display\":{\"provider\":\"vm\",\"resource\":\"paslthaqfxssmwu\",\"operation\":\"bdsrez\",\"description\":\"rhneuyowq\"},\"isDataAction\":false,\"origin\":\"system\",\"properties\":{\"rcgp\":\"dataib\",\"ejzanlfz\":\"datakpzi\",\"zonokixrjqci\":\"dataiavrm\"}}")
                .toObject(Operation.class);
        Assertions.assertEquals(false, model.isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        Operation model = new Operation().withIsDataAction(false);
        model = BinaryData.fromObject(model).toObject(Operation.class);
        Assertions.assertEquals(false, model.isDataAction());
    }
}
