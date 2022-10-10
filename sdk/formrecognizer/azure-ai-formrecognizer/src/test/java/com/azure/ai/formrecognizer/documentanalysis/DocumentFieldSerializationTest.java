// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.formrecognizer.documentanalysis;

import com.azure.ai.formrecognizer.documentanalysis.models.AnalyzeResult;
import com.azure.ai.formrecognizer.documentanalysis.models.OperationResult;
import com.azure.core.http.HttpClient;
import com.azure.core.util.BinaryData;
import com.azure.core.util.polling.SyncPoller;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

import static com.azure.ai.formrecognizer.documentanalysis.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static com.azure.ai.formrecognizer.documentanalysis.TestUtils.INSURANCE_PNG;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DocumentFieldSerializationTest extends DocumentAnalysisClientTestBase {
    private DocumentAnalysisClient client;
    private String expectedDeserializedString = "{\"modelId\":\"prebuilt-healthInsuranceCard.us\",\"content\":\"Microsoft\\nPREMERA|\\nBLUE CROSS\\nMember\\nMedical Network HERITAGE\\nANGEL BROWN\\nPremera Dental\\nYES\\nPrefix Identification # Suffix ABC 123456789 01\\nPremera Vision\\nYES\\nGroup # 1000000\\nHEALTH SAVINGS PLAN\\nRx Group # BCAAXYZ\\nShared In and Out of Network Deductible $1,500\\nRx BIN# 987654\\nCoinsurance Max\\n$1,000\\nBCBS 456\\nNote: Rx and Medical Cost-Shares are Shared\\nRx\\nPPO\",\"pages\":[{\"pageNumber\":1,\"angle\":-0.1042,\"width\":1000.0,\"height\":700.0,\"unit\":\"pixel\",\"spans\":[{\"offset\":0,\"length\":359}],\"words\":[{\"content\":\"Microsoft\",\"boundingPolygon\":[{\"y\":105.0,\"x\":708.0},{\"y\":107.0,\"x\":859.0},{\"y\":138.0,\"x\":859.0},{\"y\":134.0,\"x\":708.0}],\"span\":{\"offset\":0,\"length\":9},\"confidence\":0.995},{\"content\":\"PREMERA|\",\"boundingPolygon\":[{\"y\":66.0,\"x\":82.0},{\"y\":64.0,\"x\":315.0},{\"y\":114.0,\"x\":313.0},{\"y\":113.0,\"x\":80.0}],\"span\":{\"offset\":10,\"length\":8},\"confidence\":0.846},{\"content\":\"BLUE\",\"boundingPolygon\":[{\"y\":128.0,\"x\":83.0},{\"y\":128.0,\"x\":127.0},{\"y\":144.0,\"x\":126.0},{\"y\":144.0,\"x\":82.0}],\"span\":{\"offset\":19,\"length\":4},\"confidence\":0.991},{\"content\":\"CROSS\",\"boundingPolygon\":[{\"y\":128.0,\"x\":135.0},{\"y\":128.0,\"x\":196.0},{\"y\":144.0,\"x\":196.0},{\"y\":144.0,\"x\":135.0}],\"span\":{\"offset\":24,\"length\":5},\"confidence\":0.997},{\"content\":\"Member\",\"boundingPolygon\":[{\"y\":198.0,\"x\":73.0},{\"y\":198.0,\"x\":167.0},{\"y\":220.0,\"x\":167.0},{\"y\":221.0,\"x\":73.0}],\"span\":{\"offset\":30,\"length\":6},\"confidence\":0.997},{\"content\":\"Medical\",\"boundingPolygon\":[{\"y\":200.0,\"x\":546.0},{\"y\":199.0,\"x\":621.0},{\"y\":221.0,\"x\":621.0},{\"y\":220.0,\"x\":546.0}],\"span\":{\"offset\":37,\"length\":7},\"confidence\":0.995},{\"content\":\"Network\",\"boundingPolygon\":[{\"y\":199.0,\"x\":626.0},{\"y\":199.0,\"x\":710.0},{\"y\":222.0,\"x\":710.0},{\"y\":221.0,\"x\":626.0}],\"span\":{\"offset\":45,\"length\":7},\"confidence\":0.996},{\"content\":\"HERITAGE\",\"boundingPolygon\":[{\"y\":199.0,\"x\":719.0},{\"y\":199.0,\"x\":839.0},{\"y\":222.0,\"x\":839.0},{\"y\":222.0,\"x\":719.0}],\"span\":{\"offset\":53,\"length\":8},\"confidence\":0.993},{\"content\":\"ANGEL\",\"boundingPolygon\":[{\"y\":229.0,\"x\":75.0},{\"y\":230.0,\"x\":153.0},{\"y\":251.0,\"x\":152.0},{\"y\":252.0,\"x\":75.0}],\"span\":{\"offset\":62,\"length\":5},\"confidence\":0.994},{\"content\":\"BROWN\",\"boundingPolygon\":[{\"y\":230.0,\"x\":160.0},{\"y\":228.0,\"x\":247.0},{\"y\":251.0,\"x\":246.0},{\"y\":251.0,\"x\":160.0}],\"span\":{\"offset\":68,\"length\":5},\"confidence\":0.997},{\"content\":\"Premera\",\"boundingPolygon\":[{\"y\":233.0,\"x\":548.0},{\"y\":234.0,\"x\":643.0},{\"y\":258.0,\"x\":643.0},{\"y\":258.0,\"x\":548.0}],\"span\":{\"offset\":74,\"length\":7},\"confidence\":0.996},{\"content\":\"Dental\",\"boundingPolygon\":[{\"y\":234.0,\"x\":648.0},{\"y\":233.0,\"x\":726.0},{\"y\":258.0,\"x\":726.0},{\"y\":258.0,\"x\":648.0}],\"span\":{\"offset\":82,\"length\":6},\"confidence\":0.997},{\"content\":\"YES\",\"boundingPolygon\":[{\"y\":233.0,\"x\":779.0},{\"y\":233.0,\"x\":823.0},{\"y\":257.0,\"x\":823.0},{\"y\":257.0,\"x\":779.0}],\"span\":{\"offset\":89,\"length\":3},\"confidence\":0.991},{\"content\":\"Prefix\",\"boundingPolygon\":[{\"y\":270.0,\"x\":72.0},{\"y\":270.0,\"x\":138.0},{\"y\":293.0,\"x\":138.0},{\"y\":293.0,\"x\":73.0}],\"span\":{\"offset\":93,\"length\":6},\"confidence\":0.993},{\"content\":\"Identification\",\"boundingPolygon\":[{\"y\":270.0,\"x\":155.0},{\"y\":269.0,\"x\":307.0},{\"y\":293.0,\"x\":307.0},{\"y\":293.0,\"x\":156.0}],\"span\":{\"offset\":100,\"length\":14},\"confidence\":0.931},{\"content\":\"#\",\"boundingPolygon\":[{\"y\":269.0,\"x\":315.0},{\"y\":269.0,\"x\":330.0},{\"y\":293.0,\"x\":330.0},{\"y\":293.0,\"x\":315.0}],\"span\":{\"offset\":115,\"length\":1},\"confidence\":0.982},{\"content\":\"Suffix\",\"boundingPolygon\":[{\"y\":269.0,\"x\":343.0},{\"y\":269.0,\"x\":414.0},{\"y\":293.0,\"x\":414.0},{\"y\":293.0,\"x\":343.0}],\"span\":{\"offset\":117,\"length\":6},\"confidence\":0.997},{\"content\":\"ABC\",\"boundingPolygon\":[{\"y\":305.0,\"x\":74.0},{\"y\":305.0,\"x\":122.0},{\"y\":328.0,\"x\":122.0},{\"y\":328.0,\"x\":74.0}],\"span\":{\"offset\":124,\"length\":3},\"confidence\":0.996},{\"content\":\"123456789\",\"boundingPolygon\":[{\"y\":306.0,\"x\":157.0},{\"y\":305.0,\"x\":283.0},{\"y\":329.0,\"x\":282.0},{\"y\":329.0,\"x\":157.0}],\"span\":{\"offset\":128,\"length\":9},\"confidence\":0.994},{\"content\":\"01\",\"boundingPolygon\":[{\"y\":305.0,\"x\":340.0},{\"y\":305.0,\"x\":368.0},{\"y\":328.0,\"x\":369.0},{\"y\":329.0,\"x\":340.0}],\"span\":{\"offset\":138,\"length\":2},\"confidence\":0.997},{\"content\":\"Premera\",\"boundingPolygon\":[{\"y\":269.0,\"x\":547.0},{\"y\":269.0,\"x\":645.0},{\"y\":295.0,\"x\":646.0},{\"y\":295.0,\"x\":548.0}],\"span\":{\"offset\":141,\"length\":7},\"confidence\":0.996},{\"content\":\"Vision\",\"boundingPolygon\":[{\"y\":269.0,\"x\":651.0},{\"y\":269.0,\"x\":722.0},{\"y\":295.0,\"x\":722.0},{\"y\":295.0,\"x\":651.0}],\"span\":{\"offset\":149,\"length\":6},\"confidence\":0.997},{\"content\":\"YES\",\"boundingPolygon\":[{\"y\":269.0,\"x\":779.0},{\"y\":269.0,\"x\":823.0},{\"y\":292.0,\"x\":823.0},{\"y\":292.0,\"x\":779.0}],\"span\":{\"offset\":156,\"length\":3},\"confidence\":0.997},{\"content\":\"Group\",\"boundingPolygon\":[{\"y\":369.0,\"x\":70.0},{\"y\":368.0,\"x\":141.0},{\"y\":395.0,\"x\":140.0},{\"y\":395.0,\"x\":70.0}],\"span\":{\"offset\":160,\"length\":5},\"confidence\":0.994},{\"content\":\"#\",\"boundingPolygon\":[{\"y\":368.0,\"x\":146.0},{\"y\":368.0,\"x\":163.0},{\"y\":395.0,\"x\":163.0},{\"y\":395.0,\"x\":146.0}],\"span\":{\"offset\":166,\"length\":1},\"confidence\":0.991},{\"content\":\"1000000\",\"boundingPolygon\":[{\"y\":367.0,\"x\":172.0},{\"y\":366.0,\"x\":269.0},{\"y\":393.0,\"x\":269.0},{\"y\":395.0,\"x\":172.0}],\"span\":{\"offset\":168,\"length\":7},\"confidence\":0.996},{\"content\":\"HEALTH\",\"boundingPolygon\":[{\"y\":366.0,\"x\":548.0},{\"y\":366.0,\"x\":639.0},{\"y\":390.0,\"x\":639.0},{\"y\":390.0,\"x\":548.0}],\"span\":{\"offset\":176,\"length\":6},\"confidence\":0.994},{\"content\":\"SAVINGS\",\"boundingPolygon\":[{\"y\":366.0,\"x\":649.0},{\"y\":366.0,\"x\":757.0},{\"y\":390.0,\"x\":756.0},{\"y\":390.0,\"x\":649.0}],\"span\":{\"offset\":183,\"length\":7},\"confidence\":0.995},{\"content\":\"PLAN\",\"boundingPolygon\":[{\"y\":366.0,\"x\":765.0},{\"y\":366.0,\"x\":827.0},{\"y\":389.0,\"x\":826.0},{\"y\":390.0,\"x\":764.0}],\"span\":{\"offset\":191,\"length\":4},\"confidence\":0.988},{\"content\":\"Rx\",\"boundingPolygon\":[{\"y\":404.0,\"x\":70.0},{\"y\":404.0,\"x\":100.0},{\"y\":431.0,\"x\":100.0},{\"y\":430.0,\"x\":69.0}],\"span\":{\"offset\":196,\"length\":2},\"confidence\":0.994},{\"content\":\"Group\",\"boundingPolygon\":[{\"y\":404.0,\"x\":106.0},{\"y\":405.0,\"x\":177.0},{\"y\":431.0,\"x\":177.0},{\"y\":431.0,\"x\":105.0}],\"span\":{\"offset\":199,\"length\":5},\"confidence\":0.997},{\"content\":\"#\",\"boundingPolygon\":[{\"y\":405.0,\"x\":183.0},{\"y\":405.0,\"x\":199.0},{\"y\":431.0,\"x\":198.0},{\"y\":431.0,\"x\":182.0}],\"span\":{\"offset\":205,\"length\":1},\"confidence\":0.987},{\"content\":\"BCAAXYZ\",\"boundingPolygon\":[{\"y\":405.0,\"x\":211.0},{\"y\":405.0,\"x\":329.0},{\"y\":426.0,\"x\":328.0},{\"y\":431.0,\"x\":210.0}],\"span\":{\"offset\":207,\"length\":7},\"confidence\":0.995},{\"content\":\"Shared\",\"boundingPolygon\":[{\"y\":398.0,\"x\":692.0},{\"y\":398.0,\"x\":756.0},{\"y\":418.0,\"x\":756.0},{\"y\":418.0,\"x\":692.0}],\"span\":{\"offset\":215,\"length\":6},\"confidence\":0.993},{\"content\":\"In\",\"boundingPolygon\":[{\"y\":398.0,\"x\":763.0},{\"y\":398.0,\"x\":781.0},{\"y\":418.0,\"x\":781.0},{\"y\":418.0,\"x\":763.0}],\"span\":{\"offset\":222,\"length\":2},\"confidence\":0.996},{\"content\":\"and\",\"boundingPolygon\":[{\"y\":398.0,\"x\":786.0},{\"y\":398.0,\"x\":821.0},{\"y\":418.0,\"x\":821.0},{\"y\":418.0,\"x\":786.0}],\"span\":{\"offset\":225,\"length\":3},\"confidence\":0.998},{\"content\":\"Out\",\"boundingPolygon\":[{\"y\":398.0,\"x\":827.0},{\"y\":398.0,\"x\":862.0},{\"y\":418.0,\"x\":862.0},{\"y\":418.0,\"x\":827.0}],\"span\":{\"offset\":229,\"length\":3},\"confidence\":0.993},{\"content\":\"of\",\"boundingPolygon\":[{\"y\":398.0,\"x\":866.0},{\"y\":398.0,\"x\":885.0},{\"y\":417.0,\"x\":885.0},{\"y\":418.0,\"x\":866.0}],\"span\":{\"offset\":233,\"length\":2},\"confidence\":0.997},{\"content\":\"Network\",\"boundingPolygon\":[{\"y\":398.0,\"x\":889.0},{\"y\":397.0,\"x\":964.0},{\"y\":417.0,\"x\":965.0},{\"y\":417.0,\"x\":889.0}],\"span\":{\"offset\":236,\"length\":7},\"confidence\":0.996},{\"content\":\"Deductible\",\"boundingPolygon\":[{\"y\":420.0,\"x\":547.0},{\"y\":420.0,\"x\":654.0},{\"y\":439.0,\"x\":654.0},{\"y\":440.0,\"x\":548.0}],\"span\":{\"offset\":244,\"length\":10},\"confidence\":0.981},{\"content\":\"$1,500\",\"boundingPolygon\":[{\"y\":419.0,\"x\":760.0},{\"y\":420.0,\"x\":823.0},{\"y\":441.0,\"x\":823.0},{\"y\":439.0,\"x\":760.0}],\"span\":{\"offset\":255,\"length\":6},\"confidence\":0.992},{\"content\":\"Rx\",\"boundingPolygon\":[{\"y\":440.0,\"x\":70.0},{\"y\":440.0,\"x\":99.0},{\"y\":463.0,\"x\":98.0},{\"y\":463.0,\"x\":70.0}],\"span\":{\"offset\":262,\"length\":2},\"confidence\":0.995},{\"content\":\"BIN#\",\"boundingPolygon\":[{\"y\":440.0,\"x\":106.0},{\"y\":440.0,\"x\":161.0},{\"y\":464.0,\"x\":161.0},{\"y\":463.0,\"x\":105.0}],\"span\":{\"offset\":265,\"length\":4},\"confidence\":0.984},{\"content\":\"987654\",\"boundingPolygon\":[{\"y\":440.0,\"x\":177.0},{\"y\":440.0,\"x\":258.0},{\"y\":464.0,\"x\":257.0},{\"y\":464.0,\"x\":177.0}],\"span\":{\"offset\":270,\"length\":6},\"confidence\":0.996},{\"content\":\"Coinsurance\",\"boundingPolygon\":[{\"y\":449.0,\"x\":548.0},{\"y\":449.0,\"x\":674.0},{\"y\":469.0,\"x\":674.0},{\"y\":470.0,\"x\":549.0}],\"span\":{\"offset\":277,\"length\":11},\"confidence\":0.991},{\"content\":\"Max\",\"boundingPolygon\":[{\"y\":449.0,\"x\":679.0},{\"y\":449.0,\"x\":721.0},{\"y\":469.0,\"x\":721.0},{\"y\":469.0,\"x\":679.0}],\"span\":{\"offset\":289,\"length\":3},\"confidence\":0.997},{\"content\":\"$1,000\",\"boundingPolygon\":[{\"y\":448.0,\"x\":763.0},{\"y\":448.0,\"x\":825.0},{\"y\":469.0,\"x\":824.0},{\"y\":469.0,\"x\":763.0}],\"span\":{\"offset\":293,\"length\":6},\"confidence\":0.993},{\"content\":\"BCBS\",\"boundingPolygon\":[{\"y\":476.0,\"x\":69.0},{\"y\":476.0,\"x\":133.0},{\"y\":499.0,\"x\":134.0},{\"y\":500.0,\"x\":70.0}],\"span\":{\"offset\":300,\"length\":4},\"confidence\":0.995},{\"content\":\"456\",\"boundingPolygon\":[{\"y\":475.0,\"x\":151.0},{\"y\":475.0,\"x\":190.0},{\"y\":499.0,\"x\":191.0},{\"y\":499.0,\"x\":151.0}],\"span\":{\"offset\":305,\"length\":3},\"confidence\":0.998},{\"content\":\"Note:\",\"boundingPolygon\":[{\"y\":541.0,\"x\":548.0},{\"y\":540.0,\"x\":585.0},{\"y\":556.0,\"x\":586.0},{\"y\":556.0,\"x\":548.0}],\"span\":{\"offset\":309,\"length\":5},\"confidence\":0.993},{\"content\":\"Rx\",\"boundingPolygon\":[{\"y\":540.0,\"x\":589.0},{\"y\":540.0,\"x\":610.0},{\"y\":556.0,\"x\":610.0},{\"y\":556.0,\"x\":589.0}],\"span\":{\"offset\":315,\"length\":2},\"confidence\":0.959},{\"content\":\"and\",\"boundingPolygon\":[{\"y\":540.0,\"x\":614.0},{\"y\":540.0,\"x\":641.0},{\"y\":556.0,\"x\":642.0},{\"y\":556.0,\"x\":614.0}],\"span\":{\"offset\":318,\"length\":3},\"confidence\":0.997},{\"content\":\"Medical\",\"boundingPolygon\":[{\"y\":540.0,\"x\":645.0},{\"y\":539.0,\"x\":701.0},{\"y\":555.0,\"x\":701.0},{\"y\":556.0,\"x\":645.0}],\"span\":{\"offset\":322,\"length\":7},\"confidence\":0.995},{\"content\":\"Cost-Shares\",\"boundingPolygon\":[{\"y\":539.0,\"x\":704.0},{\"y\":537.0,\"x\":793.0},{\"y\":554.0,\"x\":793.0},{\"y\":555.0,\"x\":704.0}],\"span\":{\"offset\":330,\"length\":11},\"confidence\":0.993},{\"content\":\"are\",\"boundingPolygon\":[{\"y\":537.0,\"x\":797.0},{\"y\":537.0,\"x\":819.0},{\"y\":553.0,\"x\":819.0},{\"y\":554.0,\"x\":797.0}],\"span\":{\"offset\":342,\"length\":3},\"confidence\":0.997},{\"content\":\"Shared\",\"boundingPolygon\":[{\"y\":537.0,\"x\":823.0},{\"y\":535.0,\"x\":873.0},{\"y\":552.0,\"x\":873.0},{\"y\":553.0,\"x\":823.0}],\"span\":{\"offset\":346,\"length\":6},\"confidence\":0.997},{\"content\":\"Rx\",\"boundingPolygon\":[{\"y\":574.0,\"x\":128.0},{\"y\":574.0,\"x\":198.0},{\"y\":621.0,\"x\":198.0},{\"y\":621.0,\"x\":128.0}],\"span\":{\"offset\":353,\"length\":2},\"confidence\":0.991},{\"content\":\"PPO\",\"boundingPolygon\":[{\"y\":591.0,\"x\":903.0},{\"y\":590.0,\"x\":947.0},{\"y\":614.0,\"x\":947.0},{\"y\":615.0,\"x\":903.0}],\"span\":{\"offset\":356,\"length\":3},\"confidence\":0.994}],\"selectionMarks\":null,\"lines\":[{\"content\":\"Microsoft\",\"boundingPolygon\":[{\"y\":104.0,\"x\":708.0},{\"y\":106.0,\"x\":860.0},{\"y\":137.0,\"x\":860.0},{\"y\":134.0,\"x\":707.0}],\"spans\":[{\"offset\":0,\"length\":9}]},{\"content\":\"PREMERA|\",\"boundingPolygon\":[{\"y\":65.0,\"x\":79.0},{\"y\":64.0,\"x\":316.0},{\"y\":112.0,\"x\":316.0},{\"y\":114.0,\"x\":79.0}],\"spans\":[{\"offset\":10,\"length\":8}]},{\"content\":\"BLUE CROSS\",\"boundingPolygon\":[{\"y\":127.0,\"x\":82.0},{\"y\":127.0,\"x\":201.0},{\"y\":144.0,\"x\":201.0},{\"y\":144.0,\"x\":82.0}],\"spans\":[{\"offset\":19,\"length\":10}]},{\"content\":\"Member\",\"boundingPolygon\":[{\"y\":198.0,\"x\":73.0},{\"y\":198.0,\"x\":167.0},{\"y\":219.0,\"x\":167.0},{\"y\":220.0,\"x\":73.0}],\"spans\":[{\"offset\":30,\"length\":6}]},{\"content\":\"Medical Network HERITAGE\",\"boundingPolygon\":[{\"y\":198.0,\"x\":545.0},{\"y\":198.0,\"x\":845.0},{\"y\":221.0,\"x\":845.0},{\"y\":221.0,\"x\":545.0}],\"spans\":[{\"offset\":37,\"length\":24}]},{\"content\":\"ANGEL BROWN\",\"boundingPolygon\":[{\"y\":229.0,\"x\":74.0},{\"y\":228.0,\"x\":251.0},{\"y\":250.0,\"x\":251.0},{\"y\":251.0,\"x\":74.0}],\"spans\":[{\"offset\":62,\"length\":11}]},{\"content\":\"Premera Dental\",\"boundingPolygon\":[{\"y\":233.0,\"x\":547.0},{\"y\":233.0,\"x\":727.0},{\"y\":258.0,\"x\":727.0},{\"y\":258.0,\"x\":547.0}],\"spans\":[{\"offset\":74,\"length\":14}]},{\"content\":\"YES\",\"boundingPolygon\":[{\"y\":234.0,\"x\":779.0},{\"y\":233.0,\"x\":827.0},{\"y\":257.0,\"x\":828.0},{\"y\":256.0,\"x\":779.0}],\"spans\":[{\"offset\":89,\"length\":3}]},{\"content\":\"Prefix Identification # Suffix\",\"boundingPolygon\":[{\"y\":269.0,\"x\":71.0},{\"y\":268.0,\"x\":416.0},{\"y\":292.0,\"x\":416.0},{\"y\":293.0,\"x\":71.0}],\"spans\":[{\"offset\":93,\"length\":30}]},{\"content\":\"ABC 123456789\",\"boundingPolygon\":[{\"y\":305.0,\"x\":73.0},{\"y\":305.0,\"x\":286.0},{\"y\":328.0,\"x\":286.0},{\"y\":328.0,\"x\":73.0}],\"spans\":[{\"offset\":124,\"length\":13}]},{\"content\":\"01\",\"boundingPolygon\":[{\"y\":306.0,\"x\":340.0},{\"y\":305.0,\"x\":369.0},{\"y\":329.0,\"x\":369.0},{\"y\":329.0,\"x\":340.0}],\"spans\":[{\"offset\":138,\"length\":2}]},{\"content\":\"Premera Vision\",\"boundingPolygon\":[{\"y\":268.0,\"x\":547.0},{\"y\":269.0,\"x\":725.0},{\"y\":294.0,\"x\":725.0},{\"y\":294.0,\"x\":547.0}],\"spans\":[{\"offset\":141,\"length\":14}]},{\"content\":\"YES\",\"boundingPolygon\":[{\"y\":270.0,\"x\":778.0},{\"y\":269.0,\"x\":827.0},{\"y\":292.0,\"x\":826.0},{\"y\":292.0,\"x\":779.0}],\"spans\":[{\"offset\":156,\"length\":3}]},{\"content\":\"Group # 1000000\",\"boundingPolygon\":[{\"y\":368.0,\"x\":69.0},{\"y\":365.0,\"x\":271.0},{\"y\":392.0,\"x\":272.0},{\"y\":395.0,\"x\":69.0}],\"spans\":[{\"offset\":160,\"length\":15}]},{\"content\":\"HEALTH SAVINGS PLAN\",\"boundingPolygon\":[{\"y\":366.0,\"x\":548.0},{\"y\":365.0,\"x\":832.0},{\"y\":389.0,\"x\":833.0},{\"y\":390.0,\"x\":548.0}],\"spans\":[{\"offset\":176,\"length\":19}]},{\"content\":\"Rx Group # BCAAXYZ\",\"boundingPolygon\":[{\"y\":404.0,\"x\":69.0},{\"y\":404.0,\"x\":333.0},{\"y\":429.0,\"x\":333.0},{\"y\":431.0,\"x\":69.0}],\"spans\":[{\"offset\":196,\"length\":18}]},{\"content\":\"Shared In and Out of Network\",\"boundingPolygon\":[{\"y\":397.0,\"x\":691.0},{\"y\":397.0,\"x\":966.0},{\"y\":416.0,\"x\":966.0},{\"y\":417.0,\"x\":691.0}],\"spans\":[{\"offset\":215,\"length\":28}]},{\"content\":\"Deductible\",\"boundingPolygon\":[{\"y\":420.0,\"x\":547.0},{\"y\":419.0,\"x\":657.0},{\"y\":439.0,\"x\":657.0},{\"y\":440.0,\"x\":547.0}],\"spans\":[{\"offset\":244,\"length\":10}]},{\"content\":\"$1,500\",\"boundingPolygon\":[{\"y\":419.0,\"x\":759.0},{\"y\":420.0,\"x\":826.0},{\"y\":440.0,\"x\":825.0},{\"y\":439.0,\"x\":759.0}],\"spans\":[{\"offset\":255,\"length\":6}]},{\"content\":\"Rx BIN# 987654\",\"boundingPolygon\":[{\"y\":439.0,\"x\":69.0},{\"y\":440.0,\"x\":260.0},{\"y\":463.0,\"x\":260.0},{\"y\":462.0,\"x\":69.0}],\"spans\":[{\"offset\":262,\"length\":14}]},{\"content\":\"Coinsurance Max\",\"boundingPolygon\":[{\"y\":448.0,\"x\":548.0},{\"y\":448.0,\"x\":725.0},{\"y\":469.0,\"x\":725.0},{\"y\":469.0,\"x\":548.0}],\"spans\":[{\"offset\":277,\"length\":15}]},{\"content\":\"$1,000\",\"boundingPolygon\":[{\"y\":448.0,\"x\":762.0},{\"y\":448.0,\"x\":827.0},{\"y\":468.0,\"x\":827.0},{\"y\":468.0,\"x\":762.0}],\"spans\":[{\"offset\":293,\"length\":6}]},{\"content\":\"BCBS 456\",\"boundingPolygon\":[{\"y\":475.0,\"x\":68.0},{\"y\":475.0,\"x\":191.0},{\"y\":499.0,\"x\":191.0},{\"y\":499.0,\"x\":68.0}],\"spans\":[{\"offset\":300,\"length\":8}]},{\"content\":\"Note: Rx and Medical Cost-Shares are Shared\",\"boundingPolygon\":[{\"y\":540.0,\"x\":548.0},{\"y\":535.0,\"x\":874.0},{\"y\":552.0,\"x\":875.0},{\"y\":557.0,\"x\":548.0}],\"spans\":[{\"offset\":309,\"length\":43}]},{\"content\":\"Rx\",\"boundingPolygon\":[{\"y\":575.0,\"x\":128.0},{\"y\":574.0,\"x\":211.0},{\"y\":621.0,\"x\":211.0},{\"y\":621.0,\"x\":130.0}],\"spans\":[{\"offset\":353,\"length\":2}]},{\"content\":\"PPO\",\"boundingPolygon\":[{\"y\":592.0,\"x\":903.0},{\"y\":590.0,\"x\":956.0},{\"y\":614.0,\"x\":956.0},{\"y\":614.0,\"x\":903.0}],\"spans\":[{\"offset\":356,\"length\":3}]}]}],\"tables\":null,\"keyValuePairs\":null,\"styles\":null,\"documents\":[{\"docType\":\"healthInsuranceCard.us\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":0.0,\"x\":0.0},{\"y\":0.0,\"x\":1000.0},{\"y\":700.0,\"x\":1000.0},{\"y\":700.0,\"x\":0.0}]}],\"spans\":[{\"offset\":0,\"length\":359}],\"fields\":{\"Copays\":{\"value\":[{\"value\":{\"Benefit\":{\"value\":\"deductible\",\"type\":\"string\",\"content\":\"Deductible\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":420.0,\"x\":547.0},{\"y\":420.0,\"x\":654.0},{\"y\":439.0,\"x\":654.0},{\"y\":440.0,\"x\":547.0}]}],\"spans\":[{\"offset\":244,\"length\":10}],\"confidence\":0.945},\"Amount\":{\"value\":\"$1,500\",\"type\":\"string\",\"content\":\"$1,500\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":419.0,\"x\":760.0},{\"y\":420.0,\"x\":823.0},{\"y\":441.0,\"x\":823.0},{\"y\":439.0,\"x\":760.0}]}],\"spans\":[{\"offset\":255,\"length\":6}],\"confidence\":0.945}},\"type\":\"object\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null},{\"value\":{\"Benefit\":{\"value\":\"coinsurancemax\",\"type\":\"string\",\"content\":\"Coinsurance Max\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":449.0,\"x\":548.0},{\"y\":449.0,\"x\":721.0},{\"y\":469.0,\"x\":721.0},{\"y\":469.0,\"x\":548.0}]}],\"spans\":[{\"offset\":277,\"length\":15}],\"confidence\":0.929},\"Amount\":{\"value\":\"$1,000\",\"type\":\"string\",\"content\":\"$1,000\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":448.0,\"x\":763.0},{\"y\":448.0,\"x\":825.0},{\"y\":469.0,\"x\":824.0},{\"y\":469.0,\"x\":763.0}]}],\"spans\":[{\"offset\":293,\"length\":6}],\"confidence\":0.929}},\"type\":\"object\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null}],\"type\":\"array\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null},\"Dependents\":{\"value\":[{\"value\":{\"Name\":{\"value\":\"Coinsurance Max\",\"type\":\"string\",\"content\":\"Coinsurance Max\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":449.0,\"x\":548.0},{\"y\":449.0,\"x\":721.0},{\"y\":469.0,\"x\":721.0},{\"y\":469.0,\"x\":548.0}]}],\"spans\":[{\"offset\":277,\"length\":15}],\"confidence\":0.929}},\"type\":\"object\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null}],\"type\":\"array\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null},\"IdNumber\":{\"value\":{\"Number\":{\"value\":\"123456789\",\"type\":\"string\",\"content\":\"123456789\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":306.0,\"x\":157.0},{\"y\":305.0,\"x\":283.0},{\"y\":329.0,\"x\":282.0},{\"y\":329.0,\"x\":157.0}]}],\"spans\":[{\"offset\":128,\"length\":9}],\"confidence\":0.268},\"Prefix\":{\"value\":\"ABC\",\"type\":\"string\",\"content\":\"ABC\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":305.0,\"x\":74.0},{\"y\":305.0,\"x\":122.0},{\"y\":328.0,\"x\":122.0},{\"y\":328.0,\"x\":74.0}]}],\"spans\":[{\"offset\":124,\"length\":3}],\"confidence\":0.94}},\"type\":\"object\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null},\"GroupNumber\":{\"value\":\"1000000\",\"type\":\"string\",\"content\":\"1000000\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":367.0,\"x\":172.0},{\"y\":366.0,\"x\":269.0},{\"y\":393.0,\"x\":269.0},{\"y\":395.0,\"x\":172.0}]}],\"spans\":[{\"offset\":168,\"length\":7}],\"confidence\":0.929},\"PrescriptionInfo\":{\"value\":{\"RxGrp\":{\"value\":\"BCAAXYZ\",\"type\":\"string\",\"content\":\"BCAAXYZ\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":405.0,\"x\":211.0},{\"y\":405.0,\"x\":329.0},{\"y\":426.0,\"x\":328.0},{\"y\":431.0,\"x\":211.0}]}],\"spans\":[{\"offset\":207,\"length\":7}],\"confidence\":0.919},\"RxBIN\":{\"value\":\"987654\",\"type\":\"string\",\"content\":\"987654\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":440.0,\"x\":177.0},{\"y\":440.0,\"x\":258.0},{\"y\":464.0,\"x\":257.0},{\"y\":464.0,\"x\":177.0}]}],\"spans\":[{\"offset\":270,\"length\":6}],\"confidence\":0.929}},\"type\":\"object\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null},\"Member\":{\"value\":{\"Employer\":{\"value\":\"Microsoft\",\"type\":\"string\",\"content\":\"Microsoft\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":105.0,\"x\":708.0},{\"y\":107.0,\"x\":859.0},{\"y\":138.0,\"x\":859.0},{\"y\":134.0,\"x\":708.0}]}],\"spans\":[{\"offset\":0,\"length\":9}],\"confidence\":0.99},\"IdNumberSuffix\":{\"value\":\"01\",\"type\":\"string\",\"content\":\"01\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":305.0,\"x\":340.0},{\"y\":305.0,\"x\":368.0},{\"y\":328.0,\"x\":369.0},{\"y\":329.0,\"x\":340.0}]}],\"spans\":[{\"offset\":138,\"length\":2}],\"confidence\":0.34},\"Name\":{\"value\":\"ANGEL BROWN\",\"type\":\"string\",\"content\":\"ANGEL BROWN\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":230.0,\"x\":75.0},{\"y\":228.0,\"x\":247.0},{\"y\":251.0,\"x\":246.0},{\"y\":251.0,\"x\":75.0}]}],\"spans\":[{\"offset\":62,\"length\":11}],\"confidence\":0.926}},\"type\":\"object\",\"content\":null,\"boundingRegions\":null,\"spans\":null,\"confidence\":null},\"Insurer\":{\"value\":\"PREMERA| BLUE CROSS\",\"type\":\"string\",\"content\":\"PREMERA|\\nBLUE CROSS\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":128.0,\"x\":82.0},{\"y\":128.0,\"x\":196.0},{\"y\":144.0,\"x\":196.0},{\"y\":144.0,\"x\":82.0}]}],\"spans\":[{\"offset\":10,\"length\":19}],\"confidence\":0.38}},\"confidence\":1.0}],\"languages\":null,\"paragraphs\":[{\"role\":\"pageHeader\",\"content\":\"Microsoft\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":103.0,\"x\":708.0},{\"y\":106.0,\"x\":861.0},{\"y\":137.0,\"x\":860.0},{\"y\":134.0,\"x\":707.0}]}],\"spans\":[{\"offset\":0,\"length\":9}]},{\"role\":\"title\",\"content\":\"PREMERA|\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":65.0,\"x\":79.0},{\"y\":64.0,\"x\":316.0},{\"y\":113.0,\"x\":316.0},{\"y\":114.0,\"x\":79.0}]}],\"spans\":[{\"offset\":10,\"length\":8}]},{\"role\":\"sectionHeading\",\"content\":\"BLUE CROSS\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":127.0,\"x\":82.0},{\"y\":127.0,\"x\":201.0},{\"y\":144.0,\"x\":201.0},{\"y\":144.0,\"x\":82.0}]}],\"spans\":[{\"offset\":19,\"length\":10}]},{\"role\":null,\"content\":\"Member\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":182.0,\"x\":61.0},{\"y\":181.0,\"x\":481.0},{\"y\":226.0,\"x\":481.0},{\"y\":226.0,\"x\":60.0}]}],\"spans\":[{\"offset\":30,\"length\":6}]},{\"role\":null,\"content\":\"Medical Network HERITAGE\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":181.0,\"x\":481.0},{\"y\":186.0,\"x\":971.0},{\"y\":229.0,\"x\":972.0},{\"y\":226.0,\"x\":481.0}]}],\"spans\":[{\"offset\":37,\"length\":24}]},{\"role\":null,\"content\":\"ANGEL BROWN\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":226.0,\"x\":60.0},{\"y\":226.0,\"x\":481.0},{\"y\":262.0,\"x\":482.0},{\"y\":262.0,\"x\":60.0}]}],\"spans\":[{\"offset\":62,\"length\":11}]},{\"role\":null,\"content\":\"Premera Dental\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":226.0,\"x\":481.0},{\"y\":227.0,\"x\":748.0},{\"y\":263.0,\"x\":748.0},{\"y\":262.0,\"x\":482.0}]}],\"spans\":[{\"offset\":74,\"length\":14}]},{\"role\":null,\"content\":\"YES\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":227.0,\"x\":748.0},{\"y\":229.0,\"x\":972.0},{\"y\":264.0,\"x\":972.0},{\"y\":263.0,\"x\":748.0}]}],\"spans\":[{\"offset\":89,\"length\":3}]},{\"role\":null,\"content\":\"Prefix Identification # Suffix ABC 123456789 01\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":262.0,\"x\":60.0},{\"y\":262.0,\"x\":482.0},{\"y\":354.0,\"x\":482.0},{\"y\":355.0,\"x\":59.0}]}],\"spans\":[{\"offset\":93,\"length\":47}]},{\"role\":null,\"content\":\"Premera Vision\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":262.0,\"x\":482.0},{\"y\":263.0,\"x\":748.0},{\"y\":354.0,\"x\":746.0},{\"y\":354.0,\"x\":482.0}]}],\"spans\":[{\"offset\":141,\"length\":14}]},{\"role\":null,\"content\":\"YES\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":263.0,\"x\":748.0},{\"y\":264.0,\"x\":972.0},{\"y\":354.0,\"x\":974.0},{\"y\":354.0,\"x\":746.0}]}],\"spans\":[{\"offset\":156,\"length\":3}]},{\"role\":null,\"content\":\"Group # 1000000\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":355.0,\"x\":59.0},{\"y\":354.0,\"x\":482.0},{\"y\":397.0,\"x\":482.0},{\"y\":398.0,\"x\":59.0}]}],\"spans\":[{\"offset\":160,\"length\":15}]},{\"role\":null,\"content\":\"HEALTH SAVINGS PLAN\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":354.0,\"x\":482.0},{\"y\":354.0,\"x\":974.0},{\"y\":394.0,\"x\":975.0},{\"y\":397.0,\"x\":482.0}]}],\"spans\":[{\"offset\":176,\"length\":19}]},{\"role\":null,\"content\":\"Rx Group # BCAAXYZ\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":398.0,\"x\":59.0},{\"y\":397.0,\"x\":482.0},{\"y\":441.0,\"x\":482.0},{\"y\":434.0,\"x\":58.0}]}],\"spans\":[{\"offset\":196,\"length\":18}]},{\"role\":null,\"content\":\"Shared In and Out of Network Deductible $1,500\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":397.0,\"x\":482.0},{\"y\":394.0,\"x\":975.0},{\"y\":441.0,\"x\":976.0},{\"y\":441.0,\"x\":482.0}]}],\"spans\":[{\"offset\":215,\"length\":46}]},{\"role\":null,\"content\":\"Rx BIN# 987654\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":434.0,\"x\":58.0},{\"y\":441.0,\"x\":482.0},{\"y\":473.0,\"x\":483.0},{\"y\":470.0,\"x\":58.0}]}],\"spans\":[{\"offset\":262,\"length\":14}]},{\"role\":null,\"content\":\"Coinsurance Max\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":441.0,\"x\":482.0},{\"y\":443.0,\"x\":745.0},{\"y\":473.0,\"x\":744.0},{\"y\":473.0,\"x\":483.0}]}],\"spans\":[{\"offset\":277,\"length\":15}]},{\"role\":null,\"content\":\"$1,000\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":443.0,\"x\":745.0},{\"y\":441.0,\"x\":976.0},{\"y\":471.0,\"x\":976.0},{\"y\":473.0,\"x\":744.0}]}],\"spans\":[{\"offset\":293,\"length\":6}]},{\"role\":null,\"content\":\"BCBS 456\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":470.0,\"x\":58.0},{\"y\":473.0,\"x\":483.0},{\"y\":519.0,\"x\":483.0},{\"y\":520.0,\"x\":57.0}]}],\"spans\":[{\"offset\":300,\"length\":8}]},{\"role\":null,\"content\":\"Note: Rx and Medical Cost-Shares are Shared\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":519.0,\"x\":483.0},{\"y\":516.0,\"x\":977.0},{\"y\":559.0,\"x\":978.0},{\"y\":565.0,\"x\":483.0}]}],\"spans\":[{\"offset\":309,\"length\":43}]},{\"role\":\"pageFooter\",\"content\":\"Rx\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":575.0,\"x\":128.0},{\"y\":574.0,\"x\":211.0},{\"y\":621.0,\"x\":212.0},{\"y\":622.0,\"x\":129.0}]}],\"spans\":[{\"offset\":353,\"length\":2}]},{\"role\":\"pageFooter\",\"content\":\"PPO\",\"boundingRegions\":[{\"pageNumber\":1,\"boundingPolygon\":[{\"y\":590.0,\"x\":903.0},{\"y\":590.0,\"x\":956.0},{\"y\":614.0,\"x\":956.0},{\"y\":614.0,\"x\":903.0}]}],\"spans\":[{\"offset\":356,\"length\":3}]}]}";

    @BeforeAll
    static void beforeAll() {
        StepVerifier.setDefaultTimeout(Duration.ofSeconds(30));
    }

    @AfterAll
    static void afterAll() {
        StepVerifier.resetDefaultTimeout();
    }

    private DocumentAnalysisClient getDocumentAnalysisClient(HttpClient httpClient,
                                                             DocumentAnalysisServiceVersion serviceVersion) {
        return getDocumentAnalysisBuilder(httpClient, serviceVersion, false).buildClient();
    }

    /**
     * Verifies that the analyzed result of an insurance card data deserializes accurately.
     */
    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.formrecognizer.documentanalysis.TestUtils#getTestParameters")
    public void deserializeAnalyzeResult(HttpClient httpClient, DocumentAnalysisServiceVersion serviceVersion)
        throws JsonProcessingException {
        client = getDocumentAnalysisClient(httpClient, serviceVersion);
        AtomicReference<AnalyzeResult> analyzeResult = new AtomicReference<>();
        dataRunner((data, dataLength) -> {
            SyncPoller<OperationResult, AnalyzeResult> syncPoller
                = client.beginAnalyzeDocument("prebuilt-healthInsuranceCard.us",
                    BinaryData.fromStream(data, dataLength))
                .setPollInterval(durationTestMode);
            analyzeResult.set(syncPoller.getFinalResult());
        }, INSURANCE_PNG);

        ObjectMapper obj = new ObjectMapper();
        JsonNode actualResult = obj.readTree(obj.writeValueAsString(analyzeResult.get()));

        assertEquals(obj.readTree(expectedDeserializedString), actualResult);
    }
}
