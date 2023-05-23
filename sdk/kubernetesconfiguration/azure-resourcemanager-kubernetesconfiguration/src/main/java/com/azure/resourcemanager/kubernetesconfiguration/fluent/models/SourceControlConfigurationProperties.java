// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.kubernetesconfiguration.models.ComplianceStatus;
import com.azure.resourcemanager.kubernetesconfiguration.models.HelmOperatorProperties;
import com.azure.resourcemanager.kubernetesconfiguration.models.OperatorScopeType;
import com.azure.resourcemanager.kubernetesconfiguration.models.OperatorType;
import com.azure.resourcemanager.kubernetesconfiguration.models.ProvisioningStateType;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** Properties to create a Source Control Configuration resource. */
@Fluent
public final class SourceControlConfigurationProperties {
    /*
     * Url of the SourceControl Repository.
     */
    @JsonProperty(value = "repositoryUrl")
    private String repositoryUrl;

    /*
     * The namespace to which this operator is installed to. Maximum of 253 lower case alphanumeric characters, hyphen
     * and period only.
     */
    @JsonProperty(value = "operatorNamespace")
    private String operatorNamespace;

    /*
     * Instance name of the operator - identifying the specific configuration.
     */
    @JsonProperty(value = "operatorInstanceName")
    private String operatorInstanceName;

    /*
     * Type of the operator
     */
    @JsonProperty(value = "operatorType")
    private OperatorType operatorType;

    /*
     * Any Parameters for the Operator instance in string format.
     */
    @JsonProperty(value = "operatorParams")
    private String operatorParams;

    /*
     * Name-value pairs of protected configuration settings for the configuration
     */
    @JsonProperty(value = "configurationProtectedSettings")
    @JsonInclude(value = JsonInclude.Include.NON_NULL, content = JsonInclude.Include.ALWAYS)
    private Map<String, String> configurationProtectedSettings;

    /*
     * Scope at which the operator will be installed.
     */
    @JsonProperty(value = "operatorScope")
    private OperatorScopeType operatorScope;

    /*
     * Public Key associated with this SourceControl configuration (either generated within the cluster or provided by
     * the user).
     */
    @JsonProperty(value = "repositoryPublicKey", access = JsonProperty.Access.WRITE_ONLY)
    private String repositoryPublicKey;

    /*
     * Base64-encoded known_hosts contents containing public SSH keys required to access private Git instances
     */
    @JsonProperty(value = "sshKnownHostsContents")
    private String sshKnownHostsContents;

    /*
     * Option to enable Helm Operator for this git configuration.
     */
    @JsonProperty(value = "enableHelmOperator")
    private Boolean enableHelmOperator;

    /*
     * Properties for Helm operator.
     */
    @JsonProperty(value = "helmOperatorProperties")
    private HelmOperatorProperties helmOperatorProperties;

    /*
     * The provisioning state of the resource provider.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningStateType provisioningState;

    /*
     * Compliance Status of the Configuration
     */
    @JsonProperty(value = "complianceStatus", access = JsonProperty.Access.WRITE_ONLY)
    private ComplianceStatus complianceStatus;

    /** Creates an instance of SourceControlConfigurationProperties class. */
    public SourceControlConfigurationProperties() {
    }

    /**
     * Get the repositoryUrl property: Url of the SourceControl Repository.
     *
     * @return the repositoryUrl value.
     */
    public String repositoryUrl() {
        return this.repositoryUrl;
    }

    /**
     * Set the repositoryUrl property: Url of the SourceControl Repository.
     *
     * @param repositoryUrl the repositoryUrl value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withRepositoryUrl(String repositoryUrl) {
        this.repositoryUrl = repositoryUrl;
        return this;
    }

    /**
     * Get the operatorNamespace property: The namespace to which this operator is installed to. Maximum of 253 lower
     * case alphanumeric characters, hyphen and period only.
     *
     * @return the operatorNamespace value.
     */
    public String operatorNamespace() {
        return this.operatorNamespace;
    }

    /**
     * Set the operatorNamespace property: The namespace to which this operator is installed to. Maximum of 253 lower
     * case alphanumeric characters, hyphen and period only.
     *
     * @param operatorNamespace the operatorNamespace value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withOperatorNamespace(String operatorNamespace) {
        this.operatorNamespace = operatorNamespace;
        return this;
    }

    /**
     * Get the operatorInstanceName property: Instance name of the operator - identifying the specific configuration.
     *
     * @return the operatorInstanceName value.
     */
    public String operatorInstanceName() {
        return this.operatorInstanceName;
    }

