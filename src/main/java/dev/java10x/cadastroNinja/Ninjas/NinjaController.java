package dev.java10x.cadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RestController
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olá, este é o primeiro retorno da rota";
    };

    //Criar um ninja
    @PostMapping("/criar-ninja")
    public String criaNinja(){
        return "O ninja foi criado";
    }

    @GetMapping("/buscar-id")
    public String buscaPorId(){
        return "Busca ninja por Id";
    }

    @GetMapping("/buscar")
    public String buscaNinjas(){
        return "Busca ninja";
    }

    @GetMapping("/todos")
    public String mostraNinjas(){
        return "Todos os ninjas cadastrados";
    }

    @PutMapping("/alterar")
    public String alteraNinjas(){
        return "Altera um ninja";
    }

    @DeleteMapping("/apagar-id")
    public String apagaNinja(){
        return "Apaga um ninja";
    }
}
