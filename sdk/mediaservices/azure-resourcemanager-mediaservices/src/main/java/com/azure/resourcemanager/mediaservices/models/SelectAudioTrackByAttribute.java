// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** Select audio tracks from the input by specifying an attribute and an attribute filter. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Media.SelectAudioTrackByAttribute")
@Fluent
public final class SelectAudioTrackByAttribute extends AudioTrackDescriptor {
    /*
     * The TrackAttribute to filter the tracks by.
     */
    @JsonProperty(value = "attribute", required = true)
    private TrackAttribute attribute;

    /*
     * The type of AttributeFilter to apply to the TrackAttribute in order to
     * select the tracks.
     */
    @JsonProperty(value = "filter", required = true)
    private AttributeFilter filter;

    /*
     * The value to filter the tracks by.  Only used when
     * AttributeFilter.ValueEquals is specified for the Filter property.
     */
    @JsonProperty(value = "filterValue")
    private String filterValue;

    /**
     * Get the attribute property: The TrackAttribute to filter the tracks by.
     *
     * @return the attribute value.
     */
    public TrackAttribute attribute() {
        return this.attribute;
    }

    /**
     * Set the attribute property: The TrackAttribute to filter the tracks by.
     *
     * @param attribute the attribute value to set.
     * @return the SelectAudioTrackByAttribute object itself.
     */
    public SelectAudioTrackByAttribute withAttribute(TrackAttribute attribute) {
        this.attribute = attribute;
        return this;
    }

    /**
     * Get the filter property: The type of AttributeFilter to apply to the TrackAttribute in order to select the
     * tracks.
     *
     * @return the filter value.
     */
    public AttributeFilter filter() {
        return this.filter;
    }

    /**
     * Set the filter property: The type of AttributeFilter to apply to the TrackAttribute in order to select the
     * tracks.
     *
     * @param filter the filter value to set.
     * @return the SelectAudioTrackByAttribute object itself.
     */
    public SelectAudioTrackByAttribute withFilter(AttributeFilter filter) {
        this.filter = filter;
        return this;
    }

    /**
     * Get the filterValue property: The value to filter the tracks by. Only used when AttributeFilter.ValueEquals is
     * specified for the Filter property.
     *
     * @return the filterValue value.
     */
    public String filterValue() {
        return this.filterValue;
    }

    /**
     * Set the filterValue property: The value to filter the tracks by. Only used when AttributeFilter.ValueEquals is
     * specified for the Filter property.
     *
     * @param filterValue the filterValue value to set.
     * @return the SelectAudioTrackByAttribute object itself.
     */
    public SelectAudioTrackByAttribute withFilterValue(String filterValue) {
        this.filterValue = filterValue;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public SelectAudioTrackByAttribute withChannelMapping(ChannelMapping channelMapping) {
        super.withChannelMapping(channelMapping);
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
        if (attribute() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property attribute in model SelectAudioTrackByAttribute"));
        }
        if (filter() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property filter in model SelectAudioTrackByAttribute"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SelectAudioTrackByAttribute.class);
}
