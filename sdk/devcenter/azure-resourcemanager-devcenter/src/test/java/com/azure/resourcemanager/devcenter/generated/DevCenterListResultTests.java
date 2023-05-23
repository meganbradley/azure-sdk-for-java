// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.DevCenterListResult;

public final class DevCenterListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DevCenterListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"devCenterUri\":\"gjxpybczmehmt\"},\"identity\":{\"principalId\":\"bb2bba87-a02b-4e09-80b1-cc9ed8ed2c49\",\"tenantId\":\"f9eed529-8424-485d-be91-fdd49a19f899\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"rupidgsyb\",\"tags\":{\"xaobhdxbmtqioqjz\":\"hphoycm\",\"ownoizhw\":\"htbmuf\"},\"id\":\"rxybqsoq\",\"name\":\"jgkdmbpazlobcu\",\"type\":\"pdznrbtcqqjnqgl\"},{\"properties\":{\"provisioningState\":\"Creating\",\"devCenterUri\":\"foooj\"},\"identity\":{\"principalId\":\"76dc2ea5-a1c6-4569-96d2-c059fab812ce\",\"tenantId\":\"ef815baf-87fd-4208-8320-1a1564173a64\",\"type\":\"None\",\"userAssignedIdentities\":{}},\"location\":\"saagdf\",\"tags\":{\"izntocipao\":\"zlhjxrifkwmrvkt\"},\"id\":\"ajpsquc\",\"name\":\"poyfdkfogkn\",\"type\":\"gjofjd\"},{\"properties\":{\"provisioningState\":\"NotSpecified\",\"devCenterUri\":\"deupewnwrei\"},\"identity\":{\"principalId\":\"a09f9afa-2073-48e0-b331-8d1bc33318f7\",\"tenantId\":\"319db240-f377-45be-8479-6c3edff9e2d3\",\"type\":\"UserAssigned\",\"userAssignedIdentities\":{}},\"location\":\"sarhmofc\",\"tags\":{\"rkdtmlxh\":\"my\"},\"id\":\"kuksjtxukcdm\",\"name\":\"arcryuanzwuxzdxt\",\"type\":\"yrlhmwhfpmrqobm\"}],\"nextLink\":\"kknryrtihf\"}")
                .toObject(DevCenterListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DevCenterListResult model = new DevCenterListResult();
        model = BinaryData.fromObject(model).toObject(DevCenterListResult.class);
    }
}
