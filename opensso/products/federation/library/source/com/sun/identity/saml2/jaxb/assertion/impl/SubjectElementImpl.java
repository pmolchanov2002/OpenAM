//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.assertion.impl;

public class SubjectElementImpl
    extends com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl
    implements com.sun.identity.saml2.jaxb.assertion.SubjectElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.assertion.SubjectElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:oasis:names:tc:SAML:2.0:assertion";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Subject";
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:oasis:names:tc:SAML:2.0:assertion", "Subject");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.assertion.SubjectElement.class);
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
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsr\u0000\u001dcom.sun.msv.g"
+"rammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\nppsq\u0000~\u0000\npps"
+"q\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\nppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsr\u0000 com.sun.msv.gram"
+"mar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z"
+"\u0000\u0005valuexp\u0000psr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000"
+"\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u00002com.sun.msv.gramma"
+"r.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0017\u0001q\u0000~\u0000"
+"\u001csr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun."
+"msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Ex"
+"pression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001dq\u0000~\u0000\"sr\u0000#com"
+".sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Lj"
+"ava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000$xq\u0000~\u0000\u001ft\u00003com.sun.identit"
+"y.saml2.jaxb.assertion.BaseIDElementt\u0000+http://java.sun.com/j"
+"axb/xjc/dummy-elementssq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~"
+"\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00008com.sun.identity"
+".saml2.jaxb.assertion.BaseIDAbstractTypeq\u0000~\u0000\'sq\u0000~\u0000\nppsq\u0000~\u0000\u0019q"
+"\u0000~\u0000\u0018psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/"
+"relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/m"
+"sv/util/StringPair;xq\u0000~\u0000\u0004ppsr\u0000\"com.sun.msv.datatype.xsd.Qnam"
+"eType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicTy"
+"pe\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L"
+"\u0000\fnamespaceUriq\u0000~\u0000$L\u0000\btypeNameq\u0000~\u0000$L\u0000\nwhiteSpacet\u0000.Lcom/sun/"
+"msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/"
+"2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpac"
+"eProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.W"
+"hiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expre"
+"ssion$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0018psr\u0000\u001bcom.sun.ms"
+"v.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000$L\u0000\fnamespaceURI"
+"q\u0000~\u0000$xpq\u0000~\u0000=q\u0000~\u0000<sq\u0000~\u0000#t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLS"
+"chema-instanceq\u0000~\u0000\"sq\u0000~\u0000#t\u0000\u0006BaseIDt\u0000%urn:oasis:names:tc:SAML"
+":2.0:assertionsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001c"
+"q\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00003com.sun.identity.saml2.jaxb.assertion.Nam"
+"eIDElementq\u0000~\u0000\'sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018"
+"psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00000com.sun.identity.saml2."
+"jaxb.assertion.NameIDTypeq\u0000~\u0000\'sq\u0000~\u0000\nppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000E"
+"q\u0000~\u0000\"sq\u0000~\u0000#t\u0000\u0006NameIDq\u0000~\u0000Jsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019"
+"q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u00008com.sun.identity.saml2.jaxb.as"
+"sertion.EncryptedIDElementq\u0000~\u0000\'sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000"
+"~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000:com.sun"
+".identity.saml2.jaxb.assertion.EncryptedElementTypeq\u0000~\u0000\'sq\u0000~"
+"\u0000\nppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000~\u0000\"sq\u0000~\u0000#t\u0000\u000bEncryptedIDq\u0000~\u0000Jsq\u0000~"
+"\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\nq\u0000~\u0000\u0018psq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018"
+"psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#t\u0000@com.sun.identity.saml2."
+"jaxb.assertion.SubjectConfirmationElementq\u0000~\u0000\'sq\u0000~\u0000\u0000q\u0000~\u0000\u0018p\u0000s"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000"
+"~\u0000\"sq\u0000~\u0000#t\u0000=com.sun.identity.saml2.jaxb.assertion.SubjectCon"
+"firmationTypeq\u0000~\u0000\'sq\u0000~\u0000\nppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000~\u0000\"sq\u0000~\u0000#t"
+"\u0000\u0013SubjectConfirmationq\u0000~\u0000Jq\u0000~\u0000\"sq\u0000~\u0000\u0014ppsq\u0000~\u0000\nppsq\u0000~\u0000\u0000pp\u0000sq\u0000~"
+"\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#q\u0000~\u0000wq\u0000~\u0000\'s"
+"q\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\nppsq\u0000~\u0000\u0014q\u0000~\u0000\u0018psq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~"
+"\u0000\u001cq\u0000~\u0000 q\u0000~\u0000\"sq\u0000~\u0000#q\u0000~\u0000\u007fq\u0000~\u0000\'sq\u0000~\u0000\nppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000"
+"~\u0000\"sq\u0000~\u0000#q\u0000~\u0000\u0083q\u0000~\u0000Jsq\u0000~\u0000\nppsq\u0000~\u0000\u0019q\u0000~\u0000\u0018pq\u0000~\u00005q\u0000~\u0000Eq\u0000~\u0000\"sq\u0000~\u0000#"
+"t\u0000\u0007Subjectq\u0000~\u0000Jsr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$Closed"
+"Hash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N"
+"\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/gram"
+"mar/ExpressionPool;xp\u0000\u0000\u0000,\u0001pq\u0000~\u0000^q\u0000~\u0000gq\u0000~\u0000fq\u0000~\u0000tq\u0000~\u0000sq\u0000~\u0000|q\u0000~"
+"\u0000{q\u0000~\u0000\u000fq\u0000~\u0000oq\u0000~\u0000\u0088q\u0000~\u0000\u0087q\u0000~\u0000\u008fq\u0000~\u0000\u0010q\u0000~\u0000\u008eq\u0000~\u0000\tq\u0000~\u0000\u0011q\u0000~\u0000qq\u0000~\u0000\u0085q\u0000~"
+"\u00000q\u0000~\u0000Yq\u0000~\u0000kq\u0000~\u0000\u0080q\u0000~\u0000\u0092q\u0000~\u0000\u0095q\u0000~\u0000pq\u0000~\u0000\u0084q\u0000~\u0000\u000eq\u0000~\u0000\u000bq\u0000~\u0000\rq\u0000~\u0000\fq\u0000~"
+"\u0000)q\u0000~\u0000Rq\u0000~\u0000dq\u0000~\u0000yq\u0000~\u0000\u008cq\u0000~\u0000\u0016q\u0000~\u0000,q\u0000~\u0000Mq\u0000~\u0000\u0013q\u0000~\u0000+q\u0000~\u0000Lq\u0000~\u0000Uq\u0000~"
+"\u0000Tq\u0000~\u0000_x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        if (("BaseID" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("BaseID" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NameID" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("NameID" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("EncryptedID" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("EncryptedID" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("SubjectConfirmation" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.saml2.jaxb.assertion.impl.SubjectTypeImpl)com.sun.identity.saml2.jaxb.assertion.impl.SubjectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  0 :
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
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
                    case  3 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  2 :
                        if (("Subject" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
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
