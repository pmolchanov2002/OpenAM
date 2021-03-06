/*
* The contents of this file are subject to the terms of the Common Development and
* Distribution License (the License). You may not use this file except in compliance with the
* License.
*
* You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
* specific language governing permission and limitations under the License.
*
* When distributing Covered Software, include this CDDL Header Notice in each file and include
* the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
* Header, with the fields enclosed by brackets [] replaced by your own identifying
* information: "Portions copyright [year] [name of copyright owner]".
*
* Copyright 2015-2016 ForgeRock AS.
*/
package org.forgerock.openam.core.rest.devices.services.deviceprint;

import org.forgerock.openam.core.rest.devices.DeviceSerialisation;
import org.forgerock.openam.core.rest.devices.JsonDeviceSerialisation;
import org.forgerock.openam.core.rest.devices.services.DeviceService;

/**
 * Implementation of the Trusted Device (Device Print) Service. Provides all necessary configuration information
 * at a realm-wide level to Trusted Device (Device Print) authentication modules underneath it.
 */
public class TrustedDeviceService implements DeviceService {

    @Override
    public String getConfigStorageAttributeName() {
        return "devicePrintProfiles";
    }

    @Override
    public DeviceSerialisation getDeviceSerialisationStrategy() {
        return new JsonDeviceSerialisation();
    }

}
