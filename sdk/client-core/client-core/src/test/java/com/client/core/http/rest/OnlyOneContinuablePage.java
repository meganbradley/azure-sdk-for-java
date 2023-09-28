// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.client.core.http.rest;

import com.client.core.util.IterableStream;
import com.client.core.util.paging.ContinuablePage;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public final class OnlyOneContinuablePage implements ContinuablePage<Integer, Integer> {
    private final IterableStream<Integer> elements;
    private final Integer nextContinuationToken;

    public OnlyOneContinuablePage(Integer continuationToken, Integer nextContinuationToken, Integer pageSize) {
        elements = IterableStream.of(IntStream.range(continuationToken * 10, (continuationToken * 10) + pageSize)
            .boxed()
            .collect(Collectors.toList()));

        this.nextContinuationToken = nextContinuationToken;
    }

    @Override
    public IterableStream<Integer> getElements() {
        return elements;
    }

    @Override
    public Integer getContinuationToken() {
        return nextContinuationToken;
    }
}
