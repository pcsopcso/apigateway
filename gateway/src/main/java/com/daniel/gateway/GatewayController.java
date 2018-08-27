package com.daniel.gateway;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GatewayController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<String>("Welcome. GATEWAY SERVER.", HttpStatus.OK);
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public ResponseEntity<String> adminCreate(){
        // TODO : 새로운 ADMIN을 등록하는 내용을 추가한다
        return new ResponseEntity<String>("success.", HttpStatus.OK);
    }
}