// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.resourcemanager.network.fluent.models.ApplicationGatewayBackendHttpSettingsPropertiesFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Backend address pool settings of an application gateway. */
@Fluent
public final class ApplicationGatewayBackendHttpSettings extends SubResource {
    /*
     * Properties of the application gateway backend HTTP settings.
     */
    @JsonProperty(value = "properties")
    private ApplicationGatewayBackendHttpSettingsPropertiesFormat innerProperties;

    /*
     * Name of the backend http settings that is unique within an Application
     * Gateway.
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
     * Get the innerProperties property: Properties of the application gateway backend HTTP settings.
     *
     * @return the innerProperties value.
     */
    private ApplicationGatewayBackendHttpSettingsPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the name property: Name of the backend http settings that is unique within an Application Gateway.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: Name of the backend http settings that is unique within an Application Gateway.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withName(String name) {
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
    public ApplicationGatewayBackendHttpSettings withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Get the port property: The destination port on the backend.
     *
     * @return the port value.
     */
    public Integer port() {
        return this.innerProperties() == null ? null : this.innerProperties().port();
    }

    /**
     * Set the port property: The destination port on the backend.
     *
     * @param port the port value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPort(Integer port) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withPort(port);
        return this;
    }

    /**
     * Get the protocol property: The protocol used to communicate with the backend.
     *
     * @return the protocol value.
     */
    public ApplicationGatewayProtocol protocol() {
        return this.innerProperties() == null ? null : this.innerProperties().protocol();
    }

    /**
     * Set the protocol property: The protocol used to communicate with the backend.
     *
     * @param protocol the protocol value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProtocol(ApplicationGatewayProtocol protocol) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withProtocol(protocol);
        return this;
    }

    /**
     * Get the cookieBasedAffinity property: Cookie based affinity.
     *
     * @return the cookieBasedAffinity value.
     */
    public ApplicationGatewayCookieBasedAffinity cookieBasedAffinity() {
        return this.innerProperties() == null ? null : this.innerProperties().cookieBasedAffinity();
    }

    /**
     * Set the cookieBasedAffinity property: Cookie based affinity.
     *
     * @param cookieBasedAffinity the cookieBasedAffinity value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withCookieBasedAffinity(
        ApplicationGatewayCookieBasedAffinity cookieBasedAffinity) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withCookieBasedAffinity(cookieBasedAffinity);
        return this;
    }

    /**
     * Get the requestTimeout property: Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @return the requestTimeout value.
     */
    public Integer requestTimeout() {
        return this.innerProperties() == null ? null : this.innerProperties().requestTimeout();
    }

    /**
     * Set the requestTimeout property: Request timeout in seconds. Application Gateway will fail the request if
     * response is not received within RequestTimeout. Acceptable values are from 1 second to 86400 seconds.
     *
     * @param requestTimeout the requestTimeout value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withRequestTimeout(Integer requestTimeout) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withRequestTimeout(requestTimeout);
        return this;
    }

    /**
     * Get the probe property: Probe resource of an application gateway.
     *
     * @return the probe value.
     */
    public SubResource probe() {
        return this.innerProperties() == null ? null : this.innerProperties().probe();
    }

    /**
     * Set the probe property: Probe resource of an application gateway.
     *
     * @param probe the probe value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProbe(SubResource probe) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withProbe(probe);
        return this;
    }

    /**
     * Get the authenticationCertificates property: Array of references to application gateway authentication
     * certificates.
     *
     * @return the authenticationCertificates value.
     */
    public List<SubResource> authenticationCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().authenticationCertificates();
    }

    /**
     * Set the authenticationCertificates property: Array of references to application gateway authentication
     * certificates.
     *
     * @param authenticationCertificates the authenticationCertificates value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withAuthenticationCertificates(
        List<SubResource> authenticationCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withAuthenticationCertificates(authenticationCertificates);
        return this;
    }

    /**
     * Get the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @return the trustedRootCertificates value.
     */
    public List<SubResource> trustedRootCertificates() {
        return this.innerProperties() == null ? null : this.innerProperties().trustedRootCertificates();
    }

