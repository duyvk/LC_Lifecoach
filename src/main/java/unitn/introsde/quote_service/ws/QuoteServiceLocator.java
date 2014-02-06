/**
 * QuoteServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.quote_service.ws;

public class QuoteServiceLocator extends org.apache.axis.client.Service implements unitn.introsde.quote_service.ws.QuoteService {

    public QuoteServiceLocator() {
    }


    public QuoteServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public QuoteServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for QuoteImplPort
    private java.lang.String QuoteImplPort_address = "http://localhost:5903/ws/quote";

    public java.lang.String getQuoteImplPortAddress() {
        return QuoteImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String QuoteImplPortWSDDServiceName = "QuoteImplPort";

    public java.lang.String getQuoteImplPortWSDDServiceName() {
        return QuoteImplPortWSDDServiceName;
    }

    public void setQuoteImplPortWSDDServiceName(java.lang.String name) {
        QuoteImplPortWSDDServiceName = name;
    }

    public unitn.introsde.quote_service.ws.Quote getQuoteImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(QuoteImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getQuoteImplPort(endpoint);
    }

    public unitn.introsde.quote_service.ws.Quote getQuoteImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            unitn.introsde.quote_service.ws.QuoteImplPortBindingStub _stub = new unitn.introsde.quote_service.ws.QuoteImplPortBindingStub(portAddress, this);
            _stub.setPortName(getQuoteImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setQuoteImplPortEndpointAddress(java.lang.String address) {
        QuoteImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (unitn.introsde.quote_service.ws.Quote.class.isAssignableFrom(serviceEndpointInterface)) {
                unitn.introsde.quote_service.ws.QuoteImplPortBindingStub _stub = new unitn.introsde.quote_service.ws.QuoteImplPortBindingStub(new java.net.URL(QuoteImplPort_address), this);
                _stub.setPortName(getQuoteImplPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("QuoteImplPort".equals(inputPortName)) {
            return getQuoteImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.quote_service.introsde.unitn/", "QuoteService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.quote_service.introsde.unitn/", "QuoteImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("QuoteImplPort".equals(portName)) {
            setQuoteImplPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
