package com.example.exam;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
public class Controller {

  @GetMapping("/")
  @ResponseStatus(HttpStatus.OK)
  public ResponseEntity<String> hello(){
    System.out.println("Hello World!");
    return new ResponseEntity<>("Hello world!", HttpStatus.OK);
  }

}
