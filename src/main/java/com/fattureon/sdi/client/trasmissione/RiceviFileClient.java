package com.fattureon.sdi.client.trasmissione;

import javax.xml.namespace.QName;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types.FileSdIBaseType;
import it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types.RispostaSdIRiceviFileType;
import jakarta.xml.bind.JAXBElement;

public class RiceviFileClient extends WebServiceGatewaySupport {

    public RispostaSdIRiceviFileType riceviFile(String nomeFile) {
    	   	
    	FileSdIBaseType file = new FileSdIBaseType();
    	file.setNomeFile("asd");
    	file.setFile(null);
    	
    	JAXBElement<FileSdIBaseType>  requestJAX =  new JAXBElement<FileSdIBaseType>(new QName("", "fileSdIBaseType"), FileSdIBaseType.class, null, file);	

        RispostaSdIRiceviFileType response =  (RispostaSdIRiceviFileType)  getWebServiceTemplate().marshalSendAndReceive(requestJAX);
        return response;
    }
}