package com.fattureon.sdi.endpoint;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types.FileSdIType;
import jakarta.xml.bind.JAXBElement;


@Endpoint
public class TrasmissioneFattureEndpoint {
	
	public TrasmissioneFattureEndpoint() {
	}
	
    private static final String NAMESPACE_URI = "http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types";
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ricevutaConsegna")
    @ResponsePayload
    public void ricevutaConsegna(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	
    	System.out.println( "TrasmissioneFattureEndpoint: ricevutaConsegna - value: " +  ((FileSdIType) fileSdIType.getValue()).getNomeFile() );
    }
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "notificaMancataConsegna")
    @ResponsePayload
    public void notificaMancataConsegna(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	
    	System.out.println( "TrasmissioneFattureEndpoint: notificaMancataConsegna - value: " +  ((FileSdIType) fileSdIType.getValue()).getNomeFile() );
    }
    

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "notificaScarto")
    @ResponsePayload
    public void notificaScarto(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	
    	System.out.println( "TrasmissioneFattureEndpoint: notificaScarto - value: " +  ((FileSdIType) fileSdIType.getValue()).getNomeFile() );
    }
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "notificaEsito")
    @ResponsePayload
    public void notificaEsito(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	
    	System.out.println( "TrasmissioneFattureEndpoint: notificaEsito - value: " +  ((FileSdIType) fileSdIType.getValue()).getNomeFile() );
    }
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "notificaDecorrenzaTermini")
    @ResponsePayload
    public void notificaDecorrenzaTermini(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	
    	System.out.println( "TrasmissioneFattureEndpoint: notificaDecorrenzaTermini - value: " +  ((FileSdIType) fileSdIType.getValue()).getNomeFile() );
    }
    
    
    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "attestazioneTrasmissioneFattura")
    @ResponsePayload
    public void attestazioneTrasmissioneFattura(@RequestPayload JAXBElement<FileSdIType> fileSdIType) {
    	
    	System.out.println( "TrasmissioneFattureEndpoint: attestazioneTrasmissioneFattura - value: " +  ((FileSdIType) fileSdIType.getValue()).getNomeFile() );
    }
}
