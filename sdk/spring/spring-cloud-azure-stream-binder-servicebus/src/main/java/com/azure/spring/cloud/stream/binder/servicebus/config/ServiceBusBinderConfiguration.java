// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.cloud.stream.binder.servicebus.config;

import com.azure.identity.DefaultAzureCredential;
import com.azure.spring.cloud.autoconfigure.context.AzureGlobalPropertiesAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.context.AzureTokenCredentialAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.resourcemanager.AzureResourceManagerAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.resourcemanager.AzureServiceBusResourceManagerAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.servicebus.AzureServiceBusAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.servicebus.AzureServiceBusMessagingAutoConfiguration;
import com.azure.spring.cloud.autoconfigure.implementation.servicebus.properties.AzureServiceBusProperties;
import com.azure.spring.cloud.stream.binder.servicebus.ServiceBusMessageChannelBinder;
import com.azure.spring.cloud.stream.binder.servicebus.properties.ServiceBusExtendedBindingProperties;
import com.azure.spring.cloud.stream.binder.servicebus.provisioning.ServiceBusChannelProvisioner;
import com.azure.spring.cloud.stream.binder.servicebus.provisioning.ServiceBusChannelResourceManagerProvisioner;
import com.azure.spring.core.implementation.credential.resolver.AzureTokenCredentialResolver;
import com.azure.spring.resourcemanager.provisioning.servicebus.ServiceBusProvisioner;
import com.azure.spring.servicebus.core.processor.DefaultServiceBusNamespaceProcessorFactory;
import com.azure.spring.servicebus.core.processor.ServiceBusProcessorFactory;
import com.azure.spring.servicebus.core.producer.DefaultServiceBusNamespaceProducerFactory;
import com.azure.spring.servicebus.core.producer.ServiceBusProducerFactory;
import com.azure.spring.servicebus.core.properties.NamespaceProperties;
import com.azure.spring.servicebus.support.converter.ServiceBusMessageConverter;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.stream.binder.Binder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.lang.Nullable;

import java.util.stream.Collectors;

import static com.azure.spring.cloud.autoconfigure.context.AzureContextUtils.DEFAULT_TOKEN_CREDENTIAL_BEAN_NAME;

/**
 *
 */
@Configuration(proxyBeanMethods = false)
@ConditionalOnMissingBean(Binder.class)
@Import({
    AzureGlobalPropertiesAutoConfiguration.class,
    AzureTokenCredentialAutoConfiguration.class,
    AzureResourceManagerAutoConfiguration.class,
    AzureServiceBusResourceManagerAutoConfiguration.class,
    AzureServiceBusAutoConfiguration.class,
    AzureServiceBusMessagingAutoConfiguration.class,
    ServiceBusBinderHealthIndicatorConfiguration.class
})
@EnableConfigurationProperties(ServiceBusExtendedBindingProperties.class)
public class ServiceBusBinderConfiguration {

    /**
     * Declare Service Bus Channel Provisioner bean.
     *
     * @param serviceBusProperties the service bus properties
     * @param serviceBusProvisioner the service bus provisioner
     * @return ServiceBusChannelProvisioner bean the Service Bus Channel Provisioner bean
     */
    @Bean
    @ConditionalOnMissingBean
    @ConditionalOnBean({ ServiceBusProvisioner.class, AzureServiceBusProperties.class })
    ServiceBusChannelProvisioner serviceBusChannelArmProvisioner(AzureServiceBusProperties serviceBusProperties,
                                                                 ServiceBusProvisioner serviceBusProvisioner) {


        return new ServiceBusChannelResourceManagerProvisioner(serviceBusProperties.getNamespace(),
            serviceBusProvisioner);
    }

    /**
     * Declare Service Bus Channel Provisioner bean.
     *
     * @return ServiceBusChannelProvisioner bean the Service Bus Channel Provisioner bean
     */
    @Bean
    @ConditionalOnMissingBean({ServiceBusProvisioner.class, ServiceBusChannelProvisioner.class})
    public ServiceBusChannelProvisioner serviceBusChannelProvisioner() {
        return new ServiceBusChannelProvisioner();
    }

    /**
     * Declare Service Bus Message Channel Binder bean.
     *
     * @param channelProvisioner the channel Provisioner
     * @param bindingProperties the binding Properties
     * @param namespaceProperties the namespace Properties
     * @param messageConverter the message Converter
     * @param customizers the client factory customizers
     * @return ServiceBusMessageChannelBinder bean the Service Bus Message Channel Binder bean
     */
    @Bean
    @ConditionalOnMissingBean
    public ServiceBusMessageChannelBinder serviceBusBinder(ServiceBusChannelProvisioner channelProvisioner,
                                                           ServiceBusExtendedBindingProperties bindingProperties,
                                                           ObjectProvider<NamespaceProperties> namespaceProperties,
                                                           @Nullable ServiceBusMessageConverter messageConverter,
                                                           ObjectProvider<ClientFactoryCustomizer> customizers) {

        ServiceBusMessageChannelBinder binder = new ServiceBusMessageChannelBinder(null, channelProvisioner);
        binder.setBindingProperties(bindingProperties);
        binder.setNamespaceProperties(namespaceProperties.getIfAvailable());
        binder.setMessageConverter(messageConverter);
        binder.setClientFactoryCustomizers(customizers.orderedStream().collect(Collectors.toList()));
        return binder;
    }

    @Bean
    @ConditionalOnMissingBean
    ClientFactoryCustomizer defaultClientFactoryCustomizer(
        AzureTokenCredentialResolver azureTokenCredentialResolver,
        @Qualifier(DEFAULT_TOKEN_CREDENTIAL_BEAN_NAME) DefaultAzureCredential defaultAzureCredential) {

        return new CredentialClientFactoryCustomizer(defaultAzureCredential, azureTokenCredentialResolver);
    }

    /**
     * The {@link ClientFactoryCustomizer} to configure the credential related properties.
     */
    private static class CredentialClientFactoryCustomizer implements ClientFactoryCustomizer {

        private final DefaultAzureCredential defaultAzureCredential;
        private final AzureTokenCredentialResolver tokenCredentialResolver;

        CredentialClientFactoryCustomizer(DefaultAzureCredential defaultAzureCredential,
                                                 AzureTokenCredentialResolver azureTokenCredentialResolver) {
            this.defaultAzureCredential = defaultAzureCredential;
            this.tokenCredentialResolver = azureTokenCredentialResolver;
        }

        @Override
        public void customize(ServiceBusProducerFactory factory) {
            if (factory instanceof DefaultServiceBusNamespaceProducerFactory) {
                DefaultServiceBusNamespaceProducerFactory defaultFactory =
                    (DefaultServiceBusNamespaceProducerFactory) factory;

                defaultFactory.setDefaultAzureCredential(defaultAzureCredential);
                defaultFactory.setTokenCredentialResolver(tokenCredentialResolver);
            }
        }

        @Override
        public void customize(ServiceBusProcessorFactory factory) {
            if (factory instanceof DefaultServiceBusNamespaceProcessorFactory) {
                DefaultServiceBusNamespaceProcessorFactory defaultFactory =
                    (DefaultServiceBusNamespaceProcessorFactory) factory;

                defaultFactory.setDefaultAzureCredential(defaultAzureCredential);
                defaultFactory.setTokenCredentialResolver(tokenCredentialResolver);
            }

        }
    }


}
