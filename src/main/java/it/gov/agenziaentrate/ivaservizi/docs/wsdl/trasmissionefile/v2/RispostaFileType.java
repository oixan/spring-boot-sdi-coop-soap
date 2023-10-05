//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RispostaFile_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RispostaFile_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}IDFile_Type"/&gt;
 *         &lt;element name="DataOraRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Errore" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}ErroreInvio_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RispostaFile_Type", propOrder = {
    "idFile",
    "dataOraRicezione",
    "errore"
})
public class RispostaFileType {

    @XmlElement(name = "IDFile")
    @XmlSchemaType(name = "positiveInteger")
    protected long idFile;
    @XmlElement(name = "DataOraRicezione", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraRicezione;
    @XmlElement(name = "Errore")
    @XmlSchemaType(name = "string")
    protected ErroreInvioType errore;

    /**
     * Recupera il valore della proprietà idFile.
     * 
     */
    public long getIDFile() {
        return idFile;
    }

    /**
     * Imposta il valore della proprietà idFile.
     * 
     */
    public void setIDFile(long value) {
        this.idFile = value;
    }

    /**
     * Recupera il valore della proprietà dataOraRicezione.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataOraRicezione() {
        return dataOraRicezione;
    }

    /**
     * Imposta il valore della proprietà dataOraRicezione.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataOraRicezione(XMLGregorianCalendar value) {
        this.dataOraRicezione = value;
    }

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link ErroreInvioType }
     *     
     */
    public ErroreInvioType getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroreInvioType }
     *     
     */
    public void setErrore(ErroreInvioType value) {
        this.errore = value;
    }

}
