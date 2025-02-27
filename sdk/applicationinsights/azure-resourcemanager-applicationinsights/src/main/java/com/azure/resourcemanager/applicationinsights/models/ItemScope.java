// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.applicationinsights.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for ItemScope. */
public final class ItemScope extends ExpandableStringEnum<ItemScope> {
    /** Static value shared for ItemScope. */
    public static final ItemScope SHARED = fromString("shared");

    /** Static value user for ItemScope. */
    public static final ItemScope USER = fromString("user");

    /**
     * Creates or finds a ItemScope from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ItemScope.
     */
    @JsonCreator
    public static ItemScope fromString(String name) {
        return fromString(name, ItemScope.class);
    }

    /**
     * Gets known ItemScope values.
     *
     * @return known ItemScope values.
     */
    public static Collection<ItemScope> values() {
        return values(ItemScope.class);
    }
}
