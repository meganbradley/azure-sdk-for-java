// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storageactions.generated;

import com.azure.resourcemanager.storageactions.fluent.models.StorageTaskPreviewActionInner;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewActionCondition;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewActionIfCondition;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewActionProperties;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewBlobProperties;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewContainerProperties;
import com.azure.resourcemanager.storageactions.models.StorageTaskPreviewKeyValueProperties;
import java.util.Arrays;

/**
 * Samples for StorageTasks PreviewActions.
 */
public final class StorageTasksPreviewActionsSamples {
    /*
     * x-ms-original-file:
     * specification/storageactions/resource-manager/Microsoft.StorageActions/stable/2023-01-01/examples/misc/
     * PerformStorageTaskActionsPreview.json
     */
    /**
     * Sample code: PerformStorageTaskActionsPreview.
     * 
     * @param manager Entry point to StorageActionsManager.
     */
    public static void
        performStorageTaskActionsPreview(com.azure.resourcemanager.storageactions.StorageActionsManager manager) {
        manager.storageTasks().previewActionsWithResponse("eastus",
            new StorageTaskPreviewActionInner().withProperties(new StorageTaskPreviewActionProperties()
                .withContainer(new StorageTaskPreviewContainerProperties().withName("firstContainer")
                    .withMetadata(Arrays.asList(new StorageTaskPreviewKeyValueProperties()
                        .withKey("fakeTokenPlaceholder").withValue("mContainerValue1"))))
                .withBlobs(Arrays.asList(
                    new StorageTaskPreviewBlobProperties().withName("folder1/file1.txt").withProperties(Arrays.asList(
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("Wed, 07 Jun 2023 05:23:29 GMT"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("Wed, 07 Jun 2023 05:23:29 GMT"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("0x8DB67175454D36D"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue("38619"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("text/xml"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue(""),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue(""),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue(""),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("njr6iDrmU9+FC89WMK22EA=="),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue(""),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue(""),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("BlockBlob"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue("Hot"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue("true"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("unlocked"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                            .withValue("available"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue("true"),
                        new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder").withValue("1")))
                        .withMetadata(Arrays.asList(new StorageTaskPreviewKeyValueProperties()
                            .withKey("fakeTokenPlaceholder").withValue("mValue1")))
                        .withTags(Arrays.asList(new StorageTaskPreviewKeyValueProperties()
                            .withKey("fakeTokenPlaceholder").withValue("tValue1"))),
                    new StorageTaskPreviewBlobProperties().withName("folder2/file1.txt")
                        .withProperties(Arrays.asList(
                            new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                                .withValue("Wed, 06 Jun 2023 05:23:29 GMT"),
                            new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                                .withValue("Wed, 06 Jun 2023 05:23:29 GMT"),
                            new StorageTaskPreviewKeyValueProperties().withKey("fakeTokenPlaceholder")
                                .withValue("0x6FB67175454D36D")))
                        .withMetadata(Arrays.asList(new StorageTaskPreviewKeyValueProperties()
                            .withKey("fakeTokenPlaceholder").withValue("mValue2")))
                        .withTags(Arrays.asList(new StorageTaskPreviewKeyValueProperties()
                            .withKey("fakeTokenPlaceholder").withValue("tValue2")))))
                .withAction(new StorageTaskPreviewActionCondition()
                    .withIfProperty(
                        new StorageTaskPreviewActionIfCondition().withCondition("[[equals(AccessTier, 'Hot')]]"))
                    .withElseBlockExists(true))),
            com.azure.core.util.Context.NONE);
    }
}
