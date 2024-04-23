// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.storage.file.datalake.models;

import com.azure.core.util.CoreUtils;
import com.azure.core.util.DateTimeRfc1123;
import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Defines headers for Read operation.
 */
public final class FileReadHeaders {

    private DateTimeRfc1123 lastModified;
    private Map<String, String> metadata;
    private Long contentLength;
    private String contentType;
    private String contentRange;
    private String eTag;
    private byte[] contentMd5;
    private String contentEncoding;
    private String cacheControl;
    private String contentDisposition;
    private String contentLanguage;
    private DateTimeRfc1123 copyCompletionTime;
    private String copyStatusDescription;
    private String copyId;
    private String copyProgress;
    private String copySource;
    private CopyStatusType copyStatus;
    private LeaseDurationType leaseDuration;
    private LeaseStateType leaseState;
    private LeaseStatusType leaseStatus;
    private String clientRequestId;
    private String requestId;
    private String version;
    private String acceptRanges;
    private DateTimeRfc1123 dateProperty;
    private Boolean serverEncrypted;
    private String encryptionKeySha256;
    private byte[] fileContentMD5;
    private byte[] contentCrc64;
    private String errorCode;
    private OffsetDateTime creationTime;
    private String encryptionContext;

    /**
     * Get the lastModified property: Returns the date and time the container
     * was last modified. Any operation that modifies the file, including an
     * update of the file's metadata or properties, changes the last-modified
     * time of the file.
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
     * Set the lastModified property: Returns the date and time the container
     * was last modified. Any operation that modifies the file, including an
     * update of the file's metadata or properties, changes the last-modified
     * time of the file.
     *
     * @param lastModified the lastModified value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setLastModified(OffsetDateTime lastModified) {
        if (lastModified == null) {
            this.lastModified = null;
        } else {
            this.lastModified = new DateTimeRfc1123(lastModified);
        }
        return this;
    }

    /**
     * Get the metadata property: The metadata property.
     *
     * @return the metadata value.
     */
    public Map<String, String> getMetadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: The metadata property.
     *
     * @param metadata the metadata value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the contentLength property: The number of bytes present in the
     * response body.
     *
     * @return the contentLength value.
     */
    public Long getContentLength() {
        return this.contentLength;
    }

    /**
     * Set the contentLength property: The number of bytes present in the
     * response body.
     *
     * @param contentLength the contentLength value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentLength(Long contentLength) {
        this.contentLength = contentLength;
        return this;
    }

    /**
     * Get the contentType property: The media type of the body of the
     * response. For Download Blob this is 'application/octet-stream'.
     *
     * @return the contentType value.
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * Set the contentType property: The media type of the body of the
     * response. For Download Blob this is 'application/octet-stream'.
     *
     * @param contentType the contentType value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the file by setting the
     * 'Range' request header.
     *
     * @return the contentRange value.
     */
    public String getContentRange() {
        return this.contentRange;
    }

    /**
     * Set the contentRange property: Indicates the range of bytes returned in
     * the event that the client requested a subset of the file by setting the
     * 'Range' request header.
     *
     * @param contentRange the contentRange value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentRange(String contentRange) {
        this.contentRange = contentRange;
        return this;
    }

    /**
     * Get the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally. If the request version is 2011-08-18
     * or newer, the ETag value will be in quotes.
     *
     * @return the eTag value.
     */
    public String getETag() {
        return this.eTag;
    }

    /**
     * Set the eTag property: The ETag contains a value that you can use to
     * perform operations conditionally. If the request version is 2011-08-18
     * or newer, the ETag value will be in quotes.
     *
     * @param eTag the eTag value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setETag(String eTag) {
        this.eTag = eTag;
        return this;
    }

    /**
     * Get the contentMd5 property: If the file has an MD5 hash and this
     * operation is to read the full file, this response header is returned so
     * that the client can check for message content integrity.
     *
     * @return the contentMd5 value.
     */
    public byte[] getContentMd5() {
        return CoreUtils.clone(this.contentMd5);
    }

