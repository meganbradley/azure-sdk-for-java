/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.compute.v2020_06_01.implementation;

import com.microsoft.azure.arm.resources.models.implementation.GroupableResourceCoreImpl;
import com.microsoft.azure.management.compute.v2020_06_01.SshPublicKeyResource;
import rx.Observable;
import com.microsoft.azure.management.compute.v2020_06_01.SshPublicKeyUpdateResource;
import rx.functions.Func1;

class SshPublicKeyResourceImpl extends GroupableResourceCoreImpl<SshPublicKeyResource, SshPublicKeyResourceInner, SshPublicKeyResourceImpl, ComputeManager> implements SshPublicKeyResource, SshPublicKeyResource.Definition, SshPublicKeyResource.Update {
    private SshPublicKeyUpdateResource updateParameter;
    SshPublicKeyResourceImpl(String name, SshPublicKeyResourceInner inner, ComputeManager manager) {
        super(name, inner, manager);
        this.updateParameter = new SshPublicKeyUpdateResource();
    }

    @Override
    public Observable<SshPublicKeyResource> createResourceAsync() {
        SshPublicKeysInner client = this.manager().inner().sshPublicKeys();
        return client.createAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(new Func1<SshPublicKeyResourceInner, SshPublicKeyResourceInner>() {
               @Override
               public SshPublicKeyResourceInner call(SshPublicKeyResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<SshPublicKeyResource> updateResourceAsync() {
        SshPublicKeysInner client = this.manager().inner().sshPublicKeys();
        return client.updateAsync(this.resourceGroupName(), this.name(), this.updateParameter)
            .map(new Func1<SshPublicKeyResourceInner, SshPublicKeyResourceInner>() {
               @Override
               public SshPublicKeyResourceInner call(SshPublicKeyResourceInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<SshPublicKeyResourceInner> getInnerAsync() {
        SshPublicKeysInner client = this.manager().inner().sshPublicKeys();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new SshPublicKeyUpdateResource();
    }

    @Override
    public String publicKey() {
        return this.inner().publicKey();
    }

    @Override
    public SshPublicKeyResourceImpl withPublicKey(String publicKey) {
        if (isInCreateMode()) {
            this.inner().withPublicKey(publicKey);
        } else {
            this.updateParameter.withPublicKey(publicKey);
        }
        return this;
    }

}
