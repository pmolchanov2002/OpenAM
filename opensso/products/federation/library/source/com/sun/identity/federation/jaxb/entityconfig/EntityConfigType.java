//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.federation.jaxb.entityconfig;


/**
 * Java content class for EntityConfigType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/idff-entity-config-schema.xsd line 42)
 * <p>
 * <pre>
 * &lt;complexType name="EntityConfigType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/>
 *         &lt;element ref="{urn:sun:fm:ID-FF:entityconfig}Attribute" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{urn:sun:fm:ID-FF:entityconfig}IDPDescriptorConfig" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{urn:sun:fm:ID-FF:entityconfig}SPDescriptorConfig" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;element ref="{urn:sun:fm:ID-FF:entityconfig}AffiliationDescriptorConfig"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="entityID" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *       &lt;attribute name="hosted" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface EntityConfigType {


    /**
     * Gets the value of the hosted property.
     * 
     */
    boolean isHosted();

    /**
     * Sets the value of the hosted property.
     * 
     */
    void setHosted(boolean value);

    /**
     * Gets the value of the affiliationDescriptorConfig property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.federation.jaxb.entityconfig.AffiliationDescriptorConfigElement}
     *     {@link com.sun.identity.federation.jaxb.entityconfig.BaseConfigType}
     */
    com.sun.identity.federation.jaxb.entityconfig.BaseConfigType getAffiliationDescriptorConfig();

    /**
     * Sets the value of the affiliationDescriptorConfig property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.federation.jaxb.entityconfig.AffiliationDescriptorConfigElement}
     *     {@link com.sun.identity.federation.jaxb.entityconfig.BaseConfigType}
     */
    void setAffiliationDescriptorConfig(com.sun.identity.federation.jaxb.entityconfig.BaseConfigType value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getID();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setID(java.lang.String value);

    /**
     * Gets the value of the Attribute property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the Attribute property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttribute().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.federation.jaxb.entityconfig.AttributeElement}
     * {@link com.sun.identity.federation.jaxb.entityconfig.AttributeType}
     * 
     */
    java.util.List getAttribute();

    /**
     * Gets the value of the IDPDescriptorConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the IDPDescriptorConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIDPDescriptorConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.federation.jaxb.entityconfig.IDPDescriptorConfigElement}
     * {@link com.sun.identity.federation.jaxb.entityconfig.BaseConfigType}
     * 
     */
    java.util.List getIDPDescriptorConfig();

    /**
     * Gets the value of the entityID property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getEntityID();

    /**
     * Sets the value of the entityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setEntityID(java.lang.String value);

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureElement}
     */
    com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType getSignature();

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType}
     *     {@link com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureElement}
     */
    void setSignature(com.sun.identity.liberty.ws.common.jaxb.xmlsig.SignatureType value);

    /**
     * Gets the value of the SPDescriptorConfig property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the SPDescriptorConfig property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSPDescriptorConfig().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.federation.jaxb.entityconfig.SPDescriptorConfigElement}
     * {@link com.sun.identity.federation.jaxb.entityconfig.BaseConfigType}
     * 
     */
    java.util.List getSPDescriptorConfig();

}
