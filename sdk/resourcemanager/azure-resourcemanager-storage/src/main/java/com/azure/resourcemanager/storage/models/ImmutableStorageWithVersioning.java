// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;

/** Object level immutability properties of the container. */
@Fluent
public final class ImmutableStorageWithVersioning {
    /*
     * This is an immutable property, when set to true it enables object level
     * immutability at the container level.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * Returns the date and time the object level immutability was enabled.
     */
    @JsonProperty(value = "timeStamp", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime timestamp;

    /*
     * This property denotes the container level immutability to object level
     * immutability migration state.
     */
    @JsonProperty(value = "migrationState", access = JsonProperty.Access.WRITE_ONLY)
    private MigrationState migrationState;

    /**
     * Get the enabled property: This is an immutable property, when set to true it enables object level immutability at
     * the container level.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: This is an immutable property, when set to true it enables object level immutability at
     * the container level.
     *
     * @param enabled the enabled value to set.
     * @return the ImmutableStorageWithVersioning object itself.
     */
    public ImmutableStorageWithVersioning withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the timestamp property: Returns the date and time the object level immutability was enabled.
     *
     * @return the timestamp value.
     */
    public OffsetDateTime timestamp() {
        return this.timestamp;
    }

    /**
     * Get the migrationState property: This property denotes the container level immutability to object level
     * immutability migration state.
     *
     * @return the migrationState value.
     */
    public MigrationState migrationState() {
        return this.migrationState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
