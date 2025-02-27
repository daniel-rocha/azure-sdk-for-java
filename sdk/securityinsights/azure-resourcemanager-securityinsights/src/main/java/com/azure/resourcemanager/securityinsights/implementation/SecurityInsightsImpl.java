// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.implementation;

import com.azure.core.annotation.ServiceClient;
import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpPipeline;
import com.azure.core.http.HttpResponse;
import com.azure.core.http.rest.Response;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.exception.ManagementError;
import com.azure.core.management.exception.ManagementException;
import com.azure.core.management.polling.PollResult;
import com.azure.core.management.polling.PollerFactory;
import com.azure.core.util.Context;
import com.azure.core.util.CoreUtils;
import com.azure.core.util.logging.ClientLogger;
import com.azure.core.util.polling.AsyncPollResponse;
import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.serializer.SerializerAdapter;
import com.azure.core.util.serializer.SerializerEncoding;
import com.azure.resourcemanager.securityinsights.fluent.ActionsClient;
import com.azure.resourcemanager.securityinsights.fluent.AlertRuleTemplatesClient;
import com.azure.resourcemanager.securityinsights.fluent.AlertRulesClient;
import com.azure.resourcemanager.securityinsights.fluent.AutomationRulesClient;
import com.azure.resourcemanager.securityinsights.fluent.BookmarkOperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.BookmarkRelationsClient;
import com.azure.resourcemanager.securityinsights.fluent.BookmarksClient;
import com.azure.resourcemanager.securityinsights.fluent.DataConnectorsCheckRequirementsOperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.DataConnectorsClient;
import com.azure.resourcemanager.securityinsights.fluent.DomainWhoisClient;
import com.azure.resourcemanager.securityinsights.fluent.EntitiesClient;
import com.azure.resourcemanager.securityinsights.fluent.EntitiesGetTimelinesClient;
import com.azure.resourcemanager.securityinsights.fluent.EntitiesRelationsClient;
import com.azure.resourcemanager.securityinsights.fluent.EntityQueriesClient;
import com.azure.resourcemanager.securityinsights.fluent.EntityQueryTemplatesClient;
import com.azure.resourcemanager.securityinsights.fluent.EntityRelationsClient;
import com.azure.resourcemanager.securityinsights.fluent.IncidentCommentsClient;
import com.azure.resourcemanager.securityinsights.fluent.IncidentRelationsClient;
import com.azure.resourcemanager.securityinsights.fluent.IncidentsClient;
import com.azure.resourcemanager.securityinsights.fluent.IpGeodatasClient;
import com.azure.resourcemanager.securityinsights.fluent.MetadatasClient;
import com.azure.resourcemanager.securityinsights.fluent.OfficeConsentsClient;
import com.azure.resourcemanager.securityinsights.fluent.OperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.ProductSettingsClient;
import com.azure.resourcemanager.securityinsights.fluent.SecurityInsights;
import com.azure.resourcemanager.securityinsights.fluent.SentinelOnboardingStatesClient;
import com.azure.resourcemanager.securityinsights.fluent.SourceControlsClient;
import com.azure.resourcemanager.securityinsights.fluent.SourceControlsOperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.ThreatIntelligenceIndicatorMetricsClient;
import com.azure.resourcemanager.securityinsights.fluent.ThreatIntelligenceIndicatorsClient;
import com.azure.resourcemanager.securityinsights.fluent.ThreatIntelligenceIndicatorsOperationsClient;
import com.azure.resourcemanager.securityinsights.fluent.WatchlistItemsClient;
import com.azure.resourcemanager.securityinsights.fluent.WatchlistsClient;
import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** Initializes a new instance of the SecurityInsightsImpl type. */
@ServiceClient(builder = SecurityInsightsBuilder.class)
public final class SecurityInsightsImpl implements SecurityInsights {
    /** The ID of the target subscription. */
    private final String subscriptionId;

