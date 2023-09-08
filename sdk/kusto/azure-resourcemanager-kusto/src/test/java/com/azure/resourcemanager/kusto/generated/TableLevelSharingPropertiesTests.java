// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kusto.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kusto.models.TableLevelSharingProperties;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class TableLevelSharingPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        TableLevelSharingProperties model =
            BinaryData
                .fromString(
                    "{\"tablesToInclude\":[\"ivkwlzuvccfwnfnb\",\"cfionl\",\"bxetqgtzxdpn\"],\"tablesToExclude\":[\"qwxrjfeallnw\"],\"externalTablesToInclude\":[\"isnjampmngnz\",\"c\"],\"externalTablesToExclude\":[\"wooc\",\"cbonqvpk\",\"lrxnjeaseiphe\"],\"materializedViewsToInclude\":[\"okeyyienj\",\"dlwtgrhpdj\"],\"materializedViewsToExclude\":[\"masxazjpqyegu\",\"lhbxxhejjzzvdud\",\"wdslfhotwmcy\"],\"functionsToInclude\":[\"lbjnpgacftadehx\",\"ltyfsop\",\"usue\",\"nzwdejba\"],\"functionsToExclude\":[\"xzdmohctb\",\"vudwx\",\"ndnvo\",\"gujjugwdkcglh\"]}")
                .toObject(TableLevelSharingProperties.class);
        Assertions.assertEquals("ivkwlzuvccfwnfnb", model.tablesToInclude().get(0));
        Assertions.assertEquals("qwxrjfeallnw", model.tablesToExclude().get(0));
        Assertions.assertEquals("isnjampmngnz", model.externalTablesToInclude().get(0));
        Assertions.assertEquals("wooc", model.externalTablesToExclude().get(0));
        Assertions.assertEquals("okeyyienj", model.materializedViewsToInclude().get(0));
        Assertions.assertEquals("masxazjpqyegu", model.materializedViewsToExclude().get(0));
        Assertions.assertEquals("lbjnpgacftadehx", model.functionsToInclude().get(0));
        Assertions.assertEquals("xzdmohctb", model.functionsToExclude().get(0));
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        TableLevelSharingProperties model =
            new TableLevelSharingProperties()
                .withTablesToInclude(Arrays.asList("ivkwlzuvccfwnfnb", "cfionl", "bxetqgtzxdpn"))
                .withTablesToExclude(Arrays.asList("qwxrjfeallnw"))
                .withExternalTablesToInclude(Arrays.asList("isnjampmngnz", "c"))
                .withExternalTablesToExclude(Arrays.asList("wooc", "cbonqvpk", "lrxnjeaseiphe"))
                .withMaterializedViewsToInclude(Arrays.asList("okeyyienj", "dlwtgrhpdj"))
                .withMaterializedViewsToExclude(Arrays.asList("masxazjpqyegu", "lhbxxhejjzzvdud", "wdslfhotwmcy"))
                .withFunctionsToInclude(Arrays.asList("lbjnpgacftadehx", "ltyfsop", "usue", "nzwdejba"))
                .withFunctionsToExclude(Arrays.asList("xzdmohctb", "vudwx", "ndnvo", "gujjugwdkcglh"));
        model = BinaryData.fromObject(model).toObject(TableLevelSharingProperties.class);
        Assertions.assertEquals("ivkwlzuvccfwnfnb", model.tablesToInclude().get(0));
        Assertions.assertEquals("qwxrjfeallnw", model.tablesToExclude().get(0));
        Assertions.assertEquals("isnjampmngnz", model.externalTablesToInclude().get(0));
        Assertions.assertEquals("wooc", model.externalTablesToExclude().get(0));
        Assertions.assertEquals("okeyyienj", model.materializedViewsToInclude().get(0));
        Assertions.assertEquals("masxazjpqyegu", model.materializedViewsToExclude().get(0));
        Assertions.assertEquals("lbjnpgacftadehx", model.functionsToInclude().get(0));
        Assertions.assertEquals("xzdmohctb", model.functionsToExclude().get(0));
    }
}
