// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.OracleCloudStorageReadSettings;

public final class OracleCloudStorageReadSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OracleCloudStorageReadSettings model = BinaryData.fromString(
            "{\"type\":\"mqntutetdtgci\",\"recursive\":\"dataslfxejpocsgig\",\"wildcardFolderPath\":\"datab\",\"wildcardFileName\":\"datandyjwmglgstrzfhe\",\"prefix\":\"datazovkbcbef\",\"fileListPath\":\"datanymfhmljimkg\",\"enablePartitionDiscovery\":\"datazvmtjcxigiszxd\",\"partitionRootPath\":\"datalceetuivmbugizwy\",\"deleteFilesAfterCompletion\":\"datahfptbdxtv\",\"modifiedDatetimeStart\":\"datajuls\",\"modifiedDatetimeEnd\":\"dataiuzytxeaq\",\"maxConcurrentConnections\":\"datarjwiwou\",\"disableMetricsCollection\":\"dataaqnfyhgrcm\",\"\":{\"twelutrvdzhwp\":\"datapledxyecttu\",\"ltslfccyavy\":\"datapscw\",\"mldkci\":\"datafmndrdqqjkeg\"}}")
            .toObject(OracleCloudStorageReadSettings.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OracleCloudStorageReadSettings model
            = new OracleCloudStorageReadSettings().withMaxConcurrentConnections("datarjwiwou")
                .withDisableMetricsCollection("dataaqnfyhgrcm")
                .withRecursive("dataslfxejpocsgig")
                .withWildcardFolderPath("datab")
                .withWildcardFileName("datandyjwmglgstrzfhe")
                .withPrefix("datazovkbcbef")
                .withFileListPath("datanymfhmljimkg")
                .withEnablePartitionDiscovery("datazvmtjcxigiszxd")
                .withPartitionRootPath("datalceetuivmbugizwy")
                .withDeleteFilesAfterCompletion("datahfptbdxtv")
                .withModifiedDatetimeStart("datajuls")
                .withModifiedDatetimeEnd("dataiuzytxeaq");
        model = BinaryData.fromObject(model).toObject(OracleCloudStorageReadSettings.class);
    }
}