    /**
     * Gets The ID of the target subscription.
     *
     * @return the subscriptionId value.
     */
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    /** server parameter. */
    private final String endpoint;

    /**
     * Gets server parameter.
     *
     * @return the endpoint value.
     */
    public String getEndpoint() {
        return this.endpoint;
    }

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
    SerializerAdapter getSerializerAdapter() {
        return this.serializerAdapter;
    }

    /** The default poll interval for long-running operation. */
    private final Duration defaultPollInterval;

    /**
     * Gets The default poll interval for long-running operation.
     *
     * @return the defaultPollInterval value.
     */
    public Duration getDefaultPollInterval() {
        return this.defaultPollInterval;
    }

    /** The AlertRulesClient object to access its operations. */
    private final AlertRulesClient alertRules;

    /**
     * Gets the AlertRulesClient object to access its operations.
     *
     * @return the AlertRulesClient object.
     */
    public AlertRulesClient getAlertRules() {
        return this.alertRules;
    }

    /** The ActionsClient object to access its operations. */
    private final ActionsClient actions;

    /**
     * Gets the ActionsClient object to access its operations.
     *
     * @return the ActionsClient object.
     */
    public ActionsClient getActions() {
        return this.actions;
    }

    /** The AlertRuleTemplatesClient object to access its operations. */
    private final AlertRuleTemplatesClient alertRuleTemplates;

    /**
     * Gets the AlertRuleTemplatesClient object to access its operations.
     *
     * @return the AlertRuleTemplatesClient object.
     */
    public AlertRuleTemplatesClient getAlertRuleTemplates() {
        return this.alertRuleTemplates;
    }

    /** The AutomationRulesClient object to access its operations. */
    private final AutomationRulesClient automationRules;

    /**
     * Gets the AutomationRulesClient object to access its operations.
     *
     * @return the AutomationRulesClient object.
     */
    public AutomationRulesClient getAutomationRules() {
        return this.automationRules;
    }

    /** The IncidentsClient object to access its operations. */
    private final IncidentsClient incidents;

    /**
     * Gets the IncidentsClient object to access its operations.
     *
     * @return the IncidentsClient object.
     */
    public IncidentsClient getIncidents() {
        return this.incidents;
    }

    /** The BookmarksClient object to access its operations. */
    private final BookmarksClient bookmarks;

    /**
     * Gets the BookmarksClient object to access its operations.
     *
     * @return the BookmarksClient object.
     */
    public BookmarksClient getBookmarks() {
        return this.bookmarks;
    }

    /** The BookmarkRelationsClient object to access its operations. */
    private final BookmarkRelationsClient bookmarkRelations;

    /**
     * Gets the BookmarkRelationsClient object to access its operations.
     *
     * @return the BookmarkRelationsClient object.
     */
    public BookmarkRelationsClient getBookmarkRelations() {
        return this.bookmarkRelations;
    }

    /** The BookmarkOperationsClient object to access its operations. */
    private final BookmarkOperationsClient bookmarkOperations;

    /**
     * Gets the BookmarkOperationsClient object to access its operations.
     *
     * @return the BookmarkOperationsClient object.
     */
    public BookmarkOperationsClient getBookmarkOperations() {
        return this.bookmarkOperations;
    }

    /** The IpGeodatasClient object to access its operations. */
    private final IpGeodatasClient ipGeodatas;

    /**
     * Gets the IpGeodatasClient object to access its operations.
     *
     * @return the IpGeodatasClient object.
     */
    public IpGeodatasClient getIpGeodatas() {
        return this.ipGeodatas;
    }

    /** The DomainWhoisClient object to access its operations. */
    private final DomainWhoisClient domainWhois;

    /**
     * Gets the DomainWhoisClient object to access its operations.
     *
     * @return the DomainWhoisClient object.
     */
    public DomainWhoisClient getDomainWhois() {
        return this.domainWhois;
    }