    /**
     * Set the operatorInstanceName property: Instance name of the operator - identifying the specific configuration.
     *
     * @param operatorInstanceName the operatorInstanceName value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withOperatorInstanceName(String operatorInstanceName) {
        this.operatorInstanceName = operatorInstanceName;
        return this;
    }

    /**
     * Get the operatorType property: Type of the operator.
     *
     * @return the operatorType value.
     */
    public OperatorType operatorType() {
        return this.operatorType;
    }

    /**
     * Set the operatorType property: Type of the operator.
     *
     * @param operatorType the operatorType value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withOperatorType(OperatorType operatorType) {
        this.operatorType = operatorType;
        return this;
    }

    /**
     * Get the operatorParams property: Any Parameters for the Operator instance in string format.
     *
     * @return the operatorParams value.
     */
    public String operatorParams() {
        return this.operatorParams;
    }

    /**
     * Set the operatorParams property: Any Parameters for the Operator instance in string format.
     *
     * @param operatorParams the operatorParams value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withOperatorParams(String operatorParams) {
        this.operatorParams = operatorParams;
        return this;
    }

    /**
     * Get the configurationProtectedSettings property: Name-value pairs of protected configuration settings for the
     * configuration.
     *
     * @return the configurationProtectedSettings value.
     */
    public Map<String, String> configurationProtectedSettings() {
        return this.configurationProtectedSettings;
    }

    /**
     * Set the configurationProtectedSettings property: Name-value pairs of protected configuration settings for the
     * configuration.
     *
     * @param configurationProtectedSettings the configurationProtectedSettings value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withConfigurationProtectedSettings(
        Map<String, String> configurationProtectedSettings) {
        this.configurationProtectedSettings = configurationProtectedSettings;
        return this;
    }

    /**
     * Get the operatorScope property: Scope at which the operator will be installed.
     *
     * @return the operatorScope value.
     */
    public OperatorScopeType operatorScope() {
        return this.operatorScope;
    }

    /**
     * Set the operatorScope property: Scope at which the operator will be installed.
     *
     * @param operatorScope the operatorScope value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withOperatorScope(OperatorScopeType operatorScope) {
        this.operatorScope = operatorScope;
        return this;
    }

    /**
     * Get the repositoryPublicKey property: Public Key associated with this SourceControl configuration (either
     * generated within the cluster or provided by the user).
     *
     * @return the repositoryPublicKey value.
     */
    public String repositoryPublicKey() {
        return this.repositoryPublicKey;
    }

    /**
     * Get the sshKnownHostsContents property: Base64-encoded known_hosts contents containing public SSH keys required
     * to access private Git instances.
     *
     * @return the sshKnownHostsContents value.
     */
    public String sshKnownHostsContents() {
        return this.sshKnownHostsContents;
    }

    /**
     * Set the sshKnownHostsContents property: Base64-encoded known_hosts contents containing public SSH keys required
     * to access private Git instances.
     *
     * @param sshKnownHostsContents the sshKnownHostsContents value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withSshKnownHostsContents(String sshKnownHostsContents) {
        this.sshKnownHostsContents = sshKnownHostsContents;
        return this;
    }

    /**
     * Get the enableHelmOperator property: Option to enable Helm Operator for this git configuration.
     *
     * @return the enableHelmOperator value.
     */
    public Boolean enableHelmOperator() {
        return this.enableHelmOperator;
    }

    /**
     * Set the enableHelmOperator property: Option to enable Helm Operator for this git configuration.
     *
     * @param enableHelmOperator the enableHelmOperator value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withEnableHelmOperator(Boolean enableHelmOperator) {
        this.enableHelmOperator = enableHelmOperator;
        return this;
    }

    /**
     * Get the helmOperatorProperties property: Properties for Helm operator.
     *
     * @return the helmOperatorProperties value.
     */
    public HelmOperatorProperties helmOperatorProperties() {
        return this.helmOperatorProperties;
    }

    /**
     * Set the helmOperatorProperties property: Properties for Helm operator.
     *
     * @param helmOperatorProperties the helmOperatorProperties value to set.
     * @return the SourceControlConfigurationProperties object itself.
     */
    public SourceControlConfigurationProperties withHelmOperatorProperties(
        HelmOperatorProperties helmOperatorProperties) {
        this.helmOperatorProperties = helmOperatorProperties;
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the resource provider.
     *
     * @return the provisioningState value.
     */
    public ProvisioningStateType provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the complianceStatus property: Compliance Status of the Configuration.
     *
     * @return the complianceStatus value.
     */
    public ComplianceStatus complianceStatus() {
        return this.complianceStatus;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (helmOperatorProperties() != null) {
            helmOperatorProperties().validate();
        }
        if (complianceStatus() != null) {
            complianceStatus().validate();
        }
    }
}
