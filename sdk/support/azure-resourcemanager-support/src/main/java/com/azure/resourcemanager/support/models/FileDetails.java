// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.models;

import com.azure.core.http.rest.Response;
import com.azure.core.management.SystemData;
import com.azure.core.util.Context;
import com.azure.resourcemanager.support.fluent.models.FileDetailsInner;
import java.time.OffsetDateTime;

/**
 * An immutable client-side representation of FileDetails.
 */
public interface FileDetails {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     * 
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     * 
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     * 
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     * 
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the createdOn property: Time in UTC (ISO 8601 format) when file workspace was created.
     * 
     * @return the createdOn value.
     */
    OffsetDateTime createdOn();

    /**
     * Gets the chunkSize property: Size of each chunk. The size of each chunk should be provided in bytes and must not
     * exceed 2.5 megabytes (MB).
     * 
     * @return the chunkSize value.
     */
    Integer chunkSize();

    /**
     * Gets the fileSize property: Size of the file to be uploaded. The file size must not exceed 5 MB and should be
     * provided in bytes.
     * 
     * @return the fileSize value.
     */
    Integer fileSize();

    /**
     * Gets the numberOfChunks property: Number of chunks to be uploaded. The maximum number of allowed chunks is 2.
     * 
     * @return the numberOfChunks value.
     */
    Integer numberOfChunks();

    /**
     * Gets the inner com.azure.resourcemanager.support.fluent.models.FileDetailsInner object.
     * 
     * @return the inner object.
     */
    FileDetailsInner innerModel();

    /**
     * The entirety of the FileDetails definition.
     */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }

    /**
     * The FileDetails definition stages.
     */
    interface DefinitionStages {
        /**
         * The first stage of the FileDetails definition.
         */
        interface Blank extends WithParentResource {
        }

        /**
         * The stage of the FileDetails definition allowing to specify parent resource.
         */
        interface WithParentResource {
            /**
             * Specifies fileWorkspaceName.
             * 
             * @param fileWorkspaceName File workspace name.
             * @return the next definition stage.
             */
            WithCreate withExistingFileWorkspace(String fileWorkspaceName);
        }

        /**
         * The stage of the FileDetails definition which contains all the minimum required properties for the resource
         * to be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithChunkSize, DefinitionStages.WithFileSize, DefinitionStages.WithNumberOfChunks {
            /**
             * Executes the create request.
             * 
             * @return the created resource.
             */
            FileDetails create();

            /**
             * Executes the create request.
             * 
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            FileDetails create(Context context);
        }

        /**
         * The stage of the FileDetails definition allowing to specify chunkSize.
         */
        interface WithChunkSize {
            /**
             * Specifies the chunkSize property: Size of each chunk. The size of each chunk should be provided in bytes
             * and must not exceed 2.5 megabytes (MB)..
             * 
             * @param chunkSize Size of each chunk. The size of each chunk should be provided in bytes and must not
             * exceed 2.5 megabytes (MB).
             * @return the next definition stage.
             */
            WithCreate withChunkSize(Integer chunkSize);
        }

        /**
         * The stage of the FileDetails definition allowing to specify fileSize.
         */
        interface WithFileSize {
            /**
             * Specifies the fileSize property: Size of the file to be uploaded. The file size must not exceed 5 MB and
             * should be provided in bytes..
             * 
             * @param fileSize Size of the file to be uploaded. The file size must not exceed 5 MB and should be
             * provided in bytes.
             * @return the next definition stage.
             */
            WithCreate withFileSize(Integer fileSize);
        }

        /**
         * The stage of the FileDetails definition allowing to specify numberOfChunks.
         */
        interface WithNumberOfChunks {
            /**
             * Specifies the numberOfChunks property: Number of chunks to be uploaded. The maximum number of allowed
             * chunks is 2..
             * 
             * @param numberOfChunks Number of chunks to be uploaded. The maximum number of allowed chunks is 2.
             * @return the next definition stage.
             */
            WithCreate withNumberOfChunks(Integer numberOfChunks);
        }
    }

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @return the refreshed resource.
     */
    FileDetails refresh();

    /**
     * Refreshes the resource to sync with Azure.
     * 
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    FileDetails refresh(Context context);

    /**
     * This API allows you to upload content to a file.
     * 
     * @param uploadFile UploadFile object.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    Response<Void> uploadWithResponse(UploadFile uploadFile, Context context);

    /**
     * This API allows you to upload content to a file.
     * 
     * @param uploadFile UploadFile object.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    void upload(UploadFile uploadFile);
}
