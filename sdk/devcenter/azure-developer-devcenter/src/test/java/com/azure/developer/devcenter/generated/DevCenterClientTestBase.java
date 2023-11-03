// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter.generated;

// The Java test files under 'generated' package are generated for your reference.
// If you wish to modify these files, please copy them out of the 'generated' package, and modify there.
// See https://aka.ms/azsdk/dpg/java/tests for guide on adding a test.

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.policy.HttpLogDetailLevel;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.Configuration;
import com.azure.developer.devcenter.DeploymentEnvironmentsClient;
import com.azure.developer.devcenter.DeploymentEnvironmentsClientBuilder;
import com.azure.developer.devcenter.DevBoxesClient;
import com.azure.developer.devcenter.DevBoxesClientBuilder;
import com.azure.developer.devcenter.DevCenterClient;
import com.azure.developer.devcenter.DevCenterClientBuilder;
import com.azure.identity.DefaultAzureCredentialBuilder;
import java.time.OffsetDateTime;
import reactor.core.publisher.Mono;

class DevCenterClientTestBase extends TestProxyTestBase {
    protected DevCenterClient devCenterClient;

    protected DevBoxesClient devBoxesClient;

    protected DeploymentEnvironmentsClient deploymentEnvironmentsClient;

    @Override
    protected void beforeTest() {
        DevCenterClientBuilder devCenterClientbuilder =
                new DevCenterClientBuilder()
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
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
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
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
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT", "endpoint"))
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
}
