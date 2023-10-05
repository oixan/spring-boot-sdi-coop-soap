package com.fattureon.sdi.config;

import java.util.Collections;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import com.fattureon.sdi.client.trasmissione.RiceviFileClient;

import it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types.RispostaSdIRiceviFileType;

@Configuration
public class TrasmissioneFileMarshaller{
	
	@Bean
	public Jaxb2Marshaller riceviFilemarshaller() {
	    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
	    // this package must match the package in the <generatePackage> specified in
	    // pom.xml
	    marshaller.setCheckForXmlRootElement(false);
	    marshaller.setContextPath("it.gov.fatturapa.sdi.ws.trasmissione.v1_0.types");
	    return marshaller;
	}

	@Bean
    public RiceviFileClient riceviFileClient(Jaxb2Marshaller riceviFilemarshaller) {
		RiceviFileClient client = new RiceviFileClient();
        client.setDefaultUri("https://testservizi.fatturapa.it/ricevi_file");
        client.setMarshaller(riceviFilemarshaller);
        client.setUnmarshaller(riceviFilemarshaller);
        return client;
    }
}
