package de.hsaa.springbasicauthbackend.controller;

import de.hsaa.springbasicauthbackend.model.UserEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
@RestController
@RequestMapping("/public/v1")
public class AuthenticationController {

    @GetMapping(path = "/basicauth")
    public ResponseEntity<UserEntity> login(Principal principle) {

        String name = principle.getName();
        System.out.println(name);
        return new ResponseEntity<UserEntity>(
                new UserEntity(),
                HttpStatus.OK
        );
    }
}
