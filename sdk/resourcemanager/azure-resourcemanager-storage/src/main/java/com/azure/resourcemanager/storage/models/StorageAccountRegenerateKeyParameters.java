// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storage.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The parameters used to regenerate the storage account key. */
@Fluent
public final class StorageAccountRegenerateKeyParameters {
    /*
     * The name of storage keys that want to be regenerated, possible values
     * are key1, key2, kerb1, kerb2.
     */
    @JsonProperty(value = "keyName", required = true)
    private String keyName;

    /**
     * Get the keyName property: The name of storage keys that want to be regenerated, possible values are key1, key2,
     * kerb1, kerb2.
     *
     * @return the keyName value.
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Set the keyName property: The name of storage keys that want to be regenerated, possible values are key1, key2,
     * kerb1, kerb2.
     *
     * @param keyName the keyName value to set.
     * @return the StorageAccountRegenerateKeyParameters object itself.
     */
    public StorageAccountRegenerateKeyParameters withKeyName(String keyName) {
        this.keyName = keyName;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (keyName() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property keyName in model StorageAccountRegenerateKeyParameters"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(StorageAccountRegenerateKeyParameters.class);
}
