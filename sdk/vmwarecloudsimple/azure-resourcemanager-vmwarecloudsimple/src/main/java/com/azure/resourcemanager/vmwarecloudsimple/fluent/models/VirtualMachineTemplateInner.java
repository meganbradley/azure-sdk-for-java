// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.vmwarecloudsimple.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualDisk;
import com.azure.resourcemanager.vmwarecloudsimple.models.VirtualDiskController;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Virtual machine template model. */
@Fluent
public final class VirtualMachineTemplateInner {
    /*
     * virtual machine template id (privateCloudId:vsphereId)
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Azure region
     */
    @JsonProperty(value = "location")
    private String location;

    /*
     * {virtualMachineTemplateName}
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * The Virtual Machine Template properties
     */
    @JsonProperty(value = "properties")
    private VirtualMachineTemplateProperties innerProperties;

    /*
     * {resourceProviderNamespace}/{resourceType}
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /** Creates an instance of VirtualMachineTemplateInner class. */
    public VirtualMachineTemplateInner() {
    }

    /**
     * Get the id property: virtual machine template id (privateCloudId:vsphereId).
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the location property: Azure region.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: Azure region.
     *
     * @param location the location value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the name property: {virtualMachineTemplateName}.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the innerProperties property: The Virtual Machine Template properties.
     *
     * @return the innerProperties value.
     */
    private VirtualMachineTemplateProperties innerProperties() {
        return this.innerProperties;
    }

    /**
     * Get the type property: {resourceProviderNamespace}/{resourceType}.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the amountOfRam property: The amount of memory.
     *
     * @return the amountOfRam value.
     */
    public Integer amountOfRam() {
        return this.innerProperties() == null ? null : this.innerProperties().amountOfRam();
    }

    /**
     * Set the amountOfRam property: The amount of memory.
     *
     * @param amountOfRam the amountOfRam value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withAmountOfRam(Integer amountOfRam) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withAmountOfRam(amountOfRam);
        return this;
    }

    /**
     * Get the controllers property: The list of Virtual Disk Controllers.
     *
     * @return the controllers value.
     */
    public List<VirtualDiskController> controllers() {
        return this.innerProperties() == null ? null : this.innerProperties().controllers();
    }

    /**
     * Set the controllers property: The list of Virtual Disk Controllers.
     *
     * @param controllers the controllers value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withControllers(List<VirtualDiskController> controllers) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withControllers(controllers);
        return this;
    }

    /**
     * Get the description property: The description of Virtual Machine Template.
     *
     * @return the description value.
     */
    public String description() {
        return this.innerProperties() == null ? null : this.innerProperties().description();
    }

    /**
     * Set the description property: The description of Virtual Machine Template.
     *
     * @param description the description value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withDescription(String description) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withDescription(description);
        return this;
    }

    /**
     * Get the disks property: The list of Virtual Disks.
     *
     * @return the disks value.
     */
    public List<VirtualDisk> disks() {
        return this.innerProperties() == null ? null : this.innerProperties().disks();
    }

    /**
     * Set the disks property: The list of Virtual Disks.
     *
     * @param disks the disks value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withDisks(List<VirtualDisk> disks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withDisks(disks);
        return this;
    }

    /**
     * Get the exposeToGuestVM property: Expose Guest OS or not.
     *
     * @return the exposeToGuestVM value.
     */
    public Boolean exposeToGuestVM() {
        return this.innerProperties() == null ? null : this.innerProperties().exposeToGuestVM();
    }

    /**
     * Set the exposeToGuestVM property: Expose Guest OS or not.
     *
     * @param exposeToGuestVM the exposeToGuestVM value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withExposeToGuestVM(Boolean exposeToGuestVM) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withExposeToGuestVM(exposeToGuestVM);
        return this;
    }

    /**
     * Get the guestOS property: The Guest OS.
     *
     * @return the guestOS value.
     */
    public String guestOS() {
        return this.innerProperties() == null ? null : this.innerProperties().guestOS();
    }

    /**
     * Get the guestOSType property: The Guest OS types.
     *
     * @return the guestOSType value.
     */
    public String guestOSType() {
        return this.innerProperties() == null ? null : this.innerProperties().guestOSType();
    }

    /**
     * Get the nics property: The list of Virtual NICs.
     *
     * @return the nics value.
     */
    public List<VirtualNicInner> nics() {
        return this.innerProperties() == null ? null : this.innerProperties().nics();
    }

    /**
     * Set the nics property: The list of Virtual NICs.
     *
     * @param nics the nics value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withNics(List<VirtualNicInner> nics) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withNics(nics);
        return this;
    }

    /**
     * Get the numberOfCores property: The number of CPU cores.
     *
     * @return the numberOfCores value.
     */
    public Integer numberOfCores() {
        return this.innerProperties() == null ? null : this.innerProperties().numberOfCores();
    }

    /**
     * Set the numberOfCores property: The number of CPU cores.
     *
     * @param numberOfCores the numberOfCores value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withNumberOfCores(Integer numberOfCores) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withNumberOfCores(numberOfCores);
        return this;
    }

    /**
     * Get the path property: path to folder.
     *
     * @return the path value.
     */
    public String path() {
        return this.innerProperties() == null ? null : this.innerProperties().path();
    }

    /**
     * Set the path property: path to folder.
     *
     * @param path the path value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withPath(String path) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withPath(path);
        return this;
    }

    /**
     * Get the privateCloudId property: The Private Cloud Id.
     *
     * @return the privateCloudId value.
     */
    public String privateCloudId() {
        return this.innerProperties() == null ? null : this.innerProperties().privateCloudId();
    }

    /**
     * Set the privateCloudId property: The Private Cloud Id.
     *
     * @param privateCloudId the privateCloudId value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withPrivateCloudId(String privateCloudId) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withPrivateCloudId(privateCloudId);
        return this;
    }

    /**
     * Get the vSphereNetworks property: The list of VSphere networks.
     *
     * @return the vSphereNetworks value.
     */
    public List<String> vSphereNetworks() {
        return this.innerProperties() == null ? null : this.innerProperties().vSphereNetworks();
    }

    /**
     * Set the vSphereNetworks property: The list of VSphere networks.
     *
     * @param vSphereNetworks the vSphereNetworks value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withVSphereNetworks(List<String> vSphereNetworks) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withVSphereNetworks(vSphereNetworks);
        return this;
    }

    /**
     * Get the vSphereTags property: The tags from VSphere.
     *
     * @return the vSphereTags value.
     */
    public List<String> vSphereTags() {
        return this.innerProperties() == null ? null : this.innerProperties().vSphereTags();
    }

    /**
     * Set the vSphereTags property: The tags from VSphere.
     *
     * @param vSphereTags the vSphereTags value to set.
     * @return the VirtualMachineTemplateInner object itself.
     */
    public VirtualMachineTemplateInner withVSphereTags(List<String> vSphereTags) {
        if (this.innerProperties() == null) {
            this.innerProperties = new VirtualMachineTemplateProperties();
        }
        this.innerProperties().withVSphereTags(vSphereTags);
        return this;
    }

    /**
     * Get the vmwaretools property: The VMware tools version.
     *
     * @return the vmwaretools value.
     */
    public String vmwaretools() {
        return this.innerProperties() == null ? null : this.innerProperties().vmwaretools();
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
    }
}
