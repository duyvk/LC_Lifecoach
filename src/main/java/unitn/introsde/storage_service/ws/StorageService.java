/**
 * StorageService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.storage_service.ws;

public interface StorageService extends javax.xml.rpc.Service {
    public java.lang.String getStorageImplPortAddress();

    public unitn.introsde.storage_service.ws.Storage getStorageImplPort() throws javax.xml.rpc.ServiceException;

    public unitn.introsde.storage_service.ws.Storage getStorageImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