    /** The EntitiesClient object to access its operations. */
    private final EntitiesClient entities;

    /**
     * Gets the EntitiesClient object to access its operations.
     *
     * @return the EntitiesClient object.
     */
    public EntitiesClient getEntities() {
        return this.entities;
    }

    /** The EntitiesGetTimelinesClient object to access its operations. */
    private final EntitiesGetTimelinesClient entitiesGetTimelines;

    /**
     * Gets the EntitiesGetTimelinesClient object to access its operations.
     *
     * @return the EntitiesGetTimelinesClient object.
     */
    public EntitiesGetTimelinesClient getEntitiesGetTimelines() {
        return this.entitiesGetTimelines;
    }

    /** The EntitiesRelationsClient object to access its operations. */
    private final EntitiesRelationsClient entitiesRelations;

    /**
     * Gets the EntitiesRelationsClient object to access its operations.
     *
     * @return the EntitiesRelationsClient object.
     */
    public EntitiesRelationsClient getEntitiesRelations() {
        return this.entitiesRelations;
    }

    /** The EntityRelationsClient object to access its operations. */
    private final EntityRelationsClient entityRelations;

    /**
     * Gets the EntityRelationsClient object to access its operations.
     *
     * @return the EntityRelationsClient object.
     */
    public EntityRelationsClient getEntityRelations() {
        return this.entityRelations;
    }

    /** The EntityQueriesClient object to access its operations. */
    private final EntityQueriesClient entityQueries;

    /**
     * Gets the EntityQueriesClient object to access its operations.
     *
     * @return the EntityQueriesClient object.
     */
    public EntityQueriesClient getEntityQueries() {
        return this.entityQueries;
    }

    /** The EntityQueryTemplatesClient object to access its operations. */
    private final EntityQueryTemplatesClient entityQueryTemplates;

    /**
     * Gets the EntityQueryTemplatesClient object to access its operations.
     *
     * @return the EntityQueryTemplatesClient object.
     */
    public EntityQueryTemplatesClient getEntityQueryTemplates() {
        return this.entityQueryTemplates;
    }

    /** The IncidentCommentsClient object to access its operations. */
    private final IncidentCommentsClient incidentComments;

    /**
     * Gets the IncidentCommentsClient object to access its operations.
     *
     * @return the IncidentCommentsClient object.
     */
    public IncidentCommentsClient getIncidentComments() {
        return this.incidentComments;
    }

    /** The IncidentRelationsClient object to access its operations. */
    private final IncidentRelationsClient incidentRelations;

    /**
     * Gets the IncidentRelationsClient object to access its operations.
     *
     * @return the IncidentRelationsClient object.
     */
    public IncidentRelationsClient getIncidentRelations() {
        return this.incidentRelations;
    }

    /** The MetadatasClient object to access its operations. */
    private final MetadatasClient metadatas;

    /**
     * Gets the MetadatasClient object to access its operations.
     *
     * @return the MetadatasClient object.
     */
    public MetadatasClient getMetadatas() {
        return this.metadatas;
    }

    /** The OfficeConsentsClient object to access its operations. */
    private final OfficeConsentsClient officeConsents;

    /**
     * Gets the OfficeConsentsClient object to access its operations.
     *
     * @return the OfficeConsentsClient object.
     */
    public OfficeConsentsClient getOfficeConsents() {
        return this.officeConsents;
    }

    /** The SentinelOnboardingStatesClient object to access its operations. */
    private final SentinelOnboardingStatesClient sentinelOnboardingStates;

    /**
     * Gets the SentinelOnboardingStatesClient object to access its operations.
     *
     * @return the SentinelOnboardingStatesClient object.
     */
    public SentinelOnboardingStatesClient getSentinelOnboardingStates() {
        return this.sentinelOnboardingStates;
    }

    /** The ProductSettingsClient object to access its operations. */
    private final ProductSettingsClient productSettings;

