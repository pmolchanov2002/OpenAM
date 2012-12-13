//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.disco.jaxb;


/**
 * Java content class for QueryResponseType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-disco-svc.xsd line 141)
 * <p>
 * <pre>
 * &lt;complexType name="QueryResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:liberty:disco:2003-08}Status"/>
 *         &lt;element ref="{urn:liberty:disco:2003-08}ResourceOffering" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Credentials" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface QueryResponseType {


    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.StatusElement}
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.StatusType}
     */
    com.sun.identity.liberty.ws.disco.jaxb.StatusType getStatus();

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.StatusElement}
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.StatusType}
     */
    void setStatus(com.sun.identity.liberty.ws.disco.jaxb.StatusType value);

    /**
     * Gets the value of the ResourceOffering property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ResourceOffering property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResourceOffering().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link com.sun.identity.liberty.ws.disco.jaxb.ResourceOfferingElement}
     * {@link com.sun.identity.liberty.ws.disco.jaxb.ResourceOfferingType}
     * 
     */
    java.util.List getResourceOffering();

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
     * Gets the value of the credentials property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.QueryResponseType.CredentialsType}
     */
    com.sun.identity.liberty.ws.disco.jaxb.QueryResponseType.CredentialsType getCredentials();

    /**
     * Sets the value of the credentials property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.liberty.ws.disco.jaxb.QueryResponseType.CredentialsType}
     */
    void setCredentials(com.sun.identity.liberty.ws.disco.jaxb.QueryResponseType.CredentialsType value);


    /**
     * Java content class for anonymous complex type.
     * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/liberty/lib-arch-disco-svc.xsd line 146)
     * <p>
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     */
    public interface CredentialsType {


        /**
         * Gets the value of the Any property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the Any property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAny().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link java.lang.Object}
         * 
         */
        java.util.List getAny();

    }

}
