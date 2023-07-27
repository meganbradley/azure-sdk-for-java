// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mobilenetwork.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.mobilenetwork.fluent.models.PacketCoreControlPlaneInner;
import com.azure.resourcemanager.mobilenetwork.models.AuthenticationType;
import com.azure.resourcemanager.mobilenetwork.models.AzureStackEdgeDeviceResourceId;
import com.azure.resourcemanager.mobilenetwork.models.AzureStackHciClusterResourceId;
import com.azure.resourcemanager.mobilenetwork.models.BillingSku;
import com.azure.resourcemanager.mobilenetwork.models.ConnectedClusterResourceId;
import com.azure.resourcemanager.mobilenetwork.models.CoreNetworkType;
import com.azure.resourcemanager.mobilenetwork.models.CustomLocationResourceId;
import com.azure.resourcemanager.mobilenetwork.models.DesiredInstallationState;
import com.azure.resourcemanager.mobilenetwork.models.DiagnosticsUploadConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.HttpsServerCertificate;
import com.azure.resourcemanager.mobilenetwork.models.Installation;
import com.azure.resourcemanager.mobilenetwork.models.InterfaceProperties;
import com.azure.resourcemanager.mobilenetwork.models.LocalDiagnosticsAccessConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentity;
import com.azure.resourcemanager.mobilenetwork.models.ManagedServiceIdentityType;
import com.azure.resourcemanager.mobilenetwork.models.PacketCoreControlPlaneListResult;
import com.azure.resourcemanager.mobilenetwork.models.PlatformConfiguration;
import com.azure.resourcemanager.mobilenetwork.models.PlatformType;
import com.azure.resourcemanager.mobilenetwork.models.SiteResourceId;
import com.azure.resourcemanager.mobilenetwork.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class PacketCoreControlPlaneListResultTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PacketCoreControlPlaneListResult model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"provisioningState\":\"Accepted\",\"installation\":{\"desiredState\":\"Uninstalled\",\"state\":\"Upgrading\",\"reinstallRequired\":\"Required\",\"reasons\":[\"NoSlices\"],\"operation\":{\"id\":\"spkdee\"}},\"sites\":[{\"id\":\"ofmxagkvtmelmqkr\"},{\"id\":\"ahvljuaha\"},{\"id\":\"uhcdhm\"}],\"platform\":{\"type\":\"3P-AZURE-STACK-HCI\",\"azureStackEdgeDevice\":{\"id\":\"laexqp\"},\"azureStackEdgeDevices\":[{\"id\":\"dmwsrcrgvxpvgomz\"}],\"azureStackHciCluster\":{\"id\":\"misgwbnb\"},\"connectedCluster\":{\"id\":\"ldawkzbaliourqha\"},\"customLocation\":{\"id\":\"uhashsfwx\"}},\"coreNetworkTechnology\":\"EPC"
                        + " + 5GC\",\"version\":\"z\",\"installedVersion\":\"ugicjooxdjebw\",\"rollbackVersion\":\"cwwfvovbvme\",\"controlPlaneAccessInterface\":{\"name\":\"civyhzceuo\",\"ipv4Address\":\"jrwjueiotwm\",\"ipv4Subnet\":\"ytdxwit\",\"ipv4Gateway\":\"rjaw\"},\"sku\":\"G5\",\"ueMtu\":1621003688,\"localDiagnosticsAccess\":{\"authenticationType\":\"Password\",\"httpsServerCertificate\":{\"certificateUrl\":\"ni\",\"provisioning\":{}}},\"diagnosticsUpload\":{\"storageAccountContainerUrl\":\"fbkp\"},\"interopSettings\":\"datagklwn\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"whvylw\":{\"principalId\":\"37574e11-edbf-45a2-a892-710c0baf2080\",\"clientId\":\"278b2c95-6ed2-4735-a35a-46f44176708d\"},\"dhxujznbmpo\":{\"principalId\":\"241ce80a-673b-4d54-8c60-0864fa3aac07\",\"clientId\":\"67c8d0c5-69a7-47c5-8dd5-7aba97c1bae3\"},\"przqlveu\":{\"principalId\":\"cecedd2a-2c19-4712-8154-175f5655fa41\",\"clientId\":\"176c59d0-f4b0-4cb8-b4e1-1f4307dd0584\"},\"pjmkhfxobbc\":{\"principalId\":\"65781622-72fa-4a59-a768-0e7ed019fcb4\",\"clientId\":\"2c9888ec-0f2e-4ed9-a84f-d7d557e9a417\"}}},\"location\":\"s\",\"tags\":{\"fgb\":\"riplrbpbewtg\",\"wxzvlvqhjkb\":\"c\",\"iebwwaloayqcgwrt\":\"gibtnm\",\"zg\":\"j\"},\"id\":\"yzm\",\"name\":\"txon\",\"type\":\"mtsavjcbpwxqp\"},{\"properties\":{\"provisioningState\":\"Succeeded\",\"installation\":{\"desiredState\":\"Installed\",\"state\":\"Updating\",\"reinstallRequired\":\"Required\",\"reasons\":[\"NoAttachedDataNetworks\",\"NoAttachedDataNetworks\",\"NoAttachedDataNetworks\"],\"operation\":{\"id\":\"mdyvxqtayriw\"}},\"sites\":[{\"id\":\"oyq\"}],\"platform\":{\"type\":\"3P-AZURE-STACK-HCI\",\"azureStackEdgeDevice\":{\"id\":\"rmcqiby\"},\"azureStackEdgeDevices\":[{\"id\":\"jvkn\"},{\"id\":\"e\"},{\"id\":\"qsgzvahapj\"},{\"id\":\"zhpvgqzcjrvxd\"}],\"azureStackHciCluster\":{\"id\":\"lmwlxkvugfhzo\"},\"connectedCluster\":{\"id\":\"wjvzunluthnn\"},\"customLocation\":{\"id\":\"nxipeil\"}},\"coreNetworkTechnology\":\"EPC"
                        + " + 5GC\",\"version\":\"aejxd\",\"installedVersion\":\"tskzbbtdzumveek\",\"rollbackVersion\":\"wozuhkf\",\"controlPlaneAccessInterface\":{\"name\":\"sjyofdx\",\"ipv4Address\":\"us\",\"ipv4Subnet\":\"touwaboekqv\",\"ipv4Gateway\":\"lns\"},\"sku\":\"G10\",\"ueMtu\":314739755,\"localDiagnosticsAccess\":{\"authenticationType\":\"Password\",\"httpsServerCertificate\":{\"certificateUrl\":\"jsflhhcaalnjix\",\"provisioning\":{}}},\"diagnosticsUpload\":{\"storageAccountContainerUrl\":\"yaw\"},\"interopSettings\":\"datayaqcslyjpkiidz\"},\"identity\":{\"type\":\"UserAssigned\",\"userAssignedIdentities\":{\"ixhnrztf\":{\"principalId\":\"b80cdd3f-13a9-4729-bd68-a4466dd42615\",\"clientId\":\"1e366abc-7f7e-455a-ae57-d10d19d4200a\"},\"bnxknalaulppg\":{\"principalId\":\"c6d23d6d-58a7-437d-9ecd-26e1fcd13c7f\",\"clientId\":\"4a963bb7-6b20-41bd-80c9-90981b9d48ba\"},\"pnapnyiropuh\":{\"principalId\":\"a36196dd-9218-42a0-8f71-5909121d0e46\",\"clientId\":\"99b38e48-ca81-43ab-bfde-ce358e0696d6\"}}},\"location\":\"gvpgy\",\"tags\":{\"medjvcslynqwwncw\":\"git\",\"pkteo\":\"zhxgktrmgucn\"},\"id\":\"llwptfdy\",\"name\":\"pfqbuaceopzf\",\"type\":\"rhhuaopppcqeqx\"}],\"nextLink\":\"z\"}")
                .toObject(PacketCoreControlPlaneListResult.class);
        Assertions.assertEquals("s", model.value().get(0).location());
        Assertions.assertEquals("riplrbpbewtg", model.value().get(0).tags().get("fgb"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions
            .assertEquals(DesiredInstallationState.UNINSTALLED, model.value().get(0).installation().desiredState());
        Assertions.assertEquals("ofmxagkvtmelmqkr", model.value().get(0).sites().get(0).id());
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, model.value().get(0).platform().type());
        Assertions.assertEquals("laexqp", model.value().get(0).platform().azureStackEdgeDevice().id());
        Assertions.assertEquals("misgwbnb", model.value().get(0).platform().azureStackHciCluster().id());
        Assertions.assertEquals("ldawkzbaliourqha", model.value().get(0).platform().connectedCluster().id());
        Assertions.assertEquals("uhashsfwx", model.value().get(0).platform().customLocation().id());
        Assertions.assertEquals(CoreNetworkType.EPC_5GC, model.value().get(0).coreNetworkTechnology());
        Assertions.assertEquals("z", model.value().get(0).version());
        Assertions.assertEquals("civyhzceuo", model.value().get(0).controlPlaneAccessInterface().name());
        Assertions.assertEquals("jrwjueiotwm", model.value().get(0).controlPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("ytdxwit", model.value().get(0).controlPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("rjaw", model.value().get(0).controlPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(BillingSku.G5, model.value().get(0).sku());
        Assertions.assertEquals(1621003688, model.value().get(0).ueMtu());
        Assertions
            .assertEquals(
                AuthenticationType.PASSWORD, model.value().get(0).localDiagnosticsAccess().authenticationType());
        Assertions
            .assertEquals(
                "ni", model.value().get(0).localDiagnosticsAccess().httpsServerCertificate().certificateUrl());
        Assertions.assertEquals("fbkp", model.value().get(0).diagnosticsUpload().storageAccountContainerUrl());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PacketCoreControlPlaneListResult model =
            new PacketCoreControlPlaneListResult()
                .withValue(
                    Arrays
                        .asList(
                            new PacketCoreControlPlaneInner()
                                .withLocation("s")
                                .withTags(
                                    mapOf(
                                        "fgb",
                                        "riplrbpbewtg",
                                        "wxzvlvqhjkb",
                                        "c",
                                        "iebwwaloayqcgwrt",
                                        "gibtnm",
                                        "zg",
                                        "j"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(
                                            mapOf(
                                                "whvylw",
                                                new UserAssignedIdentity(),
                                                "dhxujznbmpo",
                                                new UserAssignedIdentity(),
                                                "przqlveu",
                                                new UserAssignedIdentity(),
                                                "pjmkhfxobbc",
                                                new UserAssignedIdentity())))
                                .withInstallation(
                                    new Installation().withDesiredState(DesiredInstallationState.UNINSTALLED))
                                .withSites(
                                    Arrays
                                        .asList(
                                            new SiteResourceId().withId("ofmxagkvtmelmqkr"),
                                            new SiteResourceId().withId("ahvljuaha"),
                                            new SiteResourceId().withId("uhcdhm")))
                                .withPlatform(
                                    new PlatformConfiguration()
                                        .withType(PlatformType.THREE_P_AZURE_STACK_HCI)
                                        .withAzureStackEdgeDevice(new AzureStackEdgeDeviceResourceId().withId("laexqp"))
                                        .withAzureStackHciCluster(
                                            new AzureStackHciClusterResourceId().withId("misgwbnb"))
                                        .withConnectedCluster(
                                            new ConnectedClusterResourceId().withId("ldawkzbaliourqha"))
                                        .withCustomLocation(new CustomLocationResourceId().withId("uhashsfwx")))
                                .withCoreNetworkTechnology(CoreNetworkType.EPC_5GC)
                                .withVersion("z")
                                .withControlPlaneAccessInterface(
                                    new InterfaceProperties()
                                        .withName("civyhzceuo")
                                        .withIpv4Address("jrwjueiotwm")
                                        .withIpv4Subnet("ytdxwit")
                                        .withIpv4Gateway("rjaw"))
                                .withSku(BillingSku.G5)
                                .withUeMtu(1621003688)
                                .withLocalDiagnosticsAccess(
                                    new LocalDiagnosticsAccessConfiguration()
                                        .withAuthenticationType(AuthenticationType.PASSWORD)
                                        .withHttpsServerCertificate(
                                            new HttpsServerCertificate().withCertificateUrl("ni")))
                                .withDiagnosticsUpload(
                                    new DiagnosticsUploadConfiguration().withStorageAccountContainerUrl("fbkp"))
                                .withInteropSettings("datagklwn"),
                            new PacketCoreControlPlaneInner()
                                .withLocation("gvpgy")
                                .withTags(mapOf("medjvcslynqwwncw", "git", "pkteo", "zhxgktrmgucn"))
                                .withIdentity(
                                    new ManagedServiceIdentity()
                                        .withType(ManagedServiceIdentityType.USER_ASSIGNED)
                                        .withUserAssignedIdentities(
                                            mapOf(
                                                "ixhnrztf",
                                                new UserAssignedIdentity(),
                                                "bnxknalaulppg",
                                                new UserAssignedIdentity(),
                                                "pnapnyiropuh",
                                                new UserAssignedIdentity())))
                                .withInstallation(
                                    new Installation().withDesiredState(DesiredInstallationState.INSTALLED))
                                .withSites(Arrays.asList(new SiteResourceId().withId("oyq")))
                                .withPlatform(
                                    new PlatformConfiguration()
                                        .withType(PlatformType.THREE_P_AZURE_STACK_HCI)
                                        .withAzureStackEdgeDevice(
                                            new AzureStackEdgeDeviceResourceId().withId("rmcqiby"))
                                        .withAzureStackHciCluster(
                                            new AzureStackHciClusterResourceId().withId("lmwlxkvugfhzo"))
                                        .withConnectedCluster(new ConnectedClusterResourceId().withId("wjvzunluthnn"))
                                        .withCustomLocation(new CustomLocationResourceId().withId("nxipeil")))
                                .withCoreNetworkTechnology(CoreNetworkType.EPC_5GC)
                                .withVersion("aejxd")
                                .withControlPlaneAccessInterface(
                                    new InterfaceProperties()
                                        .withName("sjyofdx")
                                        .withIpv4Address("us")
                                        .withIpv4Subnet("touwaboekqv")
                                        .withIpv4Gateway("lns"))
                                .withSku(BillingSku.G10)
                                .withUeMtu(314739755)
                                .withLocalDiagnosticsAccess(
                                    new LocalDiagnosticsAccessConfiguration()
                                        .withAuthenticationType(AuthenticationType.PASSWORD)
                                        .withHttpsServerCertificate(
                                            new HttpsServerCertificate().withCertificateUrl("jsflhhcaalnjix")))
                                .withDiagnosticsUpload(
                                    new DiagnosticsUploadConfiguration().withStorageAccountContainerUrl("yaw"))
                                .withInteropSettings("datayaqcslyjpkiidz")));
        model = BinaryData.fromObject(model).toObject(PacketCoreControlPlaneListResult.class);
        Assertions.assertEquals("s", model.value().get(0).location());
        Assertions.assertEquals("riplrbpbewtg", model.value().get(0).tags().get("fgb"));
        Assertions.assertEquals(ManagedServiceIdentityType.USER_ASSIGNED, model.value().get(0).identity().type());
        Assertions
            .assertEquals(DesiredInstallationState.UNINSTALLED, model.value().get(0).installation().desiredState());
        Assertions.assertEquals("ofmxagkvtmelmqkr", model.value().get(0).sites().get(0).id());
        Assertions.assertEquals(PlatformType.THREE_P_AZURE_STACK_HCI, model.value().get(0).platform().type());
        Assertions.assertEquals("laexqp", model.value().get(0).platform().azureStackEdgeDevice().id());
        Assertions.assertEquals("misgwbnb", model.value().get(0).platform().azureStackHciCluster().id());
        Assertions.assertEquals("ldawkzbaliourqha", model.value().get(0).platform().connectedCluster().id());
        Assertions.assertEquals("uhashsfwx", model.value().get(0).platform().customLocation().id());
        Assertions.assertEquals(CoreNetworkType.EPC_5GC, model.value().get(0).coreNetworkTechnology());
        Assertions.assertEquals("z", model.value().get(0).version());
        Assertions.assertEquals("civyhzceuo", model.value().get(0).controlPlaneAccessInterface().name());
        Assertions.assertEquals("jrwjueiotwm", model.value().get(0).controlPlaneAccessInterface().ipv4Address());
        Assertions.assertEquals("ytdxwit", model.value().get(0).controlPlaneAccessInterface().ipv4Subnet());
        Assertions.assertEquals("rjaw", model.value().get(0).controlPlaneAccessInterface().ipv4Gateway());
        Assertions.assertEquals(BillingSku.G5, model.value().get(0).sku());
        Assertions.assertEquals(1621003688, model.value().get(0).ueMtu());
        Assertions
            .assertEquals(
                AuthenticationType.PASSWORD, model.value().get(0).localDiagnosticsAccess().authenticationType());
        Assertions
            .assertEquals(
                "ni", model.value().get(0).localDiagnosticsAccess().httpsServerCertificate().certificateUrl());
        Assertions.assertEquals("fbkp", model.value().get(0).diagnosticsUpload().storageAccountContainerUrl());
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
