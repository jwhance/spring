//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2023.09.28 at 09:05:53 AM EDT 
//


package org.webservicesoap.birthday;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.webservicesoap.birthday package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.webservicesoap.birthday
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetBirthdayRequest }
     * 
     */
    public GetBirthdayRequest createGetBirthdayRequest() {
        return new GetBirthdayRequest();
    }

    /**
     * Create an instance of {@link GetAgeResponse }
     * 
     */
    public GetAgeResponse createGetAgeResponse() {
        return new GetAgeResponse();
    }

}
