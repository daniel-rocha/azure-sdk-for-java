// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.netapp.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Parameters with which a subvolume can be updated. */
@Fluent
public final class SubvolumePatchParams {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(SubvolumePatchParams.class);

    /*
     * size Truncate subvolume to the provided size in bytes
     */
    @JsonProperty(value = "size")
    private Long size;

    /*
     * path path to the subvolume
     */
    @JsonProperty(value = "path")
    private String path;

    /**
     * Get the size property: size Truncate subvolume to the provided size in bytes.
     *
     * @return the size value.
     */
    public Long size() {
        return this.size;
    }

    /**
     * Set the size property: size Truncate subvolume to the provided size in bytes.
     *
     * @param size the size value to set.
     * @return the SubvolumePatchParams object itself.
     */
    public SubvolumePatchParams withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * Get the path property: path path to the subvolume.
     *
     * @return the path value.
     */
    public String path() {
        return this.path;
    }

    /**
     * Set the path property: path path to the subvolume.
     *
     * @param path the path value to set.
     * @return the SubvolumePatchParams object itself.
     */
    public SubvolumePatchParams withPath(String path) {
        this.path = path;
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
