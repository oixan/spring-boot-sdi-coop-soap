//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2;

import jakarta.activation.DataHandler;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlMimeType;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per File_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="File_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NomeFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}NomeFile_Type"/&gt;
 *         &lt;element name="TipoFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}TipoFile_Type"/&gt;
 *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "File_Type", propOrder = {
    "nomeFile",
    "tipoFile",
    "file"
})
public class FileType {

    @XmlElement(name = "NomeFile", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nomeFile;
    @XmlElement(name = "TipoFile", required = true)
    protected String tipoFile;
    @XmlElement(name = "File", required = true)
    @XmlMimeType("*/*")
    protected DataHandler file;

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

}
