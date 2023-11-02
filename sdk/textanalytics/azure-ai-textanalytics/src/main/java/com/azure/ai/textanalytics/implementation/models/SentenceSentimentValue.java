// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.textanalytics.implementation.models;

/** The predicted Sentiment for the sentence. */
public enum SentenceSentimentValue {
    /** Enum value positive. */
    POSITIVE("positive"),

    /** Enum value neutral. */
    NEUTRAL("neutral"),

    /** Enum value negative. */
    NEGATIVE("negative");

    /** The actual serialized value for a SentenceSentimentValue instance. */
    private final String value;

    SentenceSentimentValue(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a SentenceSentimentValue instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed SentenceSentimentValue object, or null if unable to parse.
     */
    public static SentenceSentimentValue fromString(String value) {
        if (value == null) {
            return null;
        }
        SentenceSentimentValue[] items = SentenceSentimentValue.values();
        for (SentenceSentimentValue item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return this.value;
    }
}
