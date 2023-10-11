// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.util.configuration;

import com.generic.core.annotation.Fluent;
import com.generic.core.util.logging.ClientLogger;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Builds {@link Configuration} with external source.
 */
@Fluent
public final class ConfigurationBuilder {
    private static final ClientLogger LOGGER = new ClientLogger(ConfigurationBuilder.class);
    private final MutableConfigurationSource mutableSource;
    private final EnvironmentConfiguration environmentConfiguration;
    private String rootPath;
    private Configuration sharedConfiguration;

    /**
     * Creates {@code ConfigurationBuilder}.
     *
     * <!-- src_embed com.azure.core.util.ConfigurationBuilder#putProperty -->
     * <!-- end com.com.azure.core.util.ConfigurationBuilder#putProperty -->
     */
    public ConfigurationBuilder() {
        this.mutableSource = new MutableConfigurationSource();
        this.environmentConfiguration = EnvironmentConfiguration.getGlobalConfiguration();
    }

    /**
     * Creates {@code ConfigurationBuilder} with configuration source.
     *
     * <!-- src_embed com.azure.core.util.configuration.Configuration -->
     * <!-- end com.com.azure.core.util.configuration.Configuration -->
     *
     * @param source Custom {@link ConfigurationSource} containing known Azure SDK configuration properties.
     */
    public ConfigurationBuilder(ConfigurationSource source) {
        this.mutableSource = new MutableConfigurationSource(Objects.requireNonNull(source, "'source' cannot be null"));
        this.environmentConfiguration = EnvironmentConfiguration.getGlobalConfiguration();
    }

    /**
     * Creates {@code ConfigurationBuilder} with configuration sources for explicit configuration, system properties and
     * environment configuration sources. Use this constructor to customize known Azure SDK system properties and
     * environment variables retrieval.
     *
     * @param source Custom {@link ConfigurationSource} containing known Azure SDK configuration properties
     * @param systemPropertiesConfigurationSource {@link ConfigurationSource} containing known Azure SDK system
     * properties.
     * @param environmentConfigurationSource {@link ConfigurationSource} containing known Azure SDK environment
     * variables.
     */
    public ConfigurationBuilder(ConfigurationSource source, ConfigurationSource systemPropertiesConfigurationSource,
        ConfigurationSource environmentConfigurationSource) {
        Objects.requireNonNull(source, "'source' cannot be null");
        Objects.requireNonNull(systemPropertiesConfigurationSource, "'systemPropertiesConfigurationSource' cannot be null");
        Objects.requireNonNull(environmentConfigurationSource, "'environmentConfigurationSource' cannot be null");
        this.mutableSource = new MutableConfigurationSource(source);
        this.environmentConfiguration = new EnvironmentConfiguration(systemPropertiesConfigurationSource,
            environmentConfigurationSource);
    }

    /**
     * Adds property to the configuration source. In case the source already contains property with the same name, the
     * value will be overwritten with the new value passed.
     *
     * <!-- src_embed com.azure.core.util.ConfigurationBuilder#putProperty -->
     * <!-- end com.azure.core.util.ConfigurationBuilder#putProperty -->
     *
     * @param name Property name.
     * @param value Property value.
     * @return {@code ConfigurationBuilder} instance for chaining.
     */
    public ConfigurationBuilder putProperty(String name, String value) {
        Objects.requireNonNull(name, "'name' cannot be null.");
        Objects.requireNonNull(value, "'value' cannot be null.");

        mutableSource.put(name, value);
        sharedConfiguration = null;
        return this;
    }

    /**
     * Sets path to root configuration properties where shared Azure SDK properties are defined. When local per-client
     * property is missing, {@link Configuration} falls back to shared properties.
     *
     * <!-- src_embed com.azure.core.util.configuration.Configuration -->
     * <!-- end com.com.azure.core.util.configuration.Configuration -->
     *
     * @param rootPath absolute root path, can be {@code null}.
     * @return {@code ConfigurationBuilder} instance for chaining.
     */
    public ConfigurationBuilder root(String rootPath) {
        this.rootPath = rootPath;
        this.sharedConfiguration = null;
        return this;
    }

    /**
     * Builds root {@link Configuration} section. Use it for shared properties only. To read client-specific
     * configuration, use {@link ConfigurationBuilder} which can read per-client and shared
     * properties.
     *
     * <!-- src_embed com.azure.core.util.ConfigurationBuilder#build -->
     * <!-- end com.com.azure.core.util.ConfigurationBuilder#build -->
     *
     * @return Root {@link Configuration} with shared properties.
     */
    public Configuration build() {
//        if (sharedConfiguration == null) {
//            // defaults can be reused to get different client sections.
//            sharedConfiguration = new Configuration(mutableSource, environmentConfiguration, rootPath, null);
//        }

        return sharedConfiguration;
    }

    private static final class MutableConfigurationSource implements ConfigurationSource {

        private final ConfigurationSource originalSource;
        private Map<String, String> additionalConfigurations;

        private MutableConfigurationSource() {
            this(null);
        }

        private MutableConfigurationSource(ConfigurationSource originalSource) {
            this.originalSource = originalSource;
            this.additionalConfigurations = null;
        }

        MutableConfigurationSource put(String key, String value) {
            if (additionalConfigurations == null) {
                additionalConfigurations = new HashMap<>();
            }

            if (additionalConfigurations.containsKey(key)) {
                LOGGER.atWarning()
                    .addKeyValue("name", key)
                    .log("Property with the same name already exists, value will be overwritten.");
            }

            additionalConfigurations.put(key, value);

            return this;
        }

        @Override
        public Map<String, String> getProperties(String source) {
            Map<String, String> original = originalSource == null
                ? Collections.emptyMap()
                : originalSource.getProperties(source);
            if (additionalConfigurations == null) {
                return original;
            }

            Map<String, String> allConfigurations = new HashMap<>(original);
            for (Map.Entry<String, String> prop : additionalConfigurations.entrySet()) {
                if (allConfigurations.containsKey(prop.getKey())) {
                    LOGGER.atWarning()
                        .addKeyValue("name", prop.getKey())
                        .log("Property with the same name already exists, value will be overwritten.");
                }

                if (hasPrefix(prop.getKey(), source)) {
                    allConfigurations.put(prop.getKey(), prop.getValue());
                }
            }

            return allConfigurations;
        }

        private static boolean hasPrefix(String key, String prefix) {
            return prefix == null || key.startsWith(prefix) && key.length() > prefix.length() && key.charAt(prefix.length()) == '.';
        }
    }
}