    /**
     * Gets the ProductSettingsClient object to access its operations.
     *
     * @return the ProductSettingsClient object.
     */
    public ProductSettingsClient getProductSettings() {
        return this.productSettings;
    }

    /** The SourceControlsClient object to access its operations. */
    private final SourceControlsClient sourceControls;

    /**
     * Gets the SourceControlsClient object to access its operations.
     *
     * @return the SourceControlsClient object.
     */
    public SourceControlsClient getSourceControls() {
        return this.sourceControls;
    }

    /** The SourceControlsOperationsClient object to access its operations. */
    private final SourceControlsOperationsClient sourceControlsOperations;

    /**
     * Gets the SourceControlsOperationsClient object to access its operations.
     *
     * @return the SourceControlsOperationsClient object.
     */
    public SourceControlsOperationsClient getSourceControlsOperations() {
        return this.sourceControlsOperations;
    }

    /** The ThreatIntelligenceIndicatorsClient object to access its operations. */
    private final ThreatIntelligenceIndicatorsClient threatIntelligenceIndicators;

    /**
     * Gets the ThreatIntelligenceIndicatorsClient object to access its operations.
     *
     * @return the ThreatIntelligenceIndicatorsClient object.
     */
    public ThreatIntelligenceIndicatorsClient getThreatIntelligenceIndicators() {
        return this.threatIntelligenceIndicators;
    }

    /** The ThreatIntelligenceIndicatorsOperationsClient object to access its operations. */
    private final ThreatIntelligenceIndicatorsOperationsClient threatIntelligenceIndicatorsOperations;

    /**
     * Gets the ThreatIntelligenceIndicatorsOperationsClient object to access its operations.
     *
     * @return the ThreatIntelligenceIndicatorsOperationsClient object.
     */
    public ThreatIntelligenceIndicatorsOperationsClient getThreatIntelligenceIndicatorsOperations() {
        return this.threatIntelligenceIndicatorsOperations;
    }

    /** The ThreatIntelligenceIndicatorMetricsClient object to access its operations. */
    private final ThreatIntelligenceIndicatorMetricsClient threatIntelligenceIndicatorMetrics;

    /**
     * Gets the ThreatIntelligenceIndicatorMetricsClient object to access its operations.
     *
     * @return the ThreatIntelligenceIndicatorMetricsClient object.
     */
    public ThreatIntelligenceIndicatorMetricsClient getThreatIntelligenceIndicatorMetrics() {
        return this.threatIntelligenceIndicatorMetrics;
    }

    /** The WatchlistsClient object to access its operations. */
    private final WatchlistsClient watchlists;

    /**
     * Gets the WatchlistsClient object to access its operations.
     *
     * @return the WatchlistsClient object.
     */
    public WatchlistsClient getWatchlists() {
        return this.watchlists;
    }

    /** The WatchlistItemsClient object to access its operations. */
    private final WatchlistItemsClient watchlistItems;

    /**
     * Gets the WatchlistItemsClient object to access its operations.
     *
     * @return the WatchlistItemsClient object.
     */
    public WatchlistItemsClient getWatchlistItems() {
        return this.watchlistItems;
    }

    /** The DataConnectorsClient object to access its operations. */
    private final DataConnectorsClient dataConnectors;

    /**
     * Gets the DataConnectorsClient object to access its operations.
     *
     * @return the DataConnectorsClient object.
     */
    public DataConnectorsClient getDataConnectors() {
        return this.dataConnectors;
    }

    /** The DataConnectorsCheckRequirementsOperationsClient object to access its operations. */
    private final DataConnectorsCheckRequirementsOperationsClient dataConnectorsCheckRequirementsOperations;

    /**
     * Gets the DataConnectorsCheckRequirementsOperationsClient object to access its operations.
     *
     * @return the DataConnectorsCheckRequirementsOperationsClient object.
     */
    public DataConnectorsCheckRequirementsOperationsClient getDataConnectorsCheckRequirementsOperations() {
        return this.dataConnectorsCheckRequirementsOperations;
    }

