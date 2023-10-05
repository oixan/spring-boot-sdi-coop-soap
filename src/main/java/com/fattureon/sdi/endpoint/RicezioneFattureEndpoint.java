package com.fattureon.sdi.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.gov.fatturapa.sdi.ws.ricezione.v1_0.types.EsitoRicezioneType;
import it.gov.fatturapa.sdi.ws.ricezione.v1_0.types.FileSdIConMetadatiType;
import it.gov.fatturapa.sdi.ws.ricezione.v1_0.types.FileSdIType;
import it.gov.fatturapa.sdi.ws.ricezione.v1_0.types.ObjectFactory;
import it.gov.fatturapa.sdi.ws.ricezione.v1_0.types.RispostaRiceviFattureType;
import jakarta.xml.bind.JAXBElement;


@Endpoint
public class RicezioneFattureEndpoint {
	
	public RicezioneFattureEndpoint() {
	}
	
    private static final String NAMESPACE_URI = "http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types";
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "fileSdIConMetadati")
    @ResponsePayload
    public JAXBElement<RispostaRiceviFattureType> riceviFatture(@RequestPayload JAXBElement<FileSdIConMetadatiType> fileSdIConMetadatiType) {
    	
    	System.out.println("RicezioneFattureEndpoint: notificaDecorrenzaTermini - value: " +  ((FileSdIConMetadatiType) fileSdIConMetadatiType.getValue()).getNomeFile()  );
    	RispostaRiceviFattureType response = new RispostaRiceviFattureType();
    	response.setEsito(EsitoRicezioneType.ER_01);
    	
    	ObjectFactory factory = new ObjectFactory ( );
    	
        return factory.createRispostaRiceviFatture(response);
    }
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "notificaDecorrenzaTermini")
    @ResponsePayload
    public void notificaDecorrenzaTermini(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	System.out.println("RicezioneFattureEndpoint: notificaDecorrenzaTermini");
    }

}
