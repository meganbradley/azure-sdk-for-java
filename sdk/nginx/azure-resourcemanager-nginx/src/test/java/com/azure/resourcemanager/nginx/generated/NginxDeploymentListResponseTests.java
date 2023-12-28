// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.nginx.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.nginx.fluent.models.NginxDeploymentInner;
import com.azure.resourcemanager.nginx.models.IdentityProperties;
import com.azure.resourcemanager.nginx.models.IdentityType;
import com.azure.resourcemanager.nginx.models.NginxDeploymentListResponse;
import com.azure.resourcemanager.nginx.models.NginxDeploymentProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentScalingProperties;
import com.azure.resourcemanager.nginx.models.NginxDeploymentUserProfile;
import com.azure.resourcemanager.nginx.models.NginxFrontendIpConfiguration;
import com.azure.resourcemanager.nginx.models.NginxLogging;
import com.azure.resourcemanager.nginx.models.NginxNetworkInterfaceConfiguration;
import com.azure.resourcemanager.nginx.models.NginxNetworkProfile;
import com.azure.resourcemanager.nginx.models.NginxPrivateIpAddress;
import com.azure.resourcemanager.nginx.models.NginxPublicIpAddress;
import com.azure.resourcemanager.nginx.models.NginxStorageAccount;
import com.azure.resourcemanager.nginx.models.ResourceSku;
import com.azure.resourcemanager.nginx.models.UserIdentityProperties;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class NginxDeploymentListResponseTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        NginxDeploymentListResponse model = BinaryData.fromString(
            "{\"value\":[{\"identity\":{\"principalId\":\"cgygev\",\"tenantId\":\"ntypmrbpizcdrqj\",\"type\":\"SystemAssigned\",\"userAssignedIdentities\":{\"gzfbishcbk\":{\"principalId\":\"fyhxde\",\"clientId\":\"jzicwifsjt\"},\"shwankixzbinje\":{\"principalId\":\"jdeyeamdpha\",\"clientId\":\"lpbuxwgipwhonowk\"},\"zlsico\":{\"principalId\":\"ttmrywnuzoqf\",\"clientId\":\"yqzrnkcqvyxlw\"},\"hheunmmqhgyx\":{\"principalId\":\"qqn\",\"clientId\":\"lryav\"}}},\"properties\":{\"provisioningState\":\"Creating\",\"nginxVersion\":\"cukoklyaxuconu\",\"managedResourceGroup\":\"zf\",\"networkProfile\":{\"frontEndIPConfiguration\":{\"publicIPAddresses\":[{}],\"privateIPAddresses\":[{},{},{},{}]},\"networkInterfaceConfiguration\":{\"subnetId\":\"jmwvvj\"}},\"ipAddress\":\"tcxsenhwlrs\",\"enableDiagnosticsSupport\":true,\"logging\":{\"storageAccount\":{\"accountName\":\"v\",\"containerName\":\"dqgbiqylihkaetc\"}},\"scalingProperties\":{\"capacity\":385263599},\"userProfile\":{\"preferredEmail\":\"vf\"}},\"sku\":{\"name\":\"kymuctqhjfbebr\"},\"location\":\"xerf\",\"tags\":{\"rp\":\"tttxfvjrb\",\"jky\":\"xepcyvahfn\",\"ljyoxgvcltb\":\"xjvuujqgidokg\",\"bijhtxfvgxbf\":\"sncghkjeszz\"},\"id\":\"mxnehmp\",\"name\":\"ec\",\"type\":\"godebfqkkrbmpu\"}],\"nextLink\":\"riwflzlfb\"}")
            .toObject(NginxDeploymentListResponse.class);
        Assertions.assertEquals("xerf", model.value().get(0).location());
        Assertions.assertEquals("tttxfvjrb", model.value().get(0).tags().get("rp"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("zf", model.value().get(0).properties().managedResourceGroup());
        Assertions.assertEquals("jmwvvj",
            model.value().get(0).properties().networkProfile().networkInterfaceConfiguration().subnetId());
        Assertions.assertEquals(true, model.value().get(0).properties().enableDiagnosticsSupport());
        Assertions.assertEquals("v", model.value().get(0).properties().logging().storageAccount().accountName());
        Assertions.assertEquals("dqgbiqylihkaetc",
            model.value().get(0).properties().logging().storageAccount().containerName());
        Assertions.assertEquals(385263599, model.value().get(0).properties().scalingProperties().capacity());
        Assertions.assertEquals("vf", model.value().get(0).properties().userProfile().preferredEmail());
        Assertions.assertEquals("kymuctqhjfbebr", model.value().get(0).sku().name());
        Assertions.assertEquals("riwflzlfb", model.nextLink());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        NginxDeploymentListResponse model
            = new NginxDeploymentListResponse().withValue(Arrays.asList(new NginxDeploymentInner().withLocation("xerf")
                .withTags(mapOf("rp", "tttxfvjrb", "jky", "xepcyvahfn", "ljyoxgvcltb", "xjvuujqgidokg", "bijhtxfvgxbf",
                    "sncghkjeszz"))
                .withIdentity(new IdentityProperties().withType(IdentityType.SYSTEM_ASSIGNED)
                    .withUserAssignedIdentities(mapOf("gzfbishcbk", new UserIdentityProperties(), "shwankixzbinje",
                        new UserIdentityProperties(), "zlsico", new UserIdentityProperties(), "hheunmmqhgyx",
                        new UserIdentityProperties())))
                .withProperties(new NginxDeploymentProperties().withManagedResourceGroup("zf")
                    .withNetworkProfile(new NginxNetworkProfile()
                        .withFrontEndIpConfiguration(new NginxFrontendIpConfiguration()
                            .withPublicIpAddresses(Arrays.asList(new NginxPublicIpAddress()))
                            .withPrivateIpAddresses(Arrays.asList(new NginxPrivateIpAddress(),
                                new NginxPrivateIpAddress(), new NginxPrivateIpAddress(), new NginxPrivateIpAddress())))
                        .withNetworkInterfaceConfiguration(
                            new NginxNetworkInterfaceConfiguration().withSubnetId("jmwvvj")))
                    .withEnableDiagnosticsSupport(true)
                    .withLogging(new NginxLogging().withStorageAccount(
                        new NginxStorageAccount().withAccountName("v").withContainerName("dqgbiqylihkaetc")))
                    .withScalingProperties(new NginxDeploymentScalingProperties().withCapacity(385263599))
                    .withUserProfile(new NginxDeploymentUserProfile().withPreferredEmail("vf")))
                .withSku(new ResourceSku().withName("kymuctqhjfbebr")))).withNextLink("riwflzlfb");
        model = BinaryData.fromObject(model).toObject(NginxDeploymentListResponse.class);
        Assertions.assertEquals("xerf", model.value().get(0).location());
        Assertions.assertEquals("tttxfvjrb", model.value().get(0).tags().get("rp"));
        Assertions.assertEquals(IdentityType.SYSTEM_ASSIGNED, model.value().get(0).identity().type());
        Assertions.assertEquals("zf", model.value().get(0).properties().managedResourceGroup());
        Assertions.assertEquals("jmwvvj",
            model.value().get(0).properties().networkProfile().networkInterfaceConfiguration().subnetId());
        Assertions.assertEquals(true, model.value().get(0).properties().enableDiagnosticsSupport());
        Assertions.assertEquals("v", model.value().get(0).properties().logging().storageAccount().accountName());
        Assertions.assertEquals("dqgbiqylihkaetc",
            model.value().get(0).properties().logging().storageAccount().containerName());
        Assertions.assertEquals(385263599, model.value().get(0).properties().scalingProperties().capacity());
        Assertions.assertEquals("vf", model.value().get(0).properties().userProfile().preferredEmail());
        Assertions.assertEquals("kymuctqhjfbebr", model.value().get(0).sku().name());
        Assertions.assertEquals("riwflzlfb", model.nextLink());
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
