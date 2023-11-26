/**
 * Copyright (c) 2021-2023 Contributors to the SmartHome/J project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.smarthomej.binding.amazonechocontrol.internal.dto.request;

import org.eclipse.jdt.annotation.NonNull;

/**
 * The {@link StartRoutineTO} encapsulate the request to start a routine
 *
 * @author Jan N. Klug - Initial contribution
 */
public class StartRoutineTO {
    public String behaviorId = "PREVIEW";
    public String sequenceJson;
    public String status = "ENABLED";

    @Override
    public @NonNull String toString() {
        return "StartRoutineTO{behaviorId='" + behaviorId + "', sequenceJson='" + sequenceJson + "', status='" + status
                + "'}";
    }
}
