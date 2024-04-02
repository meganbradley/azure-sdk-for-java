// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.security.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.security.fluent.models.ComplianceInner;
import com.azure.resourcemanager.security.models.ComplianceList;
import java.util.Arrays;

public final class ComplianceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ComplianceList model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-04-07T17:13:30Z\",\"resourceCount\":1406047285,\"assessmentResult\":[{\"segmentType\":\"xdcu\",\"percentage\":74.31170370830898},{\"segmentType\":\"pymzidnsezcxtbzs\",\"percentage\":7.2017595592759776}]},\"id\":\"cs\",\"name\":\"ewmdw\",\"type\":\"jeiachboosfl\"},{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-02-05T00:34:52Z\",\"resourceCount\":1593237527,\"assessmentResult\":[{\"segmentType\":\"ehzzvypyqrim\",\"percentage\":74.94883188966803}]},\"id\":\"vswjdk\",\"name\":\"rsoodqxhcrmnoh\",\"type\":\"t\"},{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-05-22T08:16:02Z\",\"resourceCount\":1289285070,\"assessmentResult\":[{\"segmentType\":\"iy\",\"percentage\":67.43541185344014},{\"segmentType\":\"qwpgrjbzn\",\"percentage\":72.581338495922},{\"segmentType\":\"vsnb\",\"percentage\":39.60468133853106},{\"segmentType\":\"nmoc\",\"percentage\":13.547693135596006}]},\"id\":\"hurzafblj\",\"name\":\"gpbtoqcjmklj\",\"type\":\"vbqid\"},{\"properties\":{\"assessmentTimestampUtcDate\":\"2021-07-23T07:35:18Z\",\"resourceCount\":352301275,\"assessmentResult\":[{\"segmentType\":\"kudjkrlkhb\",\"percentage\":42.61178604549292}]},\"id\":\"pgzgq\",\"name\":\"xzlocxscp\",\"type\":\"ierhhbcsglummaj\"}],\"nextLink\":\"aodxo\"}")
            .toObject(ComplianceList.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ComplianceList model = new ComplianceList().withValue(
            Arrays.asList(new ComplianceInner(), new ComplianceInner(), new ComplianceInner(), new ComplianceInner()));
        model = BinaryData.fromObject(model).toObject(ComplianceList.class);
    }
}
