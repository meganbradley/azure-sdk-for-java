// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.generated;

import com.azure.core.util.Context;
import com.azure.resourcemanager.sql.fluent.models.DataMaskingRuleInner;
import com.azure.resourcemanager.sql.models.DataMaskingFunction;
import com.azure.resourcemanager.sql.models.DataMaskingRuleState;

/** Samples for DataMaskingRules CreateOrUpdate. */
public final class DataMaskingRulesCreateOrUpdateSamples {
    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DataMaskingRuleCreateOrUpdateDefaultMin.json
     */
    /**
     * Sample code: Create/Update data masking rule for default min.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateDataMaskingRuleForDefaultMin(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDataMaskingRules()
            .createOrUpdateWithResponse(
                "sqlcrudtest-6852",
                "sqlcrudtest-2080",
                "sqlcrudtest-331",
                "rule1",
                new DataMaskingRuleInner()
                    .withSchemaName("dbo")
                    .withTableName("Table_1")
                    .withColumnName("test1")
                    .withMaskingFunction(DataMaskingFunction.DEFAULT),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DataMaskingRuleCreateOrUpdateDefaultMax.json
     */
    /**
     * Sample code: Create/Update data masking rule for default max.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateDataMaskingRuleForDefaultMax(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDataMaskingRules()
            .createOrUpdateWithResponse(
                "sqlcrudtest-6852",
                "sqlcrudtest-2080",
                "sqlcrudtest-331",
                "rule1",
                new DataMaskingRuleInner()
                    .withAliasName("nickname")
                    .withRuleState(DataMaskingRuleState.ENABLED)
                    .withSchemaName("dbo")
                    .withTableName("Table_1")
                    .withColumnName("test1")
                    .withMaskingFunction(DataMaskingFunction.DEFAULT),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DataMaskingRuleCreateOrUpdateText.json
     */
    /**
     * Sample code: Create/Update data masking rule for text.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateDataMaskingRuleForText(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDataMaskingRules()
            .createOrUpdateWithResponse(
                "sqlcrudtest-6852",
                "sqlcrudtest-2080",
                "sqlcrudtest-331",
                "rule1",
                new DataMaskingRuleInner()
                    .withSchemaName("dbo")
                    .withTableName("Table_1")
                    .withColumnName("test1")
                    .withMaskingFunction(DataMaskingFunction.TEXT)
                    .withPrefixSize("1")
                    .withSuffixSize("0")
                    .withReplacementString("asdf"),
                Context.NONE);
    }

    /*
     * x-ms-original-file: specification/sql/resource-manager/Microsoft.Sql/stable/2014-04-01/examples/DataMaskingRuleCreateOrUpdateNumber.json
     */
    /**
     * Sample code: Create/Update data masking rule for numbers.
     *
     * @param azure The entry point for accessing resource management APIs in Azure.
     */
    public static void createUpdateDataMaskingRuleForNumbers(com.azure.resourcemanager.AzureResourceManager azure) {
        azure
            .sqlServers()
            .manager()
            .serviceClient()
            .getDataMaskingRules()
            .createOrUpdateWithResponse(
                "sqlcrudtest-6852",
                "sqlcrudtest-2080",
                "sqlcrudtest-331",
                "rule1",
                new DataMaskingRuleInner()
                    .withSchemaName("dbo")
                    .withTableName("Table_1")
                    .withColumnName("test1")
                    .withMaskingFunction(DataMaskingFunction.NUMBER)
                    .withNumberFrom("0")
                    .withNumberTo("2"),
                Context.NONE);
    }
}
