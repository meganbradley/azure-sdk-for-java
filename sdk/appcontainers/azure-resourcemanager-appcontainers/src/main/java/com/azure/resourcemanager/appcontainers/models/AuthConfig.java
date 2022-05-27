// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appcontainers.models;

import com.azure.core.util.Context;
import com.azure.resourcemanager.appcontainers.fluent.models.AuthConfigInner;

/** An immutable client-side representation of AuthConfig. */
public interface AuthConfig {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the platform property: The configuration settings of the platform of ContainerApp Service
     * Authentication/Authorization.
     *
     * @return the platform value.
     */
    AuthPlatform platform();

    /**
     * Gets the globalValidation property: The configuration settings that determines the validation flow of users using
     * Service Authentication/Authorization.
     *
     * @return the globalValidation value.
     */
    GlobalValidation globalValidation();

    /**
     * Gets the identityProviders property: The configuration settings of each of the identity providers used to
     * configure ContainerApp Service Authentication/Authorization.
     *
     * @return the identityProviders value.
     */
    IdentityProviders identityProviders();

    /**
     * Gets the login property: The configuration settings of the login flow of users using ContainerApp Service
     * Authentication/Authorization.
     *
     * @return the login value.
     */
    Login login();

    /**
     * Gets the httpSettings property: The configuration settings of the HTTP requests for authentication and
     * authorization requests made against ContainerApp Service Authentication/Authorization.
     *
     * @return the httpSettings value.
     */
    HttpSettings httpSettings();

    /**
     * Gets the name of the resource group.
     *
     * @return the name of the resource group.
     */
    String resourceGroupName();

    /**
     * Gets the inner com.azure.resourcemanager.appcontainers.fluent.models.AuthConfigInner object.
     *
     * @return the inner object.
     */
    AuthConfigInner innerModel();

    /** The entirety of the AuthConfig definition. */
    interface Definition
        extends DefinitionStages.Blank, DefinitionStages.WithParentResource, DefinitionStages.WithCreate {
    }
    /** The AuthConfig definition stages. */
    interface DefinitionStages {
        /** The first stage of the AuthConfig definition. */
        interface Blank extends WithParentResource {
        }
        /** The stage of the AuthConfig definition allowing to specify parent resource. */
        interface WithParentResource {
            /**
             * Specifies resourceGroupName, containerAppName.
             *
             * @param resourceGroupName The name of the resource group. The name is case insensitive.
             * @param containerAppName Name of the Container App.
             * @return the next definition stage.
             */
            WithCreate withExistingContainerApp(String resourceGroupName, String containerAppName);
        }
        /**
         * The stage of the AuthConfig definition which contains all the minimum required properties for the resource to
         * be created, but also allows for any other optional properties to be specified.
         */
        interface WithCreate
            extends DefinitionStages.WithPlatform,
                DefinitionStages.WithGlobalValidation,
                DefinitionStages.WithIdentityProviders,
                DefinitionStages.WithLogin,
                DefinitionStages.WithHttpSettings {
            /**
             * Executes the create request.
             *
             * @return the created resource.
             */
            AuthConfig create();

            /**
             * Executes the create request.
             *
             * @param context The context to associate with this operation.
             * @return the created resource.
             */
            AuthConfig create(Context context);
        }
        /** The stage of the AuthConfig definition allowing to specify platform. */
        interface WithPlatform {
            /**
             * Specifies the platform property: The configuration settings of the platform of ContainerApp Service
             * Authentication/Authorization..
             *
             * @param platform The configuration settings of the platform of ContainerApp Service
             *     Authentication/Authorization.
             * @return the next definition stage.
             */
            WithCreate withPlatform(AuthPlatform platform);
        }
        /** The stage of the AuthConfig definition allowing to specify globalValidation. */
        interface WithGlobalValidation {
            /**
             * Specifies the globalValidation property: The configuration settings that determines the validation flow
             * of users using Service Authentication/Authorization..
             *
             * @param globalValidation The configuration settings that determines the validation flow of users using
             *     Service Authentication/Authorization.
             * @return the next definition stage.
             */
            WithCreate withGlobalValidation(GlobalValidation globalValidation);
        }
        /** The stage of the AuthConfig definition allowing to specify identityProviders. */
        interface WithIdentityProviders {
            /**
             * Specifies the identityProviders property: The configuration settings of each of the identity providers
             * used to configure ContainerApp Service Authentication/Authorization..
             *
             * @param identityProviders The configuration settings of each of the identity providers used to configure
             *     ContainerApp Service Authentication/Authorization.
             * @return the next definition stage.
             */
            WithCreate withIdentityProviders(IdentityProviders identityProviders);
        }
        /** The stage of the AuthConfig definition allowing to specify login. */
        interface WithLogin {
            /**
             * Specifies the login property: The configuration settings of the login flow of users using ContainerApp
             * Service Authentication/Authorization..
             *
             * @param login The configuration settings of the login flow of users using ContainerApp Service
             *     Authentication/Authorization.
             * @return the next definition stage.
             */
            WithCreate withLogin(Login login);
        }
        /** The stage of the AuthConfig definition allowing to specify httpSettings. */
        interface WithHttpSettings {
            /**
             * Specifies the httpSettings property: The configuration settings of the HTTP requests for authentication
             * and authorization requests made against ContainerApp Service Authentication/Authorization..
             *
             * @param httpSettings The configuration settings of the HTTP requests for authentication and authorization
             *     requests made against ContainerApp Service Authentication/Authorization.
             * @return the next definition stage.
             */
            WithCreate withHttpSettings(HttpSettings httpSettings);
        }
    }
    /**
     * Begins update for the AuthConfig resource.
     *
     * @return the stage of resource update.
     */
    AuthConfig.Update update();

