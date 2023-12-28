// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public final class WorkflowTaskReassignTests extends PurviewWorkflowClientTestBase {
    @Test
    @Disabled
    public void testWorkflowTaskReassignTests() {
        BinaryData reassignCommand =
                BinaryData.fromString(
                        "{\"reassignments\":[{\"reassignFrom\":\"eece94d9-0619-4669-bb8a-d6ecec5220bc\",\"reassignTo\":\"7645223c-cdca-43e9-98c8-bd4d97e79e5e\"}]}");
        RequestOptions requestOptions = new RequestOptions();
        Response<Void> response =
                workflowTaskClient.reassignWithResponse(
                        "11b0244b-70ea-4c6b-9d28-08f52de40f2f", reassignCommand, requestOptions);
        Assertions.assertEquals(200, response.getStatusCode());
    }
}
