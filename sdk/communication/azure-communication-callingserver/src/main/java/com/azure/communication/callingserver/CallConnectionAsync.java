// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.communication.callingserver;

import static com.azure.core.util.FluxUtil.monoError;
//import static com.azure.core.util.FluxUtil.withContext;

//import java.net.URI;
//import java.util.List;
//import java.util.stream.Collectors;

import com.azure.communication.callingserver.implementation.CallConnectionsImpl;
//import com.azure.communication.callingserver.implementation.converters.AddParticipantResultConverter;
//import com.azure.communication.callingserver.implementation.converters.AudioGroupResultConverter;
import com.azure.communication.callingserver.implementation.converters.CallingServerErrorConverter;
//import com.azure.communication.callingserver.implementation.converters.CallParticipantConverter;
import com.azure.communication.callingserver.implementation.converters.CallConnectionPropertiesConverter;
//import com.azure.communication.callingserver.implementation.converters.CommunicationIdentifierConverter;
//import com.azure.communication.callingserver.implementation.converters.PhoneNumberIdentifierConverter;
//import com.azure.communication.callingserver.implementation.converters.PlayAudioResultConverter;
//import com.azure.communication.callingserver.implementation.converters.RemoveParticipantRequestConverter;
//import com.azure.communication.callingserver.implementation.converters.TransferToCallRequestConverter;
//import com.azure.communication.callingserver.implementation.converters.TransferToParticipantRequestConverter;
//import com.azure.communication.callingserver.implementation.converters.TransferCallResultConverter;
//import com.azure.communication.callingserver.implementation.models.AddParticipantRequest;
//import com.azure.communication.callingserver.implementation.models.AudioGroupRequest;
//import com.azure.communication.callingserver.implementation.models.CancelParticipantMediaOperationRequest;
//import com.azure.communication.callingserver.implementation.models.CommunicationErrorResponseException;
//import com.azure.communication.callingserver.implementation.models.GetParticipantRequest;
//import com.azure.communication.callingserver.implementation.models.RemoveFromDefaultAudioGroupRequest;
//import com.azure.communication.callingserver.implementation.models.MuteParticipantRequest;
//import com.azure.communication.callingserver.implementation.models.PlayAudioRequest;
//import com.azure.communication.callingserver.implementation.models.PlayAudioToParticipantRequest;
//import com.azure.communication.callingserver.implementation.models.AddToDefaultAudioGroupRequest;
//import com.azure.communication.callingserver.implementation.models.TransferToCallRequest;
//import com.azure.communication.callingserver.implementation.models.TransferToParticipantRequest;
//import com.azure.communication.callingserver.implementation.models.UnmuteParticipantRequest;
//import com.azure.communication.callingserver.implementation.models.UpdateAudioGroupRequest;
//import com.azure.communication.callingserver.models.AddParticipantResult;
//import com.azure.communication.callingserver.models.AudioGroupResult;
//import com.azure.communication.callingserver.models.AudioRoutingMode;
import com.azure.communication.callingserver.models.CallConnectionProperties;
//import com.azure.communication.callingserver.models.CallParticipant;
import com.azure.communication.callingserver.models.CallingServerErrorException;
//import com.azure.communication.callingserver.models.CreateAudioGroupResult;
//import com.azure.communication.callingserver.models.PlayAudioOptions;
//import com.azure.communication.callingserver.models.PlayAudioResult;
//import com.azure.communication.callingserver.models.TransferCallResult;
//import com.azure.communication.common.CommunicationIdentifier;
//import com.azure.communication.common.PhoneNumberIdentifier;
//import com.azure.core.annotation.ReturnType;
//import com.azure.core.annotation.ServiceMethod;
//import com.azure.core.http.rest.Response;
//import com.azure.core.http.rest.SimpleResponse;
//import com.azure.core.util.Context;
import com.azure.communication.callingserver.implementation.models.CommunicationErrorResponseException;
import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.util.logging.ClientLogger;
import reactor.core.publisher.Mono;

/**
 * Asynchronous client that supports call connection operations.
 */
public class CallConnectionAsync {

    private final String callLegId;
    private final CallConnectionsImpl callConnectionInternal;
    private final ClientLogger logger;

    CallConnectionAsync(String callLegId, CallConnectionsImpl callConnectionInternal) {
        this.callLegId = callLegId;
        this.callConnectionInternal = callConnectionInternal;
        this.logger = new ClientLogger(CallConnectionAsync.class);
    }

    /**
     * Get the callLegId property, which is the call connection id.
     *
     * @return callLegId value.
     */
    public String getCallLegId() {
        return callLegId;
    }

    /**
     * Get call connection properties.
     *
     * @throws CallingServerErrorException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return Response payload for a successful get call connection request.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    public Mono<CallConnectionProperties> getCall() {
        try {

            return callConnectionInternal.getCallAsync(callLegId)
                .onErrorMap(CommunicationErrorResponseException.class, CallingServerErrorConverter::translateException)
                .flatMap(result -> Mono.just(CallConnectionPropertiesConverter.convert(result)));
        } catch (RuntimeException ex) {
            return monoError(logger, ex);
        }
    }
}
