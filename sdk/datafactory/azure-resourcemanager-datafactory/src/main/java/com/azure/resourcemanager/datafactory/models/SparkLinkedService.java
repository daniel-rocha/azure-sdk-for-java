// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.datafactory.fluent.models.SparkLinkedServiceTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** Spark Server linked service. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("Spark")
@Fluent
public final class SparkLinkedService extends LinkedService {
    /*
     * Spark Server linked service properties.
     */
    @JsonProperty(value = "typeProperties", required = true)
    private SparkLinkedServiceTypeProperties innerTypeProperties = new SparkLinkedServiceTypeProperties();

    /**
     * Get the innerTypeProperties property: Spark Server linked service properties.
     *
     * @return the innerTypeProperties value.
     */
    private SparkLinkedServiceTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public SparkLinkedService withConnectVia(IntegrationRuntimeReference connectVia) {
        super.withConnectVia(connectVia);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SparkLinkedService withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SparkLinkedService withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SparkLinkedService withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /**
     * Get the host property: IP address or host name of the Spark server.
     *
     * @return the host value.
     */
    public Object host() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().host();
    }

    /**
     * Set the host property: IP address or host name of the Spark server.
     *
     * @param host the host value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withHost(Object host) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHost(host);
        return this;
    }

    /**
     * Get the port property: The TCP port that the Spark server uses to listen for client connections.
     *
     * @return the port value.
     */
    public Object port() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().port();
    }

    /**
     * Set the port property: The TCP port that the Spark server uses to listen for client connections.
     *
     * @param port the port value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withPort(Object port) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPort(port);
        return this;
    }

    /**
     * Get the serverType property: The type of Spark server.
     *
     * @return the serverType value.
     */
    public SparkServerType serverType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().serverType();
    }

    /**
     * Set the serverType property: The type of Spark server.
     *
     * @param serverType the serverType value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withServerType(SparkServerType serverType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withServerType(serverType);
        return this;
    }

    /**
     * Get the thriftTransportProtocol property: The transport protocol to use in the Thrift layer.
     *
     * @return the thriftTransportProtocol value.
     */
    public SparkThriftTransportProtocol thriftTransportProtocol() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().thriftTransportProtocol();
    }

    /**
     * Set the thriftTransportProtocol property: The transport protocol to use in the Thrift layer.
     *
     * @param thriftTransportProtocol the thriftTransportProtocol value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withThriftTransportProtocol(SparkThriftTransportProtocol thriftTransportProtocol) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withThriftTransportProtocol(thriftTransportProtocol);
        return this;
    }

    /**
     * Get the authenticationType property: The authentication method used to access the Spark server.
     *
     * @return the authenticationType value.
     */
    public SparkAuthenticationType authenticationType() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().authenticationType();
    }

    /**
     * Set the authenticationType property: The authentication method used to access the Spark server.
     *
     * @param authenticationType the authenticationType value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withAuthenticationType(SparkAuthenticationType authenticationType) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAuthenticationType(authenticationType);
        return this;
    }

    /**
     * Get the username property: The user name that you use to access Spark Server.
     *
     * @return the username value.
     */
    public Object username() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().username();
    }

    /**
     * Set the username property: The user name that you use to access Spark Server.
     *
     * @param username the username value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withUsername(Object username) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUsername(username);
        return this;
    }

    /**
     * Get the password property: The password corresponding to the user name that you provided in the Username field.
     *
     * @return the password value.
     */
    public SecretBase password() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().password();
    }

    /**
     * Set the password property: The password corresponding to the user name that you provided in the Username field.
     *
     * @param password the password value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withPassword(SecretBase password) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withPassword(password);
        return this;
    }

    /**
     * Get the httpPath property: The partial URL corresponding to the Spark server.
     *
     * @return the httpPath value.
     */
    public Object httpPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().httpPath();
    }

    /**
     * Set the httpPath property: The partial URL corresponding to the Spark server.
     *
     * @param httpPath the httpPath value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withHttpPath(Object httpPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withHttpPath(httpPath);
        return this;
    }

    /**
     * Get the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @return the enableSsl value.
     */
    public Object enableSsl() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().enableSsl();
    }

    /**
     * Set the enableSsl property: Specifies whether the connections to the server are encrypted using SSL. The default
     * value is false.
     *
     * @param enableSsl the enableSsl value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withEnableSsl(Object enableSsl) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEnableSsl(enableSsl);
        return this;
    }

    /**
     * Get the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @return the trustedCertPath value.
     */
    public Object trustedCertPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().trustedCertPath();
    }

    /**
     * Set the trustedCertPath property: The full path of the .pem file containing trusted CA certificates for verifying
     * the server when connecting over SSL. This property can only be set when using SSL on self-hosted IR. The default
     * value is the cacerts.pem file installed with the IR.
     *
     * @param trustedCertPath the trustedCertPath value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withTrustedCertPath(Object trustedCertPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withTrustedCertPath(trustedCertPath);
        return this;
    }

    /**
     * Get the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @return the useSystemTrustStore value.
     */
    public Object useSystemTrustStore() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().useSystemTrustStore();
    }

    /**
     * Set the useSystemTrustStore property: Specifies whether to use a CA certificate from the system trust store or
     * from a specified PEM file. The default value is false.
     *
     * @param useSystemTrustStore the useSystemTrustStore value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withUseSystemTrustStore(Object useSystemTrustStore) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withUseSystemTrustStore(useSystemTrustStore);
        return this;
    }

    /**
     * Get the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @return the allowHostnameCNMismatch value.
     */
    public Object allowHostnameCNMismatch() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().allowHostnameCNMismatch();
    }

    /**
     * Set the allowHostnameCNMismatch property: Specifies whether to require a CA-issued SSL certificate name to match
     * the host name of the server when connecting over SSL. The default value is false.
     *
     * @param allowHostnameCNMismatch the allowHostnameCNMismatch value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withAllowHostnameCNMismatch(Object allowHostnameCNMismatch) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAllowHostnameCNMismatch(allowHostnameCNMismatch);
        return this;
    }

    /**
     * Get the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @return the allowSelfSignedServerCert value.
     */
    public Object allowSelfSignedServerCert() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().allowSelfSignedServerCert();
    }

    /**
     * Set the allowSelfSignedServerCert property: Specifies whether to allow self-signed certificates from the server.
     * The default value is false.
     *
     * @param allowSelfSignedServerCert the allowSelfSignedServerCert value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withAllowSelfSignedServerCert(Object allowSelfSignedServerCert) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withAllowSelfSignedServerCert(allowSelfSignedServerCert);
        return this;
    }

    /**
     * Get the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @return the encryptedCredential value.
     */
    public Object encryptedCredential() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().encryptedCredential();
    }

    /**
     * Set the encryptedCredential property: The encrypted credential used for authentication. Credentials are encrypted
     * using the integration runtime credential manager. Type: string (or Expression with resultType string).
     *
     * @param encryptedCredential the encryptedCredential value to set.
     * @return the SparkLinkedService object itself.
     */
    public SparkLinkedService withEncryptedCredential(Object encryptedCredential) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new SparkLinkedServiceTypeProperties();
        }
        this.innerTypeProperties().withEncryptedCredential(encryptedCredential);
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
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property innerTypeProperties in model SparkLinkedService"));
        } else {
            innerTypeProperties().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SparkLinkedService.class);
}
