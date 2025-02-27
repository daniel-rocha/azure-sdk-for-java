// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Metadata associated with the operation. */
@Fluent
public final class OperationDisplay {
    /*
     * The description of the operation.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The name of the provider.
     */
    @JsonProperty(value = "provider")
    private String provider;

    /*
     * The name of the resource type on which the operation is performed.
     */
    @JsonProperty(value = "resource")
    private String resource;

    /*
     * The type of operation: get, read, delete, etc.
     */
    @JsonProperty(value = "operation")
    private String operation;

    /**
     * Get the description property: The description of the operation.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description of the operation.
     *
     * @param description the description value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the provider property: The name of the provider.
     *
     * @return the provider value.
     */
    public String provider() {
        return this.provider;
    }

    /**
     * Set the provider property: The name of the provider.
     *
     * @param provider the provider value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withProvider(String provider) {
        this.provider = provider;
        return this;
    }

    /**
     * Get the resource property: The name of the resource type on which the operation is performed.
     *
     * @return the resource value.
     */
    public String resource() {
        return this.resource;
    }

    /**
     * Set the resource property: The name of the resource type on which the operation is performed.
     *
     * @param resource the resource value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withResource(String resource) {
        this.resource = resource;
        return this;
    }

    /**
     * Get the operation property: The type of operation: get, read, delete, etc.
     *
     * @return the operation value.
     */
    public String operation() {
        return this.operation;
    }

    /**
     * Set the operation property: The type of operation: get, read, delete, etc.
     *
     * @param operation the operation value to set.
     * @return the OperationDisplay object itself.
     */
    public OperationDisplay withOperation(String operation) {
        this.operation = operation;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
