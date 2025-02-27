// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for HyperVGenerationTypes. */
public final class HyperVGenerationTypes extends ExpandableStringEnum<HyperVGenerationTypes> {
    /** Static value V1 for HyperVGenerationTypes. */
    public static final HyperVGenerationTypes V1 = fromString("V1");

    /** Static value V2 for HyperVGenerationTypes. */
    public static final HyperVGenerationTypes V2 = fromString("V2");

    /**
     * Creates or finds a HyperVGenerationTypes from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding HyperVGenerationTypes.
     */
    @JsonCreator
    public static HyperVGenerationTypes fromString(String name) {
        return fromString(name, HyperVGenerationTypes.class);
    }

    /**
     * Gets known HyperVGenerationTypes values.
     *
     * @return known HyperVGenerationTypes values.
     */
    public static Collection<HyperVGenerationTypes> values() {
        return values(HyperVGenerationTypes.class);
    }
}
