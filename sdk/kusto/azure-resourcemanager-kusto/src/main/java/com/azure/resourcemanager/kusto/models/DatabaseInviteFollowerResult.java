// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.models;

import com.azure.resourcemanager.kusto.fluent.models.DatabaseInviteFollowerResultInner;

/** An immutable client-side representation of DatabaseInviteFollowerResult. */
public interface DatabaseInviteFollowerResult {
    /**
     * Gets the generatedInvitation property: The generated invitation token.
     *
     * @return the generatedInvitation value.
     */
    String generatedInvitation();

    /**
     * Gets the inner com.azure.resourcemanager.kusto.fluent.models.DatabaseInviteFollowerResultInner object.
     *
     * @return the inner object.
     */
    DatabaseInviteFollowerResultInner innerModel();
}
