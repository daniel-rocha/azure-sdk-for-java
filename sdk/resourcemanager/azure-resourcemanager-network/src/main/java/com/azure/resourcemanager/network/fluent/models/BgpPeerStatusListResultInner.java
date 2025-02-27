// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.network.models.BgpPeerStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Response for list BGP peer status API service call. */
@Fluent
public final class BgpPeerStatusListResultInner {
    /*
     * List of BGP peers.
     */
    @JsonProperty(value = "value")
    private List<BgpPeerStatus> value;

    /**
     * Get the value property: List of BGP peers.
     *
     * @return the value value.
     */
    public List<BgpPeerStatus> value() {
        return this.value;
    }

    /**
     * Set the value property: List of BGP peers.
     *
     * @param value the value value to set.
     * @return the BgpPeerStatusListResultInner object itself.
     */
    public BgpPeerStatusListResultInner withValue(List<BgpPeerStatus> value) {
        this.value = value;
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
