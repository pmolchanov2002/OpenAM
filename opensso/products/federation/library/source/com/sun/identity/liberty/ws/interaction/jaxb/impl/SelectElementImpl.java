//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.interaction.jaxb.impl;

public class SelectElementImpl
    extends com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl
    implements com.sun.identity.liberty.ws.interaction.jaxb.SelectElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.interaction.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.interaction.jaxb.SelectElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:is:2003-08";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "Select";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:is:2003-08", "Select");
        super.serializeURIs(context);
        context.endNamespaceDecls();
        super.serializeAttributes(context);
        context.endAttributes();
        super.serializeBody(context);
        context.endElement();
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.interaction.jaxb.SelectElement.class);
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
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1q\u0000~\u0000\u0003L\u0000\u0004exp2q\u0000~\u0000\u0003xq\u0000~\u0000\u0004ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007pps"
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.m"
+"sv.grammar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0012sr\u0000\u0011java.lang.B"
+"oolean\u00cd r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0012ppsr\u0000 com.su"
+"n.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar"
+".UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000 com.sun.msv.g"
+"rammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq"
+"\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u00002com.sun.msv.grammar.Expression$AnyStringExpres"
+"sion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0015\u0001q\u0000~\u0000\u001fsr\u0000 com.sun.msv.grammar.Any"
+"NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000"
+"\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000 q\u0000~\u0000%sr\u0000#com.sun.msv.grammar.SimpleNameC"
+"lass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespace"
+"URIq\u0000~\u0000\'xq\u0000~\u0000\"t\u00008com.sun.identity.liberty.ws.interaction.jax"
+"b.HelpElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elementss"
+"q\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016"
+"pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u00005com.sun.identity.liberty.ws.interac"
+"tion.jaxb.HelpTypeq\u0000~\u0000*sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.g"
+"rammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datat"
+"ype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000"
+"~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%c"
+"om.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.m"
+"sv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000"
+"\'L\u0000\btypeNameq\u0000~\u0000\'L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xsd/W"
+"hiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat\u0000\u0005Q"
+"Namesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Collaps"
+"e\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProcessor"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetExpre"
+"ssion\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u0016psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0"
+"t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000\'L\u0000\fnamespaceURIq\u0000~\u0000\'xpq\u0000~\u0000@q\u0000~\u0000?s"
+"q\u0000~\u0000&t\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq\u0000~\u0000"
+"%sq\u0000~\u0000&t\u0000\u0004Helpt\u0000\u0016urn:liberty:is:2003-08q\u0000~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0000q\u0000"
+"~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u00005q\u0000~\u0000\u0016psr\u0000#com.sun.msv.datatype.xsd.String"
+"Type\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u0000:q\u0000~\u0000?t\u0000\u0006stringsr\u00005com.s"
+"un.msv.datatype.xsd.WhiteSpaceProcessor$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000x"
+"q\u0000~\u0000B\u0001q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000Tq\u0000~\u0000?sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~"
+"\u0000%sq\u0000~\u0000&t\u0000\u0004Hintq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u00005"
+"ppsr\u0000-com.sun.msv.datatype.xsd.NormalizedStringType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0000xq\u0000~\u0000Rq\u0000~\u0000?t\u0000\u0010normalizedStringsr\u00004com.sun.msv.datatype.xsd"
+".WhiteSpaceProcessor$Replace\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000B\u0001q\u0000~\u0000Esq\u0000~\u0000Fq\u0000~"
+"\u0000bq\u0000~\u0000?sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0005Labelq\u0000~\u0000"
+"Mq\u0000~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppq\u0000~\u0000_sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016p"
+"q\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0005Valueq\u0000~\u0000Mq\u0000~\u0000%sq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~"
+"\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&t\u0000"
+"@com.sun.identity.liberty.ws.interaction.jaxb.SelectType.Ite"
+"mTypeq\u0000~\u0000*sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0004Itemq\u0000"
+"~\u0000Msq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016"
+"pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000xq\u0000~\u0000*sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~"
+"\u0000Hq\u0000~\u0000%q\u0000~\u0000{sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u0000q\u0000~\u0000\u0016p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000p"
+"p\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u0019q\u0000~\u0000\u0016psq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u0000\u001fq\u0000~\u0000#q\u0000~\u0000%sq\u0000~\u0000&q\u0000~\u0000x"
+"q\u0000~\u0000*sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%q\u0000~\u0000{q\u0000~\u0000%sq\u0000~\u0000\u001cppsq"
+"\u0000~\u00005ppsr\u0000\u001fcom.sun.msv.datatype.xsd.IDType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000#com."
+"sun.msv.datatype.xsd.NcnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\"com.sun.msv.da"
+"tatype.xsd.TokenType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Rq\u0000~\u0000?t\u0000\u0002IDq\u0000~\u0000C\u0000q\u0000~\u0000Esq"
+"\u0000~\u0000Fq\u0000~\u0000\u0097q\u0000~\u0000?sq\u0000~\u0000&t\u0000\u0004namet\u0000\u0000sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016psq\u0000~\u00005ppsr"
+"\u0000$com.sun.msv.datatype.xsd.BooleanType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000:q\u0000~\u0000?"
+"t\u0000\u0007booleanq\u0000~\u0000Cq\u0000~\u0000Esq\u0000~\u0000Fq\u0000~\u0000\u00a1q\u0000~\u0000?sq\u0000~\u0000&t\u0000\bmultipleq\u0000~\u0000\u009bq\u0000"
+"~\u0000%sq\u0000~\u0000\u0012ppsq\u0000~\u0000\u001cq\u0000~\u0000\u0016pq\u0000~\u00008q\u0000~\u0000Hq\u0000~\u0000%sq\u0000~\u0000&t\u0000\u0006Selectq\u0000~\u0000Msr"
+"\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000"
+"/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;xpsr\u0000-com.su"
+"n.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000"
+"\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/ExpressionPoo"
+"l;xp\u0000\u0000\u0000*\u0001pq\u0000~\u0000,q\u0000~\u0000rq\u0000~\u0000~q\u0000~\u0000\u0089q\u0000~\u0000\u0018q\u0000~\u0000.q\u0000~\u0000tq\u0000~\u0000\u0080q\u0000~\u0000\u008bq\u0000~\u0000\t"
+"q\u0000~\u00003q\u0000~\u0000Xq\u0000~\u0000fq\u0000~\u0000mq\u0000~\u0000yq\u0000~\u0000\u0084q\u0000~\u0000\u008fq\u0000~\u0000\u00a5q\u0000~\u0000Nq\u0000~\u0000\u0011q\u0000~\u0000\u001bq\u0000~\u0000/"
+"q\u0000~\u0000uq\u0000~\u0000\u0081q\u0000~\u0000\u008cq\u0000~\u0000\u009cq\u0000~\u0000\u0014q\u0000~\u0000Pq\u0000~\u0000\u000eq\u0000~\u0000\u0087q\u0000~\u0000\nq\u0000~\u0000\u0010q\u0000~\u0000\fq\u0000~\u0000\u0013"
+"q\u0000~\u0000\u0086q\u0000~\u0000\rq\u0000~\u0000^q\u0000~\u0000lq\u0000~\u0000\u000bq\u0000~\u0000\u000fq\u0000~\u0000\\q\u0000~\u0000jx"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "----");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  0 :
                        if (("Select" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 1;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "multiple");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
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
                    case  2 :
                        if (("Select" == ___local)&&("urn:liberty:is:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("", "multiple");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
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
                    case  1 :
                        if (("multiple" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl)com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("name" == ___local)&&("" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectTypeImpl)com.sun.identity.liberty.ws.interaction.jaxb.impl.SelectElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                    case  1 :
                        attIdx = context.getAttribute("", "multiple");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "name");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                        case  1 :
                            attIdx = context.getAttribute("", "multiple");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "name");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
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
