//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.assertion;


/**
 * Java content class for AuthnStatementType complex type.
 * <p>The following schema fragment specifies the expected content contained within this java content object. (defined at file:/home/aldaris/NetBeansProjects/openam/opensso/products/federation/library/xsd/saml2/saml-schema-assertion-2.0.xsd line 211)
 * <p>
 * <pre>
 * &lt;complexType name="AuthnStatementType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:oasis:names:tc:SAML:2.0:assertion}StatementAbstractType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}SubjectLocality" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:tc:SAML:2.0:assertion}AuthnContext"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuthnInstant" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="SessionIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SessionNotOnOrAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 */
public interface AuthnStatementType
    extends com.sun.identity.saml2.jaxb.assertion.StatementAbstractType
{


    /**
     * Gets the value of the authnContext property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.AuthnContextType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.AuthnContextElement}
     */
    com.sun.identity.saml2.jaxb.assertion.AuthnContextType getAuthnContext();

    /**
     * Sets the value of the authnContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.AuthnContextType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.AuthnContextElement}
     */
    void setAuthnContext(com.sun.identity.saml2.jaxb.assertion.AuthnContextType value);

    /**
     * Gets the value of the authnInstant property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getAuthnInstant();

    /**
     * Sets the value of the authnInstant property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setAuthnInstant(java.util.Calendar value);

    /**
     * Gets the value of the subjectLocality property.
     * 
     * @return
     *     possible object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.SubjectLocalityType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.SubjectLocalityElement}
     */
    com.sun.identity.saml2.jaxb.assertion.SubjectLocalityType getSubjectLocality();

    /**
     * Sets the value of the subjectLocality property.
     * 
     * @param value
     *     allowed object is
     *     {@link com.sun.identity.saml2.jaxb.assertion.SubjectLocalityType}
     *     {@link com.sun.identity.saml2.jaxb.assertion.SubjectLocalityElement}
     */
    void setSubjectLocality(com.sun.identity.saml2.jaxb.assertion.SubjectLocalityType value);

    /**
     * Gets the value of the sessionNotOnOrAfter property.
     * 
     * @return
     *     possible object is
     *     {@link java.util.Calendar}
     */
    java.util.Calendar getSessionNotOnOrAfter();

    /**
     * Sets the value of the sessionNotOnOrAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.util.Calendar}
     */
    void setSessionNotOnOrAfter(java.util.Calendar value);

    /**
     * Gets the value of the sessionIndex property.
     * 
     * @return
     *     possible object is
     *     {@link java.lang.String}
     */
    java.lang.String getSessionIndex();

    /**
     * Sets the value of the sessionIndex property.
     * 
     * @param value
     *     allowed object is
     *     {@link java.lang.String}
     */
    void setSessionIndex(java.lang.String value);

}
