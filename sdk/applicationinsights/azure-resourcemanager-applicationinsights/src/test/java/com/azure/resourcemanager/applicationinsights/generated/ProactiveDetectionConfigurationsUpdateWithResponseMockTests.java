// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.HttpResponse;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.resourcemanager.applicationinsights.ApplicationInsightsManager;
import com.azure.resourcemanager.applicationinsights.fluent.models.ApplicationInsightsComponentProactiveDetectionConfigurationInner;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentProactiveDetectionConfiguration;
import com.azure.resourcemanager.applicationinsights.models.ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public final class ProactiveDetectionConfigurationsUpdateWithResponseMockTests {
    @Test
    public void testUpdateWithResponse() throws Exception {
        HttpClient httpClient = Mockito.mock(HttpClient.class);
        HttpResponse httpResponse = Mockito.mock(HttpResponse.class);
        ArgumentCaptor<HttpRequest> httpRequest = ArgumentCaptor.forClass(HttpRequest.class);

        String responseStr =
            "{\"Name\":\"kxn\",\"Enabled\":false,\"SendEmailsToSubscriptionOwners\":false,\"CustomEmails\":[\"vudtjuewbcihx\",\"uwhcjyxccybv\",\"ayakkudzpx\"],\"LastUpdatedTime\":\"jplmagstcy\",\"RuleDefinitions\":{\"Name\":\"fkyrk\",\"DisplayName\":\"dg\",\"Description\":\"gsj\",\"HelpUrl\":\"nwqjnoba\",\"IsHidden\":false,\"IsEnabledByDefault\":false,\"IsInPreview\":true,\"SupportsEmailNotifications\":true}}";

        Mockito.when(httpResponse.getStatusCode()).thenReturn(200);
        Mockito.when(httpResponse.getHeaders()).thenReturn(new HttpHeaders());
        Mockito
            .when(httpResponse.getBody())
            .thenReturn(Flux.just(ByteBuffer.wrap(responseStr.getBytes(StandardCharsets.UTF_8))));
        Mockito
            .when(httpResponse.getBodyAsByteArray())
            .thenReturn(Mono.just(responseStr.getBytes(StandardCharsets.UTF_8)));
        Mockito
            .when(httpClient.send(httpRequest.capture(), Mockito.any()))
            .thenReturn(
                Mono
                    .defer(
                        () -> {
                            Mockito.when(httpResponse.getRequest()).thenReturn(httpRequest.getValue());
                            return Mono.just(httpResponse);
                        }));

        ApplicationInsightsManager manager =
            ApplicationInsightsManager
                .configure()
                .withHttpClient(httpClient)
                .authenticate(
                    tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                    new AzureProfile("", "", AzureEnvironment.AZURE));

        ApplicationInsightsComponentProactiveDetectionConfiguration response =
            manager
                .proactiveDetectionConfigurations()
                .updateWithResponse(
                    "pjui",
                    "av",
                    "k",
                    new ApplicationInsightsComponentProactiveDetectionConfigurationInner()
                        .withName("zfvazi")
                        .withEnabled(false)
                        .withSendEmailsToSubscriptionOwners(true)
                        .withCustomEmails(Arrays.asList("tbajlkatn", "xyiopidkqqfku"))
                        .withLastUpdatedTime("cxkdmligovi")
                        .withRuleDefinitions(
                            new ApplicationInsightsComponentProactiveDetectionConfigurationRuleDefinitions()
                                .withName("kpmloa")
                                .withDisplayName("ruocbgo")
                                .withDescription("bteoybf")
                                .withHelpUrl("xakvvjgslor")
                                .withIsHidden(true)
                                .withIsEnabledByDefault(false)
                                .withIsInPreview(false)
                                .withSupportsEmailNotifications(false)),
                    com.azure.core.util.Context.NONE)
                .getValue();

        Assertions.assertEquals("kxn", response.name());
        Assertions.assertEquals(false, response.enabled());
        Assertions.assertEquals(false, response.sendEmailsToSubscriptionOwners());
        Assertions.assertEquals("vudtjuewbcihx", response.customEmails().get(0));
        Assertions.assertEquals("jplmagstcy", response.lastUpdatedTime());
        Assertions.assertEquals("fkyrk", response.ruleDefinitions().name());
        Assertions.assertEquals("dg", response.ruleDefinitions().displayName());
        Assertions.assertEquals("gsj", response.ruleDefinitions().description());
        Assertions.assertEquals("nwqjnoba", response.ruleDefinitions().helpUrl());
        Assertions.assertEquals(false, response.ruleDefinitions().isHidden());
        Assertions.assertEquals(false, response.ruleDefinitions().isEnabledByDefault());
        Assertions.assertEquals(true, response.ruleDefinitions().isInPreview());
        Assertions.assertEquals(true, response.ruleDefinitions().supportsEmailNotifications());
    }
}