    /**
     * Set the trustedRootCertificates property: Array of references to application gateway trusted root certificates.
     *
     * @param trustedRootCertificates the trustedRootCertificates value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withTrustedRootCertificates(
        List<SubResource> trustedRootCertificates) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withTrustedRootCertificates(trustedRootCertificates);
        return this;
    }

    /**
     * Get the connectionDraining property: Connection draining of the backend http settings resource.
     *
     * @return the connectionDraining value.
     */
    public ApplicationGatewayConnectionDraining connectionDraining() {
        return this.innerProperties() == null ? null : this.innerProperties().connectionDraining();
    }

    /**
     * Set the connectionDraining property: Connection draining of the backend http settings resource.
     *
     * @param connectionDraining the connectionDraining value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withConnectionDraining(
        ApplicationGatewayConnectionDraining connectionDraining) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withConnectionDraining(connectionDraining);
        return this;
    }

    /**
     * Get the hostname property: Host header to be sent to the backend servers.
     *
     * @return the hostname value.
     */
    public String hostname() {
        return this.innerProperties() == null ? null : this.innerProperties().hostname();
    }

    /**
     * Set the hostname property: Host header to be sent to the backend servers.
     *
     * @param hostname the hostname value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withHostname(String hostname) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withHostname(hostname);
        return this;
    }

    /**
     * Get the pickHostnameFromBackendAddress property: Whether to pick host header should be picked from the host name
     * of the backend server. Default value is false.
     *
     * @return the pickHostnameFromBackendAddress value.
     */
    public Boolean pickHostnameFromBackendAddress() {
        return this.innerProperties() == null ? null : this.innerProperties().pickHostnameFromBackendAddress();
    }

    /**
     * Set the pickHostnameFromBackendAddress property: Whether to pick host header should be picked from the host name
     * of the backend server. Default value is false.
     *
     * @param pickHostnameFromBackendAddress the pickHostnameFromBackendAddress value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPickHostnameFromBackendAddress(
        Boolean pickHostnameFromBackendAddress) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withPickHostnameFromBackendAddress(pickHostnameFromBackendAddress);
        return this;
    }

    /**
     * Get the affinityCookieName property: Cookie name to use for the affinity cookie.
     *
     * @return the affinityCookieName value.
     */
    public String affinityCookieName() {
        return this.innerProperties() == null ? null : this.innerProperties().affinityCookieName();
    }

    /**
     * Set the affinityCookieName property: Cookie name to use for the affinity cookie.
     *
     * @param affinityCookieName the affinityCookieName value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withAffinityCookieName(String affinityCookieName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withAffinityCookieName(affinityCookieName);
        return this;
    }

    /**
     * Get the probeEnabled property: Whether the probe is enabled. Default value is false.
     *
     * @return the probeEnabled value.
     */
    public Boolean probeEnabled() {
        return this.innerProperties() == null ? null : this.innerProperties().probeEnabled();
    }

    /**
     * Set the probeEnabled property: Whether the probe is enabled. Default value is false.
     *
     * @param probeEnabled the probeEnabled value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withProbeEnabled(Boolean probeEnabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withProbeEnabled(probeEnabled);
        return this;
    }

    /**
     * Get the path property: Path which should be used as a prefix for all HTTP requests. Null means no path will be
     * prefixed. Default value is null.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: Path which should be used as a prefix for all HTTP requests. Null means no path will be
     * prefixed. Default value is null.
     *
     * @param path the path value to set.
     * @return the ApplicationGatewayBackendHttpSettings object itself.
     */
    public ApplicationGatewayBackendHttpSettings withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new ApplicationGatewayBackendHttpSettingsPropertiesFormat();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the backend HTTP settings resource.
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
