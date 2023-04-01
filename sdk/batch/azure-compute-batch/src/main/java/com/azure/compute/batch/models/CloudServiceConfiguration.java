// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The configuration for Compute Nodes in a Pool based on the Azure Cloud Services platform. */
@Fluent
public final class CloudServiceConfiguration {
    /*
     * Possible values are:
     * 2 - OS Family 2, equivalent to Windows Server 2008 R2
     * SP1.
     * 3 - OS Family 3, equivalent to Windows Server 2012.
     * 4 - OS Family 4,
     * equivalent to Windows Server 2012 R2.
     * 5 - OS Family 5, equivalent to Windows
     * Server 2016.
     * 6 - OS Family 6, equivalent to Windows Server 2019. For more
     * information, see Azure Guest OS Releases
     * (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     */
    @JsonProperty(value = "osFamily", required = true)
    private String osFamily;

    /*
     * The default value is * which specifies the latest operating system version for
     * the specified OS family.
     */
    @JsonProperty(value = "osVersion")
    private String osVersion;

    /**
     * Creates an instance of CloudServiceConfiguration class.
     *
     * @param osFamily the osFamily value to set.
     */
    @JsonCreator
    public CloudServiceConfiguration(@JsonProperty(value = "osFamily", required = true) String osFamily) {
        this.osFamily = osFamily;
    }

    /**
     * Get the osFamily property: Possible values are: 2 - OS Family 2, equivalent to Windows Server 2008 R2 SP1. 3 - OS
     * Family 3, equivalent to Windows Server 2012. 4 - OS Family 4, equivalent to Windows Server 2012 R2. 5 - OS Family
     * 5, equivalent to Windows Server 2016. 6 - OS Family 6, equivalent to Windows Server 2019. For more information,
     * see Azure Guest OS Releases
     * (https://azure.microsoft.com/documentation/articles/cloud-services-guestos-update-matrix/#releases).
     *
     * @return the osFamily value.
     */
    public String getOsFamily() {
        return this.osFamily;
    }

    /**
     * Get the osVersion property: The default value is * which specifies the latest operating system version for the
     * specified OS family.
     *
     * @return the osVersion value.
     */
    public String getOsVersion() {
        return this.osVersion;
    }

    /**
     * Set the osVersion property: The default value is * which specifies the latest operating system version for the
     * specified OS family.
     *
     * @param osVersion the osVersion value to set.
     * @return the CloudServiceConfiguration object itself.
     */
    public CloudServiceConfiguration setOsVersion(String osVersion) {
        this.osVersion = osVersion;
        return this;
    }
}
