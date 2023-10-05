//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.xsd.file.v2;

import javax.xml.datatype.XMLGregorianCalendar;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2000._09.xmldsig_.SignatureType;


/**
 * <p>Classe Java per EsitoFile_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="EsitoFile_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="TipoFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}TipoFile_Type"/&gt;
 *         &lt;element name="IDFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}IDFile_Type"/&gt;
 *         &lt;element name="NomeFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}NomeFile_Type"/&gt;
 *         &lt;element name="DataOraRicezione" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="RifArchivio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}RifArchivio_Type" minOccurs="0"/&gt;
 *         &lt;element name="Esito" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}Esito_Type"/&gt;
 *         &lt;element name="ListaErrori" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}ListaErrori_Type" minOccurs="0"/&gt;
 *         &lt;element name="MessageID" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}MessageId_Type"/&gt;
 *         &lt;element name="PECMessageID" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}MessageId_Type" minOccurs="0"/&gt;
 *         &lt;element name="Note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versione" use="required" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}Versione_Type" fixed="2.0" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EsitoFile_Type", propOrder = {
    "tipoFile",
    "idFile",
    "nomeFile",
    "dataOraRicezione",
    "rifArchivio",
    "esito",
    "listaErrori",
    "messageID",
    "pecMessageID",
    "note",
    "signature"
})
public class EsitoFileType {

    @XmlElement(name = "TipoFile", required = true)
    protected String tipoFile;
    @XmlElement(name = "IDFile")
    @XmlSchemaType(name = "positiveInteger")
    protected long idFile;
    @XmlElement(name = "NomeFile", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nomeFile;
    @XmlElement(name = "DataOraRicezione", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dataOraRicezione;
    @XmlElement(name = "RifArchivio")
    protected RifArchivioType rifArchivio;
    @XmlElement(name = "Esito", required = true)
    @XmlSchemaType(name = "string")
    protected EsitoType esito;
    @XmlElement(name = "ListaErrori")
    protected ListaErroriType listaErrori;
    @XmlElement(name = "MessageID", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String messageID;
    @XmlElement(name = "PECMessageID")
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String pecMessageID;
    @XmlElement(name = "Note")
    protected String note;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versione", required = true)
    protected String versione;

    /**
     * Recupera il valore della proprietà tipoFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFile() {
        return tipoFile;
    }

    /**
     * Imposta il valore della proprietà tipoFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFile(String value) {
        this.tipoFile = value;
    }

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
     * Recupera il valore della proprietà nomeFile.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFile() {
        return nomeFile;
    }

    /**
     * Imposta il valore della proprietà nomeFile.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFile(String value) {
        this.nomeFile = value;
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
     * Recupera il valore della proprietà rifArchivio.
     * 
     * @return
     *     possible object is
     *     {@link RifArchivioType }
     *     
     */
    public RifArchivioType getRifArchivio() {
        return rifArchivio;
    }

    /**
     * Imposta il valore della proprietà rifArchivio.
     * 
     * @param value
     *     allowed object is
     *     {@link RifArchivioType }
     *     
     */
    public void setRifArchivio(RifArchivioType value) {
        this.rifArchivio = value;
    }

    /**
     * Recupera il valore della proprietà esito.
     * 
     * @return
     *     possible object is
     *     {@link EsitoType }
     *     
     */
    public EsitoType getEsito() {
        return esito;
    }

    /**
     * Imposta il valore della proprietà esito.
     * 
     * @param value
     *     allowed object is
     *     {@link EsitoType }
     *     
     */
    public void setEsito(EsitoType value) {
        this.esito = value;
    }

    /**
     * Recupera il valore della proprietà listaErrori.
     * 
     * @return
     *     possible object is
     *     {@link ListaErroriType }
     *     
     */
    public ListaErroriType getListaErrori() {
        return listaErrori;
    }

    /**
     * Imposta il valore della proprietà listaErrori.
     * 
     * @param value
     *     allowed object is
     *     {@link ListaErroriType }
     *     
     */
    public void setListaErrori(ListaErroriType value) {
        this.listaErrori = value;
    }

    /**
     * Recupera il valore della proprietà messageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageID() {
        return messageID;
    }

    /**
     * Imposta il valore della proprietà messageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageID(String value) {
        this.messageID = value;
    }

    /**
     * Recupera il valore della proprietà pecMessageID.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPECMessageID() {
        return pecMessageID;
    }

    /**
     * Imposta il valore della proprietà pecMessageID.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPECMessageID(String value) {
        this.pecMessageID = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Imposta il valore della proprietà signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Recupera il valore della proprietà versione.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersione() {
        if (versione == null) {
            return "2.0";
        } else {
            return versione;
        }
    }

    /**
     * Imposta il valore della proprietà versione.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersione(String value) {
        this.versione = value;
    }

}
