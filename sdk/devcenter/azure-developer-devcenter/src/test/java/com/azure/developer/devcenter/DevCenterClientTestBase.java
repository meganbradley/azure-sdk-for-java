// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter;

// Based and modified from the 'generated' DevCenterClientTestBase 

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import com.azure.core.util.serializer.TypeReference;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import reactor.core.publisher.Mono;

public class DevCenterClientTestBase extends TestProxyTestBase {
    protected DevCenterClient devCenterClient;

    protected DevBoxesClient devBoxesClient;

    protected DeploymentEnvironmentsClient deploymentEnvironmentsClient;

    protected String devEnvironmentName = "envName".toLowerCase();

    protected String devBoxName = "myDevBox".toLowerCase();

    protected String meUserId = "me";

    protected String projectName = Configuration.getGlobalConfiguration().get("DEFAULT_PROJECT_NAME", "proj-sdk-tests");

    protected String catalogName = Configuration.getGlobalConfiguration().get("DEFAULT_CATALOG_NAME", "sdk-default-catalog");

    protected String envTypeName = Configuration.getGlobalConfiguration().get("DEFAULT_ENVIRONMENT_TYPE_NAME", "sdk-default-environment-type");

    protected String envDefinitionName = Configuration.getGlobalConfiguration().get("DEFAULT_ENVIRONMENT_DEFINITION_NAME", "Sandbox");

    protected String poolName = Configuration.getGlobalConfiguration().get("DEFAULT_POOL_NAME", "sdk-default-pool");

    protected String endpoint = Configuration.getGlobalConfiguration().get("DEVCENTER_ENDPOINT", "https://8ab2df1c-ed88-4946-a8a9-e1bbb3e4d1fd-dc-sdk-tests.centraluseuap.devcenter.azure.com/");

    @Override
    protected void beforeTest() {
        DevCenterClientBuilder devCenterClientbuilder =
                new DevCenterClientBuilder()
                        .endpoint(endpoint)
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            devCenterClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            devCenterClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            devCenterClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        devCenterClient = devCenterClientbuilder.buildClient();

        DevBoxesClientBuilder devBoxesClientbuilder =
                new DevBoxesClientBuilder()
                        .endpoint(endpoint)
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            devBoxesClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            devBoxesClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            devBoxesClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        devBoxesClient = devBoxesClientbuilder.buildClient();

        DeploymentEnvironmentsClientBuilder deploymentEnvironmentsClientbuilder =
                new DeploymentEnvironmentsClientBuilder()
                        .endpoint(endpoint)
                        .httpClient(HttpClient.createDefault())
                        .httpLogOptions(new HttpLogOptions().setLogLevel(HttpLogDetailLevel.BASIC));
        if (getTestMode() == TestMode.PLAYBACK) {
            deploymentEnvironmentsClientbuilder
                    .httpClient(interceptorManager.getPlaybackClient())
                    .credential(request -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)));
        } else if (getTestMode() == TestMode.RECORD) {
            deploymentEnvironmentsClientbuilder
                    .addPolicy(interceptorManager.getRecordPolicy())
                    .credential(new DefaultAzureCredentialBuilder().build());
        } else if (getTestMode() == TestMode.LIVE) {
            deploymentEnvironmentsClientbuilder.credential(new DefaultAzureCredentialBuilder().build());
        }
        deploymentEnvironmentsClient = deploymentEnvironmentsClientbuilder.buildClient();
    }
    
    protected String getFirstEnvironmentDefinition() {
        RequestOptions requestOptions = new RequestOptions();

        PagedIterable<BinaryData> response =
            deploymentEnvironmentsClient.listEnvironmentDefinitionsByCatalog(projectName, catalogName, requestOptions);

        Assertions.assertEquals(200, response.iterableByPage().iterator().next().getStatusCode());

        String environmentDefinitionName = "";
        for (BinaryData data : response) {
            Map<String, Object> envDefinition = data.toObject(new TypeReference<Map<String, Object>>() {});
            environmentDefinitionName = (String) envDefinition.get("name");
            break;
        }

        if (environmentDefinitionName.isEmpty()) {
            Assertions.fail("Couldn't find environment definitions in a project");
        }

        return environmentDefinitionName;
    }

    protected String createEnvironment() {
        String environmentName = getFirstEnvironmentDefinition();

        BinaryData environmentBody = BinaryData.fromString(
            "{\"catalogItemName\":\"" + environmentName
                + "\", \"catalogName\":\"" + catalogName
                + "\", \"environmentType\":\"" + envTypeName + "\"}");

        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, BinaryData> createOperation =
            deploymentEnvironmentsClient.beginCreateOrUpdateEnvironment(
                projectName, "me", devEnvironmentName, environmentBody, requestOptions);

        Assertions.assertEquals(
            LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, createOperation.waitForCompletion().getStatus());

        return devEnvironmentName;
    }

    protected void deleteEnvironment(String environmentName) {
        RequestOptions requestOptions = new RequestOptions();
        SyncPoller<BinaryData, Void> deleteOperation =
            deploymentEnvironmentsClient.beginDeleteEnvironment(projectName, "me", environmentName, requestOptions);

        Assertions.assertEquals(
            LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, deleteOperation.waitForCompletion().getStatus());
    }

    protected void createDevBox() {
        BinaryData body = BinaryData.fromString(String.format("{\"poolName\": \"%s\"}", poolName));
        RequestOptions requestOptions = new RequestOptions();

        SyncPoller<BinaryData, BinaryData> response =
            devBoxesClient.beginCreateDevBox(projectName, "me", devBoxName, body, requestOptions);

        Assertions.assertEquals(
            LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.waitForCompletion().getStatus());
    }

    protected void deleteDevBox() {
        RequestOptions requestOptions = new RequestOptions();

        SyncPoller<BinaryData, Void> response =
            devBoxesClient.beginDeleteDevBox(projectName, "me", devBoxName, requestOptions);

        Assertions.assertEquals(
            LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, response.waitForCompletion().getStatus());
    }
}
