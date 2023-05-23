// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

import com.azure.autorest.customization.Customization;
import com.azure.autorest.customization.Editor;
import com.azure.autorest.customization.LibraryCustomization;
import org.slf4j.Logger;

/**
 * Contains customizations for Azure KeyVault's Settings swagger code generation.
 */
public class SettingsCustomizations extends Customization {
    @Override
    public void customize(LibraryCustomization libraryCustomization, Logger logger) {
        customizePackageInfos(libraryCustomization.getRawEditor());
    }

    private static void customizePackageInfos(Editor editor) {
        editor.replaceFile("src/main/java/com/azure/security/keyvault/administration/package-info.java",
            joinWithNewline(
                "// Copyright (c) Microsoft Corporation. All rights reserved.",
                "// Licensed under the MIT License.",
                "// Code generated by Microsoft (R) AutoRest Code Generator.",
                "",
                "/**",
                " * Package containing classes for creating clients {@link",
                " * com.azure.security.keyvault.administration.KeyVaultAccessControlAsyncClient} and {@link",
                " * com.azure.security.keyvault.administration.KeyVaultAccessControlClient} that perform access control operations on",
                " * Azure Key Vault resources, as well as clients {@link",
                " * com.azure.security.keyvault.administration.KeyVaultBackupAsyncClient} and {@link",
                " * com.azure.security.keyvault.administration.KeyVaultBackupClient} that perform backup and restore operations on Azure",
                " * Key Vault keys.",
                " */",
                "package com.azure.security.keyvault.administration;",
                ""
            ));

        editor.replaceFile("src/main/java/com/azure/security/keyvault/administration/models/package-info.java",
            joinWithNewline(
                "// Copyright (c) Microsoft Corporation. All rights reserved.",
                "// Licensed under the MIT License.",
                "// Code generated by Microsoft (R) AutoRest Code Generator.",
                "",
                "/**",
                " * Package containing classes used by {@link",
                " * com.azure.security.keyvault.administration.KeyVaultAccessControlAsyncClient} and {@link",
                " * com.azure.security.keyvault.administration.KeyVaultAccessControlClient} to perform access control operations on Azure",
                " * Key Vault resources, as well as classes used by {@link",
                " * com.azure.security.keyvault.administration.KeyVaultBackupAsyncClient} and {@link",
                " * com.azure.security.keyvault.administration.KeyVaultBackupClient} to perform backup and restore operations on Azure",
                " * Key Vault keys.",
                " */",
                "package com.azure.security.keyvault.administration.models;",
                ""
            ));

        editor.replaceFile("src/main/java/com/azure/security/keyvault/administration/implementation/package-info.java",
            joinWithNewline(
                "// Copyright (c) Microsoft Corporation. All rights reserved.",
                "// Licensed under the MIT License.",
                "// Code generated by Microsoft (R) AutoRest Code Generator.",
                "",
                "/**",
                " * Package containing the implementations for KeyVaultAccessControlClient, KeyVaultBackupClient, and",
                " * KeyVaultSettingsClient. The key vault client performs cryptographic key operations and vault operations against the",
                " * Key Vault service.",
                " */",
                "package com.azure.security.keyvault.administration.implementation;",
                ""
            ));

        editor.replaceFile("src/main/java/com/azure/security/keyvault/administration/implementation/models/package-info.java",
            joinWithNewline(
                "// Copyright (c) Microsoft Corporation. All rights reserved.",
                "// Licensed under the MIT License.",
                "// Code generated by Microsoft (R) AutoRest Code Generator.",
                "",
                "/**",
                " * Package containing the data models for KeyVaultAccessControlClient, KeyVaultBackupClient, and KeyVaultSettingsClient.",
                " * The key vault client performs cryptographic key operations and vault operations against the Key Vault service.",
                " */",
                "package com.azure.security.keyvault.administration.implementation.models;",
                ""
            ));
    }

    private static String joinWithNewline(String... lines) {
        return String.join("\n", lines);
    }
}
