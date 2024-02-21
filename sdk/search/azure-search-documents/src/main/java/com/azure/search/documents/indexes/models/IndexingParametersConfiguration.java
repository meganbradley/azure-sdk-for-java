// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
//
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is regenerated.

package com.azure.search.documents.indexes.models;

import com.azure.core.annotation.Fluent;
import com.azure.json.JsonReader;
import com.azure.json.JsonSerializable;
import com.azure.json.JsonToken;
import com.azure.json.JsonWriter;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * A dictionary of indexer-specific configuration properties. Each name is the name of a specific property. Each value
 * must be of a primitive type.
 */
@Fluent
public final class IndexingParametersConfiguration implements JsonSerializable<IndexingParametersConfiguration> {
    /*
     * Represents the parsing mode for indexing from an Azure blob data source.
     */
    private BlobIndexerParsingMode parsingMode;

    /*
     * Comma-delimited list of filename extensions to ignore when processing from Azure blob storage.  For example, you
     * could exclude ".png, .mp4" to skip over those files during indexing.
     */
    private String excludedFileNameExtensions;

    /*
     * Comma-delimited list of filename extensions to select when processing from Azure blob storage.  For example, you
     * could focus indexing on specific application files ".docx, .pptx, .msg" to specifically include those file
     * types.
     */
    private String indexedFileNameExtensions;

    /*
     * For Azure blobs, set to false if you want to continue indexing when an unsupported content type is encountered,
     * and you don't know all the content types (file extensions) in advance.
     */
    private Boolean failOnUnsupportedContentType;

    /*
     * For Azure blobs, set to false if you want to continue indexing if a document fails indexing.
     */
    private Boolean failOnUnprocessableDocument;

    /*
     * For Azure blobs, set this property to true to still index storage metadata for blob content that is too large to
     * process. Oversized blobs are treated as errors by default. For limits on blob size, see
     * https://docs.microsoft.com/azure/search/search-limits-quotas-capacity.
     */
    private Boolean indexStorageMetadataOnlyForOversizedDocuments;

    /*
     * For CSV blobs, specifies a comma-delimited list of column headers, useful for mapping source fields to
     * destination fields in an index.
     */
    private String delimitedTextHeaders;

    /*
     * For CSV blobs, specifies the end-of-line single-character delimiter for CSV files where each line starts a new
     * document (for example, "|").
     */
    private String delimitedTextDelimiter;

    /*
     * For CSV blobs, indicates that the first (non-blank) line of each blob contains headers.
     */
    private Boolean firstLineContainsHeaders;

    /*
     * For JSON arrays, given a structured or semi-structured document, you can specify a path to the array using this
     * property.
     */
    private String documentRoot;

    /*
     * Specifies the data to extract from Azure blob storage and tells the indexer which data to extract from image
     * content when "imageAction" is set to a value other than "none".  This applies to embedded image content in a
     * .PDF or other application, or image files such as .jpg and .png, in Azure blobs.
     */
    private BlobIndexerDataToExtract dataToExtract;

    /*
     * Determines how to process embedded images and image files in Azure blob storage.  Setting the "imageAction"
     * configuration to any value other than "none" requires that a skillset also be attached to that indexer.
     */
    private BlobIndexerImageAction imageAction;

    /*
     * If true, will create a path //document//file_data that is an object representing the original file data
     * downloaded from your blob data source.  This allows you to pass the original file data to a custom skill for
     * processing within the enrichment pipeline, or to the Document Extraction skill.
     */
    private Boolean allowSkillsetToReadFileData;

    /*
     * Determines algorithm for text extraction from PDF files in Azure blob storage.
     */
    private BlobIndexerPdfTextRotationAlgorithm pdfTextRotationAlgorithm;

    /*
     * Specifies the environment in which the indexer should execute.
     */
    private IndexerExecutionEnvironment executionEnvironment;

    /*
     * Increases the timeout beyond the 5-minute default for Azure SQL database data sources, specified in the format
     * "hh:mm:ss".
     */
    private String queryTimeout;

    /*
     * A dictionary of indexer-specific configuration properties. Each name is the name of a specific property. Each
     * value must be of a primitive type.
     */
    private Map<String, Object> additionalProperties;

    /** Creates an instance of IndexingParametersConfiguration class. */
    public IndexingParametersConfiguration() {}

    /**
     * Get the parsingMode property: Represents the parsing mode for indexing from an Azure blob data source.
     *
     * @return the parsingMode value.
     */
    public BlobIndexerParsingMode getParsingMode() {
        return this.parsingMode;
    }

