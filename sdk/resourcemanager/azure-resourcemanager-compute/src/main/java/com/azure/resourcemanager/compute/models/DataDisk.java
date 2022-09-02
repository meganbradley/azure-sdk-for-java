// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.compute.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Describes a data disk. */
@Fluent
public final class DataDisk {
    /*
     * Specifies the logical unit number of the data disk. This value is used to identify data disks within the VM and
     * therefore must be unique for each data disk attached to a VM.
     */
    @JsonProperty(value = "lun", required = true)
    private int lun;

    /*
     * The disk name.
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * The virtual hard disk.
     */
    @JsonProperty(value = "vhd")
    private VirtualHardDisk vhd;

    /*
     * The source user image virtual hard disk. The virtual hard disk will be copied before being attached to the
     * virtual machine. If SourceImage is provided, the destination virtual hard drive must not exist.
     */
    @JsonProperty(value = "image")
    private VirtualHardDisk image;

    /*
     * Specifies the caching requirements. <br><br> Possible values are: <br><br> **None** <br><br> **ReadOnly**
     * <br><br> **ReadWrite** <br><br> Default: **None for Standard storage. ReadOnly for Premium storage**
     */
    @JsonProperty(value = "caching")
    private CachingTypes caching;

    /*
     * Specifies whether writeAccelerator should be enabled or disabled on the disk.
     */
    @JsonProperty(value = "writeAcceleratorEnabled")
    private Boolean writeAcceleratorEnabled;

    /*
     * Specifies how the virtual machine should be created.<br><br> Possible values are:<br><br> **Attach** \u2013 This
     * value is used when you are using a specialized disk to create the virtual machine.<br><br> **FromImage** \u2013
     * This value is used when you are using an image to create the virtual machine. If you are using a platform image,
     * you also use the imageReference element described above. If you are using a marketplace image, you  also use the
     * plan element previously described.
     */
    @JsonProperty(value = "createOption", required = true)
    private DiskCreateOptionTypes createOption;

    /*
     * Specifies the size of an empty data disk in gigabytes. This element can be used to overwrite the size of the
     * disk in a virtual machine image. <br><br> This value cannot be larger than 1023 GB
     */
    @JsonProperty(value = "diskSizeGB")
    private Integer diskSizeGB;

    /*
     * The managed disk parameters.
     */
    @JsonProperty(value = "managedDisk")
    private ManagedDiskParameters managedDisk;

    /*
     * Specifies whether the data disk is in process of detachment from the VirtualMachine/VirtualMachineScaleset
     */
    @JsonProperty(value = "toBeDetached")
    private Boolean toBeDetached;

