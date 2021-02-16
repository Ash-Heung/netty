/*
 * Copyright 2013 The Netty Project
 *
 * The Netty Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package io.netty.bootstrap;

import io.netty.channel.Channel;

/**
 * @deprecated Use {@link io.netty.channel.ChannelFactory} instead.
 * Channel 工厂接口，用于创建 Channel 对象
 */
@Deprecated
public interface ChannelFactory<T extends Channel> {
    /**
     * 创建 Channel 对象
     */
    T newChannel();
}