    /**
     * Set the parsingMode property: Represents the parsing mode for indexing from an Azure blob data source.
     *
     * @param parsingMode the parsingMode value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setParsingMode(BlobIndexerParsingMode parsingMode) {
        this.parsingMode = parsingMode;
        return this;
    }

    /**
     * Get the excludedFileNameExtensions property: Comma-delimited list of filename extensions to ignore when
     * processing from Azure blob storage. For example, you could exclude ".png, .mp4" to skip over those files during
     * indexing.
     *
     * @return the excludedFileNameExtensions value.
     */
    public String getExcludedFileNameExtensions() {
        return this.excludedFileNameExtensions;
    }

    /**
     * Set the excludedFileNameExtensions property: Comma-delimited list of filename extensions to ignore when
     * processing from Azure blob storage. For example, you could exclude ".png, .mp4" to skip over those files during
     * indexing.
     *
     * @param excludedFileNameExtensions the excludedFileNameExtensions value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setExcludedFileNameExtensions(String excludedFileNameExtensions) {
        this.excludedFileNameExtensions = excludedFileNameExtensions;
        return this;
    }

    /**
     * Get the indexedFileNameExtensions property: Comma-delimited list of filename extensions to select when processing
     * from Azure blob storage. For example, you could focus indexing on specific application files ".docx, .pptx, .msg"
     * to specifically include those file types.
     *
     * @return the indexedFileNameExtensions value.
     */
    public String getIndexedFileNameExtensions() {
        return this.indexedFileNameExtensions;
    }

    /**
     * Set the indexedFileNameExtensions property: Comma-delimited list of filename extensions to select when processing
     * from Azure blob storage. For example, you could focus indexing on specific application files ".docx, .pptx, .msg"
     * to specifically include those file types.
     *
     * @param indexedFileNameExtensions the indexedFileNameExtensions value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setIndexedFileNameExtensions(String indexedFileNameExtensions) {
        this.indexedFileNameExtensions = indexedFileNameExtensions;
        return this;
    }

    /**
     * Get the failOnUnsupportedContentType property: For Azure blobs, set to false if you want to continue indexing
     * when an unsupported content type is encountered, and you don't know all the content types (file extensions) in
     * advance.
     *
     * @return the failOnUnsupportedContentType value.
     */
    public Boolean isFailOnUnsupportedContentType() {
        return this.failOnUnsupportedContentType;
    }

    /**
     * Set the failOnUnsupportedContentType property: For Azure blobs, set to false if you want to continue indexing
     * when an unsupported content type is encountered, and you don't know all the content types (file extensions) in
     * advance.
     *
     * @param failOnUnsupportedContentType the failOnUnsupportedContentType value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setFailOnUnsupportedContentType(Boolean failOnUnsupportedContentType) {
        this.failOnUnsupportedContentType = failOnUnsupportedContentType;
        return this;
    }

    /**
     * Get the failOnUnprocessableDocument property: For Azure blobs, set to false if you want to continue indexing if a
     * document fails indexing.
     *
     * @return the failOnUnprocessableDocument value.
     */
    public Boolean isFailOnUnprocessableDocument() {
        return this.failOnUnprocessableDocument;
    }

    /**
     * Set the failOnUnprocessableDocument property: For Azure blobs, set to false if you want to continue indexing if a
     * document fails indexing.
     *
     * @param failOnUnprocessableDocument the failOnUnprocessableDocument value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setFailOnUnprocessableDocument(Boolean failOnUnprocessableDocument) {
        this.failOnUnprocessableDocument = failOnUnprocessableDocument;
        return this;
    }

    /**
     * Get the indexStorageMetadataOnlyForOversizedDocuments property: For Azure blobs, set this property to true to
     * still index storage metadata for blob content that is too large to process. Oversized blobs are treated as errors
     * by default. For limits on blob size, see https://docs.microsoft.com/azure/search/search-limits-quotas-capacity.
     *
     * @return the indexStorageMetadataOnlyForOversizedDocuments value.
     */
    public Boolean isIndexStorageMetadataOnlyForOversizedDocuments() {
        return this.indexStorageMetadataOnlyForOversizedDocuments;
    }

