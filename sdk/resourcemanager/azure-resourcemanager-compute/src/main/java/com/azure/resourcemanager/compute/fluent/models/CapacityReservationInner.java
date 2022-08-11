// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.Resource;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.compute.models.CapacityReservationInstanceView;
import com.azure.resourcemanager.compute.models.Sku;
import com.azure.resourcemanager.compute.models.SubResourceReadOnly;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;
import java.util.Map;

/** Specifies information about the capacity reservation. */
@Fluent
public final class CapacityReservationInner extends Resource {
    /*
     * Properties of the Capacity reservation.
     */
    @JsonProperty(value = "properties")
    private CapacityReservationProperties innerProperties;

    /*
     * SKU of the resource for which capacity needs be reserved. The SKU name and capacity is required to be set.
     * Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are supported. Refer to
     * List Microsoft.Compute SKUs in a region (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for
     * supported values.
     */
    @JsonProperty(value = "sku", required = true)
    private Sku sku;

    /*
     * Availability Zone to use for this capacity reservation. The zone has to be single value and also should be part
     * for the list of zones specified during the capacity reservation group creation. The zone can be assigned only
     * during creation. If not provided, the reservation supports only non-zonal deployments. If provided, enforces
     * VM/VMSS using this capacity reservation to be in same zone.
     */
    @JsonProperty(value = "zones")
    private List<String> zones;

    /**
     * Get the innerProperties property: Properties of the Capacity reservation.
     *
     * @return the innerProperties value.
     */
    private CapacityReservationProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     *
     * @return the sku value.
     */
    public Sku sku() {
        return this.sku;
    }

    /**
     * Set the sku property: SKU of the resource for which capacity needs be reserved. The SKU name and capacity is
     * required to be set. Currently VM Skus with the capability called 'CapacityReservationSupported' set to true are
     * supported. Refer to List Microsoft.Compute SKUs in a region
     * (https://docs.microsoft.com/rest/api/compute/resourceskus/list) for supported values.
     *
     * @param sku the sku value to set.
     * @return the CapacityReservationInner object itself.
     */
    public CapacityReservationInner withSku(Sku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the zones property: Availability Zone to use for this capacity reservation. The zone has to be single value
     * and also should be part for the list of zones specified during the capacity reservation group creation. The zone
     * can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If
     * provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     *
     * @return the zones value.
     */
    public List<String> zones() {
        return this.zones;
    }

    /**
     * Set the zones property: Availability Zone to use for this capacity reservation. The zone has to be single value
     * and also should be part for the list of zones specified during the capacity reservation group creation. The zone
     * can be assigned only during creation. If not provided, the reservation supports only non-zonal deployments. If
     * provided, enforces VM/VMSS using this capacity reservation to be in same zone.
     *
     * @param zones the zones value to set.
     * @return the CapacityReservationInner object itself.
     */
    public CapacityReservationInner withZones(List<String> zones) {
        this.zones = zones;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationInner withLocation(String location) {
        super.withLocation(location);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public CapacityReservationInner withTags(Map<String, String> tags) {
        super.withTags(tags);
        return this;
    }

    /**
     * Get the reservationId property: A unique id generated and assigned to the capacity reservation by the platform
     * which does not change throughout the lifetime of the resource.
     *
     * @return the reservationId value.
     */
    public String reservationId() {
        return this.innerProperties() == null ? null : this.innerProperties().reservationId();
    }

    /**
     * Get the virtualMachinesAssociated property: A list of all virtual machine resource ids that are associated with
     * the capacity reservation.
     *
     * @return the virtualMachinesAssociated value.
     */
    public List<SubResourceReadOnly> virtualMachinesAssociated() {
        return this.innerProperties() == null ? null : this.innerProperties().virtualMachinesAssociated();
    }

    /**
     * Get the provisioningTime property: The date time when the capacity reservation was last updated.
     *
     * @return the provisioningTime value.
     */
    public OffsetDateTime provisioningTime() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningTime();
    }

    /**
     * Get the provisioningState property: The provisioning state, which only appears in the response.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.innerProperties() == null ? null : this.innerProperties().provisioningState();
    }

    /**
     * Get the instanceView property: The Capacity reservation instance view.
     *
     * @return the instanceView value.
     */
    public CapacityReservationInstanceView instanceView() {
        return this.innerProperties() == null ? null : this.innerProperties().instanceView();
    }

    /**
     * Get the timeCreated property: Specifies the time at which the Capacity Reservation resource was
     * created.&lt;br&gt;&lt;br&gt;Minimum api-version: 2022-03-01.
     *
     * @return the timeCreated value.
     */
    public OffsetDateTime timeCreated() {
        return this.innerProperties() == null ? null : this.innerProperties().timeCreated();
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (innerProperties() != null) {
            innerProperties().validate();
        }
        if (sku() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property sku in model CapacityReservationInner"));
        } else {
            sku().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(CapacityReservationInner.class);
}
