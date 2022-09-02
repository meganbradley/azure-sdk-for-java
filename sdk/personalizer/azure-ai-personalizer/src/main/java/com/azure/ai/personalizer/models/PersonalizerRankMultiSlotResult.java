// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.models;

import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The PersonalizerRankMultiSlotResult model. */
@Immutable
public final class PersonalizerRankMultiSlotResult {
    /*
     * Each slot has a corresponding rewardActionID which is the action ID
     * recommended by Personalizer.
     */
    @JsonProperty(value = "slots", access = JsonProperty.Access.WRITE_ONLY)
    private List<PersonalizerSlotResult> slots;

    /*
     * The eventId for the round trip from request to response.
     */
    @JsonProperty(value = "eventId", access = JsonProperty.Access.WRITE_ONLY)
    private String eventId;

    /**
     * Get the slots property: Each slot has a corresponding rewardActionID which is the action ID recommended by
     * Personalizer.
     *
     * @return the slots value.
     */
    public List<PersonalizerSlotResult> getSlots() {
        return this.slots;
    }

    /**
     * Get the eventId property: The eventId for the round trip from request to response.
     *
     * @return the eventId value.
     */
    public String getEventId() {
        return this.eventId;
    }
}
