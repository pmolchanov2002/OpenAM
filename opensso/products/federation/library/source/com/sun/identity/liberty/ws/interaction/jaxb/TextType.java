//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb;


/**
 * Java content class for TextType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-interact-svc.xsd line 126)
 * <p>
 * <pre>
 * &lt;complexType name="TextType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:liberty:is:2003-08}InquiryElementType">
 *       &lt;attribute name="format" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="maxChars" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="minChars" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface TextType
    extends com.sun.identity.liberty.ws.interaction.jaxb.InquiryElementType
{


    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getFormat();

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setFormat(java.lang.String value);

    /**
     * Gets the value of the maxChars property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger}
     */
    java.math.BigInteger getMaxChars();

    /**
     * Sets the value of the maxChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger}
     */
    void setMaxChars(java.math.BigInteger value);

    /**
     * Gets the value of the minChars property.
     * 
     * @return
     *     possible object is
     *     {@link java.math.BigInteger}
     */
    java.math.BigInteger getMinChars();

    /**
     * Sets the value of the minChars property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.math.BigInteger}
     */
    void setMinChars(java.math.BigInteger value);

}
