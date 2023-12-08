// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.keys.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;

/** Action and its trigger that will be performed by Key Vault over the lifetime of a key. */
@Fluent
public final class LifetimeActions implements JsonSerializable<LifetimeActions> {
    /*
     * The condition that will execute the action.
     */
    private LifetimeActionsTrigger trigger;

    /*
     * The action that will be executed.
     */
    private LifetimeActionsType action;

    /** Creates an instance of LifetimeActions class. */
    public LifetimeActions() {}

    /**
     * Get the trigger property: The condition that will execute the action.
     *
     * @return the trigger value.
     */
    public LifetimeActionsTrigger getTrigger() {
        return this.trigger;
    }

    /**
     * Set the trigger property: The condition that will execute the action.
     *
     * @param trigger the trigger value to set.
     * @return the LifetimeActions object itself.
     */
    public LifetimeActions setTrigger(LifetimeActionsTrigger trigger) {
        this.trigger = trigger;
        return this;
    }

    /**
     * Get the action property: The action that will be executed.
     *
     * @return the action value.
     */
    public LifetimeActionsType getAction() {
        return this.action;
    }

    /**
     * Set the action property: The action that will be executed.
     *
     * @param action the action value to set.
     * @return the LifetimeActions object itself.
     */
    public LifetimeActions setAction(LifetimeActionsType action) {
        this.action = action;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeJsonField("trigger", this.trigger);
        jsonWriter.writeJsonField("action", this.action);
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of LifetimeActions from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of LifetimeActions if the JsonReader was pointing to an instance of it, or null if it was
     *     pointing to JSON null.
     * @throws IOException If an error occurs while reading the LifetimeActions.
     */
    public static LifetimeActions fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    LifetimeActions deserializedLifetimeActions = new LifetimeActions();
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("trigger".equals(fieldName)) {
                            deserializedLifetimeActions.trigger = LifetimeActionsTrigger.fromJson(reader);
                        } else if ("action".equals(fieldName)) {
                            deserializedLifetimeActions.action = LifetimeActionsType.fromJson(reader);
                        } else {
                            reader.skipChildren();
                        }
                    }

                    return deserializedLifetimeActions;
                });
    }
}
