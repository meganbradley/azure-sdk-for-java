// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.spring.eventhubs.core.properties.merger;

import com.azure.spring.core.properties.AzurePropertiesUtils;
import com.azure.spring.core.properties.PropertyMapper;
import com.azure.spring.eventhubs.core.properties.NamespaceProperties;
import com.azure.spring.eventhubs.core.properties.ProducerProperties;
import com.azure.spring.service.core.ParentMerger;

/**
 * A merger used to merge a {@link ProducerProperties} with its parent {@link NamespaceProperties}. When a property is
 *  * set in the child, it will be kept. For those properties not set in the child, it will use the value in the
 *  parent.
 */
public class ProducerPropertiesParentMerger implements ParentMerger<ProducerProperties, NamespaceProperties> {

    @Override
    public ProducerProperties mergeParent(ProducerProperties child, NamespaceProperties parent) {
        ProducerProperties properties = new ProducerProperties();
        if (child == null && parent == null) {
            return properties;
        }
        if (child == null) {
            child = new ProducerProperties();
        }
        if (parent == null) {
            parent = new NamespaceProperties();
        }

        PropertyMapper propertyMapper = new PropertyMapper();

        AzurePropertiesUtils.mergeAzureCommonProperties(parent, child, properties);

        propertyMapper.from(parent.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(parent.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(parent.getEventHubName()).to(properties::setEventHubName);
        propertyMapper.from(parent.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(parent.getCustomEndpointAddress()).to(properties::setCustomEndpointAddress);

        propertyMapper.from(child.getDomainName()).to(properties::setDomainName);
        propertyMapper.from(child.getNamespace()).to(properties::setNamespace);
        propertyMapper.from(child.getEventHubName()).to(properties::setEventHubName);
        propertyMapper.from(child.getConnectionString()).to(properties::setConnectionString);
        propertyMapper.from(child.getCustomEndpointAddress()).to(properties::setCustomEndpointAddress);

        return properties;

    }
}
