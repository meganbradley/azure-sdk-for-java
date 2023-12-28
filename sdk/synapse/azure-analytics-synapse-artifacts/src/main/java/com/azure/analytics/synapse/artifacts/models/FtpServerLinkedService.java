// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/**
 * A FTP server Linked Service.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FtpServer")
@JsonFlatten
@Fluent
public class FtpServerLinkedService extends LinkedService {
    /*
     * Host name of the FTP server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.host", required = true)
    private Object host;

    /*
     * The TCP port number that the FTP server uses to listen for client connections. Default value is 21. Type:
     * integer (or Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "typeProperties.port")
    private Object port;

    /*
     * The authentication type to be used to connect to the FTP server.
     */
    @JsonProperty(value = "typeProperties.authenticationType")
    private FtpAuthenticationType authenticationType;

    /*
     * Username to logon the FTP server. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.userName")
    private Object userName;

    /*
     * Password to logon the FTP server.
     */
    @JsonProperty(value = "typeProperties.password")
    private SecretBase password;

    /*
     * The encrypted credential used for authentication. Credentials are encrypted using the integration runtime
     * credential manager. Type: string (or Expression with resultType string).
     */
    @JsonProperty(value = "typeProperties.encryptedCredential")
    private Object encryptedCredential;

    /*
     * If true, connect to the FTP server over SSL/TLS channel. Default value is true. Type: boolean (or Expression
     * with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableSsl")
    private Object enableSsl;

    /*
     * If true, validate the FTP server SSL certificate when connect over SSL/TLS channel. Default value is true. Type:
     * boolean (or Expression with resultType boolean).
     */
    @JsonProperty(value = "typeProperties.enableServerCertificateValidation")
    private Object enableServerCertificateValidation;

    /**
     * Creates an instance of FtpServerLinkedService class.
     */
    public FtpServerLinkedService() {
    }

    /**
     * Get the host property: Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     * @return the host value.
     */
    public Object getHost() {
        return this.host;
    }

    /**
     * Set the host property: Host name of the FTP server. Type: string (or Expression with resultType string).
     * 
     * @param host the host value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setHost(Object host) {
        this.host = host;
        return this;
    }

    /**
     * Get the port property: The TCP port number that the FTP server uses to listen for client connections. Default
     * value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @return the port value.
     */
    public Object getPort() {
        return this.port;
    }

    /**
     * Set the port property: The TCP port number that the FTP server uses to listen for client connections. Default
     * value is 21. Type: integer (or Expression with resultType integer), minimum: 0.
     * 
     * @param port the port value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setPort(Object port) {
        this.port = port;
        return this;
    }

    /**
     * Get the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @return the authenticationType value.
     */
    public FtpAuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    /**
     * Set the authenticationType property: The authentication type to be used to connect to the FTP server.
     * 
     * @param authenticationType the authenticationType value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setAuthenticationType(FtpAuthenticationType authenticationType) {
        this.authenticationType = authenticationType;
        return this;
    }

    /**
     * Get the userName property: Username to logon the FTP server. Type: string (or Expression with resultType
     * string).
     * 
     * @return the userName value.
     */
    public Object getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: Username to logon the FTP server. Type: string (or Expression with resultType
     * string).
     * 
     * @param userName the userName value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setUserName(Object userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: Password to logon the FTP server.
     * 
     * @return the password value.
     */
    public SecretBase getPassword() {
        return this.password;
    }

    /**
     * Set the password property: Password to logon the FTP server.
     * 
     * @param password the password value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setPassword(SecretBase password) {
        this.password = password;
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @return the encryptedCredential value.
     */
    public Object getEncryptedCredential() {
        return this.encryptedCredential;
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are
     * encrypted using the integration runtime credential manager. Type: string (or Expression with resultType string).
     * 
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setEncryptedCredential(Object encryptedCredential) {
        this.encryptedCredential = encryptedCredential;
        return this;
    }

    /**
     * Get the enableSsl property: If true, connect to the FTP server over SSL/TLS channel. Default value is true.
     * Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableSsl value.
     */
    public Object getEnableSsl() {
        return this.enableSsl;
    }

    /**
     * Set the enableSsl property: If true, connect to the FTP server over SSL/TLS channel. Default value is true.
     * Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableSsl the enableSsl value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setEnableSsl(Object enableSsl) {
        this.enableSsl = enableSsl;
        return this;
    }

    /**
     * Get the enableServerCertificateValidation property: If true, validate the FTP server SSL certificate when
     * connect over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @return the enableServerCertificateValidation value.
     */
    public Object getEnableServerCertificateValidation() {
        return this.enableServerCertificateValidation;
    }

    /**
     * Set the enableServerCertificateValidation property: If true, validate the FTP server SSL certificate when
     * connect over SSL/TLS channel. Default value is true. Type: boolean (or Expression with resultType boolean).
     * 
     * @param enableServerCertificateValidation the enableServerCertificateValidation value to set.
     * @return the FtpServerLinkedService object itself.
     */
    public FtpServerLinkedService setEnableServerCertificateValidation(Object enableServerCertificateValidation) {
        this.enableServerCertificateValidation = enableServerCertificateValidation;
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setConnectVia(IntegrationRuntimeReference connectVia) {
        super.setConnectVia(connectVia);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setDescription(String description) {
        super.setDescription(description);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setParameters(Map<String, ParameterSpecification> parameters) {
        super.setParameters(parameters);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FtpServerLinkedService setAnnotations(List<Object> annotations) {
        super.setAnnotations(annotations);
        return this;
    }
}
