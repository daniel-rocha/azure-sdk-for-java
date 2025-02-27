// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.network.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.network.fluent.models.AzureFirewallInner;
import com.azure.resourcemanager.network.models.TagsObject;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsDelete;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsGet;
import com.azure.resourcemanager.resources.fluentcore.collection.InnerSupportsListing;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in AzureFirewallsClient. */
public interface AzureFirewallsClient
    extends InnerSupportsGet<AzureFirewallInner>, InnerSupportsListing<AzureFirewallInner>, InnerSupportsDelete<Void> {
    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(String resourceGroupName, String azureFirewallName);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(String resourceGroupName, String azureFirewallName);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String azureFirewallName);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String azureFirewallName, Context context);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return A {@link Mono} that completes when a successful response is received.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String azureFirewallName);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String azureFirewallName);

    /**
     * Deletes the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String azureFirewallName, Context context);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<AzureFirewallInner>> getByResourceGroupWithResponseAsync(
        String resourceGroupName, String azureFirewallName);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AzureFirewallInner> getByResourceGroupAsync(String resourceGroupName, String azureFirewallName);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureFirewallInner getByResourceGroup(String resourceGroupName, String azureFirewallName);

    /**
     * Gets the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified Azure Firewall along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AzureFirewallInner> getByResourceGroupWithResponse(
        String resourceGroupName, String azureFirewallName, Context context);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<AzureFirewallInner>, AzureFirewallInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureFirewallInner>, AzureFirewallInner> beginCreateOrUpdate(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureFirewallInner>, AzureFirewallInner> beginCreateOrUpdate(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters, Context context);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AzureFirewallInner> createOrUpdateAsync(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureFirewallInner createOrUpdate(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters);

    /**
     * Creates or updates the specified Azure Firewall.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to the create or update Azure Firewall operation.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureFirewallInner createOrUpdate(
        String resourceGroupName, String azureFirewallName, AzureFirewallInner parameters, Context context);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource along with {@link Response} on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> updateTagsWithResponseAsync(
        String resourceGroupName, String azureFirewallName, TagsObject parameters);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link PollerFlux} for polling of azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    PollerFlux<PollResult<AzureFirewallInner>, AzureFirewallInner> beginUpdateTagsAsync(
        String resourceGroupName, String azureFirewallName, TagsObject parameters);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureFirewallInner>, AzureFirewallInner> beginUpdateTags(
        String resourceGroupName, String azureFirewallName, TagsObject parameters);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<AzureFirewallInner>, AzureFirewallInner> beginUpdateTags(
        String resourceGroupName, String azureFirewallName, TagsObject parameters, Context context);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<AzureFirewallInner> updateTagsAsync(String resourceGroupName, String azureFirewallName, TagsObject parameters);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureFirewallInner updateTags(String resourceGroupName, String azureFirewallName, TagsObject parameters);

    /**
     * Updates tags of an Azure Firewall resource.
     *
     * @param resourceGroupName The name of the resource group.
     * @param azureFirewallName The name of the Azure Firewall.
     * @param parameters Parameters supplied to update azure firewall tags.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return azure Firewall resource.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AzureFirewallInner updateTags(
        String resourceGroupName, String azureFirewallName, TagsObject parameters, Context context);

    /**
     * Lists all Azure Firewalls in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListAzureFirewalls API service call as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AzureFirewallInner> listByResourceGroupAsync(String resourceGroupName);

    /**
     * Lists all Azure Firewalls in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListAzureFirewalls API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureFirewallInner> listByResourceGroup(String resourceGroupName);

    /**
     * Lists all Azure Firewalls in a resource group.
     *
     * @param resourceGroupName The name of the resource group.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return response for ListAzureFirewalls API service call as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureFirewallInner> listByResourceGroup(String resourceGroupName, Context context);

    /**
     * Gets all the Azure Firewalls in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewalls in a subscription as paginated response with {@link PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<AzureFirewallInner> listAsync();

    /**
     * Gets all the Azure Firewalls in a subscription.
     *
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewalls in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureFirewallInner> list();

    /**
     * Gets all the Azure Firewalls in a subscription.
     *
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all the Azure Firewalls in a subscription as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AzureFirewallInner> list(Context context);
}
