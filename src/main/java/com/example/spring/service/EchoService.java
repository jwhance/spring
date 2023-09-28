package com.example.spring.service;

import org.springframework.stereotype.Service;
import org.webservicesoap.echo.GetEchoRequest;
import org.webservicesoap.echo.GetEchoResponse;

@Service
public class EchoService {
    public GetEchoResponse age(GetEchoRequest request){
        GetEchoResponse getEchoResponse = new GetEchoResponse();

        if(validateRequest(request)) {
            getEchoResponse.setStringFromEcho(request.getStringToEcho());
        }

        return getEchoResponse;
    }

    public boolean validateRequest(GetEchoRequest request) {
        return request.getStringToEcho() != null;
    }
}
