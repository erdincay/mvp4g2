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

package org.gwt4e.mvp4g.test.apt;

import org.gwt4e.mvp4g.test.apt.application.ApplicationTest;
import org.gwt4e.mvp4g.test.apt.debug.DebugTest;
import org.gwt4e.mvp4g.test.apt.eventbus.EventBusTest;
import org.gwt4e.mvp4g.test.apt.module.ModuleTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
                      ApplicationTest.class,
                      DebugTest.class,
                      EventBusTest.class,
                      ModuleTest.class
})
public class AllTests {
}
