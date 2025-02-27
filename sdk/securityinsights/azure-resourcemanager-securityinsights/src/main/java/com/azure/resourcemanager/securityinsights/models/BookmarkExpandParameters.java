// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.UUID;

/** The parameters required to execute an expand operation on the given bookmark. */
@Fluent
public final class BookmarkExpandParameters {
    /*
     * The end date filter, so the only expansion results returned are before
     * this date.
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * The Id of the expansion to perform.
     */
    @JsonProperty(value = "expansionId")
    private UUID expansionId;

    /*
     * The start date filter, so the only expansion results returned are after
     * this date.
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /**
     * Get the endTime property: The end date filter, so the only expansion results returned are before this date.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: The end date filter, so the only expansion results returned are before this date.
     *
     * @param endTime the endTime value to set.
     * @return the BookmarkExpandParameters object itself.
     */
    public BookmarkExpandParameters withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the expansionId property: The Id of the expansion to perform.
     *
     * @return the expansionId value.
     */
    public UUID expansionId() {
        return this.expansionId;
    }

    /**
     * Set the expansionId property: The Id of the expansion to perform.
     *
     * @param expansionId the expansionId value to set.
     * @return the BookmarkExpandParameters object itself.
     */
    public BookmarkExpandParameters withExpansionId(UUID expansionId) {
        this.expansionId = expansionId;
        return this;
    }

    /**
     * Get the startTime property: The start date filter, so the only expansion results returned are after this date.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: The start date filter, so the only expansion results returned are after this date.
     *
     * @param startTime the startTime value to set.
     * @return the BookmarkExpandParameters object itself.
     */
    public BookmarkExpandParameters withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
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
