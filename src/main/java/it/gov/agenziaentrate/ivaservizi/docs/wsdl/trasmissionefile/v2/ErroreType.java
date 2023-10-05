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
 * <p>Classe Java per Errore_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="Errore_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EE01"/&gt;
 *     &lt;enumeration value="EE02"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Errore_Type")
@XmlEnum
public enum ErroreType {


    /**
     * 
     * 						EE01 = SERVIZIO NON DISPONIBILE
     * 					
     * 
     */
    @XmlEnumValue("EE01")
    EE_01("EE01"),

    /**
     * 
     * 						EE02 = UTENTE NON ABILITATO
     * 					
     * 
     */
    @XmlEnumValue("EE02")
    EE_02("EE02");
    private final String value;

    ErroreType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErroreType fromValue(String v) {
        for (ErroreType c: ErroreType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
