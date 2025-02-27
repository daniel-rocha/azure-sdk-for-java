// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for PartnerTopicActivationState. */
public final class PartnerTopicActivationState extends ExpandableStringEnum<PartnerTopicActivationState> {
    /** Static value NeverActivated for PartnerTopicActivationState. */
    public static final PartnerTopicActivationState NEVER_ACTIVATED = fromString("NeverActivated");

    /** Static value Activated for PartnerTopicActivationState. */
    public static final PartnerTopicActivationState ACTIVATED = fromString("Activated");

    /** Static value Deactivated for PartnerTopicActivationState. */
    public static final PartnerTopicActivationState DEACTIVATED = fromString("Deactivated");

    /**
     * Creates or finds a PartnerTopicActivationState from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding PartnerTopicActivationState.
     */
    @JsonCreator
    public static PartnerTopicActivationState fromString(String name) {
        return fromString(name, PartnerTopicActivationState.class);
    }

    /**
     * Gets known PartnerTopicActivationState values.
     *
     * @return known PartnerTopicActivationState values.
     */
    public static Collection<PartnerTopicActivationState> values() {
        return values(PartnerTopicActivationState.class);
    }
}
