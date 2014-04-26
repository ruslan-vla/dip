package bstu.dplm.webservice;

import edu.schema.bstu.dplm.servicetypes.v1.PingRequestType;
import edu.schema.bstu.dplm.servicetypes.v1.PingResponseType;
import edu.wsdl.bstu.dplm.serviceinterface.v1.ServiceInterface;

import javax.jws.WebParam;

public class WebService implements ServiceInterface
{
    @Override
    public PingResponseType ping(
            @WebParam(partName = "request", name = "pingRequest", targetNamespace = "http://edu/schema/bstu/dplm/servicetypes/v1") PingRequestType request)
    {
        System.out.println("\n\t\tWeb service has been called\n");
        PingResponseType resp = new PingResponseType();
        resp.setData("Hello world");
        return resp;
    }
}
