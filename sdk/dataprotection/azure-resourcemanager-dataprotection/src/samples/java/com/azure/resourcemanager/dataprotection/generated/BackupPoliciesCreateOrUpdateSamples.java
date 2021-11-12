// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.resourcemanager.dataprotection.models.AbsoluteDeleteOption;
import com.azure.resourcemanager.dataprotection.models.AzureBackupParams;
import com.azure.resourcemanager.dataprotection.models.AzureBackupRule;
import com.azure.resourcemanager.dataprotection.models.AzureRetentionRule;
import com.azure.resourcemanager.dataprotection.models.BackupPolicy;
import com.azure.resourcemanager.dataprotection.models.BackupSchedule;
import com.azure.resourcemanager.dataprotection.models.DataStoreInfoBase;
import com.azure.resourcemanager.dataprotection.models.DataStoreTypes;
import com.azure.resourcemanager.dataprotection.models.DayOfWeek;
import com.azure.resourcemanager.dataprotection.models.RetentionTag;
import com.azure.resourcemanager.dataprotection.models.ScheduleBasedBackupCriteria;
import com.azure.resourcemanager.dataprotection.models.ScheduleBasedTriggerContext;
import com.azure.resourcemanager.dataprotection.models.SourceLifeCycle;
import com.azure.resourcemanager.dataprotection.models.TaggingCriteria;
import java.time.OffsetDateTime;
import java.util.Arrays;

/** Samples for BackupPolicies CreateOrUpdate. */
public final class BackupPoliciesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/dataprotection/resource-manager/Microsoft.DataProtection/stable/2021-07-01/examples/PolicyCRUD/CreateOrUpdateBackupPolicy.json
     */
    /**
     * Sample code: CreateOrUpdate BackupPolicy.
     *
     * @param manager Entry point to DataProtectionManager.
     */
    public static void createOrUpdateBackupPolicy(
        com.azure.resourcemanager.dataprotection.DataProtectionManager manager) {
        manager
            .backupPolicies()
            .define("OSSDBPolicy")
            .withExistingBackupVault("PrivatePreviewVault", "000pikumar")
            .withProperties(
                new BackupPolicy()
                    .withDatasourceTypes(Arrays.asList("OssDB"))
                    .withPolicyRules(
                        Arrays
                            .asList(
                                new AzureBackupRule()
                                    .withName("BackupWeekly")
                                    .withBackupParameters(new AzureBackupParams().withBackupType("Full"))
                                    .withDataStore(
                                        new DataStoreInfoBase()
                                            .withDataStoreType(DataStoreTypes.VAULT_STORE)
                                            .withObjectType("DataStoreInfoBase"))
                                    .withTrigger(
                                        new ScheduleBasedTriggerContext()
                                            .withSchedule(
                                                new BackupSchedule()
                                                    .withRepeatingTimeIntervals(
                                                        Arrays.asList("R/2019-11-20T08:00:00-08:00/P1W")))
                                            .withTaggingCriteria(
                                                Arrays
                                                    .asList(
                                                        new TaggingCriteria()
                                                            .withIsDefault(true)
                                                            .withTaggingPriority(99L)
                                                            .withTagInfo(new RetentionTag().withTagName("Default")),
                                                        new TaggingCriteria()
                                                            .withCriteria(
                                                                Arrays
                                                                    .asList(
                                                                        new ScheduleBasedBackupCriteria()
                                                                            .withDaysOfTheWeek(
                                                                                Arrays.asList(DayOfWeek.SUNDAY))
                                                                            .withScheduleTimes(
                                                                                Arrays
                                                                                    .asList(
                                                                                        OffsetDateTime
                                                                                            .parse(
                                                                                                "2019-03-01T13:00:00Z")))))
                                                            .withIsDefault(false)
                                                            .withTaggingPriority(20L)
                                                            .withTagInfo(new RetentionTag().withTagName("Weekly"))))),
                                new AzureRetentionRule()
                                    .withName("Default")
                                    .withIsDefault(true)
                                    .withLifecycles(
                                        Arrays
                                            .asList(
                                                new SourceLifeCycle()
                                                    .withDeleteAfter(new AbsoluteDeleteOption().withDuration("P1W"))
                                                    .withSourceDataStore(
                                                        new DataStoreInfoBase()
                                                            .withDataStoreType(DataStoreTypes.VAULT_STORE)
                                                            .withObjectType("DataStoreInfoBase")))),
                                new AzureRetentionRule()
                                    .withName("Weekly")
                                    .withIsDefault(false)
                                    .withLifecycles(
                                        Arrays
                                            .asList(
                                                new SourceLifeCycle()
                                                    .withDeleteAfter(new AbsoluteDeleteOption().withDuration("P12W"))
                                                    .withSourceDataStore(
                                                        new DataStoreInfoBase()
                                                            .withDataStoreType(DataStoreTypes.VAULT_STORE)
                                                            .withObjectType("DataStoreInfoBase")))))))
            .create();
    }
}
