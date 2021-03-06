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

package org.gwt4e.mvp4g.processor;

import com.google.auto.common.BasicAnnotationProcessor;
import com.google.auto.service.AutoService;
import com.google.common.collect.ImmutableList;
import org.gwt4e.mvp4g.processor.steps.*;

import javax.annotation.processing.Filer;
import javax.annotation.processing.Messager;
import javax.lang.model.SourceVersion;
import javax.lang.model.util.Elements;
import javax.lang.model.util.Types;

@AutoService(javax.annotation.processing.Processor.class)
public class Processor
  extends BasicAnnotationProcessor {

  private ProcessorContext processorContext = new ProcessorContext();

  @Override
  public SourceVersion getSupportedSourceVersion() {
    return SourceVersion.latestSupported();
  }

  @Override
  protected Iterable<? extends ProcessingStep> initSteps() {
    Messager messager = processingEnv.getMessager();
    Filer filer = processingEnv.getFiler();
    Types types = processingEnv.getTypeUtils();
    Elements elements = processingEnv.getElementUtils();

    return ImmutableList.of(new DebugProcessingStep(messager,
                                                    filer,
                                                    types,
                                                    elements,
                                                    processorContext),
                            new EventProcessingStep(messager,
                                                    filer,
                                                    types,
                                                    elements,
                                                    processorContext),
                            new EventBusProcessingStep(messager,
                                                       filer,
                                                       types,
                                                       elements,
                                                       processorContext),
                            new ModuleProcessingStep(messager,
                                                     filer,
                                                     types,
                                                     elements,
                                                     processorContext),
                            new ApplicationProcessingStep(messager,
                                                          filer,
                                                          types,
                                                          elements,
                                                          processorContext));
  }

  @Override
  protected void postProcess() {
    System.out.println("postPrcess");
    // TODO generate code
//    try {
//      injectBindingRegistry.generateSourcesForRequiredBindings(
//        factoryGenerator, membersInjectorGenerator);
//    } catch (SourceFileGenerationException e) {
//      e.printMessageTo(processingEnv.getMessager());
//    }
  }
}
