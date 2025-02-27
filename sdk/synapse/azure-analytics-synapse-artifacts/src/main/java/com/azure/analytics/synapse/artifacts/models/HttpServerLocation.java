// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.synapse.artifacts.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The location of http server. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("HttpServerLocation")
@Fluent
public final class HttpServerLocation extends DatasetLocation {
    /*
     * Specify the relativeUrl of http server. Type: string (or Expression with
     * resultType string)
     */
    @JsonProperty(value = "relativeUrl")
    private Object relativeUrl;

    /**
     * Get the relativeUrl property: Specify the relativeUrl of http server. Type: string (or Expression with resultType
     * string).
     *
     * @return the relativeUrl value.
     */
    public Object getRelativeUrl() {
        return this.relativeUrl;
    }

    /**
     * Set the relativeUrl property: Specify the relativeUrl of http server. Type: string (or Expression with resultType
     * string).
     *
     * @param relativeUrl the relativeUrl value to set.
     * @return the HttpServerLocation object itself.
     */
    public HttpServerLocation setRelativeUrl(Object relativeUrl) {
        this.relativeUrl = relativeUrl;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpServerLocation setFolderPath(Object folderPath) {
        super.setFolderPath(folderPath);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public HttpServerLocation setFileName(Object fileName) {
        super.setFileName(fileName);
        return this;
    }
}
