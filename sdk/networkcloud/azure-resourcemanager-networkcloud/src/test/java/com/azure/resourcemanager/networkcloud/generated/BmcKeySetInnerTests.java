// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.networkcloud.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.networkcloud.fluent.models.BmcKeySetInner;
import com.azure.resourcemanager.networkcloud.models.BmcKeySetPrivilegeLevel;
import com.azure.resourcemanager.networkcloud.models.ExtendedLocation;
import com.azure.resourcemanager.networkcloud.models.KeySetUser;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BmcKeySetInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BmcKeySetInner model =
            BinaryData
                .fromString(
                    "{\"extendedLocation\":{\"name\":\"xqhndvnoamlds\",\"type\":\"haohdjhhflzokxc\"},\"properties\":{\"azureGroupId\":\"xpelnjetagltsx\",\"detailedStatus\":\"AllActive\",\"detailedStatusMessage\":\"tgzpnpb\",\"expiration\":\"2021-09-09T07:57:24Z\",\"lastValidation\":\"2021-04-26T08:51:39Z\",\"privilegeLevel\":\"Administrator\",\"provisioningState\":\"Succeeded\",\"userList\":[{\"azureUserName\":\"cs\",\"description\":\"ozihmipgawt\"},{\"azureUserName\":\"xp\",\"description\":\"jcxcjxgrytfmpcyc\"},{\"azureUserName\":\"lrmcaykg\",\"description\":\"oxuztrksx\"},{\"azureUserName\":\"pndfcpfnznt\",\"description\":\"twk\"}],\"userListStatus\":[{\"azureUserName\":\"rxuzvoam\",\"status\":\"Invalid\",\"statusMessage\":\"iosmgbzahgxqdly\"},{\"azureUserName\":\"ltlaprltzkatbhj\",\"status\":\"Invalid\",\"statusMessage\":\"bsoqeqala\"},{\"azureUserName\":\"lagun\",\"status\":\"Active\",\"statusMessage\":\"ebwlnbmhyreeudzq\"}]},\"location\":\"bpdqmjxlyy\",\"tags\":{\"yuojqtobaxk\":\"gouwtlmj\",\"lbfjkwr\":\"eytu\",\"hsyrqunj\":\"snkq\"},\"id\":\"hdenxaulk\",\"name\":\"akdkifmjnnawtqab\",\"type\":\"xuckpggqoweyir\"}")
                .toObject(BmcKeySetInner.class);
        Assertions.assertEquals("bpdqmjxlyy", model.location());
        Assertions.assertEquals("gouwtlmj", model.tags().get("yuojqtobaxk"));
        Assertions.assertEquals("xqhndvnoamlds", model.extendedLocation().name());
        Assertions.assertEquals("haohdjhhflzokxc", model.extendedLocation().type());
        Assertions.assertEquals("xpelnjetagltsx", model.azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-09T07:57:24Z"), model.expiration());
        Assertions.assertEquals(BmcKeySetPrivilegeLevel.ADMINISTRATOR, model.privilegeLevel());
        Assertions.assertEquals("cs", model.userList().get(0).azureUsername());
        Assertions.assertEquals("ozihmipgawt", model.userList().get(0).description());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BmcKeySetInner model =
            new BmcKeySetInner()
                .withLocation("bpdqmjxlyy")
                .withTags(mapOf("yuojqtobaxk", "gouwtlmj", "lbfjkwr", "eytu", "hsyrqunj", "snkq"))
                .withExtendedLocation(new ExtendedLocation().withName("xqhndvnoamlds").withType("haohdjhhflzokxc"))
                .withAzureGroupId("xpelnjetagltsx")
                .withExpiration(OffsetDateTime.parse("2021-09-09T07:57:24Z"))
                .withPrivilegeLevel(BmcKeySetPrivilegeLevel.ADMINISTRATOR)
                .withUserList(
                    Arrays
                        .asList(
                            new KeySetUser().withAzureUsername("cs").withDescription("ozihmipgawt"),
                            new KeySetUser().withAzureUsername("xp").withDescription("jcxcjxgrytfmpcyc"),
                            new KeySetUser().withAzureUsername("lrmcaykg").withDescription("oxuztrksx"),
                            new KeySetUser().withAzureUsername("pndfcpfnznt").withDescription("twk")));
        model = BinaryData.fromObject(model).toObject(BmcKeySetInner.class);
        Assertions.assertEquals("bpdqmjxlyy", model.location());
        Assertions.assertEquals("gouwtlmj", model.tags().get("yuojqtobaxk"));
        Assertions.assertEquals("xqhndvnoamlds", model.extendedLocation().name());
        Assertions.assertEquals("haohdjhhflzokxc", model.extendedLocation().type());
        Assertions.assertEquals("xpelnjetagltsx", model.azureGroupId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-09T07:57:24Z"), model.expiration());
        Assertions.assertEquals(BmcKeySetPrivilegeLevel.ADMINISTRATOR, model.privilegeLevel());
        Assertions.assertEquals("cs", model.userList().get(0).azureUsername());
        Assertions.assertEquals("ozihmipgawt", model.userList().get(0).description());
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
