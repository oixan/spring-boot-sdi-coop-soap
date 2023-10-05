//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.fatturapa.sdi.ws.ricezione.v1_0.types;

import java.math.BigInteger;
import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per fileSdIConMetadati_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="fileSdIConMetadati_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IdentificativoSdI" type="{http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types}identificativoSdI_Type"/&gt;
 *         &lt;element name="NomeFile" type="{http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types}nomeFile_Type"/&gt;
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *         &lt;element name="NomeFileMetadati" type="{http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types}nomeFile_Type"/&gt;
 *         &lt;element name="Metadati" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fileSdIConMetadati_Type", propOrder = {
    "identificativoSdI",
    "nomeFile",
    "file",
    "nomeFileMetadati",
    "metadati"
})
public class FileSdIConMetadatiType {

    @XmlElement(name = "IdentificativoSdI", required = true)
    protected BigInteger identificativoSdI;
    @XmlElement(name = "NomeFile", required = true)
    protected String nomeFile;
    @XmlElement(name = "File", required = true)
    @XmlMimeType("*/*")
    protected DataHandler file;
    @XmlElement(name = "NomeFileMetadati", required = true)
    protected String nomeFileMetadati;
    @XmlElement(name = "Metadati", required = true)
    @XmlMimeType("*/*")
    protected DataHandler metadati;

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
     * Recupera il valore della proprietà file.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getFile() {
        return file;
    }

    /**
     * Imposta il valore della proprietà file.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setFile(DataHandler value) {
        this.file = value;
    }

    /**
     * Recupera il valore della proprietà nomeFileMetadati.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFileMetadati() {
        return nomeFileMetadati;
    }

    /**
     * Imposta il valore della proprietà nomeFileMetadati.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFileMetadati(String value) {
        this.nomeFileMetadati = value;
    }

    /**
     * Recupera il valore della proprietà metadati.
     * 
     * @return
     *     possible object is
     *     {@link DataHandler }
     *     
     */
    public DataHandler getMetadati() {
        return metadati;
    }

    /**
     * Imposta il valore della proprietà metadati.
     * 
     * @param value
     *     allowed object is
     *     {@link DataHandler }
     *     
     */
    public void setMetadati(DataHandler value) {
        this.metadati = value;
    }

}
