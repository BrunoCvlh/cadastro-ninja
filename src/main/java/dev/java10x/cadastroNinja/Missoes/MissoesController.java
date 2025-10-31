package dev.java10x.cadastroNinja.Missoes;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("missoes")
public class MissoesController {

    @PostMapping("/criar")
    public String criarMissao(){
        return "Missão criada";
    }

    @GetMapping("/listar")
    public String listarMissoes(){
        return "Lista de Missoes";
    }

    @GetMapping("/buscarID")
    public String buscarMissaoPorId(){
        return "Mostra missao encontrada";
    }

    @PutMapping("/alterarID")
    public String alterarMissaoPorId(){
        return "Alterar missão por ID";
    }

    @DeleteMapping("/deletarID")
    public String deletarMissaoPorID(){
        return "Missão deletada por ID";
    }
}
