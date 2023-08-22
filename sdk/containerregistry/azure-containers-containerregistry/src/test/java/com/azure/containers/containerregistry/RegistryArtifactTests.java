// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry;

import com.azure.core.http.HttpClient;
import com.azure.core.test.TestMode;
import com.azure.core.test.http.AssertingHttpClientBuilder;
import com.azure.core.util.Context;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import reactor.test.StepVerifier;

import java.util.Arrays;

import static com.azure.containers.containerregistry.TestUtils.ALPINE_REPOSITORY_NAME;
import static com.azure.containers.containerregistry.TestUtils.HTTP_STATUS_CODE_202;
import static com.azure.containers.containerregistry.TestUtils.LATEST_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.SKIP_AUTH_TOKEN_REQUEST_FUNCTION;
import static com.azure.containers.containerregistry.TestUtils.V1_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V2_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V3_TAG_NAME;
import static com.azure.containers.containerregistry.TestUtils.V4_TAG_NAME;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Execution(ExecutionMode.SAME_THREAD)
public class RegistryArtifactTests extends ContainerRegistryClientsTestBase {
    private RegistryArtifactAsync asyncClient;
    private RegistryArtifact client;
    private HttpClient httpClient;
    private String digest;
    private boolean reupdateManifestProperties;
    private boolean reupdateTagProperties;
    private final String repositoryName = ALPINE_REPOSITORY_NAME;


    @BeforeEach
    void beforeEach() {
        TestUtils.importImage(
            getTestMode(),
            repositoryName,
            Arrays.asList(
                LATEST_TAG_NAME,
                V1_TAG_NAME,
                V2_TAG_NAME,
                V3_TAG_NAME,
                V4_TAG_NAME));

        if (getTestMode() == TestMode.PLAYBACK) {
            httpClient = interceptorManager.getPlaybackClient();
        } else {
            httpClient = HttpClient.createDefault();
        }
    }

    @AfterEach
    void afterEach() {
        if (getTestMode() == TestMode.PLAYBACK) {
            return;
        }

        if (reupdateManifestProperties) {
            client = getRegistryArtifactClient(digest);
            client.updateManifestProperties(defaultManifestProperties);
        }

        if (reupdateTagProperties) {
            client = getRegistryArtifactClient(digest);
            client.updateTagProperties(digest, defaultTagProperties);
        }
    }

