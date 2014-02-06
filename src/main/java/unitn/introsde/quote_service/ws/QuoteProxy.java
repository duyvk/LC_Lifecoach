package unitn.introsde.quote_service.ws;

public class QuoteProxy implements unitn.introsde.quote_service.ws.Quote {
  private String _endpoint = null;
  private unitn.introsde.quote_service.ws.Quote quote = null;
  
  public QuoteProxy() {
    _initQuoteProxy();
  }
  
  public QuoteProxy(String endpoint) {
    _endpoint = endpoint;
    _initQuoteProxy();
  }
  
  private void _initQuoteProxy() {
    try {
      quote = (new unitn.introsde.quote_service.ws.QuoteServiceLocator()).getQuoteImplPort();
      if (quote != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)quote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)quote)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (quote != null)
      ((javax.xml.rpc.Stub)quote)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public unitn.introsde.quote_service.ws.Quote getQuote() {
    if (quote == null)
      _initQuoteProxy();
    return quote;
  }
  
  public java.lang.String getRandomQuote() throws java.rmi.RemoteException{
    if (quote == null)
      _initQuoteProxy();
    return quote.getRandomQuote();
  }
  
  
}