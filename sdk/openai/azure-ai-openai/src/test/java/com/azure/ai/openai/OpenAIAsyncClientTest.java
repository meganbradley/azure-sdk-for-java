// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.openai;

import com.azure.ai.openai.functions.MyFunctionCallArguments;
import com.azure.ai.openai.models.*;
import com.azure.core.exception.HttpResponseException;
import com.azure.core.exception.ResourceNotFoundException;
import com.azure.core.http.HttpClient;
import com.azure.core.http.rest.RequestOptions;
import com.azure.core.util.BinaryData;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import reactor.test.StepVerifier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

import static com.azure.ai.openai.TestUtils.DISPLAY_NAME_WITH_ARGUMENTS;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OpenAIAsyncClientTest extends OpenAIClientTestBase {
    private OpenAIAsyncClient client;

    private OpenAIAsyncClient getOpenAIAsyncClient(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        return getOpenAIClientBuilder(
            interceptorManager.isPlaybackMode() ? interceptorManager.getPlaybackClient() : httpClient,
            serviceVersion)
            .buildAsyncClient();
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsRunner((deploymentId, prompt) -> {
            StepVerifier.create(client.getCompletions(deploymentId, new CompletionsOptions(prompt)))
                .assertNext(resultCompletions -> {
                    assertCompletions(1, resultCompletions);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsStream(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsRunner((deploymentId, prompt) -> {
            StepVerifier.create(client.getCompletionsStream(deploymentId, new CompletionsOptions(prompt)))
                .recordWith(ArrayList::new)
                .thenConsumeWhile(chatCompletions -> {
                    assertCompletionsStream(chatCompletions);
                    return true;
                })
                .consumeRecordedWith(messageList -> assertTrue(messageList.size() > 1))
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsFromPrompt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsFromSinglePromptRunner((deploymentId, prompt) -> {
            StepVerifier.create(client.getCompletions(deploymentId, prompt))
                .assertNext(resultCompletions -> {
                    assertCompletions(1, resultCompletions);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsRunner((deploymentId, prompt) -> {
            StepVerifier.create(client.getCompletionsWithResponse(deploymentId,
                    BinaryData.fromObject(new CompletionsOptions(prompt)),
                    new RequestOptions()))
                .assertNext(response -> {
                    Completions resultCompletions = assertAndGetValueFromResponse(response, Completions.class, 200);
                    assertCompletions(1, resultCompletions);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsWithResponseBadDeployment(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsRunner((_deploymentId, prompt) -> {
            String deploymentId = "BAD_DEPLOYMENT_ID";
            StepVerifier.create(client.getCompletionsWithResponse(deploymentId,
                    BinaryData.fromObject(new CompletionsOptions(prompt)), new RequestOptions()))
                .verifyErrorSatisfies(throwable -> {
                    assertInstanceOf(ResourceNotFoundException.class, throwable);
                    assertEquals(404, ((ResourceNotFoundException) throwable).getResponse().getStatusCode());
                });
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsUsageField(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsRunner((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(prompt);
            completionsOptions.setMaxTokens(1024);
            completionsOptions.setN(3);
            completionsOptions.setLogprobs(1);
            StepVerifier.create(client.getCompletions(modelId, completionsOptions))
                .assertNext(resultCompletions -> {
                    CompletionsUsage usage = resultCompletions.getUsage();
                    assertCompletions(completionsOptions.getN() * completionsOptions.getPrompt().size(), resultCompletions);
                    assertNotNull(usage);
                    assertTrue(usage.getTotalTokens() > 0);
                    assertEquals(usage.getCompletionTokens() + usage.getPromptTokens(), usage.getTotalTokens());
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetCompletionsTokenCutoff(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsRunner((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(prompt);
            completionsOptions.setMaxTokens(3);
            StepVerifier.create(client.getCompletions(modelId, completionsOptions))
                .assertNext(resultCompletions ->
                    assertCompletions(1, "length", resultCompletions))
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetChatCompletions(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatCompletionsRunner((deploymentId, chatMessages) -> {
            StepVerifier.create(client.getChatCompletions(deploymentId, new ChatCompletionsOptions(chatMessages)))
                .assertNext(resultChatCompletions -> {
                    assertNotNull(resultChatCompletions.getUsage());
                    assertChatCompletions(1, resultChatCompletions);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetChatCompletionsStream(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatCompletionsRunner((deploymentId, chatMessages) -> {
            StepVerifier.create(client.getChatCompletionsStream(deploymentId, new ChatCompletionsOptions(chatMessages)))
                .recordWith(ArrayList::new)
                .thenConsumeWhile(chatCompletions -> {
                    assertChatCompletionsStream(chatCompletions);
                    return true;
                })
                .consumeRecordedWith(messageList -> assertTrue(messageList.size() > 1))
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetChatCompletionsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatCompletionsRunner((deploymentId, chatMessages) -> {
            StepVerifier.create(client.getChatCompletionsWithResponse(deploymentId,
                    BinaryData.fromObject(new ChatCompletionsOptions(chatMessages)),
                    new RequestOptions()))
                .assertNext(response -> {
                    ChatCompletions resultChatCompletions = assertAndGetValueFromResponse(response, ChatCompletions.class, 200);
                    assertChatCompletions(1, resultChatCompletions);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetEmbeddings(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getEmbeddingRunner((deploymentId, embeddingsOptions) -> {
            StepVerifier.create(client.getEmbeddings(deploymentId, embeddingsOptions))
                .assertNext(resultEmbeddings -> assertEmbeddings(resultEmbeddings))
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetEmbeddingsWithResponse(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getEmbeddingRunner((deploymentId, embeddingsOptions) -> {
            StepVerifier.create(client.getEmbeddingsWithResponse(deploymentId,
                    BinaryData.fromObject(embeddingsOptions),
                    new RequestOptions()))
                .assertNext(response -> {
                    Embeddings resultEmbeddings = assertAndGetValueFromResponse(response, Embeddings.class, 200);
                    assertEmbeddings(resultEmbeddings);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGenerateImage(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getImageGenerationRunner(options ->
            StepVerifier.create(client.getImages(options))
                .assertNext(OpenAIClientTestBase::assertImageResponse)
                .verifyComplete());
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatFunctionAutoPreset(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatFunctionForRunner((modelId, chatCompletionsOptions) -> {
            chatCompletionsOptions.setFunctionCall(FunctionCallConfig.AUTO);
            StepVerifier.create(client.getChatCompletions(modelId, chatCompletionsOptions))
                .assertNext(chatCompletions -> {
                    assertEquals(1, chatCompletions.getChoices().size());
                    ChatChoice chatChoice = chatCompletions.getChoices().get(0);
                    MyFunctionCallArguments arguments = assertFunctionCall(
                        chatChoice,
                        "MyFunction",
                        MyFunctionCallArguments.class);
                    assertEquals(arguments.getLocation(), "San Francisco, CA");
                    assertEquals(arguments.getUnit(), "CELSIUS");
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatFunctionNonePreset(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatFunctionForRunner((modelId, chatCompletionsOptions) -> {
            chatCompletionsOptions.setFunctionCall(FunctionCallConfig.NONE);
            StepVerifier.create(client.getChatCompletions(modelId, chatCompletionsOptions))
                .assertNext(chatCompletions -> {
                    assertChatCompletions(1, "stop", ChatRole.ASSISTANT, chatCompletions);
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatFunctionNotSuppliedByNamePreset(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatFunctionForRunner((modelId, chatCompletionsOptions) -> {
            chatCompletionsOptions.setFunctionCall(new FunctionCallConfig("NotMyFunction"));
            StepVerifier.create(client.getChatCompletions(modelId, chatCompletionsOptions))
                .verifyErrorSatisfies(throwable -> {
                    assertInstanceOf(HttpResponseException.class, throwable);
                    HttpResponseException httpResponseException = (HttpResponseException) throwable;
                    assertEquals(400, httpResponseException.getResponse().getStatusCode());
                    assertTrue(httpResponseException.getMessage().contains("Invalid value for 'function_call'"));
                });
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatCompletionContentFiltering(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatCompletionsContentFilterRunner((modelId, chatMessages) -> {
            StepVerifier.create(client.getChatCompletions(modelId, new ChatCompletionsOptions(chatMessages)))
                .assertNext(chatCompletions -> {
                    assertSafeContentFilterResults(chatCompletions.getPromptFilterResults().get(0).getContentFilterResults());
                    assertEquals(1, chatCompletions.getChoices().size());
                    ChatChoice chatChoice = chatCompletions.getChoices().get(0);
                    assertSafeContentFilterResults(chatChoice.getContentFilterResults());
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatCompletionStreamContentFiltering(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getChatCompletionsContentFilterRunner((modelId, chatMessages) -> {
            StepVerifier.create(client.getChatCompletionsStream(modelId, new ChatCompletionsOptions(chatMessages)))
                .recordWith(ArrayList::new)
                .thenConsumeWhile(chatCompletions -> {
                    assertChatCompletionsStream(chatCompletions);
                    return true;
                })
                .consumeRecordedWith(messageList -> {
                    assertTrue(messageList.size() > 1);

                    int i = 0;
                    for (Iterator<ChatCompletions> it = messageList.iterator(); it.hasNext();) {
                        ChatCompletions chatCompletions = it.next();
                        if (i == 0) {
                            // The first stream message has the prompt filter result
                            assertEquals(1, chatCompletions.getPromptFilterResults().size());
                            assertSafeContentFilterResults(chatCompletions.getPromptFilterResults().get(0).getContentFilterResults());
                        } else if (i == 1) {
                            // The second message no longer has the prompt filter result, but contains a ChatChoice
                            // filter result with all the filter set to null. The roll is also ASSISTANT
                            assertEquals(ChatRole.ASSISTANT, chatCompletions.getChoices().get(0).getDelta().getRole());
                            assertNull(chatCompletions.getPromptFilterResults());
                            ContentFilterResults contentFilterResults = chatCompletions.getChoices().get(0).getContentFilterResults();
                            assertEmptyContentFilterResults(contentFilterResults);
                        } else if (i == messageList.size() - 1) {
                            // The last stream message is empty with all the filters set to null
                            assertEquals(1, chatCompletions.getChoices().size());
                            ChatChoice chatChoice = chatCompletions.getChoices().get(0);

                            assertEquals(CompletionsFinishReason.fromString("stop"), chatChoice.getFinishReason());
                            assertNotNull(chatChoice.getDelta());
                            assertNull(chatChoice.getDelta().getContent());

                            ContentFilterResults contentFilterResults = chatChoice.getContentFilterResults();
                            assertEmptyContentFilterResults(contentFilterResults);
                        } else {
                            // The rest of the intermediary messages have the text generation content filter set
                            assertNull(chatCompletions.getPromptFilterResults());
                            assertNotNull(chatCompletions.getChoices().get(0).getDelta());
                            assertSafeContentFilterResults(chatCompletions.getChoices().get(0).getContentFilterResults());
                        }
                        i++;
                    }
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testCompletionContentFiltering(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsContentFilterRunner((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(Arrays.asList(prompt));
            // work around for this model, there seem to be some issues with Completions in gpt-turbo models
            completionsOptions.setMaxTokens(2000);
            StepVerifier.create(client.getCompletions(modelId, completionsOptions))
                .assertNext(completions -> {
                    assertCompletions(1, completions);
                    ContentFilterResults contentFilterResults = completions.getPromptFilterResults().get(0).getContentFilterResults();
                    assertSafeContentFilterResults(contentFilterResults);
                    assertSafeContentFilterResults(completions.getChoices().get(0).getContentFilterResults());
                }).verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testCompletionStreamContentFiltering(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);
        getCompletionsContentFilterRunner((modelId, prompt) -> {
            CompletionsOptions completionsOptions = new CompletionsOptions(Arrays.asList(prompt));
            // work around for this model, there seem to be some issues with Completions in gpt-turbo models
            completionsOptions.setMaxTokens(2000);
            StepVerifier.create(client.getCompletionsStream(modelId, completionsOptions))
                .recordWith(ArrayList::new)
                .thenConsumeWhile(chatCompletions -> {
                    assertCompletionsStream(chatCompletions);
                    return true;
                })
                .consumeRecordedWith(messageList -> {
                    assertTrue(messageList.size() > 1);

                    int i = 0;
                    for (Iterator<Completions> it = messageList.iterator(); it.hasNext();) {
                        Completions completions = it.next();
                        if (i == 0) {
                            // The first stream message has the prompt filter result
                            assertEquals(1, completions.getPromptFilterResults().size());
                            assertSafeContentFilterResults(completions.getPromptFilterResults().get(0).getContentFilterResults());
                        } else if (i == messageList.size() - 1) {
                            // The last stream message is empty with all the filters set to null
                            assertEquals(1, completions.getChoices().size());
                            Choice choice = completions.getChoices().get(0);

                            assertEquals(CompletionsFinishReason.fromString("stop"), choice.getFinishReason());
                            assertNotNull(choice.getText());

                            ContentFilterResults contentFilterResults = choice.getContentFilterResults();
                            assertEmptyContentFilterResults(contentFilterResults);
                        } else {
                        // The rest of the intermediary messages have the text generation content filter set
                            assertNull(completions.getPromptFilterResults());
                            assertNotNull(completions.getChoices().get(0));
                            assertSafeContentFilterResults(completions.getChoices().get(0).getContentFilterResults());
                        }
                        i++;
                    }
                })
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatCompletionsBasicSearchExtension(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getChatCompletionsAzureChatSearchRunner((deploymentName, chatCompletionsOptions) -> {
            AzureCognitiveSearchChatExtensionConfiguration cognitiveSearchConfiguration =
                new AzureCognitiveSearchChatExtensionConfiguration(
                    "https://openaisdktestsearch.search.windows.net",
                    getAzureCognitiveSearchKey(),
                    "openai-test-index-carbon-wiki"
                );
            AzureChatExtensionConfiguration extensionConfiguration =
                new AzureChatExtensionConfiguration(
                    AzureChatExtensionType.AZURE_COGNITIVE_SEARCH,
                    BinaryData.fromObject(cognitiveSearchConfiguration));

            chatCompletionsOptions.setDataSources(Arrays.asList(extensionConfiguration));

            StepVerifier.create(client.getChatCompletions(deploymentName, chatCompletionsOptions))
                .assertNext(OpenAIClientTestBase::assertChatCompletionsCognitiveSearch)
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testChatCompletionsStreamingBasicSearchExtension(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getChatCompletionsAzureChatSearchRunner((deploymentName, chatCompletionsOptions) -> {
            AzureCognitiveSearchChatExtensionConfiguration cognitiveSearchConfiguration =
                new AzureCognitiveSearchChatExtensionConfiguration(
                    "https://openaisdktestsearch.search.windows.net",
                    getAzureCognitiveSearchKey(),
                    "openai-test-index-carbon-wiki"
                );
            AzureChatExtensionConfiguration extensionConfiguration =
                new AzureChatExtensionConfiguration(
                    AzureChatExtensionType.AZURE_COGNITIVE_SEARCH,
                    BinaryData.fromObject(cognitiveSearchConfiguration));

            chatCompletionsOptions.setDataSources(Arrays.asList(extensionConfiguration));

            StepVerifier.create(client.getChatCompletionsStream(deploymentName, chatCompletionsOptions))
                .recordWith(ArrayList::new)
                .thenConsumeWhile(_chatCompletion -> true)
                .consumeRecordedWith(chatCompletions -> assertChatCompletionsStreamingCognitiveSearch(chatCompletions.stream()))
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranscription(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranscriptionRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranscriptionOptions transcriptionOptions = new AudioTranscriptionOptions(file);

//            AudioTranscription transcription = client.getAudioTranscription(deploymentName, transcriptionOptions);
//            assertNotNull(transcription);
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationJson(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.JSON);

            StepVerifier.create(client.getAudioTranslation(deploymentName, translationOptions, fileName))
                .assertNext(translation ->
                        assertAudioTranscriptionSimpleJson(translation,"It's raining today."))
                    .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationVerboseJson(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.VERBOSE_JSON);

            StepVerifier.create(client.getAudioTranslation(deploymentName, translationOptions, fileName))
                .assertNext(translation ->
                    assertAudioTranscriptionVerboseJson(translation,"It's raining today."))
                .verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationTextPlain(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.TEXT);

            StepVerifier.create(client.getAudioTranslationText(deploymentName, translationOptions, fileName))
                .assertNext(translation -> {
                    assertEquals("It's raining today.\n", translation);
                }).verifyComplete();
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationSrt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.SRT);

            StepVerifier.create(client.getAudioTranslationText(deploymentName, translationOptions, fileName))
                .assertNext(translation -> {
                    // Sequence number
                    assertTrue(translation.contains("1\n"));
                    // First sequence starts at timestamp 0
                    assertTrue(translation.contains("00:00:00,000 --> "));
                    // Actual translation value
                    assertTrue(translation.contains("It's raining today."));
                }).verifyComplete();
        });
    }


    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationVtt(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);
            translationOptions.setResponseFormat(AudioTranscriptionFormat.VTT);

            StepVerifier.create(client.getAudioTranslationText(deploymentName, translationOptions, fileName))
                .assertNext(translation -> {
                    // Start value according to spec
                    assertTrue(translation.startsWith("WEBVTT\n"));
                    // First sequence starts at timestamp 0. Note: unlike SRT, the millisecond separator is a "."
                    assertTrue(translation.contains("00:00:00.000 --> "));
                    // Actual translation value
                    assertTrue(translation.contains("It's raining today."));
                }).verifyComplete();
        });
    }


    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationTextWrongFormats(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);

            translationOptions.setResponseFormat(AudioTranscriptionFormat.JSON);
            StepVerifier.create(client.getAudioTranslationText(deploymentName, translationOptions, fileName))
                            .verifyErrorSatisfies(error -> assertTrue(error instanceof IllegalArgumentException));

            translationOptions.setResponseFormat(AudioTranscriptionFormat.VERBOSE_JSON);
            StepVerifier.create(client.getAudioTranslationText(deploymentName, translationOptions, fileName))
                    .verifyErrorSatisfies(error -> assertTrue(error instanceof IllegalArgumentException));
        });
    }

    @ParameterizedTest(name = DISPLAY_NAME_WITH_ARGUMENTS)
    @MethodSource("com.azure.ai.openai.TestUtils#getTestParameters")
    public void testGetAudioTranslationJsonWrongFormats(HttpClient httpClient, OpenAIServiceVersion serviceVersion) {
        client = getOpenAIAsyncClient(httpClient, serviceVersion);

        getAudioTranslationRunner((deploymentName, fileName) -> {
            byte[] file = BinaryData.fromFile(openTestResourceFile(fileName)).toBytes();
            AudioTranslationOptions translationOptions = new AudioTranslationOptions(file);

            translationOptions.setResponseFormat(AudioTranscriptionFormat.TEXT);
            StepVerifier.create(client.getAudioTranslation(deploymentName, translationOptions, fileName))
                    .verifyErrorSatisfies(error -> assertTrue(error instanceof IllegalArgumentException));

            translationOptions.setResponseFormat(AudioTranscriptionFormat.SRT);
            StepVerifier.create(client.getAudioTranslation(deploymentName, translationOptions, fileName))
                    .verifyErrorSatisfies(error -> assertTrue(error instanceof IllegalArgumentException));

            translationOptions.setResponseFormat(AudioTranscriptionFormat.VTT);
            StepVerifier.create(client.getAudioTranslation(deploymentName, translationOptions, fileName))
                    .verifyErrorSatisfies(error -> assertTrue(error instanceof IllegalArgumentException));
        });
    }
}
