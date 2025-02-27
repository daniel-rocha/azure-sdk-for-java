// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for OrchestrationServiceState. */
public final class OrchestrationServiceState extends ExpandableStringEnum<OrchestrationServiceState> {
    /** Static value NotRunning for OrchestrationServiceState. */
    public static final OrchestrationServiceState NOT_RUNNING = fromString("NotRunning");

    /** Static value Running for OrchestrationServiceState. */
    public static final OrchestrationServiceState RUNNING = fromString("Running");

    /** Static value Suspended for OrchestrationServiceState. */
    public static final OrchestrationServiceState SUSPENDED = fromString("Suspended");

    /**
     * Creates or finds a OrchestrationServiceState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding OrchestrationServiceState.
     */
    @JsonCreator
    public static OrchestrationServiceState fromString(String name) {
        return fromString(name, OrchestrationServiceState.class);
    }

    /**
     * Gets known OrchestrationServiceState values.
     *
     * @return known OrchestrationServiceState values.
     */
    public static Collection<OrchestrationServiceState> values() {
        return values(OrchestrationServiceState.class);
    }
}
