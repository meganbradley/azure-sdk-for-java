// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.models.FactoryRepoConfiguration;
import com.azure.resourcemanager.datafactory.models.FactoryRepoUpdate;
import org.junit.jupiter.api.Assertions;

public final class FactoryRepoUpdateTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        FactoryRepoUpdate model = BinaryData.fromString(
            "{\"factoryResourceId\":\"qzbqjvsov\",\"repoConfiguration\":{\"type\":\"FactoryRepoConfiguration\",\"accountName\":\"okacspk\",\"repositoryName\":\"lhzdobp\",\"collaborationBranch\":\"jmflbvvnch\",\"rootFolder\":\"kcciwwzjuqkhr\",\"lastCommitId\":\"jiwkuofoskghsau\",\"disablePublish\":true}}")
            .toObject(FactoryRepoUpdate.class);
        Assertions.assertEquals("qzbqjvsov", model.factoryResourceId());
        Assertions.assertEquals("okacspk", model.repoConfiguration().accountName());
        Assertions.assertEquals("lhzdobp", model.repoConfiguration().repositoryName());
        Assertions.assertEquals("jmflbvvnch", model.repoConfiguration().collaborationBranch());
        Assertions.assertEquals("kcciwwzjuqkhr", model.repoConfiguration().rootFolder());
        Assertions.assertEquals("jiwkuofoskghsau", model.repoConfiguration().lastCommitId());
        Assertions.assertEquals(true, model.repoConfiguration().disablePublish());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        FactoryRepoUpdate model = new FactoryRepoUpdate().withFactoryResourceId("qzbqjvsov")
            .withRepoConfiguration(new FactoryRepoConfiguration().withAccountName("okacspk")
                .withRepositoryName("lhzdobp").withCollaborationBranch("jmflbvvnch").withRootFolder("kcciwwzjuqkhr")
                .withLastCommitId("jiwkuofoskghsau").withDisablePublish(true));
        model = BinaryData.fromObject(model).toObject(FactoryRepoUpdate.class);
        Assertions.assertEquals("qzbqjvsov", model.factoryResourceId());
        Assertions.assertEquals("okacspk", model.repoConfiguration().accountName());
        Assertions.assertEquals("lhzdobp", model.repoConfiguration().repositoryName());
        Assertions.assertEquals("jmflbvvnch", model.repoConfiguration().collaborationBranch());
        Assertions.assertEquals("kcciwwzjuqkhr", model.repoConfiguration().rootFolder());
        Assertions.assertEquals("jiwkuofoskghsau", model.repoConfiguration().lastCommitId());
        Assertions.assertEquals(true, model.repoConfiguration().disablePublish());
    }
}
