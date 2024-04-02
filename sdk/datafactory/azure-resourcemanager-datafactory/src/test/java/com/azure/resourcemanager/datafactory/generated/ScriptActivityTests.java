// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.ActivityDependency;
import com.azure.resourcemanager.datafactory.models.ActivityOnInactiveMarkAs;
import com.azure.resourcemanager.datafactory.models.ActivityPolicy;
import com.azure.resourcemanager.datafactory.models.ActivityState;
import com.azure.resourcemanager.datafactory.models.DependencyCondition;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.LogLocationSettings;
import com.azure.resourcemanager.datafactory.models.ScriptActivity;
import com.azure.resourcemanager.datafactory.models.ScriptActivityLogDestination;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameter;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameterDirection;
import com.azure.resourcemanager.datafactory.models.ScriptActivityParameterType;
import com.azure.resourcemanager.datafactory.models.ScriptActivityScriptBlock;
import com.azure.resourcemanager.datafactory.models.ScriptActivityTypePropertiesLogSettings;
import com.azure.resourcemanager.datafactory.models.ScriptType;
import com.azure.resourcemanager.datafactory.models.UserProperty;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ScriptActivityTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ScriptActivity model = BinaryData.fromString(
            "{\"type\":\"Script\",\"typeProperties\":{\"scriptBlockExecutionTimeout\":\"dataikiogdtde\",\"scripts\":[{\"text\":\"datazsmya\",\"type\":\"NonQuery\",\"parameters\":[{\"name\":\"datamkhkuknccdbs\",\"type\":\"String\",\"value\":\"datadmbnqyswpnog\",\"direction\":\"Input\",\"size\":2077560759},{\"name\":\"datansduwttrvg\",\"type\":\"Timespan\",\"value\":\"datatprfqttz\",\"direction\":\"Output\",\"size\":1804249174}]},{\"text\":\"datazvtfkdzqtkxiyjq\",\"type\":\"Query\",\"parameters\":[{\"name\":\"dataebdhpizk\",\"type\":\"DateTimeOffset\",\"value\":\"datalmfydiodcgwbk\",\"direction\":\"Output\",\"size\":1540037039},{\"name\":\"datazduqthqgngrf\",\"type\":\"Double\",\"value\":\"dataewftq\",\"direction\":\"Output\",\"size\":563491415},{\"name\":\"dataaqahmeskd\",\"type\":\"Decimal\",\"value\":\"databdajc\",\"direction\":\"Output\",\"size\":130816507}]}],\"logSettings\":{\"logDestination\":\"ActivityOutput\",\"logLocationSettings\":{\"linkedServiceName\":{\"referenceName\":\"ojzjryp\",\"parameters\":{\"zst\":\"datahklcczgflo\",\"gwwrclxhveso\":\"datafwbftafrbuvw\",\"xuiod\":\"datadxmmtyumejp\",\"aujhox\":\"datab\"}},\"path\":\"datavceuyw\"}}},\"linkedServiceName\":{\"referenceName\":\"mtzlcvokvo\",\"parameters\":{\"ccnlvyhietezn\":\"datajdy\",\"zulkk\":\"datalsqymvihhgpe\",\"rysanifcfrtijz\":\"datayfiuxdadc\",\"zebqbdewepoan\":\"dataum\"}},\"policy\":{\"timeout\":\"dataspde\",\"retry\":\"datajgjdqlazune\",\"retryIntervalInSeconds\":2015861080,\"secureInput\":false,\"secureOutput\":true,\"\":{\"utjjqzqixsvo\":\"datatiswxcvw\"}},\"name\":\"bjsrisfcc\",\"description\":\"u\",\"state\":\"Inactive\",\"onInactiveMarkAs\":\"Succeeded\",\"dependsOn\":[{\"activity\":\"kyvu\",\"dependencyConditions\":[\"Succeeded\",\"Succeeded\",\"Succeeded\"],\"\":{\"qk\":\"dataicjmvspydtladf\",\"ue\":\"dataci\"}},{\"activity\":\"yljw\",\"dependencyConditions\":[\"Failed\",\"Skipped\",\"Completed\"],\"\":{\"bacgrysjgzuzo\":\"datarvbuphbwais\",\"ydd\":\"dataupdcmpfwfdcpedu\",\"nkhgg\":\"datapfdhfp\"}}],\"userProperties\":[{\"name\":\"apsypgmmieheq\",\"value\":\"datatetnywgme\"},{\"name\":\"ihaboj\",\"value\":\"datargetnc\"},{\"name\":\"ljwjrpljkc\",\"value\":\"dataed\"}],\"\":{\"acc\":\"dataefzlwohob\",\"cnoeiqhbr\":\"datalvixf\",\"kpbrr\":\"datacgmyjmcw\",\"teblrnu\":\"databzvink\"}}")
            .toObject(ScriptActivity.class);
        Assertions.assertEquals("bjsrisfcc", model.name());
        Assertions.assertEquals("u", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("kyvu", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("apsypgmmieheq", model.userProperties().get(0).name());
        Assertions.assertEquals("mtzlcvokvo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2015861080, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(ScriptType.NON_QUERY, model.scripts().get(0).type());
        Assertions.assertEquals(ScriptActivityParameterType.STRING, model.scripts().get(0).parameters().get(0).type());
        Assertions.assertEquals(ScriptActivityParameterDirection.INPUT,
            model.scripts().get(0).parameters().get(0).direction());
        Assertions.assertEquals(2077560759, model.scripts().get(0).parameters().get(0).size());
        Assertions.assertEquals(ScriptActivityLogDestination.ACTIVITY_OUTPUT, model.logSettings().logDestination());
        Assertions.assertEquals("ojzjryp",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ScriptActivity model = new ScriptActivity().withName("bjsrisfcc").withDescription("u")
            .withState(ActivityState.INACTIVE).withOnInactiveMarkAs(ActivityOnInactiveMarkAs.SUCCEEDED)
            .withDependsOn(Arrays.asList(
                new ActivityDependency().withActivity("kyvu")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.SUCCEEDED,
                        DependencyCondition.SUCCEEDED, DependencyCondition.SUCCEEDED))
                    .withAdditionalProperties(mapOf()),
                new ActivityDependency().withActivity("yljw")
                    .withDependencyConditions(Arrays.asList(DependencyCondition.FAILED, DependencyCondition.SKIPPED,
                        DependencyCondition.COMPLETED))
                    .withAdditionalProperties(mapOf())))
            .withUserProperties(Arrays.asList(new UserProperty().withName("apsypgmmieheq").withValue("datatetnywgme"),
                new UserProperty().withName("ihaboj").withValue("datargetnc"),
                new UserProperty().withName("ljwjrpljkc").withValue("dataed")))
            .withLinkedServiceName(new LinkedServiceReference().withReferenceName("mtzlcvokvo")
                .withParameters(mapOf("ccnlvyhietezn", "datajdy", "zulkk", "datalsqymvihhgpe", "rysanifcfrtijz",
                    "datayfiuxdadc", "zebqbdewepoan", "dataum")))
            .withPolicy(
                new ActivityPolicy().withTimeout("dataspde").withRetry("datajgjdqlazune")
                    .withRetryIntervalInSeconds(2015861080).withSecureInput(
                        false)
                    .withSecureOutput(true).withAdditionalProperties(mapOf()))
            .withScriptBlockExecutionTimeout(
                "dataikiogdtde")
            .withScripts(
                Arrays
                    .asList(new ScriptActivityScriptBlock().withText("datazsmya").withType(ScriptType.NON_QUERY)
                        .withParameters(Arrays.asList(
                            new ScriptActivityParameter().withName("datamkhkuknccdbs")
                                .withType(ScriptActivityParameterType.STRING).withValue("datadmbnqyswpnog")
                                .withDirection(ScriptActivityParameterDirection.INPUT).withSize(2077560759),
                            new ScriptActivityParameter().withName("datansduwttrvg")
                                .withType(ScriptActivityParameterType.TIMESPAN).withValue("datatprfqttz").withDirection(
                                    ScriptActivityParameterDirection.OUTPUT)
                                .withSize(1804249174))),
                        new ScriptActivityScriptBlock().withText("datazvtfkdzqtkxiyjq").withType(ScriptType.QUERY)
                            .withParameters(Arrays.asList(new ScriptActivityParameter().withName("dataebdhpizk")
                                .withType(ScriptActivityParameterType.DATE_TIME_OFFSET).withValue("datalmfydiodcgwbk")
                                .withDirection(ScriptActivityParameterDirection.OUTPUT).withSize(1540037039),
                                new ScriptActivityParameter().withName("datazduqthqgngrf")
                                    .withType(ScriptActivityParameterType.DOUBLE).withValue("dataewftq")
                                    .withDirection(ScriptActivityParameterDirection.OUTPUT).withSize(563491415),
                                new ScriptActivityParameter().withName("dataaqahmeskd")
                                    .withType(ScriptActivityParameterType.DECIMAL).withValue("databdajc")
                                    .withDirection(ScriptActivityParameterDirection.OUTPUT).withSize(130816507)))))
            .withLogSettings(
                new ScriptActivityTypePropertiesLogSettings()
                    .withLogDestination(
                        ScriptActivityLogDestination.ACTIVITY_OUTPUT)
                    .withLogLocationSettings(new LogLocationSettings()
                        .withLinkedServiceName(new LinkedServiceReference().withReferenceName("ojzjryp")
                            .withParameters(mapOf("zst", "datahklcczgflo", "gwwrclxhveso", "datafwbftafrbuvw", "xuiod",
                                "datadxmmtyumejp", "aujhox", "datab")))
                        .withPath("datavceuyw")));
        model = BinaryData.fromObject(model).toObject(ScriptActivity.class);
        Assertions.assertEquals("bjsrisfcc", model.name());
        Assertions.assertEquals("u", model.description());
        Assertions.assertEquals(ActivityState.INACTIVE, model.state());
        Assertions.assertEquals(ActivityOnInactiveMarkAs.SUCCEEDED, model.onInactiveMarkAs());
        Assertions.assertEquals("kyvu", model.dependsOn().get(0).activity());
        Assertions.assertEquals(DependencyCondition.SUCCEEDED, model.dependsOn().get(0).dependencyConditions().get(0));
        Assertions.assertEquals("apsypgmmieheq", model.userProperties().get(0).name());
        Assertions.assertEquals("mtzlcvokvo", model.linkedServiceName().referenceName());
        Assertions.assertEquals(2015861080, model.policy().retryIntervalInSeconds());
        Assertions.assertEquals(false, model.policy().secureInput());
        Assertions.assertEquals(true, model.policy().secureOutput());
        Assertions.assertEquals(ScriptType.NON_QUERY, model.scripts().get(0).type());
        Assertions.assertEquals(ScriptActivityParameterType.STRING, model.scripts().get(0).parameters().get(0).type());
        Assertions.assertEquals(ScriptActivityParameterDirection.INPUT,
            model.scripts().get(0).parameters().get(0).direction());
        Assertions.assertEquals(2077560759, model.scripts().get(0).parameters().get(0).size());
        Assertions.assertEquals(ScriptActivityLogDestination.ACTIVITY_OUTPUT, model.logSettings().logDestination());
        Assertions.assertEquals("ojzjryp",
            model.logSettings().logLocationSettings().linkedServiceName().referenceName());
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
