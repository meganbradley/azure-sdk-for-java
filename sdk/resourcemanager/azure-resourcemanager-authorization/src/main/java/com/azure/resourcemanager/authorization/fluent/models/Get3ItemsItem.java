// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.authorization.fluent.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/** Defines values for Get3ItemsItem. */
public final class Get3ItemsItem extends ExpandableStringEnum<Get3ItemsItem> {
    /** Static value * for Get3ItemsItem. */
    public static final Get3ItemsItem ASTERISK = fromString("*");

    /** Static value createdOnBehalfOf for Get3ItemsItem. */
    public static final Get3ItemsItem CREATED_ON_BEHALF_OF = fromString("createdOnBehalfOf");

    /** Static value extensionProperties for Get3ItemsItem. */
    public static final Get3ItemsItem EXTENSION_PROPERTIES = fromString("extensionProperties");

    /** Static value homeRealmDiscoveryPolicies for Get3ItemsItem. */
    public static final Get3ItemsItem HOME_REALM_DISCOVERY_POLICIES = fromString("homeRealmDiscoveryPolicies");

    /** Static value owners for Get3ItemsItem. */
    public static final Get3ItemsItem OWNERS = fromString("owners");

    /** Static value tokenIssuancePolicies for Get3ItemsItem. */
    public static final Get3ItemsItem TOKEN_ISSUANCE_POLICIES = fromString("tokenIssuancePolicies");

    /** Static value tokenLifetimePolicies for Get3ItemsItem. */
    public static final Get3ItemsItem TOKEN_LIFETIME_POLICIES = fromString("tokenLifetimePolicies");

    /** Static value appRoleAssignments for Get3ItemsItem. */
    public static final Get3ItemsItem APP_ROLE_ASSIGNMENTS = fromString("appRoleAssignments");

    /** Static value memberOf for Get3ItemsItem. */
    public static final Get3ItemsItem MEMBER_OF = fromString("memberOf");

    /** Static value members for Get3ItemsItem. */
    public static final Get3ItemsItem MEMBERS = fromString("members");

    /** Static value membersWithLicenseErrors for Get3ItemsItem. */
    public static final Get3ItemsItem MEMBERS_WITH_LICENSE_ERRORS = fromString("membersWithLicenseErrors");

    /** Static value permissionGrants for Get3ItemsItem. */
    public static final Get3ItemsItem PERMISSION_GRANTS = fromString("permissionGrants");

    /** Static value settings for Get3ItemsItem. */
    public static final Get3ItemsItem SETTINGS = fromString("settings");

    /** Static value transitiveMemberOf for Get3ItemsItem. */
    public static final Get3ItemsItem TRANSITIVE_MEMBER_OF = fromString("transitiveMemberOf");

    /** Static value transitiveMembers for Get3ItemsItem. */
    public static final Get3ItemsItem TRANSITIVE_MEMBERS = fromString("transitiveMembers");

    /** Static value acceptedSenders for Get3ItemsItem. */
    public static final Get3ItemsItem ACCEPTED_SENDERS = fromString("acceptedSenders");

    /** Static value calendar for Get3ItemsItem. */
    public static final Get3ItemsItem CALENDAR = fromString("calendar");

    /** Static value calendarView for Get3ItemsItem. */
    public static final Get3ItemsItem CALENDAR_VIEW = fromString("calendarView");

    /** Static value conversations for Get3ItemsItem. */
    public static final Get3ItemsItem CONVERSATIONS = fromString("conversations");

    /** Static value events for Get3ItemsItem. */
    public static final Get3ItemsItem EVENTS = fromString("events");

    /** Static value photo for Get3ItemsItem. */
    public static final Get3ItemsItem PHOTO = fromString("photo");

    /** Static value photos for Get3ItemsItem. */
    public static final Get3ItemsItem PHOTOS = fromString("photos");

    /** Static value rejectedSenders for Get3ItemsItem. */
    public static final Get3ItemsItem REJECTED_SENDERS = fromString("rejectedSenders");

    /** Static value threads for Get3ItemsItem. */
    public static final Get3ItemsItem THREADS = fromString("threads");

    /** Static value drive for Get3ItemsItem. */
    public static final Get3ItemsItem DRIVE = fromString("drive");

    /** Static value drives for Get3ItemsItem. */
    public static final Get3ItemsItem DRIVES = fromString("drives");

    /** Static value sites for Get3ItemsItem. */
    public static final Get3ItemsItem SITES = fromString("sites");

    /** Static value extensions for Get3ItemsItem. */
    public static final Get3ItemsItem EXTENSIONS = fromString("extensions");

    /** Static value groupLifecyclePolicies for Get3ItemsItem. */
    public static final Get3ItemsItem GROUP_LIFECYCLE_POLICIES = fromString("groupLifecyclePolicies");

    /** Static value planner for Get3ItemsItem. */
    public static final Get3ItemsItem PLANNER = fromString("planner");

    /** Static value onenote for Get3ItemsItem. */
    public static final Get3ItemsItem ONENOTE = fromString("onenote");