    /** The OperationsClient object to access its operations. */
    private final OperationsClient operations;

    /**
     * Gets the OperationsClient object to access its operations.
     *
     * @return the OperationsClient object.
     */
    public OperationsClient getOperations() {
        return this.operations;
    }

    /**
     * Initializes an instance of SecurityInsights client.
     *
     * @param httpPipeline The HTTP pipeline to send requests through.
     * @param serializerAdapter The serializer to serialize an object into a string.
     * @param defaultPollInterval The default poll interval for long-running operation.
     * @param environment The Azure environment.
     * @param subscriptionId The ID of the target subscription.
     * @param endpoint server parameter.
     */
    SecurityInsightsImpl(
        HttpPipeline httpPipeline,
        SerializerAdapter serializerAdapter,
        Duration defaultPollInterval,
        AzureEnvironment environment,
        String subscriptionId,
        String endpoint) {
        this.httpPipeline = httpPipeline;
        this.serializerAdapter = serializerAdapter;
        this.defaultPollInterval = defaultPollInterval;
        this.subscriptionId = subscriptionId;
        this.endpoint = endpoint;
        this.apiVersion = "2022-01-01-preview";
        this.alertRules = new AlertRulesClientImpl(this);
        this.actions = new ActionsClientImpl(this);
        this.alertRuleTemplates = new AlertRuleTemplatesClientImpl(this);
        this.automationRules = new AutomationRulesClientImpl(this);
        this.incidents = new IncidentsClientImpl(this);
        this.bookmarks = new BookmarksClientImpl(this);
        this.bookmarkRelations = new BookmarkRelationsClientImpl(this);
        this.bookmarkOperations = new BookmarkOperationsClientImpl(this);
        this.ipGeodatas = new IpGeodatasClientImpl(this);
        this.domainWhois = new DomainWhoisClientImpl(this);
        this.entities = new EntitiesClientImpl(this);
        this.entitiesGetTimelines = new EntitiesGetTimelinesClientImpl(this);
        this.entitiesRelations = new EntitiesRelationsClientImpl(this);
        this.entityRelations = new EntityRelationsClientImpl(this);
        this.entityQueries = new EntityQueriesClientImpl(this);
        this.entityQueryTemplates = new EntityQueryTemplatesClientImpl(this);
        this.incidentComments = new IncidentCommentsClientImpl(this);
        this.incidentRelations = new IncidentRelationsClientImpl(this);
        this.metadatas = new MetadatasClientImpl(this);
        this.officeConsents = new OfficeConsentsClientImpl(this);
        this.sentinelOnboardingStates = new SentinelOnboardingStatesClientImpl(this);
        this.productSettings = new ProductSettingsClientImpl(this);
        this.sourceControls = new SourceControlsClientImpl(this);
        this.sourceControlsOperations = new SourceControlsOperationsClientImpl(this);
        this.threatIntelligenceIndicators = new ThreatIntelligenceIndicatorsClientImpl(this);
        this.threatIntelligenceIndicatorsOperations = new ThreatIntelligenceIndicatorsOperationsClientImpl(this);
        this.threatIntelligenceIndicatorMetrics = new ThreatIntelligenceIndicatorMetricsClientImpl(this);
        this.watchlists = new WatchlistsClientImpl(this);
        this.watchlistItems = new WatchlistItemsClientImpl(this);
        this.dataConnectors = new DataConnectorsClientImpl(this);
        this.dataConnectorsCheckRequirementsOperations = new DataConnectorsCheckRequirementsOperationsClientImpl(this);
        this.operations = new OperationsClientImpl(this);
    }

    /**
     * Gets default client context.
     *
     * @return the default client context.
     */
    public Context getContext() {
        return Context.NONE;
    }

