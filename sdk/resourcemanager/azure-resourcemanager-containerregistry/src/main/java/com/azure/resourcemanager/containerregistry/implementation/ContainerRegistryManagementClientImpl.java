// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.containerregistry.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.resourcemanager.containerregistry.fluent.ContainerRegistryManagementClient;
import com.azure.resourcemanager.containerregistry.fluent.OperationsClient;
import com.azure.resourcemanager.containerregistry.fluent.RegistriesClient;
import com.azure.resourcemanager.containerregistry.fluent.ReplicationsClient;
import com.azure.resourcemanager.containerregistry.fluent.RunsClient;
import com.azure.resourcemanager.containerregistry.fluent.TasksClient;
import com.azure.resourcemanager.containerregistry.fluent.WebhooksClient;
import com.azure.resourcemanager.resources.fluentcore.AzureServiceClient;
import java.time.Duration;

/** Initializes a new instance of the ContainerRegistryManagementClientImpl type. */
@ServiceClient(builder = ContainerRegistryManagementClientBuilder.class)
public final class ContainerRegistryManagementClientImpl extends AzureServiceClient
    implements ContainerRegistryManagementClient {
    private final ClientLogger logger = new ClientLogger(ContainerRegistryManagementClientImpl.class);

    /** The Microsoft Azure subscription ID. */
    private final String subscriptionId;

    /**
     * Gets The Microsoft Azure subscription ID.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The RegistriesClient object to access its operations. */
    private final RegistriesClient registries;

    /**
     * Gets the RegistriesClient object to access its operations.
     *
     * @return the RegistriesClient object.
     */
    public RegistriesClient getRegistries() {
        return this.registries;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /** The ReplicationsClient object to access its operations. */
    private final ReplicationsClient replications;

    /**
     * Gets the ReplicationsClient object to access its operations.
     *
     * @return the ReplicationsClient object.
     */
    public ReplicationsClient getReplications() {
        return this.replications;
    }

    /** The WebhooksClient object to access its operations. */
    private final WebhooksClient webhooks;

    /**
     * Gets the WebhooksClient object to access its operations.
     *
     * @return the WebhooksClient object.
     */
    public WebhooksClient getWebhooks() {
        return this.webhooks;
    }

    /** The RunsClient object to access its operations. */
    private final RunsClient runs;

    /**
     * Gets the RunsClient object to access its operations.
     *
     * @return the RunsClient object.
     */
    public RunsClient getRuns() {
        return this.runs;
    }

    /** The TasksClient object to access its operations. */
    private final TasksClient tasks;

    /**
     * Gets the TasksClient object to access its operations.
     *
     * @return the TasksClient object.
     */
    public TasksClient getTasks() {
        return this.tasks;
    }

    /**
     * Initializes an instance of ContainerRegistryManagementClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The Microsoft Azure subscription ID.
     * @param endpoint server parameter.
     */
    ContainerRegistryManagementClientImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        super(httpPipeline, serializerAdapter, environment);
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.registries = new RegistriesClientImpl(this);
        this.operations = new OperationsClientImpl(this);
        this.replications = new ReplicationsClientImpl(this);
        this.webhooks = new WebhooksClientImpl(this);
        this.runs = new RunsClientImpl(this);
        this.tasks = new TasksClientImpl(this);
    }
}
