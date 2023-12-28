// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.cosmosdbforpostgresql.generated;

import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.Map;

/** Samples for Clusters Create. */
public final class ClustersCreateSamples {
    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreateSingleNode.json
     */
    /**
     * Sample code: Create a new single node cluster.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void createANewSingleNodeCluster(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager
            .clusters()
            .define("testcluster-singlenode")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withTags(mapOf("owner", "JohnDoe"))
            .withAdministratorLoginPassword("password")
            .withPostgresqlVersion("15")
            .withCitusVersion("11.3")
            .withPreferredPrimaryZone("1")
            .withEnableShardsOnCoordinator(true)
            .withEnableHa(true)
            .withCoordinatorServerEdition("GeneralPurpose")
            .withCoordinatorStorageQuotaInMb(131072)
            .withCoordinatorVCores(8)
            .withCoordinatorEnablePublicIpAccess(true)
            .withNodeCount(0)
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreateBurstablev1.json
     */
    /**
     * Sample code: Create a new single node Burstable 1 vCore cluster.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void createANewSingleNodeBurstable1VCoreCluster(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager
            .clusters()
            .define("testcluster-burstablev1")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withTags(mapOf("owner", "JohnDoe"))
            .withAdministratorLoginPassword("password")
            .withPostgresqlVersion("15")
            .withCitusVersion("11.3")
            .withPreferredPrimaryZone("1")
            .withEnableShardsOnCoordinator(true)
            .withEnableHa(false)
            .withCoordinatorServerEdition("BurstableMemoryOptimized")
            .withCoordinatorStorageQuotaInMb(131072)
            .withCoordinatorVCores(1)
            .withCoordinatorEnablePublicIpAccess(true)
            .withNodeCount(0)
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreateBurstablev2.json
     */
    /**
     * Sample code: Create a new single node Burstable 2 vCores cluster.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void createANewSingleNodeBurstable2VCoresCluster(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager
            .clusters()
            .define("testcluster-burstablev2")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withTags(mapOf("owner", "JohnDoe"))
            .withAdministratorLoginPassword("password")
            .withPostgresqlVersion("15")
            .withCitusVersion("11.3")
            .withPreferredPrimaryZone("1")
            .withEnableShardsOnCoordinator(true)
            .withEnableHa(false)
            .withCoordinatorServerEdition("BurstableGeneralPurpose")
            .withCoordinatorStorageQuotaInMb(131072)
            .withCoordinatorVCores(2)
            .withCoordinatorEnablePublicIpAccess(true)
            .withNodeCount(0)
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreateMultiNode.json
     */
    /**
     * Sample code: Create a new multi-node cluster.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void createANewMultiNodeCluster(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager
            .clusters()
            .define("testcluster-multinode")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withTags(mapOf())
            .withAdministratorLoginPassword("password")
            .withPostgresqlVersion("15")
            .withCitusVersion("11.1")
            .withPreferredPrimaryZone("1")
            .withEnableShardsOnCoordinator(false)
            .withEnableHa(true)
            .withCoordinatorServerEdition("GeneralPurpose")
            .withCoordinatorStorageQuotaInMb(524288)
            .withCoordinatorVCores(4)
            .withCoordinatorEnablePublicIpAccess(true)
            .withNodeServerEdition("MemoryOptimized")
            .withNodeCount(3)
            .withNodeStorageQuotaInMb(524288)
            .withNodeVCores(8)
            .withNodeEnablePublicIpAccess(false)
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreateReadReplica.json
     */
    /**
     * Sample code: Create a new cluster as a read replica.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void createANewClusterAsAReadReplica(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager
            .clusters()
            .define("testcluster")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withSourceResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/sourcecluster")
            .withSourceLocation("westus")
            .create();
    }

    /*
     * x-ms-original-file: specification/postgresqlhsc/resource-manager/Microsoft.DBforPostgreSQL/stable/2022-11-08/examples/ClusterCreatePITR.json
     */
    /**
     * Sample code: Create a new cluster as a point in time restore.
     *
     * @param manager Entry point to CosmosDBForPostgreSqlManager.
     */
    public static void createANewClusterAsAPointInTimeRestore(
        com.azure.resourcemanager.cosmosdbforpostgresql.CosmosDBForPostgreSqlManager manager) {
        manager
            .clusters()
            .define("testcluster")
            .withRegion("westus")
            .withExistingResourceGroup("TestGroup")
            .withSourceResourceId(
                "/subscriptions/ffffffff-ffff-ffff-ffff-ffffffffffff/resourceGroups/TestResourceGroup/providers/Microsoft.DBforPostgreSQL/serverGroupsv2/source-cluster")
            .withSourceLocation("westus")
            .withPointInTimeUtc(OffsetDateTime.parse("2017-12-14T00:00:37.467Z"))
            .create();
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
