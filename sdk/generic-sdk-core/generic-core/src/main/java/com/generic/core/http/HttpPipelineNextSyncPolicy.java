// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.generic.core.http;

import com.generic.core.http.policy.HttpPipelinePolicy;

/**
 * A type that invokes next policy in the pipeline.
 */
public class HttpPipelineNextSyncPolicy {
    // private final HttpPipelineCallState state;

    /**
     * Package Private ctr.
     * Creates HttpPipelineNextPolicy.
     *
     * @param state the pipeline call state.
     */
    HttpPipelineNextSyncPolicy() {
        // this.state = state;
    }

    /**
     * Invokes the next {@link HttpPipelinePolicy}.
     *
     * @return The response.
     */
    public HttpResponse processSync() {
        // HttpPipelinePolicy nextPolicy = state.getNextPolicy();
        // if (nextPolicy == null) {
        //     return this.state.getPipeline().getHttpClient().sendSync(
        //         this.state.getCallContext().getHttpRequest(), this.state.getCallContext().getContext());
        // } else {
        //     return nextPolicy.processSync(this.state.getCallContext(), this);
        // }
        return null;
    }

    /**
     * Creates a new instance of this instance.
     *
     * @return A new instance of this next pipeline sync policy.
     */
    @Override
    public HttpPipelineNextSyncPolicy clone() {
        return new HttpPipelineNextSyncPolicy();
    }

}
