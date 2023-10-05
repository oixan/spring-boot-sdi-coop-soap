//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2 package. 
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

    private final static QName _File_QNAME = new QName("http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", "file");
    private final static QName _RispostaFile_QNAME = new QName("http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", "rispostaFile");
    private final static QName _Esito_QNAME = new QName("http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", "esito");
    private final static QName _RispostaEsito_QNAME = new QName("http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", "rispostaEsito");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FileType }
     * 
     */
    public FileType createFileType() {
        return new FileType();
    }

    /**
     * Create an instance of {@link RispostaFileType }
     * 
     */
    public RispostaFileType createRispostaFileType() {
        return new RispostaFileType();
    }

    /**
     * Create an instance of {@link EsitoType }
     * 
     */
    public EsitoType createEsitoType() {
        return new EsitoType();
    }

    /**
     * Create an instance of {@link RispostaEsitoType }
     * 
     */
    public RispostaEsitoType createRispostaEsitoType() {
        return new RispostaEsitoType();
    }

    /**
     * Create an instance of {@link NotificaType }
     * 
     */
    public NotificaType createNotificaType() {
        return new NotificaType();
    }

    /**
     * Create an instance of {@link DettaglioArchiovioType }
     * 
     */
    public DettaglioArchiovioType createDettaglioArchiovioType() {
        return new DettaglioArchiovioType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link FileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", name = "file")
    public JAXBElement<FileType> createFile(FileType value) {
        return new JAXBElement<FileType>(_File_QNAME, FileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RispostaFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", name = "rispostaFile")
    public JAXBElement<RispostaFileType> createRispostaFile(RispostaFileType value) {
        return new JAXBElement<RispostaFileType>(_RispostaFile_QNAME, RispostaFileType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsitoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsitoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", name = "esito")
    public JAXBElement<EsitoType> createEsito(EsitoType value) {
        return new JAXBElement<EsitoType>(_Esito_QNAME, EsitoType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RispostaEsitoType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RispostaEsitoType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0", name = "rispostaEsito")
    public JAXBElement<RispostaEsitoType> createRispostaEsito(RispostaEsitoType value) {
        return new JAXBElement<RispostaEsitoType>(_RispostaEsito_QNAME, RispostaEsitoType.class, null, value);
    }

}
