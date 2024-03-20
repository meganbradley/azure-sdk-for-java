// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.EntityReference;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeDataProxyProperties;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeEntityReferenceType;
import org.junit.jupiter.api.Assertions;

public final class IntegrationRuntimeDataProxyPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        IntegrationRuntimeDataProxyProperties model = BinaryData.fromString(
            "{\"connectVia\":{\"type\":\"LinkedServiceReference\",\"referenceName\":\"icbicbogsfo\"},\"stagingLinkedService\":{\"type\":\"LinkedServiceReference\",\"referenceName\":\"iyf\"},\"path\":\"nrukcy\"}")
            .toObject(IntegrationRuntimeDataProxyProperties.class);
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.connectVia().type());
        Assertions.assertEquals("icbicbogsfo", model.connectVia().referenceName());
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.stagingLinkedService().type());
        Assertions.assertEquals("iyf", model.stagingLinkedService().referenceName());
        Assertions.assertEquals("nrukcy", model.path());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        IntegrationRuntimeDataProxyProperties model = new IntegrationRuntimeDataProxyProperties()
            .withConnectVia(
                new EntityReference().withType(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE)
                    .withReferenceName("icbicbogsfo"))
            .withStagingLinkedService(new EntityReference()
                .withType(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE).withReferenceName("iyf"))
            .withPath("nrukcy");
        model = BinaryData.fromObject(model).toObject(IntegrationRuntimeDataProxyProperties.class);
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.connectVia().type());
        Assertions.assertEquals("icbicbogsfo", model.connectVia().referenceName());
        Assertions.assertEquals(IntegrationRuntimeEntityReferenceType.LINKED_SERVICE_REFERENCE,
            model.stagingLinkedService().type());
        Assertions.assertEquals("iyf", model.stagingLinkedService().referenceName());
        Assertions.assertEquals("nrukcy", model.path());
    }
}
