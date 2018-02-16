package com.example.demo.wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.2.2
 * 2018-02-16T15:17:45.640-06:00
 * Generated source version: 3.2.2
 *
 */
@WebService(targetNamespace = "http://spring.io/guides/gs-producing-web-service", name = "CountriesPort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface CountriesPort {

    @WebMethod
    @WebResult(name = "getCountryResponse", targetNamespace = "http://spring.io/guides/gs-producing-web-service", partName = "getCountryResponse")
    public GetCountryResponse getCountry(
        @WebParam(partName = "getCountryRequest", name = "getCountryRequest", targetNamespace = "http://spring.io/guides/gs-producing-web-service")
        GetCountryRequest getCountryRequest
    );
}