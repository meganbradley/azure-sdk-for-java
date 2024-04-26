// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.support.fluent.models.ChatTranscriptDetailsInner;
import com.azure.resourcemanager.support.models.ChatTranscriptsListResult;
import com.azure.resourcemanager.support.models.MessageProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ChatTranscriptsListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ChatTranscriptsListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"messages\":[{\"communicationDirection\":\"inbound\",\"sender\":\"ppcqeqxolz\",\"body\":\"hzxct\",\"createdDate\":\"2021-10-01T04:47:29Z\"},{\"communicationDirection\":\"outbound\",\"sender\":\"oizpostmgrcfbun\",\"body\":\"fqjhhkxbpvjymj\",\"createdDate\":\"2021-07-29T03:03:57Z\"}],\"startTime\":\"2021-12-01T23:11:57Z\"},\"id\":\"gudivkrtswbxqz\",\"name\":\"szjfauvjfdxxivet\",\"type\":\"t\"},{\"properties\":{\"messages\":[{\"communicationDirection\":\"outbound\",\"sender\":\"mcbxvwvxysl\",\"body\":\"hsfxoblytkb\",\"createdDate\":\"2021-09-21T19:24:42Z\"}],\"startTime\":\"2021-02-10T08:31:36Z\"},\"id\":\"wfbkrvrns\",\"name\":\"shqjohxcrsbf\",\"type\":\"vasrruvwb\"}],\"nextLink\":\"qfsubcgjbirx\"}")
            .toObject(ChatTranscriptsListResult.class);
        Assertions.assertEquals("ppcqeqxolz", model.value().get(0).messages().get(0).sender());
        Assertions.assertEquals("hzxct", model.value().get(0).messages().get(0).body());
        Assertions.assertEquals("qfsubcgjbirx", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ChatTranscriptsListResult model = new ChatTranscriptsListResult()
            .withValue(Arrays.asList(
                new ChatTranscriptDetailsInner()
                    .withMessages(Arrays.asList(new MessageProperties().withSender("ppcqeqxolz").withBody("hzxct"),
                        new MessageProperties().withSender("oizpostmgrcfbun").withBody("fqjhhkxbpvjymj"))),
                new ChatTranscriptDetailsInner().withMessages(
                    Arrays.asList(new MessageProperties().withSender("mcbxvwvxysl").withBody("hsfxoblytkb")))))
            .withNextLink("qfsubcgjbirx");
        model = BinaryData.fromObject(model).toObject(ChatTranscriptsListResult.class);
        Assertions.assertEquals("ppcqeqxolz", model.value().get(0).messages().get(0).sender());
        Assertions.assertEquals("hzxct", model.value().get(0).messages().get(0).body());
        Assertions.assertEquals("qfsubcgjbirx", model.nextLink());
    }
}
