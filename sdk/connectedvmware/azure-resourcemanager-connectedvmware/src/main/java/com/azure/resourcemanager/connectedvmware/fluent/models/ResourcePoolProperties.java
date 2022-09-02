// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.connectedvmware.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.connectedvmware.models.ResourceStatus;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Defines the resource properties. */
@Fluent
public final class ResourcePoolProperties {
    /*
     * Gets or sets a unique identifier for this resource.
     */
    @JsonProperty(value = "uuid", access = JsonProperty.Access.WRITE_ONLY)
    private String uuid;

    /*
     * Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     */
    @JsonProperty(value = "vCenterId")
    private String vCenterId;

    /*
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     */
    @JsonProperty(value = "moRefId")
    private String moRefId;

    /*
     * Gets or sets the inventory Item ID for the resource pool.
     */
    @JsonProperty(value = "inventoryItemId")
    private String inventoryItemId;

    /*
     * Gets or sets the vCenter Managed Object name for the resource pool.
     */
    @JsonProperty(value = "moName", access = JsonProperty.Access.WRITE_ONLY)
    private String moName;

    /*
     * Gets or sets CPUSharesLevel which specifies the CPU allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     */
    @JsonProperty(value = "cpuSharesLevel", access = JsonProperty.Access.WRITE_ONLY)
    private String cpuSharesLevel;

    /*
     * Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is guaranteed
     * to be available.
     */
    @JsonProperty(value = "cpuReservationMHz", access = JsonProperty.Access.WRITE_ONLY)
    private Long cpuReservationMHz;

    /*
     * Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz.
     * Utilization will not exceed this limit even if there are available resources.
     */
    @JsonProperty(value = "cpuLimitMHz", access = JsonProperty.Access.WRITE_ONLY)
    private Long cpuLimitMHz;

    /*
     * Gets or sets CPUSharesLevel which specifies the memory allocation level for this pool.
     * This property is used in relative allocation between resource consumers.
     */
    @JsonProperty(value = "memSharesLevel", access = JsonProperty.Access.WRITE_ONLY)
    private String memSharesLevel;

    /*
     * Gets or sets MemReservationMB which specifies the guaranteed available memory in
     * megabytes.
     */
    @JsonProperty(value = "memReservationMB", access = JsonProperty.Access.WRITE_ONLY)
    private Long memReservationMB;

    /*
     * Gets or sets MemLimitMB specifies a memory usage limit in megabytes.
     * Utilization will not exceed the specified limit even if there are available resources.
     */
    @JsonProperty(value = "memLimitMB", access = JsonProperty.Access.WRITE_ONLY)
    private Long memLimitMB;

    /*
     * Gets the name of the corresponding resource in Kubernetes.
     */
    @JsonProperty(value = "customResourceName", access = JsonProperty.Access.WRITE_ONLY)
    private String customResourceName;

    /*
     * The resource status information.
     */
    @JsonProperty(value = "statuses", access = JsonProperty.Access.WRITE_ONLY)
    private List<ResourceStatus> statuses;

    /*
     * Gets or sets the provisioning state.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Get the uuid property: Gets or sets a unique identifier for this resource.
     *
     * @return the uuid value.
     */
    public String uuid() {
        return this.uuid;
    }

    /**
     * Get the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     *
     * @return the vCenterId value.
     */
    public String vCenterId() {
        return this.vCenterId;
    }

    /**
     * Set the vCenterId property: Gets or sets the ARM Id of the vCenter resource in which this resource pool resides.
     *
     * @param vCenterId the vCenterId value to set.
     * @return the ResourcePoolProperties object itself.
     */
    public ResourcePoolProperties withVCenterId(String vCenterId) {
        this.vCenterId = vCenterId;
        return this;
    }

    /**
     * Get the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     *
     * @return the moRefId value.
     */
    public String moRefId() {
        return this.moRefId;
    }

    /**
     * Set the moRefId property: Gets or sets the vCenter MoRef (Managed Object Reference) ID for the resource pool.
     *
     * @param moRefId the moRefId value to set.
     * @return the ResourcePoolProperties object itself.
     */
    public ResourcePoolProperties withMoRefId(String moRefId) {
        this.moRefId = moRefId;
        return this;
    }

    /**
     * Get the inventoryItemId property: Gets or sets the inventory Item ID for the resource pool.
     *
     * @return the inventoryItemId value.
     */
    public String inventoryItemId() {
        return this.inventoryItemId;
    }

    /**
     * Set the inventoryItemId property: Gets or sets the inventory Item ID for the resource pool.
     *
     * @param inventoryItemId the inventoryItemId value to set.
     * @return the ResourcePoolProperties object itself.
     */
    public ResourcePoolProperties withInventoryItemId(String inventoryItemId) {
        this.inventoryItemId = inventoryItemId;
        return this;
    }

    /**
     * Get the moName property: Gets or sets the vCenter Managed Object name for the resource pool.
     *
     * @return the moName value.
     */
    public String moName() {
        return this.moName;
    }

    /**
     * Get the cpuSharesLevel property: Gets or sets CPUSharesLevel which specifies the CPU allocation level for this
     * pool. This property is used in relative allocation between resource consumers.
     *
     * @return the cpuSharesLevel value.
     */
    public String cpuSharesLevel() {
        return this.cpuSharesLevel;
    }

    /**
     * Get the cpuReservationMHz property: Gets or sets CPUReservationMHz which specifies the CPU size in MHz that is
     * guaranteed to be available.
     *
     * @return the cpuReservationMHz value.
     */
    public Long cpuReservationMHz() {
        return this.cpuReservationMHz;
    }

    /**
     * Get the cpuLimitMHz property: Gets or sets CPULimitMHz which specifies a CPU usage limit in MHz. Utilization will
     * not exceed this limit even if there are available resources.
     *
     * @return the cpuLimitMHz value.
     */
    public Long cpuLimitMHz() {
        return this.cpuLimitMHz;
    }

    /**
     * Get the memSharesLevel property: Gets or sets CPUSharesLevel which specifies the memory allocation level for this
     * pool. This property is used in relative allocation between resource consumers.
     *
     * @return the memSharesLevel value.
     */
    public String memSharesLevel() {
        return this.memSharesLevel;
    }

    /**
     * Get the memReservationMB property: Gets or sets MemReservationMB which specifies the guaranteed available memory
     * in megabytes.
     *
     * @return the memReservationMB value.
     */
    public Long memReservationMB() {
        return this.memReservationMB;
    }

    /**
     * Get the memLimitMB property: Gets or sets MemLimitMB specifies a memory usage limit in megabytes. Utilization
     * will not exceed the specified limit even if there are available resources.
     *
     * @return the memLimitMB value.
     */
    public Long memLimitMB() {
        return this.memLimitMB;
    }

    /**
     * Get the customResourceName property: Gets the name of the corresponding resource in Kubernetes.
     *
     * @return the customResourceName value.
     */
    public String customResourceName() {
        return this.customResourceName;
    }

    /**
     * Get the statuses property: The resource status information.
     *
     * @return the statuses value.
     */
    public List<ResourceStatus> statuses() {
        return this.statuses;
    }

    /**
     * Get the provisioningState property: Gets or sets the provisioning state.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (statuses() != null) {
            statuses().forEach(e -> e.validate());
        }
    }
}
