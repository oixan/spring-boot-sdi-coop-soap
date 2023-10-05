//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per RispostaEsito_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RispostaEsito_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Esito" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}StatoFile_Type"/&gt;
 *         &lt;element name="Notifica" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}Notifica_Type" minOccurs="0"/&gt;
 *         &lt;element name="DettaglioArchivio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}dettaglioArchiovio_Type" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Errore" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}Errore_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RispostaEsito_Type", propOrder = {
    "esito",
    "notifica",
    "dettaglioArchivio",
    "errore"
})
public class RispostaEsitoType {

    @XmlElement(name = "Esito", required = true)
    @XmlSchemaType(name = "string")
    protected StatoFileType esito;
    @XmlElement(name = "Notifica")
    protected NotificaType notifica;
    @XmlElement(name = "DettaglioArchivio")
    protected List<DettaglioArchiovioType> dettaglioArchivio;
    @XmlElement(name = "Errore")
    @XmlSchemaType(name = "string")
    protected ErroreType errore;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link StatoFileType }
     *     
     */
    public StatoFileType getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link StatoFileType }
     *     
     */
    public void setEsito(StatoFileType value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà notifica.
     * 
     * @return
     *     possible object is
     *     {@link NotificaType }
     *     
     */
    public NotificaType getNotifica() {
        return notifica;
    }

    /**
     * Imposta il valore della proprietà notifica.
     * 
     * @param value
     *     allowed object is
     *     {@link NotificaType }
     *     
     */
    public void setNotifica(NotificaType value) {
        this.notifica = value;
    }

    /**
     * Gets the value of the dettaglioArchivio property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the Jakarta XML Binding object.
     * This is why there is not a <CODE>set</CODE> method for the dettaglioArchivio property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDettaglioArchivio().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DettaglioArchiovioType }
     * 
     * 
     */
    public List<DettaglioArchiovioType> getDettaglioArchivio() {
        if (dettaglioArchivio == null) {
            dettaglioArchivio = new ArrayList<DettaglioArchiovioType>();
        }
        return this.dettaglioArchivio;
    }

    /**
     * Recupera il valore della proprietà errore.
     * 
     * @return
     *     possible object is
     *     {@link ErroreType }
     *     
     */
    public ErroreType getErrore() {
        return errore;
    }

    /**
     * Imposta il valore della proprietà errore.
     * 
     * @param value
     *     allowed object is
     *     {@link ErroreType }
     *     
     */
    public void setErrore(ErroreType value) {
        this.errore = value;
    }

}
