//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types package. 
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
@XmlRegistry
public class ObjectFactory {

    private final static QName _FileSdIAccoglienza_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "fileSdIAccoglienza");
    private final static QName _FileSdI_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "fileSdI");
    private final static QName _RispostaSdIRiceviFile_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "rispostaSdIRiceviFile");
    private final static QName _RicevutaConsegna_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "ricevutaConsegna");
    private final static QName _NotificaMancataConsegna_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "notificaMancataConsegna");
    private final static QName _NotificaScarto_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "notificaScarto");
    private final static QName _NotificaEsito_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "notificaEsito");
    private final static QName _NotificaDecorrenzaTermini_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "notificaDecorrenzaTermini");
    private final static QName _AttestazioneTrasmissioneFattura_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", "attestazioneTrasmissioneFattura");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileSdIBaseType }
     * 
     */
    public FileSdIBaseType createFileSdIBaseType() {
        return new FileSdIBaseType();
    }

    /**
     * Create an instance of {@link FileSdIType }
     * 
     */
    public FileSdIType createFileSdIType() {
        return new FileSdIType();
    }

    /**
     * Create an instance of {@link RispostaSdIRiceviFileType }
     * 
     */
    public RispostaSdIRiceviFileType createRispostaSdIRiceviFileType() {
        return new RispostaSdIRiceviFileType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIBaseType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIBaseType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "fileSdIAccoglienza")
    public JAXBElement<FileSdIBaseType> createFileSdIAccoglienza(FileSdIBaseType value) {
        return new JAXBElement<FileSdIBaseType>(_FileSdIAccoglienza_QNAME, FileSdIBaseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "fileSdI")
    public JAXBElement<FileSdIType> createFileSdI(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_FileSdI_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaSdIRiceviFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RispostaSdIRiceviFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "rispostaSdIRiceviFile")
    public JAXBElement<RispostaSdIRiceviFileType> createRispostaSdIRiceviFile(RispostaSdIRiceviFileType value) {
        return new JAXBElement<RispostaSdIRiceviFileType>(_RispostaSdIRiceviFile_QNAME, RispostaSdIRiceviFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "ricevutaConsegna")
    public JAXBElement<FileSdIType> createRicevutaConsegna(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_RicevutaConsegna_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "notificaMancataConsegna")
    public JAXBElement<FileSdIType> createNotificaMancataConsegna(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_NotificaMancataConsegna_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "notificaScarto")
    public JAXBElement<FileSdIType> createNotificaScarto(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_NotificaScarto_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "notificaEsito")
    public JAXBElement<FileSdIType> createNotificaEsito(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_NotificaEsito_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "notificaDecorrenzaTermini")
    public JAXBElement<FileSdIType> createNotificaDecorrenzaTermini(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_NotificaDecorrenzaTermini_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types", name = "attestazioneTrasmissioneFattura")
    public JAXBElement<FileSdIType> createAttestazioneTrasmissioneFattura(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_AttestazioneTrasmissioneFattura_QNAME, FileSdIType.class, null, value);
    }

}
