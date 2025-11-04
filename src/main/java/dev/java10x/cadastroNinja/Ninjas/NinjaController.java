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
    public String criaNinja(){
        return "O ninja foi criado";
    }

    @GetMapping("/listar/{id}")
    public NinjaModel listarNinjaPorId(@PathVariable Long id){
        return ninjaService.listarNinjasPorId(id);
    }

    @GetMapping("/listar")
    public List<NinjaModel> listaNinjas(){
        return ninjaService.listarNinjas();
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
