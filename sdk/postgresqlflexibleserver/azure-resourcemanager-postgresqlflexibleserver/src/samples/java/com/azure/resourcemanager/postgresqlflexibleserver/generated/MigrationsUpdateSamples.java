// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.resourcemanager.postgresqlflexibleserver.models.CancelEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.LogicalReplicationOnSourceDbEnum;
import com.azure.resourcemanager.postgresqlflexibleserver.models.MigrationResource;

/**
 * Samples for Migrations Update.
 */
public final class MigrationsUpdateSamples {
    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2023-12-01-preview/examples/Migrations_Cancel.json
     */
    /**
     * Sample code: Cancel migration.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void cancelMigration(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        MigrationResource resource = manager.migrations()
            .getWithResponse("ffffffff-ffff-ffff-ffff-ffffffffffff", "testrg", "testtarget", "testmigration",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withCancel(CancelEnum.TRUE).apply();
    }

    /*
     * x-ms-original-file: specification/postgresql/resource-manager/Microsoft.DBforPostgreSQL/preview/2023-12-01-preview/examples/Migrations_Update.json
     */
    /**
     * Sample code: Migrations_Update.
     * 
     * @param manager Entry point to PostgreSqlManager.
     */
    public static void migrationsUpdate(com.azure.resourcemanager.postgresqlflexibleserver.PostgreSqlManager manager) {
        MigrationResource resource = manager.migrations()
            .getWithResponse("ffffffff-ffff-ffff-ffff-ffffffffffff", "testrg", "testtarget", "testmigration",
                com.azure.core.util.Context.NONE)
            .getValue();
        resource.update().withSetupLogicalReplicationOnSourceDbIfNeeded(LogicalReplicationOnSourceDbEnum.TRUE).apply();
    }
}
