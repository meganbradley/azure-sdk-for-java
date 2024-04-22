// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.FtpServerLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeId;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * A FTP server Linked Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "type", defaultImpl = FtpServerLinkedService.class, visible = true)
@JsonTypeName("FtpServer")
@Fluent
public final class FtpServerLinkedService extends LinkedService {
    /*
     * Type of linked service.
     */
    @JsonTypeId
    @JsonProperty(value = "type", required = true)
    private String type = "FtpServer";

    /*
     * Properties specific to this linked service type.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private FtpServerLinkedServiceTypeProperties innerTypeProperties = new FtpServerLinkedServiceTypeProperties();

    /**
     * Creates an instance of FtpServerLinkedService class.
     */
    public FtpServerLinkedService() {
    }

    /**
     * Get the type property: Type of linked service.
     * 
     * @return the type value.
     */
    @Override
    public String type() {
        return this.type;
    }

    /**
     * Get the innerTypeProperties property: Properties specific to this linked service type.
     * 
     * @return the innerTypeProperties value.
     */
    private FtpServerLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     * @param host the host value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the port property: The TCP port number that the FTP server uses to listen for client connections. Default
     * value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object port() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().port();
    }

    /**
     * Set the port property: The TCP port number that the FTP server uses to listen for client connections. Default
     * value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withPort(Object port) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPort(port);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @return the authenticationType value.
     */
    public FtpAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withAuthenticationType(FtpAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: Username to logon the FTP server. Type: string (or Expression with resultType string).
     * 
     * @param username the username value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: Password to logon the FTP server.
     * 
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: Password to logon the FTP server.
     * 
     * @param password the password value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @return the encryptedCredential value.
     */
    public String encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string.
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withEncryptedCredential(String encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
        return this;
    }

    /**
     * Get the enableSsl property: If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().enableSsl();
    }

    /**
     * Set the enableSsl property: If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withEnableSsl(Object enableSsl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnableSsl(enableSsl);
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: If true, validate the FTP server SSL certificate when connect
     * over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableServerCertificateValidation value.
     */
    public Object enableServerCertificateValidation() {
        return this.innerTypeProperties() == null
            ? null
            : this.innerTypeProperties().enableServerCertificateValidation();
    }

    /**
     * Set the enableServerCertificateValidation property: If true, validate the FTP server SSL certificate when connect
     * over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService withEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new FtpServerLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnableServerCertificateValidation(enableServerCertificateValidation);
        return this;
    }

    /**
     * Validates the instance.
     * 
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() == null) {
            throw LOGGER.atError()
                .log(new IllegalArgumentException(
                    "Missing required property innerTypeProperties in model FtpServerLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(FtpServerLinkedService.class);
}
