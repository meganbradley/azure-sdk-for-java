// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.quantum.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.quantum.models.PricingDetail;
import com.azure.resourcemanager.quantum.models.PricingDimension;
import com.azure.resourcemanager.quantum.models.ProviderProperties;
import com.azure.resourcemanager.quantum.models.ProviderPropertiesAad;
import com.azure.resourcemanager.quantum.models.ProviderPropertiesManagedApplication;
import com.azure.resourcemanager.quantum.models.QuotaDimension;
import com.azure.resourcemanager.quantum.models.SkuDescription;
import com.azure.resourcemanager.quantum.models.TargetDescription;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

public final class ProviderPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ProviderProperties model = BinaryData.fromString(
            "{\"description\":\"ebwpucwwfvo\",\"providerType\":\"vmeueci\",\"company\":\"hzceuojgjrwjue\",\"defaultEndpoint\":\"twm\",\"aad\":{\"applicationId\":\"tdx\",\"tenantId\":\"txnrjaw\"},\"managedApplication\":{\"publisherId\":\"gxhnisk\",\"offerId\":\"bkpyc\"},\"targets\":[{\"id\":\"ndnhj\",\"name\":\"uwhvylwzbtdhxujz\",\"description\":\"mpowuwpr\",\"acceptedDataFormats\":[\"veual\"],\"acceptedContentEncodings\":[\"mkh\"]}],\"skus\":[{\"id\":\"bcswsrt\",\"name\":\"iplrbpbewtghfgb\",\"version\":\"gw\",\"description\":\"vlvqhjkbegi\",\"restrictedAccessUri\":\"nmxiebwwaloayqc\",\"autoAdd\":false,\"targets\":[\"j\",\"zg\"],\"quotaDimensions\":[{\"id\":\"htxongmtsavjc\",\"scope\":\"wxqpsrknftguvri\",\"period\":\"prwmdyvxqt\",\"quota\":42.644672,\"name\":\"ww\",\"description\":\"yqbexrmcqibycno\",\"unit\":\"knme\",\"unitPlural\":\"sgzvahapjyzhpv\"}],\"pricingDetails\":[{\"id\":\"j\",\"value\":\"xdjzlmwlxk\"},{\"id\":\"gfhzovawjvzunlut\",\"value\":\"n\"},{\"id\":\"nxipeil\",\"value\":\"zuaejxd\"},{\"id\":\"tskzbbtdzumveek\",\"value\":\"wozuhkf\"}]}],\"quotaDimensions\":[{\"id\":\"yofd\",\"scope\":\"uusdttouwa\",\"period\":\"ekqvkeln\",\"quota\":63.19878,\"name\":\"xwyjsflhhc\",\"description\":\"lnjixisxya\",\"unit\":\"oyaqcslyjpkiid\",\"unitPlural\":\"exznelixhnr\"},{\"id\":\"folhbnxknal\",\"scope\":\"lp\",\"period\":\"gdtpnapnyiro\",\"quota\":27.694834,\"name\":\"igvpgylg\",\"description\":\"itxmedjvcslynqww\",\"unit\":\"wzz\",\"unitPlural\":\"gktrmgucnapkte\"}],\"pricingDimensions\":[{\"id\":\"wptfdy\",\"name\":\"fqbuaceopzf\"},{\"id\":\"hhuao\",\"name\":\"pcqeqx\"}]}")
            .toObject(ProviderProperties.class);
        Assertions.assertEquals("ndnhj", model.targets().get(0).id());
        Assertions.assertEquals("uwhvylwzbtdhxujz", model.targets().get(0).name());
        Assertions.assertEquals("mpowuwpr", model.targets().get(0).description());
        Assertions.assertEquals("veual", model.targets().get(0).acceptedDataFormats().get(0));
        Assertions.assertEquals("mkh", model.targets().get(0).acceptedContentEncodings().get(0));
        Assertions.assertEquals("bcswsrt", model.skus().get(0).id());
        Assertions.assertEquals("iplrbpbewtghfgb", model.skus().get(0).name());
        Assertions.assertEquals("gw", model.skus().get(0).version());
        Assertions.assertEquals("vlvqhjkbegi", model.skus().get(0).description());
        Assertions.assertEquals("nmxiebwwaloayqc", model.skus().get(0).restrictedAccessUri());
        Assertions.assertEquals(false, model.skus().get(0).autoAdd());
        Assertions.assertEquals("j", model.skus().get(0).targets().get(0));
        Assertions.assertEquals("htxongmtsavjc", model.skus().get(0).quotaDimensions().get(0).id());
        Assertions.assertEquals("wxqpsrknftguvri", model.skus().get(0).quotaDimensions().get(0).scope());
        Assertions.assertEquals("prwmdyvxqt", model.skus().get(0).quotaDimensions().get(0).period());
        Assertions.assertEquals(42.644672F, model.skus().get(0).quotaDimensions().get(0).quota());
        Assertions.assertEquals("ww", model.skus().get(0).quotaDimensions().get(0).name());
        Assertions.assertEquals("yqbexrmcqibycno", model.skus().get(0).quotaDimensions().get(0).description());
        Assertions.assertEquals("knme", model.skus().get(0).quotaDimensions().get(0).unit());
        Assertions.assertEquals("sgzvahapjyzhpv", model.skus().get(0).quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("j", model.skus().get(0).pricingDetails().get(0).id());
        Assertions.assertEquals("xdjzlmwlxk", model.skus().get(0).pricingDetails().get(0).value());
        Assertions.assertEquals("yofd", model.quotaDimensions().get(0).id());
        Assertions.assertEquals("uusdttouwa", model.quotaDimensions().get(0).scope());
        Assertions.assertEquals("ekqvkeln", model.quotaDimensions().get(0).period());
        Assertions.assertEquals(63.19878F, model.quotaDimensions().get(0).quota());
        Assertions.assertEquals("xwyjsflhhc", model.quotaDimensions().get(0).name());
        Assertions.assertEquals("lnjixisxya", model.quotaDimensions().get(0).description());
        Assertions.assertEquals("oyaqcslyjpkiid", model.quotaDimensions().get(0).unit());
        Assertions.assertEquals("exznelixhnr", model.quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("wptfdy", model.pricingDimensions().get(0).id());
        Assertions.assertEquals("fqbuaceopzf", model.pricingDimensions().get(0).name());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ProviderProperties model = new ProviderProperties().withAad(new ProviderPropertiesAad())
            .withManagedApplication(new ProviderPropertiesManagedApplication())
            .withTargets(Arrays.asList(new TargetDescription().withId("ndnhj").withName("uwhvylwzbtdhxujz")
                .withDescription("mpowuwpr").withAcceptedDataFormats(Arrays.asList("veual"))
                .withAcceptedContentEncodings(Arrays.asList("mkh"))))
            .withSkus(Arrays.asList(new SkuDescription().withId("bcswsrt").withName("iplrbpbewtghfgb").withVersion("gw")
                .withDescription("vlvqhjkbegi").withRestrictedAccessUri("nmxiebwwaloayqc").withAutoAdd(false)
                .withTargets(Arrays.asList("j", "zg"))
                .withQuotaDimensions(Arrays.asList(new QuotaDimension().withId("htxongmtsavjc")
                    .withScope("wxqpsrknftguvri").withPeriod("prwmdyvxqt").withQuota(42.644672F).withName("ww")
                    .withDescription("yqbexrmcqibycno").withUnit("knme").withUnitPlural("sgzvahapjyzhpv")))
                .withPricingDetails(Arrays.asList(new PricingDetail().withId("j").withValue("xdjzlmwlxk"),
                    new PricingDetail().withId("gfhzovawjvzunlut").withValue("n"),
                    new PricingDetail().withId("nxipeil").withValue("zuaejxd"),
                    new PricingDetail().withId("tskzbbtdzumveek").withValue("wozuhkf")))))
            .withQuotaDimensions(Arrays.asList(
                new QuotaDimension().withId("yofd").withScope("uusdttouwa").withPeriod("ekqvkeln").withQuota(63.19878F)
                    .withName("xwyjsflhhc").withDescription("lnjixisxya").withUnit("oyaqcslyjpkiid")
                    .withUnitPlural("exznelixhnr"),
                new QuotaDimension().withId("folhbnxknal").withScope("lp").withPeriod("gdtpnapnyiro")
                    .withQuota(27.694834F).withName("igvpgylg").withDescription("itxmedjvcslynqww").withUnit("wzz")
                    .withUnitPlural("gktrmgucnapkte")))
            .withPricingDimensions(Arrays.asList(new PricingDimension().withId("wptfdy").withName("fqbuaceopzf"),
                new PricingDimension().withId("hhuao").withName("pcqeqx")));
        model = BinaryData.fromObject(model).toObject(ProviderProperties.class);
        Assertions.assertEquals("ndnhj", model.targets().get(0).id());
        Assertions.assertEquals("uwhvylwzbtdhxujz", model.targets().get(0).name());
        Assertions.assertEquals("mpowuwpr", model.targets().get(0).description());
        Assertions.assertEquals("veual", model.targets().get(0).acceptedDataFormats().get(0));
        Assertions.assertEquals("mkh", model.targets().get(0).acceptedContentEncodings().get(0));
        Assertions.assertEquals("bcswsrt", model.skus().get(0).id());
        Assertions.assertEquals("iplrbpbewtghfgb", model.skus().get(0).name());
        Assertions.assertEquals("gw", model.skus().get(0).version());
        Assertions.assertEquals("vlvqhjkbegi", model.skus().get(0).description());
        Assertions.assertEquals("nmxiebwwaloayqc", model.skus().get(0).restrictedAccessUri());
        Assertions.assertEquals(false, model.skus().get(0).autoAdd());
        Assertions.assertEquals("j", model.skus().get(0).targets().get(0));
        Assertions.assertEquals("htxongmtsavjc", model.skus().get(0).quotaDimensions().get(0).id());
        Assertions.assertEquals("wxqpsrknftguvri", model.skus().get(0).quotaDimensions().get(0).scope());
        Assertions.assertEquals("prwmdyvxqt", model.skus().get(0).quotaDimensions().get(0).period());
        Assertions.assertEquals(42.644672F, model.skus().get(0).quotaDimensions().get(0).quota());
        Assertions.assertEquals("ww", model.skus().get(0).quotaDimensions().get(0).name());
        Assertions.assertEquals("yqbexrmcqibycno", model.skus().get(0).quotaDimensions().get(0).description());
        Assertions.assertEquals("knme", model.skus().get(0).quotaDimensions().get(0).unit());
        Assertions.assertEquals("sgzvahapjyzhpv", model.skus().get(0).quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("j", model.skus().get(0).pricingDetails().get(0).id());
        Assertions.assertEquals("xdjzlmwlxk", model.skus().get(0).pricingDetails().get(0).value());
        Assertions.assertEquals("yofd", model.quotaDimensions().get(0).id());
        Assertions.assertEquals("uusdttouwa", model.quotaDimensions().get(0).scope());
        Assertions.assertEquals("ekqvkeln", model.quotaDimensions().get(0).period());
        Assertions.assertEquals(63.19878F, model.quotaDimensions().get(0).quota());
        Assertions.assertEquals("xwyjsflhhc", model.quotaDimensions().get(0).name());
        Assertions.assertEquals("lnjixisxya", model.quotaDimensions().get(0).description());
        Assertions.assertEquals("oyaqcslyjpkiid", model.quotaDimensions().get(0).unit());
        Assertions.assertEquals("exznelixhnr", model.quotaDimensions().get(0).unitPlural());
        Assertions.assertEquals("wptfdy", model.pricingDimensions().get(0).id());
        Assertions.assertEquals("fqbuaceopzf", model.pricingDimensions().get(0).name());
    }
}