    /**
     * Set the contentMd5 property: If the file has an MD5 hash and this
     * operation is to read the full file, this response header is returned so
     * that the client can check for message content integrity.
     *
     * @param contentMd5 the contentMd5 value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentMd5(byte[] contentMd5) {
        this.contentMd5 = CoreUtils.clone(contentMd5);
        return this;
    }

    /**
     * Get the contentEncoding property: This header returns the value that was
     * specified for the Content-Encoding request header.
     *
     * @return the contentEncoding value.
     */
    public String getContentEncoding() {
        return this.contentEncoding;
    }

    /**
     * Set the contentEncoding property: This header returns the value that was
     * specified for the Content-Encoding request header.
     *
     * @param contentEncoding the contentEncoding value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentEncoding(String contentEncoding) {
        this.contentEncoding = contentEncoding;
        return this;
    }

    /**
     * Get the cacheControl property: This header is returned if it was
     * previously specified for the file.
     *
     * @return the cacheControl value.
     */
    public String getCacheControl() {
        return this.cacheControl;
    }

    /**
     * Set the cacheControl property: This header is returned if it was
     * previously specified for the file.
     *
     * @param cacheControl the cacheControl value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
        return this;
    }

    /**
     * Get the contentDisposition property: This header returns the value that
     * was specified for the 'x-ms-blob-content-disposition' header. The
     * Content-Disposition response header field conveys additional information
     * about how to process the response payload, and also can be used to
     * attach additional metadata. For example, if set to attachment, it
     * indicates that the user-agent should not display the response, but
     * instead show a Save As dialog with a filename other than the file name
     * specified.
     *
     * @return the contentDisposition value.
     */
    public String getContentDisposition() {
        return this.contentDisposition;
    }

    /**
     * Set the contentDisposition property: This header returns the value that
     * was specified for the 'x-ms-blob-content-disposition' header. The
     * Content-Disposition response header field conveys additional information
     * about how to process the response payload, and also can be used to
     * attach additional metadata. For example, if set to attachment, it
     * indicates that the user-agent should not display the response, but
     * instead show a Save As dialog with a filename other than the file name
     * specified.
     *
     * @param contentDisposition the contentDisposition value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentDisposition(String contentDisposition) {
        this.contentDisposition = contentDisposition;
        return this;
    }

    /**
     * Get the contentLanguage property: This header returns the value that was
     * specified for the Content-Language request header.
     *
     * @return the contentLanguage value.
     */
    public String getContentLanguage() {
        return this.contentLanguage;
    }

    /**
     * Set the contentLanguage property: This header returns the value that was
     * specified for the Content-Language request header.
     *
     * @param contentLanguage the contentLanguage value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentLanguage(String contentLanguage) {
        this.contentLanguage = contentLanguage;
        return this;
    }

    /**
     * Get the copyCompletionTime property: Conclusion time of the last
     * attempted Copy Blob operation where this file was the destination file.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt. This header does not appear if a copy is pending, if this file
     * has never been the destination in a Copy Blob operation, or if this file
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @return the copyCompletionTime value.
     */
    public OffsetDateTime getCopyCompletionTime() {
        if (this.copyCompletionTime == null) {
            return null;
        }
        return this.copyCompletionTime.getDateTime();
    }

    /**
     * Set the copyCompletionTime property: Conclusion time of the last
     * attempted Copy Blob operation where this file was the destination file.
     * This value can specify the time of a completed, aborted, or failed copy
     * attempt. This header does not appear if a copy is pending, if this file
     * has never been the destination in a Copy Blob operation, or if this file
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @param copyCompletionTime the copyCompletionTime value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCopyCompletionTime(OffsetDateTime copyCompletionTime) {
        if (copyCompletionTime == null) {
            this.copyCompletionTime = null;
        } else {
            this.copyCompletionTime = new DateTimeRfc1123(copyCompletionTime);
        }
        return this;
    }

    /**
     * Get the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes the cause of the last
     * fatal or non-fatal copy operation failure. This header does not appear
     * if this file has never been the destination in a Copy Blob operation, or
     * if this file has been modified after a concluded Copy Blob operation
     * using Set Blob Properties, Put Blob, or Put Block List.
     *
     * @return the copyStatusDescription value.
     */
    public String getCopyStatusDescription() {
        return this.copyStatusDescription;
    }

