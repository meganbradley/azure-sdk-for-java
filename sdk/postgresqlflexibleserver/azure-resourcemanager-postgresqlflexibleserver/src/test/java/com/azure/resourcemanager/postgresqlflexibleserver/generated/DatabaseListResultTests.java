// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.postgresqlflexibleserver.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.postgresqlflexibleserver.fluent.models.DatabaseInner;
import com.azure.resourcemanager.postgresqlflexibleserver.models.DatabaseListResult;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class DatabaseListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        DatabaseListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"charset\":\"hrbnlankxmyskpbh\",\"collation\":\"btkcxywnytnrsyn\"},\"id\":\"idybyxczf\",\"name\":\"lhaaxdbabp\",\"type\":\"lwrq\"},{\"properties\":{\"charset\":\"tsthsucocm\",\"collation\":\"yazttbtwwrqpue\"},\"id\":\"kzywbiex\",\"name\":\"fey\",\"type\":\"eaxib\"},{\"properties\":{\"charset\":\"wbhqwal\",\"collation\":\"zyoxaepdkzjan\"},\"id\":\"xrhdwbavxbniwdjs\",\"name\":\"zt\",\"type\":\"dbpgnxytxhp\"}],\"nextLink\":\"bzpfzab\"}")
            .toObject(DatabaseListResult.class);
        Assertions.assertEquals("hrbnlankxmyskpbh", model.value().get(0).charset());
        Assertions.assertEquals("btkcxywnytnrsyn", model.value().get(0).collation());
        Assertions.assertEquals("bzpfzab", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        DatabaseListResult model
            = new DatabaseListResult()
                .withValue(
                    Arrays.asList(new DatabaseInner().withCharset("hrbnlankxmyskpbh").withCollation("btkcxywnytnrsyn"),
                        new DatabaseInner().withCharset("tsthsucocm").withCollation("yazttbtwwrqpue"),
                        new DatabaseInner().withCharset("wbhqwal").withCollation("zyoxaepdkzjan")))
                .withNextLink("bzpfzab");
        model = BinaryData.fromObject(model).toObject(DatabaseListResult.class);
        Assertions.assertEquals("hrbnlankxmyskpbh", model.value().get(0).charset());
        Assertions.assertEquals("btkcxywnytnrsyn", model.value().get(0).collation());
        Assertions.assertEquals("bzpfzab", model.nextLink());
    }
}
