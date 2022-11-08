package de.hsaa.springbasicauthbackend.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/public/v1")
public class AuthenticationController {
//
//    @GetMapping(path = "/basicauth")
//    public ResponseEntity<User> login(Authentication authentication) {
//
//        User user = new User();
//        return new ResponseEntity<User>(user, HttpStatus.OK);
//    }
}
