// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.deviceupdate.generated;

import com.azure.core.util.Context;

/** Samples for PrivateEndpointConnectionProxies ListByAccount. */
public final class PrivateEndpointConnectionProxiesListByAccountSamples {
    /*
     * x-ms-original-file: specification/deviceupdate/resource-manager/Microsoft.DeviceUpdate/preview/2022-04-01-preview/examples/PrivateEndpointConnectionProxies/PrivateEndpointConnectionProxy_ListByAccount.json
     */
    /**
     * Sample code: PrivateEndpointConnectionProxyList.
     *
     * @param manager Entry point to DeviceUpdateManager.
     */
    public static void privateEndpointConnectionProxyList(
        com.azure.resourcemanager.deviceupdate.DeviceUpdateManager manager) {
        manager.privateEndpointConnectionProxies().listByAccount("test-rg", "contoso", Context.NONE);
    }
}
