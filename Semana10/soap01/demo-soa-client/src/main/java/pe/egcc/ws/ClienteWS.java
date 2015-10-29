
package pe.egcc.ws;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ClienteWS", targetNamespace = "http://ws.egcc.pe/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ClienteWS {


    /**
     * 
     * @return
     *     returns java.util.List<pe.egcc.ws.ClienteBean>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listaClientes", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.ws.ListaClientes")
    @ResponseWrapper(localName = "listaClientesResponse", targetNamespace = "http://ws.egcc.pe/", className = "pe.egcc.ws.ListaClientesResponse")
    @Action(input = "http://ws.egcc.pe/ClienteWS/listaClientesRequest", output = "http://ws.egcc.pe/ClienteWS/listaClientesResponse")
    public List<ClienteBean> listaClientes();

}
