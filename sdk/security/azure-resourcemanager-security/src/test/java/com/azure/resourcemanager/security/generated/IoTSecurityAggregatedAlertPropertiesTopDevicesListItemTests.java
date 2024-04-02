// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.models.IoTSecurityAggregatedAlertPropertiesTopDevicesListItem;

public final class IoTSecurityAggregatedAlertPropertiesTopDevicesListItemTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IoTSecurityAggregatedAlertPropertiesTopDevicesListItem model = BinaryData.fromString(
            "{\"deviceId\":\"jdrqcrjidhftu\",\"alertsCount\":5219275983415576474,\"lastOccurrence\":\"lwyojbfqzdkfnj\"}")
            .toObject(IoTSecurityAggregatedAlertPropertiesTopDevicesListItem.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IoTSecurityAggregatedAlertPropertiesTopDevicesListItem model
            = new IoTSecurityAggregatedAlertPropertiesTopDevicesListItem();
        model = BinaryData.fromObject(model).toObject(IoTSecurityAggregatedAlertPropertiesTopDevicesListItem.class);
    }
}
