package dev.java10x.cadastroNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    };

}
