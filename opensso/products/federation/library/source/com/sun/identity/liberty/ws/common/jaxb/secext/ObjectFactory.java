//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.secext;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.common.jaxb.secext package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
public class ObjectFactory
    extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.DefaultJAXBContextImpl
{

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(27, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.common.jaxb.secext.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.secext.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.BinarySecurityTokenType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.BinarySecurityTokenTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.KeyIdentifierType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.KeyIdentifierTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.SecurityTokenReferenceElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityTokenReferenceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.KeyIdentifierElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.KeyIdentifierElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.SecurityHeaderType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityHeaderTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.PasswordString.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.PasswordStringImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.EncodedString.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.EncodedStringImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.EmbeddedType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.EmbeddedTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.NonceElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.NonceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.SecurityTokenReferenceType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityTokenReferenceTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.PasswordElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.PasswordElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.AttributedString.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.AttributedStringImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.BinarySecurityTokenElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.BinarySecurityTokenElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.SecurityElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.ReferenceElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.ReferenceElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.UsernameTokenType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.UsernameTokenTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.ReferenceType.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.ReferenceTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.EmbeddedElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.EmbeddedElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.common.jaxb.secext.UsernameTokenElement.class), "com.sun.identity.liberty.ws.common.jaxb.secext.impl.UsernameTokenElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "SecurityTokenReference"), (com.sun.identity.liberty.ws.common.jaxb.secext.SecurityTokenReferenceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "Password"), (com.sun.identity.liberty.ws.common.jaxb.secext.PasswordElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "Security"), (com.sun.identity.liberty.ws.common.jaxb.secext.SecurityElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "Embedded"), (com.sun.identity.liberty.ws.common.jaxb.secext.EmbeddedElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "KeyIdentifier"), (com.sun.identity.liberty.ws.common.jaxb.secext.KeyIdentifierElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "UsernameToken"), (com.sun.identity.liberty.ws.common.jaxb.secext.UsernameTokenElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "BinarySecurityToken"), (com.sun.identity.liberty.ws.common.jaxb.secext.BinarySecurityTokenElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "Reference"), (com.sun.identity.liberty.ws.common.jaxb.secext.ReferenceElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("http://schemas.xmlsoap.org/ws/2003/06/secext", "Nonce"), (com.sun.identity.liberty.ws.common.jaxb.secext.NonceElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.common.jaxb.secext
     * 
     */
    public ObjectFactory() {
        super(grammarInfo);
    }

    /**
     * Create an instance of the specified Java content interface.
     * 
     * @param javaContentInterface
     *     the Class object of the javacontent interface to instantiate
     * @return
     *     a new instance
     * @throws JAXBException
     *     if an error occurs
     */
    public java.lang.Object newInstance(java.lang.Class javaContentInterface)
        throws javax.xml.bind.JAXBException
    {
        return super.newInstance(javaContentInterface);
    }

    /**
     * Get the specified property. This method can only be
     * used to get provider specific properties.
     * Attempting to get an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @return
     *     the value of the requested property
     * @throws PropertyException
     *     when there is an error retrieving the given property or value
     */
    public java.lang.Object getProperty(java.lang.String name)
        throws javax.xml.bind.PropertyException
    {
        return super.getProperty(name);
    }

    /**
     * Set the specified property. This method can only be
     * used to set provider specific properties.
     * Attempting to set an undefined property will result
     * in a PropertyException being thrown.
     * 
     * @param name
     *     the name of the property to retrieve
     * @param value
     *     the value of the property to be set
     * @throws PropertyException
     *     when there is an error processing the given property or value
     */
    public void setProperty(java.lang.String name, java.lang.Object value)
        throws javax.xml.bind.PropertyException
    {
        super.setProperty(name, value);
    }

    /**
     * Create an instance of BinarySecurityTokenType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.BinarySecurityTokenType createBinarySecurityTokenType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.BinarySecurityTokenTypeImpl();
    }

    /**
     * Create an instance of KeyIdentifierType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.KeyIdentifierType createKeyIdentifierType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.KeyIdentifierTypeImpl();
    }

    /**
     * Create an instance of SecurityTokenReferenceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.SecurityTokenReferenceElement createSecurityTokenReferenceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityTokenReferenceElementImpl();
    }

    /**
     * Create an instance of KeyIdentifierElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.KeyIdentifierElement createKeyIdentifierElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.KeyIdentifierElementImpl();
    }

    /**
     * Create an instance of SecurityHeaderType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.SecurityHeaderType createSecurityHeaderType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityHeaderTypeImpl();
    }

    /**
     * Create an instance of PasswordString
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.PasswordString createPasswordString()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.PasswordStringImpl();
    }

    /**
     * Create an instance of EncodedString
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.EncodedString createEncodedString()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.EncodedStringImpl();
    }

    /**
     * Create an instance of EmbeddedType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.EmbeddedType createEmbeddedType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.EmbeddedTypeImpl();
    }

    /**
     * Create an instance of NonceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.NonceElement createNonceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.NonceElementImpl();
    }

    /**
     * Create an instance of SecurityTokenReferenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.SecurityTokenReferenceType createSecurityTokenReferenceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityTokenReferenceTypeImpl();
    }

    /**
     * Create an instance of PasswordElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.PasswordElement createPasswordElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.PasswordElementImpl();
    }

    /**
     * Create an instance of AttributedString
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.AttributedString createAttributedString()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.AttributedStringImpl();
    }

    /**
     * Create an instance of BinarySecurityTokenElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.BinarySecurityTokenElement createBinarySecurityTokenElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.BinarySecurityTokenElementImpl();
    }

    /**
     * Create an instance of SecurityElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.SecurityElement createSecurityElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.SecurityElementImpl();
    }

    /**
     * Create an instance of ReferenceElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.ReferenceElement createReferenceElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.ReferenceElementImpl();
    }

    /**
     * Create an instance of UsernameTokenType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.UsernameTokenType createUsernameTokenType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.UsernameTokenTypeImpl();
    }

    /**
     * Create an instance of ReferenceType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.ReferenceType createReferenceType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.ReferenceTypeImpl();
    }

    /**
     * Create an instance of EmbeddedElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.EmbeddedElement createEmbeddedElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.EmbeddedElementImpl();
    }

    /**
     * Create an instance of UsernameTokenElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.common.jaxb.secext.UsernameTokenElement createUsernameTokenElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.common.jaxb.secext.impl.UsernameTokenElementImpl();
    }

}
