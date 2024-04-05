// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) TypeSpec Code Generator.
package com.azure.compute.batch.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/**
 * The execution constraints for a Job.
 */
@Fluent
public final class BatchJobConstraints {

    /*
     * The maximum elapsed time that the Job may run, measured from the time the Job is created. If the Job does not complete within the time limit, the Batch service terminates it and any Tasks that are still running. In this case, the termination reason will be MaxWallClockTimeExpiry. If this property is not specified, there is no time limit on how long the Job may run.
     */
    @Generated
    @JsonProperty(value = "maxWallClockTime")
    private Duration maxWallClockTime;

    /*
     * The maximum number of times each Task may be retried. The Batch service retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries. The Batch service will try each Task once, and may then retry up to this limit. For example, if the maximum retry count is 3, Batch tries a Task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0, the Batch service does not retry Tasks. If the maximum retry count is -1, the Batch service retries Tasks without limit. The default value is 0 (no retries).
     */
    @Generated
    @JsonProperty(value = "maxTaskRetryCount")
    private Integer maxTaskRetryCount;

    /**
     * Creates an instance of BatchJobConstraints class.
     */
    @Generated
    public BatchJobConstraints() {
    }

    /**
     * Get the maxWallClockTime property: The maximum elapsed time that the Job may run, measured from the time the Job
     * is created. If the Job does not complete within the time limit, the Batch service terminates it and any Tasks
     * that are still running. In this case, the termination reason will be MaxWallClockTimeExpiry. If this property is
     * not specified, there is no time limit on how long the Job may run.
     *
     * @return the maxWallClockTime value.
     */
    @Generated
    public Duration getMaxWallClockTime() {
        return this.maxWallClockTime;
    }

    /**
     * Set the maxWallClockTime property: The maximum elapsed time that the Job may run, measured from the time the Job
     * is created. If the Job does not complete within the time limit, the Batch service terminates it and any Tasks
     * that are still running. In this case, the termination reason will be MaxWallClockTimeExpiry. If this property is
     * not specified, there is no time limit on how long the Job may run.
     *
     * @param maxWallClockTime the maxWallClockTime value to set.
     * @return the BatchJobConstraints object itself.
     */
    @Generated
    public BatchJobConstraints setMaxWallClockTime(Duration maxWallClockTime) {
        this.maxWallClockTime = maxWallClockTime;
        return this;
    }

    /**
     * Get the maxTaskRetryCount property: The maximum number of times each Task may be retried. The Batch service
     * retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries. The
     * Batch service will try each Task once, and may then retry up to this limit. For example, if the maximum retry
     * count is 3, Batch tries a Task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0,
     * the Batch service does not retry Tasks. If the maximum retry count is -1, the Batch service retries Tasks without
     * limit. The default value is 0 (no retries).
     *
     * @return the maxTaskRetryCount value.
     */
    @Generated
    public Integer getMaxTaskRetryCount() {
        return this.maxTaskRetryCount;
    }

    /**
     * Set the maxTaskRetryCount property: The maximum number of times each Task may be retried. The Batch service
     * retries a Task if its exit code is nonzero. Note that this value specifically controls the number of retries. The
     * Batch service will try each Task once, and may then retry up to this limit. For example, if the maximum retry
     * count is 3, Batch tries a Task up to 4 times (one initial try and 3 retries). If the maximum retry count is 0,
     * the Batch service does not retry Tasks. If the maximum retry count is -1, the Batch service retries Tasks without
     * limit. The default value is 0 (no retries).
     *
     * @param maxTaskRetryCount the maxTaskRetryCount value to set.
     * @return the BatchJobConstraints object itself.
     */
    @Generated
    public BatchJobConstraints setMaxTaskRetryCount(Integer maxTaskRetryCount) {
        this.maxTaskRetryCount = maxTaskRetryCount;
        return this;
    }
}
