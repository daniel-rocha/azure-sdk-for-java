// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The List VmImages in EdgeZone operation response. */
@Fluent
public final class VmImagesInEdgeZoneListResultInner {
    /*
     * The list of VMImages in EdgeZone
     */
    @JsonProperty(value = "value")
    private List<VirtualMachineImageResourceInner> value;

    /*
     * The URI to fetch the next page of VMImages in EdgeZone. Call ListNext()
     * with this URI to fetch the next page of VmImages.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of VMImages in EdgeZone.
     *
     * @return the value value.
     */
    public List<VirtualMachineImageResourceInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of VMImages in EdgeZone.
     *
     * @param value the value value to set.
     * @return the VmImagesInEdgeZoneListResultInner object itself.
     */
    public VmImagesInEdgeZoneListResultInner withValue(List<VirtualMachineImageResourceInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI to fetch the next page of VMImages in EdgeZone. Call ListNext() with this URI
     * to fetch the next page of VmImages.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI to fetch the next page of VMImages in EdgeZone. Call ListNext() with this URI
     * to fetch the next page of VmImages.
     *
     * @param nextLink the nextLink value to set.
     * @return the VmImagesInEdgeZoneListResultInner object itself.
     */
    public VmImagesInEdgeZoneListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
