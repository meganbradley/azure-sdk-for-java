// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcompute.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcompute.models.PrivateEndpointConnectionListResult;

public final class PrivateEndpointConnectionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PrivateEndpointConnectionListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"privateEndpoint\":{\"id\":\"hdmsmlmzqhoftrm\"},\"privateLinkServiceConnectionState\":{\"status\":\"qu\",\"description\":\"ah\",\"actionsRequired\":\"cslfaoqzpiyylha\"},\"provisioningState\":\"swhccsphk\",\"groupIds\":[\"witqscywuggwoluh\",\"zbwemh\",\"i\"]},\"id\":\"brgz\",\"name\":\"wmsweypqwd\",\"type\":\"ggicccnxqhue\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"tlstvlzywem\"},\"privateLinkServiceConnectionState\":{\"status\":\"rncsdtclu\",\"description\":\"iypbsfgytgusl\",\"actionsRequired\":\"adcy\"},\"provisioningState\":\"ukyhejhzis\",\"groupIds\":[\"pelol\"]},\"id\":\"vk\",\"name\":\"r\",\"type\":\"qvujzraehtwdwrf\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"byrcdlbhshfwp\"},\"privateLinkServiceConnectionState\":{\"status\":\"cstwity\",\"description\":\"hevxcced\",\"actionsRequired\":\"nmdyodnwzxl\"},\"provisioningState\":\"cvnhltiugc\",\"groupIds\":[\"vvwxqi\",\"y\"]},\"id\":\"nyowxwlmdjrkvfg\",\"name\":\"vfvpdbodaciz\",\"type\":\"j\"},{\"properties\":{\"privateEndpoint\":{\"id\":\"rribd\"},\"privateLinkServiceConnectionState\":{\"status\":\"b\",\"description\":\"ipqkghvxndzwm\",\"actionsRequired\":\"efajpj\"},\"provisioningState\":\"wkqnyhg\",\"groupIds\":[\"tjivfxzsjabib\"]},\"id\":\"stawfsdjpvkv\",\"name\":\"bjxbkzbzk\",\"type\":\"vncjabudurgk\"}],\"nextLink\":\"mokzhjjklf\"}")
                .toObject(PrivateEndpointConnectionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PrivateEndpointConnectionListResult model = new PrivateEndpointConnectionListResult();
        model = BinaryData.fromObject(model).toObject(PrivateEndpointConnectionListResult.class);
    }
}
