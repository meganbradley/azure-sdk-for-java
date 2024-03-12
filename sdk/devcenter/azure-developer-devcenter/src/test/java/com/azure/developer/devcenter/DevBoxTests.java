// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.developer.devcenter;

import com.azure.core.util.polling.LongRunningOperationStatus;
import com.azure.core.util.polling.SyncPoller;
import com.azure.developer.devcenter.models.DevBox;
import com.azure.developer.devcenter.models.DevBoxAction;
import com.azure.developer.devcenter.models.DevBoxActionDelayResult;
import com.azure.developer.devcenter.models.DevBoxActionDelayStatus;
import com.azure.developer.devcenter.models.DevBoxActionType;
import com.azure.developer.devcenter.models.DevBoxPool;
import com.azure.developer.devcenter.models.DevBoxSchedule;
import com.azure.developer.devcenter.models.DevCenterOperationDetails;
import com.azure.developer.devcenter.models.RemoteConnection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;
import java.util.List;
import java.util.stream.Collectors;

class DevBoxTests extends DevCenterClientTestBase {
    @Test
    public void testCreateDevBox() {
        SyncPoller<DevCenterOperationDetails, DevBox> devBoxCreateResponse =
            devBoxesClient.beginCreateDevBox(projectName, meUserId, new DevBox(devBoxName, poolName));
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxCreateResponse.waitForCompletion().getStatus());
        Assertions.assertEquals(devBoxName, devBoxCreateResponse.getFinalResult().getName());
    }

    @Test
    public void testGetDevBox() {
        setupDevBox();

        DevBox devBox = devBoxesClient.getDevBox(projectName, meUserId, devBoxName);
        Assertions.assertEquals(devBoxName, devBox.getName());
    }

    @Test
    public void testListDevBoxes() {
        setupDevBox();
        
        List<DevBox> devBoxes = devBoxesClient.listDevBoxes(projectName, meUserId).stream().collect(Collectors.toList());  
        Assertions.assertEquals(1, devBoxes.size());
        Assertions.assertEquals(devBoxName, devBoxes.get(0).getName());
    }

    @Test
    public void testListAllDevBoxesByUser() {
        setupDevBox();
        
        List<DevBox> devBoxes = devBoxesClient.listAllDevBoxesByUser(meUserId).stream().collect(Collectors.toList());  
        Assertions.assertEquals(1, devBoxes.size());
        Assertions.assertEquals(devBoxName, devBoxes.get(0).getName());
    }

    @Test
    public void testListAllDevBoxes() {
        setupDevBox();
        
        List<DevBox> devBoxes = devBoxesClient.listAllDevBoxes().stream().collect(Collectors.toList());  
        Assertions.assertEquals(1, devBoxes.size());
        Assertions.assertEquals(devBoxName, devBoxes.get(0).getName());
    }

    @Test
    public void testGetRemoteConnection() {
        setupDevBox();
        
        RemoteConnection remoteConnection = devBoxesClient.getRemoteConnection(projectName, meUserId, devBoxName);
        Assertions.assertNotNull(remoteConnection.getWebUrl());
        Assertions.assertNotNull(remoteConnection.getRdpConnectionUrl());
    }

    @Test
    public void testStartAndStopDevBox() {
        setupDevBox();
        
        SyncPoller<DevCenterOperationDetails, Void> devBoxStopResponse =
                devBoxesClient.beginStopDevBox(projectName, meUserId, devBoxName);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxStopResponse.waitForCompletion().getStatus());

        SyncPoller<DevCenterOperationDetails, Void> devBoxStartResponse =
                devBoxesClient.beginStartDevBox(projectName, meUserId, devBoxName);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxStartResponse.waitForCompletion().getStatus());
    }

    @Test
    public void testRestartDevBox() {
        setupDevBox();

        SyncPoller<DevCenterOperationDetails, Void> devBoxRestartResponse =
                devBoxesClient.beginRestartDevBox(projectName, meUserId, devBoxName);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxRestartResponse.waitForCompletion().getStatus());
    }

    @Test
    public void testGetPool() {
        DevBoxPool pool = devBoxesClient.getPool(projectName, poolName);
        Assertions.assertEquals(poolName, pool.getName());
    }

    @Test
    public void testListPools() {
        List<DevBoxPool> pools = devBoxesClient.listPools(projectName).stream().collect(Collectors.toList());  
        Assertions.assertEquals(1, pools.size());
        Assertions.assertEquals(poolName, pools.get(0).getName());
    }

    @Test
    public void testGetSchedule() {
        DevBoxSchedule schedule = devBoxesClient.getSchedule(projectName, poolName, "default");
        Assertions.assertEquals("default", schedule.getName());
    }

    @Test
    public void testListSchedules() {
        List<DevBoxSchedule> schedules = devBoxesClient.listSchedules(projectName, poolName).stream().collect(Collectors.toList());  
        Assertions.assertEquals(1, schedules.size());
        Assertions.assertEquals("default", schedules.get(0).getName());
    }

    @Test
    public void testGetAndDelayDevBoxAction() {
        setupDevBox();
        
        DevBoxAction action = devBoxesClient.getDevBoxAction(projectName, meUserId, devBoxName, "schedule-default");
        Assertions.assertEquals("schedule-default", action.getName());
        Assertions.assertEquals(DevBoxActionType.STOP, action.getActionType());

        OffsetDateTime currentScheduledTime = action.getNextAction().getScheduledTime();
        OffsetDateTime delayUntil = currentScheduledTime.plusMinutes(10);

        DevBoxAction delayedAction = devBoxesClient.delayAction(projectName, meUserId, devBoxName, action.getName(), delayUntil);
        OffsetDateTime delayedTime = delayedAction.getNextAction().getScheduledTime();
        Assertions.assertEquals(delayUntil, delayedTime);
    }

    @Test
    public void testGetAndDelayAllDevBoxActions() {
        setupDevBox();
        
        List<DevBoxAction> devBoxActions = devBoxesClient.listDevBoxActions(projectName, meUserId, devBoxName).stream().collect(Collectors.toList()); 
        DevBoxAction action = devBoxActions.get(0); 
        
        Assertions.assertEquals(1, devBoxActions.size());
        Assertions.assertEquals("schedule-default", action.getName());
        Assertions.assertEquals(DevBoxActionType.STOP, action.getActionType());

        OffsetDateTime currentScheduledTime = action.getNextAction().getScheduledTime();
        OffsetDateTime delayUntil = currentScheduledTime.plusMinutes(10);

        List<DevBoxActionDelayResult> actionsDelayResult = devBoxesClient.delayAllActions(projectName, meUserId, devBoxName, delayUntil).stream().collect(Collectors.toList()); 
        DevBoxActionDelayStatus actionDelayStatus = actionsDelayResult.get(0).getResult();

        Assertions.assertEquals(1, actionsDelayResult.size());
        Assertions.assertEquals(DevBoxActionDelayStatus.SUCCEEDED, actionDelayStatus);
    }

    @Test
    public void testSkipActionAndDeleteDevBox() {
        setupDevBox();
        
        devBoxesClient.skipAction(projectName, meUserId, devBoxName, "schedule-default");

        SyncPoller<DevCenterOperationDetails, Void> devBoxDeleteResponse =
                devBoxesClient.beginDeleteDevBox(projectName, meUserId, devBoxName);
        Assertions.assertEquals(
                LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxDeleteResponse.waitForCompletion().getStatus());
    }

    public DevBox setupDevBox() {
        //get dev box if exists. If not, NotFound error will be thrown, and then we create dev box

        DevBox devBox; 
        try {
            devBox = devBoxesClient.getDevBox(projectName, meUserId, devBoxName);
        } catch (Exception e) {
            SyncPoller<DevCenterOperationDetails, DevBox> devBoxCreateResponse =
                    devBoxesClient.beginCreateDevBox(projectName, meUserId, new DevBox(devBoxName, poolName));
            Assertions.assertEquals(
                    LongRunningOperationStatus.SUCCESSFULLY_COMPLETED, devBoxCreateResponse.waitForCompletion().getStatus());
    
            devBox = devBoxCreateResponse.getFinalResult();
        } 
        Assertions.assertNotNull(devBox);
        Assertions.assertEquals(devBoxName, devBox.getName());

        return devBox;
    }
}

