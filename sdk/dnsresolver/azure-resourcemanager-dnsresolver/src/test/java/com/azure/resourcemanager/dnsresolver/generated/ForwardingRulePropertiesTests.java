// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dnsresolver.fluent.models.ForwardingRuleProperties;
import com.azure.resourcemanager.dnsresolver.models.ForwardingRuleState;
import com.azure.resourcemanager.dnsresolver.models.TargetDnsServer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ForwardingRulePropertiesTests {
    @Test
    public void testDeserialize() {
        ForwardingRuleProperties model =
            BinaryData
                .fromString(
                    "{\"domainName\":\"jfeallnwsub\",\"targetDnsServers\":[{\"ipAddress\":\"njampm\",\"port\":1365754949},{\"ipAddress\":\"zscxaqwo\",\"port\":1004687873},{\"ipAddress\":\"cbonqvpk\",\"port\":1873646059}],\"metadata\":{\"pheoflokeyy\":\"jease\",\"jp\":\"enjbdlwtgrhp\",\"e\":\"umasxazjpq\",\"zvdudgwdslfhotwm\":\"ualhbxxhejj\"},\"forwardingRuleState\":\"Disabled\",\"provisioningState\":\"Succeeded\"}")
                .toObject(ForwardingRuleProperties.class);
        Assertions.assertEquals("jfeallnwsub", model.domainName());
        Assertions.assertEquals("njampm", model.targetDnsServers().get(0).ipAddress());
        Assertions.assertEquals(1365754949, model.targetDnsServers().get(0).port());
        Assertions.assertEquals("jease", model.metadata().get("pheoflokeyy"));
        Assertions.assertEquals(ForwardingRuleState.DISABLED, model.forwardingRuleState());
    }

    @Test
    public void testSerialize() {
        ForwardingRuleProperties model =
            new ForwardingRuleProperties()
                .withDomainName("jfeallnwsub")
                .withTargetDnsServers(
                    Arrays
                        .asList(
                            new TargetDnsServer().withIpAddress("njampm").withPort(1365754949),
                            new TargetDnsServer().withIpAddress("zscxaqwo").withPort(1004687873),
                            new TargetDnsServer().withIpAddress("cbonqvpk").withPort(1873646059)))
                .withMetadata(
                    mapOf(
                        "pheoflokeyy",
                        "jease",
                        "jp",
                        "enjbdlwtgrhp",
                        "e",
                        "umasxazjpq",
                        "zvdudgwdslfhotwm",
                        "ualhbxxhejj"))
                .withForwardingRuleState(ForwardingRuleState.DISABLED);
        model = BinaryData.fromObject(model).toObject(ForwardingRuleProperties.class);
        Assertions.assertEquals("jfeallnwsub", model.domainName());
        Assertions.assertEquals("njampm", model.targetDnsServers().get(0).ipAddress());
        Assertions.assertEquals(1365754949, model.targetDnsServers().get(0).port());
        Assertions.assertEquals("jease", model.metadata().get("pheoflokeyy"));
        Assertions.assertEquals(ForwardingRuleState.DISABLED, model.forwardingRuleState());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
