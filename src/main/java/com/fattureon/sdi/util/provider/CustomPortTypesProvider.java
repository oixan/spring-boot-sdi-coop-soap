package com.fattureon.sdi.util.provider;

import javax.wsdl.Message;

import org.springframework.ws.wsdl.wsdl11.provider.SuffixBasedPortTypesProvider;

public class CustomPortTypesProvider extends SuffixBasedPortTypesProvider {
    private String requestSuffix = DEFAULT_REQUEST_SUFFIX;

    @Override
	public String getRequestSuffix() {
		return this.requestSuffix;
    }
    
	@Override
	public void setRequestSuffix(String requestSuffix) {
		this.requestSuffix = requestSuffix;
    }
	
    @Override
    protected String getOperationName(Message message) {
        String messageName = message.getQName().getLocalPart();
        if (isInputMessage(message)) {
            return messageName;
        } else if (isOutputMessage(message)) {
            return messageName.substring(0, messageName.length() - getResponseSuffix().length());
        } else if (isFaultMessage(message)) {
            return messageName.substring(0, messageName.length() - getFaultSuffix().length());
        }
        return null;
    }

    @Override
    protected boolean isInputMessage(Message message) {
        String messageName = message.getQName().getLocalPart();
        return !messageName.endsWith(getResponseSuffix()) && !messageName.endsWith(getFaultSuffix());
    }
}
