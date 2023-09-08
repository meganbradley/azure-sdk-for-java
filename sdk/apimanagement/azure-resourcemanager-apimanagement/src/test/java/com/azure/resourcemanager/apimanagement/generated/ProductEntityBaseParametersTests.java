// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.ProductEntityBaseParameters;
import com.azure.resourcemanager.apimanagement.models.ProductState;
import org.junit.jupiter.api.Assertions;

public final class ProductEntityBaseParametersTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProductEntityBaseParameters model =
            BinaryData
                .fromString(
                    "{\"description\":\"njrohmbpy\",\"terms\":\"xameblydyvkfkm\",\"subscriptionRequired\":false,\"approvalRequired\":false,\"subscriptionsLimit\":1263578872,\"state\":\"notPublished\"}")
                .toObject(ProductEntityBaseParameters.class);
        Assertions.assertEquals("njrohmbpy", model.description());
        Assertions.assertEquals("xameblydyvkfkm", model.terms());
        Assertions.assertEquals(false, model.subscriptionRequired());
        Assertions.assertEquals(false, model.approvalRequired());
        Assertions.assertEquals(1263578872, model.subscriptionsLimit());
        Assertions.assertEquals(ProductState.NOT_PUBLISHED, model.state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProductEntityBaseParameters model =
            new ProductEntityBaseParameters()
                .withDescription("njrohmbpy")
                .withTerms("xameblydyvkfkm")
                .withSubscriptionRequired(false)
                .withApprovalRequired(false)
                .withSubscriptionsLimit(1263578872)
                .withState(ProductState.NOT_PUBLISHED);
        model = BinaryData.fromObject(model).toObject(ProductEntityBaseParameters.class);
        Assertions.assertEquals("njrohmbpy", model.description());
        Assertions.assertEquals("xameblydyvkfkm", model.terms());
        Assertions.assertEquals(false, model.subscriptionRequired());
        Assertions.assertEquals(false, model.approvalRequired());
        Assertions.assertEquals(1263578872, model.subscriptionsLimit());
        Assertions.assertEquals(ProductState.NOT_PUBLISHED, model.state());
    }
}
