//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac;


/**
 * The local system has a private key but it is used in decryption mode, rather than signature mode. For example, the Authentication Authority generates a secret and encrypts it using the local system's public key: the local system then proves it has decrypted the secret.
 * 
 * Java content class for AsymmetricDecryption element declaration.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-authentication-context.xsd line 321)
 * <p>
 * <pre>
 * &lt;element name="AsymmetricDecryption">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element ref="{urn:liberty:ac:2003-08}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 */
public interface AsymmetricDecryptionElement
    extends javax.xml.bind.Element, com.sun.identity.liberty.ws.common.jaxb.ac.AsymmetricDecryptionType
{


}
