/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.asterix.runtime.aggregates.base;

import org.apache.hyracks.api.comm.IFrameTupleAccessor;
import org.apache.hyracks.dataflow.common.data.accessors.IFrameTupleReference;

public class SingleFieldFrameTupleReference implements IFrameTupleReference {

    private byte[] fieldData;
    private int start;
    private int length;

    public void reset(byte[] fieldData, int start, int length) {
        this.fieldData = fieldData;
        this.start = start;
        this.length = length;
    }

    @Override
    public int getFieldCount() {
        return 1;
    }

    @Override
    public byte[] getFieldData(int fIdx) {
        return fieldData;
    }

    @Override
    public int getFieldStart(int fIdx) {
        return start;
    }

    @Override
    public int getFieldLength(int fIdx) {
        return length;
    }

    @Override
    public IFrameTupleAccessor getFrameTupleAccessor() {
        return null;
    }

    @Override
    public int getTupleIndex() {
        return 0;
    }
}
