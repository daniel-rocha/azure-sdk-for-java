// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Execution policy for an activity. */
@Fluent
public final class RetryPolicy {
    /*
     * Maximum ordinary retry attempts. Default is 0. Type: integer (or
     * Expression with resultType integer), minimum: 0.
     */
    @JsonProperty(value = "count")
    private Object count;

    /*
     * Interval between retries in seconds. Default is 30.
     */
    @JsonProperty(value = "intervalInSeconds")
    private Integer intervalInSeconds;

    /**
     * Get the count property: Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @return the count value.
     */
    public Object count() {
        return this.count;
    }

    /**
     * Set the count property: Maximum ordinary retry attempts. Default is 0. Type: integer (or Expression with
     * resultType integer), minimum: 0.
     *
     * @param count the count value to set.
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withCount(Object count) {
        this.count = count;
        return this;
    }

    /**
     * Get the intervalInSeconds property: Interval between retries in seconds. Default is 30.
     *
     * @return the intervalInSeconds value.
     */
    public Integer intervalInSeconds() {
        return this.intervalInSeconds;
    }

    /**
     * Set the intervalInSeconds property: Interval between retries in seconds. Default is 30.
     *
     * @param intervalInSeconds the intervalInSeconds value to set.
     * @return the RetryPolicy object itself.
     */
    public RetryPolicy withIntervalInSeconds(Integer intervalInSeconds) {
        this.intervalInSeconds = intervalInSeconds;
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
