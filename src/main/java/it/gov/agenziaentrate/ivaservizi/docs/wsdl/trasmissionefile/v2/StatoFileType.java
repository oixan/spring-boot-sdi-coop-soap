//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.wsdl.trasmissionefile.v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per StatoFile_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="StatoFile_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="SF01"/&gt;
 *     &lt;enumeration value="SF02"/&gt;
 *     &lt;enumeration value="SF03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "StatoFile_Type")
@XmlEnum
public enum StatoFileType {


    /**
     * 
     * 						SF01 = IN ELABORAZIONE
     * 					
     * 
     */
    @XmlEnumValue("SF01")
    SF_01("SF01"),

    /**
     * 
     * 						SF02 = ELABORATO
     * 					
     * 
     */
    @XmlEnumValue("SF02")
    SF_02("SF02"),

    /**
     * 
     * 						SF03 = ERRORE
     * 					
     * 
     */
    @XmlEnumValue("SF03")
    SF_03("SF03");
    private final String value;

    StatoFileType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static StatoFileType fromValue(String v) {
        for (StatoFileType c: StatoFileType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
