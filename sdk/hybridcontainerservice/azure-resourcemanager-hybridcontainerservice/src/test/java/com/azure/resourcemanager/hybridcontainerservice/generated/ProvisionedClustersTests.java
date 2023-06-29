// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.hybridcontainerservice.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.hybridcontainerservice.models.AadProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.AddonProfiles;
import com.azure.resourcemanager.hybridcontainerservice.models.CloudProviderProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.ControlPlaneProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.HttpProxyConfig;
import com.azure.resourcemanager.hybridcontainerservice.models.LicenseType;
import com.azure.resourcemanager.hybridcontainerservice.models.LinuxProfileProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.LoadBalancerSku;
import com.azure.resourcemanager.hybridcontainerservice.models.Mode;
import com.azure.resourcemanager.hybridcontainerservice.models.NamedAgentPoolProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkPolicy;
import com.azure.resourcemanager.hybridcontainerservice.models.NetworkProfile;
import com.azure.resourcemanager.hybridcontainerservice.models.OsType;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusterIdentity;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClusters;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersAllProperties;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersCommonPropertiesFeatures;
import com.azure.resourcemanager.hybridcontainerservice.models.ProvisionedClustersExtendedLocation;
import com.azure.resourcemanager.hybridcontainerservice.models.ResourceIdentityType;
import com.azure.resourcemanager.hybridcontainerservice.models.WindowsProfile;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class ProvisionedClustersTests {
    @Test
    public void testDeserialize() {
        ProvisionedClusters model =
            BinaryData
                .fromString(
                    "{\"identity\":{\"principalId\":\"kuofqweykhme\",\"tenantId\":\"vfyexfw\",\"type\":\"SystemAssigned\"},\"properties\":{\"enableRbac\":false,\"linuxProfile\":{\"adminUsername\":\"fakeUsernamePlaceholder\"},\"features\":{},\"addonProfiles\":{\"qsc\":{\"config\":{},\"enabled\":true}},\"controlPlane\":{\"name\":\"hezrkgq\",\"count\":1290040732,\"availabilityZones\":[\"fovgmkqsleyyvxy\",\"jpkcattpng\"],\"maxCount\":1035421848,\"maxPods\":183805680,\"minCount\":957799467,\"mode\":\"LB\",\"nodeLabels\":{\"q\":\"vmdajvnysou\",\"yhltrpmopjmcm\":\"canoaeupf\",\"thfuiuaodsfcpkvx\":\"tuo\",\"dagfuaxbezyiuok\":\"dpuozmyz\"},\"nodeTaints\":[\"hrdxwzywqsmbs\",\"reximoryocfs\",\"ksymd\",\"ys\"],\"osType\":\"Linux\",\"nodeImageVersion\":\"uxh\",\"vmSize\":\"udxorrqn\"},\"kubernetesVersion\":\"czvyifq\",\"networkProfile\":{\"loadBalancerSku\":\"stacked-metallb\",\"dnsServiceIP\":\"sllr\",\"networkPolicy\":\"flannel\",\"podCidr\":\"f\",\"podCidrs\":[\"kpnpulexxbczwtr\"],\"serviceCidr\":\"iqzbq\",\"serviceCidrs\":[\"ovm\",\"okacspk\",\"lhzdobp\",\"jmflbvvnch\"]},\"nodeResourceGroup\":\"cciw\",\"agentPoolProfiles\":[{\"name\":\"qkhr\",\"count\":1877680716,\"availabilityZones\":[],\"maxCount\":288403017,\"maxPods\":1916962672,\"minCount\":972559338,\"mode\":\"LB\",\"nodeLabels\":{},\"nodeTaints\":[],\"osType\":\"Linux\",\"nodeImageVersion\":\"uimjmvx\",\"vmSize\":\"duugidyjr\"}],\"cloudProviderProfile\":{},\"provisioningState\":\"Created\",\"status\":{\"addonStatus\":{},\"errorMessage\":\"onpc\"},\"aadProfile\":{\"adminGroupObjectIDs\":[\"hslkevleggzf\",\"u\",\"fmvfaxkffeiit\"],\"clientAppID\":\"vmezy\",\"enableAzureRbac\":true,\"managed\":false,\"serverAppID\":\"sbbzo\",\"tenantID\":\"igrxwburvjxxjn\",\"serverAppSecret\":\"fakeSecretPlaceholder\"},\"windowsProfile\":{\"adminPassword\":\"fakePasswordPlaceholder\",\"adminUsername\":\"fakeUsernamePlaceholder\",\"enableCsiProxy\":true,\"licenseType\":\"None\"},\"httpProxyConfig\":{\"password\":\"fakePasswordPlaceholder\",\"httpProxy\":\"qzntypm\",\"httpsProxy\":\"p\",\"noProxy\":[\"drqjsdpy\"],\"trustedCa\":\"fyhxde\",\"username\":\"fakeUsernamePlaceholder\"}},\"extendedLocation\":{\"type\":\"bishcbkhajdeyea\",\"name\":\"p\"},\"location\":\"agalpbuxwgipwhon\",\"tags\":{\"injep\":\"gshwankixz\",\"iyqzrnk\":\"ttmrywnuzoqf\"},\"id\":\"qvyxlwhzlsicoho\",\"name\":\"qnwvlrya\",\"type\":\"w\"}")
                .toObject(ProvisionedClusters.class);
        Assertions.assertEquals("agalpbuxwgipwhon", model.location());
        Assertions.assertEquals("gshwankixz", model.tags().get("injep"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("fakeSecretPlaceholder", model.properties().aadProfile().serverAppSecret());
        Assertions.assertEquals("hslkevleggzf", model.properties().aadProfile().adminGroupObjectIDs().get(0));
        Assertions.assertEquals("vmezy", model.properties().aadProfile().clientAppId());
        Assertions.assertEquals(true, model.properties().aadProfile().enableAzureRbac());
        Assertions.assertEquals(false, model.properties().aadProfile().managed());
        Assertions.assertEquals("sbbzo", model.properties().aadProfile().serverAppId());
        Assertions.assertEquals("igrxwburvjxxjn", model.properties().aadProfile().tenantId());
        Assertions.assertEquals("fakeUsernamePlaceholder", model.properties().windowsProfile().adminUsername());
        Assertions.assertEquals(true, model.properties().windowsProfile().enableCsiProxy());
        Assertions.assertEquals(LicenseType.NONE, model.properties().windowsProfile().licenseType());
        Assertions.assertEquals("fakePasswordPlaceholder", model.properties().windowsProfile().adminPassword());
        Assertions.assertEquals("qzntypm", model.properties().httpProxyConfig().httpProxy());
        Assertions.assertEquals("p", model.properties().httpProxyConfig().httpsProxy());
        Assertions.assertEquals("drqjsdpy", model.properties().httpProxyConfig().noProxy().get(0));
        Assertions.assertEquals("fyhxde", model.properties().httpProxyConfig().trustedCa());
        Assertions.assertEquals("fakeUsernamePlaceholder", model.properties().httpProxyConfig().username());
        Assertions.assertEquals("fakePasswordPlaceholder", model.properties().httpProxyConfig().password());
        Assertions.assertEquals(false, model.properties().enableRbac());
        Assertions.assertEquals("fakeUsernamePlaceholder", model.properties().linuxProfile().adminUsername());
        Assertions.assertEquals(true, model.properties().addonProfiles().get("qsc").enabled());
        Assertions.assertEquals(1290040732, model.properties().controlPlane().count());
        Assertions.assertEquals("fovgmkqsleyyvxy", model.properties().controlPlane().availabilityZones().get(0));
        Assertions.assertEquals(1035421848, model.properties().controlPlane().maxCount());
        Assertions.assertEquals(183805680, model.properties().controlPlane().maxPods());
        Assertions.assertEquals(957799467, model.properties().controlPlane().minCount());
        Assertions.assertEquals(Mode.LB, model.properties().controlPlane().mode());
        Assertions.assertEquals("vmdajvnysou", model.properties().controlPlane().nodeLabels().get("q"));
        Assertions.assertEquals("hrdxwzywqsmbs", model.properties().controlPlane().nodeTaints().get(0));
        Assertions.assertEquals(OsType.LINUX, model.properties().controlPlane().osType());
        Assertions.assertEquals("uxh", model.properties().controlPlane().nodeImageVersion());
        Assertions.assertEquals("udxorrqn", model.properties().controlPlane().vmSize());
        Assertions.assertEquals("hezrkgq", model.properties().controlPlane().name());
        Assertions.assertEquals("czvyifq", model.properties().kubernetesVersion());
        Assertions.assertEquals(LoadBalancerSku.STACKED_METALLB, model.properties().networkProfile().loadBalancerSku());
        Assertions.assertEquals("sllr", model.properties().networkProfile().dnsServiceIp());
        Assertions.assertEquals(NetworkPolicy.FLANNEL, model.properties().networkProfile().networkPolicy());
        Assertions.assertEquals("f", model.properties().networkProfile().podCidr());
        Assertions.assertEquals("kpnpulexxbczwtr", model.properties().networkProfile().podCidrs().get(0));
        Assertions.assertEquals("iqzbq", model.properties().networkProfile().serviceCidr());
        Assertions.assertEquals("ovm", model.properties().networkProfile().serviceCidrs().get(0));
        Assertions.assertEquals("cciw", model.properties().nodeResourceGroup());
        Assertions.assertEquals(1877680716, model.properties().agentPoolProfiles().get(0).count());
        Assertions.assertEquals(288403017, model.properties().agentPoolProfiles().get(0).maxCount());
        Assertions.assertEquals(1916962672, model.properties().agentPoolProfiles().get(0).maxPods());
        Assertions.assertEquals(972559338, model.properties().agentPoolProfiles().get(0).minCount());
        Assertions.assertEquals(Mode.LB, model.properties().agentPoolProfiles().get(0).mode());
        Assertions.assertEquals(OsType.LINUX, model.properties().agentPoolProfiles().get(0).osType());
        Assertions.assertEquals("uimjmvx", model.properties().agentPoolProfiles().get(0).nodeImageVersion());
        Assertions.assertEquals("duugidyjr", model.properties().agentPoolProfiles().get(0).vmSize());
        Assertions.assertEquals("qkhr", model.properties().agentPoolProfiles().get(0).name());
        Assertions.assertEquals("bishcbkhajdeyea", model.extendedLocation().type());
        Assertions.assertEquals("p", model.extendedLocation().name());
    }

    @Test
    public void testSerialize() {
        ProvisionedClusters model =
            new ProvisionedClusters()
                .withLocation("agalpbuxwgipwhon")
                .withTags(mapOf("injep", "gshwankixz", "iyqzrnk", "ttmrywnuzoqf"))
                .withIdentity(new ProvisionedClusterIdentity().withType(ResourceIdentityType.SYSTEM_ASSIGNED))
                .withProperties(
                    new ProvisionedClustersAllProperties()
                        .withAadProfile(
                            new AadProfile()
                                .withServerAppSecret("fakeSecretPlaceholder")
                                .withAdminGroupObjectIDs(Arrays.asList("hslkevleggzf", "u", "fmvfaxkffeiit"))
                                .withClientAppId("vmezy")
                                .withEnableAzureRbac(true)
                                .withManaged(false)
                                .withServerAppId("sbbzo")
                                .withTenantId("igrxwburvjxxjn"))
                        .withWindowsProfile(
                            new WindowsProfile()
                                .withAdminUsername("fakeUsernamePlaceholder")
                                .withEnableCsiProxy(true)
                                .withLicenseType(LicenseType.NONE)
                                .withAdminPassword("fakePasswordPlaceholder"))
                        .withHttpProxyConfig(
                            new HttpProxyConfig()
                                .withHttpProxy("qzntypm")
                                .withHttpsProxy("p")
                                .withNoProxy(Arrays.asList("drqjsdpy"))
                                .withTrustedCa("fyhxde")
                                .withUsername("fakeUsernamePlaceholder")
                                .withPassword("fakePasswordPlaceholder"))
                        .withEnableRbac(false)
                        .withLinuxProfile(new LinuxProfileProperties().withAdminUsername("fakeUsernamePlaceholder"))
                        .withFeatures(new ProvisionedClustersCommonPropertiesFeatures())
                        .withAddonProfiles(mapOf("qsc", new AddonProfiles().withConfig(mapOf()).withEnabled(true)))
                        .withControlPlane(
                            new ControlPlaneProfile()
                                .withCount(1290040732)
                                .withAvailabilityZones(Arrays.asList("fovgmkqsleyyvxy", "jpkcattpng"))
                                .withMaxCount(1035421848)
                                .withMaxPods(183805680)
                                .withMinCount(957799467)
                                .withMode(Mode.LB)
                                .withNodeLabels(
                                    mapOf(
                                        "q",
                                        "vmdajvnysou",
                                        "yhltrpmopjmcm",
                                        "canoaeupf",
                                        "thfuiuaodsfcpkvx",
                                        "tuo",
                                        "dagfuaxbezyiuok",
                                        "dpuozmyz"))
                                .withNodeTaints(Arrays.asList("hrdxwzywqsmbs", "reximoryocfs", "ksymd", "ys"))
                                .withOsType(OsType.LINUX)
                                .withNodeImageVersion("uxh")
                                .withVmSize("udxorrqn")
                                .withName("hezrkgq"))
                        .withKubernetesVersion("czvyifq")
                        .withNetworkProfile(
                            new NetworkProfile()
                                .withLoadBalancerSku(LoadBalancerSku.STACKED_METALLB)
                                .withDnsServiceIp("sllr")
                                .withNetworkPolicy(NetworkPolicy.FLANNEL)
                                .withPodCidr("f")
                                .withPodCidrs(Arrays.asList("kpnpulexxbczwtr"))
                                .withServiceCidr("iqzbq")
                                .withServiceCidrs(Arrays.asList("ovm", "okacspk", "lhzdobp", "jmflbvvnch")))
                        .withNodeResourceGroup("cciw")
                        .withAgentPoolProfiles(
                            Arrays
                                .asList(
                                    new NamedAgentPoolProfile()
                                        .withCount(1877680716)
                                        .withAvailabilityZones(Arrays.asList())
                                        .withMaxCount(288403017)
                                        .withMaxPods(1916962672)
                                        .withMinCount(972559338)
                                        .withMode(Mode.LB)
                                        .withNodeLabels(mapOf())
                                        .withNodeTaints(Arrays.asList())
                                        .withOsType(OsType.LINUX)
                                        .withNodeImageVersion("uimjmvx")
                                        .withVmSize("duugidyjr")
                                        .withName("qkhr")))
                        .withCloudProviderProfile(new CloudProviderProfile()))
                .withExtendedLocation(
                    new ProvisionedClustersExtendedLocation().withType("bishcbkhajdeyea").withName("p"));
        model = BinaryData.fromObject(model).toObject(ProvisionedClusters.class);
        Assertions.assertEquals("agalpbuxwgipwhon", model.location());
        Assertions.assertEquals("gshwankixz", model.tags().get("injep"));
        Assertions.assertEquals(ResourceIdentityType.SYSTEM_ASSIGNED, model.identity().type());
        Assertions.assertEquals("fakeSecretPlaceholder", model.properties().aadProfile().serverAppSecret());
        Assertions.assertEquals("hslkevleggzf", model.properties().aadProfile().adminGroupObjectIDs().get(0));
        Assertions.assertEquals("vmezy", model.properties().aadProfile().clientAppId());
        Assertions.assertEquals(true, model.properties().aadProfile().enableAzureRbac());
        Assertions.assertEquals(false, model.properties().aadProfile().managed());
        Assertions.assertEquals("sbbzo", model.properties().aadProfile().serverAppId());
        Assertions.assertEquals("igrxwburvjxxjn", model.properties().aadProfile().tenantId());
        Assertions.assertEquals("fakeUsernamePlaceholder", model.properties().windowsProfile().adminUsername());
        Assertions.assertEquals(true, model.properties().windowsProfile().enableCsiProxy());
        Assertions.assertEquals(LicenseType.NONE, model.properties().windowsProfile().licenseType());
        Assertions.assertEquals("fakePasswordPlaceholder", model.properties().windowsProfile().adminPassword());
        Assertions.assertEquals("qzntypm", model.properties().httpProxyConfig().httpProxy());
        Assertions.assertEquals("p", model.properties().httpProxyConfig().httpsProxy());
        Assertions.assertEquals("drqjsdpy", model.properties().httpProxyConfig().noProxy().get(0));
        Assertions.assertEquals("fyhxde", model.properties().httpProxyConfig().trustedCa());
        Assertions.assertEquals("fakeUsernamePlaceholder", model.properties().httpProxyConfig().username());
        Assertions.assertEquals("fakePasswordPlaceholder", model.properties().httpProxyConfig().password());
        Assertions.assertEquals(false, model.properties().enableRbac());
        Assertions.assertEquals("fakeUsernamePlaceholder", model.properties().linuxProfile().adminUsername());
        Assertions.assertEquals(true, model.properties().addonProfiles().get("qsc").enabled());
        Assertions.assertEquals(1290040732, model.properties().controlPlane().count());
        Assertions.assertEquals("fovgmkqsleyyvxy", model.properties().controlPlane().availabilityZones().get(0));
        Assertions.assertEquals(1035421848, model.properties().controlPlane().maxCount());
        Assertions.assertEquals(183805680, model.properties().controlPlane().maxPods());
        Assertions.assertEquals(957799467, model.properties().controlPlane().minCount());
        Assertions.assertEquals(Mode.LB, model.properties().controlPlane().mode());
        Assertions.assertEquals("vmdajvnysou", model.properties().controlPlane().nodeLabels().get("q"));
        Assertions.assertEquals("hrdxwzywqsmbs", model.properties().controlPlane().nodeTaints().get(0));
        Assertions.assertEquals(OsType.LINUX, model.properties().controlPlane().osType());
        Assertions.assertEquals("uxh", model.properties().controlPlane().nodeImageVersion());
        Assertions.assertEquals("udxorrqn", model.properties().controlPlane().vmSize());
        Assertions.assertEquals("hezrkgq", model.properties().controlPlane().name());
        Assertions.assertEquals("czvyifq", model.properties().kubernetesVersion());
        Assertions.assertEquals(LoadBalancerSku.STACKED_METALLB, model.properties().networkProfile().loadBalancerSku());
        Assertions.assertEquals("sllr", model.properties().networkProfile().dnsServiceIp());
        Assertions.assertEquals(NetworkPolicy.FLANNEL, model.properties().networkProfile().networkPolicy());
        Assertions.assertEquals("f", model.properties().networkProfile().podCidr());
        Assertions.assertEquals("kpnpulexxbczwtr", model.properties().networkProfile().podCidrs().get(0));
        Assertions.assertEquals("iqzbq", model.properties().networkProfile().serviceCidr());
        Assertions.assertEquals("ovm", model.properties().networkProfile().serviceCidrs().get(0));
        Assertions.assertEquals("cciw", model.properties().nodeResourceGroup());
        Assertions.assertEquals(1877680716, model.properties().agentPoolProfiles().get(0).count());
        Assertions.assertEquals(288403017, model.properties().agentPoolProfiles().get(0).maxCount());
        Assertions.assertEquals(1916962672, model.properties().agentPoolProfiles().get(0).maxPods());
        Assertions.assertEquals(972559338, model.properties().agentPoolProfiles().get(0).minCount());
        Assertions.assertEquals(Mode.LB, model.properties().agentPoolProfiles().get(0).mode());
        Assertions.assertEquals(OsType.LINUX, model.properties().agentPoolProfiles().get(0).osType());
        Assertions.assertEquals("uimjmvx", model.properties().agentPoolProfiles().get(0).nodeImageVersion());
        Assertions.assertEquals("duugidyjr", model.properties().agentPoolProfiles().get(0).vmSize());
        Assertions.assertEquals("qkhr", model.properties().agentPoolProfiles().get(0).name());
        Assertions.assertEquals("bishcbkhajdeyea", model.extendedLocation().type());
        Assertions.assertEquals("p", model.extendedLocation().name());
    }

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