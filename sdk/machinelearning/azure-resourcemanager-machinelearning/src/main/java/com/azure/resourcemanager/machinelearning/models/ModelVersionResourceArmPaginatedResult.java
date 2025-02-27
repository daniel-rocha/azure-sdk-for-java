// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.machinelearning.fluent.models.ModelVersionDataInner;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** A paginated list of ModelVersion entities. */
@Fluent
public final class ModelVersionResourceArmPaginatedResult {
    /*
     * The link to the next page of ModelVersion objects. If null, there are no
     * additional pages.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /*
     * An array of objects of type ModelVersion.
     */
    @JsonProperty(value = "value")
    private List<ModelVersionDataInner> value;

    /**
     * Get the nextLink property: The link to the next page of ModelVersion objects. If null, there are no additional
     * pages.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The link to the next page of ModelVersion objects. If null, there are no additional
     * pages.
     *
     * @param nextLink the nextLink value to set.
     * @return the ModelVersionResourceArmPaginatedResult object itself.
     */
    public ModelVersionResourceArmPaginatedResult withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Get the value property: An array of objects of type ModelVersion.
     *
     * @return the value value.
     */
    public List<ModelVersionDataInner> value() {
        return this.value;
    }

    /**
     * Set the value property: An array of objects of type ModelVersion.
     *
     * @param value the value value to set.
     * @return the ModelVersionResourceArmPaginatedResult object itself.
     */
    public ModelVersionResourceArmPaginatedResult withValue(List<ModelVersionDataInner> value) {
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
