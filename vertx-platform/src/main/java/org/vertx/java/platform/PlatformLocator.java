/*
 * Copyright 2013 Red Hat, Inc.
 *
 * Red Hat licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 *
 */

package org.vertx.java.platform;

import java.util.ServiceLoader;

/**
 * Use this class to get an instance of a PlatformManagerFactory so you can create PlatformManager instances when
 * embedding the Vert.x platform.<p>
 *
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class PlatformLocator {

  public static PlatformManagerFactory factory = ServiceLoader.load(PlatformManagerFactory.class).iterator().next();

}
