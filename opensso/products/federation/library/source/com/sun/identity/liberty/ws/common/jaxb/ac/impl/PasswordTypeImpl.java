//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v1.0.6-b27-fcs 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.09.20 at 09:12:12 DU CEST 
//


package com.sun.identity.liberty.ws.common.jaxb.ac.impl;

public class PasswordTypeImpl implements com.sun.identity.liberty.ws.common.jaxb.ac.PasswordType, com.sun.xml.bind.JAXBObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallableObject, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializable, com.sun.identity.federation.jaxb.entityconfig.impl.runtime.ValidatableObject
{

    protected com.sun.xml.bind.util.ListImpl _Extension;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.LengthType _Length;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType _Generation;
    protected com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType _Alphabet;
    public final static java.lang.Class version = (com.sun.identity.liberty.ws.common.jaxb.ac.impl.JAXBVersion.class);
    private static com.sun.msv.grammar.Grammar schemaFragment;

    private final static java.lang.Class PRIMARY_INTERFACE_CLASS() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.PasswordType.class);
    }

    protected com.sun.xml.bind.util.ListImpl _getExtension() {
        if (_Extension == null) {
            _Extension = new com.sun.xml.bind.util.ListImpl(new java.util.ArrayList());
        }
        return _Extension;
    }

    public java.util.List getExtension() {
        return _getExtension();
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.LengthType getLength() {
        return _Length;
    }

    public void setLength(com.sun.identity.liberty.ws.common.jaxb.ac.LengthType value) {
        _Length = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType getGeneration() {
        return _Generation;
    }

    public void setGeneration(com.sun.identity.liberty.ws.common.jaxb.ac.GenerationType value) {
        _Generation = value;
    }

    public com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType getAlphabet() {
        return _Alphabet;
    }

    public void setAlphabet(com.sun.identity.liberty.ws.common.jaxb.ac.AlphabetType value) {
        _Alphabet = value;
    }

    public com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingEventHandler createUnmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
        return new com.sun.identity.liberty.ws.common.jaxb.ac.impl.PasswordTypeImpl.Unmarshaller(context);
    }

    public void serializeBody(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (_Length!= null) {
            if (_Length instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Length), "Length");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "Length");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Length), "Length");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Length), "Length");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Length), "Length");
                context.endElement();
            }
        }
        if (_Alphabet!= null) {
            if (_Alphabet instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Alphabet), "Alphabet");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "Alphabet");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Alphabet), "Alphabet");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Alphabet), "Alphabet");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Alphabet), "Alphabet");
                context.endElement();
            }
        }
        if (_Generation!= null) {
            if (_Generation instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Generation), "Generation");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "Generation");
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Generation), "Generation");
                context.endNamespaceDecls();
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Generation), "Generation");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Generation), "Generation");
                context.endElement();
            }
        }
        while (idx1 != len1) {
            if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
            } else {
                context.startElement("urn:liberty:ac:2003-08", "Extension");
                int idx_6 = idx1;
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_6 ++)), "Extension");
                context.endNamespaceDecls();
                int idx_7 = idx1;
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx_7 ++)), "Extension");
                context.endAttributes();
                context.childAsBody(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
                context.endElement();
            }
        }
    }

    public void serializeAttributes(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (_Length!= null) {
            if (_Length instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Length), "Length");
            }
        }
        if (_Alphabet!= null) {
            if (_Alphabet instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Alphabet), "Alphabet");
            }
        }
        if (_Generation!= null) {
            if (_Generation instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Generation), "Generation");
            }
        }
        while (idx1 != len1) {
            if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsAttributes(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
            } else {
                idx1 += 1;
            }
        }
    }

    public void serializeURIs(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.XMLSerializer context)
        throws org.xml.sax.SAXException
    {
        int idx1 = 0;
        final int len1 = ((_Extension == null)? 0 :_Extension.size());
        if (_Length!= null) {
            if (_Length instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Length), "Length");
            }
        }
        if (_Alphabet!= null) {
            if (_Alphabet instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Alphabet), "Alphabet");
            }
        }
        if (_Generation!= null) {
            if (_Generation instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Generation), "Generation");
            }
        }
        while (idx1 != len1) {
            if (_Extension.get(idx1) instanceof javax.xml.bind.Element) {
                context.childAsURIs(((com.sun.xml.bind.JAXBObject) _Extension.get(idx1 ++)), "Extension");
            } else {
                idx1 += 1;
            }
        }
    }

    public java.lang.Class getPrimaryInterface() {
        return (com.sun.identity.liberty.ws.common.jaxb.ac.PasswordType.class);
    }

    public com.sun.msv.verifier.DocumentDeclaration createRawValidator() {
        if (schemaFragment == null) {
            schemaFragment = com.sun.xml.bind.validator.SchemaDeserializer.deserialize((
 "\u00ac\u00ed\u0000\u0005sr\u0000\u001fcom.sun.msv.grammar.SequenceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.su"
+"n.msv.grammar.BinaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0004exp1t\u0000 Lcom/sun/msv/gra"
+"mmar/Expression;L\u0000\u0004exp2q\u0000~\u0000\u0002xr\u0000\u001ecom.sun.msv.grammar.Expressi"
+"on\u00f8\u0018\u0082\u00e8N5~O\u0002\u0000\u0002L\u0000\u0013epsilonReducibilityt\u0000\u0013Ljava/lang/Boolean;L\u0000\u000b"
+"expandedExpq\u0000~\u0000\u0002xpppsq\u0000~\u0000\u0000ppsq\u0000~\u0000\u0000ppsr\u0000\u001dcom.sun.msv.grammar."
+"ChoiceExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0001ppsq\u0000~\u0000\bsr\u0000\u0011java.lang.Boolean\u00cd r\u0080\u00d5"
+"\u009c\u00fa\u00ee\u0002\u0000\u0001Z\u0000\u0005valuexp\u0000psr\u0000\'com.sun.msv.grammar.trex.ElementPatter"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\tnameClasst\u0000\u001fLcom/sun/msv/grammar/NameClass;xr"
+"\u0000\u001ecom.sun.msv.grammar.ElementExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002Z\u0000\u001aignoreUndeclar"
+"edAttributesL\u0000\fcontentModelq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsr\u0000 com"
+".sun.msv.grammar.OneOrMoreExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001ccom.sun.msv.gram"
+"mar.UnaryExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L\u0000\u0003expq\u0000~\u0000\u0002xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000 com.sun.ms"
+"v.grammar.AttributeExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\u0003expq\u0000~\u0000\u0002L\u0000\tnameClassq\u0000~\u0000"
+"\u000exq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u00002com.sun.msv.grammar.Expression$AnyStringExp"
+"ression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003sq\u0000~\u0000\u000b\u0001q\u0000~\u0000\u0018sr\u0000 com.sun.msv.grammar."
+"AnyNameClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\u001dcom.sun.msv.grammar.NameClass\u0000\u0000\u0000\u0000"
+"\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$EpsilonExpressio"
+"n\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\u0019q\u0000~\u0000\u001esr\u0000#com.sun.msv.grammar.SimpleNa"
+"meClass\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0002L\u0000\tlocalNamet\u0000\u0012Ljava/lang/String;L\u0000\fnamesp"
+"aceURIq\u0000~\u0000 xq\u0000~\u0000\u001bt\u00008com.sun.identity.liberty.ws.common.jaxb."
+"ac.LengthElementt\u0000+http://java.sun.com/jaxb/xjc/dummy-elemen"
+"tssq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000"
+"~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00005com.sun.identity.liberty.ws.comm"
+"on.jaxb.ac.LengthTypeq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpsr\u0000\u001bcom.sun.ms"
+"v.grammar.DataExp\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\u0002dtt\u0000\u001fLorg/relaxng/datatype/Da"
+"tatype;L\u0000\u0006exceptq\u0000~\u0000\u0002L\u0000\u0004namet\u0000\u001dLcom/sun/msv/util/StringPair;"
+"xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000\"com.sun.msv.datatype.xsd.QnameType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000"
+"\u0000xr\u0000*com.sun.msv.datatype.xsd.BuiltinAtomicType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr"
+"\u0000%com.sun.msv.datatype.xsd.ConcreteType\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000\'com.su"
+"n.msv.datatype.xsd.XSDatatypeImpl\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0003L\u0000\fnamespaceUriq"
+"\u0000~\u0000 L\u0000\btypeNameq\u0000~\u0000 L\u0000\nwhiteSpacet\u0000.Lcom/sun/msv/datatype/xs"
+"d/WhiteSpaceProcessor;xpt\u0000 http://www.w3.org/2001/XMLSchemat"
+"\u0000\u0005QNamesr\u00005com.sun.msv.datatype.xsd.WhiteSpaceProcessor$Coll"
+"apse\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xr\u0000,com.sun.msv.datatype.xsd.WhiteSpaceProces"
+"sor\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xpsr\u00000com.sun.msv.grammar.Expression$NullSetEx"
+"pression\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0000xq\u0000~\u0000\u0003q\u0000~\u0000\fpsr\u0000\u001bcom.sun.msv.util.StringPa"
+"ir\u00d0t\u001ejB\u008f\u008d\u00a0\u0002\u0000\u0002L\u0000\tlocalNameq\u0000~\u0000 L\u0000\fnamespaceURIq\u0000~\u0000 xpq\u0000~\u00009q\u0000~"
+"\u00008sq\u0000~\u0000\u001ft\u0000\u0004typet\u0000)http://www.w3.org/2001/XMLSchema-instanceq"
+"\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\u0006Lengtht\u0000\u0016urn:liberty:ac:2003-08q\u0000~\u0000\u001esq\u0000~\u0000\bppsq\u0000"
+"~\u0000\bq\u0000~\u0000\fpsq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000:com.sun.identity.liberty.ws.common.jaxb.ac"
+".AlphabetElementq\u0000~\u0000#sq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00007com.sun.ident"
+"ity.liberty.ws.common.jaxb.ac.AlphabetTypeq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000"
+"\u0015q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\bAlphabetq\u0000~\u0000Fq\u0000~\u0000\u001esq\u0000~\u0000\bppsq\u0000"
+"~\u0000\bq\u0000~\u0000\fpsq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q"
+"\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000<com.sun.identity.liberty.ws.common.jaxb.ac"
+".GenerationElementq\u0000~\u0000#sq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000ppsq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bp"
+"psq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u00009com.sun.ide"
+"ntity.liberty.ws.common.jaxb.ac.GenerationTypeq\u0000~\u0000#sq\u0000~\u0000\bpps"
+"q\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\nGenerationq\u0000~\u0000Fq\u0000~\u0000\u001esq\u0000~\u0000"
+"\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\bq\u0000~\u0000\fpsq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fp"
+"sq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000;com.sun.identity.liberty"
+".ws.common.jaxb.ac.ExtensionElementq\u0000~\u0000#sq\u0000~\u0000\rq\u0000~\u0000\fp\u0000sq\u0000~\u0000\u0000p"
+"psq\u0000~\u0000\rpp\u0000sq\u0000~\u0000\bppsq\u0000~\u0000\u0012q\u0000~\u0000\fpsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u0000\u0018q\u0000~\u0000\u001cq\u0000~\u0000\u001esq\u0000"
+"~\u0000\u001ft\u00008com.sun.identity.liberty.ws.common.jaxb.ac.ExtensionTy"
+"peq\u0000~\u0000#sq\u0000~\u0000\bppsq\u0000~\u0000\u0015q\u0000~\u0000\fpq\u0000~\u00001q\u0000~\u0000Aq\u0000~\u0000\u001esq\u0000~\u0000\u001ft\u0000\tExtension"
+"q\u0000~\u0000Fq\u0000~\u0000\u001esr\u0000\"com.sun.msv.grammar.ExpressionPool\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0002\u0000\u0001L"
+"\u0000\bexpTablet\u0000/Lcom/sun/msv/grammar/ExpressionPool$ClosedHash;"
+"xpsr\u0000-com.sun.msv.grammar.ExpressionPool$ClosedHash\u00d7j\u00d0N\u00ef\u00e8\u00ed\u001c\u0003"
+"\u0000\u0003I\u0000\u0005countB\u0000\rstreamVersionL\u0000\u0006parentt\u0000$Lcom/sun/msv/grammar/E"
+"xpressionPool;xp\u0000\u0000\u0000$\u0001pq\u0000~\u0000%q\u0000~\u0000Pq\u0000~\u0000dq\u0000~\u0000yq\u0000~\u0000\u0011q\u0000~\u0000\'q\u0000~\u0000Jq\u0000~"
+"\u0000Rq\u0000~\u0000^q\u0000~\u0000fq\u0000~\u0000sq\u0000~\u0000{q\u0000~\u0000,q\u0000~\u0000Wq\u0000~\u0000kq\u0000~\u0000\u0080q\u0000~\u0000\u0014q\u0000~\u0000(q\u0000~\u0000Kq\u0000~"
+"\u0000Sq\u0000~\u0000_q\u0000~\u0000gq\u0000~\u0000tq\u0000~\u0000|q\u0000~\u0000\nq\u0000~\u0000Hq\u0000~\u0000\\q\u0000~\u0000qq\u0000~\u0000\u0006q\u0000~\u0000\u0007q\u0000~\u0000\tq\u0000~"
+"\u0000Gq\u0000~\u0000[q\u0000~\u0000\u0005q\u0000~\u0000pq\u0000~\u0000ox"));
        }
        return new com.sun.msv.verifier.regexp.REDocumentDeclaration(schemaFragment);
    }

    public class Unmarshaller
        extends com.sun.identity.federation.jaxb.entityconfig.impl.runtime.AbstractUnmarshallingEventHandlerImpl
    {


        public Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context) {
            super(context, "-------------");
        }

        protected Unmarshaller(com.sun.identity.federation.jaxb.entityconfig.impl.runtime.UnmarshallingContext context, int startState) {
            this(context);
            state = startState;
        }

        public java.lang.Object owner() {
            return com.sun.identity.liberty.ws.common.jaxb.ac.impl.PasswordTypeImpl.this;
        }

        public void enterElement(java.lang.String ___uri, java.lang.String ___local, java.lang.String ___qname, org.xml.sax.Attributes __atts)
            throws org.xml.sax.SAXException
        {
            int attIdx;
            outer:
            while (true) {
                switch (state) {
                    case  11 :
                        attIdx = context.getAttribute("", "max");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "min");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  1 :
                        if (("Alphabet" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _Alphabet = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetElementImpl.class), 4, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Alphabet" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 2;
                            return ;
                        }
                        state = 4;
                        continue outer;
                    case  5 :
                        attIdx = context.getAttribute("", "mechanism");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  7 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        state = 10;
                        continue outer;
                    case  10 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionElementImpl.class), 10, ___uri, ___local, ___qname, __atts)));
                            return ;
                        }
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 8;
                            return ;
                        }
                        revertToParentFromEnterElement(___uri, ___local, ___qname, __atts);
                        return ;
                    case  4 :
                        if (("Generation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _Generation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.GenerationElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.GenerationElementImpl.class), 7, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Generation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 5;
                            return ;
                        }
                        state = 7;
                        continue outer;
                    case  0 :
                        if (("Length" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            _Length = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.LengthElementImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.LengthElementImpl.class), 1, ___uri, ___local, ___qname, __atts));
                            return ;
                        }
                        if (("Length" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.pushAttributes(__atts, false);
                            state = 11;
                            return ;
                        }
                        state = 1;
                        continue outer;
                    case  2 :
                        attIdx = context.getAttribute("", "case");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "excludedChars");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        attIdx = context.getAttribute("", "requiredChars");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().enterElement(___uri, ___local, ___qname, __atts);
                            return ;
                        }
                        break;
                    case  8 :
                        if (!(("" == ___uri)||("urn:liberty:ac:2003-08" == ___uri))) {
                            _getExtension().add(((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl) spawnChildFromEnterElement((com.sun.identity.liberty.ws.common.jaxb.ac.impl.ExtensionTypeImpl.class), 9, ___uri, ___local, ___qname, __atts)));
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
                    case  11 :
                        attIdx = context.getAttribute("", "max");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "min");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  9 :
                        if (("Extension" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 10;
                            return ;
                        }
                        break;
                    case  5 :
                        attIdx = context.getAttribute("", "mechanism");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  10 :
                        revertToParentFromLeaveElement(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  6 :
                        if (("Generation" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 7;
                            return ;
                        }
                        break;
                    case  0 :
                        state = 1;
                        continue outer;
                    case  12 :
                        if (("Length" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 1;
                            return ;
                        }
                        break;
                    case  3 :
                        if (("Alphabet" == ___local)&&("urn:liberty:ac:2003-08" == ___uri)) {
                            context.popAttributes();
                            state = 4;
                            return ;
                        }
                        break;
                    case  2 :
                        attIdx = context.getAttribute("", "case");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "excludedChars");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "requiredChars");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveElement(___uri, ___local, ___qname);
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
                    case  11 :
                        if (("max" == ___local)&&("" == ___uri)) {
                            _Length = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.LengthTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.LengthTypeImpl.class), 12, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("min" == ___local)&&("" == ___uri)) {
                            _Length = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.LengthTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.LengthTypeImpl.class), 12, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  5 :
                        if (("mechanism" == ___local)&&("" == ___uri)) {
                            _Generation = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.GenerationTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.GenerationTypeImpl.class), 6, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  10 :
                        revertToParentFromEnterAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        state = 1;
                        continue outer;
                    case  2 :
                        if (("case" == ___local)&&("" == ___uri)) {
                            _Alphabet = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetTypeImpl.class), 3, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("excludedChars" == ___local)&&("" == ___uri)) {
                            _Alphabet = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetTypeImpl.class), 3, ___uri, ___local, ___qname));
                            return ;
                        }
                        if (("requiredChars" == ___local)&&("" == ___uri)) {
                            _Alphabet = ((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetTypeImpl) spawnChildFromEnterAttribute((com.sun.identity.liberty.ws.common.jaxb.ac.impl.AlphabetTypeImpl.class), 3, ___uri, ___local, ___qname));
                            return ;
                        }
                        break;
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
                    case  11 :
                        attIdx = context.getAttribute("", "max");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "min");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  1 :
                        state = 4;
                        continue outer;
                    case  5 :
                        attIdx = context.getAttribute("", "mechanism");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
                    case  7 :
                        state = 10;
                        continue outer;
                    case  10 :
                        revertToParentFromLeaveAttribute(___uri, ___local, ___qname);
                        return ;
                    case  4 :
                        state = 7;
                        continue outer;
                    case  0 :
                        state = 1;
                        continue outer;
                    case  2 :
                        attIdx = context.getAttribute("", "case");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "excludedChars");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        attIdx = context.getAttribute("", "requiredChars");
                        if (attIdx >= 0) {
                            context.consumeAttribute(attIdx);
                            context.getCurrentHandler().leaveAttribute(___uri, ___local, ___qname);
                            return ;
                        }
                        break;
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
                        case  11 :
                            attIdx = context.getAttribute("", "max");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "min");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  1 :
                            state = 4;
                            continue outer;
                        case  5 :
                            attIdx = context.getAttribute("", "mechanism");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                        case  7 :
                            state = 10;
                            continue outer;
                        case  10 :
                            revertToParentFromText(value);
                            return ;
                        case  4 :
                            state = 7;
                            continue outer;
                        case  0 :
                            state = 1;
                            continue outer;
                        case  2 :
                            attIdx = context.getAttribute("", "case");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "excludedChars");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            attIdx = context.getAttribute("", "requiredChars");
                            if (attIdx >= 0) {
                                context.consumeAttribute(attIdx);
                                context.getCurrentHandler().text(value);
                                return ;
                            }
                            break;
                    }
                } catch (java.lang.RuntimeException e) {
                    handleUnexpectedTextException(value, e);
                }
                break;
            }
        }

    }

}
