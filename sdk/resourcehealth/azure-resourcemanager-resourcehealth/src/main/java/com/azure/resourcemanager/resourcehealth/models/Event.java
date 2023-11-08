// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.resourcehealth.models;

import com.azure.core.management.SystemData;
import com.azure.resourcemanager.resourcehealth.fluent.models.EventInner;
import java.time.OffsetDateTime;
import java.util.List;

/** An immutable client-side representation of Event. */
public interface Event {
    /**
     * Gets the id property: Fully qualified resource Id for the resource.
     *
     * @return the id value.
     */
    String id();

    /**
     * Gets the name property: The name of the resource.
     *
     * @return the name value.
     */
    String name();

    /**
     * Gets the type property: The type of the resource.
     *
     * @return the type value.
     */
    String type();

    /**
     * Gets the systemData property: Azure Resource Manager metadata containing createdBy and modifiedBy information.
     *
     * @return the systemData value.
     */
    SystemData systemData();

    /**
     * Gets the eventType property: Type of event.
     *
     * @return the eventType value.
     */
    EventTypeValues eventType();

    /**
     * Gets the eventSubType property: Sub type of the event. Currently used to determine retirement communications for
     * health advisory events.
     *
     * @return the eventSubType value.
     */
    EventSubTypeValues eventSubType();

    /**
     * Gets the eventSource property: Source of event.
     *
     * @return the eventSource value.
     */
    EventSourceValues eventSource();

    /**
     * Gets the status property: Current status of event.
     *
     * @return the status value.
     */
    EventStatusValues status();

    /**
     * Gets the title property: Title text of event.
     *
     * @return the title value.
     */
    String title();

    /**
     * Gets the summary property: Summary text of event.
     *
     * @return the summary value.
     */
    String summary();

    /**
     * Gets the headerProperty property: Header text of event.
     *
     * @return the headerProperty value.
     */
    String headerProperty();

    /**
     * Gets the level property: Level of insight.
     *
     * @return the level value.
     */
    LevelValues level();

    /**
     * Gets the eventLevel property: Level of event.
     *
     * @return the eventLevel value.
     */
    EventLevelValues eventLevel();

    /**
     * Gets the externalIncidentId property: The id of the Incident.
     *
     * @return the externalIncidentId value.
     */
    String externalIncidentId();

    /**
     * Gets the reason property: The reason for the Incident.
     *
     * @return the reason value.
     */
    String reason();

    /**
     * Gets the article property: Article of event.
     *
     * @return the article value.
     */
    EventPropertiesArticle article();

    /**
     * Gets the links property: Useful links of event.
     *
     * @return the links value.
     */
    List<Link> links();

    /**
     * Gets the impactStartTime property: It provides the Timestamp for when the health impacting event started.
     *
     * @return the impactStartTime value.
     */
    OffsetDateTime impactStartTime();

    /**
     * Gets the impactMitigationTime property: It provides the Timestamp for when the health impacting event resolved.
     *
     * @return the impactMitigationTime value.
     */
    OffsetDateTime impactMitigationTime();

    /**
     * Gets the impact property: List services impacted by the service health event.
     *
     * @return the impact value.
     */
    List<Impact> impact();

    /**
     * Gets the recommendedActions property: Recommended actions of event.
     *
     * @return the recommendedActions value.
     */
    EventPropertiesRecommendedActions recommendedActions();

    /**
     * Gets the faqs property: Frequently asked questions for the service health event.
     *
     * @return the faqs value.
     */
    List<Faq> faqs();

    /**
     * Gets the isHir property: It provides information if the event is High incident rate event or not.
     *
     * @return the isHir value.
     */
    Boolean isHir();

    /**
     * Gets the enableMicrosoftSupport property: Tells if we want to enable or disable Microsoft Support for this event.
     *
     * @return the enableMicrosoftSupport value.
     */
    Boolean enableMicrosoftSupport();

    /**
     * Gets the description property: Contains the communication message for the event, that could include summary, root
     * cause and other details.
     *
     * @return the description value.
     */
    String description();

    /**
     * Gets the platformInitiated property: Is true if the event is platform initiated.
     *
     * @return the platformInitiated value.
     */
    Boolean platformInitiated();

    /**
     * Gets the enableChatWithUs property: Tells if we want to enable or disable Microsoft Support for this event.
     *
     * @return the enableChatWithUs value.
     */
    Boolean enableChatWithUs();

    /**
     * Gets the priority property: Priority level of the event. Has value from 0 to 23. 0 is the highest priority.
     * Service issue events have higher priority followed by planned maintenance and health advisory. Critical events
     * have higher priority followed by error, warning and informational. Furthermore, active events have higher
     * priority than resolved.
     *
     * @return the priority value.
     */
    Integer priority();

    /**
     * Gets the lastUpdateTime property: It provides the Timestamp for when the health impacting event was last updated.
     *
     * @return the lastUpdateTime value.
     */
    OffsetDateTime lastUpdateTime();

    /**
     * Gets the hirStage property: Stage for HIR Document.
     *
     * @return the hirStage value.
     */
    String hirStage();

    /**
     * Gets the additionalInformation property: Additional information.
     *
     * @return the additionalInformation value.
     */
    EventPropertiesAdditionalInformation additionalInformation();

    /**
     * Gets the duration property: duration in seconds.
     *
     * @return the duration value.
     */
    Integer duration();

    /**
     * Gets the impactType property: The type of the impact.
     *
     * @return the impactType value.
     */
    String impactType();

    /**
     * Gets the maintenanceId property: Unique identifier for planned maintenance event.
     *
     * @return the maintenanceId value.
     */
    String maintenanceId();

    /**
     * Gets the maintenanceType property: The type of planned maintenance event.
     *
     * @return the maintenanceType value.
     */
    String maintenanceType();

    /**
     * Gets the argQuery property: Azure Resource Graph query to fetch the affected resources from their existing Azure
     * Resource Graph locations.
     *
     * @return the argQuery value.
     */
    String argQuery();

    /**
     * Gets the inner com.azure.resourcemanager.resourcehealth.fluent.models.EventInner object.
     *
     * @return the inner object.
     */
    EventInner innerModel();
}
