//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.idpp.jaxb.impl;

public class CommonNameElementImpl
    extends com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl
    implements com.sun.identity.liberty.ws.idpp.jaxb.CommonNameElement, com.sun.xml.bind.RIElement, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    public final static java.lang.Class version = (com.sun.identity.liberty.ws.idpp.jaxb.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.idpp.jaxb.CommonNameElement.class);
    }

    public java.lang.String ____jaxb_ri____getNamespaceURI() {
        return "urn:liberty:id-sis-pp:2003-08";
    }

    public java.lang.String ____jaxb_ri____getLocalName() {
        return "CommonName";
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        context.startElement("urn:liberty:id-sis-pp:2003-08", "CommonName");
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
        return (com.sun.identity.liberty.ws.idpp.jaxb.CommonNameElement.class);
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
+"q\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0007ppsr\u0000\u001dcom.sun.msv.gramm"
+"ar.ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\bppsq\u0000~\u0000\u0011sr\u0000\u0011java.lang.Boolean\u00cd "
+"r\u0080\u00d5\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsr\u0000 com.sun.msv.gr"
+"ammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.grammar.UnaryEx"
+"p\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0003xq\u0000~\u0000\u0004q\u0000~\u0000\u0015psr\u0000 com.sun.msv.grammar.A"
+"ttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0003L\u0000\tnameClassq\u0000~\u0000\u0001xq\u0000~\u0000\u0004q\u0000~\u0000"
+"\u0015psr\u00002com.sun.msv.grammar.Expression$AnyStringExpression\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004sq\u0000~\u0000\u0014\u0001q\u0000~\u0000\u001esr\u0000 com.sun.msv.grammar.AnyNameClas"
+"s\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr"
+"\u00000com.sun.msv.grammar.Expression$EpsilonExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xq\u0000~\u0000\u0004q\u0000~\u0000\u001fq\u0000~\u0000$sr\u0000#com.sun.msv.grammar.SimpleNameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamespaceURIq\u0000~\u0000&"
+"xq\u0000~\u0000!t\u0000/com.sun.identity.liberty.ws.idpp.jaxb.CNElementt\u0000+h"
+"ttp://java.sun.com/jaxb/xjc/dummy-elementssq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000"
+"\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$s"
+"q\u0000~\u0000%t\u0000/com.sun.identity.liberty.ws.idpp.jaxb.DSTStringq\u0000~\u0000)"
+"sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002"
+"\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Datatype;L\u0000\u0006exceptq\u0000~\u0000\u0003L\u0000\u0004na"
+"met\u0000\u001dLcom/sun/msv/util/StringPair;xq\u0000~\u0000\u0004q\u0000~\u0000\u0015psr\u0000\"com.sun.ms"
+"v.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000*com.sun.msv.datatype."
+"xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000%com.sun.msv.datatype.xsd"
+".ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.sun.msv.datatype.xsd.XSDatat"
+"ypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq\u0000~\u0000&L\u0000\btypeNameq\u0000~\u0000&L\u0000\nwhi"
+"teSpacet\u0000.Lcom/sun/msv/datatype/xsd/WhiteSpaceProcessor;xpt\u0000"
+" http://www.w3.org/2001/XMLSchemat\u0000\u0005QNamesr\u00005com.sun.msv.dat"
+"atype.xsd.WhiteSpaceProcessor$Collapse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun"
+".msv.datatype.xsd.WhiteSpaceProcessor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.su"
+"n.msv.grammar.Expression$NullSetExpression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0004q"
+"\u0000~\u0000\u0015psr\u0000\u001bcom.sun.msv.util.StringPair\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq"
+"\u0000~\u0000&L\u0000\fnamespaceURIq\u0000~\u0000&xpq\u0000~\u0000?q\u0000~\u0000>sq\u0000~\u0000%t\u0000\u0004typet\u0000)http://w"
+"ww.w3.org/2001/XMLSchema-instanceq\u0000~\u0000$sq\u0000~\u0000%t\u0000\u0002CNt\u0000\u001durn:libe"
+"rty:id-sis-pp:2003-08q\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq"
+"\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq"
+"\u0000~\u0000%t\u00000com.sun.identity.liberty.ws.idpp.jaxb.LCNElementq\u0000~\u0000)"
+"sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000"
+"\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00008com.sun.identity.liberty.ws.idpp.j"
+"axb.DSTLocalizedStringq\u0000~\u0000)sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u00007q\u0000~\u0000Gq\u0000~"
+"\u0000$sq\u0000~\u0000%t\u0000\u0003LCNq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u0011q\u0000~\u0000\u0015psq\u0000~"
+"\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~"
+"\u0000%t\u00002com.sun.identity.liberty.ws.idpp.jaxb.AltCNElementq\u0000~\u0000)"
+"sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000"
+"\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u00001q\u0000~\u0000)sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u00007q\u0000"
+"~\u0000Gq\u0000~\u0000$sq\u0000~\u0000%t\u0000\u0005AltCNq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u0011q\u0000"
+"~\u0000\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q"
+"\u0000~\u0000$sq\u0000~\u0000%t\u00003com.sun.identity.liberty.ws.idpp.jaxb.LAltCNEle"
+"mentq\u0000~\u0000)sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015ps"
+"q\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%q\u0000~\u0000]q\u0000~\u0000)sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000"
+"\u0015pq\u0000~\u00007q\u0000~\u0000Gq\u0000~\u0000$sq\u0000~\u0000%t\u0000\u0006LAltCNq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q\u0000~\u0000"
+"\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~"
+"\u0000$sq\u0000~\u0000%t\u00009com.sun.identity.liberty.ws.idpp.jaxb.AnalyzedNam"
+"eElementq\u0000~\u0000)sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~"
+"\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00006com.sun.identity.libe"
+"rty.ws.idpp.jaxb.AnalyzedNameTypeq\u0000~\u0000)sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000"
+"~\u00007q\u0000~\u0000Gq\u0000~\u0000$sq\u0000~\u0000%t\u0000\fAnalyzedNameq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0011q\u0000"
+"~\u0000\u0015psq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q"
+"\u0000~\u0000$sq\u0000~\u0000%t\u00006com.sun.identity.liberty.ws.idpp.jaxb.Extension"
+"Elementq\u0000~\u0000)sq\u0000~\u0000\u0000q\u0000~\u0000\u0015p\u0000sq\u0000~\u0000\u0007ppsq\u0000~\u0000\u0000pp\u0000sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u0018q\u0000~\u0000"
+"\u0015psq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u0000\u001eq\u0000~\u0000\"q\u0000~\u0000$sq\u0000~\u0000%t\u00003com.sun.identity.liber"
+"ty.ws.idpp.jaxb.ExtensionTypeq\u0000~\u0000)sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u00007q"
+"\u0000~\u0000Gq\u0000~\u0000$sq\u0000~\u0000%t\u0000\tExtensionq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015psq\u0000"
+"~\u00004ppsr\u0000\'com.sun.msv.datatype.xsd.FinalComponent\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001I"
+"\u0000\nfinalValuexr\u0000\u001ecom.sun.msv.datatype.xsd.Proxy\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\b"
+"baseTypet\u0000)Lcom/sun/msv/datatype/xsd/XSDatatypeImpl;xq\u0000~\u0000;q\u0000"
+"~\u0000Lt\u0000\u0006IDTypesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor"
+"$Preserve\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000Asr\u0000#com.sun.msv.datatype.xsd.Strin"
+"gType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001Z\u0000\risAlwaysValidxq\u0000~\u00009q\u0000~\u0000>t\u0000\u0006stringq\u0000~\u0000\u00bb\u0001\u0000\u0000"
+"\u0000\u0000q\u0000~\u0000Dsq\u0000~\u0000Eq\u0000~\u0000\u00beq\u0000~\u0000Lsq\u0000~\u0000%t\u0000\u0002idq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000"
+"~\u0000\u0015psq\u0000~\u00004ppsr\u0000%com.sun.msv.datatype.xsd.DateTimeType\u0000\u0000\u0000\u0000\u0000\u0000\u0000"
+"\u0001\u0002\u0000\u0000xr\u0000)com.sun.msv.datatype.xsd.DateTimeBaseType\u0014W\u001a@3\u00a5\u00b4\u00e5\u0002\u0000\u0000"
+"xq\u0000~\u00009q\u0000~\u0000>t\u0000\bdateTimeq\u0000~\u0000Bq\u0000~\u0000Dsq\u0000~\u0000Eq\u0000~\u0000\u00c8q\u0000~\u0000>sq\u0000~\u0000%t\u0000\u0010mod"
+"ificationTimeq\u0000~\u0000Lq\u0000~\u0000$sq\u0000~\u0000\u0011ppsq\u0000~\u0000\u001bq\u0000~\u0000\u0015pq\u0000~\u00007q\u0000~\u0000Gq\u0000~\u0000$sq"
+"\u0000~\u0000%t\u0000\nCommonNameq\u0000~\u0000Lsr\u0000\"com.sun.msv.grammar.ExpressionPool"
+"\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool"
+"$ClosedHash;xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedH"
+"ash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/m"
+"sv/grammar/ExpressionPool;xp\u0000\u0000\u0000>\u0001pq\u0000~\u0000\u00ccq\u0000~\u0000\tq\u0000~\u0000\u000eq\u0000~\u0000\u00c2q\u0000~\u0000wq"
+"\u0000~\u0000cq\u0000~\u0000Nq\u0000~\u0000\u00a7q\u0000~\u0000\u0093q\u0000~\u0000\u0080q\u0000~\u0000lq\u0000~\u0000\fq\u0000~\u0000Wq\u0000~\u0000+q\u0000~\u0000\u0010q\u0000~\u0000\u00b2q\u0000~\u0000\u00aaq"
+"\u0000~\u0000\u00a2q\u0000~\u0000\u0096q\u0000~\u0000\u008eq\u0000~\u0000\u0083q\u0000~\u0000{q\u0000~\u0000oq\u0000~\u0000gq\u0000~\u0000Zq\u0000~\u0000\u000fq\u0000~\u0000Rq\u0000~\u0000.q\u0000~\u0000\u001aq"
+"\u0000~\u0000\u00a9q\u0000~\u0000\u00a1q\u0000~\u0000\u0095q\u0000~\u0000\u008dq\u0000~\u0000\u0082q\u0000~\u0000zq\u0000~\u0000nq\u0000~\u0000fq\u0000~\u0000Yq\u0000~\u0000Qq\u0000~\u0000-q\u0000~\u0000\u0017q"
+"\u0000~\u0000\u000bq\u0000~\u0000\u009eq\u0000~\u0000\rq\u0000~\u0000\u008aq\u0000~\u0000\u0012q\u0000~\u0000vq\u0000~\u0000bq\u0000~\u0000Mq\u0000~\u0000\u009fq\u0000~\u0000\u008bq\u0000~\u0000xq\u0000~\u0000dq"
+"\u0000~\u0000Oq\u0000~\u0000\u0013q\u0000~\u0000\nq\u0000~\u0000\u00aeq\u0000~\u0000\u009aq\u0000~\u0000\u0086q\u0000~\u0000rq\u0000~\u0000^q\u0000~\u00002x"));
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
            return com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("CN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("CN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LCN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LCN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AltCN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AltCN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LAltCN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("LAltCN" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AnalyzedName" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("AnalyzedName" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        spawnHandlerFromEnterElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname, __atts);
                        return ;
                    case  0 :
                        if (("CommonName" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
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
                    case  2 :
                        if (("CommonName" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 3;
                            return ;
                        }
                        break;
                    case  1 :
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveElement((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                        if (("id" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        if (("modificationTime" == ___local)&&("urn:liberty:id-sis-pp:2003-08" == ___uri)) {
                            spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromEnterAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        spawnHandlerFromLeaveAttribute((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, ___uri, ___local, ___qname);
                        return ;
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
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "id");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("urn:liberty:id-sis-pp:2003-08", "modificationTime");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            spawnHandlerFromText((((com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameTypeImpl)com.sun.identity.liberty.ws.idpp.jaxb.impl.CommonNameElementImpl.this).new Unmarshaller(context)), 2, value);
                            return ;
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
