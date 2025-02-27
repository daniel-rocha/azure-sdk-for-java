// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.synapse.fluent.models.AzureResourceSkuInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** List of available SKUs for a Kusto Pool. */
@Fluent
public final class ListResourceSkusResult {
    /*
     * The collection of available SKUs for an existing resource.
     */
    @JsonProperty(value = "value")
    private List<AzureResourceSkuInner> value;

    /**
     * Get the value property: The collection of available SKUs for an existing resource.
     *
     * @return the value value.
     */
    public List<AzureResourceSkuInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of available SKUs for an existing resource.
     *
     * @param value the value value to set.
     * @return the ListResourceSkusResult object itself.
     */
    public ListResourceSkusResult withValue(List<AzureResourceSkuInner> value) {
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
