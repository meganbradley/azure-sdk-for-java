// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.DayOfWeek;
import com.azure.resourcemanager.datafactory.models.DaysOfWeek;
import com.azure.resourcemanager.datafactory.models.PipelineReference;
import com.azure.resourcemanager.datafactory.models.RecurrenceFrequency;
import com.azure.resourcemanager.datafactory.models.RecurrenceSchedule;
import com.azure.resourcemanager.datafactory.models.RecurrenceScheduleOccurrence;
import com.azure.resourcemanager.datafactory.models.ScheduleTrigger;
import com.azure.resourcemanager.datafactory.models.ScheduleTriggerRecurrence;
import com.azure.resourcemanager.datafactory.models.TriggerPipelineReference;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScheduleTriggerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScheduleTrigger model = BinaryData.fromString(
            "{\"type\":\"rkrfvlqwi\",\"typeProperties\":{\"recurrence\":{\"frequency\":\"Day\",\"interval\":862096390,\"startTime\":\"2021-01-25T07:32:55Z\",\"endTime\":\"2021-10-08T06:46:47Z\",\"timeZone\":\"lbqdxvxdfkdwk\",\"schedule\":{\"minutes\":[248937577,815850992,462109108,208237939],\"hours\":[239856664,1272427932,1347880889,1400698641],\"weekDays\":[\"Thursday\",\"Wednesday\",\"Tuesday\"],\"monthDays\":[333698935],\"monthlyOccurrences\":[{\"day\":\"Sunday\",\"occurrence\":1064820707,\"\":{\"is\":\"datadrecrrbkmzq\",\"xekql\":\"datagoapxdmxwetkj\",\"edfbfqwll\":\"datactdxargqff\",\"qzj\":\"datab\"}},{\"day\":\"Monday\",\"occurrence\":1818860634,\"\":{\"kiwum\":\"dataf\"}},{\"day\":\"Saturday\",\"occurrence\":158512843,\"\":{\"ecqwdosbsng\":\"datas\",\"cpwrgry\":\"dataiacwdxvlku\",\"zdtfthnjxid\":\"datablrqeqcdikcqc\"}}],\"\":{\"rrzuegindln\":\"datampyixgxtccmqzku\"}},\"\":{\"yracqmfji\":\"dataapszxqnjx\",\"oijtlhxlsxx\":\"datamcgz\"}}},\"pipelines\":[{\"pipelineReference\":{\"referenceName\":\"ts\",\"name\":\"agvq\"},\"parameters\":{\"jr\":\"datardfxqhnwh\"}},{\"pipelineReference\":{\"referenceName\":\"dqlzggvocxi\",\"name\":\"mrdbqujy\"},\"parameters\":{\"mntlbfknxzc\":\"dataciaznpsvgupqwqs\",\"ccpbtvgiokz\":\"datauvjbfryortbres\",\"dwawomkzussgjmub\":\"datatpvs\",\"ekzcmfibbozkp\":\"datagjdluwbmwuj\"}},{\"pipelineReference\":{\"referenceName\":\"v\",\"name\":\"ymswfwckucs\"},\"parameters\":{\"vvomcjpjrxvsgga\":\"datafhqxhtcohrhw\"}}],\"description\":\"oenpihtgigaeeqg\",\"runtimeState\":\"Stopped\",\"annotations\":[\"datazlfccpgeqix\"],\"\":{\"ld\":\"dataltqldlhhqpt\",\"nnb\":\"datamacaj\"}}")
            .toObject(ScheduleTrigger.class);
        Assertions.assertEquals("oenpihtgigaeeqg", model.description());
        Assertions.assertEquals("ts", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("agvq", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals(RecurrenceFrequency.DAY, model.recurrence().frequency());
        Assertions.assertEquals(862096390, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-25T07:32:55Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-08T06:46:47Z"), model.recurrence().endTime());
        Assertions.assertEquals("lbqdxvxdfkdwk", model.recurrence().timeZone());
        Assertions.assertEquals(248937577, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(239856664, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.THURSDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(333698935, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.SUNDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1064820707, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScheduleTrigger model = new ScheduleTrigger().withDescription("oenpihtgigaeeqg")
            .withAnnotations(Arrays.asList("datazlfccpgeqix"))
            .withPipelines(Arrays.asList(
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("ts").withName("agvq"))
                    .withParameters(mapOf("jr", "datardfxqhnwh")),
                new TriggerPipelineReference()
                    .withPipelineReference(
                        new PipelineReference().withReferenceName("dqlzggvocxi").withName("mrdbqujy"))
                    .withParameters(mapOf("mntlbfknxzc", "dataciaznpsvgupqwqs", "ccpbtvgiokz", "datauvjbfryortbres",
                        "dwawomkzussgjmub", "datatpvs", "ekzcmfibbozkp", "datagjdluwbmwuj")),
                new TriggerPipelineReference()
                    .withPipelineReference(new PipelineReference().withReferenceName("v").withName("ymswfwckucs"))
                    .withParameters(mapOf("vvomcjpjrxvsgga", "datafhqxhtcohrhw"))))
            .withRecurrence(new ScheduleTriggerRecurrence().withFrequency(RecurrenceFrequency.DAY)
                .withInterval(862096390)
                .withStartTime(OffsetDateTime.parse("2021-01-25T07:32:55Z"))
                .withEndTime(OffsetDateTime.parse("2021-10-08T06:46:47Z"))
                .withTimeZone("lbqdxvxdfkdwk")
                .withSchedule(
                    new RecurrenceSchedule().withMinutes(Arrays.asList(248937577, 815850992, 462109108, 208237939))
                        .withHours(Arrays.asList(239856664, 1272427932, 1347880889, 1400698641))
                        .withWeekDays(Arrays.asList(DaysOfWeek.THURSDAY, DaysOfWeek.WEDNESDAY, DaysOfWeek.TUESDAY))
                        .withMonthDays(Arrays.asList(333698935))
                        .withMonthlyOccurrences(Arrays.asList(
                            new RecurrenceScheduleOccurrence().withDay(DayOfWeek.SUNDAY)
                                .withOccurrence(1064820707)
                                .withAdditionalProperties(mapOf()),
                            new RecurrenceScheduleOccurrence().withDay(DayOfWeek.MONDAY)
                                .withOccurrence(1818860634)
                                .withAdditionalProperties(mapOf()),
                            new RecurrenceScheduleOccurrence().withDay(DayOfWeek.SATURDAY)
                                .withOccurrence(158512843)
                                .withAdditionalProperties(mapOf())))
                        .withAdditionalProperties(mapOf()))
                .withAdditionalProperties(mapOf()));
        model = BinaryData.fromObject(model).toObject(ScheduleTrigger.class);
        Assertions.assertEquals("oenpihtgigaeeqg", model.description());
        Assertions.assertEquals("ts", model.pipelines().get(0).pipelineReference().referenceName());
        Assertions.assertEquals("agvq", model.pipelines().get(0).pipelineReference().name());
        Assertions.assertEquals(RecurrenceFrequency.DAY, model.recurrence().frequency());
        Assertions.assertEquals(862096390, model.recurrence().interval());
        Assertions.assertEquals(OffsetDateTime.parse("2021-01-25T07:32:55Z"), model.recurrence().startTime());
        Assertions.assertEquals(OffsetDateTime.parse("2021-10-08T06:46:47Z"), model.recurrence().endTime());
        Assertions.assertEquals("lbqdxvxdfkdwk", model.recurrence().timeZone());
        Assertions.assertEquals(248937577, model.recurrence().schedule().minutes().get(0));
        Assertions.assertEquals(239856664, model.recurrence().schedule().hours().get(0));
        Assertions.assertEquals(DaysOfWeek.THURSDAY, model.recurrence().schedule().weekDays().get(0));
        Assertions.assertEquals(333698935, model.recurrence().schedule().monthDays().get(0));
        Assertions.assertEquals(DayOfWeek.SUNDAY, model.recurrence().schedule().monthlyOccurrences().get(0).day());
        Assertions.assertEquals(1064820707, model.recurrence().schedule().monthlyOccurrences().get(0).occurrence());
    }

    // Use "Map.of" if available
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
