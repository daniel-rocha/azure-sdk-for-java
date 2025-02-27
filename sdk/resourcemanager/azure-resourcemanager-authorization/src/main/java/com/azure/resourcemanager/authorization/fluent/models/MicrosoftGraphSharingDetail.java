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
import java.util.Map;

/** sharingDetail. */
@Fluent
public final class MicrosoftGraphSharingDetail {
    /*
     * insightIdentity
     */
    @JsonProperty(value = "sharedBy")
    private MicrosoftGraphInsightIdentity sharedBy;

    /*
     * The date and time the file was last shared. The timestamp represents
     * date and time information using ISO 8601 format and is always in UTC
     * time. For example, midnight UTC on Jan 1, 2014 would look like this:
     * 2014-01-01T00:00:00Z. Read-only.
     */
    @JsonProperty(value = "sharedDateTime")
    private OffsetDateTime sharedDateTime;

    /*
     * resourceReference
     */
    @JsonProperty(value = "sharingReference")
    private MicrosoftGraphResourceReference sharingReference;

    /*
     * The subject with which the document was shared.
     */
    @JsonProperty(value = "sharingSubject")
    private String sharingSubject;

    /*
     * Determines the way the document was shared, can be by a 'Link',
     * 'Attachment', 'Group', 'Site'.
     */
    @JsonProperty(value = "sharingType")
    private String sharingType;

    /*
     * sharingDetail
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /**
     * Get the sharedBy property: insightIdentity.
     *
     * @return the sharedBy value.
     */
    public MicrosoftGraphInsightIdentity sharedBy() {
        return this.sharedBy;
    }

    /**
     * Set the sharedBy property: insightIdentity.
     *
     * @param sharedBy the sharedBy value to set.
     * @return the MicrosoftGraphSharingDetail object itself.
     */
    public MicrosoftGraphSharingDetail withSharedBy(MicrosoftGraphInsightIdentity sharedBy) {
        this.sharedBy = sharedBy;
        return this;
    }

    /**
     * Get the sharedDateTime property: The date and time the file was last shared. The timestamp represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: 2014-01-01T00:00:00Z. Read-only.
     *
     * @return the sharedDateTime value.
     */
    public OffsetDateTime sharedDateTime() {
        return this.sharedDateTime;
    }

    /**
     * Set the sharedDateTime property: The date and time the file was last shared. The timestamp represents date and
     * time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 would
     * look like this: 2014-01-01T00:00:00Z. Read-only.
     *
     * @param sharedDateTime the sharedDateTime value to set.
     * @return the MicrosoftGraphSharingDetail object itself.
     */
    public MicrosoftGraphSharingDetail withSharedDateTime(OffsetDateTime sharedDateTime) {
        this.sharedDateTime = sharedDateTime;
        return this;
    }

    /**
     * Get the sharingReference property: resourceReference.
     *
     * @return the sharingReference value.
     */
    public MicrosoftGraphResourceReference sharingReference() {
        return this.sharingReference;
    }

    /**
     * Set the sharingReference property: resourceReference.
     *
     * @param sharingReference the sharingReference value to set.
     * @return the MicrosoftGraphSharingDetail object itself.
     */
    public MicrosoftGraphSharingDetail withSharingReference(MicrosoftGraphResourceReference sharingReference) {
        this.sharingReference = sharingReference;
        return this;
    }

    /**
     * Get the sharingSubject property: The subject with which the document was shared.
     *
     * @return the sharingSubject value.
     */
    public String sharingSubject() {
        return this.sharingSubject;
    }

    /**
     * Set the sharingSubject property: The subject with which the document was shared.
     *
     * @param sharingSubject the sharingSubject value to set.
     * @return the MicrosoftGraphSharingDetail object itself.
     */
    public MicrosoftGraphSharingDetail withSharingSubject(String sharingSubject) {
        this.sharingSubject = sharingSubject;
        return this;
    }

    /**
     * Get the sharingType property: Determines the way the document was shared, can be by a 'Link', 'Attachment',
     * 'Group', 'Site'.
     *
     * @return the sharingType value.
     */
    public String sharingType() {
        return this.sharingType;
    }

    /**
     * Set the sharingType property: Determines the way the document was shared, can be by a 'Link', 'Attachment',
     * 'Group', 'Site'.
     *
     * @param sharingType the sharingType value to set.
     * @return the MicrosoftGraphSharingDetail object itself.
     */
    public MicrosoftGraphSharingDetail withSharingType(String sharingType) {
        this.sharingType = sharingType;
        return this;
    }

    /**
     * Get the additionalProperties property: sharingDetail.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: sharingDetail.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphSharingDetail object itself.
     */
    public MicrosoftGraphSharingDetail withAdditionalProperties(Map<String, Object> additionalProperties) {
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

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (sharedBy() != null) {
            sharedBy().validate();
        }
        if (sharingReference() != null) {
            sharingReference().validate();
        }
    }
}
