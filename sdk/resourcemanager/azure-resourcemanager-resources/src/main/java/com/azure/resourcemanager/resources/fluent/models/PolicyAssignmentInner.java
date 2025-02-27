// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.ProxyResource;
import com.azure.core.management.SystemData;
import com.azure.resourcemanager.resources.models.EnforcementMode;
import com.azure.resourcemanager.resources.models.Identity;
import com.azure.resourcemanager.resources.models.NonComplianceMessage;
import com.azure.resourcemanager.resources.models.ParameterValuesValue;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The policy assignment. */
@Fluent
public final class PolicyAssignmentInner extends ProxyResource {
    /*
     * Properties for the policy assignment.
     */
    @JsonProperty(value = "properties")
    private PolicyAssignmentProperties innerProperties;

    /*
     * The location of the policy assignment. Only required when utilizing
     * managed identity.
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * The managed identity associated with the policy assignment.
     */
    @JsonProperty(value = "identity")
    private Identity identity;

    /*
     * The system metadata relating to this resource.
     */
    @JsonProperty(value = "systemData", access = JsonProperty.Access.WRITE_ONLY)
    private SystemData systemData;

    /**
     * Get the innerProperties property: Properties for the policy assignment.
     *
     * @return the innerProperties value.
     */
    private PolicyAssignmentProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the location property: The location of the policy assignment. Only required when utilizing managed identity.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The location of the policy assignment. Only required when utilizing managed identity.
     *
     * @param location the location value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the identity property: The managed identity associated with the policy assignment.
     *
     * @return the identity value.
     */
    public Identity identity() {
        return this.identity;
    }

    /**
     * Set the identity property: The managed identity associated with the policy assignment.
     *
     * @param identity the identity value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }

    /**
     * Get the systemData property: The system metadata relating to this resource.
     *
     * @return the systemData value.
     */
    public SystemData systemData() {
        return this.systemData;
    }

    /**
     * Get the displayName property: The display name of the policy assignment.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.innerProperties() == null ? null : this.innerProperties().displayName();
    }

    /**
     * Set the displayName property: The display name of the policy assignment.
     *
     * @param displayName the displayName value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDisplayName(String displayName) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withDisplayName(displayName);
        return this;
    }

    /**
     * Get the policyDefinitionId property: The ID of the policy definition or policy set definition being assigned.
     *
     * @return the policyDefinitionId value.
     */
    public String policyDefinitionId() {
        return this.innerProperties() == null ? null : this.innerProperties().policyDefinitionId();
    }

    /**
     * Set the policyDefinitionId property: The ID of the policy definition or policy set definition being assigned.
     *
     * @param policyDefinitionId the policyDefinitionId value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withPolicyDefinitionId(String policyDefinitionId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withPolicyDefinitionId(policyDefinitionId);
        return this;
    }

    /**
     * Get the scope property: The scope for the policy assignment.
     *
     * @return the scope value.
     */
    public String scope() {
        return this.innerProperties() == null ? null : this.innerProperties().scope();
    }

    /**
     * Get the notScopes property: The policy's excluded scopes.
     *
     * @return the notScopes value.
     */
    public List<String> notScopes() {
        return this.innerProperties() == null ? null : this.innerProperties().notScopes();
    }

    /**
     * Set the notScopes property: The policy's excluded scopes.
     *
     * @param notScopes the notScopes value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withNotScopes(List<String> notScopes) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withNotScopes(notScopes);
        return this;
    }

    /**
     * Get the parameters property: The parameter values for the assigned policy rule. The keys are the parameter names.
     *
     * @return the parameters value.
     */
    public Map<String, ParameterValuesValue> parameters() {
        return this.innerProperties() == null ? null : this.innerProperties().parameters();
    }

    /**
     * Set the parameters property: The parameter values for the assigned policy rule. The keys are the parameter names.
     *
     * @param parameters the parameters value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withParameters(Map<String, ParameterValuesValue> parameters) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withParameters(parameters);
        return this;
    }

    /**
     * Get the description property: This message will be part of response in case of policy violation.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: This message will be part of response in case of policy violation.
     *
     * @param description the description value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the metadata property: The policy assignment metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @return the metadata value.
     */
    public Object metadata() {
        return this.innerProperties() == null ? null : this.innerProperties().metadata();
    }

    /**
     * Set the metadata property: The policy assignment metadata. Metadata is an open ended object and is typically a
     * collection of key value pairs.
     *
     * @param metadata the metadata value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withMetadata(Object metadata) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withMetadata(metadata);
        return this;
    }

    /**
     * Get the enforcementMode property: The policy assignment enforcement mode. Possible values are Default and
     * DoNotEnforce.
     *
     * @return the enforcementMode value.
     */
    public EnforcementMode enforcementMode() {
        return this.innerProperties() == null ? null : this.innerProperties().enforcementMode();
    }

    /**
     * Set the enforcementMode property: The policy assignment enforcement mode. Possible values are Default and
     * DoNotEnforce.
     *
     * @param enforcementMode the enforcementMode value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withEnforcementMode(EnforcementMode enforcementMode) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withEnforcementMode(enforcementMode);
        return this;
    }

    /**
     * Get the nonComplianceMessages property: The messages that describe why a resource is non-compliant with the
     * policy.
     *
     * @return the nonComplianceMessages value.
     */
    public List<NonComplianceMessage> nonComplianceMessages() {
        return this.innerProperties() == null ? null : this.innerProperties().nonComplianceMessages();
    }

    /**
     * Set the nonComplianceMessages property: The messages that describe why a resource is non-compliant with the
     * policy.
     *
     * @param nonComplianceMessages the nonComplianceMessages value to set.
     * @return the PolicyAssignmentInner object itself.
     */
    public PolicyAssignmentInner withNonComplianceMessages(List<NonComplianceMessage> nonComplianceMessages) {
        if (this.innerProperties() == null) {
            this.innerProperties = new PolicyAssignmentProperties();
        }
        this.innerProperties().withNonComplianceMessages(nonComplianceMessages);
        return this;
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
        if (identity() != null) {
            identity().validate();
        }
    }
}
