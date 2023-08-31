// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.ai.openai.models;

import com.azure.core.annotation.Generated;
import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Audio transcription task type. */
public final class AudioTranscriptionTask extends ExpandableStringEnum<AudioTranscriptionTask> {

    /** Value for a transcription task. */
    @Generated public static final AudioTranscriptionTask TRANSCRIBE = fromString("transcribe");

    /** Value for a translation task. */
    @Generated public static final AudioTranscriptionTask TRANSLATE = fromString("translate");

    /**
     * Creates a new instance of AudioTranscriptionTask value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Generated
    @Deprecated
    public AudioTranscriptionTask() {}

    /**
     * Creates or finds a AudioTranscriptionTask from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding AudioTranscriptionTask.
     */
    @Generated
    @JsonCreator
    public static AudioTranscriptionTask fromString(String name) {
        return fromString(name, AudioTranscriptionTask.class);
    }

    /**
     * Gets known AudioTranscriptionTask values.
     *
     * @return known AudioTranscriptionTask values.
     */
    @Generated
    public static Collection<AudioTranscriptionTask> values() {
        return values(AudioTranscriptionTask.class);
    }
}
