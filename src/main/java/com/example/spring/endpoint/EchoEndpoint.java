package com.example.spring.endpoint;

import com.example.spring.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;
import org.webservicesoap.echo.GetEchoRequest;
import org.webservicesoap.echo.GetEchoResponse;

@Endpoint
public class EchoEndpoint {
    private static final String NAMESPACE = "http://www.webservicesoap.org/echo";

    @Autowired
    private EchoService service;

    @PayloadRoot(localPart = "getEchoRequest", namespace = NAMESPACE)
    @ResponsePayload
    public GetEchoResponse getEchoRequest(@RequestPayload GetEchoRequest request) {
        return service.age(request);
    }
}
