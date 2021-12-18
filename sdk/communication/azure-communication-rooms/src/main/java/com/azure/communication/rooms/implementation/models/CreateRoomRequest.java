// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.Map;

/** The CreateRoomRequest model. */
@Fluent
public final class CreateRoomRequest {
    /*
     * The timestamp from when the room is open for joining. The timestamp is
     * in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "validFrom")
    private OffsetDateTime validFrom;

    /*
     * The timestamp from when the room can no longer be joined. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "validUntil")
    private OffsetDateTime validUntil;

    /*
     * (Optional) Collection of identities invited to the room.
     */
    @JsonProperty(value = "participants")
    private Map<String, Object> participants;

    /**
     * Get the validFrom property: The timestamp from when the room is open for joining. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the validFrom value.
     */
    public OffsetDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     * Set the validFrom property: The timestamp from when the room is open for joining. The timestamp is in RFC3339
     * format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param validFrom the validFrom value to set.
     * @return the CreateRoomRequest object itself.
     */
    public CreateRoomRequest setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Get the validUntil property: The timestamp from when the room can no longer be joined. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the validUntil value.
     */
    public OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * Set the validUntil property: The timestamp from when the room can no longer be joined. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param validUntil the validUntil value to set.
     * @return the CreateRoomRequest object itself.
     */
    public CreateRoomRequest setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Get the participants property: (Optional) Collection of identities invited to the room.
     *
     * @return the participants value.
     */
    public Map<String, Object> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: (Optional) Collection of identities invited to the room.
     *
     * @param participants the participants value to set.
     * @return the CreateRoomRequest object itself.
     */
    public CreateRoomRequest setParticipants(Map<String, Object> participants) {
        this.participants = participants;
        return this;
    }
}
