// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.compute.batch;

import com.azure.compute.batch.auth.BatchSharedKeyCredentials;
import com.azure.compute.batch.auth.BatchSharedKeyCredentialsPolicy;
import com.azure.compute.batch.implementation.BatchServiceClientImpl;
import com.azure.core.annotation.Generated;
import com.azure.core.annotation.ServiceClientBuilder;
import com.azure.core.client.traits.ConfigurationTrait;
import com.azure.core.client.traits.EndpointTrait;
import com.azure.core.client.traits.HttpTrait;
import com.azure.core.client.traits.TokenCredentialTrait;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.*;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.AddHeadersPolicy;
import com.azure.core.http.policy.BearerTokenAuthenticationPolicy;
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
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.JacksonAdapter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/** A builder for creating a new instance of the BatchServiceClient type. */
@ServiceClientBuilder(
        serviceClients = {
            ApplicationsClient.class,
            PoolClient.class,
            AccountClient.class,
            JobClient.class,
            CertificatesClient.class,
            JobScheduleClient.class,
            TaskClient.class,
            BatchNodesClient.class,
            ApplicationsAsyncClient.class,
            PoolAsyncClient.class,
            AccountAsyncClient.class,
            JobAsyncClient.class,
            CertificatesAsyncClient.class,
            JobScheduleAsyncClient.class,
            TaskAsyncClient.class,
            BatchNodesAsyncClient.class
        })
