
package com.hascode.schema;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * Hello World service
 * 
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.3.2
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloWorld_Service", targetNamespace = "http://codenotfound.com/services/helloworld", wsdlLocation = "file:/C:/Users/samee/Downloads/03-02-2020/03-02-2020/wsdltest/src/wsdl/sample.wsdl")
public class HelloWorldService
    extends Service
{

    private final static URL HELLOWORLDSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOWORLDSERVICE_EXCEPTION;
    private final static QName HELLOWORLDSERVICE_QNAME = new QName("http://codenotfound.com/services/helloworld", "HelloWorld_Service");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/samee/Downloads/03-02-2020/03-02-2020/wsdltest/src/wsdl/sample.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOWORLDSERVICE_WSDL_LOCATION = url;
        HELLOWORLDSERVICE_EXCEPTION = e;
    }

    public HelloWorldService() {
        super(__getWsdlLocation(), HELLOWORLDSERVICE_QNAME);
    }

    public HelloWorldService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOWORLDSERVICE_QNAME, features);
    }

    public HelloWorldService(URL wsdlLocation) {
        super(wsdlLocation, HELLOWORLDSERVICE_QNAME);
    }

    public HelloWorldService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOWORLDSERVICE_QNAME, features);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloWorldService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns HelloWorldPortType
     */
    @WebEndpoint(name = "HelloWorld_Port")
    public HelloWorldPortType getHelloWorldPort() {
        return super.getPort(new QName("http://codenotfound.com/services/helloworld", "HelloWorld_Port"), HelloWorldPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HelloWorldPortType
     */
    @WebEndpoint(name = "HelloWorld_Port")
    public HelloWorldPortType getHelloWorldPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://codenotfound.com/services/helloworld", "HelloWorld_Port"), HelloWorldPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOWORLDSERVICE_EXCEPTION!= null) {
            throw HELLOWORLDSERVICE_EXCEPTION;
        }
        return HELLOWORLDSERVICE_WSDL_LOCATION;
    }

}
