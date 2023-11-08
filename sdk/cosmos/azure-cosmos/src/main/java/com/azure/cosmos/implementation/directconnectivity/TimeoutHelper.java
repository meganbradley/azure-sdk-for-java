// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.cosmos.implementation.directconnectivity;

import com.azure.cosmos.implementation.GoneException;
import com.azure.cosmos.implementation.HttpConstants;
import com.azure.cosmos.implementation.RMResources;
import com.azure.cosmos.implementation.RequestTimeoutException;

import java.time.Duration;
import java.time.Instant;

public class TimeoutHelper {
    private final Instant startTime;
    private final Duration timeOut;

    public TimeoutHelper(Duration timeOut) {
        this.startTime = Instant.now();
        this.timeOut = timeOut;
    }

    public boolean isElapsed() {
        return this.isElapsed(this.timeOut);
    }

    public boolean isElapsed(Duration timeoutToCompareTo) {
        Duration elapsed = Duration.ofMillis(Instant.now().toEpochMilli() - startTime.toEpochMilli());
        return elapsed.compareTo(timeoutToCompareTo) >= 0;
    }

    public Duration getRemainingTime() {
        return this.getRemainingTime(this.timeOut);
    }

    public Duration getRemainingTime(Duration timeoutToCompareTo) {
        Duration elapsed = Duration.ofMillis(Instant.now().toEpochMilli() - startTime.toEpochMilli());
        return timeoutToCompareTo.minus(elapsed);
    }

    public void throwTimeoutIfElapsed() throws RequestTimeoutException {
        if (this.isElapsed()) {
            throw new RequestTimeoutException();
        }
    }

    public void throwGoneIfElapsed() throws GoneException {
        if (this.isElapsed()) {
            throw new GoneException(RMResources.Gone, HttpConstants.SubStatusCodes.TIMEOUT_GENERATED_410);
        }
    }
}
