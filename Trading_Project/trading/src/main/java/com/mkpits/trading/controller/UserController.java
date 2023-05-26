package com.mkpits.trading.controller;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UserController {

//    @RequestMapping(method = RequestMethod.GET,path = "/register")
//    public ResponseEntity<String>getUsers(){
//
//        return ResponseEntity.status(HttpStatus.OK).body("Hello;Pranali");
//
//    }

//    @GetMapping( path = "/register")
//    public ResponseEntity<String>getUsers(){
//
//        return ResponseEntity.status(HttpStatus.OK).body("Hello;Pranali");
//
//    }

//    @PutMapping(path = "/register")
//    public ResponseEntity<String>getUsers(){
//
//        return ResponseEntity.status(HttpStatus.OK).body("Hello;Pranali");
//
//    }

    @PostMapping(value = "/register")
    public ResponseEntity<String>getUsers(){

        return ResponseEntity.status(HttpStatus.OK).body("Hello;Pranali");

    }


}
