// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.communication.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.communication.fluent.models.SenderUsernameResourceInner;
import com.azure.resourcemanager.communication.models.SenderUsernameResourceCollection;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SenderUsernameResourceCollectionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SenderUsernameResourceCollection model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"dataLocation\":\"nbpoczvyifqrvkdv\",\"username\":\"sllr\",\"displayName\":\"vdfwatkpn\",\"provisioningState\":\"Unknown\"},\"id\":\"xxbczwtr\",\"name\":\"wiqzbqjvsovmyo\",\"type\":\"acspkwl\"},{\"properties\":{\"dataLocation\":\"obpxjmflbvvn\",\"username\":\"hrk\",\"displayName\":\"iwwzjuqk\",\"provisioningState\":\"Failed\"},\"id\":\"jiwkuofoskghsau\",\"name\":\"imjm\",\"type\":\"xieduugidyjrr\"},{\"properties\":{\"dataLocation\":\"aos\",\"username\":\"e\",\"displayName\":\"sonpclhocohs\",\"provisioningState\":\"Unknown\"},\"id\":\"leggzfbu\",\"name\":\"fmvfaxkffeiit\",\"type\":\"lvmezyvshxmzsbbz\"},{\"properties\":{\"dataLocation\":\"igrxwburvjxxjn\",\"username\":\"pydptko\",\"displayName\":\"kouknvudwtiu\",\"provisioningState\":\"Unknown\"},\"id\":\"ngkpocipazy\",\"name\":\"o\",\"type\":\"gukgjnpiucgygevq\"}],\"nextLink\":\"typmrbpizcdrqjsd\"}")
            .toObject(SenderUsernameResourceCollection.class);
        Assertions.assertEquals("sllr", model.value().get(0).username());
        Assertions.assertEquals("vdfwatkpn", model.value().get(0).displayName());
        Assertions.assertEquals("typmrbpizcdrqjsd", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SenderUsernameResourceCollection model = new SenderUsernameResourceCollection()
            .withValue(
                Arrays.asList(new SenderUsernameResourceInner().withUsername("sllr").withDisplayName("vdfwatkpn"),
                    new SenderUsernameResourceInner().withUsername("hrk").withDisplayName("iwwzjuqk"),
                    new SenderUsernameResourceInner().withUsername("e").withDisplayName("sonpclhocohs"),
                    new SenderUsernameResourceInner().withUsername("pydptko").withDisplayName("kouknvudwtiu")))
            .withNextLink("typmrbpizcdrqjsd");
        model = BinaryData.fromObject(model).toObject(SenderUsernameResourceCollection.class);
        Assertions.assertEquals("sllr", model.value().get(0).username());
        Assertions.assertEquals("vdfwatkpn", model.value().get(0).displayName());
        Assertions.assertEquals("typmrbpizcdrqjsd", model.nextLink());
    }
}
