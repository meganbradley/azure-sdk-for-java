// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.security.keyvault.administration.implementation;

import com.azure.core.annotation.BodyParam;
import com.azure.core.annotation.ExpectedResponses;
import com.azure.core.annotation.Get;
import com.azure.core.annotation.HeaderParam;
import com.azure.core.annotation.Host;
import com.azure.core.annotation.HostParam;
import com.azure.core.annotation.Patch;
import com.azure.core.annotation.PathParam;
import com.azure.core.annotation.QueryParam;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceInterface;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.annotation.UnexpectedResponseExceptionType;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpPipelineBuilder;
import com.azure.core.http.policy.RetryPolicy;
import com.azure.core.http.policy.UserAgentPolicy;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.RestProxy;
import com.azure.core.util.Context;
import com.azure.core.util.FluxUtil;
import com.azure.core.util.serializer.JacksonAdapter;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.security.keyvault.administration.implementation.models.KeyVaultErrorException;
import com.azure.security.keyvault.administration.implementation.models.Setting;
import com.azure.security.keyvault.administration.implementation.models.SettingsListResult;
import com.azure.security.keyvault.administration.implementation.models.UpdateSettingRequest;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the KeyVaultSettingsClient type. */
public final class KeyVaultSettingsClientImpl {
    /** The proxy service used to perform REST calls. */
    private final KeyVaultSettingsClientService service;

    /** Api Version. */
    private final String apiVersion;

    /**
     * Gets Api Version.
     *
     * @return the apiVersion value.
     */
    public String getApiVersion() {
        return this.apiVersion;
    }

    /** The HTTP pipeline to send requests through. */
    private final HttpPipeline httpPipeline;

    /**
     * Gets The HTTP pipeline to send requests through.
     *
     * @return the httpPipeline value.
     */
    public HttpPipeline getHttpPipeline() {
        return this.httpPipeline;
    }

    /** The serializer to serialize an object into a string. */
    private final SerializerAdapter serializerAdapter;

    /**
     * Gets The serializer to serialize an object into a string.
     *
     * @return the serializerAdapter value.
     */
    public SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /**
     * Initializes an instance of KeyVaultSettingsClient client.
     *
     * @param apiVersion Api Version.
     */
    public KeyVaultSettingsClientImpl(String apiVersion) {
        this(
                new HttpPipelineBuilder().policies(new UserAgentPolicy(), new RetryPolicy()).build(),
                JacksonAdapter.createDefaultSerializerAdapter(),
                apiVersion);
    }

    /**
     * Initializes an instance of KeyVaultSettingsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param apiVersion Api Version.
     */
    public KeyVaultSettingsClientImpl(HttpPipeline httpPipeline, String apiVersion) {
        this(httpPipeline, JacksonAdapter.createDefaultSerializerAdapter(), apiVersion);
    }

