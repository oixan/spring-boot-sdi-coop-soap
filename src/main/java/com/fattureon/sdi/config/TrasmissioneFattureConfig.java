package com.fattureon.sdi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.ws.config.annotation.EnableWs;
import org.springframework.ws.config.annotation.WsConfigurerAdapter;
import org.springframework.ws.wsdl.wsdl11.ProviderBasedWsdl4jDefinition;
import org.springframework.ws.wsdl.wsdl11.provider.InliningXsdSchemaTypesProvider;
import org.springframework.ws.wsdl.wsdl11.provider.SoapProvider;
import org.springframework.xml.xsd.SimpleXsdSchema;
import org.springframework.xml.xsd.XsdSchema;

import com.fattureon.sdi.util.provider.CustomMessagesProvider;
import com.fattureon.sdi.util.provider.CustomPortTypesProvider;

@EnableWs
@Configuration
public class TrasmissioneFattureConfig extends WsConfigurerAdapter {
	

	@Bean(name = "trasmissioneFatture")
	public ProviderBasedWsdl4jDefinition  trasmissioneFattureDefaultWsdl11Definition(XsdSchema trasmissioneFattureSchema) {
		
		
		var wsdl4jDefinition = new ProviderBasedWsdl4jDefinition();
	    wsdl4jDefinition.setTargetNamespace("http://www.fatturapa.gov.it/sdi/ws/trasmissione/v1.0/types");

	    var suffixBasedPortTypesProvider = new CustomPortTypesProvider();
	    suffixBasedPortTypesProvider.setPortTypeName("TrasmissioneFatture");
	    suffixBasedPortTypesProvider.setRequestSuffix("");
	    wsdl4jDefinition.setPortTypesProvider(suffixBasedPortTypesProvider);

	    var inliningXsdSchemaTypesProvider = new InliningXsdSchemaTypesProvider();
	    inliningXsdSchemaTypesProvider.setSchema(trasmissioneFattureSchema);
	    wsdl4jDefinition.setTypesProvider(inliningXsdSchemaTypesProvider);

	    var customMessageProvider = new CustomMessagesProvider();
	    customMessageProvider.setRequestSuffix("");
	    
	    wsdl4jDefinition.setMessagesProvider(customMessageProvider);

	    var soapProvider = new SoapProvider();
	    soapProvider.setLocationUri("/ws");
	    soapProvider.setServiceName("trasmissioneFatture");
	    wsdl4jDefinition.setBindingsProvider(soapProvider);
	    wsdl4jDefinition.setServicesProvider(soapProvider);

	    return wsdl4jDefinition;
	}
	
	@Bean
	public XsdSchema trasmissioneFattureSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/TrasmissioneTypes_v1.1.xsd"));
	}
}
