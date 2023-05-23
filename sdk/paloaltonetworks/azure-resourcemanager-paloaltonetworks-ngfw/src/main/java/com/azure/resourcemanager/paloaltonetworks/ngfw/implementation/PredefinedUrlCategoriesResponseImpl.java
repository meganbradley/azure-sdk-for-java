// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.implementation;

import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.PredefinedUrlCategoriesResponseInner;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PredefinedUrlCategoriesResponse;
import com.azure.resourcemanager.paloaltonetworks.ngfw.models.PredefinedUrlCategory;
import java.util.Collections;
import java.util.List;

public final class PredefinedUrlCategoriesResponseImpl implements PredefinedUrlCategoriesResponse {
    private PredefinedUrlCategoriesResponseInner innerObject;

    private final com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager;

    PredefinedUrlCategoriesResponseImpl(
        PredefinedUrlCategoriesResponseInner innerObject,
        com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager serviceManager) {
        this.innerObject = innerObject;
        this.serviceManager = serviceManager;
    }

    public List<PredefinedUrlCategory> value() {
        List<PredefinedUrlCategory> inner = this.innerModel().value();
        if (inner != null) {
            return Collections.unmodifiableList(inner);
        } else {
            return Collections.emptyList();
        }
    }

    public String nextLink() {
        return this.innerModel().nextLink();
    }

    public PredefinedUrlCategoriesResponseInner innerModel() {
        return this.innerObject;
    }

    private com.azure.resourcemanager.paloaltonetworks.ngfw.PaloAltoNetworksNgfwManager manager() {
        return this.serviceManager;
    }
}
