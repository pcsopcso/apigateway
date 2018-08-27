package com.daniel.admin;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
@Slf4j
public class AdminController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<String> welcome(){
        return new ResponseEntity<String>("Welcome. ADMIN SERVER", HttpStatus.OK);
    }
    
    @RequestMapping(value = "/time", method = RequestMethod.POST)
    public ResponseEntity<LocalDateTime> getTime(){
        return new ResponseEntity<LocalDateTime>(LocalDateTime.now(), HttpStatus.OK);
    }
}
