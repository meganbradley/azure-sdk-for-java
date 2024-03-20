// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers;

import com.azure.core.credential.TokenCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.HttpPipelinePosition;
import com.azure.core.http.policy.AddDatePolicy;
import com.azure.core.http.policy.AddHeadersFromContextPolicy;
import com.azure.core.http.policy.HttpLogOptions;
import com.azure.core.http.policy.HttpLoggingPolicy;
import com.azure.core.http.policy.HttpPipelinePolicy;
import com.azure.core.http.policy.HttpPolicyProviders;
import com.azure.core.http.policy.RequestIdPolicy;
import com.azure.core.http.policy.RetryOptions;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.management.http.policy.ArmChallengeAuthenticationPolicy;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.util.Configuration;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.appcontainers.fluent.ContainerAppsApiClient;
import com.azure.resourcemanager.appcontainers.implementation.AppResilienciesImpl;
import com.azure.resourcemanager.appcontainers.implementation.AvailableWorkloadProfilesImpl;
import com.azure.resourcemanager.appcontainers.implementation.BillingMetersImpl;
import com.azure.resourcemanager.appcontainers.implementation.BuildAuthTokensImpl;
import com.azure.resourcemanager.appcontainers.implementation.BuildersImpl;
import com.azure.resourcemanager.appcontainers.implementation.BuildsByBuilderResourcesImpl;
import com.azure.resourcemanager.appcontainers.implementation.BuildsImpl;
import com.azure.resourcemanager.appcontainers.implementation.CertificatesImpl;
import com.azure.resourcemanager.appcontainers.implementation.ConnectedEnvironmentsCertificatesImpl;
import com.azure.resourcemanager.appcontainers.implementation.ConnectedEnvironmentsDaprComponentsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ConnectedEnvironmentsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ConnectedEnvironmentsStoragesImpl;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsApiClientBuilder;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsAuthConfigsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsDiagnosticsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsRevisionReplicasImpl;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsRevisionsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ContainerAppsSourceControlsImpl;
import com.azure.resourcemanager.appcontainers.implementation.DaprComponentResiliencyPoliciesImpl;
import com.azure.resourcemanager.appcontainers.implementation.DaprComponentsImpl;
import com.azure.resourcemanager.appcontainers.implementation.DaprSubscriptionsImpl;
import com.azure.resourcemanager.appcontainers.implementation.DotNetComponentsImpl;
import com.azure.resourcemanager.appcontainers.implementation.JavaComponentsImpl;
import com.azure.resourcemanager.appcontainers.implementation.JobsExecutionsImpl;
import com.azure.resourcemanager.appcontainers.implementation.JobsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ManagedCertificatesImpl;
import com.azure.resourcemanager.appcontainers.implementation.ManagedEnvironmentDiagnosticsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ManagedEnvironmentUsagesImpl;
import com.azure.resourcemanager.appcontainers.implementation.ManagedEnvironmentsDiagnosticsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ManagedEnvironmentsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ManagedEnvironmentsStoragesImpl;
import com.azure.resourcemanager.appcontainers.implementation.NamespacesImpl;
import com.azure.resourcemanager.appcontainers.implementation.OperationsImpl;
import com.azure.resourcemanager.appcontainers.implementation.ResourceProvidersImpl;
import com.azure.resourcemanager.appcontainers.implementation.UsagesImpl;
import com.azure.resourcemanager.appcontainers.models.AppResiliencies;
import com.azure.resourcemanager.appcontainers.models.AvailableWorkloadProfiles;
import com.azure.resourcemanager.appcontainers.models.BillingMeters;
import com.azure.resourcemanager.appcontainers.models.BuildAuthTokens;
import com.azure.resourcemanager.appcontainers.models.Builders;
import com.azure.resourcemanager.appcontainers.models.Builds;
import com.azure.resourcemanager.appcontainers.models.BuildsByBuilderResources;
import com.azure.resourcemanager.appcontainers.models.Certificates;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironments;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentsCertificates;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentsDaprComponents;
import com.azure.resourcemanager.appcontainers.models.ConnectedEnvironmentsStorages;
import com.azure.resourcemanager.appcontainers.models.ContainerApps;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsAuthConfigs;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsDiagnostics;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsRevisionReplicas;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsRevisions;
import com.azure.resourcemanager.appcontainers.models.ContainerAppsSourceControls;
import com.azure.resourcemanager.appcontainers.models.DaprComponentResiliencyPolicies;
import com.azure.resourcemanager.appcontainers.models.DaprComponents;
import com.azure.resourcemanager.appcontainers.models.DaprSubscriptions;
import com.azure.resourcemanager.appcontainers.models.DotNetComponents;
import com.azure.resourcemanager.appcontainers.models.JavaComponents;
import com.azure.resourcemanager.appcontainers.models.Jobs;
import com.azure.resourcemanager.appcontainers.models.JobsExecutions;
import com.azure.resourcemanager.appcontainers.models.ManagedCertificates;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentDiagnostics;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentUsages;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironments;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentsDiagnostics;
import com.azure.resourcemanager.appcontainers.models.ManagedEnvironmentsStorages;
import com.azure.resourcemanager.appcontainers.models.Namespaces;
import com.azure.resourcemanager.appcontainers.models.Operations;
import com.azure.resourcemanager.appcontainers.models.ResourceProviders;
import com.azure.resourcemanager.appcontainers.models.Usages;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Entry point to ContainerAppsApiManager.
 */
