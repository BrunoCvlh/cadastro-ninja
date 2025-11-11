package dev.java10x.cadastroNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.oauth2.client.ConditionalOnOAuth2ClientRegistrationProperties;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ninjas")
public class NinjaController {

    @Autowired
    private NinjaService ninjaService;

    @GetMapping("/boasvindas")
    public String boasVindas(){
        return "Olá, este é o primeiro retorno da rota";
    };

    @PostMapping("/criar")
    public NinjaDTO criarNinja(@RequestBody NinjaDTO ninja){
        return ninjaService.criarNinja(ninja);
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    @GetMapping("/listar")
    public List<NinjaModel> listaNinjas(){
        return ninjaService.listarNinjas();
    }

    @PutMapping("/atualizar/{id}")
    public NinjaModel alteraNinjaPorId(@PathVariable Long id, @RequestBody NinjaModel ninjaAtualizado){
        return ninjaService.atualizarNinjaPorId(id, ninjaAtualizado);
    }

    @DeleteMapping("/deletar/{id}")
    public void deletarNinjaPorId(@PathVariable Long id){
        ninjaService.deletarNinjaPorId(id);
    }
}