    /**
     * Set the copyStatusDescription property: Only appears when
     * x-ms-copy-status is failed or pending. Describes the cause of the last
     * fatal or non-fatal copy operation failure. This header does not appear
     * if this file has never been the destination in a Copy Blob operation, or
     * if this file has been modified after a concluded Copy Blob operation
     * using Set Blob Properties, Put Blob, or Put Block List.
     *
     * @param copyStatusDescription the copyStatusDescription value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCopyStatusDescription(String copyStatusDescription) {
        this.copyStatusDescription = copyStatusDescription;
        return this;
    }

    /**
     * Get the copyId property: String identifier for this copy operation. Use
     * with Get Blob Properties to check the status of this copy operation, or
     * pass to Abort Copy Blob to abort a pending copy.
     *
     * @return the copyId value.
     */
    public String getCopyId() {
        return this.copyId;
    }

    /**
     * Set the copyId property: String identifier for this copy operation. Use
     * with Get Blob Properties to check the status of this copy operation, or
     * pass to Abort Copy Blob to abort a pending copy.
     *
     * @param copyId the copyId value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCopyId(String copyId) {
        this.copyId = copyId;
        return this;
    }

    /**
     * Get the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy Blob operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied. This header does not appear if this file
     * has never been the destination in a Copy Blob operation, or if this file
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @return the copyProgress value.
     */
    public String getCopyProgress() {
        return this.copyProgress;
    }

    /**
     * Set the copyProgress property: Contains the number of bytes copied and
     * the total bytes in the source in the last attempted Copy Blob operation
     * where this file was the destination file. Can show between 0 and
     * Content-Length bytes copied. This header does not appear if this file
     * has never been the destination in a Copy Blob operation, or if this file
     * has been modified after a concluded Copy Blob operation using Set Blob
     * Properties, Put Blob, or Put Block List.
     *
     * @param copyProgress the copyProgress value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCopyProgress(String copyProgress) {
        this.copyProgress = copyProgress;
        return this;
    }

    /**
     * Get the copySource property: URL up to 2 KB in length that specifies the
     * source file or file used in the last attempted Copy Blob operation where
     * this file was the destination file. This header does not appear if this
     * file has never been the destination in a Copy Blob operation, or if this
     * file has been modified after a concluded Copy Blob operation using Set
     * Blob Properties, Put Blob, or Put Block List.
     *
     * @return the copySource value.
     */
    public String getCopySource() {
        return this.copySource;
    }

    /**
     * Set the copySource property: URL up to 2 KB in length that specifies the
     * source file or file used in the last attempted Copy Blob operation where
     * this file was the destination file. This header does not appear if this
     * file has never been the destination in a Copy Blob operation, or if this
     * file has been modified after a concluded Copy Blob operation using Set
     * Blob Properties, Put Blob, or Put Block List.
     *
     * @param copySource the copySource value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCopySource(String copySource) {
        this.copySource = copySource;
        return this;
    }

    /**
     * Get the copyStatus property: State of the copy operation identified by
     * x-ms-copy-id. Possible values include: 'pending', 'success', 'aborted',
     * 'failed'.
     *
     * @return the copyStatus value.
     */
    public CopyStatusType getCopyStatus() {
        return this.copyStatus;
    }

    /**
     * Set the copyStatus property: State of the copy operation identified by
     * x-ms-copy-id. Possible values include: 'pending', 'success', 'aborted',
     * 'failed'.
     *
     * @param copyStatus the copyStatus value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCopyStatus(CopyStatusType copyStatus) {
        this.copyStatus = copyStatus;
        return this;
    }

    /**
     * Get the leaseDuration property: When a file is leased, specifies whether
     * the lease is of infinite or fixed duration. Possible values include:
     * 'infinite', 'fixed'.
     *
     * @return the leaseDuration value.
     */
    public LeaseDurationType getLeaseDuration() {
        return this.leaseDuration;
    }

