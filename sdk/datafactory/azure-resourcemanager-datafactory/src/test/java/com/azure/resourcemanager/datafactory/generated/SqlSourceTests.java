// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.SqlPartitionSettings;
import com.azure.resourcemanager.datafactory.models.SqlSource;

public final class SqlSourceTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlSource model = BinaryData.fromString(
            "{\"type\":\"SqlSource\",\"sqlReaderQuery\":\"dataplo\",\"sqlReaderStoredProcedureName\":\"datahimvlocdxvhkobi\",\"storedProcedureParameters\":\"datahipntrddyr\",\"isolationLevel\":\"dataanv\",\"partitionOption\":\"datagmqscijlfulxgnza\",\"partitionSettings\":{\"partitionColumnName\":\"datamwsooq\",\"partitionUpperBound\":\"datavplmyzebvgh\",\"partitionLowerBound\":\"dataydehbvbexrbynnl\"},\"queryTimeout\":\"datad\",\"additionalColumns\":\"datak\",\"sourceRetryCount\":\"datazzsi\",\"sourceRetryWait\":\"databosacrnpscfkef\",\"maxConcurrentConnections\":\"datatxe\",\"disableMetricsCollection\":\"datamimgjuvjvtgece\",\"\":{\"oukfjwkctdn\":\"datanled\"}}")
            .toObject(SqlSource.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlSource model = new SqlSource().withSourceRetryCount("datazzsi").withSourceRetryWait("databosacrnpscfkef")
            .withMaxConcurrentConnections("datatxe").withDisableMetricsCollection("datamimgjuvjvtgece")
            .withQueryTimeout("datad").withAdditionalColumns("datak").withSqlReaderQuery("dataplo")
            .withSqlReaderStoredProcedureName("datahimvlocdxvhkobi").withStoredProcedureParameters("datahipntrddyr")
            .withIsolationLevel("dataanv").withPartitionOption("datagmqscijlfulxgnza")
            .withPartitionSettings(new SqlPartitionSettings().withPartitionColumnName("datamwsooq")
                .withPartitionUpperBound("datavplmyzebvgh").withPartitionLowerBound("dataydehbvbexrbynnl"));
        model = BinaryData.fromObject(model).toObject(SqlSource.class);
    }
}
