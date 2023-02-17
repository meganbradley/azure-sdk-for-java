// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.analytics.purview.workflow.generated;

import com.azure.analytics.purview.workflow.PurviewWorkflowClient;
import com.azure.analytics.purview.workflow.PurviewWorkflowClientBuilder;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.http.rest.Response;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import com.azure.identity.DefaultAzureCredentialBuilder;

public class WorkflowCreateOrUpdate {
    public static void main(String[] args) {
        PurviewWorkflowClient purviewWorkflowClient =
                new PurviewWorkflowClientBuilder()
                        .credential(new DefaultAzureCredentialBuilder().build())
                        .endpoint(Configuration.getGlobalConfiguration().get("ENDPOINT"))
                        .buildClient();
        // BEGIN:com.azure.analytics.purview.workflow.generated.createorreplaceworkflow.workflowcreateorupdate
        BinaryData workflowCreateOrUpdateCommand =
                BinaryData.fromString(
                        "{\"name\":\"Create glossary term workflow\",\"description\":\"\",\"actionDag\":{\"actions\":{\"Condition\":{\"type\":\"If\",\"actions\":{\"Create glossary term\":{\"type\":\"CreateTerm\",\"runAfter\":{}},\"Send email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is approved.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - APPROVED\"}},\"runAfter\":{\"Create glossary term\":[\"Succeeded\"]}}},\"else\":{\"actions\":{\"Send reject email notification\":{\"type\":\"EmailNotification\",\"inputs\":{\"parameters\":{\"emailMessage\":\"Your request for Glossary Term @{triggerBody()['request']['term']['name']} is rejected.\",\"emailRecipients\":[\"@{triggerBody()['request']['requestor']}\"],\"emailSubject\":\"Glossary Term Create - REJECTED\"}},\"runAfter\":{}}}},\"expression\":{\"and\":[{\"equals\":[\"@outputs('Start and wait for an approval')['body/outcome']\",\"Approved\"]}]},\"runAfter\":{\"Start and wait for an approval\":[\"Succeeded\"]}},\"Start and wait for an approval\":{\"type\":\"Approval\",\"inputs\":{\"parameters\":{\"approvalType\":\"PendingOnAll\",\"assignedTo\":[\"eece94d9-0619-4669-bb8a-d6ecec5220bc\"],\"title\":\"Approval Request for Create Glossary Term\"}},\"runAfter\":{}}}},\"isEnabled\":true,\"triggers\":[{\"type\":\"when_term_creation_is_requested\",\"underGlossaryHierarchy\":\"/glossaries/20031e20-b4df-4a66-a61d-1b0716f3fa48\"}]}");
        RequestOptions requestOptions = new RequestOptions();
        String workflowId = "4afb5752-e47f-43a1-8ba7-c696bf8d2745";
        Response<BinaryData> response =
                purviewWorkflowClient.createOrReplaceWorkflowWithResponse(
                    workflowId, workflowCreateOrUpdateCommand, requestOptions);
        // END:com.azure.analytics.purview.workflow.generated.createorreplaceworkflow.workflowcreateorupdate
    }
}
