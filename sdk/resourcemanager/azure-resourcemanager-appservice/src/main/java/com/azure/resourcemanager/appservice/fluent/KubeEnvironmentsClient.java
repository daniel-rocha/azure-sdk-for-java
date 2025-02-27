// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.appservice.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.appservice.fluent.models.KubeEnvironmentInner;
import com.azure.resourcemanager.appservice.models.KubeEnvironmentPatchResource;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in KubeEnvironmentsClient. */
public interface KubeEnvironmentsClient
    extends InnerSupportsGet<KubeEnvironmentInner>,
        InnerSupportsListing<KubeEnvironmentInner>,
        InnerSupportsDelete<Void> {
    /**
     * Description for Get all Kubernetes Environments for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<KubeEnvironmentInner> listAsync();

    /**
     * Description for Get all Kubernetes Environments for a subscription.
     *
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubeEnvironmentInner> list();

    /**
     * Description for Get all Kubernetes Environments for a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubeEnvironmentInner> list(Context context);

    /**
     * Description for Get all the Kubernetes Environments in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<KubeEnvironmentInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Description for Get all the Kubernetes Environments in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubeEnvironmentInner> listByResourceGroup(String resourceGroupName);

    /**
     * Description for Get all the Kubernetes Environments in a resource group.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return collection of Kubernetes Environments as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<KubeEnvironmentInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<KubeEnvironmentInner>> getByResourceGroupWithResponseAsync(String resourceGroupName, String name);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<KubeEnvironmentInner> getByResourceGroupAsync(String resourceGroupName, String name);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubeEnvironmentInner getByResourceGroup(String resourceGroupName, String name);

    /**
     * Description for Get the properties of a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KubeEnvironmentInner> getByResourceGroupWithResponse(
        String resourceGroupName, String name, Context context);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of a Kubernetes cluster specialized for web workloads by Azure App
     *     Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<KubeEnvironmentInner>, KubeEnvironmentInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Kubernetes cluster specialized for web workloads by Azure App
     *     Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<KubeEnvironmentInner>, KubeEnvironmentInner> beginCreateOrUpdate(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of a Kubernetes cluster specialized for web workloads by Azure App
     *     Service.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<KubeEnvironmentInner>, KubeEnvironmentInner> beginCreateOrUpdate(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope, Context context);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<KubeEnvironmentInner> createOrUpdateAsync(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubeEnvironmentInner createOrUpdate(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubeEnvironmentInner createOrUpdate(
        String resourceGroupName, String name, KubeEnvironmentInner kubeEnvironmentEnvelope, Context context);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String name);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String name);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String name, Context context);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String name);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name);

    /**
     * Description for Delete a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String name, Context context);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response} on
     *     successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<KubeEnvironmentInner>> updateWithResponseAsync(
        String resourceGroupName, String name, KubeEnvironmentPatchResource kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<KubeEnvironmentInner> updateAsync(
        String resourceGroupName, String name, KubeEnvironmentPatchResource kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    KubeEnvironmentInner update(
        String resourceGroupName, String name, KubeEnvironmentPatchResource kubeEnvironmentEnvelope);

    /**
     * Description for Creates or updates a Kubernetes Environment.
     *
     * @param resourceGroupName Name of the resource group to which the resource belongs.
     * @param name Name of the Kubernetes Environment.
     * @param kubeEnvironmentEnvelope Configuration details of the Kubernetes Environment.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.resourcemanager.appservice.models.DefaultErrorResponseErrorException thrown if the request is
     *     rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a Kubernetes cluster specialized for web workloads by Azure App Service along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<KubeEnvironmentInner> updateWithResponse(
        String resourceGroupName, String name, KubeEnvironmentPatchResource kubeEnvironmentEnvelope, Context context);
}
