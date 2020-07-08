import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;

import java.net.MalformedURLException;
import java.net.URL;

public class MainHello {

    public static void main(String [] args) throws MalformedURLException {
        var wsdl = new URL("http://as-dev2.taximaxim.local:8101/services_dev1/MBroker.svc?wsdl");
        DynamicClientFactory.newInstance().createClient(wsdl);
    }
}
