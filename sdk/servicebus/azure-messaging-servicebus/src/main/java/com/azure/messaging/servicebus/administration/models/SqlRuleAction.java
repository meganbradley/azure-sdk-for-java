// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.messaging.servicebus.administration.models;

import com.azure.core.util.logging.ClientLogger;
import com.azure.messaging.servicebus.ServiceBusMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents set of actions written in SQL language-based syntax that is performed against a {@link
 * ServiceBusMessage}.
 *
 * <p><strong>Sample: Create SQL rule filter with SQL rule action</strong></p>
 *
 * <p>The code sample below creates a rule using a SQL filter and SQL action.  The rule matches messages with:</p>
 * <ul>
 *     <li>{@link ServiceBusMessage#getCorrelationId()} equal to {@code "email"}</li>
 *     <li>{@link ServiceBusMessage#getApplicationProperties()} contains a key {@code "sender"} with value
 *     {@code "joseph"}</li>
 *     <li>{@link ServiceBusMessage#getApplicationProperties()} contains a key {@code "importance"} with value
 *  *     {@code "joseph"} OR the value is NULL.</li>
 * </ul>
 *
 * <p>If the filter matches, it will set/update the {@code "importance"} key in
 * {@link ServiceBusMessage#getApplicationProperties()} with {@code "critical"}.</p>
 *
 * <!-- src_embed com.azure.messaging.servicebus.administration.servicebusadministrationclient.createRule#string-string-string-createRuleOptions -->
 * <pre>
 * String topicName = &quot;emails&quot;;
 * String subscriptionName = &quot;important-emails&quot;;
 * String ruleName = &quot;emails-from-joseph&quot;;
 *
 * RuleFilter sqlRuleFilter = new SqlRuleFilter&#40;
 *     &quot;sys.CorrelationId = 'email' AND sender = 'joseph' AND &#40;importance IS NULL OR importance = 'high'&#41;&quot;&#41;;
 * RuleAction sqlRuleAction = new SqlRuleAction&#40;&quot;SET importance = 'critical';&quot;&#41;;
 * CreateRuleOptions createRuleOptions = new CreateRuleOptions&#40;&#41;
 *     .setFilter&#40;sqlRuleFilter&#41;
 *     .setAction&#40;sqlRuleAction&#41;;
 *
 * RuleProperties rule = client.createRule&#40;topicName, ruleName, subscriptionName, createRuleOptions&#41;;
 *
 * System.out.printf&#40;&quot;Rule '%s' created for topic %s, subscription %s. Filter: %s%n&quot;, rule.getName&#40;&#41;, topicName,
 *     subscriptionName, rule.getFilter&#40;&#41;&#41;;
 * </pre>
 * <!-- end com.azure.messaging.servicebus.administration.servicebusadministrationclient.createRule#string-string-string-createRuleOptions -->
 *
 * @see CreateRuleOptions#setAction(RuleAction)
 * @see RuleProperties#setAction(RuleAction)
 * @see <a href="https://learn.microsoft.com/azure/service-bus-messaging/topic-filters">Service Bus: Topic filters</a>
 * @see <a href="https://learn.microsoft.com/azure/service-bus-messaging/service-bus-messaging-sql-rule-action">Service
 *     Bus: SQL Rule Action</a>
 */
public class SqlRuleAction extends RuleAction {
    private static final ClientLogger LOGGER = new ClientLogger(SqlRuleAction.class);

    private final Map<String, Object> properties = new HashMap<>();
    private final String sqlExpression;
    private final String compatibilityLevel;
    private final Boolean requiresPreprocessing;

    /**
     * Creates a new instance with the given SQL expression.
     *
     * @param sqlExpression SQL expression for the action.
     *
     * @throws NullPointerException if {@code sqlExpression} is null.
     * @throws IllegalArgumentException if {@code sqlExpression} is an empty string.
     */
    public SqlRuleAction(String sqlExpression) {
        if (sqlExpression == null) {
            throw LOGGER.logExceptionAsError(new NullPointerException("'sqlExpression' cannot be null."));
        } else if (sqlExpression.isEmpty()) {
            throw LOGGER.logExceptionAsError(
                new IllegalArgumentException("'sqlExpression' cannot be an empty string."));
        }

        this.sqlExpression = sqlExpression;
        this.compatibilityLevel = null;
        this.requiresPreprocessing = null;
    }

    /**
     * Package private constructor for creating a model deserialized from the service.
     *
     * @param sqlExpression SQL expression for the action.
     * @param compatibilityLevel The compatibility level.
     * @param requiresPreprocessing Whether or not it requires preprocessing
     */
    SqlRuleAction(String sqlExpression, String compatibilityLevel, Boolean requiresPreprocessing) {
        this.sqlExpression = sqlExpression;
        this.compatibilityLevel = compatibilityLevel;
        this.requiresPreprocessing = requiresPreprocessing;
    }

    /**
     * Gets the compatibility level.
     *
     * @return The compatibility level.
     */
    String getCompatibilityLevel() {
        return compatibilityLevel;
    }

    /**
     * Gets whether or not requires preprocessing.
     *
     * @return Whether or not requires preprocessing.
     */
    Boolean isPreprocessingRequired() {
        return requiresPreprocessing;
    }

    /**
     * Gets the properties for this action.
     *
     * @return the properties for this action.
     */
    public Map<String, Object> getParameters() {
        return properties;
    }

    /**
     * Gets the SQL expression.
     *
     * @return the SQL expression.
     */
    public String getSqlExpression() {
        return sqlExpression;
    }
}
