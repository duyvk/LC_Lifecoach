/**
 * StorageServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public class StorageServiceLocator extends org.apache.axis.client.Service implements unitn.introsde.storage_service.ws.StorageService {

    public StorageServiceLocator() {
    }


    public StorageServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public StorageServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for StorageImplPort
    private java.lang.String StorageImplPort_address = "http://localhost:5900/ws/storage";

    public java.lang.String getStorageImplPortAddress() {
        return StorageImplPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String StorageImplPortWSDDServiceName = "StorageImplPort";

    public java.lang.String getStorageImplPortWSDDServiceName() {
        return StorageImplPortWSDDServiceName;
    }

    public void setStorageImplPortWSDDServiceName(java.lang.String name) {
        StorageImplPortWSDDServiceName = name;
    }

    public unitn.introsde.storage_service.ws.Storage getStorageImplPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(StorageImplPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getStorageImplPort(endpoint);
    }

    public unitn.introsde.storage_service.ws.Storage getStorageImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            unitn.introsde.storage_service.ws.StorageImplPortBindingStub _stub = new unitn.introsde.storage_service.ws.StorageImplPortBindingStub(portAddress, this);
            _stub.setPortName(getStorageImplPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setStorageImplPortEndpointAddress(java.lang.String address) {
        StorageImplPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (unitn.introsde.storage_service.ws.Storage.class.isAssignableFrom(serviceEndpointInterface)) {
                unitn.introsde.storage_service.ws.StorageImplPortBindingStub _stub = new unitn.introsde.storage_service.ws.StorageImplPortBindingStub(new java.net.URL(StorageImplPort_address), this);
                _stub.setPortName(getStorageImplPortWSDDServiceName());
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
        if ("StorageImplPort".equals(inputPortName)) {
            return getStorageImplPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "StorageService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://ws.storage_service.introsde.unitn/", "StorageImplPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("StorageImplPort".equals(portName)) {
            setStorageImplPortEndpointAddress(address);
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