    /**
     * Merges default client context with provided context.
     *
     * @param context the context to be merged with default client context.
     * @return the merged context.
     */
    public Context mergeContext(Context context) {
        return CoreUtils.mergeContexts(this.getContext(), context);
    }

    /**
     * Gets long running operation result.
     *
     * @param activationResponse the response of activation operation.
     * @param httpPipeline the http pipeline.
     * @param pollResultType type of poll result.
     * @param finalResultType type of final result.
     * @param context the context shared by all requests.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return poller flux for poll result and final result.
     */
    public <T, U> PollerFlux<PollResult<T>, U> getLroResult(
        Mono<Response<Flux<ByteBuffer>>> activationResponse,
        HttpPipeline httpPipeline,
        Type pollResultType,
        Type finalResultType,
        Context context) {
        return PollerFactory
            .create(
                serializerAdapter,
                httpPipeline,
                pollResultType,
                finalResultType,
                defaultPollInterval,
                activationResponse,
                context);
    }

    /**
     * Gets the final result, or an error, based on last async poll response.
     *
     * @param response the last async poll response.
     * @param <T> type of poll result.
     * @param <U> type of final result.
     * @return the final result, or an error.
     */
    public <T, U> Mono<U> getLroFinalResultOrError(AsyncPollResponse<PollResult<T>, U> response) {
        if (response.getStatus() != LongRunningOperationStatus.SUCCESSFULLY_COMPLETED) {
            String errorMessage;
            ManagementError managementError = null;
            HttpResponse errorResponse = null;
            PollResult.Error lroError = response.getValue().getError();
            if (lroError != null) {
                errorResponse =
                    new HttpResponseImpl(
                        lroError.getResponseStatusCode(), lroError.getResponseHeaders(), lroError.getResponseBody());

                errorMessage = response.getValue().getError().getMessage();
                String errorBody = response.getValue().getError().getResponseBody();
                if (errorBody != null) {
                    // try to deserialize error body to ManagementError
                    try {
                        managementError =
                            this
                                .getSerializerAdapter()
                                .deserialize(errorBody, ManagementError.class, SerializerEncoding.JSON);
                        if (managementError.getCode() == null || managementError.getMessage() == null) {
                            managementError = null;
                        }
                    } catch (IOException | RuntimeException ioe) {
                        LOGGER.logThrowableAsWarning(ioe);
                    }
                }
            } else {
                // fallback to default error message
                errorMessage = "Long running operation failed.";
            }
            if (managementError == null) {
                // fallback to default ManagementError
                managementError = new ManagementError(response.getStatus().toString(), errorMessage);
            }
            return Mono.error(new ManagementException(errorMessage, errorResponse, managementError));
        } else {
            return response.getFinalResult();
        }
    }

    private static final class HttpResponseImpl extends HttpResponse {
        private final int statusCode;

        private final byte[] responseBody;

        private final HttpHeaders httpHeaders;

        HttpResponseImpl(int statusCode, HttpHeaders httpHeaders, String responseBody) {
            super(null);
            this.statusCode = statusCode;
            this.httpHeaders = httpHeaders;
            this.responseBody = responseBody == null ? null : responseBody.getBytes(StandardCharsets.UTF_8);
        }

        public int getStatusCode() {
            return statusCode;
        }

        public String getHeaderValue(String s) {
            return httpHeaders.getValue(s);
        }

        public HttpHeaders getHeaders() {
            return httpHeaders;
        }

        public Flux<ByteBuffer> getBody() {
            return Flux.just(ByteBuffer.wrap(responseBody));
        }

        public Mono<byte[]> getBodyAsByteArray() {
            return Mono.just(responseBody);
        }

        public Mono<String> getBodyAsString() {
            return Mono.just(new String(responseBody, StandardCharsets.UTF_8));
        }

        public Mono<String> getBodyAsString(Charset charset) {
            return Mono.just(new String(responseBody, charset));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(SecurityInsightsImpl.class);
}
