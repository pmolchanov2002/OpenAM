//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.disco.jaxb;


/**
 * Java content class for ModifyType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-disco-svc.xsd line 167)
 * <p>
 * <pre>
 * &lt;complexType name="ModifyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:liberty:disco:2003-08}ResourceIDGroup"/>
 *         &lt;element name="InsertEntry" type="{urn:liberty:disco:2003-08}InsertEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="RemoveEntry" type="{urn:liberty:disco:2003-08}RemoveEntryType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface ModifyType {


    /**
     * Gets the value of the InsertEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the InsertEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInsertEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.disco.jaxb.InsertEntryType}
     * 
     */
    java.util.List getInsertEntry();

    /**
     * Gets the value of the RemoveEntry property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the RemoveEntry property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRemoveEntry().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.disco.jaxb.RemoveEntryType}
     * 
     */
    java.util.List getRemoveEntry();

    /**
     * Gets the value of the resourceID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType}
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.ResourceIDElement}
     */
    com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType getResourceID();

    /**
     * Sets the value of the resourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType}
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.ResourceIDElement}
     */
    void setResourceID(com.sun.identity.liberty.ws.disco.jaxb.ResourceIDType value);

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getId();

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setId(java.lang.String value);

    /**
     * Gets the value of the encryptedResourceID property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDElement}
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType}
     */
    com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType getEncryptedResourceID();

    /**
     * Sets the value of the encryptedResourceID property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDElement}
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType}
     */
    void setEncryptedResourceID(com.sun.identity.liberty.ws.disco.jaxb.EncryptedResourceIDType value);

}
