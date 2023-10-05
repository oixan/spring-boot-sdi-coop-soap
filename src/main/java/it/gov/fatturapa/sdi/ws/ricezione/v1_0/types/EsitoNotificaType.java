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
 * <p>Classe Java per esitoNotifica_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="esitoNotifica_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ES00"/&gt;
 *     &lt;enumeration value="ES01"/&gt;
 *     &lt;enumeration value="ES02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "esitoNotifica_Type")
@XmlEnum
public enum EsitoNotificaType {


    /**
     * 
     * 						ES00 = NOTIFICA NON ACCETTATA
     * 					
     * 
     */
    @XmlEnumValue("ES00")
    ES_00("ES00"),

    /**
     * 
     * 						ES01 = NOTIFICA ACCETTATA
     * 					
     * 
     */
    @XmlEnumValue("ES01")
    ES_01("ES01"),

    /**
     * 
     * 						ES02 = SERVIZIO NON DISPONIBILE
     * 					
     * 
     */
    @XmlEnumValue("ES02")
    ES_02("ES02");
    private final String value;

    EsitoNotificaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EsitoNotificaType fromValue(String v) {
        for (EsitoNotificaType c: EsitoNotificaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
