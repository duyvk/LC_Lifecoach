/**
 * QuoteService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package unitn.introsde.quote_service.ws;

public interface QuoteService extends javax.xml.rpc.Service {
    public java.lang.String getQuoteImplPortAddress();

    public unitn.introsde.quote_service.ws.Quote getQuoteImplPort() throws javax.xml.rpc.ServiceException;

    public unitn.introsde.quote_service.ws.Quote getQuoteImplPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
