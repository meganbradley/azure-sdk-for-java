// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.fluent.models.TenantConfigurationSyncStateContractInner;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class TenantConfigurationSyncStateContractInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TenantConfigurationSyncStateContractInner model =
            BinaryData
                .fromString(
                    "{\"properties\":{\"branch\":\"bfj\",\"commitId\":\"qzucfzluczdquur\",\"isExport\":false,\"isSynced\":true,\"isGitEnabled\":false,\"syncDate\":\"2021-04-12T14:43:43Z\",\"configurationChangeDate\":\"2021-05-22T17:17:14Z\",\"lastOperationId\":\"prnquj\"},\"id\":\"wzcqygg\",\"name\":\"nwsvhbngqiwye\",\"type\":\"tobdrrpnre\"}")
                .toObject(TenantConfigurationSyncStateContractInner.class);
        Assertions.assertEquals("bfj", model.branch());
        Assertions.assertEquals("qzucfzluczdquur", model.commitId());
        Assertions.assertEquals(false, model.isExport());
        Assertions.assertEquals(true, model.isSynced());
        Assertions.assertEquals(false, model.isGitEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T14:43:43Z"), model.syncDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-22T17:17:14Z"), model.configurationChangeDate());
        Assertions.assertEquals("prnquj", model.lastOperationId());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TenantConfigurationSyncStateContractInner model =
            new TenantConfigurationSyncStateContractInner()
                .withBranch("bfj")
                .withCommitId("qzucfzluczdquur")
                .withIsExport(false)
                .withIsSynced(true)
                .withIsGitEnabled(false)
                .withSyncDate(OffsetDateTime.parse("2021-04-12T14:43:43Z"))
                .withConfigurationChangeDate(OffsetDateTime.parse("2021-05-22T17:17:14Z"))
                .withLastOperationId("prnquj");
        model = BinaryData.fromObject(model).toObject(TenantConfigurationSyncStateContractInner.class);
        Assertions.assertEquals("bfj", model.branch());
        Assertions.assertEquals("qzucfzluczdquur", model.commitId());
        Assertions.assertEquals(false, model.isExport());
        Assertions.assertEquals(true, model.isSynced());
        Assertions.assertEquals(false, model.isGitEnabled());
        Assertions.assertEquals(OffsetDateTime.parse("2021-04-12T14:43:43Z"), model.syncDate());
        Assertions.assertEquals(OffsetDateTime.parse("2021-05-22T17:17:14Z"), model.configurationChangeDate());
        Assertions.assertEquals("prnquj", model.lastOperationId());
    }
}
