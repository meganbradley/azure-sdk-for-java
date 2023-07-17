// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.cosmos;

import com.azure.cosmos.implementation.Utils;
import com.azure.cosmos.models.ChangeFeedProcessorItem;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;

public class ChangeFeedProcessorItemSerializerTest {

    private final ObjectMapper simpleObjectMapper = Utils.getSimpleObjectMapper();

    @Test(groups = { "unit" })
    public void testChangeFeedMetaDataDeSerializer() throws JsonProcessingException {
        String json = "{\"lsn\":68,\"crts\":1689555410,\"operationType\":\"replace\",\"previousImageLSN\":66}";
        JsonNode jsonNode = simpleObjectMapper.readValue(json, JsonNode.class);
        Assertions.assertThat(jsonNode.get("crts").asText()).isEqualTo("1689555410");

        json = "{\"lsn\":68,\"crts\":1689555412,\"operationType\":\"replace\",\"previousImageLSN\":66}";
        jsonNode = simpleObjectMapper.readValue(json, JsonNode.class);
        Assertions.assertThat(jsonNode.get("crts").asText()).isEqualTo("1689555412");
    }

    @Test(groups = { "unit" })
    public void testCreateChangeFeedProcessorItemDeSerializer() throws JsonProcessingException {
        String json = "{\"current\":{\"id\":\"1946c04a-070b-48c0-8e36-517c8d2f92ed\",\"mypk\":\"mypk-1\",\"prop\":\"Johnson\",\"_rid\":\"NopBALG34lcBAAAAAAAAAA==\",\"_self\":\"dbs/NopBAA==/colls/NopBALG34lc=/docs/NopBALG34lcBAAAAAAAAAA==/\",\"_etag\":\"\\\"00000000-0000-0000-b857-fd9e73fb01d9\\\"\",\"_attachments\":\"attachments/\",\"_ts\":1689561604},\"metadata\":{\"lsn\":176,\"crts\":1689561600,\"operationType\":\"create\"}}";
        ChangeFeedProcessorItem changeFeedProcessorItem = simpleObjectMapper.readValue(json, ChangeFeedProcessorItem.class);
        JsonNode jsonNode = changeFeedProcessorItem.toJsonNode();
        Assertions.assertThat(jsonNode.get("metadata").get("crts").asText()).isEqualTo("1689561600");

        json = "{\"current\":{\"id\":\"1946c04a-070b-48c0-8e36-517c8d2f92ed\",\"mypk\":\"mypk-1\",\"prop\":\"Johnson\",\"_rid\":\"NopBALG34lcBAAAAAAAAAA==\",\"_self\":\"dbs/NopBAA==/colls/NopBALG34lc=/docs/NopBALG34lcBAAAAAAAAAA==/\",\"_etag\":\"\\\"00000000-0000-0000-b857-fd9e73fb01d9\\\"\",\"_attachments\":\"attachments/\",\"_ts\":1689561604},\"metadata\":{\"lsn\":176,\"crts\":1689561605,\"operationType\":\"create\"}}";
        changeFeedProcessorItem = simpleObjectMapper.readValue(json, ChangeFeedProcessorItem.class);
        jsonNode = changeFeedProcessorItem.toJsonNode();
        Assertions.assertThat(jsonNode.get("metadata").get("crts").asText()).isEqualTo("1689561605");
    }

    @Test(groups = { "unit" })
    public void testReplaceChangeFeedProcessorItemDeSerializer() throws JsonProcessingException {
        String json = "{\"current\":{\"id\":\"1946c04a-070b-48c0-8e36-517c8d2f92ed\",\"mypk\":\"mypk-1\",\"prop\":\"Gates\",\"_rid\":\"NopBALG34lcBAAAAAAAAAA==\",\"_self\":\"dbs/NopBAA==/colls/NopBALG34lc=/docs/NopBALG34lcBAAAAAAAAAA==/\",\"_etag\":\"\\\"00000000-0000-0000-b857-fda256f201d9\\\"\",\"_attachments\":\"attachments/\",\"_ts\":1689561604},\"metadata\":{\"lsn\":178,\"crts\":1689561600,\"operationType\":\"replace\",\"previousImageLSN\":176}}";
        ChangeFeedProcessorItem changeFeedProcessorItem = simpleObjectMapper.readValue(json, ChangeFeedProcessorItem.class);
        JsonNode jsonNode = changeFeedProcessorItem.toJsonNode();
        Assertions.assertThat(jsonNode.get("metadata").get("crts").asText()).isEqualTo("1689561600");

        json = "{\"current\":{\"id\":\"1946c04a-070b-48c0-8e36-517c8d2f92ed\",\"mypk\":\"mypk-1\",\"prop\":\"Gates\",\"_rid\":\"NopBALG34lcBAAAAAAAAAA==\",\"_self\":\"dbs/NopBAA==/colls/NopBALG34lc=/docs/NopBALG34lcBAAAAAAAAAA==/\",\"_etag\":\"\\\"00000000-0000-0000-b857-fda256f201d9\\\"\",\"_attachments\":\"attachments/\",\"_ts\":1689561604},\"metadata\":{\"lsn\":178,\"crts\":1689561608,\"operationType\":\"replace\",\"previousImageLSN\":176}}";
        changeFeedProcessorItem = simpleObjectMapper.readValue(json, ChangeFeedProcessorItem.class);
        jsonNode = changeFeedProcessorItem.toJsonNode();
        Assertions.assertThat(jsonNode.get("metadata").get("crts").asText()).isEqualTo("1689561608");
    }
}