    /**
     * Set the leaseDuration property: When a file is leased, specifies whether
     * the lease is of infinite or fixed duration. Possible values include:
     * 'infinite', 'fixed'.
     *
     * @param leaseDuration the leaseDuration value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setLeaseDuration(LeaseDurationType leaseDuration) {
        this.leaseDuration = leaseDuration;
        return this;
    }

    /**
     * Get the leaseState property: Lease state of the file. Possible values
     * include: 'available', 'leased', 'expired', 'breaking', 'broken'.
     *
     * @return the leaseState value.
     */
    public LeaseStateType getLeaseState() {
        return this.leaseState;
    }

    /**
     * Set the leaseState property: Lease state of the file. Possible values
     * include: 'available', 'leased', 'expired', 'breaking', 'broken'.
     *
     * @param leaseState the leaseState value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setLeaseState(LeaseStateType leaseState) {
        this.leaseState = leaseState;
        return this;
    }

    /**
     * Get the leaseStatus property: The current lease status of the file.
     * Possible values include: 'locked', 'unlocked'.
     *
     * @return the leaseStatus value.
     */
    public LeaseStatusType getLeaseStatus() {
        return this.leaseStatus;
    }

    /**
     * Set the leaseStatus property: The current lease status of the file.
     * Possible values include: 'locked', 'unlocked'.
     *
     * @param leaseStatus the leaseStatus value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setLeaseStatus(LeaseStatusType leaseStatus) {
        this.leaseStatus = leaseStatus;
        return this;
    }

    /**
     * Get the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @return the clientRequestId value.
     */
    public String getClientRequestId() {
        return this.clientRequestId;
    }

    /**
     * Set the clientRequestId property: If a client request id header is sent
     * in the request, this header will be present in the response with the
     * same value.
     *
     * @param clientRequestId the clientRequestId value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setClientRequestId(String clientRequestId) {
        this.clientRequestId = clientRequestId;
        return this;
    }

    /**
     * Get the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @return the requestId value.
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * Set the requestId property: This header uniquely identifies the request
     * that was made and can be used for troubleshooting the request.
     *
     * @param requestId the requestId value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Get the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @return the version value.
     */
    public String getVersion() {
        return this.version;
    }

    /**
     * Set the version property: Indicates the version of the Blob service used
     * to execute the request. This header is returned for requests made
     * against version 2009-09-19 and above.
     *
     * @param version the version value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @return the acceptRanges value.
     */
    public String getAcceptRanges() {
        return this.acceptRanges;
    }

    /**
     * Set the acceptRanges property: Indicates that the service supports
     * requests for partial file content.
     *
     * @param acceptRanges the acceptRanges value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setAcceptRanges(String acceptRanges) {
        this.acceptRanges = acceptRanges;
        return this;
    }

    /**
     * Get the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
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
     * Set the dateProperty property: UTC date/time value generated by the
     * service that indicates the time at which the response was initiated.
     *
     * @param dateProperty the dateProperty value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setDateProperty(OffsetDateTime dateProperty) {
        if (dateProperty == null) {
            this.dateProperty = null;
        } else {
            this.dateProperty = new DateTimeRfc1123(dateProperty);
        }
        return this;
    }

    /**
     * Get the isServerEncrypted property: The value of this header is set to
     * true if the file data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the file is unencrypted, or if only parts of the file/application
     * metadata are encrypted).
     *
     * @return the isServerEncrypted value.
     */
    public Boolean isServerEncrypted() {
        return this.serverEncrypted;
    }

