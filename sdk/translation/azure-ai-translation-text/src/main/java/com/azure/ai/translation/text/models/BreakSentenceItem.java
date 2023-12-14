// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.ai.translation.text.models;

import com.azure.core.annotation.Generated;
import com.azure.core.annotation.Immutable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * Item containing break sentence result.
 */
@Immutable
public final class BreakSentenceItem {
    /*
     * The detectedLanguage property is only present in the result object when language auto-detection is requested.
     */
    @Generated
    @JsonProperty(value = "detectedLanguage")
    private DetectedLanguage detectedLanguage;

    /*
     * An integer array representing the lengths of the sentences in the input text.
     * The length of the array is the number of sentences, and the values are the length of each sentence.
     */
    @Generated
    @JsonProperty(value = "sentLen")
    private List<Integer> sentLen;

    /**
     * Creates an instance of BreakSentenceItem class.
     * 
     * @param sentLen the sentLen value to set.
     */
    @Generated
    @JsonCreator
    private BreakSentenceItem(@JsonProperty(value = "sentLen") List<Integer> sentLen) {
        this.sentLen = sentLen;
    }

    /**
     * Get the detectedLanguage property: The detectedLanguage property is only present in the result object when
     * language auto-detection is requested.
     * 
     * @return the detectedLanguage value.
     */
    @Generated
    public DetectedLanguage getDetectedLanguage() {
        return this.detectedLanguage;
    }

    /**
     * Get the sentLen property: An integer array representing the lengths of the sentences in the input text.
     * The length of the array is the number of sentences, and the values are the length of each sentence.
     * 
     * @return the sentLen value.
     */
    @Generated
    public List<Integer> getSentLen() {
        return this.sentLen;
    }
}
