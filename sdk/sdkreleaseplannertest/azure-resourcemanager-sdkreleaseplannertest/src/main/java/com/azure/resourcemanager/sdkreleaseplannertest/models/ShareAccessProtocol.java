// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sdkreleaseplannertest.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Access protocol to be used by the share. */
public final class ShareAccessProtocol extends ExpandableStringEnum<ShareAccessProtocol> {
    /** Static value SMB for ShareAccessProtocol. */
    public static final ShareAccessProtocol SMB = fromString("SMB");

    /** Static value NFS for ShareAccessProtocol. */
    public static final ShareAccessProtocol NFS = fromString("NFS");

    /**
     * Creates a new instance of ShareAccessProtocol value.
     *
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public ShareAccessProtocol() {
    }

    /**
     * Creates or finds a ShareAccessProtocol from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ShareAccessProtocol.
     */
    @JsonCreator
    public static ShareAccessProtocol fromString(String name) {
        return fromString(name, ShareAccessProtocol.class);
    }

    /**
     * Gets known ShareAccessProtocol values.
     *
     * @return known ShareAccessProtocol values.
     */
    public static Collection<ShareAccessProtocol> values() {
        return values(ShareAccessProtocol.class);
    }
}
