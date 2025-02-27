// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ScriptType. */
public final class ScriptType extends ExpandableStringEnum<ScriptType> {
    /** Static value Query for ScriptType. */
    public static final ScriptType QUERY = fromString("Query");

    /** Static value NonQuery for ScriptType. */
    public static final ScriptType NON_QUERY = fromString("NonQuery");

    /**
     * Creates or finds a ScriptType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ScriptType.
     */
    @JsonCreator
    public static ScriptType fromString(String name) {
        return fromString(name, ScriptType.class);
    }

    /**
     * Gets known ScriptType values.
     *
     * @return known ScriptType values.
     */
    public static Collection<ScriptType> values() {
        return values(ScriptType.class);
    }
}
