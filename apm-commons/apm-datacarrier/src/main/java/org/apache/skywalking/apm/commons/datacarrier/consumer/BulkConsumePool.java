/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.apm.commons.datacarrier.consumer;

import org.apache.skywalking.apm.commons.datacarrier.buffer.Channels;

/**
 * BulkConsumePool works for consuming data from multiple channels(DataCarrier instances), with multiple {@link
 * MultipleChannelsConsumer}s.
 *
 * In typical case, the number of {@link MultipleChannelsConsumer} should be less than the number of channels.
 *
 * @author wusheng
 */
public class BulkConsumePool implements ConsumerPool {

    public BulkConsumePool(int size) {

    }

    @Override public void add(String name, Channels channels, IConsumer consumer) {

    }

    @Override public boolean isRunning(Channels channels) {
        return false;
    }

    @Override public void close(Channels channels) {

    }

    @Override public void begin(Channels channels) {

    }
}
