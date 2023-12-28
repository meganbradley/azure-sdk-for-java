// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.SourceAddr;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SourceAddrTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SourceAddr model = BinaryData.fromString(
            "{\"cidrs\":[\"jhxxjyn\"],\"countries\":[\"ivkrtsw\",\"xqzvszjfa\"],\"feeds\":[\"fdxxivetvtcqaqtd\"],\"prefixLists\":[\"cbxvwvxyslqbh\",\"fxoblytkb\",\"mpew\"]}")
            .toObject(SourceAddr.class);
        Assertions.assertEquals("jhxxjyn", model.cidrs().get(0));
        Assertions.assertEquals("ivkrtsw", model.countries().get(0));
        Assertions.assertEquals("fdxxivetvtcqaqtd", model.feeds().get(0));
        Assertions.assertEquals("cbxvwvxyslqbh", model.prefixLists().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SourceAddr model = new SourceAddr().withCidrs(Arrays.asList("jhxxjyn"))
            .withCountries(Arrays.asList("ivkrtsw", "xqzvszjfa")).withFeeds(Arrays.asList("fdxxivetvtcqaqtd"))
            .withPrefixLists(Arrays.asList("cbxvwvxyslqbh", "fxoblytkb", "mpew"));
        model = BinaryData.fromObject(model).toObject(SourceAddr.class);
        Assertions.assertEquals("jhxxjyn", model.cidrs().get(0));
        Assertions.assertEquals("ivkrtsw", model.countries().get(0));
        Assertions.assertEquals("fdxxivetvtcqaqtd", model.feeds().get(0));
        Assertions.assertEquals("cbxvwvxyslqbh", model.prefixLists().get(0));
    }
}
