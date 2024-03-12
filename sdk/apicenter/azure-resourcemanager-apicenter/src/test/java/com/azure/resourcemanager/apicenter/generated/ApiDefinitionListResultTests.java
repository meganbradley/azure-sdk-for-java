// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apicenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apicenter.models.ApiDefinitionListResult;

public final class ApiDefinitionListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ApiDefinitionListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"title\":\"sthsu\",\"description\":\"cmnyyazttb\",\"specification\":{\"name\":\"rq\",\"version\":\"edckzywbiexzfey\"}},\"id\":\"axibxujw\",\"name\":\"hqwa\",\"type\":\"muzyoxaepdk\"},{\"properties\":{\"title\":\"ancuxrhd\",\"description\":\"avxbniwdjswztsdb\",\"specification\":{\"name\":\"xytxhpzxbz\",\"version\":\"zabglcuhxwt\"}},\"id\":\"yqiklbbovplwzb\",\"name\":\"vgyuguos\",\"type\":\"mkfssxqukkfplgm\"},{\"properties\":{\"title\":\"xnkjzkdesl\",\"description\":\"lopwiyig\",\"specification\":{\"name\":\"kdwzbaiuebbaumny\",\"version\":\"ped\"}},\"id\":\"jn\",\"name\":\"bckhsmtxpsi\",\"type\":\"btfhvpesaps\"},{\"properties\":{\"title\":\"dqmh\",\"description\":\"dhtldwkyz\",\"specification\":{\"name\":\"tkncwsc\",\"version\":\"vlxotogtwrupqsx\"}},\"id\":\"micykvceoveilo\",\"name\":\"notyfjfcnjbkcn\",\"type\":\"dhbt\"}],\"nextLink\":\"phywpnvj\"}")
            .toObject(ApiDefinitionListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ApiDefinitionListResult model = new ApiDefinitionListResult();
        model = BinaryData.fromObject(model).toObject(ApiDefinitionListResult.class);
    }
}