    /**
     * Set the indexStorageMetadataOnlyForOversizedDocuments property: For Azure blobs, set this property to true to
     * still index storage metadata for blob content that is too large to process. Oversized blobs are treated as errors
     * by default. For limits on blob size, see https://docs.microsoft.com/azure/search/search-limits-quotas-capacity.
     *
     * @param indexStorageMetadataOnlyForOversizedDocuments the indexStorageMetadataOnlyForOversizedDocuments value to
     *     set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setIndexStorageMetadataOnlyForOversizedDocuments(
            Boolean indexStorageMetadataOnlyForOversizedDocuments) {
        this.indexStorageMetadataOnlyForOversizedDocuments = indexStorageMetadataOnlyForOversizedDocuments;
        return this;
    }

    /**
     * Get the delimitedTextHeaders property: For CSV blobs, specifies a comma-delimited list of column headers, useful
     * for mapping source fields to destination fields in an index.
     *
     * @return the delimitedTextHeaders value.
     */
    public String getDelimitedTextHeaders() {
        return this.delimitedTextHeaders;
    }

    /**
     * Set the delimitedTextHeaders property: For CSV blobs, specifies a comma-delimited list of column headers, useful
     * for mapping source fields to destination fields in an index.
     *
     * @param delimitedTextHeaders the delimitedTextHeaders value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setDelimitedTextHeaders(String delimitedTextHeaders) {
        this.delimitedTextHeaders = delimitedTextHeaders;
        return this;
    }

    /**
     * Get the delimitedTextDelimiter property: For CSV blobs, specifies the end-of-line single-character delimiter for
     * CSV files where each line starts a new document (for example, "|").
     *
     * @return the delimitedTextDelimiter value.
     */
    public String getDelimitedTextDelimiter() {
        return this.delimitedTextDelimiter;
    }

    /**
     * Set the delimitedTextDelimiter property: For CSV blobs, specifies the end-of-line single-character delimiter for
     * CSV files where each line starts a new document (for example, "|").
     *
     * @param delimitedTextDelimiter the delimitedTextDelimiter value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setDelimitedTextDelimiter(String delimitedTextDelimiter) {
        this.delimitedTextDelimiter = delimitedTextDelimiter;
        return this;
    }

    /**
     * Get the firstLineContainsHeaders property: For CSV blobs, indicates that the first (non-blank) line of each blob
     * contains headers.
     *
     * @return the firstLineContainsHeaders value.
     */
    public Boolean isFirstLineContainsHeaders() {
        return this.firstLineContainsHeaders;
    }

    /**
     * Set the firstLineContainsHeaders property: For CSV blobs, indicates that the first (non-blank) line of each blob
     * contains headers.
     *
     * @param firstLineContainsHeaders the firstLineContainsHeaders value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setFirstLineContainsHeaders(Boolean firstLineContainsHeaders) {
        this.firstLineContainsHeaders = firstLineContainsHeaders;
        return this;
    }

    /**
     * Get the documentRoot property: For JSON arrays, given a structured or semi-structured document, you can specify a
     * path to the array using this property.
     *
     * @return the documentRoot value.
     */
    public String getDocumentRoot() {
        return this.documentRoot;
    }

    /**
     * Set the documentRoot property: For JSON arrays, given a structured or semi-structured document, you can specify a
     * path to the array using this property.
     *
     * @param documentRoot the documentRoot value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setDocumentRoot(String documentRoot) {
        this.documentRoot = documentRoot;
        return this;
    }

    /**
     * Get the dataToExtract property: Specifies the data to extract from Azure blob storage and tells the indexer which
     * data to extract from image content when "imageAction" is set to a value other than "none". This applies to
     * embedded image content in a .PDF or other application, or image files such as .jpg and .png, in Azure blobs.
     *
     * @return the dataToExtract value.
     */
    public BlobIndexerDataToExtract getDataToExtract() {
        return this.dataToExtract;
    }

    /**
     * Set the dataToExtract property: Specifies the data to extract from Azure blob storage and tells the indexer which
     * data to extract from image content when "imageAction" is set to a value other than "none". This applies to
     * embedded image content in a .PDF or other application, or image files such as .jpg and .png, in Azure blobs.
     *
     * @param dataToExtract the dataToExtract value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setDataToExtract(BlobIndexerDataToExtract dataToExtract) {
        this.dataToExtract = dataToExtract;
        return this;
    }

    /**
     * Get the imageAction property: Determines how to process embedded images and image files in Azure blob storage.
     * Setting the "imageAction" configuration to any value other than "none" requires that a skillset also be attached
     * to that indexer.
     *
     * @return the imageAction value.
     */
    public BlobIndexerImageAction getImageAction() {
        return this.imageAction;
    }

