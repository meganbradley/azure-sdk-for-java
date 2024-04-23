// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DbLevelValidationStatus;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationMessage;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationState;
import com.azure.resourcemanager.postgresqlflexibleserver.models.ValidationSummaryItem;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DbLevelValidationStatusTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DbLevelValidationStatus model = BinaryData.fromString(
            "{\"databaseName\":\"i\",\"startedOn\":\"2021-11-01T17:10:34Z\",\"endedOn\":\"2021-09-29T21:57:11Z\",\"summary\":[{\"type\":\"r\",\"state\":\"Failed\",\"messages\":[{\"state\":\"Failed\",\"message\":\"r\"},{\"state\":\"Succeeded\",\"message\":\"squyfxrxxlep\"},{\"state\":\"Succeeded\",\"message\":\"xje\"}]},{\"type\":\"lwnwxuqlcvydyp\",\"state\":\"Succeeded\",\"messages\":[{\"state\":\"Failed\",\"message\":\"kniod\"}]}]}")
            .toObject(DbLevelValidationStatus.class);
        Assertions.assertEquals("i", model.databaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-01T17:10:34Z"), model.startedOn());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-29T21:57:11Z"), model.endedOn());
        Assertions.assertEquals("r", model.summary().get(0).type());
        Assertions.assertEquals(ValidationState.FAILED, model.summary().get(0).state());
        Assertions.assertEquals(ValidationState.FAILED, model.summary().get(0).messages().get(0).state());
        Assertions.assertEquals("r", model.summary().get(0).messages().get(0).message());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DbLevelValidationStatus model
            = new DbLevelValidationStatus().withDatabaseName("i")
                .withStartedOn(OffsetDateTime.parse("2021-11-01T17:10:34Z"))
                .withEndedOn(OffsetDateTime.parse("2021-09-29T21:57:11Z"))
                .withSummary(
                    Arrays.asList(
                        new ValidationSummaryItem().withType("r")
                            .withState(ValidationState.FAILED)
                            .withMessages(Arrays.asList(
                                new ValidationMessage().withState(ValidationState.FAILED).withMessage("r"),
                                new ValidationMessage().withState(ValidationState.SUCCEEDED)
                                    .withMessage("squyfxrxxlep"),
                                new ValidationMessage().withState(ValidationState.SUCCEEDED).withMessage("xje"))),
                        new ValidationSummaryItem().withType("lwnwxuqlcvydyp")
                            .withState(ValidationState.SUCCEEDED)
                            .withMessages(Arrays.asList(
                                new ValidationMessage().withState(ValidationState.FAILED).withMessage("kniod")))));
        model = BinaryData.fromObject(model).toObject(DbLevelValidationStatus.class);
        Assertions.assertEquals("i", model.databaseName());
        Assertions.assertEquals(OffsetDateTime.parse("2021-11-01T17:10:34Z"), model.startedOn());
        Assertions.assertEquals(OffsetDateTime.parse("2021-09-29T21:57:11Z"), model.endedOn());
        Assertions.assertEquals("r", model.summary().get(0).type());
        Assertions.assertEquals(ValidationState.FAILED, model.summary().get(0).state());
        Assertions.assertEquals(ValidationState.FAILED, model.summary().get(0).messages().get(0).state());
        Assertions.assertEquals("r", model.summary().get(0).messages().get(0).message());
    }
}
