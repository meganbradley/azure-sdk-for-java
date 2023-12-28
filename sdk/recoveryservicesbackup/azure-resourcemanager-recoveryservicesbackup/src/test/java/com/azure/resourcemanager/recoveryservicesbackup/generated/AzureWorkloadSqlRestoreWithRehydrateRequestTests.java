// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.recoveryservicesbackup.models.AzureWorkloadSqlRestoreWithRehydrateRequest;
import com.azure.resourcemanager.recoveryservicesbackup.models.OverwriteOptions;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryMode;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryPointRehydrationInfo;
import com.azure.resourcemanager.recoveryservicesbackup.models.RecoveryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.RehydrationPriority;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryMapping;
import com.azure.resourcemanager.recoveryservicesbackup.models.SqlDataDirectoryType;
import com.azure.resourcemanager.recoveryservicesbackup.models.TargetRestoreInfo;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class AzureWorkloadSqlRestoreWithRehydrateRequestTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AzureWorkloadSqlRestoreWithRehydrateRequest model =
            BinaryData
                .fromString(
                    "{\"objectType\":\"AzureWorkloadSQLRestoreWithRehydrateRequest\",\"recoveryPointRehydrationInfo\":{\"rehydrationRetentionDuration\":\"lqpx\",\"rehydrationPriority\":\"Standard\"},\"shouldUseAlternateTargetLocation\":true,\"isNonRecoverable\":true,\"alternateDirectoryPaths\":[{\"mappingType\":\"Log\",\"sourceLogicalName\":\"z\",\"sourcePath\":\"wxudgn\",\"targetPath\":\"ookrtalvnbw\"},{\"mappingType\":\"Invalid\",\"sourceLogicalName\":\"meluclvdjj\",\"sourcePath\":\"yrdnqod\",\"targetPath\":\"hhxhq\"},{\"mappingType\":\"Invalid\",\"sourceLogicalName\":\"vzoqgyipemchgavs\",\"sourcePath\":\"uejdtxptlg\",\"targetPath\":\"zhomewjjstliu\"},{\"mappingType\":\"Data\",\"sourceLogicalName\":\"moaiancz\",\"sourcePath\":\"odrrslblxyd\",\"targetPath\":\"rxvvbxi\"}],\"recoveryType\":\"OriginalLocation\",\"sourceResourceId\":\"bqlj\",\"propertyBag\":{\"rqlrqffawe\":\"hychocokuleh\",\"dbrxmrgc\":\"urkphyjdxravju\",\"jbuscg\":\"bapxkiyfjjkb\",\"mclujyxkyxlzgs\":\"uusioycblev\"},\"targetInfo\":{\"overwriteOption\":\"Overwrite\",\"containerId\":\"ltafhbzffo\",\"databaseName\":\"mbj\",\"targetDirectoryForFileRestore\":\"qsczpgvdwnapfdqw\"},\"recoveryMode\":\"FileRecovery\",\"targetVirtualMachineId\":\"ptnuwjtkschgc\"}")
                .toObject(AzureWorkloadSqlRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.ORIGINAL_LOCATION, model.recoveryType());
        Assertions.assertEquals("bqlj", model.sourceResourceId());
        Assertions.assertEquals("hychocokuleh", model.propertyBag().get("rqlrqffawe"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("ltafhbzffo", model.targetInfo().containerId());
        Assertions.assertEquals("mbj", model.targetInfo().databaseName());
        Assertions.assertEquals("qsczpgvdwnapfdqw", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("ptnuwjtkschgc", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(true, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("z", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("wxudgn", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("ookrtalvnbw", model.alternateDirectoryPaths().get(0).targetPath());
        Assertions.assertEquals("lqpx", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions
            .assertEquals(RehydrationPriority.STANDARD, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AzureWorkloadSqlRestoreWithRehydrateRequest model =
            new AzureWorkloadSqlRestoreWithRehydrateRequest()
                .withRecoveryType(RecoveryType.ORIGINAL_LOCATION)
                .withSourceResourceId("bqlj")
                .withPropertyBag(
                    mapOf(
                        "rqlrqffawe",
                        "hychocokuleh",
                        "dbrxmrgc",
                        "urkphyjdxravju",
                        "jbuscg",
                        "bapxkiyfjjkb",
                        "mclujyxkyxlzgs",
                        "uusioycblev"))
                .withTargetInfo(
                    new TargetRestoreInfo()
                        .withOverwriteOption(OverwriteOptions.OVERWRITE)
                        .withContainerId("ltafhbzffo")
                        .withDatabaseName("mbj")
                        .withTargetDirectoryForFileRestore("qsczpgvdwnapfdqw"))
                .withRecoveryMode(RecoveryMode.FILE_RECOVERY)
                .withTargetVirtualMachineId("ptnuwjtkschgc")
                .withShouldUseAlternateTargetLocation(true)
                .withIsNonRecoverable(true)
                .withAlternateDirectoryPaths(
                    Arrays
                        .asList(
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.LOG)
                                .withSourceLogicalName("z")
                                .withSourcePath("wxudgn")
                                .withTargetPath("ookrtalvnbw"),
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.INVALID)
                                .withSourceLogicalName("meluclvdjj")
                                .withSourcePath("yrdnqod")
                                .withTargetPath("hhxhq"),
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.INVALID)
                                .withSourceLogicalName("vzoqgyipemchgavs")
                                .withSourcePath("uejdtxptlg")
                                .withTargetPath("zhomewjjstliu"),
                            new SqlDataDirectoryMapping()
                                .withMappingType(SqlDataDirectoryType.DATA)
                                .withSourceLogicalName("moaiancz")
                                .withSourcePath("odrrslblxyd")
                                .withTargetPath("rxvvbxi")))
                .withRecoveryPointRehydrationInfo(
                    new RecoveryPointRehydrationInfo()
                        .withRehydrationRetentionDuration("lqpx")
                        .withRehydrationPriority(RehydrationPriority.STANDARD));
        model = BinaryData.fromObject(model).toObject(AzureWorkloadSqlRestoreWithRehydrateRequest.class);
        Assertions.assertEquals(RecoveryType.ORIGINAL_LOCATION, model.recoveryType());
        Assertions.assertEquals("bqlj", model.sourceResourceId());
        Assertions.assertEquals("hychocokuleh", model.propertyBag().get("rqlrqffawe"));
        Assertions.assertEquals(OverwriteOptions.OVERWRITE, model.targetInfo().overwriteOption());
        Assertions.assertEquals("ltafhbzffo", model.targetInfo().containerId());
        Assertions.assertEquals("mbj", model.targetInfo().databaseName());
        Assertions.assertEquals("qsczpgvdwnapfdqw", model.targetInfo().targetDirectoryForFileRestore());
        Assertions.assertEquals(RecoveryMode.FILE_RECOVERY, model.recoveryMode());
        Assertions.assertEquals("ptnuwjtkschgc", model.targetVirtualMachineId());
        Assertions.assertEquals(true, model.shouldUseAlternateTargetLocation());
        Assertions.assertEquals(true, model.isNonRecoverable());
        Assertions.assertEquals(SqlDataDirectoryType.LOG, model.alternateDirectoryPaths().get(0).mappingType());
        Assertions.assertEquals("z", model.alternateDirectoryPaths().get(0).sourceLogicalName());
        Assertions.assertEquals("wxudgn", model.alternateDirectoryPaths().get(0).sourcePath());
        Assertions.assertEquals("ookrtalvnbw", model.alternateDirectoryPaths().get(0).targetPath());
        Assertions.assertEquals("lqpx", model.recoveryPointRehydrationInfo().rehydrationRetentionDuration());
        Assertions
            .assertEquals(RehydrationPriority.STANDARD, model.recoveryPointRehydrationInfo().rehydrationPriority());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