    /**
     * Set the imageAction property: Determines how to process embedded images and image files in Azure blob storage.
     * Setting the "imageAction" configuration to any value other than "none" requires that a skillset also be attached
     * to that indexer.
     *
     * @param imageAction the imageAction value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setImageAction(BlobIndexerImageAction imageAction) {
        this.imageAction = imageAction;
        return this;
    }

    /**
     * Get the allowSkillsetToReadFileData property: If true, will create a path //document//file_data that is an object
     * representing the original file data downloaded from your blob data source. This allows you to pass the original
     * file data to a custom skill for processing within the enrichment pipeline, or to the Document Extraction skill.
     *
     * @return the allowSkillsetToReadFileData value.
     */
    public Boolean isAllowSkillsetToReadFileData() {
        return this.allowSkillsetToReadFileData;
    }

    /**
     * Set the allowSkillsetToReadFileData property: If true, will create a path //document//file_data that is an object
     * representing the original file data downloaded from your blob data source. This allows you to pass the original
     * file data to a custom skill for processing within the enrichment pipeline, or to the Document Extraction skill.
     *
     * @param allowSkillsetToReadFileData the allowSkillsetToReadFileData value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setAllowSkillsetToReadFileData(Boolean allowSkillsetToReadFileData) {
        this.allowSkillsetToReadFileData = allowSkillsetToReadFileData;
        return this;
    }

    /**
     * Get the pdfTextRotationAlgorithm property: Determines algorithm for text extraction from PDF files in Azure blob
     * storage.
     *
     * @return the pdfTextRotationAlgorithm value.
     */
    public BlobIndexerPdfTextRotationAlgorithm getPdfTextRotationAlgorithm() {
        return this.pdfTextRotationAlgorithm;
    }

    /**
     * Set the pdfTextRotationAlgorithm property: Determines algorithm for text extraction from PDF files in Azure blob
     * storage.
     *
     * @param pdfTextRotationAlgorithm the pdfTextRotationAlgorithm value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setPdfTextRotationAlgorithm(
            BlobIndexerPdfTextRotationAlgorithm pdfTextRotationAlgorithm) {
        this.pdfTextRotationAlgorithm = pdfTextRotationAlgorithm;
        return this;
    }

    /**
     * Get the executionEnvironment property: Specifies the environment in which the indexer should execute.
     *
     * @return the executionEnvironment value.
     */
    public IndexerExecutionEnvironment getExecutionEnvironment() {
        return this.executionEnvironment;
    }

    /**
     * Set the executionEnvironment property: Specifies the environment in which the indexer should execute.
     *
     * @param executionEnvironment the executionEnvironment value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setExecutionEnvironment(IndexerExecutionEnvironment executionEnvironment) {
        this.executionEnvironment = executionEnvironment;
        return this;
    }

    /**
     * Get the queryTimeout property: Increases the timeout beyond the 5-minute default for Azure SQL database data
     * sources, specified in the format "hh:mm:ss".
     *
     * @return the queryTimeout value.
     */
    public String getQueryTimeout() {
        return this.queryTimeout;
    }

    /**
     * Set the queryTimeout property: Increases the timeout beyond the 5-minute default for Azure SQL database data
     * sources, specified in the format "hh:mm:ss".
     *
     * @param queryTimeout the queryTimeout value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setQueryTimeout(String queryTimeout) {
        this.queryTimeout = queryTimeout;
        return this;
    }

    /**
     * Get the additionalProperties property: A dictionary of indexer-specific configuration properties. Each name is
     * the name of a specific property. Each value must be of a primitive type.
     *
     * @return the additionalProperties value.
     */
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: A dictionary of indexer-specific configuration properties. Each name is
     * the name of a specific property. Each value must be of a primitive type.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the IndexingParametersConfiguration object itself.
     */
    public IndexingParametersConfiguration setAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @Override
    public JsonWriter toJson(JsonWriter jsonWriter) throws IOException {
        jsonWriter.writeStartObject();
        jsonWriter.writeStringField("parsingMode", Objects.toString(this.parsingMode, null));
        jsonWriter.writeStringField("excludedFileNameExtensions", this.excludedFileNameExtensions);
        jsonWriter.writeStringField("indexedFileNameExtensions", this.indexedFileNameExtensions);
        jsonWriter.writeBooleanField("failOnUnsupportedContentType", this.failOnUnsupportedContentType);
        jsonWriter.writeBooleanField("failOnUnprocessableDocument", this.failOnUnprocessableDocument);
        jsonWriter.writeBooleanField(
                "indexStorageMetadataOnlyForOversizedDocuments", this.indexStorageMetadataOnlyForOversizedDocuments);
        jsonWriter.writeStringField("delimitedTextHeaders", this.delimitedTextHeaders);
        jsonWriter.writeStringField("delimitedTextDelimiter", this.delimitedTextDelimiter);
        jsonWriter.writeBooleanField("firstLineContainsHeaders", this.firstLineContainsHeaders);
        jsonWriter.writeStringField("documentRoot", this.documentRoot);
        jsonWriter.writeStringField("dataToExtract", Objects.toString(this.dataToExtract, null));
        jsonWriter.writeStringField("imageAction", Objects.toString(this.imageAction, null));
        jsonWriter.writeBooleanField("allowSkillsetToReadFileData", this.allowSkillsetToReadFileData);
        jsonWriter.writeStringField("pdfTextRotationAlgorithm", Objects.toString(this.pdfTextRotationAlgorithm, null));
        jsonWriter.writeStringField("executionEnvironment", Objects.toString(this.executionEnvironment, null));
        jsonWriter.writeStringField("queryTimeout", this.queryTimeout);
        if (additionalProperties != null) {
            for (Map.Entry<String, Object> additionalProperty : additionalProperties.entrySet()) {
                jsonWriter.writeUntypedField(additionalProperty.getKey(), additionalProperty.getValue());
            }
        }
        return jsonWriter.writeEndObject();
    }

