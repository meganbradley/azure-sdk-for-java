// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.cosmosdbforpostgresql.fluent.models.OperationInner;
import com.azure.resourcemanager.cosmosdbforpostgresql.models.OperationListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class OperationListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OperationListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"name\":\"nfnbacfionlebxe\",\"display\":{\"provider\":\"tzxdpnqbqqwx\",\"resource\":\"feallnwsu\",\"operation\":\"snjampmng\",\"description\":\"scxaq\"},\"isDataAction\":true,\"origin\":\"NotSpecified\",\"properties\":{\"pkvlrxn\":\"dataonq\",\"eipheoflokeyy\":\"dataea\",\"jp\":\"dataenjbdlwtgrhp\",\"e\":\"dataumasxazjpq\"}},{\"name\":\"alhbx\",\"display\":{\"provider\":\"jj\",\"resource\":\"v\",\"operation\":\"dgwdslfhot\",\"description\":\"cynpwlbjnp\"},\"isDataAction\":false,\"origin\":\"user\",\"properties\":{\"usue\":\"dataehxnltyfsop\",\"orxzdmohctbqvud\":\"datanzwdejba\",\"nvowgujju\":\"dataxdn\",\"zj\":\"datawdkcglhsl\"}}],\"nextLink\":\"ggd\"}")
                .toObject(OperationListResult.class);
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OperationListResult model =
            new OperationListResult()
                .withValue(
                    Arrays
                        .asList(
                            new OperationInner().withIsDataAction(true), new OperationInner().withIsDataAction(false)));
        model = BinaryData.fromObject(model).toObject(OperationListResult.class);
        Assertions.assertEquals(true, model.value().get(0).isDataAction());
    }
}