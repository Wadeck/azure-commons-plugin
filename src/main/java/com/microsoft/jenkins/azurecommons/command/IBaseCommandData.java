/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 */

package com.microsoft.jenkins.azurecommons.command;

import com.microsoft.jenkins.azurecommons.JobContext;

public interface IBaseCommandData {
    void logError(String message);

    void logStatus(String status);

    void logError(Exception ex);

    void logError(String prefix, Exception ex);

    void setCommandState(CommandState deployState);

    JobContext jobContext();

    CommandState getCommandState();
}
