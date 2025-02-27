// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.authorization.fluent.models.RoleEligibilityScheduleInstanceInner;
import reactor.core.publisher.Mono;

/**
 * An instance of this class provides access to all the operations defined in RoleEligibilityScheduleInstancesClient.
 */
public interface RoleEligibilityScheduleInstancesClient {
    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleEligibilityScheduleInstanceInner> listForScopeAsync(String scope, String filter);

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedFlux}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<RoleEligibilityScheduleInstanceInner> listForScopeAsync(String scope);

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleEligibilityScheduleInstanceInner> listForScope(String scope);

    /**
     * Gets role eligibility schedule instances of a role eligibility schedule.
     *
     * @param scope The scope of the role eligibility schedule.
     * @param filter The filter to apply on the operation. Use $filter=atScope() to return all role assignment schedules
     *     at or above the scope. Use $filter=principalId eq {id} to return all role assignment schedules at, above or
     *     below the scope for the specified principal. Use $filter=assignedTo('{userId}') to return all role
     *     eligibility schedules for the user. Use $filter=asTarget() to return all role eligibility schedules created
     *     for the current user.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return role eligibility schedule instances of a role eligibility schedule as paginated response with {@link
     *     PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<RoleEligibilityScheduleInstanceInner> listForScope(String scope, String filter, Context context);

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance along with {@link Response} on successful completion of
     *     {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<RoleEligibilityScheduleInstanceInner>> getWithResponseAsync(
        String scope, String roleEligibilityScheduleInstanceName);

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance on successful completion of {@link Mono}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<RoleEligibilityScheduleInstanceInner> getAsync(String scope, String roleEligibilityScheduleInstanceName);

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    RoleEligibilityScheduleInstanceInner get(String scope, String roleEligibilityScheduleInstanceName);

    /**
     * Gets the specified role eligibility schedule instance.
     *
     * @param scope The scope of the role eligibility schedules.
     * @param roleEligibilityScheduleInstanceName The name (hash of schedule name + time) of the role eligibility
     *     schedule to get.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the specified role eligibility schedule instance along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<RoleEligibilityScheduleInstanceInner> getWithResponse(
        String scope, String roleEligibilityScheduleInstanceName, Context context);
}
