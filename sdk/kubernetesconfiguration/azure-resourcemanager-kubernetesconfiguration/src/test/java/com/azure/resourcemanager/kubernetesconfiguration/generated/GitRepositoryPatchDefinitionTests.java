// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.kubernetesconfiguration.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.kubernetesconfiguration.models.GitRepositoryPatchDefinition;
import com.azure.resourcemanager.kubernetesconfiguration.models.RepositoryRefDefinition;
import org.junit.jupiter.api.Assertions;

public final class GitRepositoryPatchDefinitionTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        GitRepositoryPatchDefinition model =
            BinaryData
                .fromString(
                    "{\"url\":\"dudgwdslfhot\",\"timeoutInSeconds\":2018692582884828033,\"syncIntervalInSeconds\":8219003189774073818,\"repositoryRef\":{\"branch\":\"jnpg\",\"tag\":\"ftadehxnltyfs\",\"semver\":\"pusuesn\",\"commit\":\"dejbavo\"},\"sshKnownHosts\":\"zdmohctbqvu\",\"httpsUser\":\"xdn\",\"httpsCACert\":\"vo\",\"localAuthRef\":\"ujjugwdkcglh\"}")
                .toObject(GitRepositoryPatchDefinition.class);
        Assertions.assertEquals("dudgwdslfhot", model.url());
        Assertions.assertEquals(2018692582884828033L, model.timeoutInSeconds());
        Assertions.assertEquals(8219003189774073818L, model.syncIntervalInSeconds());
        Assertions.assertEquals("jnpg", model.repositoryRef().branch());
        Assertions.assertEquals("ftadehxnltyfs", model.repositoryRef().tag());
        Assertions.assertEquals("pusuesn", model.repositoryRef().semver());
        Assertions.assertEquals("dejbavo", model.repositoryRef().commit());
        Assertions.assertEquals("zdmohctbqvu", model.sshKnownHosts());
        Assertions.assertEquals("xdn", model.httpsUser());
        Assertions.assertEquals("vo", model.httpsCACert());
        Assertions.assertEquals("ujjugwdkcglh", model.localAuthRef());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        GitRepositoryPatchDefinition model =
            new GitRepositoryPatchDefinition()
                .withUrl("dudgwdslfhot")
                .withTimeoutInSeconds(2018692582884828033L)
                .withSyncIntervalInSeconds(8219003189774073818L)
                .withRepositoryRef(
                    new RepositoryRefDefinition()
                        .withBranch("jnpg")
                        .withTag("ftadehxnltyfs")
                        .withSemver("pusuesn")
                        .withCommit("dejbavo"))
                .withSshKnownHosts("zdmohctbqvu")
                .withHttpsUser("xdn")
                .withHttpsCACert("vo")
                .withLocalAuthRef("ujjugwdkcglh");
        model = BinaryData.fromObject(model).toObject(GitRepositoryPatchDefinition.class);
        Assertions.assertEquals("dudgwdslfhot", model.url());
        Assertions.assertEquals(2018692582884828033L, model.timeoutInSeconds());
        Assertions.assertEquals(8219003189774073818L, model.syncIntervalInSeconds());
        Assertions.assertEquals("jnpg", model.repositoryRef().branch());
        Assertions.assertEquals("ftadehxnltyfs", model.repositoryRef().tag());
        Assertions.assertEquals("pusuesn", model.repositoryRef().semver());
        Assertions.assertEquals("dejbavo", model.repositoryRef().commit());
        Assertions.assertEquals("zdmohctbqvu", model.sshKnownHosts());
        Assertions.assertEquals("xdn", model.httpsUser());
        Assertions.assertEquals("vo", model.httpsCACert());
        Assertions.assertEquals("ujjugwdkcglh", model.localAuthRef());
    }
}
