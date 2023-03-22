// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.SecurityContactProperties;
import com.azure.resourcemanager.security.models.MinimalSeverity;
import com.azure.resourcemanager.security.models.Roles;
import com.azure.resourcemanager.security.models.SecurityContactPropertiesAlertNotifications;
import com.azure.resourcemanager.security.models.SecurityContactPropertiesNotificationsByRole;
import com.azure.resourcemanager.security.models.State;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class SecurityContactPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SecurityContactProperties model =
            BinaryData
                .fromString(
                    "{\"emails\":\"u\",\"phone\":\"ypbsfgytguslfead\",\"alertNotifications\":{\"state\":\"Skipped\",\"minimalSeverity\":\"High\"},\"notificationsByRole\":{\"state\":\"Failed\",\"roles\":[\"AccountAdmin\"]}}")
                .toObject(SecurityContactProperties.class);
        Assertions.assertEquals("u", model.emails());
        Assertions.assertEquals("ypbsfgytguslfead", model.phone());
        Assertions.assertEquals(State.SKIPPED, model.alertNotifications().state());
        Assertions.assertEquals(MinimalSeverity.HIGH, model.alertNotifications().minimalSeverity());
        Assertions.assertEquals(State.FAILED, model.notificationsByRole().state());
        Assertions.assertEquals(Roles.ACCOUNT_ADMIN, model.notificationsByRole().roles().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SecurityContactProperties model =
            new SecurityContactProperties()
                .withEmails("u")
                .withPhone("ypbsfgytguslfead")
                .withAlertNotifications(
                    new SecurityContactPropertiesAlertNotifications()
                        .withState(State.SKIPPED)
                        .withMinimalSeverity(MinimalSeverity.HIGH))
                .withNotificationsByRole(
                    new SecurityContactPropertiesNotificationsByRole()
                        .withState(State.FAILED)
                        .withRoles(Arrays.asList(Roles.ACCOUNT_ADMIN)));
        model = BinaryData.fromObject(model).toObject(SecurityContactProperties.class);
        Assertions.assertEquals("u", model.emails());
        Assertions.assertEquals("ypbsfgytguslfead", model.phone());
        Assertions.assertEquals(State.SKIPPED, model.alertNotifications().state());
        Assertions.assertEquals(MinimalSeverity.HIGH, model.alertNotifications().minimalSeverity());
        Assertions.assertEquals(State.FAILED, model.notificationsByRole().state());
        Assertions.assertEquals(Roles.ACCOUNT_ADMIN, model.notificationsByRole().roles().get(0));
    }
}
