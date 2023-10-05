//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.xsd.file.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per RifArchivio_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="RifArchivio_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IDArchivio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}IDFile_Type"/&gt;
 *         &lt;element name="NomeArchivio" type="{http://ivaservizi.agenziaentrate.gov.it/docs/xsd/file/v2.0}NomeFile_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RifArchivio_Type", propOrder = {
    "idArchivio",
    "nomeArchivio"
})
public class RifArchivioType {

    @XmlElement(name = "IDArchivio")
    @XmlSchemaType(name = "positiveInteger")
    protected long idArchivio;
    @XmlElement(name = "NomeArchivio", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nomeArchivio;

    /**
     * Recupera il valore della proprietà idArchivio.
     * 
     */
    public long getIDArchivio() {
        return idArchivio;
    }

    /**
     * Imposta il valore della proprietà idArchivio.
     * 
     */
    public void setIDArchivio(long value) {
        this.idArchivio = value;
    }

    /**
     * Recupera il valore della proprietà nomeArchivio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeArchivio() {
        return nomeArchivio;
    }

    /**
     * Imposta il valore della proprietà nomeArchivio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeArchivio(String value) {
        this.nomeArchivio = value;
    }

}
