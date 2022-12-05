// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.elastic.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.elastic.models.ElasticCloudDeployment;
import org.junit.jupiter.api.Test;

public final class ElasticCloudDeploymentTests {
    @Test
    public void testDeserialize() {
        ElasticCloudDeployment model =
            BinaryData
                .fromString(
                    "{\"name\":\"bmbexppbhtqqro\",\"deploymentId\":\"p\",\"azureSubscriptionId\":\"s\",\"elasticsearchRegion\":\"gbquxigj\",\"elasticsearchServiceUrl\":\"gzjaoyfhrtxilne\",\"kibanaServiceUrl\":\"ujysvle\",\"kibanaSsoUrl\":\"vfqawrlyxwjkcpr\"}")
                .toObject(ElasticCloudDeployment.class);
    }

    @Test
    public void testSerialize() {
        ElasticCloudDeployment model = new ElasticCloudDeployment();
        model = BinaryData.fromObject(model).toObject(ElasticCloudDeployment.class);
    }
}
