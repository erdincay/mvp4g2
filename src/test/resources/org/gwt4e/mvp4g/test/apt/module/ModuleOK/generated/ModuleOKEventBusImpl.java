/*
 * Copyright (C) 2016 Frank Hossfeld
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

package org.gwt4e.mvp4g.test.apt.module.ModuleOK.generated;

import org.gwt4e.event.shared.Mvp4gInternalSimpleEventBus;
import org.gwt4e.mvp4g.client.event.AbstractMvp4gEventBus;
import org.gwt4e.mvp4g.test.apt.module.ModuleOK.ModuleOKEventBus;

public class ModuleOKEventBusImpl extends AbstractMvp4gEventBus implements ModuleOKEventBus {
  public ModuleOKEventBusImpl(String moduleName, Mvp4gInternalSimpleEventBus eventBus) {
    super(moduleName, eventBus);
  }
}