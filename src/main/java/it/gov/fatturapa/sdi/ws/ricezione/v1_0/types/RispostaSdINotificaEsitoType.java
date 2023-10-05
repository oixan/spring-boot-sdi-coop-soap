//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.fatturapa.sdi.ws.ricezione.v1_0.types;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per rispostaSdINotificaEsito_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="rispostaSdINotificaEsito_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Esito" type="{http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types}esitoNotifica_Type"/&gt;
 *         &lt;element name="ScartoEsito" type="{http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types}fileSdIBase_Type" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rispostaSdINotificaEsito_Type", propOrder = {
    "esito",
    "scartoEsito"
})
public class RispostaSdINotificaEsitoType {

    @XmlElement(name = "Esito", required = true)
    @XmlSchemaType(name = "string")
    protected EsitoNotificaType esito;
    @XmlElement(name = "ScartoEsito")
    protected FileSdIBaseType scartoEsito;

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link EsitoNotificaType }
     *     
     */
    public EsitoNotificaType getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoNotificaType }
     *     
     */
    public void setEsito(EsitoNotificaType value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà scartoEsito.
     * 
     * @return
     *     possible object is
     *     {@link FileSdIBaseType }
     *     
     */
    public FileSdIBaseType getScartoEsito() {
        return scartoEsito;
    }

    /**
     * Imposta il valore della proprietà scartoEsito.
     * 
     * @param value
     *     allowed object is
     *     {@link FileSdIBaseType }
     *     
     */
    public void setScartoEsito(FileSdIBaseType value) {
        this.scartoEsito = value;
    }

}
