//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wsaddr;


/**
 * Java content class for AttributedQNameType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/wsfederation/ws-addr.xsd line 122)
 * <p>
 * <pre>
 * &lt;complexType name="AttributedQNameType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>QName">
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AttributedQNameType {


    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link javax.xml.namespace.QName}
     */
    javax.xml.namespace.QName getValue();

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link javax.xml.namespace.QName}
     */
    void setValue(javax.xml.namespace.QName value);

}
