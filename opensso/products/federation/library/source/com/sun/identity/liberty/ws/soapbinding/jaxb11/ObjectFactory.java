//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.soapbinding.jaxb11;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.sun.identity.liberty.ws.soapbinding.jaxb11 package. 
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

    private static java.util.HashMap defaultImplementations = new java.util.HashMap(17, 0.75F);
    private static java.util.HashMap rootTagMap = new java.util.HashMap();
    public final static com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfo grammarInfo = new com.sun.identity.federation.jaxb.entityconfig.impl.runtime.GrammarInfoImpl(rootTagMap, defaultImplementations, (com.sun.identity.liberty.ws.soapbinding.jaxb11.ObjectFactory.class));
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.JAXBVersion.class);

    static {
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateType.CredentialType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ServiceInstanceUpdateTypeImpl$CredentialTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.CredentialsContextTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.StatusElement.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.StatusElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.ExtensionElement.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ExtensionElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ServiceInstanceUpdateTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.StatusType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.StatusTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.EmptyType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.EmptyTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateElement.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ServiceInstanceUpdateElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.ExtensionType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ExtensionTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.TimeoutType.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.TimeoutTypeImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.TimeoutElement.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.TimeoutElementImpl");
        defaultImplementations.put((com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextElement.class), "com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.CredentialsContextElementImpl");
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sb:2004-04", "CredentialsContext"), (com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sb:2004-04", "ServiceInstanceUpdate"), (com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sb:2004-04", "Extension"), (com.sun.identity.liberty.ws.soapbinding.jaxb11.ExtensionElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sb:2004-04", "Status"), (com.sun.identity.liberty.ws.soapbinding.jaxb11.StatusElement.class));
        rootTagMap.put(new javax.xml.namespace.QName("urn:liberty:sb:2004-04", "Timeout"), (com.sun.identity.liberty.ws.soapbinding.jaxb11.TimeoutElement.class));
    }

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sun.identity.liberty.ws.soapbinding.jaxb11
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
     * Create an instance of ServiceInstanceUpdateTypeCredentialType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateType.CredentialType createServiceInstanceUpdateTypeCredentialType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ServiceInstanceUpdateTypeImpl.CredentialTypeImpl();
    }

    /**
     * Create an instance of CredentialsContextType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextType createCredentialsContextType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.CredentialsContextTypeImpl();
    }

    /**
     * Create an instance of StatusElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.StatusElement createStatusElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.StatusElementImpl();
    }

    /**
     * Create an instance of ExtensionElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.ExtensionElement createExtensionElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ExtensionElementImpl();
    }

    /**
     * Create an instance of ServiceInstanceUpdateType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateType createServiceInstanceUpdateType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ServiceInstanceUpdateTypeImpl();
    }

    /**
     * Create an instance of StatusType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.StatusType createStatusType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.StatusTypeImpl();
    }

    /**
     * Create an instance of EmptyType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.EmptyType createEmptyType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.EmptyTypeImpl();
    }

    /**
     * Create an instance of ServiceInstanceUpdateElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.ServiceInstanceUpdateElement createServiceInstanceUpdateElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ServiceInstanceUpdateElementImpl();
    }

    /**
     * Create an instance of ExtensionType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.ExtensionType createExtensionType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.ExtensionTypeImpl();
    }

    /**
     * Create an instance of TimeoutType
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.TimeoutType createTimeoutType()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.TimeoutTypeImpl();
    }

    /**
     * Create an instance of TimeoutElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.TimeoutElement createTimeoutElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.TimeoutElementImpl();
    }

    /**
     * Create an instance of CredentialsContextElement
     * 
     * @throws JAXBException
     *     if an error occurs
     */
    public com.sun.identity.liberty.ws.soapbinding.jaxb11.CredentialsContextElement createCredentialsContextElement()
        throws javax.xml.bind.JAXBException
    {
        return new com.sun.identity.liberty.ws.soapbinding.jaxb11.impl.CredentialsContextElementImpl();
    }

}
