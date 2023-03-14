// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.CookiePolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.util.ClientOptions;
import com.azure.core.util.Configuration;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.builder.ClientBuilderUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.storage.file.share.models.ShareTokenIntent;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/** A builder for creating a new instance of the AzureFileStorage type. */
@ServiceClientBuilder(serviceClients = {AzureFileStorageImpl.class})
public final class AzureFileStorageImplBuilder
        implements HttpTrait<AzureFileStorageImplBuilder>, ConfigurationTrait<AzureFileStorageImplBuilder> {
    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private static final Map<String, String> PROPERTIES = new HashMap<>();

    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the AzureFileStorageImplBuilder. */
    @Generated
    public AzureFileStorageImplBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder pipeline(HttpPipeline pipeline) {
        this.pipeline = pipeline;
        return this;
    }

    /*
     * The HTTP client used to send the request.
     */
    @Generated private HttpClient httpClient;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder httpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    /*
     * The logging configuration for HTTP requests and responses.
     */
    @Generated private HttpLogOptions httpLogOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
        this.httpLogOptions = httpLogOptions;
        return this;
    }

    /*
     * The client options such as application ID and custom headers to set on a request.
     */
    @Generated private ClientOptions clientOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder clientOptions(ClientOptions clientOptions) {
        this.clientOptions = clientOptions;
        return this;
    }

    /*
     * The retry options to configure retry policy for failed requests.
     */
    @Generated private RetryOptions retryOptions;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder addPolicy(HttpPipelinePolicy customPolicy) {
        Objects.requireNonNull(customPolicy, "'customPolicy' cannot be null.");
        pipelinePolicies.add(customPolicy);
        return this;
    }

    /*
     * The configuration store that is used during construction of the service client.
     */
    @Generated private Configuration configuration;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public AzureFileStorageImplBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * Specifies the version of the operation to use for this request.
     */
    @Generated private String version;

    /**
     * Sets Specifies the version of the operation to use for this request.
     *
     * @param version the version value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder version(String version) {
        this.version = version;
        return this;
    }

    /*
     * Valid value is backup
     */
    @Generated private ShareTokenIntent fileRequestIntent;

    /**
     * Sets Valid value is backup.
     *
     * @param fileRequestIntent the fileRequestIntent value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder fileRequestIntent(ShareTokenIntent fileRequestIntent) {
        this.fileRequestIntent = fileRequestIntent;
        return this;
    }

    /*
     * The URL of the service account, share, directory or file that is the target of the desired operation.
     */
    @Generated private String url;

    /**
     * Sets The URL of the service account, share, directory or file that is the target of the desired operation.
     *
     * @param url the url value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder url(String url) {
        this.url = url;
        return this;
    }

    /*
     * If true, the trailing dot will not be trimmed from the target URI.
     */
    @Generated private boolean allowTrailingDot;

    /**
     * Sets If true, the trailing dot will not be trimmed from the target URI.
     *
     * @param allowTrailingDot the allowTrailingDot value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder allowTrailingDot(boolean allowTrailingDot) {
        this.allowTrailingDot = allowTrailingDot;
        return this;
    }

    /*
     * If true, the trailing dot will not be trimmed from the source URI.
     */
    @Generated private boolean allowSourceTrailingDot;

    /**
     * Sets If true, the trailing dot will not be trimmed from the source URI.
     *
     * @param allowSourceTrailingDot the allowSourceTrailingDot value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder allowSourceTrailingDot(boolean allowSourceTrailingDot) {
        this.allowSourceTrailingDot = allowSourceTrailingDot;
        return this;
    }

    /*
     * The serializer to serialize an object into a string
     */
    @Generated private SerializerAdapter serializerAdapter;

    /**
     * Sets The serializer to serialize an object into a string.
     *
     * @param serializerAdapter the serializerAdapter value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder serializerAdapter(SerializerAdapter serializerAdapter) {
        this.serializerAdapter = serializerAdapter;
        return this;
    }

    /*
     * The retry policy that will attempt to retry failed requests, if applicable.
     */
    @Generated private RetryPolicy retryPolicy;

    /**
     * Sets The retry policy that will attempt to retry failed requests, if applicable.
     *
     * @param retryPolicy the retryPolicy value.
     * @return the AzureFileStorageImplBuilder.
     */
    @Generated
    public AzureFileStorageImplBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of AzureFileStorageImpl with the provided parameters.
     *
     * @return an instance of AzureFileStorageImpl.
     */
    @Generated
    public AzureFileStorageImpl buildClient() {
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        String localVersion = (version != null) ? version : "2019-07-07";
        SerializerAdapter localSerializerAdapter =
                (serializerAdapter != null) ? serializerAdapter : JacksonAdapter.createDefaultSerializerAdapter();
        AzureFileStorageImpl client =
                new AzureFileStorageImpl(
                        localPipeline,
                        localSerializerAdapter,
                        localVersion,
                        fileRequestIntent,
                        url,
                        allowTrailingDot,
                        allowSourceTrailingDot);
        return client;
    }

    @Generated
    private HttpPipeline createHttpPipeline() {
        Configuration buildConfiguration =
                (configuration == null) ? Configuration.getGlobalConfiguration() : configuration;
        HttpLogOptions localHttpLogOptions = this.httpLogOptions == null ? new HttpLogOptions() : this.httpLogOptions;
        ClientOptions localClientOptions = this.clientOptions == null ? new ClientOptions() : this.clientOptions;
        List<HttpPipelinePolicy> policies = new ArrayList<>();
        String clientName = PROPERTIES.getOrDefault(SDK_NAME, "UnknownName");
        String clientVersion = PROPERTIES.getOrDefault(SDK_VERSION, "UnknownVersion");
        String applicationId = CoreUtils.getApplicationId(localClientOptions, localHttpLogOptions);
        policies.add(new UserAgentPolicy(applicationId, clientName, clientVersion, buildConfiguration));
        policies.add(new RequestIdPolicy());
        policies.add(new AddHeadersFromContextPolicy());
        HttpHeaders headers = new HttpHeaders();
        localClientOptions.getHeaders().forEach(header -> headers.set(header.getName(), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        policies.add(new CookiePolicy());
        policies.addAll(
                this.pipelinePolicies.stream()
                        .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                        .collect(Collectors.toList()));
        HttpPolicyProviders.addAfterRetryPolicies(policies);
        policies.add(new HttpLoggingPolicy(httpLogOptions));
        HttpPipeline httpPipeline =
                new HttpPipelineBuilder()
                        .policies(policies.toArray(new HttpPipelinePolicy[0]))
                        .httpClient(httpClient)
                        .clientOptions(localClientOptions)
                        .build();
        return httpPipeline;
    }
}
