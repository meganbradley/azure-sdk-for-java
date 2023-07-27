// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.openai;

import com.azure.ai.openai.functions.Parameters;
import com.azure.ai.openai.models.FunctionDefinition;
import com.azure.ai.openai.models.ChatChoice;
import com.azure.ai.openai.models.ChatCompletions;
import com.azure.ai.openai.models.ChatCompletionsOptions;
import com.azure.ai.openai.models.ChatMessage;
import com.azure.ai.openai.models.ChatRole;
import com.azure.ai.openai.models.Choice;
import com.azure.ai.openai.models.Completions;
import com.azure.ai.openai.models.ContentFilterResults;
import com.azure.ai.openai.models.ContentFilterSeverity;
import com.azure.ai.openai.models.EmbeddingItem;
import com.azure.ai.openai.models.Embeddings;
import com.azure.ai.openai.models.EmbeddingsOptions;
import com.azure.ai.openai.models.FunctionCall;
import com.azure.ai.openai.models.ImageGenerationOptions;
import com.azure.ai.openai.models.ImageResponse;
import com.azure.ai.openai.models.NonAzureOpenAIKeyCredential;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.Response;
import com.azure.core.test.TestMode;
import com.azure.core.test.TestProxyTestBase;
import com.azure.core.util.BinaryData;
import com.azure.core.util.Configuration;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

