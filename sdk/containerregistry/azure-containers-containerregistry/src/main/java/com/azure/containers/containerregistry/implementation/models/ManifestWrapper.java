// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.containers.containerregistry.implementation.models;

import com.azure.containers.containerregistry.models.OciAnnotations;
import com.azure.containers.containerregistry.models.OciBlobDescriptor;
import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Returns the requested manifest file. */
@Fluent
public final class ManifestWrapper extends Manifest {
    /*
     * Media type for this Manifest
     */
    @JsonProperty(value = "mediaType")
    private String mediaType;

    /*
     * (ManifestList, OCIIndex) List of V2 image layer information
     */
    @JsonProperty(value = "manifests")
    private List<ManifestListAttributes> manifests;

    /*
     * (V2, OCI) Image config descriptor
     */
    @JsonProperty(value = "config")
    private OciBlobDescriptor config;

    /*
     * (V2, OCI) List of V2 image layer information
     */
    @JsonProperty(value = "layers")
    private List<OciBlobDescriptor> layers;

    /*
     * (OCI, OCIIndex) Additional metadata
     */
    @JsonProperty(value = "annotations")
    private OciAnnotations annotations;

    /*
     * (V1) CPU architecture
     */
    @JsonProperty(value = "architecture")
    private String architecture;

    /*
     * (V1) Image name
     */
    @JsonProperty(value = "name")
    private String name;

    /*
     * (V1) Image tag
     */
    @JsonProperty(value = "tag")
    private String tag;

    /*
     * (V1) List of layer information
     */
    @JsonProperty(value = "fsLayers")
    private List<FsLayer> fsLayers;

    /*
     * (V1) Image history
     */
    @JsonProperty(value = "history")
    private List<History> history;

    /*
     * (V1) Image signature
     */
    @JsonProperty(value = "signatures")
    private List<ImageSignature> signatures;

    /**
     * Get the mediaType property: Media type for this Manifest.
     *
     * @return the mediaType value.
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * Set the mediaType property: Media type for this Manifest.
     *
     * @param mediaType the mediaType value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }

    /**
     * Get the manifests property: (ManifestList, OCIIndex) List of V2 image layer information.
     *
     * @return the manifests value.
     */
    public List<ManifestListAttributes> getManifests() {
        return this.manifests;
    }

    /**
     * Set the manifests property: (ManifestList, OCIIndex) List of V2 image layer information.
     *
     * @param manifests the manifests value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setManifests(List<ManifestListAttributes> manifests) {
        this.manifests = manifests;
        return this;
    }

    /**
     * Get the config property: (V2, OCI) Image config descriptor.
     *
     * @return the config value.
     */
    public OciBlobDescriptor getConfig() {
        return this.config;
    }

    /**
     * Set the config property: (V2, OCI) Image config descriptor.
     *
     * @param config the config value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setConfig(OciBlobDescriptor config) {
        this.config = config;
        return this;
    }

    /**
     * Get the layers property: (V2, OCI) List of V2 image layer information.
     *
     * @return the layers value.
     */
    public List<OciBlobDescriptor> getLayers() {
        return this.layers;
    }

    /**
     * Set the layers property: (V2, OCI) List of V2 image layer information.
     *
     * @param layers the layers value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setLayers(List<OciBlobDescriptor> layers) {
        this.layers = layers;
        return this;
    }

    /**
     * Get the annotations property: (OCI, OCIIndex) Additional metadata.
     *
     * @return the annotations value.
     */
    public OciAnnotations getAnnotations() {
        return this.annotations;
    }

    /**
     * Set the annotations property: (OCI, OCIIndex) Additional metadata.
     *
     * @param annotations the annotations value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setAnnotations(OciAnnotations annotations) {
        this.annotations = annotations;
        return this;
    }

    /**
     * Get the architecture property: (V1) CPU architecture.
     *
     * @return the architecture value.
     */
    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * Set the architecture property: (V1) CPU architecture.
     *
     * @param architecture the architecture value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * Get the name property: (V1) Image name.
     *
     * @return the name value.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Set the name property: (V1) Image name.
     *
     * @param name the name value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the tag property: (V1) Image tag.
     *
     * @return the tag value.
     */
    public String getTag() {
        return this.tag;
    }

    /**
     * Set the tag property: (V1) Image tag.
     *
     * @param tag the tag value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setTag(String tag) {
        this.tag = tag;
        return this;
    }

    /**
     * Get the fsLayers property: (V1) List of layer information.
     *
     * @return the fsLayers value.
     */
    public List<FsLayer> getFsLayers() {
        return this.fsLayers;
    }

    /**
     * Set the fsLayers property: (V1) List of layer information.
     *
     * @param fsLayers the fsLayers value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setFsLayers(List<FsLayer> fsLayers) {
        this.fsLayers = fsLayers;
        return this;
    }

    /**
     * Get the history property: (V1) Image history.
     *
     * @return the history value.
     */
    public List<History> getHistory() {
        return this.history;
    }

    /**
     * Set the history property: (V1) Image history.
     *
     * @param history the history value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setHistory(List<History> history) {
        this.history = history;
        return this;
    }

    /**
     * Get the signatures property: (V1) Image signature.
     *
     * @return the signatures value.
     */
    public List<ImageSignature> getSignatures() {
        return this.signatures;
    }

    /**
     * Set the signatures property: (V1) Image signature.
     *
     * @param signatures the signatures value to set.
     * @return the ManifestWrapper object itself.
     */
    public ManifestWrapper setSignatures(List<ImageSignature> signatures) {
        this.signatures = signatures;
        return this;
    }
}
