package com.fattureon.sdi.util.provider;

import java.util.Arrays;

import org.springframework.ws.wsdl.wsdl11.provider.SuffixBasedMessagesProvider;
import org.w3c.dom.Element;

public class CustomMessagesProvider extends SuffixBasedMessagesProvider {
    private static final String[] REQUEST_ELEMENTS = new String[] {"fileSdI_Type", "fileSdIConMetadati_Type"};

    protected String requestSuffix = DEFAULT_REQUEST_SUFFIX;

    @Override
	public String getRequestSuffix() {
		return this.requestSuffix;
    }
    
    @Override
    public void setRequestSuffix(String requestSuffix) {
    	this.requestSuffix = requestSuffix;
    }
    
    @Override
    protected boolean isMessageElement(Element element) {
        if (super.isMessageElement(element)) {
            return true;
        } else {
            boolean isElement = "element".equals(element.getLocalName()) &&
                    "http://www.w3.org/2001/XMLSchema".equals(element.getNamespaceURI());
            String elementName = getElementName(element);
            return isElement && Arrays.asList(REQUEST_ELEMENTS).contains(elementName);
        }
    }
}