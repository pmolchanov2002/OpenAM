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
 * information: "Portions Copyrighted [year] [name of copyright owner]".
 *
 * Copyright 2014 ForgeRock AS. All rights reserved.
 */

package org.forgerock.openam.sts.tokengeneration.saml2.xmlsig;

import org.forgerock.openam.sts.XMLUtilitiesImpl;
import org.testng.annotations.Test;
import org.w3c.dom.Element;

import java.io.IOException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;

import static org.testng.Assert.assertTrue;

public class KeyInfoFactoryImplTest {
    private static final String X_509 = "X.509";

    @Test
    public void testKeyInfoGeneration() throws Exception {
        Element element = new KeyInfoFactoryImpl(new XMLUtilitiesImpl()).generatePublicKeyInfo(getCertificate());
        String stringKeyInfo = new XMLUtilitiesImpl().documentToStringConversion(element);
        assertTrue(stringKeyInfo.contains("KeyInfo"));
        assertTrue(stringKeyInfo.contains("X509Data"));
        assertTrue(stringKeyInfo.contains("X509Certificate"));
    }

    private X509Certificate getCertificate() throws IOException, CertificateException {
        return (X509Certificate) CertificateFactory.getInstance(X_509).generateCertificate(getClass().getResourceAsStream("/cert.jks"));
    }
}
