// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.paloaltonetworks.ngfw.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListGlobalRulestackResourceInner;
import java.util.List;

/** An immutable client-side representation of FqdnListGlobalRulestackResource. */
public interface FqdnListGlobalRulestackResource {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the description property: fqdn object description.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the fqdnList property: fqdn list.
     *
     * @return the fqdnList value.
     */
    List<String> fqdnList();

    /**
     * Gets the etag property: etag info.
     *
     * @return the etag value.
     */
    String etag();

    /**
     * Gets the auditComment property: comment for this object.
     *
     * @return the auditComment value.
     */
    String auditComment();

    /**
     * Gets the provisioningState property: Provisioning state of the resource.
     *
     * @return the provisioningState value.
     */
    ProvisioningState provisioningState();

    /**
     * Gets the inner com.azure.resourcemanager.paloaltonetworks.ngfw.fluent.models.FqdnListGlobalRulestackResourceInner
     * object.
     *
     * @return the inner object.
     */
    FqdnListGlobalRulestackResourceInner innerModel();
}
