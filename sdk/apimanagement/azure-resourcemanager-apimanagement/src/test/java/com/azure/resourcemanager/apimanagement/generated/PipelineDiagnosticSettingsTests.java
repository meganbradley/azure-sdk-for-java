// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.apimanagement.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.apimanagement.models.BodyDiagnosticSettings;
import com.azure.resourcemanager.apimanagement.models.DataMasking;
import com.azure.resourcemanager.apimanagement.models.DataMaskingEntity;
import com.azure.resourcemanager.apimanagement.models.DataMaskingMode;
import com.azure.resourcemanager.apimanagement.models.HttpMessageDiagnostic;
import com.azure.resourcemanager.apimanagement.models.PipelineDiagnosticSettings;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class PipelineDiagnosticSettingsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        PipelineDiagnosticSettings model =
            BinaryData
                .fromString(
                    "{\"request\":{\"headers\":[\"lohap\"],\"body\":{\"bytes\":529518315},\"dataMasking\":{\"queryParams\":[{\"value\":\"glqdhm\",\"mode\":\"Hide\"},{\"value\":\"alcxpjbyy\",\"mode\":\"Hide\"},{\"value\":\"qcjenkyhf\",\"mode\":\"Hide\"},{\"value\":\"qxfx\",\"mode\":\"Mask\"}],\"headers\":[{\"value\":\"pzqjhhhq\",\"mode\":\"Mask\"},{\"value\":\"vcacoyv\",\"mode\":\"Mask\"},{\"value\":\"izus\",\"mode\":\"Hide\"}]}},\"response\":{\"headers\":[\"cmnlzijiufehg\",\"vflnwyvqkxrerln\",\"ylyl\"],\"body\":{\"bytes\":1965919560},\"dataMasking\":{\"queryParams\":[{\"value\":\"qztw\",\"mode\":\"Hide\"},{\"value\":\"upgxyjtcdxabbujf\",\"mode\":\"Mask\"},{\"value\":\"nbbklqpxzucafed\",\"mode\":\"Hide\"}],\"headers\":[{\"value\":\"a\",\"mode\":\"Mask\"},{\"value\":\"dgnhgookrtalvnbw\",\"mode\":\"Hide\"}]}}}")
                .toObject(PipelineDiagnosticSettings.class);
        Assertions.assertEquals("lohap", model.request().headers().get(0));
        Assertions.assertEquals(529518315, model.request().body().bytes());
        Assertions.assertEquals("glqdhm", model.request().dataMasking().queryParams().get(0).value());
        Assertions.assertEquals(DataMaskingMode.HIDE, model.request().dataMasking().queryParams().get(0).mode());
        Assertions.assertEquals("pzqjhhhq", model.request().dataMasking().headers().get(0).value());
        Assertions.assertEquals(DataMaskingMode.MASK, model.request().dataMasking().headers().get(0).mode());
        Assertions.assertEquals("cmnlzijiufehg", model.response().headers().get(0));
        Assertions.assertEquals(1965919560, model.response().body().bytes());
        Assertions.assertEquals("qztw", model.response().dataMasking().queryParams().get(0).value());
        Assertions.assertEquals(DataMaskingMode.HIDE, model.response().dataMasking().queryParams().get(0).mode());
        Assertions.assertEquals("a", model.response().dataMasking().headers().get(0).value());
        Assertions.assertEquals(DataMaskingMode.MASK, model.response().dataMasking().headers().get(0).mode());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        PipelineDiagnosticSettings model =
            new PipelineDiagnosticSettings()
                .withRequest(
                    new HttpMessageDiagnostic()
                        .withHeaders(Arrays.asList("lohap"))
                        .withBody(new BodyDiagnosticSettings().withBytes(529518315))
                        .withDataMasking(
                            new DataMasking()
                                .withQueryParams(
                                    Arrays
                                        .asList(
                                            new DataMaskingEntity().withValue("glqdhm").withMode(DataMaskingMode.HIDE),
                                            new DataMaskingEntity()
                                                .withValue("alcxpjbyy")
                                                .withMode(DataMaskingMode.HIDE),
                                            new DataMaskingEntity()
                                                .withValue("qcjenkyhf")
                                                .withMode(DataMaskingMode.HIDE),
                                            new DataMaskingEntity().withValue("qxfx").withMode(DataMaskingMode.MASK)))
                                .withHeaders(
                                    Arrays
                                        .asList(
                                            new DataMaskingEntity()
                                                .withValue("pzqjhhhq")
                                                .withMode(DataMaskingMode.MASK),
                                            new DataMaskingEntity().withValue("vcacoyv").withMode(DataMaskingMode.MASK),
                                            new DataMaskingEntity().withValue("izus").withMode(DataMaskingMode.HIDE)))))
                .withResponse(
                    new HttpMessageDiagnostic()
                        .withHeaders(Arrays.asList("cmnlzijiufehg", "vflnwyvqkxrerln", "ylyl"))
                        .withBody(new BodyDiagnosticSettings().withBytes(1965919560))
                        .withDataMasking(
                            new DataMasking()
                                .withQueryParams(
                                    Arrays
                                        .asList(
                                            new DataMaskingEntity().withValue("qztw").withMode(DataMaskingMode.HIDE),
                                            new DataMaskingEntity()
                                                .withValue("upgxyjtcdxabbujf")
                                                .withMode(DataMaskingMode.MASK),
                                            new DataMaskingEntity()
                                                .withValue("nbbklqpxzucafed")
                                                .withMode(DataMaskingMode.HIDE)))
                                .withHeaders(
                                    Arrays
                                        .asList(
                                            new DataMaskingEntity().withValue("a").withMode(DataMaskingMode.MASK),
                                            new DataMaskingEntity()
                                                .withValue("dgnhgookrtalvnbw")
                                                .withMode(DataMaskingMode.HIDE)))));
        model = BinaryData.fromObject(model).toObject(PipelineDiagnosticSettings.class);
        Assertions.assertEquals("lohap", model.request().headers().get(0));
        Assertions.assertEquals(529518315, model.request().body().bytes());
        Assertions.assertEquals("glqdhm", model.request().dataMasking().queryParams().get(0).value());
        Assertions.assertEquals(DataMaskingMode.HIDE, model.request().dataMasking().queryParams().get(0).mode());
        Assertions.assertEquals("pzqjhhhq", model.request().dataMasking().headers().get(0).value());
        Assertions.assertEquals(DataMaskingMode.MASK, model.request().dataMasking().headers().get(0).mode());
        Assertions.assertEquals("cmnlzijiufehg", model.response().headers().get(0));
        Assertions.assertEquals(1965919560, model.response().body().bytes());
        Assertions.assertEquals("qztw", model.response().dataMasking().queryParams().get(0).value());
        Assertions.assertEquals(DataMaskingMode.HIDE, model.response().dataMasking().queryParams().get(0).mode());
        Assertions.assertEquals("a", model.response().dataMasking().headers().get(0).value());
        Assertions.assertEquals(DataMaskingMode.MASK, model.response().dataMasking().headers().get(0).mode());
    }
}
