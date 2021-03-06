/**
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright (c) 2006 Sun Microsystems Inc. All Rights Reserved
 *
 * The contents of this file are subject to the terms
 * of the Common Development and Distribution License
 * (the License). You may not use this file except in
 * compliance with the License.
 *
 * You can obtain a copy of the License at
 * https://opensso.dev.java.net/public/CDDLv1.0.html or
 * opensso/legal/CDDLv1.0.txt
 * See the License for the specific language governing
 * permission and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL
 * Header Notice in each file and include the License file
 * at opensso/legal/CDDLv1.0.txt.
 * If applicable, add the following below the CDDL Header,
 * with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * $Id: SessionIndex.java,v 1.2 2008/06/25 05:47:58 qcheng Exp $
 *
 * Portions Copyrighted 2016 ForgeRock AS.
 */


package com.sun.identity.saml2.protocol;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.sun.identity.saml2.common.SAML2Exception;
import com.sun.identity.saml2.protocol.impl.SessionIndexImpl;

/**
 * This class represents the <code>SessionIndex</code> element in
 * SAML protocol schema.
 * The <code>SessionIndex</code> element specifies a session index value
 * of a authenticated principal.
 *
 * <pre>
 * &lt;element name="SessionIndex" type="{http://www.w3.org/2001/XMLSchema}string"/>
 * </pre>
 *
 * @supported.all.api
 */

@JsonTypeInfo(include = JsonTypeInfo.As.PROPERTY, use = JsonTypeInfo.Id.CLASS,
        defaultImpl = SessionIndexImpl.class)
public interface SessionIndex {
    
    /**
     * Returns the <code>SessionIndex</code> value.
     *
     * @return A String value of the <code>SessionIndex</code>
     *
     */
    public java.lang.String getValue();
   
    /**
     * Returns the <code>SessionIndex</code> in an XML document String format
     * based on the <code>SessionIndex</code> schema described above.
     *
     * @return A XML String representing the <code>SessionIndex</code>.
     * @throws SAML2Exception if some error occurs during conversion to
     *         <code>String</code>.
     */
    public String toXMLString() throws SAML2Exception;
    
    /**
     * Returns the <code>SessionIndex</code> in an XML document String format
     * based on the <code>SessionIndex</code> schema described above.
     * @param includeNSPrefix Determines whether or not the namespace qualifier 
     * is prepended to the Element when converted
     *
     * @param declareNS Determines whether or not the namespace is declared
     *        within the Element.
     * @return A XML String representing the <code>SessionIndex</code>.
     * @throws SAML2Exception if some error occurs during conversion to
     *         <code>String</code>.
     */
    public String toXMLString(boolean includeNSPrefix, boolean declareNS)
    throws SAML2Exception;
}
