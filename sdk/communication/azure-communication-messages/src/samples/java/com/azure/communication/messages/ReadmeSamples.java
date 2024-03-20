// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.

package com.azure.communication.messages;

import com.azure.communication.messages.models.MessageTemplate;
import com.azure.communication.messages.models.MessageTemplateBindings;
import com.azure.communication.messages.models.MessageTemplateText;
import com.azure.communication.messages.models.MessageTemplateValue;
import com.azure.communication.messages.models.MessageTemplateItem;
import com.azure.communication.messages.models.MediaNotificationContent;
import com.azure.communication.messages.models.TextNotificationContent;
import com.azure.communication.messages.models.TemplateNotificationContent;
import com.azure.communication.messages.models.SendMessageResult;
import com.azure.communication.messages.models.channels.WhatsAppMessageTemplateBindings;
import com.azure.communication.messages.models.channels.WhatsAppMessageTemplateBindingsComponent;
import com.azure.communication.messages.models.channels.WhatsAppMessageTemplateItem;
import com.azure.core.credential.AzureKeyCredential;
import com.azure.core.credential.TokenCredential;
import com.azure.core.http.rest.PagedIterable;
import com.azure.identity.DefaultAzureCredentialBuilder;

import java.util.ArrayList;
import java.util.List;

public final class ReadmeSamples {
    public void readmeSamples() {
        // BEGIN: com.azure.communication.messages.readme
        // END: com.azure.communication.messages.readme
    }

    private void createNotificationMessageClientWithConnectionString() {
        // BEGIN: readme-sample-createNotificationMessageClientWithConnectionString
        NotificationMessagesClient notificationClient = new NotificationMessagesClientBuilder()
            .connectionString("<CONNECTION_STRING>")
            .buildClient();
        // END: readme-sample-createNotificationMessageClientWithConnectionString
    }

    public void  createClientWithTokenCredential() {
        // BEGIN: readme-sample-createNotificationMessageClientWithAAD
        String endpoint = "https://<resource-name>.communication.azure.com";
        TokenCredential credential = new DefaultAzureCredentialBuilder().build();
        NotificationMessagesClient notificationClient =  new NotificationMessagesClientBuilder()
            .endpoint(endpoint)
            .credential(credential)
            .buildClient();
        // END: readme-sample-createNotificationMessageClientWithAAD
    }

    public void  createClientWithAzureKeyCredential() {
        // BEGIN: readme-sample-createNotificationMessageClientWithAzureKeyCredential
        String endpoint = "https://<resource-name>.communication.azure.com";
        AzureKeyCredential azureKeyCredential = new AzureKeyCredential("<access-key>");
        NotificationMessagesClient notificationClient = new NotificationMessagesClientBuilder()
            .endpoint(endpoint)
            .credential(azureKeyCredential)
            .buildClient();
        // END: readme-sample-createNotificationMessageClientWithAzureKeyCredential
    }

    private void createMessageTemplateClientWithConnectionString() {
        // BEGIN: readme-sample-createMessageTemplateClientWithConnectionString
        MessageTemplateClient messageTemplateClient = new MessageTemplateClientBuilder()
            .connectionString("<CONNECTION_STRING>")
            .buildClient();
        // END: readme-sample-createMessageTemplateClientWithConnectionString
    }

    public void createMessageTemplateClientWithTokenCredential() {
        // BEGIN: readme-sample-createMessageTemplateClientWithAAD
        String endpoint = "https://<resource-name>.communication.azure.com";
        TokenCredential credential = new DefaultAzureCredentialBuilder().build();
        MessageTemplateClient messageTemplateClient = new MessageTemplateClientBuilder()
            .endpoint(endpoint)
            .credential(credential)
            .buildClient();
        // END: readme-sample-createMessageTemplateClientWithAAD
    }

    public void createMessageTemplateClientWithAzureKeyCredential() {
        // BEGIN: readme-sample-createMessageTemplateClientWithAzureKeyCredential
        String endpoint = "https://<resource-name>.communication.azure.com";
        AzureKeyCredential azureKeyCredential = new AzureKeyCredential("<access-key>");
        MessageTemplateClient messageTemplateClient = new MessageTemplateClientBuilder()
            .endpoint(endpoint)
            .credential(azureKeyCredential)
            .buildClient();
        // END: readme-sample-createMessageTemplateClientWithAzureKeyCredential
    }

