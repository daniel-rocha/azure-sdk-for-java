// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dnsresolver.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.dnsresolver.fluent.DnsForwardingRulesetsClient;
import com.azure.resourcemanager.dnsresolver.fluent.models.DnsForwardingRulesetInner;
import com.azure.resourcemanager.dnsresolver.fluent.models.VirtualNetworkDnsForwardingRulesetInner;
import com.azure.resourcemanager.dnsresolver.models.DnsForwardingRuleset;
import com.azure.resourcemanager.dnsresolver.models.DnsForwardingRulesets;
import com.azure.resourcemanager.dnsresolver.models.VirtualNetworkDnsForwardingRuleset;
import com.fasterxml.jackson.annotation.JsonIgnore;

public final class DnsForwardingRulesetsImpl implements DnsForwardingRulesets {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DnsForwardingRulesetsImpl.class);

    private final DnsForwardingRulesetsClient innerClient;

    private final com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager;

    public DnsForwardingRulesetsImpl(
        DnsForwardingRulesetsClient innerClient,
        com.azure.resourcemanager.dnsresolver.DnsResolverManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public void delete(String resourceGroupName, String dnsForwardingRulesetName, String ifMatch) {
        this.serviceClient().delete(resourceGroupName, dnsForwardingRulesetName, ifMatch);
    }

    public void delete(String resourceGroupName, String dnsForwardingRulesetName) {
        this.serviceClient().delete(resourceGroupName, dnsForwardingRulesetName);
    }

    public void delete(String resourceGroupName, String dnsForwardingRulesetName, String ifMatch, Context context) {
        this.serviceClient().delete(resourceGroupName, dnsForwardingRulesetName, ifMatch, context);
    }

    public DnsForwardingRuleset getByResourceGroup(String resourceGroupName, String dnsForwardingRulesetName) {
        DnsForwardingRulesetInner inner =
            this.serviceClient().getByResourceGroup(resourceGroupName, dnsForwardingRulesetName);
        if (inner != null) {
            return new DnsForwardingRulesetImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DnsForwardingRuleset> getByResourceGroupWithResponse(
        String resourceGroupName, String dnsForwardingRulesetName, Context context) {
        Response<DnsForwardingRulesetInner> inner =
            this.serviceClient().getByResourceGroupWithResponse(resourceGroupName, dnsForwardingRulesetName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DnsForwardingRulesetImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<DnsForwardingRuleset> listByResourceGroup(String resourceGroupName) {
        PagedIterable<DnsForwardingRulesetInner> inner = this.serviceClient().listByResourceGroup(resourceGroupName);
        return Utils.mapPage(inner, inner1 -> new DnsForwardingRulesetImpl(inner1, this.manager()));
    }

    public PagedIterable<DnsForwardingRuleset> listByResourceGroup(
        String resourceGroupName, Integer top, Context context) {
        PagedIterable<DnsForwardingRulesetInner> inner =
            this.serviceClient().listByResourceGroup(resourceGroupName, top, context);
        return Utils.mapPage(inner, inner1 -> new DnsForwardingRulesetImpl(inner1, this.manager()));
    }

    public PagedIterable<DnsForwardingRuleset> list() {
        PagedIterable<DnsForwardingRulesetInner> inner = this.serviceClient().list();
        return Utils.mapPage(inner, inner1 -> new DnsForwardingRulesetImpl(inner1, this.manager()));
    }

    public PagedIterable<DnsForwardingRuleset> list(Integer top, Context context) {
        PagedIterable<DnsForwardingRulesetInner> inner = this.serviceClient().list(top, context);
        return Utils.mapPage(inner, inner1 -> new DnsForwardingRulesetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkDnsForwardingRuleset> listByVirtualNetwork(
        String resourceGroupName, String virtualNetworkName) {
        PagedIterable<VirtualNetworkDnsForwardingRulesetInner> inner =
            this.serviceClient().listByVirtualNetwork(resourceGroupName, virtualNetworkName);
        return Utils.mapPage(inner, inner1 -> new VirtualNetworkDnsForwardingRulesetImpl(inner1, this.manager()));
    }

    public PagedIterable<VirtualNetworkDnsForwardingRuleset> listByVirtualNetwork(
        String resourceGroupName, String virtualNetworkName, Integer top, Context context) {
        PagedIterable<VirtualNetworkDnsForwardingRulesetInner> inner =
            this.serviceClient().listByVirtualNetwork(resourceGroupName, virtualNetworkName, top, context);
        return Utils.mapPage(inner, inner1 -> new VirtualNetworkDnsForwardingRulesetImpl(inner1, this.manager()));
    }

    public DnsForwardingRuleset getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsForwardingRulesetName = Utils.getValueFromIdByName(id, "dnsForwardingRulesets");
        if (dnsForwardingRulesetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dnsForwardingRulesets'.",
                                id)));
        }
        return this
            .getByResourceGroupWithResponse(resourceGroupName, dnsForwardingRulesetName, Context.NONE)
            .getValue();
    }

    public Response<DnsForwardingRuleset> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsForwardingRulesetName = Utils.getValueFromIdByName(id, "dnsForwardingRulesets");
        if (dnsForwardingRulesetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dnsForwardingRulesets'.",
                                id)));
        }
        return this.getByResourceGroupWithResponse(resourceGroupName, dnsForwardingRulesetName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsForwardingRulesetName = Utils.getValueFromIdByName(id, "dnsForwardingRulesets");
        if (dnsForwardingRulesetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dnsForwardingRulesets'.",
                                id)));
        }
        String localIfMatch = null;
        this.delete(resourceGroupName, dnsForwardingRulesetName, localIfMatch, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, String ifMatch, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String dnsForwardingRulesetName = Utils.getValueFromIdByName(id, "dnsForwardingRulesets");
        if (dnsForwardingRulesetName == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format(
                                "The resource ID '%s' is not valid. Missing path segment 'dnsForwardingRulesets'.",
                                id)));
        }
        this.delete(resourceGroupName, dnsForwardingRulesetName, ifMatch, context);
    }

    private DnsForwardingRulesetsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.dnsresolver.DnsResolverManager manager() {
        return this.serviceManager;
    }

    public DnsForwardingRulesetImpl define(String name) {
        return new DnsForwardingRulesetImpl(name, this.manager());
    }
}
