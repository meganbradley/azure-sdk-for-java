// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.datafactory.fluent.models.ExecutePowerQueryActivityTypeProperties;
import com.azure.resourcemanager.datafactory.models.DataFlowReference;
import com.azure.resourcemanager.datafactory.models.DataFlowReferenceType;
import com.azure.resourcemanager.datafactory.models.DataFlowStagingInfo;
import com.azure.resourcemanager.datafactory.models.DatasetReference;
import com.azure.resourcemanager.datafactory.models.ExecuteDataFlowActivityTypePropertiesCompute;
import com.azure.resourcemanager.datafactory.models.IntegrationRuntimeReference;
import com.azure.resourcemanager.datafactory.models.LinkedServiceReference;
import com.azure.resourcemanager.datafactory.models.PowerQuerySink;
import com.azure.resourcemanager.datafactory.models.PowerQuerySinkMapping;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class ExecutePowerQueryActivityTypePropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        ExecutePowerQueryActivityTypeProperties model = BinaryData.fromString(
            "{\"sinks\":{\"fbweuazxtsgs\":{\"script\":\"abnwsgauwepojmx\",\"schemaLinkedService\":{\"referenceName\":\"viykwrffxo\",\"parameters\":{\"dyuoz\":\"datahcxpzjewoyqlcv\",\"npuquyatvsnkrxh\":\"datatsj\",\"ldtjzi\":\"dataegwvblrgrzlrnuy\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"wzpauwhfh\",\"parameters\":{\"wgsyi\":\"dataolojcaybukj\",\"ekxvlejh\":\"dataqlghrcctvlnnkvdr\",\"u\":\"databqzxqid\"}},\"name\":\"wrwjbanteeu\",\"description\":\"icaikfvj\",\"dataset\":{\"referenceName\":\"fpob\",\"parameters\":{\"dlp\":\"datarqjiol\",\"f\":\"datayksqnsrvgh\",\"wtucv\":\"datadrqmcgeqybord\",\"orsgc\":\"dataviymvgnqqfnv\"}},\"linkedService\":{\"referenceName\":\"kn\",\"parameters\":{\"bbzfcjmhp\":\"datacnezdplcbq\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"jpdyztqpszbt\",\"datasetParameters\":\"dataymbyltdnr\",\"parameters\":{\"iz\":\"datahxo\",\"jiyl\":\"datawihadcotfo\"},\"\":{\"bzs\":\"databco\",\"okwaxehxswe\":\"datage\",\"xffttfqlcxymcmo\":\"dataga\"}}},\"pfisyydoy\":{\"script\":\"adsbacemwn\",\"schemaLinkedService\":{\"referenceName\":\"dgimsbump\",\"parameters\":{\"w\":\"datacarcyrftcjxzmx\",\"vxrcmrdmyjcou\":\"datahdlrfyonnb\",\"zirkyxhqwoxm\":\"datazodolehchimzrc\",\"lwhpqnzpfpsppkq\":\"dataobuanybfm\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"dmgmfy\",\"parameters\":{\"fx\":\"datafkfgrdrilh\",\"gz\":\"datarqpickn\"}},\"name\":\"rdicwmueavawyw\",\"description\":\"gcc\",\"dataset\":{\"referenceName\":\"hjvvrrxclf\",\"parameters\":{\"wxxfkfthwxoss\":\"dataifqwyiuhhuftnuig\",\"stgsmeijgjbevts\":\"datakafym\",\"ywal\":\"datacsyjxdwvdklgw\",\"eelbcsyaohizfysa\":\"datafmenbaj\"}},\"linkedService\":{\"referenceName\":\"bupftkddohxvcso\",\"parameters\":{\"ywttdanu\":\"datadcqp\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"tkhcmoccgtmfu\",\"datasetParameters\":\"datakhmbks\",\"parameters\":{\"xdsnmhndcr\":\"datazt\"},\"\":{\"bahuu\":\"dataccmqenf\",\"kolfiigoxohjy\":\"datathden\"}}},\"btmh\":{\"script\":\"cwvcfayll\",\"schemaLinkedService\":{\"referenceName\":\"hqvmilpgxeaqwogp\",\"parameters\":{\"edfmc\":\"datamyfg\",\"ti\":\"datar\",\"voqsudtmkmg\":\"datadkypckhqooqni\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"pv\",\"parameters\":{\"kghugfdugqhmo\":\"datagvpsukkk\",\"tjtiidozfrgvqurr\":\"dataekoxylcbp\"}},\"name\":\"nijdr\",\"description\":\"ohjgdoi\",\"dataset\":{\"referenceName\":\"rylzsgpoi\",\"parameters\":{\"ja\":\"datazqko\",\"zkq\":\"datadm\"}},\"linkedService\":{\"referenceName\":\"zytazqsu\",\"parameters\":{\"osdizpgcq\":\"datapvtwgbf\",\"gwvvenmuenoq\":\"dataglzfgepblhe\",\"oixiduzrdvhgyj\":\"dataamrytrny\",\"fwlxkxlru\":\"datambj\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"olxlxlezzy\",\"datasetParameters\":\"datazz\",\"parameters\":{\"jiaycgxwacuu\":\"datadelmxbxbyx\",\"jbhuzybms\":\"datanygtsjafvzd\",\"uvbnmzjwhybsgz\":\"dataz\"},\"\":{\"qmwmwoggbxiasfi\":\"datafhkznl\",\"lfedwhvhlzpvpix\":\"dataucnp\",\"vc\":\"datajvycodfubnvdibb\"}}},\"plwyluvqp\":{\"script\":\"mpt\",\"schemaLinkedService\":{\"referenceName\":\"r\",\"parameters\":{\"gvksoxyk\":\"dataypauqyaisdiwo\",\"enl\":\"datama\",\"ebg\":\"datavahjlvbnl\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"opsgedsyykueifm\",\"parameters\":{\"b\":\"datatlfdiqzvazffz\"}},\"name\":\"el\",\"description\":\"lrdgpudbimehdx\",\"dataset\":{\"referenceName\":\"tyfhwkb\",\"parameters\":{\"ei\":\"datafnyoautebehjrmfe\",\"pyirngfujv\":\"datanhwgzunbcvfz\",\"rsxxcaxgr\":\"dataafrqqfgudobutkq\",\"wpuas\":\"dataikiuxvdnchrvsfnl\"}},\"linkedService\":{\"referenceName\":\"cblv\",\"parameters\":{\"xxt\":\"datadi\",\"iwvznffmxtmq\":\"datavoasdhd\",\"xpmtztvxfglil\":\"datartpdyhbpfxmr\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"owrzqy\",\"datasetParameters\":\"datajxsgrtnit\",\"parameters\":{\"ffexzzi\":\"datapgenyvpxpcjnb\"},\"\":{\"ewniwt\":\"datat\"}}}},\"queries\":[{\"queryName\":\"yqsnttwlxvezoald\",\"dataflowSinks\":[{\"script\":\"xcqto\",\"schemaLinkedService\":{\"referenceName\":\"anxinlmi\",\"parameters\":{\"uivzsjf\":\"datau\",\"ayk\":\"datanenhyhdu\",\"tzsltsxmdace\":\"datajhwybbdaedq\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"mapfieaumqjxd\",\"parameters\":{\"uiamr\":\"datac\",\"fpwjjtdzfyivv\":\"datalhfxjcq\",\"zfvysvudbj\":\"dataxqpemqogto\"}},\"name\":\"ihtxvmnyslpdqd\",\"description\":\"j\",\"dataset\":{\"referenceName\":\"blnervt\",\"parameters\":{\"si\":\"datadtnjxvtvyy\"}},\"linkedService\":{\"referenceName\":\"bqygnfxgzzq\",\"parameters\":{\"jsugkdv\":\"datavjhmqpjbk\",\"efdsgfztmhvu\":\"datagpeitfbgyznsh\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"poookhcurwgbjzz\",\"datasetParameters\":\"datajwqwyhh\",\"parameters\":{\"ywzpcxnbb\":\"datatseejtfnjrrxfb\",\"ywdckvcofstceehq\":\"datajgvalowmmhhu\",\"fujpo\":\"dataah\",\"edruumldunalog\":\"datatakijwk\"},\"\":{\"e\":\"datakfqc\",\"dvhqecqqiulwfz\":\"datansszu\"}}},{\"script\":\"z\",\"schemaLinkedService\":{\"referenceName\":\"gtwaquiuzsnjjgnm\",\"parameters\":{\"wt\":\"datasjfvdajmczlvcxm\",\"b\":\"datarpd\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"xzxwjzleeupqlszc\",\"parameters\":{\"fxnxtiwinn\":\"dataayraatrjpar\",\"zgmfnpeluvxs\":\"dataowihsgt\"}},\"name\":\"c\",\"description\":\"ukupngorw\",\"dataset\":{\"referenceName\":\"yrguxfjjgcfqfwgr\",\"parameters\":{\"rujdskkkz\":\"datafhkbjgxkrppxj\",\"zdakfxzhapcwhj\":\"dataladibsjirhaqedfu\",\"bdxsjceyyebgfffn\":\"datamjfr\",\"yfugk\":\"datarbnvwhqctq\"}},\"linkedService\":{\"referenceName\":\"xvevudywny\",\"parameters\":{\"xagtiyvdslrrtv\":\"datanaynlxwukpqcf\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"zmzbaqrxz\",\"datasetParameters\":\"dataxtmedoykekbdwqwh\",\"parameters\":{\"eisqkotbmhryri\":\"datayrfjzyiniuua\"},\"\":{\"rswnfakcchc\":\"datayavhesqnvsqte\",\"u\":\"datamzvh\",\"chgvwggylbmfrxof\":\"dataigadpq\"}}},{\"script\":\"yscwv\",\"schemaLinkedService\":{\"referenceName\":\"zfgdxyrpp\",\"parameters\":{\"tbpaircnupmz\":\"datadohiotgf\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"tziejoebzofmmce\",\"parameters\":{\"kpqnpdlcyjse\":\"datafhjrsxrmlxszx\",\"umlfdxetqknzev\":\"datadfhnhbktobeonl\"}},\"name\":\"y\",\"description\":\"nqneo\",\"dataset\":{\"referenceName\":\"crmng\",\"parameters\":{\"cxrxduxct\":\"datainl\",\"gm\":\"datajxtkmd\",\"ipabturkmk\":\"datavfuylpctlbuo\",\"zzsohcaet\":\"datacsqktgko\"}},\"linkedService\":{\"referenceName\":\"pm\",\"parameters\":{\"li\":\"dataqxlkya\",\"ubtykyz\":\"dataoodn\",\"tgbsdaruwv\":\"datargiyqzuhnbazd\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"oozyhucadeqslhz\",\"datasetParameters\":\"dataimqazolroqusrlkp\",\"parameters\":{\"mkbpdpk\":\"dataqydrnwsfa\",\"slqikocgzjmjdoq\":\"datalh\"},\"\":{\"ekbb\":\"datadc\",\"azhr\":\"datatcoxddgjdpyhe\"}}},{\"script\":\"jtjc\",\"schemaLinkedService\":{\"referenceName\":\"ynbs\",\"parameters\":{\"lgfecsreojs\":\"datareqvxzlwgaius\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"kxbbzi\",\"parameters\":{\"yg\":\"datavvgjxbmgheyamoe\"}},\"name\":\"vyiti\",\"description\":\"zxseyjqklaihqrbr\",\"dataset\":{\"referenceName\":\"hljqqbue\",\"parameters\":{\"tifbvcveomdl\":\"datadjsu\"}},\"linkedService\":{\"referenceName\":\"jguwdfn\",\"parameters\":{\"ojmynlvovjs\":\"datauqufaowuibujj\",\"h\":\"dataxewfqvlhjawm\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"zlrnfmmef\",\"datasetParameters\":\"datajxtgffwq\",\"parameters\":{\"t\":\"datagfgirrzyngdvdr\",\"kqaqfbimfpnpmkdg\":\"dataqfrxggvstyxv\",\"jeffpidwqr\":\"datandwtdorvxdwgpu\"},\"\":{\"gaupplcoqbouetf\":\"datajmj\",\"ldlok\":\"datazaja\"}}}]},{\"queryName\":\"mzfltxqpozqd\",\"dataflowSinks\":[{\"script\":\"fe\",\"schemaLinkedService\":{\"referenceName\":\"gjkkjwjn\",\"parameters\":{\"b\":\"dataswmwv\",\"sph\":\"dataazjmfq\",\"ifj\":\"datavthkgjaaqhd\",\"nquj\":\"datafrg\"}},\"rejectedDataLinkedService\":{\"referenceName\":\"wpjpka\",\"parameters\":{\"btlmnrdkiqs\":\"dataafhvuy\"}},\"name\":\"bdv\",\"description\":\"qsmk\",\"dataset\":{\"referenceName\":\"qljxnkpdimexro\",\"parameters\":{\"wovl\":\"datadptsdlcsrhttmhj\"}},\"linkedService\":{\"referenceName\":\"zquckrcw\",\"parameters\":{\"sjawbnxcizeuifnd\":\"dataqqkknulrqpacusm\",\"nzjyghq\":\"datar\",\"ln\":\"datafs\",\"ems\":\"datavgec\"}},\"flowlet\":{\"type\":\"DataFlowReference\",\"referenceName\":\"rkgt\",\"datasetParameters\":\"dataxlaywkbuvedw\",\"parameters\":{\"dgtwx\":\"dataeyfdgnaoirru\"},\"\":{\"eeqelmrp\":\"datarhvgphfzdgs\"}}}]}],\"dataFlow\":{\"type\":\"DataFlowReference\",\"referenceName\":\"gxrgqskdk\",\"datasetParameters\":\"dataobegdxjxkxvgod\",\"parameters\":{\"nulrfeqefqdvooqj\":\"dataefa\"},\"\":{\"gadjllhz\":\"datan\"}},\"staging\":{\"linkedService\":{\"referenceName\":\"vr\",\"parameters\":{\"ttpvomxtosdbvu\":\"datag\",\"oheebzewbif\":\"dataoi\",\"vvuewrhkjmphfhm\":\"datayptlbadhdlrr\",\"uulhfdggsr\":\"dataao\"}},\"folderPath\":\"datalhhlg\"},\"integrationRuntime\":{\"referenceName\":\"bj\",\"parameters\":{\"hocrphzdkikjy\":\"datatgelfkhmgs\",\"lupmyq\":\"dataaqk\"}},\"compute\":{\"computeType\":\"dataararevvmmjwmldg\",\"coreCount\":\"dataglm\"},\"traceLevel\":\"dataatyry\",\"continueOnError\":\"dataon\",\"runConcurrently\":\"datanm\",\"sourceStagingConcurrency\":\"databgpgvliinueltcoi\"}")
            .toObject(ExecutePowerQueryActivityTypeProperties.class);
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("gxrgqskdk", model.dataFlow().referenceName());
        Assertions.assertEquals("vr", model.staging().linkedService().referenceName());
        Assertions.assertEquals("bj", model.integrationRuntime().referenceName());
        Assertions.assertEquals("wrwjbanteeu", model.sinks().get("fbweuazxtsgs").name());
        Assertions.assertEquals("icaikfvj", model.sinks().get("fbweuazxtsgs").description());
        Assertions.assertEquals("fpob", model.sinks().get("fbweuazxtsgs").dataset().referenceName());
        Assertions.assertEquals("kn", model.sinks().get("fbweuazxtsgs").linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.sinks().get("fbweuazxtsgs").flowlet().type());
        Assertions.assertEquals("jpdyztqpszbt", model.sinks().get("fbweuazxtsgs").flowlet().referenceName());
        Assertions.assertEquals("viykwrffxo", model.sinks().get("fbweuazxtsgs").schemaLinkedService().referenceName());
        Assertions.assertEquals("wzpauwhfh",
            model.sinks().get("fbweuazxtsgs").rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("abnwsgauwepojmx", model.sinks().get("fbweuazxtsgs").script());
        Assertions.assertEquals("yqsnttwlxvezoald", model.queries().get(0).queryName());
        Assertions.assertEquals("ihtxvmnyslpdqd", model.queries().get(0).dataflowSinks().get(0).name());
        Assertions.assertEquals("j", model.queries().get(0).dataflowSinks().get(0).description());
        Assertions.assertEquals("blnervt", model.queries().get(0).dataflowSinks().get(0).dataset().referenceName());
        Assertions.assertEquals("bqygnfxgzzq",
            model.queries().get(0).dataflowSinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.queries().get(0).dataflowSinks().get(0).flowlet().type());
        Assertions.assertEquals("poookhcurwgbjzz",
            model.queries().get(0).dataflowSinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("anxinlmi",
            model.queries().get(0).dataflowSinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("mapfieaumqjxd",
            model.queries().get(0).dataflowSinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("xcqto", model.queries().get(0).dataflowSinks().get(0).script());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        ExecutePowerQueryActivityTypeProperties model = new ExecutePowerQueryActivityTypeProperties()
            .withDataFlow(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                .withReferenceName("gxrgqskdk").withDatasetParameters("dataobegdxjxkxvgod").withParameters(
                    mapOf("nulrfeqefqdvooqj", "dataefa"))
                .withAdditionalProperties(mapOf()))
            .withStaging(
                new DataFlowStagingInfo().withLinkedService(new LinkedServiceReference().withReferenceName("vr")
                    .withParameters(mapOf("ttpvomxtosdbvu", "datag", "oheebzewbif", "dataoi", "vvuewrhkjmphfhm",
                        "datayptlbadhdlrr", "uulhfdggsr", "dataao")))
                    .withFolderPath("datalhhlg"))
            .withIntegrationRuntime(new IntegrationRuntimeReference().withReferenceName("bj")
                .withParameters(mapOf("hocrphzdkikjy", "datatgelfkhmgs", "lupmyq", "dataaqk")))
            .withCompute(new ExecuteDataFlowActivityTypePropertiesCompute().withComputeType("dataararevvmmjwmldg")
                .withCoreCount("dataglm"))
            .withTraceLevel("dataatyry").withContinueOnError("dataon").withRunConcurrently("datanm")
            .withSourceStagingConcurrency("databgpgvliinueltcoi")
            .withSinks(mapOf("fbweuazxtsgs", new PowerQuerySink().withName("wrwjbanteeu").withDescription("icaikfvj")
                .withDataset(new DatasetReference().withReferenceName("fpob")
                    .withParameters(mapOf("dlp", "datarqjiol", "f", "datayksqnsrvgh", "wtucv", "datadrqmcgeqybord",
                        "orsgc", "dataviymvgnqqfnv")))
                .withLinkedService(new LinkedServiceReference().withReferenceName("kn")
                    .withParameters(mapOf("bbzfcjmhp", "datacnezdplcbq")))
                .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                    .withReferenceName("jpdyztqpszbt").withDatasetParameters("dataymbyltdnr")
                    .withParameters(mapOf("iz", "datahxo", "jiyl", "datawihadcotfo")).withAdditionalProperties(mapOf()))
                .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("viykwrffxo")
                    .withParameters(mapOf("dyuoz", "datahcxpzjewoyqlcv", "npuquyatvsnkrxh", "datatsj", "ldtjzi",
                        "dataegwvblrgrzlrnuy")))
                .withRejectedDataLinkedService(
                    new LinkedServiceReference().withReferenceName("wzpauwhfh").withParameters(
                        mapOf("wgsyi", "dataolojcaybukj", "ekxvlejh", "dataqlghrcctvlnnkvdr", "u", "databqzxqid")))
                .withScript("abnwsgauwepojmx"), "pfisyydoy",
                new PowerQuerySink().withName("rdicwmueavawyw").withDescription("gcc")
                    .withDataset(new DatasetReference().withReferenceName("hjvvrrxclf")
                        .withParameters(mapOf("wxxfkfthwxoss", "dataifqwyiuhhuftnuig", "stgsmeijgjbevts", "datakafym",
                            "ywal", "datacsyjxdwvdklgw", "eelbcsyaohizfysa", "datafmenbaj")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("bupftkddohxvcso")
                        .withParameters(mapOf("ywttdanu", "datadcqp")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("tkhcmoccgtmfu").withDatasetParameters("datakhmbks")
                        .withParameters(mapOf("xdsnmhndcr", "datazt")).withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("dgimsbump")
                        .withParameters(mapOf("w", "datacarcyrftcjxzmx", "vxrcmrdmyjcou", "datahdlrfyonnb",
                            "zirkyxhqwoxm", "datazodolehchimzrc", "lwhpqnzpfpsppkq", "dataobuanybfm")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("dmgmfy")
                        .withParameters(mapOf("fx", "datafkfgrdrilh", "gz", "datarqpickn")))
                    .withScript("adsbacemwn"),
                "btmh",
                new PowerQuerySink().withName("nijdr").withDescription("ohjgdoi")
                    .withDataset(new DatasetReference().withReferenceName("rylzsgpoi")
                        .withParameters(mapOf("ja", "datazqko", "zkq", "datadm")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("zytazqsu")
                        .withParameters(mapOf("osdizpgcq", "datapvtwgbf", "gwvvenmuenoq", "dataglzfgepblhe",
                            "oixiduzrdvhgyj", "dataamrytrny", "fwlxkxlru", "datambj")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("olxlxlezzy").withDatasetParameters("datazz")
                        .withParameters(mapOf("jiaycgxwacuu", "datadelmxbxbyx", "jbhuzybms", "datanygtsjafvzd",
                            "uvbnmzjwhybsgz", "dataz"))
                        .withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("hqvmilpgxeaqwogp")
                        .withParameters(mapOf("edfmc", "datamyfg", "ti", "datar", "voqsudtmkmg", "datadkypckhqooqni")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("pv")
                        .withParameters(mapOf("kghugfdugqhmo", "datagvpsukkk", "tjtiidozfrgvqurr", "dataekoxylcbp")))
                    .withScript("cwvcfayll"),
                "plwyluvqp",
                new PowerQuerySink().withName("el").withDescription("lrdgpudbimehdx")
                    .withDataset(new DatasetReference().withReferenceName("tyfhwkb")
                        .withParameters(mapOf("ei", "datafnyoautebehjrmfe", "pyirngfujv", "datanhwgzunbcvfz",
                            "rsxxcaxgr", "dataafrqqfgudobutkq", "wpuas", "dataikiuxvdnchrvsfnl")))
                    .withLinkedService(new LinkedServiceReference().withReferenceName("cblv").withParameters(
                        mapOf("xxt", "datadi", "iwvznffmxtmq", "datavoasdhd", "xpmtztvxfglil", "datartpdyhbpfxmr")))
                    .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                        .withReferenceName("owrzqy").withDatasetParameters("datajxsgrtnit")
                        .withParameters(mapOf("ffexzzi", "datapgenyvpxpcjnb")).withAdditionalProperties(mapOf()))
                    .withSchemaLinkedService(
                        new LinkedServiceReference().withReferenceName("r")
                            .withParameters(mapOf("gvksoxyk", "dataypauqyaisdiwo", "enl", "datama", "ebg",
                                "datavahjlvbnl")))
                    .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("opsgedsyykueifm")
                        .withParameters(mapOf("b", "datatlfdiqzvazffz")))
                    .withScript("mpt")))
            .withQueries(Arrays.asList(
                new PowerQuerySinkMapping().withQueryName("yqsnttwlxvezoald").withDataflowSinks(Arrays.asList(
                    new PowerQuerySink().withName("ihtxvmnyslpdqd").withDescription("j")
                        .withDataset(new DatasetReference().withReferenceName("blnervt")
                            .withParameters(mapOf("si", "datadtnjxvtvyy")))
                        .withLinkedService(new LinkedServiceReference().withReferenceName("bqygnfxgzzq")
                            .withParameters(mapOf("jsugkdv", "datavjhmqpjbk", "efdsgfztmhvu", "datagpeitfbgyznsh")))
                        .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                            .withReferenceName("poookhcurwgbjzz").withDatasetParameters("datajwqwyhh")
                            .withParameters(mapOf("ywzpcxnbb", "datatseejtfnjrrxfb", "ywdckvcofstceehq",
                                "datajgvalowmmhhu", "fujpo", "dataah", "edruumldunalog", "datatakijwk"))
                            .withAdditionalProperties(mapOf()))
                        .withSchemaLinkedService(
                            new LinkedServiceReference().withReferenceName("anxinlmi").withParameters(
                                mapOf("uivzsjf", "datau", "ayk", "datanenhyhdu", "tzsltsxmdace", "datajhwybbdaedq")))
                        .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("mapfieaumqjxd")
                            .withParameters(mapOf("uiamr", "datac", "fpwjjtdzfyivv", "datalhfxjcq", "zfvysvudbj",
                                "dataxqpemqogto")))
                        .withScript("xcqto"),
                    new PowerQuerySink().withName("c").withDescription("ukupngorw")
                        .withDataset(new DatasetReference().withReferenceName("yrguxfjjgcfqfwgr")
                            .withParameters(mapOf("rujdskkkz", "datafhkbjgxkrppxj", "zdakfxzhapcwhj",
                                "dataladibsjirhaqedfu", "bdxsjceyyebgfffn", "datamjfr", "yfugk", "datarbnvwhqctq")))
                        .withLinkedService(new LinkedServiceReference().withReferenceName("xvevudywny")
                            .withParameters(mapOf("xagtiyvdslrrtv", "datanaynlxwukpqcf")))
                        .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                            .withReferenceName("zmzbaqrxz").withDatasetParameters("dataxtmedoykekbdwqwh")
                            .withParameters(mapOf("eisqkotbmhryri", "datayrfjzyiniuua"))
                            .withAdditionalProperties(mapOf()))
                        .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("gtwaquiuzsnjjgnm")
                            .withParameters(mapOf("wt", "datasjfvdajmczlvcxm", "b", "datarpd")))
                        .withRejectedDataLinkedService(
                            new LinkedServiceReference().withReferenceName("xzxwjzleeupqlszc")
                                .withParameters(mapOf("fxnxtiwinn", "dataayraatrjpar", "zgmfnpeluvxs", "dataowihsgt")))
                        .withScript("z"),
                    new PowerQuerySink().withName("y").withDescription("nqneo")
                        .withDataset(new DatasetReference().withReferenceName("crmng")
                            .withParameters(mapOf("cxrxduxct", "datainl", "gm", "datajxtkmd", "ipabturkmk",
                                "datavfuylpctlbuo", "zzsohcaet", "datacsqktgko")))
                        .withLinkedService(new LinkedServiceReference().withReferenceName("pm").withParameters(
                            mapOf("li", "dataqxlkya", "ubtykyz", "dataoodn", "tgbsdaruwv", "datargiyqzuhnbazd")))
                        .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                            .withReferenceName("oozyhucadeqslhz").withDatasetParameters("dataimqazolroqusrlkp")
                            .withParameters(mapOf("mkbpdpk", "dataqydrnwsfa", "slqikocgzjmjdoq", "datalh"))
                            .withAdditionalProperties(mapOf()))
                        .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("zfgdxyrpp")
                            .withParameters(mapOf("tbpaircnupmz", "datadohiotgf")))
                        .withRejectedDataLinkedService(
                            new LinkedServiceReference().withReferenceName("tziejoebzofmmce").withParameters(
                                mapOf("kpqnpdlcyjse", "datafhjrsxrmlxszx", "umlfdxetqknzev", "datadfhnhbktobeonl")))
                        .withScript("yscwv"),
                    new PowerQuerySink().withName("vyiti").withDescription("zxseyjqklaihqrbr")
                        .withDataset(new DatasetReference().withReferenceName("hljqqbue")
                            .withParameters(mapOf("tifbvcveomdl", "datadjsu")))
                        .withLinkedService(new LinkedServiceReference().withReferenceName("jguwdfn")
                            .withParameters(mapOf("ojmynlvovjs", "datauqufaowuibujj", "h", "dataxewfqvlhjawm")))
                        .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                            .withReferenceName("zlrnfmmef").withDatasetParameters("datajxtgffwq")
                            .withParameters(mapOf("t", "datagfgirrzyngdvdr", "kqaqfbimfpnpmkdg", "dataqfrxggvstyxv",
                                "jeffpidwqr", "datandwtdorvxdwgpu"))
                            .withAdditionalProperties(mapOf()))
                        .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("ynbs")
                            .withParameters(mapOf("lgfecsreojs", "datareqvxzlwgaius")))
                        .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("kxbbzi")
                            .withParameters(mapOf("yg", "datavvgjxbmgheyamoe")))
                        .withScript("jtjc"))),
                new PowerQuerySinkMapping().withQueryName("mzfltxqpozqd")
                    .withDataflowSinks(Arrays.asList(new PowerQuerySink().withName("bdv").withDescription("qsmk")
                        .withDataset(new DatasetReference().withReferenceName("qljxnkpdimexro")
                            .withParameters(mapOf("wovl", "datadptsdlcsrhttmhj")))
                        .withLinkedService(new LinkedServiceReference().withReferenceName("zquckrcw")
                            .withParameters(mapOf("sjawbnxcizeuifnd", "dataqqkknulrqpacusm", "nzjyghq", "datar", "ln",
                                "datafs", "ems", "datavgec")))
                        .withFlowlet(new DataFlowReference().withType(DataFlowReferenceType.DATA_FLOW_REFERENCE)
                            .withReferenceName("rkgt").withDatasetParameters("dataxlaywkbuvedw")
                            .withParameters(mapOf("dgtwx", "dataeyfdgnaoirru")).withAdditionalProperties(mapOf()))
                        .withSchemaLinkedService(new LinkedServiceReference().withReferenceName("gjkkjwjn")
                            .withParameters(mapOf("b", "dataswmwv", "sph", "dataazjmfq", "ifj", "datavthkgjaaqhd",
                                "nquj", "datafrg")))
                        .withRejectedDataLinkedService(new LinkedServiceReference().withReferenceName("wpjpka")
                            .withParameters(mapOf("btlmnrdkiqs", "dataafhvuy")))
                        .withScript("fe")))));
        model = BinaryData.fromObject(model).toObject(ExecutePowerQueryActivityTypeProperties.class);
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE, model.dataFlow().type());
        Assertions.assertEquals("gxrgqskdk", model.dataFlow().referenceName());
        Assertions.assertEquals("vr", model.staging().linkedService().referenceName());
        Assertions.assertEquals("bj", model.integrationRuntime().referenceName());
        Assertions.assertEquals("wrwjbanteeu", model.sinks().get("fbweuazxtsgs").name());
        Assertions.assertEquals("icaikfvj", model.sinks().get("fbweuazxtsgs").description());
        Assertions.assertEquals("fpob", model.sinks().get("fbweuazxtsgs").dataset().referenceName());
        Assertions.assertEquals("kn", model.sinks().get("fbweuazxtsgs").linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.sinks().get("fbweuazxtsgs").flowlet().type());
        Assertions.assertEquals("jpdyztqpszbt", model.sinks().get("fbweuazxtsgs").flowlet().referenceName());
        Assertions.assertEquals("viykwrffxo", model.sinks().get("fbweuazxtsgs").schemaLinkedService().referenceName());
        Assertions.assertEquals("wzpauwhfh",
            model.sinks().get("fbweuazxtsgs").rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("abnwsgauwepojmx", model.sinks().get("fbweuazxtsgs").script());
        Assertions.assertEquals("yqsnttwlxvezoald", model.queries().get(0).queryName());
        Assertions.assertEquals("ihtxvmnyslpdqd", model.queries().get(0).dataflowSinks().get(0).name());
        Assertions.assertEquals("j", model.queries().get(0).dataflowSinks().get(0).description());
        Assertions.assertEquals("blnervt", model.queries().get(0).dataflowSinks().get(0).dataset().referenceName());
        Assertions.assertEquals("bqygnfxgzzq",
            model.queries().get(0).dataflowSinks().get(0).linkedService().referenceName());
        Assertions.assertEquals(DataFlowReferenceType.DATA_FLOW_REFERENCE,
            model.queries().get(0).dataflowSinks().get(0).flowlet().type());
        Assertions.assertEquals("poookhcurwgbjzz",
            model.queries().get(0).dataflowSinks().get(0).flowlet().referenceName());
        Assertions.assertEquals("anxinlmi",
            model.queries().get(0).dataflowSinks().get(0).schemaLinkedService().referenceName());
        Assertions.assertEquals("mapfieaumqjxd",
            model.queries().get(0).dataflowSinks().get(0).rejectedDataLinkedService().referenceName());
        Assertions.assertEquals("xcqto", model.queries().get(0).dataflowSinks().get(0).script());
    }

    // Use "Map.of" if available
    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
