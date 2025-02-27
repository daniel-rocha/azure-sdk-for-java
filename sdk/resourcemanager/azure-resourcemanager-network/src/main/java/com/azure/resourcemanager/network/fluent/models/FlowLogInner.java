// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.resourcemanager.network.models.FlowLogFormatParameters;
import com.azure.resourcemanager.network.models.ProvisioningState;
import com.azure.resourcemanager.network.models.RetentionPolicyParameters;
import com.azure.resourcemanager.network.models.TrafficAnalyticsProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** A flow log resource. */
@Fluent
public final class FlowLogInner extends Resource {
    /*
     * Properties of the flow log.
     */
    @JsonProperty(value = "properties")
    private FlowLogPropertiesFormat innerProperties;

    /*
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /*
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the innerProperties property: Properties of the flow log.
     *
     * @return the innerProperties value.
     */
    private FlowLogPropertiesFormat innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the etag property: A unique read-only string that changes whenever the resource is updated.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id property: Resource ID.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id property: Resource ID.
     *
     * @param id the id value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withId(String id) {
        this.id = id;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FlowLogInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public FlowLogInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the targetResourceId property: ID of network security group to which flow log will be applied.
     *
     * @return the targetResourceId value.
     */
    public String targetResourceId() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceId();
    }

    /**
     * Set the targetResourceId property: ID of network security group to which flow log will be applied.
     *
     * @param targetResourceId the targetResourceId value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withTargetResourceId(String targetResourceId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogPropertiesFormat();
        }
        this.innerProperties().withTargetResourceId(targetResourceId);
        return this;
    }

    /**
     * Get the targetResourceGuid property: Guid of network security group to which flow log will be applied.
     *
     * @return the targetResourceGuid value.
     */
    public String targetResourceGuid() {
        return this.innerProperties() == null ? null : this.innerProperties().targetResourceGuid();
    }

    /**
     * Get the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @return the storageId value.
     */
    public String storageId() {
        return this.innerProperties() == null ? null : this.innerProperties().storageId();
    }

    /**
     * Set the storageId property: ID of the storage account which is used to store the flow log.
     *
     * @param storageId the storageId value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withStorageId(String storageId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogPropertiesFormat();
        }
        this.innerProperties().withStorageId(storageId);
        return this;
    }

    /**
     * Get the enabled property: Flag to enable/disable flow logging.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.innerProperties() == null ? null : this.innerProperties().enabled();
    }

    /**
     * Set the enabled property: Flag to enable/disable flow logging.
     *
     * @param enabled the enabled value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withEnabled(Boolean enabled) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogPropertiesFormat();
        }
        this.innerProperties().withEnabled(enabled);
        return this;
    }

    /**
     * Get the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @return the retentionPolicy value.
     */
    public RetentionPolicyParameters retentionPolicy() {
        return this.innerProperties() == null ? null : this.innerProperties().retentionPolicy();
    }

    /**
     * Set the retentionPolicy property: Parameters that define the retention policy for flow log.
     *
     * @param retentionPolicy the retentionPolicy value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withRetentionPolicy(RetentionPolicyParameters retentionPolicy) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogPropertiesFormat();
        }
        this.innerProperties().withRetentionPolicy(retentionPolicy);
        return this;
    }

    /**
     * Get the format property: Parameters that define the flow log format.
     *
     * @return the format value.
     */
    public FlowLogFormatParameters format() {
        return this.innerProperties() == null ? null : this.innerProperties().format();
    }

    /**
     * Set the format property: Parameters that define the flow log format.
     *
     * @param format the format value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withFormat(FlowLogFormatParameters format) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogPropertiesFormat();
        }
        this.innerProperties().withFormat(format);
        return this;
    }

    /**
     * Get the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @return the flowAnalyticsConfiguration value.
     */
    public TrafficAnalyticsProperties flowAnalyticsConfiguration() {
        return this.innerProperties() == null ? null : this.innerProperties().flowAnalyticsConfiguration();
    }

    /**
     * Set the flowAnalyticsConfiguration property: Parameters that define the configuration of traffic analytics.
     *
     * @param flowAnalyticsConfiguration the flowAnalyticsConfiguration value to set.
     * @return the FlowLogInner object itself.
     */
    public FlowLogInner withFlowAnalyticsConfiguration(TrafficAnalyticsProperties flowAnalyticsConfiguration) {
        if (this.innerProperties() == null) {
            this.innerProperties = new FlowLogPropertiesFormat();
        }
        this.innerProperties().withFlowAnalyticsConfiguration(flowAnalyticsConfiguration);
        return this;
    }

    /**
     * Get the provisioningState property: The provisioning state of the flow log.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
    }
}
