// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.communication.rooms.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The CreateRoomResponse model. */
@Fluent
public final class CreateRoomResponse {
    /*
     * The meeting room.
     */
    @JsonProperty(value = "room", required = true)
    private RoomModel room;

    /*
     * Collection of participants failed to be added to the room
     */
    @JsonProperty(value = "invalidParticipants")
    private Map<String, Object> invalidParticipants;

    /**
     * Get the room property: The meeting room.
     *
     * @return the room value.
     */
    public RoomModel getRoom() {
        return this.room;
    }

    /**
     * Set the room property: The meeting room.
     *
     * @param room the room value to set.
     * @return the CreateRoomResponse object itself.
     */
    public CreateRoomResponse setRoom(RoomModel room) {
        this.room = room;
        return this;
    }

    /**
     * Get the invalidParticipants property: Collection of participants failed to be added to the room.
     *
     * @return the invalidParticipants value.
     */
    public Map<String, Object> getInvalidParticipants() {
        return this.invalidParticipants;
    }

    /**
     * Set the invalidParticipants property: Collection of participants failed to be added to the room.
     *
     * @param invalidParticipants the invalidParticipants value to set.
     * @return the CreateRoomResponse object itself.
     */
    public CreateRoomResponse setInvalidParticipants(Map<String, Object> invalidParticipants) {
        this.invalidParticipants = invalidParticipants;
        return this;
    }
}
