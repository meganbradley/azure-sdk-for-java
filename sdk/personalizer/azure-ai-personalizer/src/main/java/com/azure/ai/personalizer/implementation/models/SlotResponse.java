// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.personalizer.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The SlotResponse model. */
@Fluent
public final class SlotResponse {
    /*
     * Id is the slot ID.
     */
    @JsonProperty(value = "id", required = true)
    private String id;

    /*
     * RewardActionID is the action ID recommended by Personalizer.
     */
    @JsonProperty(value = "rewardActionId", access = JsonProperty.Access.WRITE_ONLY)
    private String rewardActionId;

    /**
     * Get the id property: Id is the slot ID.
     *
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Set the id property: Id is the slot ID.
     *
     * @param id the id value to set.
     * @return the SlotResponse object itself.
     */
    public SlotResponse setId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the rewardActionId property: RewardActionID is the action ID recommended by Personalizer.
     *
     * @return the rewardActionId value.
     */
    public String getRewardActionId() {
        return this.rewardActionId;
    }
}
