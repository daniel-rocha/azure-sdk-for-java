// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.implementation;

import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.http.rest.SimpleResponse;
import com.azure.core.util.Context;
import com.azure.core.util.logging.ClientLogger;
import com.azure.resourcemanager.machinelearning.fluent.OnlineDeploymentsClient;
import com.azure.resourcemanager.machinelearning.fluent.models.DeploymentLogsInner;
import com.azure.resourcemanager.machinelearning.fluent.models.OnlineDeploymentDataInner;
import com.azure.resourcemanager.machinelearning.fluent.models.SkuResourceInner;
import com.azure.resourcemanager.machinelearning.models.DeploymentLogs;
import com.azure.resourcemanager.machinelearning.models.DeploymentLogsRequest;
import com.azure.resourcemanager.machinelearning.models.OnlineDeploymentData;
import com.azure.resourcemanager.machinelearning.models.OnlineDeployments;
import com.azure.resourcemanager.machinelearning.models.SkuResource;

public final class OnlineDeploymentsImpl implements OnlineDeployments {
    private static final ClientLogger LOGGER = new ClientLogger(OnlineDeploymentsImpl.class);

    private final OnlineDeploymentsClient innerClient;

    private final com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager;

    public OnlineDeploymentsImpl(
        OnlineDeploymentsClient innerClient,
        com.azure.resourcemanager.machinelearning.MachineLearningManager serviceManager) {
        this.innerClient = innerClient;
        this.serviceManager = serviceManager;
    }

    public PagedIterable<OnlineDeploymentData> list(
        String resourceGroupName, String workspaceName, String endpointName) {
        PagedIterable<OnlineDeploymentDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, endpointName);
        return Utils.mapPage(inner, inner1 -> new OnlineDeploymentDataImpl(inner1, this.manager()));
    }

    public PagedIterable<OnlineDeploymentData> list(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String orderBy,
        Integer top,
        String skip,
        Context context) {
        PagedIterable<OnlineDeploymentDataInner> inner =
            this.serviceClient().list(resourceGroupName, workspaceName, endpointName, orderBy, top, skip, context);
        return Utils.mapPage(inner, inner1 -> new OnlineDeploymentDataImpl(inner1, this.manager()));
    }

    public void delete(String resourceGroupName, String workspaceName, String endpointName, String deploymentName) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName, deploymentName);
    }

    public void delete(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context) {
        this.serviceClient().delete(resourceGroupName, workspaceName, endpointName, deploymentName, context);
    }

    public OnlineDeploymentData get(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName) {
        OnlineDeploymentDataInner inner =
            this.serviceClient().get(resourceGroupName, workspaceName, endpointName, deploymentName);
        if (inner != null) {
            return new OnlineDeploymentDataImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<OnlineDeploymentData> getWithResponse(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName, Context context) {
        Response<OnlineDeploymentDataInner> inner =
            this
                .serviceClient()
                .getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new OnlineDeploymentDataImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public DeploymentLogs getLogs(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        DeploymentLogsRequest body) {
        DeploymentLogsInner inner =
            this.serviceClient().getLogs(resourceGroupName, workspaceName, endpointName, deploymentName, body);
        if (inner != null) {
            return new DeploymentLogsImpl(inner, this.manager());
        } else {
            return null;
        }
    }

    public Response<DeploymentLogs> getLogsWithResponse(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        DeploymentLogsRequest body,
        Context context) {
        Response<DeploymentLogsInner> inner =
            this
                .serviceClient()
                .getLogsWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, body, context);
        if (inner != null) {
            return new SimpleResponse<>(
                inner.getRequest(),
                inner.getStatusCode(),
                inner.getHeaders(),
                new DeploymentLogsImpl(inner.getValue(), this.manager()));
        } else {
            return null;
        }
    }

    public PagedIterable<SkuResource> listSkus(
        String resourceGroupName, String workspaceName, String endpointName, String deploymentName) {
        PagedIterable<SkuResourceInner> inner =
            this.serviceClient().listSkus(resourceGroupName, workspaceName, endpointName, deploymentName);
        return Utils.mapPage(inner, inner1 -> new SkuResourceImpl(inner1, this.manager()));
    }

    public PagedIterable<SkuResource> listSkus(
        String resourceGroupName,
        String workspaceName,
        String endpointName,
        String deploymentName,
        Integer count,
        String skip,
        Context context) {
        PagedIterable<SkuResourceInner> inner =
            this
                .serviceClient()
                .listSkus(resourceGroupName, workspaceName, endpointName, deploymentName, count, skip, context);
        return Utils.mapPage(inner, inner1 -> new SkuResourceImpl(inner1, this.manager()));
    }

    public OnlineDeploymentData getById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this
            .getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, Context.NONE)
            .getValue();
    }

    public Response<OnlineDeploymentData> getByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        return this.getWithResponse(resourceGroupName, workspaceName, endpointName, deploymentName, context);
    }

    public void deleteById(String id) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, deploymentName, Context.NONE);
    }

    public void deleteByIdWithResponse(String id, Context context) {
        String resourceGroupName = Utils.getValueFromIdByName(id, "resourceGroups");
        if (resourceGroupName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'resourceGroups'.", id)));
        }
        String workspaceName = Utils.getValueFromIdByName(id, "workspaces");
        if (workspaceName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'workspaces'.", id)));
        }
        String endpointName = Utils.getValueFromIdByName(id, "onlineEndpoints");
        if (endpointName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String
                            .format("The resource ID '%s' is not valid. Missing path segment 'onlineEndpoints'.", id)));
        }
        String deploymentName = Utils.getValueFromIdByName(id, "deployments");
        if (deploymentName == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        String.format("The resource ID '%s' is not valid. Missing path segment 'deployments'.", id)));
        }
        this.delete(resourceGroupName, workspaceName, endpointName, deploymentName, context);
    }

    private OnlineDeploymentsClient serviceClient() {
        return this.innerClient;
    }

    private com.azure.resourcemanager.machinelearning.MachineLearningManager manager() {
        return this.serviceManager;
    }

    public OnlineDeploymentDataImpl define(String name) {
        return new OnlineDeploymentDataImpl(name, this.manager());
    }
}