    /** Static value team for Get3ItemsItem. */
    public static final Get3ItemsItem TEAM = fromString("team");

    /** Static value createdObjects for Get3ItemsItem. */
    public static final Get3ItemsItem CREATED_OBJECTS = fromString("createdObjects");

    /** Static value directReports for Get3ItemsItem. */
    public static final Get3ItemsItem DIRECT_REPORTS = fromString("directReports");

    /** Static value licenseDetails for Get3ItemsItem. */
    public static final Get3ItemsItem LICENSE_DETAILS = fromString("licenseDetails");

    /** Static value manager for Get3ItemsItem. */
    public static final Get3ItemsItem MANAGER = fromString("manager");

    /** Static value oauth2PermissionGrants for Get3ItemsItem. */
    public static final Get3ItemsItem OAUTH2PERMISSION_GRANTS = fromString("oauth2PermissionGrants");

    /** Static value ownedDevices for Get3ItemsItem. */
    public static final Get3ItemsItem OWNED_DEVICES = fromString("ownedDevices");

    /** Static value ownedObjects for Get3ItemsItem. */
    public static final Get3ItemsItem OWNED_OBJECTS = fromString("ownedObjects");

    /** Static value registeredDevices for Get3ItemsItem. */
    public static final Get3ItemsItem REGISTERED_DEVICES = fromString("registeredDevices");

    /** Static value scopedRoleMemberOf for Get3ItemsItem. */
    public static final Get3ItemsItem SCOPED_ROLE_MEMBER_OF = fromString("scopedRoleMemberOf");

    /** Static value calendarGroups for Get3ItemsItem. */
    public static final Get3ItemsItem CALENDAR_GROUPS = fromString("calendarGroups");

    /** Static value calendars for Get3ItemsItem. */
    public static final Get3ItemsItem CALENDARS = fromString("calendars");

    /** Static value contactFolders for Get3ItemsItem. */
    public static final Get3ItemsItem CONTACT_FOLDERS = fromString("contactFolders");

    /** Static value contacts for Get3ItemsItem. */
    public static final Get3ItemsItem CONTACTS = fromString("contacts");

    /** Static value inferenceClassification for Get3ItemsItem. */
    public static final Get3ItemsItem INFERENCE_CLASSIFICATION = fromString("inferenceClassification");

    /** Static value mailFolders for Get3ItemsItem. */
    public static final Get3ItemsItem MAIL_FOLDERS = fromString("mailFolders");

    /** Static value messages for Get3ItemsItem. */
    public static final Get3ItemsItem MESSAGES = fromString("messages");

    /** Static value outlook for Get3ItemsItem. */
    public static final Get3ItemsItem OUTLOOK = fromString("outlook");

    /** Static value people for Get3ItemsItem. */
    public static final Get3ItemsItem PEOPLE = fromString("people");

    /** Static value followedSites for Get3ItemsItem. */
    public static final Get3ItemsItem FOLLOWED_SITES = fromString("followedSites");

    /** Static value managedDevices for Get3ItemsItem. */
    public static final Get3ItemsItem MANAGED_DEVICES = fromString("managedDevices");

    /** Static value managedAppRegistrations for Get3ItemsItem. */
    public static final Get3ItemsItem MANAGED_APP_REGISTRATIONS = fromString("managedAppRegistrations");

    /** Static value deviceManagementTroubleshootingEvents for Get3ItemsItem. */
    public static final Get3ItemsItem DEVICE_MANAGEMENT_TROUBLESHOOTING_EVENTS =
        fromString("deviceManagementTroubleshootingEvents");

    /** Static value insights for Get3ItemsItem. */
    public static final Get3ItemsItem INSIGHTS = fromString("insights");

    /** Static value activities for Get3ItemsItem. */
    public static final Get3ItemsItem ACTIVITIES = fromString("activities");

    /** Static value onlineMeetings for Get3ItemsItem. */
    public static final Get3ItemsItem ONLINE_MEETINGS = fromString("onlineMeetings");

    /** Static value presence for Get3ItemsItem. */
    public static final Get3ItemsItem PRESENCE = fromString("presence");

    /** Static value joinedTeams for Get3ItemsItem. */
    public static final Get3ItemsItem JOINED_TEAMS = fromString("joinedTeams");

    /** Static value teamwork for Get3ItemsItem. */
    public static final Get3ItemsItem TEAMWORK = fromString("teamwork");

    /** Static value todo for Get3ItemsItem. */
    public static final Get3ItemsItem TODO = fromString("todo");

    /**
     * Creates or finds a Get3ItemsItem from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding Get3ItemsItem.
     */
    @JsonCreator
    public static Get3ItemsItem fromString(String name) {
        return fromString(name, Get3ItemsItem.class);
    }

    /**
     * Gets known Get3ItemsItem values.
     *
     * @return known Get3ItemsItem values.
     */
    public static Collection<Get3ItemsItem> values() {
        return values(Get3ItemsItem.class);
    }
}