public final class ContainerAppsApiManager {
    private AppResiliencies appResiliencies;

    private ContainerAppsAuthConfigs containerAppsAuthConfigs;

    private AvailableWorkloadProfiles availableWorkloadProfiles;

    private BillingMeters billingMeters;

    private Builders builders;

    private BuildsByBuilderResources buildsByBuilderResources;

    private Builds builds;

    private BuildAuthTokens buildAuthTokens;

    private ConnectedEnvironments connectedEnvironments;

    private ConnectedEnvironmentsCertificates connectedEnvironmentsCertificates;

    private ConnectedEnvironmentsDaprComponents connectedEnvironmentsDaprComponents;

    private ConnectedEnvironmentsStorages connectedEnvironmentsStorages;

    private ContainerApps containerApps;

    private ContainerAppsRevisions containerAppsRevisions;

    private ContainerAppsRevisionReplicas containerAppsRevisionReplicas;

    private ContainerAppsDiagnostics containerAppsDiagnostics;

    private ManagedEnvironmentDiagnostics managedEnvironmentDiagnostics;

    private ManagedEnvironmentsDiagnostics managedEnvironmentsDiagnostics;

    private Jobs jobs;

    private Operations operations;

    private JobsExecutions jobsExecutions;

    private ResourceProviders resourceProviders;

    private ManagedEnvironments managedEnvironments;

    private Certificates certificates;

    private ManagedCertificates managedCertificates;

    private Namespaces namespaces;

    private DaprComponentResiliencyPolicies daprComponentResiliencyPolicies;

    private DaprComponents daprComponents;

    private DaprSubscriptions daprSubscriptions;

    private ManagedEnvironmentsStorages managedEnvironmentsStorages;

    private ContainerAppsSourceControls containerAppsSourceControls;

    private Usages usages;

    private ManagedEnvironmentUsages managedEnvironmentUsages;

    private JavaComponents javaComponents;

    private DotNetComponents dotNetComponents;

    private final ContainerAppsApiClient clientObject;

