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
public class RicezioneFattureConfig extends WsConfigurerAdapter {
	
//	@Bean(name = "ricezioneFatture")
//	public DefaultWsdl11Definition ricezioneFattureDefaultWsdl11Definition(XsdSchema ricezioneFattureSchema) {
//		DefaultWsdl11Definition wsdl11Definition = new DefaultWsdl11Definition();
//		wsdl11Definition.setPortTypeName("RicezioneFatture");
//		wsdl11Definition.setLocationUri("/ws");
//		wsdl11Definition.setRequestSuffix("/ws");
//		wsdl11Definition.setTargetNamespace("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types");
//		wsdl11Definition.setSchema(ricezioneFattureSchema);
//		return wsdl11Definition;
//	}
	
	
	@Bean(name = "ricezioneFatture")
	public ProviderBasedWsdl4jDefinition  ricezioneFattureDefaultWsdl11Definition(XsdSchema ricezioneFattureSchema) {
		
		
		var wsdl4jDefinition = new ProviderBasedWsdl4jDefinition();
	    wsdl4jDefinition.setTargetNamespace("http://www.fatturapa.gov.it/sdi/ws/ricezione/v1.0/types");

	    var suffixBasedPortTypesProvider = new CustomPortTypesProvider();
	    suffixBasedPortTypesProvider.setPortTypeName("RicezioneFatture");
	    suffixBasedPortTypesProvider.setRequestSuffix("");
	    wsdl4jDefinition.setPortTypesProvider(suffixBasedPortTypesProvider);

	    var inliningXsdSchemaTypesProvider = new InliningXsdSchemaTypesProvider();
	    inliningXsdSchemaTypesProvider.setSchema(ricezioneFattureSchema);
	    wsdl4jDefinition.setTypesProvider(inliningXsdSchemaTypesProvider);

	    var customMessageProvider = new CustomMessagesProvider();
	    customMessageProvider.setRequestSuffix("");
	    
	    wsdl4jDefinition.setMessagesProvider(customMessageProvider);

	    var soapProvider = new SoapProvider();
	    soapProvider.setLocationUri("/ws");
	    soapProvider.setServiceName("ricezioneFatture");
	    wsdl4jDefinition.setBindingsProvider(soapProvider);
	    wsdl4jDefinition.setServicesProvider(soapProvider);

	    return wsdl4jDefinition;
	}
	
	@Bean
	public XsdSchema ricezioneFattureSchema() {
		return new SimpleXsdSchema(new ClassPathResource("xsd/RicezioneTypes_v1.0.xsd"));
	}
}
