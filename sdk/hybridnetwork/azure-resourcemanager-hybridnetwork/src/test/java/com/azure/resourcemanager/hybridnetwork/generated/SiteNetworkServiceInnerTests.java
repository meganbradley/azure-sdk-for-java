// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridnetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridnetwork.fluent.models.SiteNetworkServiceInner;
import com.azure.resourcemanager.hybridnetwork.models.DeploymentResourceIdReference;
import com.azure.resourcemanager.hybridnetwork.models.ManagedResourceGroupConfiguration;
import com.azure.resourcemanager.hybridnetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.hybridnetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.hybridnetwork.models.ReferencedResource;
import com.azure.resourcemanager.hybridnetwork.models.SiteNetworkServicePropertiesFormat;
import com.azure.resourcemanager.hybridnetwork.models.Sku;
import com.azure.resourcemanager.hybridnetwork.models.SkuName;
import com.azure.resourcemanager.hybridnetwork.models.UserAssignedIdentity;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class SiteNetworkServiceInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SiteNetworkServiceInner model = BinaryData.fromString(
            "{\"properties\":{\"provisioningState\":\"Accepted\",\"managedResourceGroupConfiguration\":{\"name\":\"itmmqtgqqqxh\",\"location\":\"xrxc\"},\"siteReference\":{\"id\":\"isavok\"},\"publisherName\":\"zfvazi\",\"publisherScope\":\"Unknown\",\"networkServiceDesignGroupName\":\"rqttbajlkatnw\",\"networkServiceDesignVersionName\":\"iopid\",\"networkServiceDesignVersionOfferingLocation\":\"qfkuvscxkdmli\",\"networkServiceDesignVersionResourceReference\":{\"idType\":\"DeploymentResourceIdReference\"},\"desiredStateConfigurationGroupValueReferences\":{\"goorbteo\":{\"id\":\"rxkpmloazuruoc\"},\"ordilmywwtkgkxny\":{\"id\":\"fhjxakvvjgs\"}},\"lastStateNetworkServiceDesignVersionName\":\"abgyvudt\",\"lastStateConfigurationGroupValueReferences\":{\"yxccyb\":{\"id\":\"bcihxuuwhc\"},\"wjplma\":{\"id\":\"ayakkudzpx\"},\"bdgiogsjk\":{\"id\":\"tcyohpfkyrk\"}}},\"identity\":{\"principalId\":\"0ef23d79-a18b-4ab6-9e91-f3289d67243f\",\"tenantId\":\"84977a96-36f1-44fe-9fda-e87fe940fcbc\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"iyhddvi\":{\"principalId\":\"6d75fd1a-019f-4c07-922f-d88195151ac7\",\"clientId\":\"98a29d2b-210d-4948-a5db-910aff7ef5b6\"},\"gfnmntfpmvmemfnc\":{\"principalId\":\"ddc3ba53-fbbc-47d4-8617-1629973715af\",\"clientId\":\"c1a9b370-f8b4-4410-9ba4-4440ef787621\"},\"vvbalx\":{\"principalId\":\"83a8febe-624b-4f01-9d15-089c44ab8a1b\",\"clientId\":\"6a6baaf7-f844-45db-b273-4e299909b44d\"},\"chp\":{\"principalId\":\"f949dfff-7f71-4727-b82c-eba928b1e926\",\"clientId\":\"bdc7a8b8-7ceb-4cba-87c8-5d26411f2d55\"}}},\"sku\":{\"name\":\"Basic\",\"tier\":\"Standard\"},\"location\":\"wrd\",\"tags\":{\"jcswsmys\":\"ukuv\",\"lerchpq\":\"uluqypfc\",\"dfc\":\"mfpjbabw\",\"qddrihpfhoqcaae\":\"sspuunnoxyhkx\"},\"id\":\"dao\",\"name\":\"djvlpj\",\"type\":\"xkzb\"}")
            .toObject(SiteNetworkServiceInner.class);
        Assertions.assertEquals("wrd", model.location());
        Assertions.assertEquals("ukuv", model.tags().get("jcswsmys"));
        Assertions.assertEquals("itmmqtgqqqxh", model.properties().managedResourceGroupConfiguration().name());
        Assertions.assertEquals("xrxc", model.properties().managedResourceGroupConfiguration().location());
        Assertions.assertEquals("isavok", model.properties().siteReference().id());
        Assertions.assertEquals("rxkpmloazuruoc",
            model.properties().desiredStateConfigurationGroupValueReferences().get("goorbteo").id());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals(SkuName.BASIC, model.sku().name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SiteNetworkServiceInner model = new SiteNetworkServiceInner().withLocation("wrd")
            .withTags(
                mapOf("jcswsmys", "ukuv", "lerchpq", "uluqypfc", "dfc", "mfpjbabw", "qddrihpfhoqcaae", "sspuunnoxyhkx"))
            .withProperties(new SiteNetworkServicePropertiesFormat()
                .withManagedResourceGroupConfiguration(
                    new ManagedResourceGroupConfiguration().withName("itmmqtgqqqxh").withLocation("xrxc"))
                .withSiteReference(new ReferencedResource().withId("isavok"))
                .withNetworkServiceDesignVersionResourceReference(new DeploymentResourceIdReference())
                .withDesiredStateConfigurationGroupValueReferences(
                    mapOf("goorbteo", new ReferencedResource().withId("rxkpmloazuruoc"), "ordilmywwtkgkxny",
                        new ReferencedResource().withId("fhjxakvvjgs"))))
            .withIdentity(new ManagedServiceIdentity().withType(ManagedServiceIdentityType.SYSTEM_ASSIGNED)
                .withUserAssignedIdentities(
                    mapOf("iyhddvi", new UserAssignedIdentity(), "gfnmntfpmvmemfnc", new UserAssignedIdentity(),
                        "vvbalx", new UserAssignedIdentity(), "chp", new UserAssignedIdentity())))
            .withSku(new Sku().withName(SkuName.BASIC));
        model = BinaryData.fromObject(model).toObject(SiteNetworkServiceInner.class);
        Assertions.assertEquals("wrd", model.location());
        Assertions.assertEquals("ukuv", model.tags().get("jcswsmys"));
        Assertions.assertEquals("itmmqtgqqqxh", model.properties().managedResourceGroupConfiguration().name());
        Assertions.assertEquals("xrxc", model.properties().managedResourceGroupConfiguration().location());
        Assertions.assertEquals("isavok", model.properties().siteReference().id());
        Assertions.assertEquals("rxkpmloazuruoc",
            model.properties().desiredStateConfigurationGroupValueReferences().get("goorbteo").id());
        Assertions.assertEquals(ManagedServiceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals(SkuName.BASIC, model.sku().name());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
