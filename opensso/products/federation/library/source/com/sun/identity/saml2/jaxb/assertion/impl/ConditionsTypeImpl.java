//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:17 DU CEST 
//


package com.sun.identity.saml2.jaxb.assertion.impl;

public class ConditionsTypeImpl implements com.sun.identity.saml2.jaxb.assertion.ConditionsType, com.sun.xml.bind.JAXBObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallableObject, com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializable, com.sun.identity.saml2.jaxb.assertion.impl.runtime.ValidatableObject
{

    protected java.util.Calendar _NotBefore;
    protected com.sun.xml.bind.util.ListImpl _ConditionOrAudienceRestrictionOrOneTimeUse;
    protected java.util.Calendar _NotOnOrAfter;
    public final static java.lang.Class version = (com.sun.identity.saml2.jaxb.assertion.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.saml2.jaxb.assertion.ConditionsType.class);
    }

    public java.util.Calendar getNotBefore() {
        return _NotBefore;
    }

    public void setNotBefore(java.util.Calendar value) {
        _NotBefore = value;
    }

    protected com.sun.xml.bind.util.ListImpl _getConditionOrAudienceRestrictionOrOneTimeUse() {
        if (_ConditionOrAudienceRestrictionOrOneTimeUse == null) {
            _ConditionOrAudienceRestrictionOrOneTimeUse = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _ConditionOrAudienceRestrictionOrOneTimeUse;
    }

    public java.util.List getConditionOrAudienceRestrictionOrOneTimeUse() {
        return _getConditionOrAudienceRestrictionOrOneTimeUse();
    }

    public java.util.Calendar getNotOnOrAfter() {
        return _NotOnOrAfter;
    }

    public void setNotOnOrAfter(java.util.Calendar value) {
        _NotOnOrAfter = value;
    }

    public com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.saml2.jaxb.assertion.impl.ConditionsTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_ConditionOrAudienceRestrictionOrOneTimeUse == null)? 0 :_ConditionOrAudienceRestrictionOrOneTimeUse.size());
        while (idx2 != len2) {
            context.childAsBody(((com.sun.xml.bind.JAXBObject) _ConditionOrAudienceRestrictionOrOneTimeUse.get(idx2 ++)), "ConditionOrAudienceRestrictionOrOneTimeUse");
        }
    }

    public void serializeAttributes(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_ConditionOrAudienceRestrictionOrOneTimeUse == null)? 0 :_ConditionOrAudienceRestrictionOrOneTimeUse.size());
        if (_NotBefore!= null) {
            context.startAttribute("", "NotBefore");
            try {
                context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _NotBefore), null), "NotBefore");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        if (_NotOnOrAfter!= null) {
            context.startAttribute("", "NotOnOrAfter");
            try {
                context.text(com.sun.msv.datatype.xsd.DateTimeType.theInstance.serializeJavaObject(((java.util.Calendar) _NotOnOrAfter), null), "NotOnOrAfter");
            } catch (java.lang.Exception e) {
                com.sun.identity.saml2.jaxb.assertion.impl.runtime.Util.handlePrintConversionException(this, e, context);
            }
            context.endAttribute();
        }
        while (idx2 != len2) {
            context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _ConditionOrAudienceRestrictionOrOneTimeUse.get(idx2 ++)), "ConditionOrAudienceRestrictionOrOneTimeUse");
        }
    }

    public void serializeURIs(com.sun.identity.saml2.jaxb.assertion.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx2 = 0;
        final int len2 = ((_ConditionOrAudienceRestrictionOrOneTimeUse == null)? 0 :_ConditionOrAudienceRestrictionOrOneTimeUse.size());
        while (idx2 != len2) {
            context.childAsURIs(((com.sun.xml.bind.JAXBObject) _ConditionOrAudienceRestrictionOrOneTimeUse.get(idx2 ++)), "ConditionOrAudienceRestrictionOrOneTimeUse");
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.saml2.jaxb.assertion.ConditionsType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar.ChoiceEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsr\u0000 com.sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000"
+"\u0002xq\u0000~\u0000\u0003sr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0007q\u0000~"
+"\u0000\rpsq\u0000~\u0000\u0007q\u0000~\u0000\rpsq\u0000~\u0000\u0007q\u0000~\u0000\rpsr\u0000\'com.sun.msv.grammar.trex.Elem"
+"entPattern\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/Nam"
+"eClass;xr\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignor"
+"eUndeclaredAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0007"
+"ppsq\u0000~\u0000\tq\u0000~\u0000\rpsr\u0000 com.sun.msv.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000\u0012xq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u00002com.sun.msv.gra"
+"mmar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\f\u0001q"
+"\u0000~\u0000\u001asr\u0000 com.sun.msv.grammar.AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.s"
+"un.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar"
+".Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u001bq\u0000~\u0000 sr\u0000#"
+"com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000"
+"\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000\"xq\u0000~\u0000\u001dt\u00006com.sun.iden"
+"tity.saml2.jaxb.assertion.ConditionElementt\u0000+http://java.sun"
+".com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0011q\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\r"
+"psq\u0000~\u0000\u0017q\u0000~\u0000\rpq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u0000@com.sun.identity.saml2."
+"jaxb.assertion.AudienceRestrictionElementq\u0000~\u0000%sq\u0000~\u0000\u0011q\u0000~\u0000\rp\u0000s"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpsq\u0000~\u0000\u0017q\u0000~\u0000\rpq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000!t\u00007com.s"
+"un.identity.saml2.jaxb.assertion.OneTimeUseElementq\u0000~\u0000%sq\u0000~\u0000"
+"\u0011q\u0000~\u0000\rp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\tq\u0000~\u0000\rpsq\u0000~\u0000\u0017q\u0000~\u0000\rpq\u0000~\u0000\u001aq\u0000~\u0000\u001eq\u0000~\u0000 sq\u0000~\u0000"
+"!t\u0000=com.sun.identity.saml2.jaxb.assertion.ProxyRestrictionEl"
+"ementq\u0000~\u0000%q\u0000~\u0000 sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0017q\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.grammar.D"
+"ataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006e"
+"xceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0003ppsr\u0000"
+"%com.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000)com.sun"
+".msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000xr\u0000*com.sun.msv"
+".datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.da"
+"tatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.x"
+"sd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000\"L\u0000\btypeNameq"
+"\u0000~\u0000\"L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProc"
+"essor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\bdateTimesr\u00005co"
+"m.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\rpsr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002"
+"L\u0000\tlocalNameq\u0000~\u0000\"L\u0000\fnamespaceURIq\u0000~\u0000\"xpq\u0000~\u0000Fq\u0000~\u0000Esq\u0000~\u0000!t\u0000\tNo"
+"tBeforet\u0000\u0000q\u0000~\u0000 sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0017q\u0000~\u0000\rpq\u0000~\u0000=sq\u0000~\u0000!t\u0000\fNotOnOrAfte"
+"rq\u0000~\u0000Pq\u0000~\u0000 sr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001"
+"L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash"
+";xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c"
+"\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/"
+"ExpressionPool;xp\u0000\u0000\u0000\u0011\u0001pq\u0000~\u0000\u000bq\u0000~\u0000\u000fq\u0000~\u0000\u000eq\u0000~\u0000\u0010q\u0000~\u00008q\u0000~\u0000\u0006q\u0000~\u0000\bq\u0000"
+"~\u0000\u0005q\u0000~\u0000Qq\u0000~\u0000\u0016q\u0000~\u0000(q\u0000~\u0000.q\u0000~\u0000\u0015q\u0000~\u0000\'q\u0000~\u0000-q\u0000~\u00004q\u0000~\u00003x"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.saml2.jaxb.assertion.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context) {
            super(context, "--------");
        }

        protected Unmarshaller(com.sun.identity.saml2.jaxb.assertion.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.saml2.jaxb.assertion.impl.ConditionsTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  3 :
                        attIdx = context.getAttribute("", "NotOnOrAfter");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText1(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "NotBefore");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText2(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        if (("Condition" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.ConditionElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.ConditionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AudienceRestriction" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.AudienceRestrictionElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.AudienceRestrictionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OneTimeUse" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.OneTimeUseElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.OneTimeUseElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProxyRestriction" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.ProxyRestrictionElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.ProxyRestrictionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  7 :
                        if (("Condition" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.ConditionElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.ConditionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("AudienceRestriction" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.AudienceRestrictionElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.AudienceRestrictionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("OneTimeUse" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.OneTimeUseElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.OneTimeUseElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("ProxyRestriction" == ___local)&&("urn:oasis:names:tc:SAML:2.0:assertion" == ___uri)) {
                            _getConditionOrAudienceRestrictionOrOneTimeUse().add(((com.sun.identity.saml2.jaxb.assertion.impl.ProxyRestrictionElementImpl) spawnChildFromEnterElement((com.sun.identity.saml2.jaxb.assertion.impl.ProxyRestrictionElementImpl.class), 7, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                }
                super.enterElement(___uri, ___local, ___qname, __atts);
                break;
            }
        }

        private void eatText1(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NotOnOrAfter = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
            }
        }

        private void eatText2(final java.lang.String value)
            throws org.xml.sax.SAXException
        {
            try {
                _NotBefore = ((java.util.Calendar) com.sun.msv.datatype.xsd.DateTimeType.theInstance.createJavaObject(com.sun.xml.bind.WhiteSpaceProcessor.collapse(value), null));
            } catch (java.lang.Exception e) {
                handleParseConversionException(e);
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
                        attIdx = context.getAttribute("", "NotOnOrAfter");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText1(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        attIdx = context.getAttribute("", "NotBefore");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText2(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  7 :
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
                        if (("NotOnOrAfter" == ___local)&&("" == ___uri)) {
                            state = 4;
                            return ;
                        }
                        state = 6;
                        continue outer;
                    case  0 :
                        if (("NotBefore" == ___local)&&("" == ___uri)) {
                            state = 1;
                            return ;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  7 :
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
                        attIdx = context.getAttribute("", "NotOnOrAfter");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 6;
                            eatText1(v);
                            continue outer;
                        }
                        state = 6;
                        continue outer;
                    case  5 :
                        if (("NotOnOrAfter" == ___local)&&("" == ___uri)) {
                            state = 6;
                            return ;
                        }
                        break;
                    case  0 :
                        attIdx = context.getAttribute("", "NotBefore");
                        if (attIdx >= 0) {
                            final java.lang.String v = context.eatAttribute(attIdx);
                            state = 3;
                            eatText2(v);
                            continue outer;
                        }
                        state = 3;
                        continue outer;
                    case  6 :
                        state = 7;
                        continue outer;
                    case  2 :
                        if (("NotBefore" == ___local)&&("" == ___uri)) {
                            state = 3;
                            return ;
                        }
                        break;
                    case  7 :
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
                        case  4 :
                            state = 5;
                            eatText1(value);
                            return ;
                        case  3 :
                            attIdx = context.getAttribute("", "NotOnOrAfter");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 6;
                                eatText1(v);
                                continue outer;
                            }
                            state = 6;
                            continue outer;
                        case  0 :
                            attIdx = context.getAttribute("", "NotBefore");
                            if (attIdx >= 0) {
                                final java.lang.String v = context.eatAttribute(attIdx);
                                state = 3;
                                eatText2(v);
                                continue outer;
                            }
                            state = 3;
                            continue outer;
                        case  6 :
                            state = 7;
                            continue outer;
                        case  7 :
                            revertToParentFromText(value);
                            return ;
                        case  1 :
                            state = 2;
                            eatText2(value);
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
