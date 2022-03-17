// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts;

import com.azure.analytics.synapse.artifacts.implementation.NotebooksImpl;
import com.azure.analytics.synapse.artifacts.models.ArtifactRenameRequest;
import com.azure.analytics.synapse.artifacts.models.CloudErrorAutoGeneratedException;
import com.azure.analytics.synapse.artifacts.models.NotebookResource;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceClient;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/** Initializes a new instance of the synchronous ArtifactsClient type. */
@ServiceClient(builder = ArtifactsClientBuilder.class)
public final class NotebookClient {
    @Generated private final NotebooksImpl serviceClient;

    /**
     * Initializes an instance of Notebooks client.
     *
     * @param serviceClient the service client implementation.
     */
    @Generated
    NotebookClient(NotebooksImpl serviceClient) {
        this.serviceClient = serviceClient;
    }

    /**
     * Lists Notebooks.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebooksByWorkspace() {
        return this.serviceClient.getNotebooksByWorkspace();
    }

    /**
     * Lists Notebooks.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebooksByWorkspace(Context context) {
        return this.serviceClient.getNotebooksByWorkspace(context);
    }

    /**
     * Lists a summary of Notebooks.
     *
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebookSummaryByWorkSpace() {
        return this.serviceClient.getNotebookSummaryByWorkSpace();
    }

    /**
     * Lists a summary of Notebooks.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of Notebook resources as paginated response with {@link PagedIterable}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.COLLECTION)
    public PagedIterable<NotebookResource> getNotebookSummaryByWorkSpace(Context context) {
        return this.serviceClient.getNotebookSummaryByWorkSpace(context);
    }

    /**
     * Creates or updates a Note Book.
     *
     * @param notebookName The notebook name.
     * @param notebook Note book resource definition.
     * @param ifMatch ETag of the Note book entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook resource type.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource createOrUpdateNotebook(String notebookName, NotebookResource notebook, String ifMatch) {
        return this.serviceClient.createOrUpdateNotebook(notebookName, notebook, ifMatch);
    }

    /**
     * Creates or updates a Note Book.
     *
     * @param notebookName The notebook name.
     * @param notebook Note book resource definition.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook resource type.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource createOrUpdateNotebook(String notebookName, NotebookResource notebook) {
        return this.serviceClient.createOrUpdateNotebook(notebookName, notebook);
    }

    /**
     * Creates or updates a Note Book.
     *
     * @param notebookName The notebook name.
     * @param notebook Note book resource definition.
     * @param ifMatch ETag of the Note book entity. Should only be specified for update, for which it should match
     *     existing entity or can be * for unconditional update.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return notebook resource type along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NotebookResource> createOrUpdateNotebookWithResponse(
            String notebookName, NotebookResource notebook, String ifMatch, Context context) {
        return this.serviceClient.createOrUpdateNotebookWithResponse(notebookName, notebook, ifMatch, context);
    }

    /**
     * Gets a Note Book.
     *
     * @param notebookName The notebook name.
     * @param ifNoneMatch ETag of the Notebook entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Note Book.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource getNotebook(String notebookName, String ifNoneMatch) {
        return this.serviceClient.getNotebook(notebookName, ifNoneMatch);
    }

    /**
     * Gets a Note Book.
     *
     * @param notebookName The notebook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Note Book.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public NotebookResource getNotebook(String notebookName) {
        return this.serviceClient.getNotebook(notebookName);
    }

    /**
     * Gets a Note Book.
     *
     * @param notebookName The notebook name.
     * @param ifNoneMatch ETag of the Notebook entity. Should only be specified for get. If the ETag matches the
     *     existing entity tag, or if * was provided, then no content will be returned.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Note Book along with {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<NotebookResource> getNotebookWithResponse(
            String notebookName, String ifNoneMatch, Context context) {
        return this.serviceClient.getNotebookWithResponse(notebookName, ifNoneMatch, context);
    }

    /**
     * Deletes a Note book.
     *
     * @param notebookName The notebook name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void deleteNotebook(String notebookName) {
        this.serviceClient.deleteNotebook(notebookName);
    }

    /**
     * Deletes a Note book.
     *
     * @param notebookName The notebook name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> deleteNotebookWithResponse(String notebookName, Context context) {
        return this.serviceClient.deleteNotebookWithResponse(notebookName, context);
    }

    /**
     * Renames a notebook.
     *
     * @param notebookName The notebook name.
     * @param request proposed new name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public void renameNotebook(String notebookName, ArtifactRenameRequest request) {
        this.serviceClient.renameNotebook(notebookName, request);
    }

    /**
     * Renames a notebook.
     *
     * @param notebookName The notebook name.
     * @param request proposed new name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws CloudErrorAutoGeneratedException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @Generated
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Void> renameNotebookWithResponse(
            String notebookName, ArtifactRenameRequest request, Context context) {
        return this.serviceClient.renameNotebookWithResponse(notebookName, request, context);
    }
}
