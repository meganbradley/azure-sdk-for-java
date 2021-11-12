// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.blob.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlText;

/** The BlobName model. */
@JacksonXmlRootElement(localName = "BlobName")
@Fluent
public final class BlobName {
    /*
     * Indicates if the blob name is encoded.
     */
    @JacksonXmlProperty(localName = "Encoded", isAttribute = true)
    private Boolean encoded;

    /*
     * The name of the blob.
     */
    @JacksonXmlText
    private String content;

    /**
     * Get the encoded property: Indicates if the blob name is encoded.
     *
     * @return the encoded value.
     */
    public Boolean isEncoded() {
        return this.encoded;
    }

    /**
     * Set the encoded property: Indicates if the blob name is encoded.
     *
     * @param encoded the encoded value to set.
     * @return the BlobName object itself.
     */
    public BlobName setEncoded(Boolean encoded) {
        this.encoded = encoded;
        return this;
    }

    /**
     * Get the content property: The name of the blob.
     *
     * @return the content value.
     */
    public String getContent() {
        return this.content;
    }

    /**
     * Set the content property: The name of the blob.
     *
     * @param content the content value to set.
     * @return the BlobName object itself.
     */
    public BlobName setContent(String content) {
        this.content = content;
        return this;
    }
}
