// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.AutoProvisioningSettingInner;
import com.azure.resourcemanager.security.models.AutoProvision;
import com.azure.resourcemanager.security.models.AutoProvisioningSettingList;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class AutoProvisioningSettingListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        AutoProvisioningSettingList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"autoProvision\":\"On\"},\"id\":\"tbvpysszdnru\",\"name\":\"qguhmuo\",\"type\":\"qfprwzwbn\"},{\"properties\":{\"autoProvision\":\"Off\"},\"id\":\"tnwu\",\"name\":\"zga\",\"type\":\"x\"}],\"nextLink\":\"izuckyfihrfidfvz\"}")
            .toObject(AutoProvisioningSettingList.class);
        Assertions.assertEquals(AutoProvision.ON, model.value().get(0).autoProvision());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        AutoProvisioningSettingList model = new AutoProvisioningSettingList()
            .withValue(Arrays.asList(new AutoProvisioningSettingInner().withAutoProvision(AutoProvision.ON),
                new AutoProvisioningSettingInner().withAutoProvision(AutoProvision.OFF)));
        model = BinaryData.fromObject(model).toObject(AutoProvisioningSettingList.class);
        Assertions.assertEquals(AutoProvision.ON, model.value().get(0).autoProvision());
    }
}
