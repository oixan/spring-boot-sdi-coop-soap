//
// Questo file è stato generato dall'Eclipse Implementation of JAXB, v3.0.0 
// Vedere https://eclipse-ee4j.github.io/jaxb-ri 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2023.10.05 alle 11:53:48 PM CEST 
//


package it.gov.fatturapa.sdi.ws.ricezione.v1_0.types;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per esitoRicezione_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="esitoRicezione_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ER01"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "esitoRicezione_Type")
@XmlEnum
public enum EsitoRicezioneType {


    /**
     * 
     * 						ER01 = PRESA IN CARICO
     * 					
     * 
     */
    @XmlEnumValue("ER01")
    ER_01("ER01");
    private final String value;

    EsitoRicezioneType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsitoRicezioneType fromValue(String v) {
        for (EsitoRicezioneType c: EsitoRicezioneType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
