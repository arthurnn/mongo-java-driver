/*
 * Copyright (c) 2008 - 2013 10gen, Inc. <http://10gen.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mongodb.operation.protocol;

/**
 * An interface for the execution of a MongoDB wire protocol conversation
 *
 * @param <T> the return value of the Protocol response message
 * @since 3.0
 */
public interface Protocol<T> {
    /**
     * Execute the protocol.
     *
     * @return the response from execution of the protocol
     */
    T execute();
}
