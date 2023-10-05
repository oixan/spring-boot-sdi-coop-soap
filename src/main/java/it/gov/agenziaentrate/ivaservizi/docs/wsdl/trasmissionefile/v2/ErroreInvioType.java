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
 * <p>Classe Java per ErroreInvio_Type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * <pre>
 * &lt;simpleType name="ErroreInvio_Type"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="EI01"/&gt;
 *     &lt;enumeration value="EI02"/&gt;
 *     &lt;enumeration value="EI03"/&gt;
 *     &lt;enumeration value="EI04"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ErroreInvio_Type")
@XmlEnum
public enum ErroreInvioType {


    /**
     * 
     * 						EI01 = FILE VUOTO
     * 					
     * 
     */
    @XmlEnumValue("EI01")
    EI_01("EI01"),

    /**
     * 
     * 						EI02 = SERVIZIO NON DISPONIBILE
     * 					
     * 
     */
    @XmlEnumValue("EI02")
    EI_02("EI02"),

    /**
     * 
     * 						EI03 = UTENTE NON ABILITATO
     * 					
     * 
     */
    @XmlEnumValue("EI03")
    EI_03("EI03"),

    /**
     * 
     * 						EI04 = TIPO FILE NON CORRETTO
     * 					
     * 
     */
    @XmlEnumValue("EI04")
    EI_04("EI04");
    private final String value;

    ErroreInvioType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ErroreInvioType fromValue(String v) {
        for (ErroreInvioType c: ErroreInvioType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
