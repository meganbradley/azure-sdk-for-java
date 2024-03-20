// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverProcessServerRequest;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.FailoverProcessServerRequestProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class FailoverProcessServerRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FailoverProcessServerRequest model = BinaryData.fromString(
            "{\"properties\":{\"containerName\":\"xsqwpgrjbznorc\",\"sourceProcessServerId\":\"vsnb\",\"targetProcessServerId\":\"qabnmoc\",\"vmsToMigrate\":[\"shurzafbljjgpbto\"],\"updateType\":\"jmkljavbqidtqajz\"}}")
            .toObject(FailoverProcessServerRequest.class);
        Assertions.assertEquals("xsqwpgrjbznorc", model.properties().containerName());
        Assertions.assertEquals("vsnb", model.properties().sourceProcessServerId());
        Assertions.assertEquals("qabnmoc", model.properties().targetProcessServerId());
        Assertions.assertEquals("shurzafbljjgpbto", model.properties().vmsToMigrate().get(0));
        Assertions.assertEquals("jmkljavbqidtqajz", model.properties().updateType());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FailoverProcessServerRequest model = new FailoverProcessServerRequest()
            .withProperties(new FailoverProcessServerRequestProperties().withContainerName("xsqwpgrjbznorc")
                .withSourceProcessServerId("vsnb").withTargetProcessServerId("qabnmoc")
                .withVmsToMigrate(Arrays.asList("shurzafbljjgpbto")).withUpdateType("jmkljavbqidtqajz"));
        model = BinaryData.fromObject(model).toObject(FailoverProcessServerRequest.class);
        Assertions.assertEquals("xsqwpgrjbznorc", model.properties().containerName());
        Assertions.assertEquals("vsnb", model.properties().sourceProcessServerId());
        Assertions.assertEquals("qabnmoc", model.properties().targetProcessServerId());
        Assertions.assertEquals("shurzafbljjgpbto", model.properties().vmsToMigrate().get(0));
        Assertions.assertEquals("jmkljavbqidtqajz", model.properties().updateType());
    }
}
