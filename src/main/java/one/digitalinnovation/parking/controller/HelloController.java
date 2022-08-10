package one.digitalinnovation.parking.controller;

import io.swagger.v3.oas.annotations.Hidden;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Hidden
public class HelloController {

    @GetMapping(name = "/")
    public String Hello(){
        return "hola mundo! ahora   ";
    }
}
