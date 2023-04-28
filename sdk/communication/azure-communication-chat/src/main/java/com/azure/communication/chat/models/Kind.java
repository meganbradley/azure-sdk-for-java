package com.azure.communication.chat.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Kind. */
public final class Kind extends ExpandableStringEnum<Kind> {
    /** Static value threadCreationDate for Kind. */
    public static final Kind THREAD_CREATION_DATE = fromString("threadCreationDate");

    /**
     * Creates or finds a Kind from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Kind.
     */
    @JsonCreator
    public static Kind fromString(String name) {
        return fromString(name, Kind.class);
    }

    /** @return known Kind values. */
    public static Collection<Kind> values() {
        return values(Kind.class);
    }
}