    private ContainerAppsApiManager(HttpPipeline httpPipeline, AzureProfile profile, Duration defaultPollInterval) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        this.clientObject = new ContainerAppsApiClientBuilder().pipeline(httpPipeline)
            .endpoint(profile.getEnvironment().getResourceManagerEndpoint()).subscriptionId(profile.getSubscriptionId())
            .defaultPollInterval(defaultPollInterval).buildClient();
    }

    /**
     * Creates an instance of ContainerAppsApi service API entry point.
     * 
     * @param credential the credential to use.
     * @param profile the Azure profile for client.
     * @return the ContainerAppsApi service API instance.
     */
    public static ContainerAppsApiManager authenticate(TokenCredential credential, AzureProfile profile) {
        Objects.requireNonNull(credential, "'credential' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return configure().authenticate(credential, profile);
    }

    /**
     * Creates an instance of ContainerAppsApi service API entry point.
     * 
     * @param httpPipeline the {@link HttpPipeline} configured with Azure authentication credential.
     * @param profile the Azure profile for client.
     * @return the ContainerAppsApi service API instance.
     */
    public static ContainerAppsApiManager authenticate(HttpPipeline httpPipeline, AzureProfile profile) {
        Objects.requireNonNull(httpPipeline, "'httpPipeline' cannot be null.");
        Objects.requireNonNull(profile, "'profile' cannot be null.");
        return new ContainerAppsApiManager(httpPipeline, profile, null);
    }

    /**
     * Gets a Configurable instance that can be used to create ContainerAppsApiManager with optional configuration.
     * 
     * @return the Configurable instance allowing configurations.
     */
    public static Configurable configure() {
        return new ContainerAppsApiManager.Configurable();
    }

    /**
     * The Configurable allowing configurations to be set.
     */
    public static final class Configurable {
        private static final ClientLogger LOGGER = new ClientLogger(Configurable.class);

        private HttpClient httpClient;
        private HttpLogOptions httpLogOptions;
        private final List<HttpPipelinePolicy> policies = new ArrayList<>();
        private final List<String> scopes = new ArrayList<>();
        private RetryPolicy retryPolicy;
        private RetryOptions retryOptions;
        private Duration defaultPollInterval;

        private Configurable() {
        }

        /**
         * Sets the http client.
         *
         * @param httpClient the HTTP client.
         * @return the configurable object itself.
         */
        public Configurable withHttpClient(HttpClient httpClient) {
            this.httpClient = Objects.requireNonNull(httpClient, "'httpClient' cannot be null.");
            return this;
        }

        /**
         * Sets the logging options to the HTTP pipeline.
         *
         * @param httpLogOptions the HTTP log options.
         * @return the configurable object itself.
         */
        public Configurable withLogOptions(HttpLogOptions httpLogOptions) {
            this.httpLogOptions = Objects.requireNonNull(httpLogOptions, "'httpLogOptions' cannot be null.");
            return this;
        }

        /**
         * Adds the pipeline policy to the HTTP pipeline.
         *
         * @param policy the HTTP pipeline policy.
         * @return the configurable object itself.
         */
        public Configurable withPolicy(HttpPipelinePolicy policy) {
            this.policies.add(Objects.requireNonNull(policy, "'policy' cannot be null."));
            return this;
        }

        /**
         * Adds the scope to permission sets.
         *
         * @param scope the scope.
         * @return the configurable object itself.
         */
        public Configurable withScope(String scope) {
            this.scopes.add(Objects.requireNonNull(scope, "'scope' cannot be null."));
            return this;
        }

        /**
         * Sets the retry policy to the HTTP pipeline.
         *
         * @param retryPolicy the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryPolicy(RetryPolicy retryPolicy) {
            this.retryPolicy = Objects.requireNonNull(retryPolicy, "'retryPolicy' cannot be null.");
            return this;
        }

        /**
         * Sets the retry options for the HTTP pipeline retry policy.
         * <p>
         * This setting has no effect, if retry policy is set via {@link #withRetryPolicy(RetryPolicy)}.
         *
         * @param retryOptions the retry options for the HTTP pipeline retry policy.
         * @return the configurable object itself.
         */
        public Configurable withRetryOptions(RetryOptions retryOptions) {
            this.retryOptions = Objects.requireNonNull(retryOptions, "'retryOptions' cannot be null.");
            return this;
        }

        /**
         * Sets the default poll interval, used when service does not provide "Retry-After" header.
         *
         * @param defaultPollInterval the default poll interval.
         * @return the configurable object itself.
         */
        public Configurable withDefaultPollInterval(Duration defaultPollInterval) {
            this.defaultPollInterval
                = Objects.requireNonNull(defaultPollInterval, "'defaultPollInterval' cannot be null.");
            if (this.defaultPollInterval.isNegative()) {
                throw LOGGER
                    .logExceptionAsError(new IllegalArgumentException("'defaultPollInterval' cannot be negative"));
            }
            return this;
        }

        /**
         * Creates an instance of ContainerAppsApi service API entry point.
         *
         * @param credential the credential to use.
         * @param profile the Azure profile for client.
         * @return the ContainerAppsApi service API instance.
         */
        public ContainerAppsApiManager authenticate(TokenCredential credential, AzureProfile profile) {
            Objects.requireNonNull(credential, "'credential' cannot be null.");
            Objects.requireNonNull(profile, "'profile' cannot be null.");

            StringBuilder userAgentBuilder = new StringBuilder();
            userAgentBuilder.append("azsdk-java").append("-").append("com.azure.resourcemanager.appcontainers")
                .append("/").append("1.0.0-beta.7");
            if (!Configuration.getGlobalConfiguration().get("AZURE_TELEMETRY_DISABLED", false)) {
                userAgentBuilder.append(" (").append(Configuration.getGlobalConfiguration().get("java.version"))
                    .append("; ").append(Configuration.getGlobalConfiguration().get("os.name")).append("; ")
                    .append(Configuration.getGlobalConfiguration().get("os.version")).append("; auto-generated)");
            } else {
                userAgentBuilder.append(" (auto-generated)");
            }

            if (scopes.isEmpty()) {
                scopes.add(profile.getEnvironment().getManagementEndpoint() + "/.default");
            }
            if (retryPolicy == null) {
                if (retryOptions != null) {
                    retryPolicy = new RetryPolicy(retryOptions);
                } else {
                    retryPolicy = new RetryPolicy("Retry-After", ChronoUnit.SECONDS);
                }
            }
            List<HttpPipelinePolicy> policies = new ArrayList<>();
            policies.add(new UserAgentPolicy(userAgentBuilder.toString()));
            policies.add(new AddHeadersFromContextPolicy());
            policies.add(new RequestIdPolicy());
            policies.addAll(this.policies.stream().filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_CALL)
                .collect(Collectors.toList()));
            HttpPolicyProviders.addBeforeRetryPolicies(policies);
            policies.add(retryPolicy);
            policies.add(new AddDatePolicy());
            policies.add(new ArmChallengeAuthenticationPolicy(credential, scopes.toArray(new String[0])));
            policies.addAll(this.policies.stream()
                .filter(p -> p.getPipelinePosition() == HttpPipelinePosition.PER_RETRY).collect(Collectors.toList()));
            HttpPolicyProviders.addAfterRetryPolicies(policies);
            policies.add(new HttpLoggingPolicy(httpLogOptions));
            HttpPipeline httpPipeline = new HttpPipelineBuilder().httpClient(httpClient)
                .policies(policies.toArray(new HttpPipelinePolicy[0])).build();
            return new ContainerAppsApiManager(httpPipeline, profile, defaultPollInterval);
        }
    }

    /**
     * Gets the resource collection API of AppResiliencies. It manages AppResiliency.
     * 
     * @return Resource collection API of AppResiliencies.
     */
    public AppResiliencies appResiliencies() {
        if (this.appResiliencies == null) {
            this.appResiliencies = new AppResilienciesImpl(clientObject.getAppResiliencies(), this);
        }
        return appResiliencies;
    }

    /**
     * Gets the resource collection API of ContainerAppsAuthConfigs. It manages AuthConfig.
     * 
     * @return Resource collection API of ContainerAppsAuthConfigs.
     */
    public ContainerAppsAuthConfigs containerAppsAuthConfigs() {
        if (this.containerAppsAuthConfigs == null) {
            this.containerAppsAuthConfigs
                = new ContainerAppsAuthConfigsImpl(clientObject.getContainerAppsAuthConfigs(), this);
        }
        return containerAppsAuthConfigs;
    }

    /**
     * Gets the resource collection API of AvailableWorkloadProfiles.
     * 
     * @return Resource collection API of AvailableWorkloadProfiles.
     */
    public AvailableWorkloadProfiles availableWorkloadProfiles() {
        if (this.availableWorkloadProfiles == null) {
            this.availableWorkloadProfiles
                = new AvailableWorkloadProfilesImpl(clientObject.getAvailableWorkloadProfiles(), this);
        }
        return availableWorkloadProfiles;
    }

    /**
     * Gets the resource collection API of BillingMeters.
     * 
     * @return Resource collection API of BillingMeters.
     */
    public BillingMeters billingMeters() {
        if (this.billingMeters == null) {
            this.billingMeters = new BillingMetersImpl(clientObject.getBillingMeters(), this);
        }
        return billingMeters;
    }

    /**
     * Gets the resource collection API of Builders. It manages BuilderResource.
     * 
     * @return Resource collection API of Builders.
     */
    public Builders builders() {
        if (this.builders == null) {
            this.builders = new BuildersImpl(clientObject.getBuilders(), this);
        }
        return builders;
    }

    /**
     * Gets the resource collection API of BuildsByBuilderResources.
     * 
     * @return Resource collection API of BuildsByBuilderResources.
     */
    public BuildsByBuilderResources buildsByBuilderResources() {
        if (this.buildsByBuilderResources == null) {
            this.buildsByBuilderResources
                = new BuildsByBuilderResourcesImpl(clientObject.getBuildsByBuilderResources(), this);
        }
        return buildsByBuilderResources;
    }

    /**
     * Gets the resource collection API of Builds. It manages BuildResource.
     * 
     * @return Resource collection API of Builds.
     */
    public Builds builds() {
        if (this.builds == null) {
            this.builds = new BuildsImpl(clientObject.getBuilds(), this);
        }
        return builds;
    }

    /**
     * Gets the resource collection API of BuildAuthTokens.
     * 
     * @return Resource collection API of BuildAuthTokens.
     */
    public BuildAuthTokens buildAuthTokens() {
        if (this.buildAuthTokens == null) {
            this.buildAuthTokens = new BuildAuthTokensImpl(clientObject.getBuildAuthTokens(), this);
        }
        return buildAuthTokens;
    }

    /**
     * Gets the resource collection API of ConnectedEnvironments. It manages ConnectedEnvironment.
     * 
     * @return Resource collection API of ConnectedEnvironments.
     */
    public ConnectedEnvironments connectedEnvironments() {
        if (this.connectedEnvironments == null) {
            this.connectedEnvironments = new ConnectedEnvironmentsImpl(clientObject.getConnectedEnvironments(), this);
        }
        return connectedEnvironments;
    }

    /**
     * Gets the resource collection API of ConnectedEnvironmentsCertificates. It manages Certificate.
     * 
     * @return Resource collection API of ConnectedEnvironmentsCertificates.
     */
    public ConnectedEnvironmentsCertificates connectedEnvironmentsCertificates() {
        if (this.connectedEnvironmentsCertificates == null) {
            this.connectedEnvironmentsCertificates
                = new ConnectedEnvironmentsCertificatesImpl(clientObject.getConnectedEnvironmentsCertificates(), this);
        }
        return connectedEnvironmentsCertificates;
    }

    /**
     * Gets the resource collection API of ConnectedEnvironmentsDaprComponents. It manages DaprComponent.
     * 
     * @return Resource collection API of ConnectedEnvironmentsDaprComponents.
     */
    public ConnectedEnvironmentsDaprComponents connectedEnvironmentsDaprComponents() {
        if (this.connectedEnvironmentsDaprComponents == null) {
            this.connectedEnvironmentsDaprComponents = new ConnectedEnvironmentsDaprComponentsImpl(
                clientObject.getConnectedEnvironmentsDaprComponents(), this);
        }
        return connectedEnvironmentsDaprComponents;
    }

    /**
     * Gets the resource collection API of ConnectedEnvironmentsStorages. It manages ConnectedEnvironmentStorage.
     * 
     * @return Resource collection API of ConnectedEnvironmentsStorages.
     */
    public ConnectedEnvironmentsStorages connectedEnvironmentsStorages() {
        if (this.connectedEnvironmentsStorages == null) {
            this.connectedEnvironmentsStorages
                = new ConnectedEnvironmentsStoragesImpl(clientObject.getConnectedEnvironmentsStorages(), this);
        }
        return connectedEnvironmentsStorages;
    }

    /**
     * Gets the resource collection API of ContainerApps. It manages ContainerApp.
     * 
     * @return Resource collection API of ContainerApps.
     */
    public ContainerApps containerApps() {
        if (this.containerApps == null) {
            this.containerApps = new ContainerAppsImpl(clientObject.getContainerApps(), this);
        }
        return containerApps;
    }

    /**
     * Gets the resource collection API of ContainerAppsRevisions.
     * 
     * @return Resource collection API of ContainerAppsRevisions.
     */
    public ContainerAppsRevisions containerAppsRevisions() {
        if (this.containerAppsRevisions == null) {
            this.containerAppsRevisions
                = new ContainerAppsRevisionsImpl(clientObject.getContainerAppsRevisions(), this);
        }
        return containerAppsRevisions;
    }

    /**
     * Gets the resource collection API of ContainerAppsRevisionReplicas.
     * 
     * @return Resource collection API of ContainerAppsRevisionReplicas.
     */
    public ContainerAppsRevisionReplicas containerAppsRevisionReplicas() {
        if (this.containerAppsRevisionReplicas == null) {
            this.containerAppsRevisionReplicas
                = new ContainerAppsRevisionReplicasImpl(clientObject.getContainerAppsRevisionReplicas(), this);
        }
        return containerAppsRevisionReplicas;
    }

    /**
     * Gets the resource collection API of ContainerAppsDiagnostics.
     * 
     * @return Resource collection API of ContainerAppsDiagnostics.
     */
    public ContainerAppsDiagnostics containerAppsDiagnostics() {
        if (this.containerAppsDiagnostics == null) {
            this.containerAppsDiagnostics
                = new ContainerAppsDiagnosticsImpl(clientObject.getContainerAppsDiagnostics(), this);
        }
        return containerAppsDiagnostics;
    }

    /**
     * Gets the resource collection API of ManagedEnvironmentDiagnostics.
     * 
     * @return Resource collection API of ManagedEnvironmentDiagnostics.
     */
    public ManagedEnvironmentDiagnostics managedEnvironmentDiagnostics() {
        if (this.managedEnvironmentDiagnostics == null) {
            this.managedEnvironmentDiagnostics
                = new ManagedEnvironmentDiagnosticsImpl(clientObject.getManagedEnvironmentDiagnostics(), this);
        }
        return managedEnvironmentDiagnostics;
    }

    /**
     * Gets the resource collection API of ManagedEnvironmentsDiagnostics.
     * 
     * @return Resource collection API of ManagedEnvironmentsDiagnostics.
     */
    public ManagedEnvironmentsDiagnostics managedEnvironmentsDiagnostics() {
        if (this.managedEnvironmentsDiagnostics == null) {
            this.managedEnvironmentsDiagnostics
                = new ManagedEnvironmentsDiagnosticsImpl(clientObject.getManagedEnvironmentsDiagnostics(), this);
        }
        return managedEnvironmentsDiagnostics;
    }

    /**
     * Gets the resource collection API of Jobs. It manages Job.
     * 
     * @return Resource collection API of Jobs.
     */
    public Jobs jobs() {
        if (this.jobs == null) {
            this.jobs = new JobsImpl(clientObject.getJobs(), this);
        }
        return jobs;
    }

    /**
     * Gets the resource collection API of Operations.
     * 
     * @return Resource collection API of Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(clientObject.getOperations(), this);
        }
        return operations;
    }

    /**
     * Gets the resource collection API of JobsExecutions.
     * 
     * @return Resource collection API of JobsExecutions.
     */
    public JobsExecutions jobsExecutions() {
        if (this.jobsExecutions == null) {
            this.jobsExecutions = new JobsExecutionsImpl(clientObject.getJobsExecutions(), this);
        }
        return jobsExecutions;
    }

    /**
     * Gets the resource collection API of ResourceProviders.
     * 
     * @return Resource collection API of ResourceProviders.
     */
    public ResourceProviders resourceProviders() {
        if (this.resourceProviders == null) {
            this.resourceProviders = new ResourceProvidersImpl(clientObject.getResourceProviders(), this);
        }
        return resourceProviders;
    }

    /**
     * Gets the resource collection API of ManagedEnvironments. It manages ManagedEnvironment.
     * 
     * @return Resource collection API of ManagedEnvironments.
     */
    public ManagedEnvironments managedEnvironments() {
        if (this.managedEnvironments == null) {
            this.managedEnvironments = new ManagedEnvironmentsImpl(clientObject.getManagedEnvironments(), this);
        }
        return managedEnvironments;
    }

    /**
     * Gets the resource collection API of Certificates.
     * 
     * @return Resource collection API of Certificates.
     */
    public Certificates certificates() {
        if (this.certificates == null) {
            this.certificates = new CertificatesImpl(clientObject.getCertificates(), this);
        }
        return certificates;
    }

    /**
     * Gets the resource collection API of ManagedCertificates. It manages ManagedCertificate.
     * 
     * @return Resource collection API of ManagedCertificates.
     */
    public ManagedCertificates managedCertificates() {
        if (this.managedCertificates == null) {
            this.managedCertificates = new ManagedCertificatesImpl(clientObject.getManagedCertificates(), this);
        }
        return managedCertificates;
    }

    /**
     * Gets the resource collection API of Namespaces.
     * 
     * @return Resource collection API of Namespaces.
     */
    public Namespaces namespaces() {
        if (this.namespaces == null) {
            this.namespaces = new NamespacesImpl(clientObject.getNamespaces(), this);
        }
        return namespaces;
    }

    /**
     * Gets the resource collection API of DaprComponentResiliencyPolicies. It manages DaprComponentResiliencyPolicy.
     * 
     * @return Resource collection API of DaprComponentResiliencyPolicies.
     */
    public DaprComponentResiliencyPolicies daprComponentResiliencyPolicies() {
        if (this.daprComponentResiliencyPolicies == null) {
            this.daprComponentResiliencyPolicies
                = new DaprComponentResiliencyPoliciesImpl(clientObject.getDaprComponentResiliencyPolicies(), this);
        }
        return daprComponentResiliencyPolicies;
    }

    /**
     * Gets the resource collection API of DaprComponents.
     * 
     * @return Resource collection API of DaprComponents.
     */
    public DaprComponents daprComponents() {
        if (this.daprComponents == null) {
            this.daprComponents = new DaprComponentsImpl(clientObject.getDaprComponents(), this);
        }
        return daprComponents;
    }

    /**
     * Gets the resource collection API of DaprSubscriptions. It manages DaprSubscription.
     * 
     * @return Resource collection API of DaprSubscriptions.
     */
    public DaprSubscriptions daprSubscriptions() {
        if (this.daprSubscriptions == null) {
            this.daprSubscriptions = new DaprSubscriptionsImpl(clientObject.getDaprSubscriptions(), this);
        }
        return daprSubscriptions;
    }

    /**
     * Gets the resource collection API of ManagedEnvironmentsStorages. It manages ManagedEnvironmentStorage.
     * 
     * @return Resource collection API of ManagedEnvironmentsStorages.
     */
    public ManagedEnvironmentsStorages managedEnvironmentsStorages() {
        if (this.managedEnvironmentsStorages == null) {
            this.managedEnvironmentsStorages
                = new ManagedEnvironmentsStoragesImpl(clientObject.getManagedEnvironmentsStorages(), this);
        }
        return managedEnvironmentsStorages;
    }

    /**
     * Gets the resource collection API of ContainerAppsSourceControls. It manages SourceControl.
     * 
     * @return Resource collection API of ContainerAppsSourceControls.
     */
    public ContainerAppsSourceControls containerAppsSourceControls() {
        if (this.containerAppsSourceControls == null) {
            this.containerAppsSourceControls
                = new ContainerAppsSourceControlsImpl(clientObject.getContainerAppsSourceControls(), this);
        }
        return containerAppsSourceControls;
    }

    /**
     * Gets the resource collection API of Usages.
     * 
     * @return Resource collection API of Usages.
     */
    public Usages usages() {
        if (this.usages == null) {
            this.usages = new UsagesImpl(clientObject.getUsages(), this);
        }
        return usages;
    }

    /**
     * Gets the resource collection API of ManagedEnvironmentUsages.
     * 
     * @return Resource collection API of ManagedEnvironmentUsages.
     */
    public ManagedEnvironmentUsages managedEnvironmentUsages() {
        if (this.managedEnvironmentUsages == null) {
            this.managedEnvironmentUsages
                = new ManagedEnvironmentUsagesImpl(clientObject.getManagedEnvironmentUsages(), this);
        }
        return managedEnvironmentUsages;
    }

    /**
     * Gets the resource collection API of JavaComponents. It manages JavaComponent.
     * 
     * @return Resource collection API of JavaComponents.
     */
    public JavaComponents javaComponents() {
        if (this.javaComponents == null) {
            this.javaComponents = new JavaComponentsImpl(clientObject.getJavaComponents(), this);
        }
        return javaComponents;
    }

    /**
     * Gets the resource collection API of DotNetComponents. It manages DotNetComponent.
     * 
     * @return Resource collection API of DotNetComponents.
     */
    public DotNetComponents dotNetComponents() {
        if (this.dotNetComponents == null) {
            this.dotNetComponents = new DotNetComponentsImpl(clientObject.getDotNetComponents(), this);
        }
        return dotNetComponents;
    }

    /**
     * Gets wrapped service client ContainerAppsApiClient providing direct access to the underlying auto-generated API
     * implementation, based on Azure REST API.
     * 
     * @return Wrapped service client ContainerAppsApiClient.
     */
    public ContainerAppsApiClient serviceClient() {
        return this.clientObject;
    }
}
