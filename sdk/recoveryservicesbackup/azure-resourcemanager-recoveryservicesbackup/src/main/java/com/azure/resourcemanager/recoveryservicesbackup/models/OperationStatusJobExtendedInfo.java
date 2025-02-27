// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.recoveryservicesbackup.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Operation status job extended info. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "objectType")
@JsonTypeName("OperationStatusJobExtendedInfo")
@Fluent
public final class OperationStatusJobExtendedInfo extends OperationStatusExtendedInfo {
    /*
     * ID of the job created for this protected item.
     */
    @JsonProperty(value = "jobId")
    private String jobId;

    /**
     * Get the jobId property: ID of the job created for this protected item.
     *
     * @return the jobId value.
     */
    public String jobId() {
        return this.jobId;
    }

    /**
     * Set the jobId property: ID of the job created for this protected item.
     *
     * @param jobId the jobId value to set.
     * @return the OperationStatusJobExtendedInfo object itself.
     */
    public OperationStatusJobExtendedInfo withJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
    }
}
