//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types;

import java.math.BigInteger;
import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rispostaSdIRiceviFile_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rispostaSdIRiceviFile_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificativoSdI" type="{http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types}identificativoSdI_Type"/&gt;
 *         &lt;element name="DataOraRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Errore" type="{http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types}erroreInvio_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaSdIRiceviFile_Type", propOrder = {
    "identificativoSdI",
    "dataOraRicezione",
    "errore"
})
public class RispostaSdIRiceviFileType {

    @XmlElement(name = "IdentificativoSdI", required = true)
    protected BigInteger identificativoSdI;
    @XmlElement(name = "DataOraRicezione", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraRicezione;
    @XmlElement(name = "Errore")
    @XmlSchemaType(name = "string")
    protected ErroreInvioType errore;

    /**
     * Recupera il valore della proprietà identificativoSdI.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdentificativoSdI() {
        return identificativoSdI;
    }

    /**
     * Imposta il valore della proprietà identificativoSdI.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdentificativoSdI(BigInteger value) {
        this.identificativoSdI = value;
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
