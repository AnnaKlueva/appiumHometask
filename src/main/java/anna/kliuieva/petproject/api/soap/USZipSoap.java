
package anna.kliuieva.petproject.api.soap;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 */
@WebService(name = "USZipSoap", targetNamespace = "http://www.webserviceX.NET")
@XmlSeeAlso({
        ObjectFactory.class
})
public interface USZipSoap {

    /**
     * Get State Code,City,Area Code,Time Zone,Zip Code by City
     *
     * @param usCity
     * @return returns wsclient.GetInfoByCityResponse.GetInfoByCityResult
     */
    @WebMethod(operationName = "GetInfoByCity", action = "http://www.webserviceX.NET/GetInfoByCity")
    @WebResult(name = "GetInfoByCityResult", targetNamespace = "http://www.webserviceX.NET")
    @RequestWrapper(localName = "GetInfoByCity", targetNamespace = "http://www.webserviceX.NET", className = "wsclient.GetInfoByCity")
    @ResponseWrapper(localName = "GetInfoByCityResponse", targetNamespace = "http://www.webserviceX.NET", className = "wsclient.GetInfoByCityResponse")
    GetInfoByCityResponse.GetInfoByCityResult getInfoByCity(
            @WebParam(name = "USCity", targetNamespace = "http://www.webserviceX.NET")
                    String usCity);
}