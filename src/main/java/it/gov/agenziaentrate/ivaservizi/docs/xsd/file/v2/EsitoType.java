//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.agenziaentrate.ivaservizi.docs.xsd.file.v2;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per Esito_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="Esito_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;length value="4"/&gt;
 *     &lt;enumeration value="ES01"/&gt;
 *     &lt;enumeration value="ES02"/&gt;
 *     &lt;enumeration value="ES03"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Esito_Type")
@XmlEnum
public enum EsitoType {


    /**
     * File validato
     * 
     */
    @XmlEnumValue("ES01")
    ES_01("ES01"),

    /**
     * File validato con segnalazione
     * 
     */
    @XmlEnumValue("ES02")
    ES_02("ES02"),

    /**
     * File scartato
     * 
     */
    @XmlEnumValue("ES03")
    ES_03("ES03");
    private final String value;

    EsitoType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsitoType fromValue(String v) {
        for (EsitoType c: EsitoType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