    /** The template for AuthConfig update. */
    interface Update
        extends UpdateStages.WithPlatform,
            UpdateStages.WithGlobalValidation,
            UpdateStages.WithIdentityProviders,
            UpdateStages.WithLogin,
            UpdateStages.WithHttpSettings {
        /**
         * Executes the update request.
         *
         * @return the updated resource.
         */
        AuthConfig apply();

        /**
         * Executes the update request.
         *
         * @param context The context to associate with this operation.
         * @return the updated resource.
         */
        AuthConfig apply(Context context);
    }
    /** The AuthConfig update stages. */
    interface UpdateStages {
        /** The stage of the AuthConfig update allowing to specify platform. */
        interface WithPlatform {
            /**
             * Specifies the platform property: The configuration settings of the platform of ContainerApp Service
             * Authentication/Authorization..
             *
             * @param platform The configuration settings of the platform of ContainerApp Service
             *     Authentication/Authorization.
             * @return the next definition stage.
             */
            Update withPlatform(AuthPlatform platform);
        }
        /** The stage of the AuthConfig update allowing to specify globalValidation. */
        interface WithGlobalValidation {
            /**
             * Specifies the globalValidation property: The configuration settings that determines the validation flow
             * of users using Service Authentication/Authorization..
             *
             * @param globalValidation The configuration settings that determines the validation flow of users using
             *     Service Authentication/Authorization.
             * @return the next definition stage.
             */
            Update withGlobalValidation(GlobalValidation globalValidation);
        }
        /** The stage of the AuthConfig update allowing to specify identityProviders. */
        interface WithIdentityProviders {
            /**
             * Specifies the identityProviders property: The configuration settings of each of the identity providers
             * used to configure ContainerApp Service Authentication/Authorization..
             *
             * @param identityProviders The configuration settings of each of the identity providers used to configure
             *     ContainerApp Service Authentication/Authorization.
             * @return the next definition stage.
             */
            Update withIdentityProviders(IdentityProviders identityProviders);
        }
        /** The stage of the AuthConfig update allowing to specify login. */
        interface WithLogin {
            /**
             * Specifies the login property: The configuration settings of the login flow of users using ContainerApp
             * Service Authentication/Authorization..
             *
             * @param login The configuration settings of the login flow of users using ContainerApp Service
             *     Authentication/Authorization.
             * @return the next definition stage.
             */
            Update withLogin(Login login);
        }
        /** The stage of the AuthConfig update allowing to specify httpSettings. */
        interface WithHttpSettings {
            /**
             * Specifies the httpSettings property: The configuration settings of the HTTP requests for authentication
             * and authorization requests made against ContainerApp Service Authentication/Authorization..
             *
             * @param httpSettings The configuration settings of the HTTP requests for authentication and authorization
             *     requests made against ContainerApp Service Authentication/Authorization.
             * @return the next definition stage.
             */
            Update withHttpSettings(HttpSettings httpSettings);
        }
    }
    /**
     * Refreshes the resource to sync with Azure.
     *
     * @return the refreshed resource.
     */
    AuthConfig refresh();

    /**
     * Refreshes the resource to sync with Azure.
     *
     * @param context The context to associate with this operation.
     * @return the refreshed resource.
     */
    AuthConfig refresh(Context context);
}