    private HttpClient buildAsyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(httpClient)
            .skipRequest(SKIP_AUTH_TOKEN_REQUEST_FUNCTION)
            .assertAsync()
            .build();
    }

    private HttpClient buildSyncAssertingClient(HttpClient httpClient) {
        return new AssertingHttpClientBuilder(httpClient)
            .skipRequest(SKIP_AUTH_TOKEN_REQUEST_FUNCTION)
            .assertSync()
            .build();
    }

    private RegistryArtifactAsync getRegistryArtifactAsyncClient(String digest) {
        return getContainerRegistryBuilder(buildAsyncAssertingClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient))
            .buildAsyncClient()
            .getArtifact(repositoryName, digest);
    }

    private RegistryArtifact getRegistryArtifactClient(String digest) {
        return getContainerRegistryBuilder(buildSyncAssertingClient(httpClient == null ? interceptorManager.getPlaybackClient() : httpClient))
            .buildClient()
            .getArtifact(repositoryName, digest);
    }

    @Test
    public void delete() {
        client = getRegistryArtifactClient(V4_TAG_NAME);
        String digest = getChildArtifactDigest(client.getManifestProperties().getRelatedArtifacts());

        asyncClient = getRegistryArtifactAsyncClient(digest);
        StepVerifier.create(asyncClient.delete())
            .verifyComplete();

        StepVerifier.create(asyncClient.delete())
            .verifyComplete();
    }

    @Test
    public void deleteWithResponse() {
        client = getRegistryArtifactClient(V4_TAG_NAME);
        String digest = getChildArtifactDigest(client.getManifestProperties().getRelatedArtifacts());
        asyncClient = getRegistryArtifactAsyncClient(digest);

        StepVerifier.create(asyncClient.deleteWithResponse())
            .assertNext(res -> assertEquals(res.getStatusCode(), HTTP_STATUS_CODE_202))
            .verifyComplete();

        StepVerifier.create(asyncClient.deleteWithResponse())
            .assertNext(res -> assertEquals(res.getStatusCode(), HTTP_STATUS_CODE_202))
            .verifyComplete();
    }


    @Test
    public void deleteTag() {
        asyncClient = getRegistryArtifactAsyncClient(LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.deleteTag(V3_TAG_NAME))
            .verifyComplete();

        StepVerifier.create(asyncClient.deleteTag(V3_TAG_NAME))
            .verifyComplete();
    }

    @Test
    public void deleteTagWithResponse() {
        asyncClient = getRegistryArtifactAsyncClient(LATEST_TAG_NAME);

        StepVerifier.create(asyncClient.deleteTagWithResponse(V3_TAG_NAME))
            .assertNext(res -> assertEquals(res.getStatusCode(), HTTP_STATUS_CODE_202))
            .verifyComplete();

        StepVerifier.create(asyncClient.deleteTagWithResponse(V3_TAG_NAME))
            .assertNext(res -> assertEquals(res.getStatusCode(), HTTP_STATUS_CODE_202))
            .verifyComplete();
    }

    @Test
    public void deleteTagThrows() {
        client = getRegistryArtifactClient(V2_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(V2_TAG_NAME);

        StepVerifier.create(asyncClient.deleteTag(null))
            .expectError(NullPointerException.class)
            .verify();

        StepVerifier.create(asyncClient.deleteTag(""))
            .expectError(IllegalArgumentException.class)
            .verify();

        StepVerifier.create(asyncClient.deleteTagWithResponse(null))
            .expectError(NullPointerException.class)
            .verify();

        assertThrows(NullPointerException.class, () -> client.deleteTag(null));
        assertThrows(IllegalArgumentException.class, () -> client.deleteTag(""));
        assertThrows(NullPointerException.class, () -> client.deleteTagWithResponse(null, Context.NONE));
        assertThrows(IllegalArgumentException.class, () -> client.deleteTagWithResponse("", Context.NONE));
    }

    @Test
    public void updateManifestProperties() {
        client = getRegistryArtifactClient(V1_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(V1_TAG_NAME);

        reupdateManifestProperties = true;
        digest = V1_TAG_NAME;

        StepVerifier.create(asyncClient.updateManifestProperties(manifestWriteableProperties))
            .assertNext(this::validateManifestContentProperties)
            .verifyComplete();

        StepVerifier.create(asyncClient.updateManifestPropertiesWithResponse(manifestWriteableProperties))
            .assertNext(res -> validateManifestContentProperties(res.getValue()))
            .verifyComplete();

        validateManifestContentProperties(client.updateManifestProperties(manifestWriteableProperties));

        validateManifestContentProperties(client.updateManifestPropertiesWithResponse(manifestWriteableProperties, Context.NONE)
            .getValue());
    }

    @Test
    public void updateTagProperties() {
        client = getRegistryArtifactClient(V2_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(V2_TAG_NAME);

        digest = V2_TAG_NAME;
        reupdateTagProperties = true;

        StepVerifier.create(asyncClient.updateTagProperties(V2_TAG_NAME, tagWriteableProperties))
            .assertNext(this::validateTagContentProperties)
            .verifyComplete();

        StepVerifier.create(asyncClient.updateTagPropertiesWithResponse(V2_TAG_NAME, tagWriteableProperties))
            .assertNext(res -> validateTagContentProperties(res.getValue()))
            .verifyComplete();

        validateTagContentProperties(client.updateTagProperties(V2_TAG_NAME, tagWriteableProperties));

        validateTagContentProperties(client.updateTagPropertiesWithResponse(V2_TAG_NAME, tagWriteableProperties, Context.NONE)
            .getValue());
    }

    @Test
    public void updateTagPropertiesThrows() {
        client = getRegistryArtifactClient(V2_TAG_NAME);
        asyncClient = getRegistryArtifactAsyncClient(V2_TAG_NAME);

        StepVerifier.create(asyncClient.updateTagProperties(null, tagWriteableProperties))
            .verifyError(NullPointerException.class);

        StepVerifier.create(asyncClient.updateTagPropertiesWithResponse("", tagWriteableProperties))
            .verifyError(IllegalArgumentException.class);

        StepVerifier.create(asyncClient.updateTagProperties(LATEST_TAG_NAME, null))
            .verifyError(NullPointerException.class);

        assertThrows(NullPointerException.class, () -> client.updateTagProperties(null, tagWriteableProperties));
        assertThrows(IllegalArgumentException.class, () -> client.updateTagProperties("", tagWriteableProperties));
        assertThrows(NullPointerException.class, () -> client.updateTagProperties(LATEST_TAG_NAME, null));
    }

    @Test
    public void deleteSync() {
        client = getRegistryArtifactClient(V4_TAG_NAME);
        String digest = getChildArtifactDigest(client.getManifestProperties().getRelatedArtifacts());
        client = getRegistryArtifactClient(digest);
        client.delete();
    }

    @Test
    public void deleteWithResponseSync() {
        client = getRegistryArtifactClient(V4_TAG_NAME);
        String digest = getChildArtifactDigest(client.getManifestProperties().getRelatedArtifacts());
        client = getRegistryArtifactClient(digest);
        client.deleteWithResponse(Context.NONE);
    }

    @Test
    public void deleteTagSync() {
        client = getRegistryArtifactClient(LATEST_TAG_NAME);
        client.deleteTag(V3_TAG_NAME);
    }


    @Test
    public void deleteTagWithResponseSync() {
        client = getRegistryArtifactClient(LATEST_TAG_NAME);
        client.deleteTagWithResponse(V3_TAG_NAME, Context.NONE);
    }
}