public final class BatchServiceClientBuilder
        implements HttpTrait<BatchServiceClientBuilder>,
                ConfigurationTrait<BatchServiceClientBuilder>,
                TokenCredentialTrait<BatchServiceClientBuilder>,
                EndpointTrait<BatchServiceClientBuilder> {

    @Generated private static final String SDK_NAME = "name";

    @Generated private static final String SDK_VERSION = "version";

    @Generated private static final String[] DEFAULT_SCOPES = new String[] {"https://batch.core.windows.net//.default"};

    @Generated
    private static final Map<String, String> PROPERTIES = CoreUtils.getProperties("azure-compute-batch.properties");

    @Generated private final List<HttpPipelinePolicy> pipelinePolicies;

    /** Create an instance of the BatchServiceClientBuilder. */
    @Generated
    public BatchServiceClientBuilder() {
        this.pipelinePolicies = new ArrayList<>();
    }

    /*
     * The HTTP pipeline to send requests through.
     */
    @Generated private HttpPipeline pipeline;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public BatchServiceClientBuilder pipeline(HttpPipeline pipeline) {
        if (this.pipeline != null && pipeline == null) {
            LOGGER.info("HttpPipeline is being set to 'null' when it was previously configured.");
        }
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
    public BatchServiceClientBuilder httpClient(HttpClient httpClient) {
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
    public BatchServiceClientBuilder httpLogOptions(HttpLogOptions httpLogOptions) {
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
    public BatchServiceClientBuilder clientOptions(ClientOptions clientOptions) {
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
    public BatchServiceClientBuilder retryOptions(RetryOptions retryOptions) {
        this.retryOptions = retryOptions;
        return this;
    }

    /** {@inheritDoc}. */
    @Generated
    @Override
    public BatchServiceClientBuilder addPolicy(HttpPipelinePolicy customPolicy) {
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
    public BatchServiceClientBuilder configuration(Configuration configuration) {
        this.configuration = configuration;
        return this;
    }

    /*
     * The TokenCredential used for authentication.
     */
    @Generated private TokenCredential tokenCredential;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public BatchServiceClientBuilder credential(TokenCredential tokenCredential) {
        this.tokenCredential = tokenCredential;
        return this;
    }

    private BatchSharedKeyCredentials batchSharedKeyCred;

    public BatchServiceClientBuilder credential(BatchSharedKeyCredentials batchSharedKeyCred) {
        this.batchSharedKeyCred = Objects.requireNonNull(batchSharedKeyCred, "'batchSharedKeyCred' cannot be null.");
        this.tokenCredential = null;
        return this;
    }

    /*
     * The service endpoint
     */
    @Generated private String endpoint;

    /** {@inheritDoc}. */
    @Generated
    @Override
    public BatchServiceClientBuilder endpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    /*
     * Service version
     */
    @Generated private BatchServiceVersion serviceVersion;

    /**
     * Sets Service version.
     *
     * @param serviceVersion the serviceVersion value.
     * @return the BatchServiceClientBuilder.
     */
    @Generated
    public BatchServiceClientBuilder serviceVersion(BatchServiceVersion serviceVersion) {
        this.serviceVersion = serviceVersion;
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
     * @return the BatchServiceClientBuilder.
     */
    @Generated
    public BatchServiceClientBuilder retryPolicy(RetryPolicy retryPolicy) {
        this.retryPolicy = retryPolicy;
        return this;
    }

    /**
     * Builds an instance of BatchServiceClientImpl with the provided parameters.
     *
     * @return an instance of BatchServiceClientImpl.
     */
    @Generated
    private BatchServiceClientImpl buildInnerClient() {
        HttpPipeline localPipeline = (pipeline != null) ? pipeline : createHttpPipeline();
        BatchServiceVersion localServiceVersion =
                (serviceVersion != null) ? serviceVersion : BatchServiceVersion.getLatest();
        BatchServiceClientImpl client =
                new BatchServiceClientImpl(
                        localPipeline, JacksonAdapter.createDefaultSerializerAdapter(), endpoint, localServiceVersion);
        return client;
    }

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
        localClientOptions
                .getHeaders()
                .forEach(header -> headers.set(HttpHeaderName.fromString(header.getName()), header.getValue()));
        if (headers.getSize() > 0) {
            policies.add(new AddHeadersPolicy(headers));
        }
        this.pipelinePolicies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .forEach(p -> policies.add(p));
        HttpPolicyProviders.addBeforeRetryPolicies(policies);
        policies.add(ClientBuilderUtil.validateAndGetRetryPolicy(retryPolicy, retryOptions, new RetryPolicy()));
        policies.add(new AddDatePolicy());
        policies.add(new CookiePolicy());
        if (tokenCredential != null) {
            policies.add(new BearerTokenAuthenticationPolicy(tokenCredential, DEFAULT_SCOPES));
        } else if (batchSharedKeyCred != null) {
            policies.add(new BatchSharedKeyCredentialsPolicy(batchSharedKeyCred));
        }
        this.pipelinePolicies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY)
                .forEach(p -> policies.add(p));
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

    /**
     * Builds an instance of ApplicationsAsyncClient class.
     *
     * @return an instance of ApplicationsAsyncClient.
     */
    @Generated
    public ApplicationsAsyncClient buildApplicationsAsyncClient() {
        return new ApplicationsAsyncClient(buildInnerClient().getApplications());
    }

    /**
     * Builds an instance of PoolAsyncClient class.
     *
     * @return an instance of PoolAsyncClient.
     */
    @Generated
    public PoolAsyncClient buildPoolAsyncClient() {
        return new PoolAsyncClient(buildInnerClient().getPools());
    }

    /**
     * Builds an instance of AccountAsyncClient class.
     *
     * @return an instance of AccountAsyncClient.
     */
    @Generated
    public AccountAsyncClient buildAccountAsyncClient() {
        return new AccountAsyncClient(buildInnerClient().getAccounts());
    }

    /**
     * Builds an instance of JobAsyncClient class.
     *
     * @return an instance of JobAsyncClient.
     */
    @Generated
    public JobAsyncClient buildJobAsyncClient() {
        return new JobAsyncClient(buildInnerClient().getJobs());
    }

    /**
     * Builds an instance of CertificatesAsyncClient class.
     *
     * @return an instance of CertificatesAsyncClient.
     */
    @Generated
    public CertificatesAsyncClient buildCertificatesAsyncClient() {
        return new CertificatesAsyncClient(buildInnerClient().getCertificates());
    }

    /**
     * Builds an instance of JobScheduleAsyncClient class.
     *
     * @return an instance of JobScheduleAsyncClient.
     */
    @Generated
    public JobScheduleAsyncClient buildJobScheduleAsyncClient() {
        return new JobScheduleAsyncClient(buildInnerClient().getJobSchedules());
    }

    /**
     * Builds an instance of TaskAsyncClient class.
     *
     * @return an instance of TaskAsyncClient.
     */
    @Generated
    public TaskAsyncClient buildTaskAsyncClient() {
        return new TaskAsyncClient(buildInnerClient().getTasks());
    }

    /**
     * Builds an instance of BatchNodesAsyncClient class.
     *
     * @return an instance of BatchNodesAsyncClient.
     */
    @Generated
    public BatchNodesAsyncClient buildBatchNodesAsyncClient() {
        return new BatchNodesAsyncClient(buildInnerClient().getBatchNodes());
    }

    /**
     * Builds an instance of ApplicationsClient class.
     *
     * @return an instance of ApplicationsClient.
     */
    @Generated
    public ApplicationsClient buildApplicationsClient() {
        return new ApplicationsClient(buildInnerClient().getApplications());
    }

    /**
     * Builds an instance of PoolClient class.
     *
     * @return an instance of PoolClient.
     */
    @Generated
    public PoolClient buildPoolClient() {
        return new PoolClient(buildInnerClient().getPools());
    }

    /**
     * Builds an instance of AccountClient class.
     *
     * @return an instance of AccountClient.
     */
    @Generated
    public AccountClient buildAccountClient() {
        return new AccountClient(buildInnerClient().getAccounts());
    }

    /**
     * Builds an instance of JobClient class.
     *
     * @return an instance of JobClient.
     */
    @Generated
    public JobClient buildJobClient() {
        return new JobClient(buildInnerClient().getJobs());
    }

    /**
     * Builds an instance of CertificatesClient class.
     *
     * @return an instance of CertificatesClient.
     */
    @Generated
    public CertificatesClient buildCertificatesClient() {
        return new CertificatesClient(buildInnerClient().getCertificates());
    }

    /**
     * Builds an instance of JobScheduleClient class.
     *
     * @return an instance of JobScheduleClient.
     */
    @Generated
    public JobScheduleClient buildJobScheduleClient() {
        return new JobScheduleClient(buildInnerClient().getJobSchedules());
    }

    /**
     * Builds an instance of TaskClient class.
     *
     * @return an instance of TaskClient.
     */
    @Generated
    public TaskClient buildTaskClient() {
        return new TaskClient(buildInnerClient().getTasks());
    }

    /**
     * Builds an instance of BatchNodesClient class.
     *
     * @return an instance of BatchNodesClient.
     */
    @Generated
    public BatchNodesClient buildBatchNodesClient() {
        return new BatchNodesClient(buildInnerClient().getBatchNodes());
    }

    private static final ClientLogger LOGGER = new ClientLogger(BatchServiceClientBuilder.class);
}
