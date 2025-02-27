// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.mobilenetwork.models.CoreNetworkType;
import com.azure.resourcemanager.mobilenetwork.models.CustomLocationResourceId;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.MobileNetworkResourceId;
import com.azure.resourcemanager.mobilenetwork.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;

/** PacketCoreControlPlane properties. */
@Fluent
public final class PacketCoreControlPlanePropertiesFormat {
    /*
     * The provisioning state of the packet core control plane resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * Mobile network that this packet core control plane belongs to
     */
    @JsonProperty(value = "mobileNetwork", required = true)
    private MobileNetworkResourceId mobileNetwork;

    /*
     * Azure ARC custom location where the packet core is deployed.
     */
    @JsonProperty(value = "customLocation")
    private CustomLocationResourceId customLocation;

    /*
     * The core network technology generation.
     */
    @JsonProperty(value = "coreNetworkTechnology")
    private CoreNetworkType coreNetworkTechnology;

    /*
     * The version of the packet core software that is deployed.
     */
    @JsonProperty(value = "version")
    private String version;

    /*
     * The control plane interface on the access network. In 5G networks this
     * is called as N2 interface whereas in 4G networks this is called as
     * S1-MME interface.
     */
    @JsonProperty(value = "controlPlaneAccessInterface", required = true)
    private InterfaceProperties controlPlaneAccessInterface;

    /**
     * Get the provisioningState property: The provisioning state of the packet core control plane resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the mobileNetwork property: Mobile network that this packet core control plane belongs to.
     *
     * @return the mobileNetwork value.
     */
    public MobileNetworkResourceId mobileNetwork() {
        return this.mobileNetwork;
    }

    /**
     * Set the mobileNetwork property: Mobile network that this packet core control plane belongs to.
     *
     * @param mobileNetwork the mobileNetwork value to set.
     * @return the PacketCoreControlPlanePropertiesFormat object itself.
     */
    public PacketCoreControlPlanePropertiesFormat withMobileNetwork(MobileNetworkResourceId mobileNetwork) {
        this.mobileNetwork = mobileNetwork;
        return this;
    }

    /**
     * Get the customLocation property: Azure ARC custom location where the packet core is deployed.
     *
     * @return the customLocation value.
     */
    public CustomLocationResourceId customLocation() {
        return this.customLocation;
    }

    /**
     * Set the customLocation property: Azure ARC custom location where the packet core is deployed.
     *
     * @param customLocation the customLocation value to set.
     * @return the PacketCoreControlPlanePropertiesFormat object itself.
     */
    public PacketCoreControlPlanePropertiesFormat withCustomLocation(CustomLocationResourceId customLocation) {
        this.customLocation = customLocation;
        return this;
    }

    /**
     * Get the coreNetworkTechnology property: The core network technology generation.
     *
     * @return the coreNetworkTechnology value.
     */
    public CoreNetworkType coreNetworkTechnology() {
        return this.coreNetworkTechnology;
    }

    /**
     * Set the coreNetworkTechnology property: The core network technology generation.
     *
     * @param coreNetworkTechnology the coreNetworkTechnology value to set.
     * @return the PacketCoreControlPlanePropertiesFormat object itself.
     */
    public PacketCoreControlPlanePropertiesFormat withCoreNetworkTechnology(CoreNetworkType coreNetworkTechnology) {
        this.coreNetworkTechnology = coreNetworkTechnology;
        return this;
    }

    /**
     * Get the version property: The version of the packet core software that is deployed.
     *
     * @return the version value.
     */
    public String version() {
        return this.version;
    }

    /**
     * Set the version property: The version of the packet core software that is deployed.
     *
     * @param version the version value to set.
     * @return the PacketCoreControlPlanePropertiesFormat object itself.
     */
    public PacketCoreControlPlanePropertiesFormat withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the controlPlaneAccessInterface property: The control plane interface on the access network. In 5G networks
     * this is called as N2 interface whereas in 4G networks this is called as S1-MME interface.
     *
     * @return the controlPlaneAccessInterface value.
     */
    public InterfaceProperties controlPlaneAccessInterface() {
        return this.controlPlaneAccessInterface;
    }

    /**
     * Set the controlPlaneAccessInterface property: The control plane interface on the access network. In 5G networks
     * this is called as N2 interface whereas in 4G networks this is called as S1-MME interface.
     *
     * @param controlPlaneAccessInterface the controlPlaneAccessInterface value to set.
     * @return the PacketCoreControlPlanePropertiesFormat object itself.
     */
    public PacketCoreControlPlanePropertiesFormat withControlPlaneAccessInterface(
        InterfaceProperties controlPlaneAccessInterface) {
        this.controlPlaneAccessInterface = controlPlaneAccessInterface;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (mobileNetwork() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property mobileNetwork in model PacketCoreControlPlanePropertiesFormat"));
        } else {
            mobileNetwork().validate();
        }
        if (customLocation() != null) {
            customLocation().validate();
        }
        if (controlPlaneAccessInterface() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property controlPlaneAccessInterface in model"
                            + " PacketCoreControlPlanePropertiesFormat"));
        } else {
            controlPlaneAccessInterface().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(PacketCoreControlPlanePropertiesFormat.class);
}
