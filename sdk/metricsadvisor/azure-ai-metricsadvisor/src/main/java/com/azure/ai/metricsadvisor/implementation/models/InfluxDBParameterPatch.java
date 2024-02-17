// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.ai.metricsadvisor.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The InfluxDBParameterPatch model. */
@Fluent
public final class InfluxDBParameterPatch {
    /*
     * The connection string of this InfluxDB
     */
    @JsonProperty(value = "connectionString")
    private String connectionString;

    /*
     * A database name
     */
    @JsonProperty(value = "database")
    private String database;

    /*
     * The user name of the account that can access this database
     */
    @JsonProperty(value = "userName")
    private String userName;

    /*
     * The password of the account that can access this database
     */
    @JsonProperty(value = "password")
    private String password;

    /*
     * The script to query this database
     */
    @JsonProperty(value = "query")
    private String query;

    /** Creates an instance of InfluxDBParameterPatch class. */
    public InfluxDBParameterPatch() {}

    /**
     * Get the connectionString property: The connection string of this InfluxDB.
     *
     * @return the connectionString value.
     */
    public String getConnectionString() {
        return this.connectionString;
    }

    /**
     * Set the connectionString property: The connection string of this InfluxDB.
     *
     * @param connectionString the connectionString value to set.
     * @return the InfluxDBParameterPatch object itself.
     */
    public InfluxDBParameterPatch setConnectionString(String connectionString) {
        this.connectionString = connectionString;
        return this;
    }

    /**
     * Get the database property: A database name.
     *
     * @return the database value.
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * Set the database property: A database name.
     *
     * @param database the database value to set.
     * @return the InfluxDBParameterPatch object itself.
     */
    public InfluxDBParameterPatch setDatabase(String database) {
        this.database = database;
        return this;
    }

    /**
     * Get the userName property: The user name of the account that can access this database.
     *
     * @return the userName value.
     */
    public String getUserName() {
        return this.userName;
    }

    /**
     * Set the userName property: The user name of the account that can access this database.
     *
     * @param userName the userName value to set.
     * @return the InfluxDBParameterPatch object itself.
     */
    public InfluxDBParameterPatch setUserName(String userName) {
        this.userName = userName;
        return this;
    }

    /**
     * Get the password property: The password of the account that can access this database.
     *
     * @return the password value.
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * Set the password property: The password of the account that can access this database.
     *
     * @param password the password value to set.
     * @return the InfluxDBParameterPatch object itself.
     */
    public InfluxDBParameterPatch setPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get the query property: The script to query this database.
     *
     * @return the query value.
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * Set the query property: The script to query this database.
     *
     * @param query the query value to set.
     * @return the InfluxDBParameterPatch object itself.
     */
    public InfluxDBParameterPatch setQuery(String query) {
        this.query = query;
        return this;
    }
}
