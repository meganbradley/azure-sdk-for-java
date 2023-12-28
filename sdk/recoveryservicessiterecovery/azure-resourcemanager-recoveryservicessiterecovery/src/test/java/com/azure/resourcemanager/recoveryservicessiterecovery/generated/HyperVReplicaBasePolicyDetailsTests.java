// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicessiterecovery.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicessiterecovery.models.HyperVReplicaBasePolicyDetails;
import org.junit.jupiter.api.Assertions;

public final class HyperVReplicaBasePolicyDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        HyperVReplicaBasePolicyDetails model =
            BinaryData
                .fromString(
                    "{\"instanceType\":\"HyperVReplicaBasePolicyDetails\",\"recoveryPoints\":656606105,\"applicationConsistentSnapshotFrequencyInHours\":287145648,\"compression\":\"icghfl\",\"initialReplicationMethod\":\"fss\",\"onlineReplicationStartTime\":\"ghsfxrkbhammgmqf\",\"offlineReplicationImportPath\":\"fgvqcpdw\",\"offlineReplicationExportPath\":\"quxweyslandkd\",\"replicationPort\":27796894,\"allowedAuthenticationType\":654444535,\"replicaDeletionOption\":\"hghcgawnrrnqu\"}")
                .toObject(HyperVReplicaBasePolicyDetails.class);
        Assertions.assertEquals(656606105, model.recoveryPoints());
        Assertions.assertEquals(287145648, model.applicationConsistentSnapshotFrequencyInHours());
        Assertions.assertEquals("icghfl", model.compression());
        Assertions.assertEquals("fss", model.initialReplicationMethod());
        Assertions.assertEquals("ghsfxrkbhammgmqf", model.onlineReplicationStartTime());
        Assertions.assertEquals("fgvqcpdw", model.offlineReplicationImportPath());
        Assertions.assertEquals("quxweyslandkd", model.offlineReplicationExportPath());
        Assertions.assertEquals(27796894, model.replicationPort());
        Assertions.assertEquals(654444535, model.allowedAuthenticationType());
        Assertions.assertEquals("hghcgawnrrnqu", model.replicaDeletionOption());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        HyperVReplicaBasePolicyDetails model =
            new HyperVReplicaBasePolicyDetails()
                .withRecoveryPoints(656606105)
                .withApplicationConsistentSnapshotFrequencyInHours(287145648)
                .withCompression("icghfl")
                .withInitialReplicationMethod("fss")
                .withOnlineReplicationStartTime("ghsfxrkbhammgmqf")
                .withOfflineReplicationImportPath("fgvqcpdw")
                .withOfflineReplicationExportPath("quxweyslandkd")
                .withReplicationPort(27796894)
                .withAllowedAuthenticationType(654444535)
                .withReplicaDeletionOption("hghcgawnrrnqu");
        model = BinaryData.fromObject(model).toObject(HyperVReplicaBasePolicyDetails.class);
        Assertions.assertEquals(656606105, model.recoveryPoints());
        Assertions.assertEquals(287145648, model.applicationConsistentSnapshotFrequencyInHours());
        Assertions.assertEquals("icghfl", model.compression());
        Assertions.assertEquals("fss", model.initialReplicationMethod());
        Assertions.assertEquals("ghsfxrkbhammgmqf", model.onlineReplicationStartTime());
        Assertions.assertEquals("fgvqcpdw", model.offlineReplicationImportPath());
        Assertions.assertEquals("quxweyslandkd", model.offlineReplicationExportPath());
        Assertions.assertEquals(27796894, model.replicationPort());
        Assertions.assertEquals(654444535, model.allowedAuthenticationType());
        Assertions.assertEquals("hghcgawnrrnqu", model.replicaDeletionOption());
    }
}
