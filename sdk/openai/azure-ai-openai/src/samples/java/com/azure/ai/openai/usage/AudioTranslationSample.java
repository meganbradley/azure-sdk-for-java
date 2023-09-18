// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.ai.openai.usage;

import com.azure.ai.openai.OpenAIClient;
import com.azure.ai.openai.OpenAIClientBuilder;
import com.azure.ai.openai.models.AudioTranscription;
import com.azure.ai.openai.models.AudioTranscriptionFormat;
import com.azure.ai.openai.models.AudioTranslationOptions;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.util.BinaryData;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * A sample demonstrates how to translate a given audio file.
 */
public class AudioTranslationSample {
    /**
     * Runs the sample algorithm and demonstrates how to translate a given audio file.
     *
     * @param args Unused. Arguments to the program.
     */
    public static void main(String[] args) {
        String azureOpenaiKey = "{azure-open-ai-key}";
        String endpoint = "{azure-open-ai-endpoint}";
        String deploymentOrModelId = "{azure-open-ai-deployment-model-id}";
        String fileName = "JP_it_is_rainy_today.wav";
        Path filePath = Paths.get("src/samples/java/com/azure/ai/openai/resources/" + fileName);

        OpenAIClient client = new OpenAIClientBuilder()
            .endpoint(endpoint)
            .credential(new AzureKeyCredential(azureOpenaiKey))
            .buildClient();
        byte[] file = BinaryData.fromFile(filePath).toBytes();
        AudioTranslationOptions translationOptions = new AudioTranslationOptions(file)
            .setResponseFormat(AudioTranscriptionFormat.JSON);

        AudioTranscription translation = client.getAudioTranslation(deploymentOrModelId, translationOptions, fileName);

        System.out.println("Translation: " + translation.getText());
    }
}
