//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.xsd.file.v2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the it.gov.agenziaentrate.ivaservizi.docs.xsd.file.v2 package. 
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

    private final static QName _EsitoFile_QNAME = new QName("http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0", "EsitoFile");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: it.gov.agenziaentrate.ivaservizi.docs.xsd.file.v2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EsitoFileType }
     * 
     */
    public EsitoFileType createEsitoFileType() {
        return new EsitoFileType();
    }

    /**
     * Create an instance of {@link RifArchivioType }
     * 
     */
    public RifArchivioType createRifArchivioType() {
        return new RifArchivioType();
    }

    /**
     * Create an instance of {@link ListaErroriType }
     * 
     */
    public ListaErroriType createListaErroriType() {
        return new ListaErroriType();
    }

    /**
     * Create an instance of {@link ErroreType }
     * 
     */
    public ErroreType createErroreType() {
        return new ErroreType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EsitoFileType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EsitoFileType }{@code >}
     */
    @XmlElementDecl(namespace = "http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0", name = "EsitoFile")
    public JAXBElement<EsitoFileType> createEsitoFile(EsitoFileType value) {
        return new JAXBElement<EsitoFileType>(_EsitoFile_QNAME, EsitoFileType.class, null, value);
    }

}
