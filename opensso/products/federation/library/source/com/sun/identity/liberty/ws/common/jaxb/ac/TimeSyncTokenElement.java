//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * This element indicates that a time synchronization
 * token is used to identify the Principal. hardware - the time synchonization
 * token has been implemented in hardware. software - the time synchronization
 * token has been implemented in software. SeedLength - the length, in bits, of the
 * random seed used in the time synchronization token.
 * 
 * Java content class for TimeSyncToken element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 163)
 * <p>
 * <pre>
 * &lt;element name="TimeSyncToken" type="{urn:liberty:ac:2003-08}TimeSyncTokenType"/>
 * </pre>
 * 
 */
public interface TimeSyncTokenElement
    extends javax.xml.bind.Element, com.sun.identity.liberty.ws.common.jaxb.ac.TimeSyncTokenType
{


}
