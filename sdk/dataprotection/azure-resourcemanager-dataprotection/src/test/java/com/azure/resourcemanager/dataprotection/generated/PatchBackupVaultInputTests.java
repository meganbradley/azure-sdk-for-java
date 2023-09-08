// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreState;
import com.azure.resourcemanager.dataprotection.models.FeatureSettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilitySettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.MonitoringSettings;
import com.azure.resourcemanager.dataprotection.models.PatchBackupVaultInput;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import org.junit.jupiter.api.Assertions;

public final class PatchBackupVaultInputTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PatchBackupVaultInput model =
            BinaryData
                .fromString(
                    "{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Enabled\"}},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"Off\",\"retentionDurationInDays\":59.897839624628624},\"immutabilitySettings\":{\"state\":\"Unlocked\"}},\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"Enabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Enabled\"}}}")
                .toObject(PatchBackupVaultInput.class);
        Assertions
            .assertEquals(
                AlertsState.ENABLED, model.monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions.assertEquals(SoftDeleteState.OFF, model.securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(59.897839624628624D, model.securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.UNLOCKED, model.securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.ENABLED,
                model.featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.ENABLED, model.featureSettings().crossRegionRestoreSettings().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PatchBackupVaultInput model =
            new PatchBackupVaultInput()
                .withMonitoringSettings(
                    new MonitoringSettings()
                        .withAzureMonitorAlertSettings(
                            new AzureMonitorAlertSettings().withAlertsForAllJobFailures(AlertsState.ENABLED)))
                .withSecuritySettings(
                    new SecuritySettings()
                        .withSoftDeleteSettings(
                            new SoftDeleteSettings()
                                .withState(SoftDeleteState.OFF)
                                .withRetentionDurationInDays(59.897839624628624D))
                        .withImmutabilitySettings(new ImmutabilitySettings().withState(ImmutabilityState.UNLOCKED)))
                .withFeatureSettings(
                    new FeatureSettings()
                        .withCrossSubscriptionRestoreSettings(
                            new CrossSubscriptionRestoreSettings().withState(CrossSubscriptionRestoreState.ENABLED))
                        .withCrossRegionRestoreSettings(
                            new CrossRegionRestoreSettings().withState(CrossRegionRestoreState.ENABLED)));
        model = BinaryData.fromObject(model).toObject(PatchBackupVaultInput.class);
        Assertions
            .assertEquals(
                AlertsState.ENABLED, model.monitoringSettings().azureMonitorAlertSettings().alertsForAllJobFailures());
        Assertions.assertEquals(SoftDeleteState.OFF, model.securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(59.897839624628624D, model.securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions.assertEquals(ImmutabilityState.UNLOCKED, model.securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.ENABLED,
                model.featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.ENABLED, model.featureSettings().crossRegionRestoreSettings().state());
    }
}
