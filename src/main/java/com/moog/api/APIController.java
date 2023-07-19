/*
 * Runs the API and listens on localhost:8080
 * 
 * Author: Spencer Kurtz
 */

package com.moog.api;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class APIController {
    private static final Logger LOG = Logger.getLogger(APIController.class.getName());

    /**
     * Creates a REST API controller to reponds to requests
     * 
     * This dependency is injected by the Spring Framework
     */
    public APIController() {
    }

    /**
     * Responds to the POST request for the given message
     * 
     * @param message The message to be decrypted
     * 
     * @return ResponseEntity with a String object and HTTP status of OK if decrypted
     * ResponseEntity with HTTP status of NOT_FOUND if failed
     * ResponseEntity with HTTP status of INTERNAL_SERVER_ERROR otherwise
     */
    @PostMapping("/")
    public ResponseEntity<String> request(@RequestParam String message) {
        try {     
            LOG.info(message);       
            return new ResponseEntity<String>(message, HttpStatus.OK);
            // return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        catch(Exception error) {
            LOG.log(Level.SEVERE, error.getLocalizedMessage());

            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
