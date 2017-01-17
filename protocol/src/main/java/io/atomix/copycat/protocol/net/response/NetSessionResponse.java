/*
 * Copyright 2016 the original author or authors.
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
 * limitations under the License
 */
package io.atomix.copycat.protocol.net.response;

import io.atomix.copycat.error.CopycatError;
import io.atomix.copycat.protocol.response.SessionResponse;

/**
 * Base session response.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public abstract class NetSessionResponse extends AbstractNetResponse implements SessionResponse {
  protected NetSessionResponse(long id, Status status, CopycatError error) {
    super(id, status, error);
  }

  /**
   * Session response builder.
   */
  public static abstract class Builder<T extends SessionResponse.Builder<T, U>, U extends SessionResponse> extends AbstractNetResponse.Builder<T, U> {
    protected Builder(long id) {
      super(id);
    }
  }

  /**
   * Session response serializer.
   */
  public static abstract class Serializer<T extends NetSessionResponse> extends AbstractNetResponse.Serializer<T> {
  }
}