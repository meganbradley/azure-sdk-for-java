// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.share.implementation.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.http.HttpHeaders;
import com.azure.core.util.DateTimeRfc1123;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement;
import java.time.OffsetDateTime;

/** The FilesGetRangeListHeaders model. */
@JacksonXmlRootElement(localName = "null")
@Fluent
public final class FilesGetRangeListHeaders {
    /*
     * The x-ms-version property.
     */
    @JsonProperty(value = "x-ms-version")
    private String xMsVersion;

    /*
     * The ETag property.
     */
    @JsonProperty(value = "ETag")
    private String eTag;

    /*
     * The x-ms-content-length property.
     */
    @JsonProperty(value = "x-ms-content-length")
    private Long xMsContentLength;

    /*
     * The Last-Modified property.
     */
    @JsonProperty(value = "Last-Modified")
    private DateTimeRfc1123 lastModified;

    /*
     * The x-ms-request-id property.
     */
    @JsonProperty(value = "x-ms-request-id")
    private String xMsRequestId;

    /*
     * The Date property.
     */
    @JsonProperty(value = "Date")
    private DateTimeRfc1123 dateProperty;

    // HttpHeaders containing the raw property values.
    /**
     * Creates an instance of FilesGetRangeListHeaders class.
     *
     * @param rawHeaders The raw HttpHeaders that will be used to create the property values.
     */
    public FilesGetRangeListHeaders(HttpHeaders rawHeaders) {
        this.xMsVersion = rawHeaders.getValue("x-ms-version");
        this.eTag = rawHeaders.getValue("ETag");
        if (rawHeaders.getValue("x-ms-content-length") != null) {
            this.xMsContentLength = Long.parseLong(rawHeaders.getValue("x-ms-content-length"));
        }
        if (rawHeaders.getValue("Last-Modified") != null) {
            this.lastModified = new DateTimeRfc1123(rawHeaders.getValue("Last-Modified"));
        }
        this.xMsRequestId = rawHeaders.getValue("x-ms-request-id");
        if (rawHeaders.getValue("Date") != null) {
            this.dateProperty = new DateTimeRfc1123(rawHeaders.getValue("Date"));
        }
    }

    /**
     * Get the xMsVersion property: The x-ms-version property.
     *
     * @return the xMsVersion value.
     */
    public String getXMsVersion() {
        return this.xMsVersion;
    }

    /**
     * Set the xMsVersion property: The x-ms-version property.
     *
     * @param xMsVersion the xMsVersion value to set.
     * @return the FilesGetRangeListHeaders object itself.
     */
    public FilesGetRangeListHeaders setXMsVersion(String xMsVersion) {
        this.xMsVersion = xMsVersion;
        return this;
    }

    /**
     * Get the eTag property: The ETag property.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag property.
     *
     * @param eTag the eTag value to set.
     * @return the FilesGetRangeListHeaders object itself.
     */
    public FilesGetRangeListHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the xMsContentLength property: The x-ms-content-length property.
     *
     * @return the xMsContentLength value.
     */
    public Long getXMsContentLength() {
        return this.xMsContentLength;
    }

    /**
     * Set the xMsContentLength property: The x-ms-content-length property.
     *
     * @param xMsContentLength the xMsContentLength value to set.
     * @return the FilesGetRangeListHeaders object itself.
     */
    public FilesGetRangeListHeaders setXMsContentLength(Long xMsContentLength) {
        this.xMsContentLength = xMsContentLength;
        return this;
    }

    /**
     * Get the lastModified property: The Last-Modified property.
     *
     * @return the lastModified value.
     */
    public OffsetDateTime getLastModified() {
        if (this.lastModified == null) {
            return null;
        }
        return this.lastModified.getDateTime();
    }

    /**
     * Set the lastModified property: The Last-Modified property.
     *
     * @param lastModified the lastModified value to set.
     * @return the FilesGetRangeListHeaders object itself.
     */
    public FilesGetRangeListHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the xMsRequestId property: The x-ms-request-id property.
     *
     * @return the xMsRequestId value.
     */
    public String getXMsRequestId() {
        return this.xMsRequestId;
    }

    /**
     * Set the xMsRequestId property: The x-ms-request-id property.
     *
     * @param xMsRequestId the xMsRequestId value to set.
     * @return the FilesGetRangeListHeaders object itself.
     */
    public FilesGetRangeListHeaders setXMsRequestId(String xMsRequestId) {
        this.xMsRequestId = xMsRequestId;
        return this;
    }

    /**
     * Get the dateProperty property: The Date property.
     *
     * @return the dateProperty value.
     */
    public OffsetDateTime getDateProperty() {
        if (this.dateProperty == null) {
            return null;
        }
        return this.dateProperty.getDateTime();
    }

    /**
     * Set the dateProperty property: The Date property.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FilesGetRangeListHeaders object itself.
     */
    public FilesGetRangeListHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }
}
