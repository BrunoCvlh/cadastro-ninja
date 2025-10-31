package dev.java10x.cadastroNinja.Ninjas;

import org.springframework.web.bind.annotation.*;

@org.springframework.stereotype.Controller
@RestController("ninjas")
public class NinjaController {

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olá, este é o primeiro retorno da rota";
    };

    //Criar um ninja
    @PostMapping("/criar")
    public String criaNinja(){
        return "O ninja foi criado";
    }

    @GetMapping("/buscarID")
    public String buscaNinjaPorId(){
        return "Busca ninja por Id";
    }

    @GetMapping("/listar")
    public String listaNinjas(){
        return "Todos os ninjas cadastrados";
    }

    @PutMapping("/alterar")
    public String alteraNinjas(){
        return "Altera um ninja";
    }

    @DeleteMapping("/deletarID")
    public String apagaNinja(){
        return "Deleta um ninja";
    }
}
