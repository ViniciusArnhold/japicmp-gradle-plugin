/*
 * Copyright 2003-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package me.champeau.gradle.japicmp.report.stdrules;

import japicmp.model.JApiCompatibility;
import me.champeau.gradle.japicmp.report.SetupRule;
import me.champeau.gradle.japicmp.report.ViolationCheckContext;

import java.util.HashSet;

public class RecordSeenMembersSetup implements SetupRule {
    static final String SEEN = RecordSeenMembersSetup.class.getName();

    @Override
    public void execute(final ViolationCheckContext violationCheckContext) {
        violationCheckContext.putUserData(SEEN, new HashSet<JApiCompatibility>());
    }
}
