// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appplatform.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The settings of Application Configuration Service. */
@Fluent
public final class ConfigurationServiceSettings {
    /*
     * Property of git environment.
     */
    @JsonProperty(value = "gitProperty")
    private ConfigurationServiceGitProperty gitProperty;

    /**
     * Get the gitProperty property: Property of git environment.
     *
     * @return the gitProperty value.
     */
    public ConfigurationServiceGitProperty gitProperty() {
        return this.gitProperty;
    }

    /**
     * Set the gitProperty property: Property of git environment.
     *
     * @param gitProperty the gitProperty value to set.
     * @return the ConfigurationServiceSettings object itself.
     */
    public ConfigurationServiceSettings withGitProperty(ConfigurationServiceGitProperty gitProperty) {
        this.gitProperty = gitProperty;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (gitProperty() != null) {
            gitProperty().validate();
        }
    }
}
