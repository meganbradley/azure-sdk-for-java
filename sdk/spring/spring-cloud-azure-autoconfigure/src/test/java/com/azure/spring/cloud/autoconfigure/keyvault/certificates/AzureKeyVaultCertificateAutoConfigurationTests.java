// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.autoconfigure.keyvault.certificates;

import com.azure.data.appconfiguration.ConfigurationClientBuilder;
import com.azure.security.keyvault.certificates.CertificateAsyncClient;
import com.azure.security.keyvault.certificates.CertificateClient;
import com.azure.security.keyvault.certificates.CertificateClientBuilder;
import com.azure.spring.cloud.autoconfigure.TestBuilderCustomizer;
import com.azure.spring.cloud.autoconfigure.implementation.keyvault.certificates.properties.AzureKeyVaultCertificateProperties;
import com.azure.spring.cloud.autoconfigure.implementation.properties.AzureGlobalProperties;
import com.azure.spring.service.implementation.keyvault.certificates.CertificateClientBuilderFactory;
import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.FilteredClassLoader;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

import static org.assertj.core.api.Assertions.assertThat;

class AzureKeyVaultCertificateAutoConfigurationTests {


    private static final String ENDPOINT = "https:/%s.vault.azure.net/";

    private final ApplicationContextRunner contextRunner = new ApplicationContextRunner()
        .withBean(AzureGlobalProperties.class, AzureGlobalProperties::new)
        .withConfiguration(AutoConfigurations.of(AzureKeyVaultCertificateAutoConfiguration.class));

    @Test
    void withoutCertificateClientBuilderShouldNotConfigure() {
        this.contextRunner
            .withClassLoader(new FilteredClassLoader(CertificateClientBuilder.class))
            .withPropertyValues("spring.cloud.azure.keyvault.certificate.endpoint=" + String.format(ENDPOINT, "mykv"))
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @Test
    void disableKeyVaultCertificateShouldNotConfigure() {
        this.contextRunner
            .withPropertyValues(
                "spring.cloud.azure.keyvault.certificate.enabled=false",
                "spring.cloud.azure.keyvault.certificate.endpoint=" + String.format(ENDPOINT, "mykv")
            )
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @Test
    void withoutVaultEndpointShouldNotConfigure() {
        this.contextRunner
            .run(context -> assertThat(context).doesNotHaveBean(AzureKeyVaultCertificateAutoConfiguration.class));
    }

    @Test
    void withVaultEndpointShouldConfigure() {
        this.contextRunner
            .withPropertyValues("spring.cloud.azure.keyvault.certificate.endpoint=" + String.format(ENDPOINT, "mykv"))
            .run(context -> {
                assertThat(context).hasSingleBean(AzureKeyVaultCertificateAutoConfiguration.class);
                assertThat(context).hasSingleBean(AzureKeyVaultCertificateProperties.class);
                assertThat(context).hasSingleBean(CertificateClient.class);
                assertThat(context).hasSingleBean(CertificateAsyncClient.class);
                assertThat(context).hasSingleBean(CertificateClientBuilder.class);
                assertThat(context).hasSingleBean(CertificateClientBuilderFactory.class);
            });
    }

    @Test
    void customizerShouldBeCalled() {
        CertificateBuilderCustomizer customizer = new CertificateBuilderCustomizer();
        this.contextRunner
            .withPropertyValues("spring.cloud.azure.keyvault.certificate.endpoint=" + String.format(ENDPOINT, "mykv"))
            .withBean("customizer1", CertificateBuilderCustomizer.class, () -> customizer)
            .withBean("customizer2", CertificateBuilderCustomizer.class, () -> customizer)
            .run(context -> assertThat(customizer.getCustomizedTimes()).isEqualTo(2));
    }

    @Test
    void otherCustomizerShouldNotBeCalled() {
        CertificateBuilderCustomizer customizer = new CertificateBuilderCustomizer();
        OtherBuilderCustomizer otherBuilderCustomizer = new OtherBuilderCustomizer();
        this.contextRunner
            .withPropertyValues("spring.cloud.azure.keyvault.certificate.endpoint=" + String.format(ENDPOINT, "mykv"))
            .withBean("customizer1", CertificateBuilderCustomizer.class, () -> customizer)
            .withBean("customizer2", CertificateBuilderCustomizer.class, () -> customizer)
            .withBean("customizer3", OtherBuilderCustomizer.class, () -> otherBuilderCustomizer)
            .run(context -> {
                assertThat(customizer.getCustomizedTimes()).isEqualTo(2);
                assertThat(otherBuilderCustomizer.getCustomizedTimes()).isEqualTo(0);
            });
    }

    private static class CertificateBuilderCustomizer extends TestBuilderCustomizer<CertificateClientBuilder> {

    }

    private static class OtherBuilderCustomizer extends TestBuilderCustomizer<ConfigurationClientBuilder> {

    }

}
