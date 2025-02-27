// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.eventgrid.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.eventgrid.fluent.models.DeliveryAttributeListResultInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionFullUrlInner;
import com.azure.resourcemanager.eventgrid.fluent.models.EventSubscriptionInner;
import com.azure.resourcemanager.eventgrid.models.EventSubscriptionUpdateParameters;

/** An instance of this class provides access to all the operations defined in DomainEventSubscriptionsClient. */
public interface DomainEventSubscriptionsClient {
    /**
     * Get properties of an event subscription of a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be found. Event subscription names must be between
     *     3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner get(String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Get properties of an event subscription of a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the partner topic.
     * @param eventSubscriptionName Name of the event subscription to be found. Event subscription names must be between
     *     3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an event subscription of a domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventSubscriptionInner> getWithResponse(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context);

    /**
     * Asynchronously creates a new event subscription or updates an existing event subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo);

    /**
     * Asynchronously creates a new event subscription or updates an existing event subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginCreateOrUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo,
        Context context);

    /**
     * Asynchronously creates a new event subscription or updates an existing event subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner createOrUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo);

    /**
     * Asynchronously creates a new event subscription or updates an existing event subscription.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription to be created. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param eventSubscriptionInfo Event subscription properties containing the destination and filter information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner createOrUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionInner eventSubscriptionInfo,
        Context context);

    /**
     * Delete an existing event subscription for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be deleted. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Delete an existing event subscription for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be deleted. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of long-running operation.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context);

    /**
     * Delete an existing event subscription for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be deleted. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Delete an existing event subscription for a domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be deleted. Event subscription names must be
     *     between 3 and 100 characters in length and use alphanumeric letters only.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String domainName, String eventSubscriptionName, Context context);

    /**
     * Update an existing event subscription for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update an existing event subscription for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link SyncPoller} for polling of event Subscription.
     */
    @ServiceMethod(returns = ReturnType.LONG_RUNNING_OPERATION)
    SyncPoller<PollResult<EventSubscriptionInner>, EventSubscriptionInner> beginUpdate(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters,
        Context context);

    /**
     * Update an existing event subscription for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner update(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters);

    /**
     * Update an existing event subscription for a topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param eventSubscriptionName Name of the event subscription to be updated.
     * @param eventSubscriptionUpdateParameters Updated event subscription information.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return event Subscription.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionInner update(
        String resourceGroupName,
        String domainName,
        String eventSubscriptionName,
        EventSubscriptionUpdateParameters eventSubscriptionUpdateParameters,
        Context context);

    /**
     * Get the full endpoint URL for an event subscription for domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription for domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    EventSubscriptionFullUrlInner getFullUrl(String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Get the full endpoint URL for an event subscription for domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the full endpoint URL for an event subscription for domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<EventSubscriptionFullUrlInner> getFullUrlWithResponse(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context);

    /**
     * List all event subscriptions that have been created for a specific topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSubscriptionInner> list(String resourceGroupName, String domainName);

    /**
     * List all event subscriptions that have been created for a specific topic.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain.
     * @param filter The query used to filter the search results using OData syntax. Filtering is permitted on the
     *     'name' property only and with limited number of OData operations. These operations are: the 'contains'
     *     function as well as the following logical operations: not, and, or, eq (for equal), and ne (for not equal).
     *     No arithmetic operations are supported. The following is a valid filter example: $filter=contains(namE,
     *     'PATTERN') and name ne 'PATTERN-1'. The following is not a valid filter example: $filter=location eq
     *     'westus'.
     * @param top The number of results to return per page for the list operation. Valid range for top parameter is 1 to
     *     100. If not specified, the default number of results to be returned is 20 items per page.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return result of the List EventSubscriptions operation as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<EventSubscriptionInner> list(
        String resourceGroupName, String domainName, String filter, Integer top, Context context);

    /**
     * Get all delivery attributes for an event subscription for domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription for domain.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    DeliveryAttributeListResultInner getDeliveryAttributes(
        String resourceGroupName, String domainName, String eventSubscriptionName);

    /**
     * Get all delivery attributes for an event subscription for domain.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription.
     * @param domainName Name of the domain topic.
     * @param eventSubscriptionName Name of the event subscription.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return all delivery attributes for an event subscription for domain along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<DeliveryAttributeListResultInner> getDeliveryAttributesWithResponse(
        String resourceGroupName, String domainName, String eventSubscriptionName, Context context);
}
