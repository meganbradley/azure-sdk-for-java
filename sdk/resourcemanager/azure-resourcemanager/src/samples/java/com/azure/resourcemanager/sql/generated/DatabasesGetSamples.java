// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

/**
 * Samples for Databases Get.
 */
public final class DatabasesGetSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/
     * GetDatabaseWithAvailabilityZone.json
     */
    /**
     * Sample code: Gets a database with Availability zone specified.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsADatabaseWithAvailabilityZoneSpecified(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabases().getWithResponse("Default-SQL-SouthEastAsia",
            "testsvr", "testdb", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/GetVCoreDatabase.json
     */
    /**
     * Sample code: Gets a database.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsADatabase(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabases().getWithResponse("Default-SQL-SouthEastAsia",
            "testsvr", "testdb", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/
     * GetVCoreDatabaseWithExpandEqualsKeys.json
     */
    /**
     * Sample code: Gets a database with database level keys expanded.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsADatabaseWithDatabaseLevelKeysExpanded(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabases().getWithResponse("Default-SQL-SouthEastAsia",
            "testsvr", "testdb", "keys", null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/
     * GetVCoreDatabaseDefaultEnclave.json
     */
    /**
     * Sample code: Gets a database configured with Default enclave type.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void
        getsADatabaseConfiguredWithDefaultEnclaveType(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabases().getWithResponse("Default-SQL-SouthEastAsia",
            "testsvr", "testdb", null, null, com.azure.core.util.Context.NONE);
    }

    /*
     * x-ms-original-file:
     * specification/sql/resource-manager/Microsoft.Sql/preview/2023-02-01-preview/examples/GetVCoreDatabaseVBSEnclave.
     * json
     */
    /**
     * Sample code: Gets a database configured with VBS enclave type.
     * 
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void getsADatabaseConfiguredWithVBSEnclaveType(com.azure.resourcemanager.AzureResourceManager azure) {
        azure.sqlServers().manager().serviceClient().getDatabases().getWithResponse("Default-SQL-SouthEastAsia",
            "testsvr", "testdb", null, null, com.azure.core.util.Context.NONE);
    }
}
