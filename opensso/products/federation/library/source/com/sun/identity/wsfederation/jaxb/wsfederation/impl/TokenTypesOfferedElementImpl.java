//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:21 DU CEST 
//


package com.sun.identity.wsfederation.jaxb.wsfederation.impl;

public class TokenTypesOfferedElementImpl
    extends com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenTypesOfferedTypeImpl
    implements com.sun.identity.wsfederation.jaxb.wsfederation.TokenTypesOfferedElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.wsfederation.jaxb.wsfederation.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.wsfederation.jaxb.wsfederation.TokenTypesOfferedElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "http://schemas.xmlsoap.org/ws/2006/12/federation";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "TokenTypesOffered";
    }

    public com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenTypesOfferedElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("http://schemas.xmlsoap.org/ws/2006/12/federation", "TokenTypesOffered");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.wsfederation.jaxb.wsfederation.TokenTypesOfferedElement.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\'com.sun.msv.grammar.trex.ElementPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000"
+"\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr\u0000\u001ecom.sun.msv."
+"grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclaredAttributesL\u0000"
+"\fcontentModelt\u0000 Lcom/sun/msv/grammar/Expression;xr\u0000\u001ecom.sun."
+"msv.grammar.Expression\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Lj"
+"ava/lang/Boolean;L\u0000\u000bexpandedExpq\u0000~\u0000\u0003xppp\u0000sr\u0000\u001fcom.sun.msv.gra"
+"mmar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.BinaryExp"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsr\u0000 com.s"
+"un.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gramma"
+"r.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000"
+"~\u0000\u0000pp\u0000sr\u0000\u001dcom.sun.msv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq"
+"\u0000~\u0000\u000bsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000 com.sun."
+"msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000"
+"~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStringE"
+"xpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u0019sr\u0000 com.sun.msv.gramma"
+"r.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpress"
+"ion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001aq\u0000~\u0000\u001fsr\u0000#com.sun.msv.grammar.Simple"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fname"
+"spaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u00009com.sun.identity.wsfederation.jaxb.wsf"
+"ederation.TokenTypet\u0000+http://java.sun.com/jaxb/xjc/dummy-ele"
+"mentssq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003"
+"L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.m"
+"sv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype"
+".xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xs"
+"d.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSData"
+"typeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000!L\u0000\btypeNameq\u0000~\u0000!L\u0000\nwh"
+"iteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt"
+"\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.da"
+"tatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.su"
+"n.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.s"
+"un.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004"
+"q\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalName"
+"q\u0000~\u0000!L\u0000\fnamespaceURIq\u0000~\u0000!xpq\u0000~\u00002q\u0000~\u00001sq\u0000~\u0000 t\u0000\u0004typet\u0000)http://"
+"www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\tTokenTypet\u00000"
+"http://schemas.xmlsoap.org/ws/2006/12/federationsq\u0000~\u0000\u0011ppsq\u0000~"
+"\u0000\u000bq\u0000~\u0000\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0016ppq\u0000~\u0000\u0019sr\u0000\'com.sun.msv.grammar.Di"
+"fferenceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~\u0000\u0001L\u0000\u0003nc2q\u0000~\u0000\u0001xq\u0000~\u0000\u001cq\u0000~\u0000"
+"\u001dsr\u0000#com.sun.msv.grammar.ChoiceNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003nc1q\u0000~"
+"\u0000\u0001L\u0000\u0003nc2q\u0000~\u0000\u0001xq\u0000~\u0000\u001csr\u0000&com.sun.msv.grammar.NamespaceNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\fnamespaceURIq\u0000~\u0000!xq\u0000~\u0000\u001ct\u0000\u0000sq\u0000~\u0000Hq\u0000~\u0000?sq\u0000~\u0000Hq\u0000"
+"~\u0000$q\u0000~\u0000\u001fsq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0016q\u0000~\u0000\u0015pq\u0000~\u0000*q\u0000~\u0000:q\u0000~\u0000\u001fsq\u0000~\u0000 t\u0000\u0011TokenTyp"
+"esOfferedq\u0000~\u0000?sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001"
+"\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedH"
+"ash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef"
+"\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gramm"
+"ar/ExpressionPool;xp\u0000\u0000\u0000\n\u0001pq\u0000~\u0000%q\u0000~\u0000Mq\u0000~\u0000@q\u0000~\u0000\u0013q\u0000~\u0000\u000fq\u0000~\u0000Aq\u0000~\u0000"
+"\u0012q\u0000~\u0000\rq\u0000~\u0000\tq\u0000~\u0000\nx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.wsfederation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenTypesOfferedElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  1 :
                        if (("TokenType" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenTypesOfferedTypeImpl)com.sun.identity.wsfederation.jaxb.wsfederation.impl.TokenTypesOfferedElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("TokenTypesOffered" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        public void leaveElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  2 :
                        if (("TokenTypesOffered" == ___local)&&("http://schemas.xmlsoap.org/ws/2006/12/federation" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveElement(___uri, ___local, ___qname);
                break;
            }
        }

        public void enterAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.enterAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void leaveAttribute(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                }
                super.leaveAttribute(___uri, ___local, ___qname);
                break;
            }
        }

        public void handleText(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                try {
                    switch (state) {
                        case  3 :
                            revertToParentFromText(value);
                            return ;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
