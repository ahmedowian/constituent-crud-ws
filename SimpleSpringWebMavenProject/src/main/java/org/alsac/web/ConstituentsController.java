package org.alsac.web;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/constituents")
public class ConstituentsController {
	

    @RequestMapping(method = RequestMethod.GET, value = "/{constituentId}", 
    		produces = { MediaType.APPLICATION_JSON_VALUE })
    ResponseEntity<ConstituentResource> getConstituent(@PathVariable Long constituentId) {
    	ConstituentResource resource = new ConstituentResource();
    	return new ResponseEntity<ConstituentResource>(resource, HttpStatus.OK);
    }


}
