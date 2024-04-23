// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.devcenter.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.devcenter.models.ProjectListResult;

public final class ProjectListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProjectListResult model = BinaryData.fromString(
            "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"devCenterUri\":\"my\",\"devCenterId\":\"kdtmlxhekuk\",\"description\":\"txukcdmp\",\"maxDevBoxesPerUser\":1492414283,\"displayName\":\"y\",\"catalogSettings\":{\"catalogItemSyncTypes\":[\"EnvironmentDefinition\",\"EnvironmentDefinition\"]}},\"identity\":{\"principalId\":\"e83a65b4-553c-4b91-8e70-62bd49a0456d\",\"tenantId\":\"4dd8febd-4105-43b7-8630-be699172530d\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"lhmwhfpmrqobm\":{\"principalId\":\"7dea63b5-8bff-4f47-9145-3d7405d08a88\",\"clientId\":\"2a783c53-28cc-479e-98e6-2b7ec8eaf0f5\"}}},\"location\":\"kknryrtihf\",\"tags\":{\"zufcyzkohdbi\":\"jbpzvgnwzsymg\",\"th\":\"anufhfcbjysag\",\"yscnpqxu\":\"qhabifpikxwcz\",\"mjgr\":\"ivyqniwbybrkxvd\"},\"id\":\"fwvuk\",\"name\":\"gaudcc\",\"type\":\"nhsjcnyej\"},{\"properties\":{\"provisioningState\":\"RolloutInProgress\",\"devCenterUri\":\"tnapczwlokjyemkk\",\"devCenterId\":\"ipjoxzjnchgejs\",\"description\":\"dmailzydehojw\",\"maxDevBoxesPerUser\":302858012,\"displayName\":\"xinpmqnjaq\",\"catalogSettings\":{\"catalogItemSyncTypes\":[\"EnvironmentDefinition\",\"EnvironmentDefinition\",\"EnvironmentDefinition\"]}},\"identity\":{\"principalId\":\"6e4ab048-d66f-4fcf-a1c7-93832d47957b\",\"tenantId\":\"39cc95f2-437c-46e9-bd98-5c1b192e2375\",\"type\":\"SystemAssigned, UserAssigned\",\"userAssignedIdentities\":{\"gjvw\":{\"principalId\":\"718b422d-22fc-48c3-b440-e616ca2346d0\",\"clientId\":\"abd36c67-be22-4b22-ac3b-3a618a2d430e\"},\"atscmd\":{\"principalId\":\"d753698d-11de-487e-a1ae-7a0030f5c7bd\",\"clientId\":\"9229b76a-3cf3-4988-87d8-b2351ea24be2\"},\"hulsuuvmkjozkrwf\":{\"principalId\":\"00e69fd7-107c-4a0f-9105-0c85152f07c1\",\"clientId\":\"22de3d45-ea14-46cf-822e-b1bba616e9b7\"},\"odjpslwejd\":{\"principalId\":\"c2ee2223-0f51-48b5-b045-9c16ad0667a7\",\"clientId\":\"d9910e9c-e326-4bc8-8a2a-6731a128ef97\"}}},\"location\":\"wryoqpsoacc\",\"tags\":{\"lahbcryff\":\"akl\",\"xpaojakhmsbz\":\"fdosyg\",\"hlxaolthqtr\":\"hcrzevd\"},\"id\":\"qjbpfzfsin\",\"name\":\"gvfcj\",\"type\":\"wzo\"},{\"properties\":{\"provisioningState\":\"Created\",\"devCenterUri\":\"elluwfziton\",\"devCenterId\":\"qfpjk\",\"description\":\"xofpdvhpfxxypi\",\"maxDevBoxesPerUser\":7569944,\"displayName\":\"ayhuy\",\"catalogSettings\":{\"catalogItemSyncTypes\":[\"EnvironmentDefinition\",\"EnvironmentDefinition\"]}},\"identity\":{\"principalId\":\"0b0b0a30-2f11-4be8-b42d-003ce8035281\",\"tenantId\":\"5f8400c4-a141-47d4-a362-d6a6fc9fedac\",\"type\":\"SystemAssigned, UserAssigned\",\"userAssignedIdentities\":{\"vamih\":{\"principalId\":\"73b4e309-0b86-4ee0-9c68-9d4dcdaa9ff8\",\"clientId\":\"e298a101-deca-4850-bc47-3e573811fb6e\"},\"narxzxtheotus\":{\"principalId\":\"37a09574-81cd-4bed-b62f-ebdaa1d15acf\",\"clientId\":\"706a7579-488c-4e64-816f-c6593f48d5a2\"},\"evcciqihnhun\":{\"principalId\":\"8fc9a6a6-fb94-42ba-a8c7-0c1edc654b6e\",\"clientId\":\"49ffe368-9acb-4fb0-8729-65d454266556\"}}},\"location\":\"wjzrnfygxgisp\",\"tags\":{\"ofx\":\"tzfkufubl\"},\"id\":\"eofjaeqjh\",\"name\":\"jbasvmsmjqulngs\",\"type\":\"tnb\"}],\"nextLink\":\"kzgcwrwcl\"}")
            .toObject(ProjectListResult.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProjectListResult model = new ProjectListResult();
        model = BinaryData.fromObject(model).toObject(ProjectListResult.class);
    }
}
