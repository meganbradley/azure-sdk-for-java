// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.models;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;

/**
 * Resource collection API of GitLabProjects.
 */
public interface GitLabProjects {
    /**
     * Gets a list of GitLab projects that are directly owned by given group and onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param groupFQName The GitLab group fully-qualified name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of GitLab projects that are directly owned by given group and onboarded to the connector as
     * paginated response with {@link PagedIterable}.
     */
    PagedIterable<GitLabProject> list(String resourceGroupName, String securityConnectorName, String groupFQName);

    /**
     * Gets a list of GitLab projects that are directly owned by given group and onboarded to the connector.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param groupFQName The GitLab group fully-qualified name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of GitLab projects that are directly owned by given group and onboarded to the connector as
     * paginated response with {@link PagedIterable}.
     */
    PagedIterable<GitLabProject> list(String resourceGroupName, String securityConnectorName, String groupFQName,
        Context context);

    /**
     * Returns a monitored GitLab Project resource for a given fully-qualified group name and project name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param groupFQName The GitLab group fully-qualified name.
     * @param projectName The project name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitLab Project resource along with {@link Response}.
     */
    Response<GitLabProject> getWithResponse(String resourceGroupName, String securityConnectorName, String groupFQName,
        String projectName, Context context);

    /**
     * Returns a monitored GitLab Project resource for a given fully-qualified group name and project name.
     * 
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param securityConnectorName The security connector name.
     * @param groupFQName The GitLab group fully-qualified name.
     * @param projectName The project name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return gitLab Project resource.
     */
    GitLabProject get(String resourceGroupName, String securityConnectorName, String groupFQName, String projectName);
}
