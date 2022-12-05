// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/** todoTask. */
@Fluent
public final class MicrosoftGraphTodoTask extends MicrosoftGraphEntity {
    /*
     * itemBody
     */
    @JsonProperty(value = "body")
    private MicrosoftGraphItemBody body;

    /*
     * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone
     * in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight
     * UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @JsonProperty(value = "bodyLastModifiedDateTime")
    private OffsetDateTime bodyLastModifiedDateTime;

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "completedDateTime")
    private MicrosoftGraphDateTimeZone completedDateTime;

    /*
     * The date and time when the task was created. By default, it is in UTC. You can provide a custom time zone in the
     * request header. The property value uses ISO 8601 format. For example, midnight UTC on Jan 1, 2020 would look
     * like this: '2020-01-01T00:00:00Z'.
     */
    @JsonProperty(value = "createdDateTime")
    private OffsetDateTime createdDateTime;

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "dueDateTime")
    private MicrosoftGraphDateTimeZone dueDateTime;

    /*
     * importance
     */
    @JsonProperty(value = "importance")
    private MicrosoftGraphImportance importance;

    /*
     * Set to true if an alert is set to remind the user of the task.
     */
    @JsonProperty(value = "isReminderOn")
    private Boolean isReminderOn;

    /*
     * The date and time when the task was last modified. By default, it is in UTC. You can provide a custom time zone
     * in the request header. The property value uses ISO 8601 format and is always in UTC time. For example, midnight
     * UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     */
    @JsonProperty(value = "lastModifiedDateTime")
    private OffsetDateTime lastModifiedDateTime;

    /*
     * patternedRecurrence
     */
    @JsonProperty(value = "recurrence")
    private MicrosoftGraphPatternedRecurrence recurrence;

    /*
     * dateTimeTimeZone
     */
    @JsonProperty(value = "reminderDateTime")
    private MicrosoftGraphDateTimeZone reminderDateTime;

    /*
     * taskStatus
     */
    @JsonProperty(value = "status")
    private MicrosoftGraphTaskStatus status;

    /*
     * A brief description of the task.
     */
    @JsonProperty(value = "title")
    private String title;

    /*
     * The collection of open extensions defined for the task. Nullable.
     */
    @JsonProperty(value = "extensions")
    private List<MicrosoftGraphExtension> extensions;

    /*
     * A collection of resources linked to the task.
     */
    @JsonProperty(value = "linkedResources")
    private List<MicrosoftGraphLinkedResource> linkedResources;

    /*
     * todoTask
     */
    @JsonIgnore private Map<String, Object> additionalProperties;

    /** Creates an instance of MicrosoftGraphTodoTask class. */
    public MicrosoftGraphTodoTask() {
    }

    /**
     * Get the body property: itemBody.
     *
     * @return the body value.
     */
    public MicrosoftGraphItemBody body() {
        return this.body;
    }

    /**
     * Set the body property: itemBody.
     *
     * @param body the body value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withBody(MicrosoftGraphItemBody body) {
        this.body = body;
        return this;
    }

    /**
     * Get the bodyLastModifiedDateTime property: The date and time when the task was last modified. By default, it is
     * in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     *
     * @return the bodyLastModifiedDateTime value.
     */
    public OffsetDateTime bodyLastModifiedDateTime() {
        return this.bodyLastModifiedDateTime;
    }

    /**
     * Set the bodyLastModifiedDateTime property: The date and time when the task was last modified. By default, it is
     * in UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     *
     * @param bodyLastModifiedDateTime the bodyLastModifiedDateTime value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withBodyLastModifiedDateTime(OffsetDateTime bodyLastModifiedDateTime) {
        this.bodyLastModifiedDateTime = bodyLastModifiedDateTime;
        return this;
    }

    /**
     * Get the completedDateTime property: dateTimeTimeZone.
     *
     * @return the completedDateTime value.
     */
    public MicrosoftGraphDateTimeZone completedDateTime() {
        return this.completedDateTime;
    }

    /**
     * Set the completedDateTime property: dateTimeTimeZone.
     *
     * @param completedDateTime the completedDateTime value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withCompletedDateTime(MicrosoftGraphDateTimeZone completedDateTime) {
        this.completedDateTime = completedDateTime;
        return this;
    }

    /**
     * Get the createdDateTime property: The date and time when the task was created. By default, it is in UTC. You can
     * provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight
     * UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     *
     * @return the createdDateTime value.
     */
    public OffsetDateTime createdDateTime() {
        return this.createdDateTime;
    }

    /**
     * Set the createdDateTime property: The date and time when the task was created. By default, it is in UTC. You can
     * provide a custom time zone in the request header. The property value uses ISO 8601 format. For example, midnight
     * UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     *
     * @param createdDateTime the createdDateTime value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withCreatedDateTime(OffsetDateTime createdDateTime) {
        this.createdDateTime = createdDateTime;
        return this;
    }

    /**
     * Get the dueDateTime property: dateTimeTimeZone.
     *
     * @return the dueDateTime value.
     */
    public MicrosoftGraphDateTimeZone dueDateTime() {
        return this.dueDateTime;
    }

    /**
     * Set the dueDateTime property: dateTimeTimeZone.
     *
     * @param dueDateTime the dueDateTime value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withDueDateTime(MicrosoftGraphDateTimeZone dueDateTime) {
        this.dueDateTime = dueDateTime;
        return this;
    }

    /**
     * Get the importance property: importance.
     *
     * @return the importance value.
     */
    public MicrosoftGraphImportance importance() {
        return this.importance;
    }

    /**
     * Set the importance property: importance.
     *
     * @param importance the importance value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withImportance(MicrosoftGraphImportance importance) {
        this.importance = importance;
        return this;
    }

    /**
     * Get the isReminderOn property: Set to true if an alert is set to remind the user of the task.
     *
     * @return the isReminderOn value.
     */
    public Boolean isReminderOn() {
        return this.isReminderOn;
    }

    /**
     * Set the isReminderOn property: Set to true if an alert is set to remind the user of the task.
     *
     * @param isReminderOn the isReminderOn value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withIsReminderOn(Boolean isReminderOn) {
        this.isReminderOn = isReminderOn;
        return this;
    }

    /**
     * Get the lastModifiedDateTime property: The date and time when the task was last modified. By default, it is in
     * UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     *
     * @return the lastModifiedDateTime value.
     */
    public OffsetDateTime lastModifiedDateTime() {
        return this.lastModifiedDateTime;
    }

    /**
     * Set the lastModifiedDateTime property: The date and time when the task was last modified. By default, it is in
     * UTC. You can provide a custom time zone in the request header. The property value uses ISO 8601 format and is
     * always in UTC time. For example, midnight UTC on Jan 1, 2020 would look like this: '2020-01-01T00:00:00Z'.
     *
     * @param lastModifiedDateTime the lastModifiedDateTime value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withLastModifiedDateTime(OffsetDateTime lastModifiedDateTime) {
        this.lastModifiedDateTime = lastModifiedDateTime;
        return this;
    }

    /**
     * Get the recurrence property: patternedRecurrence.
     *
     * @return the recurrence value.
     */
    public MicrosoftGraphPatternedRecurrence recurrence() {
        return this.recurrence;
    }

    /**
     * Set the recurrence property: patternedRecurrence.
     *
     * @param recurrence the recurrence value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withRecurrence(MicrosoftGraphPatternedRecurrence recurrence) {
        this.recurrence = recurrence;
        return this;
    }

    /**
     * Get the reminderDateTime property: dateTimeTimeZone.
     *
     * @return the reminderDateTime value.
     */
    public MicrosoftGraphDateTimeZone reminderDateTime() {
        return this.reminderDateTime;
    }

    /**
     * Set the reminderDateTime property: dateTimeTimeZone.
     *
     * @param reminderDateTime the reminderDateTime value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withReminderDateTime(MicrosoftGraphDateTimeZone reminderDateTime) {
        this.reminderDateTime = reminderDateTime;
        return this;
    }

    /**
     * Get the status property: taskStatus.
     *
     * @return the status value.
     */
    public MicrosoftGraphTaskStatus status() {
        return this.status;
    }

    /**
     * Set the status property: taskStatus.
     *
     * @param status the status value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withStatus(MicrosoftGraphTaskStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the title property: A brief description of the task.
     *
     * @return the title value.
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title property: A brief description of the task.
     *
     * @param title the title value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the extensions property: The collection of open extensions defined for the task. Nullable.
     *
     * @return the extensions value.
     */
    public List<MicrosoftGraphExtension> extensions() {
        return this.extensions;
    }

    /**
     * Set the extensions property: The collection of open extensions defined for the task. Nullable.
     *
     * @param extensions the extensions value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withExtensions(List<MicrosoftGraphExtension> extensions) {
        this.extensions = extensions;
        return this;
    }

    /**
     * Get the linkedResources property: A collection of resources linked to the task.
     *
     * @return the linkedResources value.
     */
    public List<MicrosoftGraphLinkedResource> linkedResources() {
        return this.linkedResources;
    }

    /**
     * Set the linkedResources property: A collection of resources linked to the task.
     *
     * @param linkedResources the linkedResources value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withLinkedResources(List<MicrosoftGraphLinkedResource> linkedResources) {
        this.linkedResources = linkedResources;
        return this;
    }

    /**
     * Get the additionalProperties property: todoTask.
     *
     * @return the additionalProperties value.
     */
    @JsonAnyGetter
    public Map<String, Object> additionalProperties() {
        return this.additionalProperties;
    }

    /**
     * Set the additionalProperties property: todoTask.
     *
     * @param additionalProperties the additionalProperties value to set.
     * @return the MicrosoftGraphTodoTask object itself.
     */
    public MicrosoftGraphTodoTask withAdditionalProperties(Map<String, Object> additionalProperties) {
        this.additionalProperties = additionalProperties;
        return this;
    }

    @JsonAnySetter
    void withAdditionalProperties(String key, Object value) {
        if (additionalProperties == null) {
            additionalProperties = new HashMap<>();
        }
        additionalProperties.put(key, value);
    }

    /** {@inheritDoc} */
    @Override
    public MicrosoftGraphTodoTask withId(String id) {
        super.withId(id);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (body() != null) {
            body().validate();
        }
        if (completedDateTime() != null) {
            completedDateTime().validate();
        }
        if (dueDateTime() != null) {
            dueDateTime().validate();
        }
        if (recurrence() != null) {
            recurrence().validate();
        }
        if (reminderDateTime() != null) {
            reminderDateTime().validate();
        }
        if (extensions() != null) {
            extensions().forEach(e -> e.validate());
        }
        if (linkedResources() != null) {
            linkedResources().forEach(e -> e.validate());
        }
    }
}