    /**
     * Initializes an instance of KeyVaultSettingsClient client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param apiVersion Api Version.
     */
    public KeyVaultSettingsClientImpl(
            HttpPipeline httpPipeline, SerializerAdapter serializerAdapter, String apiVersion) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.apiVersion = apiVersion;
        this.service =
                RestProxy.create(KeyVaultSettingsClientService.class, this.httpPipeline, this.getSerializerAdapter());
    }

    /**
     * The interface defining all the services for KeyVaultSettingsClient to be used by the proxy service to perform
     * REST calls.
     */
    @Host("{vaultBaseUrl}")
    @ServiceInterface(name = "KeyVaultSettingsClie")
    public interface KeyVaultSettingsClientService {
        @Patch("/settings/{setting-name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<Setting>> updateSetting(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("setting-name") String settingName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") UpdateSettingRequest parameters,
                @HeaderParam("Accept") String accept,
                Context context);

        @Patch("/settings/{setting-name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Response<Setting> updateSettingSync(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("setting-name") String settingName,
                @QueryParam("api-version") String apiVersion,
                @BodyParam("application/json") UpdateSettingRequest parameters,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/settings/{setting-name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<Setting>> getSetting(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("setting-name") String settingName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/settings/{setting-name}")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Response<Setting> getSettingSync(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @PathParam("setting-name") String settingName,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/settings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Mono<Response<SettingsListResult>> getSettings(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);

        @Get("/settings")
        @ExpectedResponses({200})
        @UnexpectedResponseExceptionType(KeyVaultErrorException.class)
        Response<SettingsListResult> getSettingsSync(
                @HostParam("vaultBaseUrl") String vaultBaseUrl,
                @QueryParam("api-version") String apiVersion,
                @HeaderParam("Accept") String accept,
                Context context);
    }

    /**
     * Updates key vault account setting, stores it, then returns the setting name and value to the client.
     *
     * <p>Description of the pool setting to be updated.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param value The value of the pool setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Setting>> updateSettingWithResponseAsync(
            String vaultBaseUrl, String settingName, String value) {
        final String accept = "application/json";
        UpdateSettingRequest parameters = new UpdateSettingRequest();
        parameters.setValue(value);
        return FluxUtil.withContext(
                context ->
                        service.updateSetting(
                                vaultBaseUrl, settingName, this.getApiVersion(), parameters, accept, context));
    }

    /**
     * Updates key vault account setting, stores it, then returns the setting name and value to the client.
     *
     * <p>Description of the pool setting to be updated.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param value The value of the pool setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Setting>> updateSettingWithResponseAsync(
            String vaultBaseUrl, String settingName, String value, Context context) {
        final String accept = "application/json";
        UpdateSettingRequest parameters = new UpdateSettingRequest();
        parameters.setValue(value);
        return service.updateSetting(vaultBaseUrl, settingName, this.getApiVersion(), parameters, accept, context);
    }

    /**
     * Updates key vault account setting, stores it, then returns the setting name and value to the client.
     *
     * <p>Description of the pool setting to be updated.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param value The value of the pool setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Setting> updateSettingAsync(String vaultBaseUrl, String settingName, String value) {
        return updateSettingWithResponseAsync(vaultBaseUrl, settingName, value)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates key vault account setting, stores it, then returns the setting name and value to the client.
     *
     * <p>Description of the pool setting to be updated.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param value The value of the pool setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Setting> updateSettingAsync(String vaultBaseUrl, String settingName, String value, Context context) {
        return updateSettingWithResponseAsync(vaultBaseUrl, settingName, value, context)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Updates key vault account setting, stores it, then returns the setting name and value to the client.
     *
     * <p>Description of the pool setting to be updated.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param value The value of the pool setting.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Setting> updateSettingWithResponse(
            String vaultBaseUrl, String settingName, String value, Context context) {
        final String accept = "application/json";
        UpdateSettingRequest parameters = new UpdateSettingRequest();
        parameters.setValue(value);
        return service.updateSettingSync(vaultBaseUrl, settingName, this.getApiVersion(), parameters, accept, context);
    }

    /**
     * Updates key vault account setting, stores it, then returns the setting name and value to the client.
     *
     * <p>Description of the pool setting to be updated.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param value The value of the pool setting.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Setting updateSetting(String vaultBaseUrl, String settingName, String value) {
        return updateSettingWithResponse(vaultBaseUrl, settingName, value, Context.NONE).getValue();
    }

    /**
     * Get specified account setting object.
     *
     * <p>Retrieves the setting object of a specified setting name.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Setting>> getSettingWithResponseAsync(String vaultBaseUrl, String settingName) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.getSetting(vaultBaseUrl, settingName, this.getApiVersion(), accept, context));
    }

    /**
     * Get specified account setting object.
     *
     * <p>Retrieves the setting object of a specified setting name.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<Setting>> getSettingWithResponseAsync(
            String vaultBaseUrl, String settingName, Context context) {
        final String accept = "application/json";
        return service.getSetting(vaultBaseUrl, settingName, this.getApiVersion(), accept, context);
    }

    /**
     * Get specified account setting object.
     *
     * <p>Retrieves the setting object of a specified setting name.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Setting> getSettingAsync(String vaultBaseUrl, String settingName) {
        return getSettingWithResponseAsync(vaultBaseUrl, settingName).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get specified account setting object.
     *
     * <p>Retrieves the setting object of a specified setting name.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Setting> getSettingAsync(String vaultBaseUrl, String settingName, Context context) {
        return getSettingWithResponseAsync(vaultBaseUrl, settingName, context)
                .flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * Get specified account setting object.
     *
     * <p>Retrieves the setting object of a specified setting name.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response body along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<Setting> getSettingWithResponse(String vaultBaseUrl, String settingName, Context context) {
        final String accept = "application/json";
        return service.getSettingSync(vaultBaseUrl, settingName, this.getApiVersion(), accept, context);
    }

    /**
     * Get specified account setting object.
     *
     * <p>Retrieves the setting object of a specified setting name.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param settingName The name of the account setting. Must be a valid settings option.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the response.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Setting getSetting(String vaultBaseUrl, String settingName) {
        return getSettingWithResponse(vaultBaseUrl, settingName, Context.NONE).getValue();
    }

    /**
     * List account settings.
     *
     * <p>Retrieves a list of all the available account settings that can be configured.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the settings list result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SettingsListResult>> getSettingsWithResponseAsync(String vaultBaseUrl) {
        final String accept = "application/json";
        return FluxUtil.withContext(
                context -> service.getSettings(vaultBaseUrl, this.getApiVersion(), accept, context));
    }

    /**
     * List account settings.
     *
     * <p>Retrieves a list of all the available account settings that can be configured.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the settings list result along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<Response<SettingsListResult>> getSettingsWithResponseAsync(String vaultBaseUrl, Context context) {
        final String accept = "application/json";
        return service.getSettings(vaultBaseUrl, this.getApiVersion(), accept, context);
    }

    /**
     * List account settings.
     *
     * <p>Retrieves a list of all the available account settings that can be configured.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the settings list result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SettingsListResult> getSettingsAsync(String vaultBaseUrl) {
        return getSettingsWithResponseAsync(vaultBaseUrl).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List account settings.
     *
     * <p>Retrieves a list of all the available account settings that can be configured.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the settings list result on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<SettingsListResult> getSettingsAsync(String vaultBaseUrl, Context context) {
        return getSettingsWithResponseAsync(vaultBaseUrl, context).flatMap(res -> Mono.justOrEmpty(res.getValue()));
    }

    /**
     * List account settings.
     *
     * <p>Retrieves a list of all the available account settings that can be configured.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the settings list result along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Response<SettingsListResult> getSettingsWithResponse(String vaultBaseUrl, Context context) {
        final String accept = "application/json";
        return service.getSettingsSync(vaultBaseUrl, this.getApiVersion(), accept, context);
    }

    /**
     * List account settings.
     *
     * <p>Retrieves a list of all the available account settings that can be configured.
     *
     * @param vaultBaseUrl The vault name, for example https://myvault.vault.azure.net.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws KeyVaultErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the settings list result.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public SettingsListResult getSettings(String vaultBaseUrl) {
        return getSettingsWithResponse(vaultBaseUrl, Context.NONE).getValue();
    }
}
