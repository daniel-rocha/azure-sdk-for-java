// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resources.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ExemptionCategory. */
public final class ExemptionCategory extends ExpandableStringEnum<ExemptionCategory> {
    /** Static value Waiver for ExemptionCategory. */
    public static final ExemptionCategory WAIVER = fromString("Waiver");

    /** Static value Mitigated for ExemptionCategory. */
    public static final ExemptionCategory MITIGATED = fromString("Mitigated");

    /**
     * Creates or finds a ExemptionCategory from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ExemptionCategory.
     */
    @JsonCreator
    public static ExemptionCategory fromString(String name) {
        return fromString(name, ExemptionCategory.class);
    }

    /**
     * Gets known ExemptionCategory values.
     *
     * @return known ExemptionCategory values.
     */
    public static Collection<ExemptionCategory> values() {
        return values(ExemptionCategory.class);
    }
}
