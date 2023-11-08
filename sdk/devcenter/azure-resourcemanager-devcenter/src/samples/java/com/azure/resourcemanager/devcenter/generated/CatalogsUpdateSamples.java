// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.resourcemanager.devcenter.models.Catalog;
import com.azure.resourcemanager.devcenter.models.CatalogSyncType;
import com.azure.resourcemanager.devcenter.models.GitCatalog;

/** Samples for Catalogs Update. */
public final class CatalogsUpdateSamples {
    /*
     * x-ms-original-file: specification/devcenter/resource-manager/Microsoft.DevCenter/preview/2023-10-01-preview/examples/Catalogs_Patch.json
     */
    /**
     * Sample code: Catalogs_Update.
     *
     * @param manager Entry point to DevCenterManager.
     */
    public static void catalogsUpdate(com.azure.resourcemanager.devcenter.DevCenterManager manager) {
        Catalog resource =
            manager
                .catalogs()
                .getWithResponse("rg1", "Contoso", "CentralCatalog", com.azure.core.util.Context.NONE)
                .getValue();
        resource
            .update()
            .withGitHub(new GitCatalog().withPath("/environments"))
            .withSyncType(CatalogSyncType.SCHEDULED)
            .apply();
    }
}
