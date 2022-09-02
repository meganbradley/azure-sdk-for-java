// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.communication.rooms.models.RoomJoinPolicy;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** Request payload for updating a room. */
@Fluent
public final class UpdateRoomRequest {
    /*
     * (Optional) The timestamp from when the room is open for joining. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "validFrom")
    private OffsetDateTime validFrom;

    /*
     * (Optional) The timestamp from when the room can no longer be joined. The
     * timestamp is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     */
    @JsonProperty(value = "validUntil")
    private OffsetDateTime validUntil;

    /*
     * The Policy based on which Participants can join a room.
     */
    @JsonProperty(value = "roomJoinPolicy")
    private RoomJoinPolicy roomJoinPolicy;

    /*
     * Collection of room participants.
     */
    @JsonProperty(value = "participants")
    private List<RoomParticipant> participants;

    /**
     * Get the validFrom property: (Optional) The timestamp from when the room is open for joining. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the validFrom value.
     */
    public OffsetDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     * Set the validFrom property: (Optional) The timestamp from when the room is open for joining. The timestamp is in
     * RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param validFrom the validFrom value to set.
     * @return the UpdateRoomRequest object itself.
     */
    public UpdateRoomRequest setValidFrom(OffsetDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     * Get the validUntil property: (Optional) The timestamp from when the room can no longer be joined. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @return the validUntil value.
     */
    public OffsetDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     * Set the validUntil property: (Optional) The timestamp from when the room can no longer be joined. The timestamp
     * is in RFC3339 format: `yyyy-MM-ddTHH:mm:ssZ`.
     *
     * @param validUntil the validUntil value to set.
     * @return the UpdateRoomRequest object itself.
     */
    public UpdateRoomRequest setValidUntil(OffsetDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     * Get the roomJoinPolicy property: The Policy based on which Participants can join a room.
     *
     * @return the roomJoinPolicy value.
     */
    public RoomJoinPolicy getRoomJoinPolicy() {
        return this.roomJoinPolicy;
    }

    /**
     * Set the roomJoinPolicy property: The Policy based on which Participants can join a room.
     *
     * @param roomJoinPolicy the roomJoinPolicy value to set.
     * @return the UpdateRoomRequest object itself.
     */
    public UpdateRoomRequest setRoomJoinPolicy(RoomJoinPolicy roomJoinPolicy) {
        this.roomJoinPolicy = roomJoinPolicy;
        return this;
    }

    /**
     * Get the participants property: Collection of room participants.
     *
     * @return the participants value.
     */
    public List<RoomParticipant> getParticipants() {
        return this.participants;
    }

    /**
     * Set the participants property: Collection of room participants.
     *
     * @param participants the participants value to set.
     * @return the UpdateRoomRequest object itself.
     */
    public UpdateRoomRequest setParticipants(List<RoomParticipant> participants) {
        this.participants = participants;
        return this;
    }
}
