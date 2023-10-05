//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.NormalizedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java per dettaglioArchiovio_Type complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="dettaglioArchiovio_Type"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NomeFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}NomeFile_Type"/&gt;
 *         &lt;element name="IDFile" type="{http://ivaservizi.agenziaentrate.gov.it/docs/wsdl/trasmissionefile/v2.0}IDFile_Type"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dettaglioArchiovio_Type", propOrder = {
    "nomeFile",
    "idFile"
})
public class DettaglioArchiovioType {

    @XmlElement(name = "NomeFile", required = true)
    @XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    @XmlSchemaType(name = "normalizedString")
    protected String nomeFile;
    @XmlElement(name = "IDFile")
    @XmlSchemaType(name = "positiveInteger")
    protected long idFile;

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

}