    /*
     * Specifies the Read-Write IOPS for the managed disk when StorageAccountType is UltraSSD_LRS. Returned only for
     * VirtualMachine ScaleSet VM disks. Can be updated only via updates to the VirtualMachine Scale Set.
     */
    @JsonProperty(value = "diskIOPSReadWrite", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskIopsReadWrite;

    /*
     * Specifies the bandwidth in MB per second for the managed disk when StorageAccountType is UltraSSD_LRS. Returned
     * only for VirtualMachine ScaleSet VM disks. Can be updated only via updates to the VirtualMachine Scale Set.
     */
    @JsonProperty(value = "diskMBpsReadWrite", access = JsonProperty.Access.WRITE_ONLY)
    private Long diskMBpsReadWrite;

    /*
     * Specifies the detach behavior to be used while detaching a disk or which is already in the process of detachment
     * from the virtual machine. Supported values: **ForceDetach**. <br><br> detachOption: **ForceDetach** is
     * applicable only for managed data disks. If a previous detachment attempt of the data disk did not complete due
     * to an unexpected failure from the virtual machine and the disk is still not released then use force-detach as a
     * last resort option to detach the disk forcibly from the VM. All writes might not have been flushed when using
     * this detach behavior. <br><br> This feature is still in preview mode and is not supported for
     * VirtualMachineScaleSet. To force-detach a data disk update toBeDetached to 'true' along with setting
     * detachOption: 'ForceDetach'.
     */
    @JsonProperty(value = "detachOption")
    private DiskDetachOptionTypes detachOption;

    /*
     * Specifies whether data disk should be deleted or detached upon VM deletion.<br><br> Possible values: <br><br>
     * **Delete** If this value is used, the data disk is deleted when VM is deleted.<br><br> **Detach** If this value
     * is used, the data disk is retained after VM is deleted.<br><br> The default value is set to **detach**
     */
    @JsonProperty(value = "deleteOption")
    private DiskDeleteOptionTypes deleteOption;

    /**
     * Get the lun property: Specifies the logical unit number of the data disk. This value is used to identify data
     * disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @return the lun value.
     */
    public int lun() {
        return this.lun;
    }

    /**
     * Set the lun property: Specifies the logical unit number of the data disk. This value is used to identify data
     * disks within the VM and therefore must be unique for each data disk attached to a VM.
     *
     * @param lun the lun value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withLun(int lun) {
        this.lun = lun;
        return this;
    }

    /**
     * Get the name property: The disk name.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name property: The disk name.
     *
     * @param name the name value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the vhd property: The virtual hard disk.
     *
     * @return the vhd value.
     */
    public VirtualHardDisk vhd() {
        return this.vhd;
    }

    /**
     * Set the vhd property: The virtual hard disk.
     *
     * @param vhd the vhd value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withVhd(VirtualHardDisk vhd) {
        this.vhd = vhd;
        return this;
    }

    /**
     * Get the image property: The source user image virtual hard disk. The virtual hard disk will be copied before
     * being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     * exist.
     *
     * @return the image value.
     */
    public VirtualHardDisk image() {
        return this.image;
    }

    /**
     * Set the image property: The source user image virtual hard disk. The virtual hard disk will be copied before
     * being attached to the virtual machine. If SourceImage is provided, the destination virtual hard drive must not
     * exist.
     *
     * @param image the image value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withImage(VirtualHardDisk image) {
        this.image = image;
        return this;
    }

    /**
     * Get the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @return the caching value.
     */
    public CachingTypes caching() {
        return this.caching;
    }

    /**
     * Set the caching property: Specifies the caching requirements. &lt;br&gt;&lt;br&gt; Possible values are:
     * &lt;br&gt;&lt;br&gt; **None** &lt;br&gt;&lt;br&gt; **ReadOnly** &lt;br&gt;&lt;br&gt; **ReadWrite**
     * &lt;br&gt;&lt;br&gt; Default: **None for Standard storage. ReadOnly for Premium storage**.
     *
     * @param caching the caching value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withCaching(CachingTypes caching) {
        this.caching = caching;
        return this;
    }

    /**
     * Get the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @return the writeAcceleratorEnabled value.
     */
    public Boolean writeAcceleratorEnabled() {
        return this.writeAcceleratorEnabled;
    }

    /**
     * Set the writeAcceleratorEnabled property: Specifies whether writeAccelerator should be enabled or disabled on the
     * disk.
     *
     * @param writeAcceleratorEnabled the writeAcceleratorEnabled value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withWriteAcceleratorEnabled(Boolean writeAcceleratorEnabled) {
        this.writeAcceleratorEnabled = writeAcceleratorEnabled;
        return this;
    }

    /**
     * Get the createOption property: Specifies how the virtual machine should be created.&lt;br&gt;&lt;br&gt; Possible
     * values are:&lt;br&gt;&lt;br&gt; **Attach** \u2013 This value is used when you are using a specialized disk to
     * create the virtual machine.&lt;br&gt;&lt;br&gt; **FromImage** \u2013 This value is used when you are using an
     * image to create the virtual machine. If you are using a platform image, you also use the imageReference element
     * described above. If you are using a marketplace image, you also use the plan element previously described.
     *
     * @return the createOption value.
     */
    public DiskCreateOptionTypes createOption() {
        return this.createOption;
    }

    /**
     * Set the createOption property: Specifies how the virtual machine should be created.&lt;br&gt;&lt;br&gt; Possible
     * values are:&lt;br&gt;&lt;br&gt; **Attach** \u2013 This value is used when you are using a specialized disk to
     * create the virtual machine.&lt;br&gt;&lt;br&gt; **FromImage** \u2013 This value is used when you are using an
     * image to create the virtual machine. If you are using a platform image, you also use the imageReference element
     * described above. If you are using a marketplace image, you also use the plan element previously described.
     *
     * @param createOption the createOption value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withCreateOption(DiskCreateOptionTypes createOption) {
        this.createOption = createOption;
        return this;
    }

    /**
     * Get the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     *
     * @return the diskSizeGB value.
     */
    public Integer diskSizeGB() {
        return this.diskSizeGB;
    }

    /**
     * Set the diskSizeGB property: Specifies the size of an empty data disk in gigabytes. This element can be used to
     * overwrite the size of the disk in a virtual machine image. &lt;br&gt;&lt;br&gt; This value cannot be larger than
     * 1023 GB.
     *
     * @param diskSizeGB the diskSizeGB value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withDiskSizeGB(Integer diskSizeGB) {
        this.diskSizeGB = diskSizeGB;
        return this;
    }

    /**
     * Get the managedDisk property: The managed disk parameters.
     *
     * @return the managedDisk value.
     */
    public ManagedDiskParameters managedDisk() {
        return this.managedDisk;
    }

    /**
     * Set the managedDisk property: The managed disk parameters.
     *
     * @param managedDisk the managedDisk value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withManagedDisk(ManagedDiskParameters managedDisk) {
        this.managedDisk = managedDisk;
        return this;
    }

    /**
     * Get the toBeDetached property: Specifies whether the data disk is in process of detachment from the
     * VirtualMachine/VirtualMachineScaleset.
     *
     * @return the toBeDetached value.
     */
    public Boolean toBeDetached() {
        return this.toBeDetached;
    }

    /**
     * Set the toBeDetached property: Specifies whether the data disk is in process of detachment from the
     * VirtualMachine/VirtualMachineScaleset.
     *
     * @param toBeDetached the toBeDetached value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withToBeDetached(Boolean toBeDetached) {
        this.toBeDetached = toBeDetached;
        return this;
    }

    /**
     * Get the diskIopsReadWrite property: Specifies the Read-Write IOPS for the managed disk when StorageAccountType is
     * UltraSSD_LRS. Returned only for VirtualMachine ScaleSet VM disks. Can be updated only via updates to the
     * VirtualMachine Scale Set.
     *
     * @return the diskIopsReadWrite value.
     */
    public Long diskIopsReadWrite() {
        return this.diskIopsReadWrite;
    }

    /**
     * Get the diskMBpsReadWrite property: Specifies the bandwidth in MB per second for the managed disk when
     * StorageAccountType is UltraSSD_LRS. Returned only for VirtualMachine ScaleSet VM disks. Can be updated only via
     * updates to the VirtualMachine Scale Set.
     *
     * @return the diskMBpsReadWrite value.
     */
    public Long diskMBpsReadWrite() {
        return this.diskMBpsReadWrite;
    }

    /**
     * Get the detachOption property: Specifies the detach behavior to be used while detaching a disk or which is
     * already in the process of detachment from the virtual machine. Supported values: **ForceDetach**.
     * &lt;br&gt;&lt;br&gt; detachOption: **ForceDetach** is applicable only for managed data disks. If a previous
     * detachment attempt of the data disk did not complete due to an unexpected failure from the virtual machine and
     * the disk is still not released then use force-detach as a last resort option to detach the disk forcibly from the
     * VM. All writes might not have been flushed when using this detach behavior. &lt;br&gt;&lt;br&gt; This feature is
     * still in preview mode and is not supported for VirtualMachineScaleSet. To force-detach a data disk update
     * toBeDetached to 'true' along with setting detachOption: 'ForceDetach'.
     *
     * @return the detachOption value.
     */
    public DiskDetachOptionTypes detachOption() {
        return this.detachOption;
    }

    /**
     * Set the detachOption property: Specifies the detach behavior to be used while detaching a disk or which is
     * already in the process of detachment from the virtual machine. Supported values: **ForceDetach**.
     * &lt;br&gt;&lt;br&gt; detachOption: **ForceDetach** is applicable only for managed data disks. If a previous
     * detachment attempt of the data disk did not complete due to an unexpected failure from the virtual machine and
     * the disk is still not released then use force-detach as a last resort option to detach the disk forcibly from the
     * VM. All writes might not have been flushed when using this detach behavior. &lt;br&gt;&lt;br&gt; This feature is
     * still in preview mode and is not supported for VirtualMachineScaleSet. To force-detach a data disk update
     * toBeDetached to 'true' along with setting detachOption: 'ForceDetach'.
     *
     * @param detachOption the detachOption value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withDetachOption(DiskDetachOptionTypes detachOption) {
        this.detachOption = detachOption;
        return this;
    }

    /**
     * Get the deleteOption property: Specifies whether data disk should be deleted or detached upon VM
     * deletion.&lt;br&gt;&lt;br&gt; Possible values: &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the data
     * disk is deleted when VM is deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the data disk is
     * retained after VM is deleted.&lt;br&gt;&lt;br&gt; The default value is set to **detach**.
     *
     * @return the deleteOption value.
     */
    public DiskDeleteOptionTypes deleteOption() {
        return this.deleteOption;
    }

    /**
     * Set the deleteOption property: Specifies whether data disk should be deleted or detached upon VM
     * deletion.&lt;br&gt;&lt;br&gt; Possible values: &lt;br&gt;&lt;br&gt; **Delete** If this value is used, the data
     * disk is deleted when VM is deleted.&lt;br&gt;&lt;br&gt; **Detach** If this value is used, the data disk is
     * retained after VM is deleted.&lt;br&gt;&lt;br&gt; The default value is set to **detach**.
     *
     * @param deleteOption the deleteOption value to set.
     * @return the DataDisk object itself.
     */
    public DataDisk withDeleteOption(DiskDeleteOptionTypes deleteOption) {
        this.deleteOption = deleteOption;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (vhd() != null) {
            vhd().validate();
        }
        if (image() != null) {
            image().validate();
        }
        if (createOption() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException("Missing required property createOption in model DataDisk"));
        }
        if (managedDisk() != null) {
            managedDisk().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(DataDisk.class);
}
