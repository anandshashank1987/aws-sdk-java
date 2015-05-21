/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.directory.model;

/**
 * Snapshot Status
 */
public enum SnapshotStatus {
    
    Creating("Creating"),
    Completed("Completed"),
    Failed("Failed");

    private String value;

    private SnapshotStatus(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *            real value
     * @return SnapshotStatus corresponding to the value
     */
    public static SnapshotStatus fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        
        } else if ("Creating".equals(value)) {
            return SnapshotStatus.Creating;
        } else if ("Completed".equals(value)) {
            return SnapshotStatus.Completed;
        } else if ("Failed".equals(value)) {
            return SnapshotStatus.Failed;
        } else {
            throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
        }
    }
}
    