/*
 * Copyright (c) 2008-2013, Hazelcast, Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.hazelcast.replicatedmap.impl.record;

import com.hazelcast.spi.EventFilter;

/**
 * Basic filter implementation for selecting interesting events on the server
 */
public class ReplicatedEntryEventFilter
        implements EventFilter {

    protected Object key;

    public ReplicatedEntryEventFilter(Object key) {
        this.key = key;
    }

    public Object getKey() {
        return key;
    }

    public boolean eval(Object arg) {
        return key == null || key.equals(arg);
    }

}
