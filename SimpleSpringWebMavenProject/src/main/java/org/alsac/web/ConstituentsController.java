package org.alsac.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan
@EnableAutoConfiguration
@RestController
@RequestMapping("/constituents")
public class ConstituentsController {
	

    public static void main(String[] args) {
        SpringApplication.run(ConstituentsController.class, args);
    }
	

    @RequestMapping(method = RequestMethod.GET, value = "/{constituentId}", 
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<ConstituentResource> getConstituent(@PathVariable Long constituentId) {
    	ConstituentResource resource = new ConstituentResource();
    	
    	return new ResponseEntity<ConstituentResource>(resource, HttpStatus.OK);
    }


    @RequestMapping(method = RequestMethod.DELETE, value = "/{constituentId}", 
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<Void> deleteConstituent(@PathVariable Long constituentId) {

        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    
}
