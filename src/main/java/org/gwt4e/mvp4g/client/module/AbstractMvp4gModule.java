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

package org.gwt4e.mvp4g.client.module;

import org.gwt4e.event.shared.Mvp4gInternalSimpleEventBus;

/**
 * Created by hoss on 04.01.16.
 */
public abstract class AbstractMvp4gModule {

  final protected Mvp4gInternalSimpleEventBus internalEventBus;

  public AbstractMvp4gModule(Mvp4gInternalSimpleEventBus internalEventBus) {
    this.internalEventBus = internalEventBus;
  }

  public Mvp4gInternalSimpleEventBus getInternalEventBus() {
    return internalEventBus;
  }
}
