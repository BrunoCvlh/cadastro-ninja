package dev.java10x.cadastroNinja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RestController
public class Controller {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olé, este é o primeiro retorno da rota";
    };

}
