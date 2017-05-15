/*
 * Copyright (c) 2008-2017, Hazelcast, Inc. All Rights Reserved.
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

package com.hazelcast.internal.usercodedeployment;

import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

/**
 * ClassDefinition to be used with UserCodeDeployment feature
 * when sending classes from client to server.
 */
@SuppressFBWarnings({"EI_EXPOSE_REP", "EI_EXPOSE_REP2"})
public class ClassDefinition {

    private final String className;
    private final byte[] classDefinition;

    public ClassDefinition(String className, byte[] classDefinition) {
        this.className = className;
        this.classDefinition = classDefinition;
    }

    public String getClassName() {
        return className;
    }

    public byte[] getClassDefinition() {
        return classDefinition;
    }
}