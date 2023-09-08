// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

module com.azure.resourcemanager.hybridconnectivity {
    requires transitive com.azure.core.management;

    exports com.azure.resourcemanager.hybridconnectivity;
    exports com.azure.resourcemanager.hybridconnectivity.fluent;
    exports com.azure.resourcemanager.hybridconnectivity.fluent.models;
    exports com.azure.resourcemanager.hybridconnectivity.models;

    opens com.azure.resourcemanager.hybridconnectivity.fluent.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
    opens com.azure.resourcemanager.hybridconnectivity.models to
        com.azure.core,
        com.fasterxml.jackson.databind;
}
