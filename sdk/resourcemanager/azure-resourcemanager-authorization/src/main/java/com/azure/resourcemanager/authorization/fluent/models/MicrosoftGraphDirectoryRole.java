// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * directoryRole Represents an Azure Active Directory object. The directoryObject type is the base type for many other
 * directory entity types.
 */
@Fluent
public final class MicrosoftGraphDirectoryRole extends MicrosoftGraphDirectoryObjectInner {
    /*
     * The description for the directory role. Read-only.
     */
    @JsonProperty(value = "description")
    private String description;

    /*
     * The display name for the directory role. Read-only.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /*
     * The id of the directoryRoleTemplate that this role is based on. The
     * property must be specified when activating a directory role in a tenant
     * with a POST operation. After the directory role has been activated, the
     * property is read only.
     */
    @JsonProperty(value = "roleTemplateId")
    private String roleTemplateId;

    /*
     * Users that are members of this directory role. HTTP Methods: GET, POST,
     * DELETE. Read-only. Nullable.
     */
    @JsonProperty(value = "members")
    private List<MicrosoftGraphDirectoryObjectInner> members;

    /*
     * The scopedMembers property.
     */
    @JsonProperty(value = "scopedMembers")
    private List<MicrosoftGraphScopedRoleMembership> scopedMembers;

    /*
     * Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the description property: The description for the directory role. Read-only.
     *
     * @return the description value.
     */
    public String description() {
        return this.description;
    }

    /**
     * Set the description property: The description for the directory role. Read-only.
     *
     * @param description the description value to set.
     * @return the MicrosoftGraphDirectoryRole object itself.
     */
    public MicrosoftGraphDirectoryRole withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get the displayName property: The display name for the directory role. Read-only.
     *
     * @return the displayName value.
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the displayName property: The display name for the directory role. Read-only.
     *
     * @param displayName the displayName value to set.
     * @return the MicrosoftGraphDirectoryRole object itself.
     */
    public MicrosoftGraphDirectoryRole withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the roleTemplateId property: The id of the directoryRoleTemplate that this role is based on. The property
     * must be specified when activating a directory role in a tenant with a POST operation. After the directory role
     * has been activated, the property is read only.
     *
     * @return the roleTemplateId value.
     */
    public String roleTemplateId() {
        return this.roleTemplateId;
    }

    /**
     * Set the roleTemplateId property: The id of the directoryRoleTemplate that this role is based on. The property
     * must be specified when activating a directory role in a tenant with a POST operation. After the directory role
     * has been activated, the property is read only.
     *
     * @param roleTemplateId the roleTemplateId value to set.
     * @return the MicrosoftGraphDirectoryRole object itself.
     */
    public MicrosoftGraphDirectoryRole withRoleTemplateId(String roleTemplateId) {
        this.roleTemplateId = roleTemplateId;
        return this;
    }

    /**
     * Get the members property: Users that are members of this directory role. HTTP Methods: GET, POST, DELETE.
     * Read-only. Nullable.
     *
     * @return the members value.
     */
    public List<MicrosoftGraphDirectoryObjectInner> members() {
        return this.members;
    }

    /**
     * Set the members property: Users that are members of this directory role. HTTP Methods: GET, POST, DELETE.
     * Read-only. Nullable.
     *
     * @param members the members value to set.
     * @return the MicrosoftGraphDirectoryRole object itself.
     */
    public MicrosoftGraphDirectoryRole withMembers(List<MicrosoftGraphDirectoryObjectInner> members) {
        this.members = members;
        return this;
    }

    /**
     * Get the scopedMembers property: The scopedMembers property.
     *
     * @return the scopedMembers value.
     */
    public List<MicrosoftGraphScopedRoleMembership> scopedMembers() {
        return this.scopedMembers;
    }

    /**
     * Set the scopedMembers property: The scopedMembers property.
     *
     * @param scopedMembers the scopedMembers value to set.
     * @return the MicrosoftGraphDirectoryRole object itself.
     */
    public MicrosoftGraphDirectoryRole withScopedMembers(List<MicrosoftGraphScopedRoleMembership> scopedMembers) {
        this.scopedMembers = scopedMembers;
        return this;
    }

    /**
     * Get the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: Represents an Azure Active Directory object. The directoryObject type is
     * the base type for many other directory entity types.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphDirectoryRole object itself.
     */
    public MicrosoftGraphDirectoryRole withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDirectoryRole withDeletedDateTime(OffsetDateTime deletedDateTime) {
        super.withDeletedDateTime(deletedDateTime);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphDirectoryRole withId(String id) {
        super.withId(id);
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
        if (members() != null) {
            members().forEach(e -> e.validate());
        }
        if (scopedMembers() != null) {
            scopedMembers().forEach(e -> e.validate());
        }
    }
}