import static com.azure.ai.openai.TestUtils.FAKE_API_KEY;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public abstract class OpenAIClientTestBase extends TestProxyTestBase {

    OpenAIClientBuilder getOpenAIClientBuilder(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        OpenAIClientBuilder builder = new OpenAIClientBuilder()
            .httpClient(httpClient)
            .serviceVersion(serviceVersion);

        if (getTestMode() == TestMode.PLAYBACK) {
            builder
                .endpoint("https://localhost:8080")
                .credential(new AzureKeyCredential(FAKE_API_KEY));
        } else if (getTestMode() == TestMode.RECORD) {
            builder
                .addPolicy(interceptorManager.getRecordPolicy())
                .endpoint(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_ENDPOINT"))
                .credential(new AzureKeyCredential(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_KEY")));
        } else {
            builder
                .endpoint(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_ENDPOINT"))
                .credential(new AzureKeyCredential(Configuration.getGlobalConfiguration().get("AZURE_OPENAI_KEY")));
        }
        return builder;
    }

    OpenAIClientBuilder getNonAzureOpenAIClientBuilder(HttpClient httpClient) {
        OpenAIClientBuilder builder = new OpenAIClientBuilder()
            .httpClient(httpClient);

        if (getTestMode() == TestMode.PLAYBACK) {
            builder
                .credential(new NonAzureOpenAIKeyCredential(FAKE_API_KEY));
        } else if (getTestMode() == TestMode.RECORD) {
            builder
                .addPolicy(interceptorManager.getRecordPolicy())
                .credential(new NonAzureOpenAIKeyCredential(Configuration.getGlobalConfiguration().get("NON_AZURE_OPENAI_KEY")));
        } else {
            builder
                .credential(new NonAzureOpenAIKeyCredential(Configuration.getGlobalConfiguration().get("NON_AZURE_OPENAI_KEY")));
        }
        return builder;
    }


    @Test
    public abstract void testGetCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void testGetCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void testGetChatCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void testGetChatCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void testGetEmbeddings(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    @Test
    public abstract void testGetEmbeddingsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion);

    void getCompletionsRunner(BiConsumer<String, List<String>> testRunner) {
        String deploymentId = "text-davinci-003";
        List<String> prompt = new ArrayList<>();
        prompt.add("Say this is a test");
        testRunner.accept(deploymentId, prompt);
    }

    void getCompletionsFromSinglePromptRunner(BiConsumer<String, String> testRunner) {
        String deploymentId = "text-davinci-003";
        String prompt = "Say this is a test";
        testRunner.accept(deploymentId, prompt);
    }

    void getChatCompletionsRunner(BiConsumer<String, List<ChatMessage>> testRunner) {
        testRunner.accept("gpt-35-turbo", getChatMessages());
    }

    void getChatCompletionsForNonAzureRunner(BiConsumer<String, List<ChatMessage>> testRunner) {
        testRunner.accept("gpt-3.5-turbo", getChatMessages());
    }

    void getEmbeddingRunner(BiConsumer<String, EmbeddingsOptions> testRunner) {
        testRunner.accept("text-embedding-ada-002", new EmbeddingsOptions(Arrays.asList("Your text string goes here")));
    }

    void getEmbeddingNonAzureRunner(BiConsumer<String, EmbeddingsOptions> testRunner) {
        testRunner.accept("text-embedding-ada-002", new EmbeddingsOptions(Arrays.asList("Your text string goes here")));
    }

    void getImageGenerationRunner(Consumer<ImageGenerationOptions> testRunner) {
        testRunner.accept(
            new ImageGenerationOptions("A drawing of the Seattle skyline in the style of Van Gogh")
        );
    }

    void getChatFunctionForNonAzureRunner(BiConsumer<String, ChatCompletionsOptions> testRunner) {
        testRunner.accept("gpt-3.5-turbo-0613", getChatMessagesWithFunction());
    }

    void getChatFunctionForRunner(BiConsumer<String, ChatCompletionsOptions> testRunner) {
        testRunner.accept("gpt-4", getChatMessagesWithFunction());
    }

    void getChatCompletionsContentFilterRunner(BiConsumer<String, List<ChatMessage>> testRunner) {
        testRunner.accept("gpt-4", getChatMessages());
    }

    void getCompletionsContentFilterRunner(BiConsumer<String, String> testRunner) {
        testRunner.accept("gpt-35-turbo", "What is 3 times 4?");
    }

    void getChatCompletionsContentFilterRunnerForNonAzure(BiConsumer<String, List<ChatMessage>> testRunner) {
        testRunner.accept("gpt-3.5-turbo-0613", getChatMessages());
    }

    void getCompletionsContentFilterRunnerForNonAzure(BiConsumer<String, String> testRunner) {
        testRunner.accept("text-davinci-002", "What is 3 times 4?");
    }

    private List<ChatMessage> getChatMessages() {
        List<ChatMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatMessage(ChatRole.SYSTEM, "You are a helpful assistant. You will talk like a pirate."));
        chatMessages.add(new ChatMessage(ChatRole.USER, "Can you help me?"));
        chatMessages.add(new ChatMessage(ChatRole.ASSISTANT, "Of course, me hearty! What can I do for ye?"));
        chatMessages.add(new ChatMessage(ChatRole.USER, "What's the best way to train a parrot?"));
        return chatMessages;
    }

    private ChatCompletionsOptions getChatMessagesWithFunction() {
        FunctionDefinition functionDefinition = new FunctionDefinition("MyFunction");
        Parameters parameters = new Parameters();
        functionDefinition.setParameters(parameters);
        List<FunctionDefinition> functions = Arrays.asList(functionDefinition);

        List<ChatMessage> chatMessages = new ArrayList<>();
        chatMessages.add(new ChatMessage(ChatRole.USER, "What's the weather like in San Francisco in Celsius?"));

        ChatCompletionsOptions chatCompletionOptions = new ChatCompletionsOptions(chatMessages);
        chatCompletionOptions.setFunctions(functions);
        return chatCompletionOptions;
    }

    static void assertCompletions(int choicesPerPrompt, Completions actual) {
        assertCompletions(choicesPerPrompt, "stop", actual);
    }

    static void assertCompletions(int choicesPerPrompt, String expectedFinishReason, Completions actual) {
        assertNotNull(actual);
        assertInstanceOf(Completions.class, actual);
        assertChoices(choicesPerPrompt, expectedFinishReason, actual.getChoices());
        assertNotNull(actual.getUsage());
    }

    static <T> T assertAndGetValueFromResponse(Response<BinaryData> actualResponse, Class<T> clazz, int expectedCode) {
        assertNotNull(actualResponse);
        assertEquals(expectedCode, actualResponse.getStatusCode());
        assertInstanceOf(Response.class, actualResponse);
        BinaryData binaryData = actualResponse.getValue();
        assertNotNull(binaryData);
        T object = binaryData.toObject(clazz);
        assertNotNull(object);
        assertInstanceOf(clazz, object);
        return object;
    }

    static void assertChoices(int choicesPerPrompt, String expectedFinishReason, List<Choice> actual) {
        assertEquals(choicesPerPrompt, actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertChoice(i, expectedFinishReason, actual.get(i));
        }
    }

    static void assertChoice(int index, String expectedFinishReason, Choice actual) {
        assertNotNull(actual.getText());
        assertEquals(index, actual.getIndex());
        assertEquals(expectedFinishReason, actual.getFinishReason().toString());
    }

    static void assertChatCompletions(int choiceCount, ChatCompletions actual) {
        List<ChatChoice> choices = actual.getChoices();
        assertNotNull(choices);
        assertTrue(choices.size() > 0);
        assertChatChoices(choiceCount, "stop", ChatRole.ASSISTANT, choices);
        assertNotNull(actual.getUsage());
    }

    // We are currently using the same model. Eventually we will have a separate one for the streaming scenario
    static void assertChatCompletionsStream(ChatCompletions chatCompletions) {
        if (chatCompletions.getId() != null && !chatCompletions.getId().isEmpty()) {
            assertNotNull(chatCompletions.getId());
            assertNotNull(chatCompletions.getChoices());
            assertFalse(chatCompletions.getChoices().isEmpty());
            assertNotNull(chatCompletions.getChoices().get(0).getDelta());
        }
    }

    // We are currently using the same model. Eventually we will have a separate one for the streaming scenario
    static void assertCompletionsStream(Completions completions) {
        if (completions.getId() != null && !completions.getId().isEmpty()) {
            assertNotNull(completions.getId());
            assertNotNull(completions.getChoices());
            assertFalse(completions.getChoices().isEmpty());
            assertNotNull(completions.getChoices().get(0).getText());
        }
    }

    static void assertChatCompletions(int choiceCount, String expectedFinishReason, ChatRole chatRole, ChatCompletions actual) {
        List<ChatChoice> choices = actual.getChoices();
        assertNotNull(choices);
        assertTrue(choices.size() > 0);
        assertChatChoices(choiceCount, expectedFinishReason, chatRole, choices);
        assertNotNull(actual.getUsage());
    }

    static void assertChatChoices(int choiceCount, String expectedFinishReason, ChatRole chatRole, List<ChatChoice> actual) {
        assertEquals(choiceCount, actual.size());
        for (int i = 0; i < actual.size(); i++) {
            assertChatChoice(i, expectedFinishReason, chatRole, actual.get(i));
        }
    }

    static void assertChatChoice(int index, String expectedFinishReason, ChatRole chatRole, ChatChoice actual) {
        assertEquals(index, actual.getIndex());
        assertEquals(chatRole, actual.getMessage().getRole());
        assertNotNull(actual.getMessage().getContent());
        assertEquals(expectedFinishReason, actual.getFinishReason().toString());
    }

    static void assertEmbeddings(Embeddings actual) {
        List<EmbeddingItem> data = actual.getData();
        assertNotNull(data);
        assertTrue(data.size() > 0);

        for (EmbeddingItem item : data) {
            List<Double> embedding = item.getEmbedding();
            assertNotNull(embedding);
            assertTrue(embedding.size() > 0);
        }
        assertNotNull(actual.getUsage());
    }

    static void assertImageResponse(ImageResponse actual) {
        assertNotNull(actual.getData());
        assertFalse(actual.getData().isEmpty());
    }

    static <T> T assertFunctionCall(ChatChoice actual, String functionName, Class<T> myPropertiesClazz) {
        assertEquals(0, actual.getIndex());
        assertEquals("function_call", actual.getFinishReason().toString());
        FunctionCall functionCall = actual.getMessage().getFunctionCall();
        assertEquals(functionName, functionCall.getName());
        BinaryData argumentJson = BinaryData.fromString(functionCall.getArguments());
        return argumentJson.toObject(myPropertiesClazz);
    }

    static void assertSafeContentFilterResults(ContentFilterResults contentFilterResults) {
        assertNotNull(contentFilterResults);
        assertFalse(contentFilterResults.getHate().isFiltered());
        assertEquals(contentFilterResults.getHate().getSeverity(), ContentFilterSeverity.SAFE);
        assertFalse(contentFilterResults.getSexual().isFiltered());
        assertEquals(contentFilterResults.getSexual().getSeverity(), ContentFilterSeverity.SAFE);
        assertFalse(contentFilterResults.getSelfHarm().isFiltered());
        assertEquals(contentFilterResults.getSelfHarm().getSeverity(), ContentFilterSeverity.SAFE);
        assertFalse(contentFilterResults.getViolence().isFiltered());
        assertEquals(contentFilterResults.getViolence().getSeverity(), ContentFilterSeverity.SAFE);
    }

    static void assertEmptyContentFilterResults(ContentFilterResults contentFilterResults) {
        assertNotNull(contentFilterResults);
        assertNull(contentFilterResults.getHate());
        assertNull(contentFilterResults.getSexual());
        assertNull(contentFilterResults.getViolence());
        assertNull(contentFilterResults.getSelfHarm());
    }
}
