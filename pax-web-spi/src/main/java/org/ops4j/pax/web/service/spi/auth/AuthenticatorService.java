/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.ops4j.pax.web.service.spi.auth;

public interface AuthenticatorService {

    /**
     *  Instantiates authenticator service corresponding to the given {@code method} and implementing the {@code iface} interface.
     * @return See above. Returns {@code null} if either the method or implementation for the given {@code iface} is not supported by the implementor.
     */
    <T> T getAuthenticatorService(String method, Class<T> iface);

}
