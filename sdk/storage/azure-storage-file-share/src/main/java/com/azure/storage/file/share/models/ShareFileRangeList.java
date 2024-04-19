// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
package com.azure.storage.file.share.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.CoreUtils;
import com.azure.xml.XmlReader;
import com.azure.xml.XmlSerializable;
import com.azure.xml.XmlToken;
import com.azure.xml.XmlWriter;
import java.util.ArrayList;
import java.util.List;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;

/**
 * The list of file ranges.
 */
@Fluent
public final class ShareFileRangeList implements XmlSerializable<ShareFileRangeList> {

    /*
     * The Ranges property.
     */
    private List<FileRange> ranges = new ArrayList<>();

    /*
     * The ClearRanges property.
     */
    private List<ClearRange> clearRanges = new ArrayList<>();

    /**
     * Creates an instance of ShareFileRangeList class.
     */
    public ShareFileRangeList() {
    }

    /**
     * Get the ranges property: The Ranges property.
     *
     * @return the ranges value.
     */
    public List<FileRange> getRanges() {
        return this.ranges;
    }

    /**
     * Set the ranges property: The Ranges property.
     *
     * @param ranges the ranges value to set.
     * @return the ShareFileRangeList object itself.
     */
    public ShareFileRangeList setRanges(List<FileRange> ranges) {
        this.ranges = ranges;
        return this;
    }

    /**
     * Get the clearRanges property: The ClearRanges property.
     *
     * @return the clearRanges value.
     */
    public List<ClearRange> getClearRanges() {
        return this.clearRanges;
    }

    /**
     * Set the clearRanges property: The ClearRanges property.
     *
     * @param clearRanges the clearRanges value to set.
     * @return the ShareFileRangeList object itself.
     */
    public ShareFileRangeList setClearRanges(List<ClearRange> clearRanges) {
        this.clearRanges = clearRanges;
        return this;
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter) throws XMLStreamException {
        return toXml(xmlWriter, null);
    }

    @Override
    public XmlWriter toXml(XmlWriter xmlWriter, String rootElementName) throws XMLStreamException {
        rootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Ranges" : rootElementName;
        xmlWriter.writeStartElement(rootElementName);
        if (this.ranges != null) {
            for (FileRange element : this.ranges) {
                xmlWriter.writeXml(element, "Range");
            }
        }
        if (this.clearRanges != null) {
            for (ClearRange element : this.clearRanges) {
                xmlWriter.writeXml(element, "ClearRange");
            }
        }
        return xmlWriter.writeEndElement();
    }

    /**
     * Reads an instance of ShareFileRangeList from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @return An instance of ShareFileRangeList if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareFileRangeList.
     */
    public static ShareFileRangeList fromXml(XmlReader xmlReader) throws XMLStreamException {
        return fromXml(xmlReader, null);
    }

    /**
     * Reads an instance of ShareFileRangeList from the XmlReader.
     *
     * @param xmlReader The XmlReader being read.
     * @param rootElementName Optional root element name to override the default defined by the model. Used to support
     * cases where the model can deserialize from different root element names.
     * @return An instance of ShareFileRangeList if the XmlReader was pointing to an instance of it, or null if it was
     * pointing to XML null.
     * @throws XMLStreamException If an error occurs while reading the ShareFileRangeList.
     */
    public static ShareFileRangeList fromXml(XmlReader xmlReader, String rootElementName) throws XMLStreamException {
        String finalRootElementName = CoreUtils.isNullOrEmpty(rootElementName) ? "Ranges" : rootElementName;
        return xmlReader.readObject(finalRootElementName, reader -> {
            ShareFileRangeList deserializedShareFileRangeList = new ShareFileRangeList();
            while (reader.nextElement() != XmlToken.END_ELEMENT) {
                QName elementName = reader.getElementName();
                if ("Range".equals(elementName.getLocalPart())) {
                    if (deserializedShareFileRangeList.ranges == null) {
                        deserializedShareFileRangeList.ranges = new ArrayList<>();
                    }
                    deserializedShareFileRangeList.ranges.add(FileRange.fromXml(reader, "Range"));
                } else if ("ClearRange".equals(elementName.getLocalPart())) {
                    if (deserializedShareFileRangeList.clearRanges == null) {
                        deserializedShareFileRangeList.clearRanges = new ArrayList<>();
                    }
                    deserializedShareFileRangeList.clearRanges.add(ClearRange.fromXml(reader, "ClearRange"));
                } else {
                    reader.skipElement();
                }
            }
            return deserializedShareFileRangeList;
        });
    }
}
