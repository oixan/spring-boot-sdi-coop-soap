//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.fatturapa.sdi.ws.ricezione.v1_0.types;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.gov.fatturapa.sdi.ws.ricezione.v1_0.types package. 
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

    private final static QName _FileSdI_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", "fileSdI");
    private final static QName _RispostaRiceviFatture_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", "rispostaRiceviFatture");
    private final static QName _FileSdIConMetadati_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", "fileSdIConMetadati");
    private final static QName _RispostaSdINotificaEsito_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", "rispostaSdINotificaEsito");
    private final static QName _NotificaEsito_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", "notificaEsito");
    private final static QName _NotificaDecorrenzaTermini_QNAME = new QName("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", "notificaDecorrenzaTermini");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.gov.fatturapa.sdi.ws.ricezione.v1_0.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileSdIType }
     * 
     */
    public FileSdIType createFileSdIType() {
        return new FileSdIType();
    }

    /**
     * Create an instance of {@link RispostaRiceviFattureType }
     * 
     */
    public RispostaRiceviFattureType createRispostaRiceviFattureType() {
        return new RispostaRiceviFattureType();
    }

    /**
     * Create an instance of {@link FileSdIConMetadatiType }
     * 
     */
    public FileSdIConMetadatiType createFileSdIConMetadatiType() {
        return new FileSdIConMetadatiType();
    }

    /**
     * Create an instance of {@link RispostaSdINotificaEsitoType }
     * 
     */
    public RispostaSdINotificaEsitoType createRispostaSdINotificaEsitoType() {
        return new RispostaSdINotificaEsitoType();
    }

    /**
     * Create an instance of {@link FileSdIBaseType }
     * 
     */
    public FileSdIBaseType createFileSdIBaseType() {
        return new FileSdIBaseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", name = "fileSdI")
    public JAXBElement<FileSdIType> createFileSdI(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_FileSdI_QNAME, FileSdIType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaRiceviFattureType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RispostaRiceviFattureType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", name = "rispostaRiceviFatture")
    public JAXBElement<RispostaRiceviFattureType> createRispostaRiceviFatture(RispostaRiceviFattureType value) {
        return new JAXBElement<RispostaRiceviFattureType>(_RispostaRiceviFatture_QNAME, RispostaRiceviFattureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIConMetadatiType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIConMetadatiType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", name = "fileSdIConMetadati")
    public JAXBElement<FileSdIConMetadatiType> createFileSdIConMetadati(FileSdIConMetadatiType value) {
        return new JAXBElement<FileSdIConMetadatiType>(_FileSdIConMetadati_QNAME, FileSdIConMetadatiType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaSdINotificaEsitoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RispostaSdINotificaEsitoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", name = "rispostaSdINotificaEsito")
    public JAXBElement<RispostaSdINotificaEsitoType> createRispostaSdINotificaEsito(RispostaSdINotificaEsitoType value) {
        return new JAXBElement<RispostaSdINotificaEsitoType>(_RispostaSdINotificaEsito_QNAME, RispostaSdINotificaEsitoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileSdIType }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", name = "notificaEsito")
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
    @XmlElementDecl(namespace = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types", name = "notificaDecorrenzaTermini")
    public JAXBElement<FileSdIType> createNotificaDecorrenzaTermini(FileSdIType value) {
        return new JAXBElement<FileSdIType>(_NotificaDecorrenzaTermini_QNAME, FileSdIType.class, null, value);
    }

}