    // BEGIN: readme-sample-sendTemplateMessage
    /*
    * This sample shows how to send template message with below details
    * Name: sample_shipping_confirmation, Language: en_US
    *  [
          {
            "type": "BODY",
            "text": "Your package has been shipped. It will be delivered in {{1}} business days."
          },
          {
            "type": "FOOTER",
            "text": "This message is from an unverified business."
          }
        ]
    * */
    private void sendTemplateMessage() {

        //Update Template Name and language according your template associate to your channel.
        MessageTemplate template = new MessageTemplate("sample_shipping_confirmation", "en_US");

        //Update template parameter type and value
        List<MessageTemplateValue> messageTemplateValues = new ArrayList<>();
        messageTemplateValues.add(new MessageTemplateText("Days", "5"));
        template.setValues(messageTemplateValues);

        //Update template parameter binding
        List<WhatsAppMessageTemplateBindingsComponent> components = new ArrayList<>();
        components.add(new WhatsAppMessageTemplateBindingsComponent("Days"));
        MessageTemplateBindings bindings = new WhatsAppMessageTemplateBindings()
            .setBody(components);
        template.setBindings(bindings);

        NotificationMessagesClient client = new NotificationMessagesClientBuilder()
            .connectionString("<CONNECTION_STRING>")
            .buildClient();
        List<String> recipients = new ArrayList<>();
        recipients.add("<RECIPIENT_IDENTIFIER e.g. PhoneNumber>");
        SendMessageResult result = client.send(
            new TemplateNotificationContent("CHANNEL_ID", recipients, template));

        result.getReceipts().forEach(r -> System.out.println("Message sent to:" + r.getTo() + " and message id:" + r.getMessageId()));
    }
    // END: readme-sample-sendTemplateMessage

    // BEGIN: readme-sample-sendTextMessage
    /*
     * This sample shows how to send simple text message with below details
     * Note: Business cannot initiate conversation with text message.
     * */
    private void sendTextMessage() {
        NotificationMessagesClient client = new NotificationMessagesClientBuilder()
            .connectionString("<CONNECTION_STRING>")
            .buildClient();
        List<String> recipients = new ArrayList<>();
        recipients.add("<RECIPIENT_IDENTIFIER e.g. PhoneNumber>");
        SendMessageResult result = client.send(
            new TextNotificationContent("<CHANNEL_ID>", recipients, "Hello from ACS messaging"));

        result.getReceipts().forEach(r -> System.out.println("Message sent to:" + r.getTo() + " and message id:" + r.getMessageId()));
    }
    // END: readme-sample-sendTextMessage

    // BEGIN: readme-sample-sendMediaMessage
    /*
     * This sample shows how to send simple media (image, video, document) message with below details
     * Note: Business cannot initiate conversation with media message.
     * */
    public void sendMediaMessage() {
        //Update the Media URL
        String mediaUrl = "https://wallpapercave.com/wp/wp2163723.jpg";
        List<String> recipients = new ArrayList<>();
        recipients.add("<RECIPIENT_IDENTIFIER e.g. PhoneNumber>");
        NotificationMessagesClient client = new NotificationMessagesClientBuilder()
            .connectionString("<CONNECTION_STRING>")
            .buildClient();
        SendMessageResult result = client.send(
            new MediaNotificationContent("<CHANNEL_ID>", recipients, mediaUrl));

        result.getReceipts().forEach(r -> System.out.println("Message sent to:" + r.getTo() + " and message id:" + r.getMessageId()));
    }
    // END: readme-sample-sendMediaMessage

    public static void getMessageTemplateWithConnectionString() {
        // BEGIN: readme-sample-ListTemplates
        MessageTemplateClient templateClient =
            new MessageTemplateClientBuilder()
                .connectionString("<Connection_String>")
                .buildClient();

        PagedIterable<MessageTemplateItem> response = templateClient.listTemplates("<CHANNEL_ID>");

        response.stream().forEach(t -> {
            WhatsAppMessageTemplateItem template = (WhatsAppMessageTemplateItem) t;
            System.out.println("===============================");
            System.out.println("Template Name :: " + template.getName());
            System.out.println("Template Language :: " + template.getLanguage());
            System.out.println("Template Status :: " + template.getStatus());
            System.out.println("Template Content :: " + template.getContent());
            System.out.println("===============================");
        });
        // END: readme-sample-ListTemplates
    }

}