    /**
     * Reads an instance of IndexingParametersConfiguration from the JsonReader.
     *
     * @param jsonReader The JsonReader being read.
     * @return An instance of IndexingParametersConfiguration if the JsonReader was pointing to an instance of it, or
     *     null if it was pointing to JSON null.
     * @throws IOException If an error occurs while reading the IndexingParametersConfiguration.
     */
    public static IndexingParametersConfiguration fromJson(JsonReader jsonReader) throws IOException {
        return jsonReader.readObject(
                reader -> {
                    IndexingParametersConfiguration deserializedIndexingParametersConfiguration =
                            new IndexingParametersConfiguration();
                    Map<String, Object> additionalProperties = null;
                    while (reader.nextToken() != JsonToken.END_OBJECT) {
                        String fieldName = reader.getFieldName();
                        reader.nextToken();

                        if ("parsingMode".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.parsingMode =
                                    BlobIndexerParsingMode.fromString(reader.getString());
                        } else if ("excludedFileNameExtensions".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.excludedFileNameExtensions = reader.getString();
                        } else if ("indexedFileNameExtensions".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.indexedFileNameExtensions = reader.getString();
                        } else if ("failOnUnsupportedContentType".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.failOnUnsupportedContentType =
                                    reader.getNullable(JsonReader::getBoolean);
                        } else if ("failOnUnprocessableDocument".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.failOnUnprocessableDocument =
                                    reader.getNullable(JsonReader::getBoolean);
                        } else if ("indexStorageMetadataOnlyForOversizedDocuments".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.indexStorageMetadataOnlyForOversizedDocuments =
                                    reader.getNullable(JsonReader::getBoolean);
                        } else if ("delimitedTextHeaders".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.delimitedTextHeaders = reader.getString();
                        } else if ("delimitedTextDelimiter".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.delimitedTextDelimiter = reader.getString();
                        } else if ("firstLineContainsHeaders".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.firstLineContainsHeaders =
                                    reader.getNullable(JsonReader::getBoolean);
                        } else if ("documentRoot".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.documentRoot = reader.getString();
                        } else if ("dataToExtract".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.dataToExtract =
                                    BlobIndexerDataToExtract.fromString(reader.getString());
                        } else if ("imageAction".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.imageAction =
                                    BlobIndexerImageAction.fromString(reader.getString());
                        } else if ("allowSkillsetToReadFileData".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.allowSkillsetToReadFileData =
                                    reader.getNullable(JsonReader::getBoolean);
                        } else if ("pdfTextRotationAlgorithm".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.pdfTextRotationAlgorithm =
                                    BlobIndexerPdfTextRotationAlgorithm.fromString(reader.getString());
                        } else if ("executionEnvironment".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.executionEnvironment =
                                    IndexerExecutionEnvironment.fromString(reader.getString());
                        } else if ("queryTimeout".equals(fieldName)) {
                            deserializedIndexingParametersConfiguration.queryTimeout = reader.getString();
                        } else {
                            if (additionalProperties == null) {
                                additionalProperties = new LinkedHashMap<>();
                            }

                            additionalProperties.put(fieldName, reader.readUntyped());
                        }
                    }
                    deserializedIndexingParametersConfiguration.additionalProperties = additionalProperties;

                    return deserializedIndexingParametersConfiguration;
                });
    }
}