    /**
     * Set the isServerEncrypted property: The value of this header is set to
     * true if the file data and application metadata are completely encrypted
     * using the specified algorithm. Otherwise, the value is set to false
     * (when the file is unencrypted, or if only parts of the file/application
     * metadata are encrypted).
     *
     * @param serverEncrypted the isServerEncrypted value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setServerEncrypted(Boolean serverEncrypted) {
        this.serverEncrypted = serverEncrypted;
        return this;
    }

    /**
     * Get the encryptionKeySha256 property: The SHA-256 hash of the encryption
     * key used to encrypt the file. This header is only returned when the file
     * was encrypted with a customer-provided key.
     *
     * @return the encryptionKeySha256 value.
     */
    public String getEncryptionKeySha256() {
        return this.encryptionKeySha256;
    }

    /**
     * Set the encryptionKeySha256 property: The SHA-256 hash of the encryption
     * key used to encrypt the file. This header is only returned when the file
     * was encrypted with a customer-provided key.
     *
     * @param encryptionKeySha256 the encryptionKeySha256 value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setEncryptionKeySha256(String encryptionKeySha256) {
        this.encryptionKeySha256 = encryptionKeySha256;
        return this;
    }

    /**
     * Get the fileContentMD5 property: If the file has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole file's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @return the fileContentMD5 value.
     */
    public byte[] getFileContentMd5() {
        return CoreUtils.clone(this.fileContentMD5);
    }

    /**
     * Set the fileContentMD5 property: If the file has a MD5 hash, and if
     * request contains range header (Range or x-ms-range), this response
     * header is returned with the value of the whole file's MD5 value. This
     * value may or may not be equal to the value returned in Content-MD5
     * header, with the latter calculated from the requested range.
     *
     * @param fileContentMd5 the fileContentMD5 value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setFileContentMd5(byte[] fileContentMd5) {
        this.fileContentMD5 = CoreUtils.clone(fileContentMd5);
        return this;
    }

    /**
     * Get the contentCrc64 property: If the request is to read a specified
     * range and the x-ms-range-get-content-crc64 is set to true, then the
     * request returns a crc64 for the range, as long as the range size is less
     * than or equal to 4 MB. If both x-ms-range-get-content-crc64 &amp;
     * x-ms-range-get-content-md5 is specified in the same request, it will
     * fail with 400(Bad Request).
     *
     * @return the contentCrc64 value.
     */
    public byte[] getContentCrc64() {
        return CoreUtils.clone(this.contentCrc64);
    }

    /**
     * Set the contentCrc64 property: If the request is to read a specified
     * range and the x-ms-range-get-content-crc64 is set to true, then the
     * request returns a crc64 for the range, as long as the range size is less
     * than or equal to 4 MB. If both x-ms-range-get-content-crc64 &amp;
     * x-ms-range-get-content-md5 is specified in the same request, it will
     * fail with 400(Bad Request).
     *
     * @param contentCrc64 the contentCrc64 value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setContentCrc64(byte[] contentCrc64) {
        this.contentCrc64 = CoreUtils.clone(contentCrc64);
        return this;
    }

    /**
     * Get the errorCode property: The errorCode property.
     *
     * @return the errorCode value.
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * Set the errorCode property: The errorCode property.
     *
     * @param errorCode the errorCode value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * Get the creationTime property: The x-ms-creation-time property.
     *
     * @return the creationTime value.
     */
    public OffsetDateTime getCreationTime() {
        return this.creationTime;
    }

    /**
     * Set the creationTime property: The x-ms-creation-time property.
     *
     * @param creationTime the creation time value to set.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setCreationTime(OffsetDateTime creationTime) {
        this.creationTime = creationTime;
        return this;
    }

    /**
     * Get the encryptionContext property: Encryption context for this path.
     *
     * @return the encryptionContext value.
     */
    public String getEncryptionContext() {
        return encryptionContext;
    }

    /**
     * Encryption context that can be set on the file. Encryption context is intended to store metadata that
     * can be used to decrypt the blob.
     *
     * @param encryptionContext the encryption context to be set on the file.
     * @return the FileReadHeaders object itself.
     */
    public FileReadHeaders setEncryptionContext(String encryptionContext) {
        this.encryptionContext = encryptionContext;
        return this;
    }
}
