// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Authentication certificates of an application gateway. */
@Fluent
public final class ApplicationGatewayAuthenticationCertificateInner extends SubResource {
    /*
     * Properties of the application gateway authentication certificate.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayAuthenticationCertificatePropertiesFormat innerProperties;

    /*
     * Name of the authentication certificate that is unique within an
     * Application Gateway.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Type of the resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get the innerProperties property: Properties of the application gateway authentication certificate.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayAuthenticationCertificatePropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the authentication certificate that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the authentication certificate that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the type property: Type of the resource.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /** {@inheritDoc} */
    @Override
    public ApplicationGatewayAuthenticationCertificateInner withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the data property: Certificate public data.
     *
     * @return the data value.
     */
    public String data() {
        return this.innerProperties() == null ? null : this.innerProperties().data();
    }

    /**
     * Set the data property: Certificate public data.
     *
     * @param data the data value to set.
     * @return the ApplicationGatewayAuthenticationCertificateInner object itself.
     */
    public ApplicationGatewayAuthenticationCertificateInner withData(String data) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayAuthenticationCertificatePropertiesFormat();
        }
        this.innerProperties().withData(data);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the authentication certificate resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
