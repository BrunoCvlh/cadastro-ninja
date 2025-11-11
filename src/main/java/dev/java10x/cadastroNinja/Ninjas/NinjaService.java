package dev.java10x.cadastroNinja.Ninjas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NinjaService {

    @Autowired
    private NinjaRepository ninjaRepository;
    @Autowired
    private NinjaMapper ninjaMapper;

    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll();
    }

    public NinjaModel listarNinjasPorId(Long id){
        Optional<NinjaModel> ninjaPorId = ninjaRepository.findById(id);
        return ninjaPorId.orElse(null);
    }

    public NinjaDTO criarNinja(NinjaDTO ninjaDTO){
        NinjaModel ninjaModel = ninjaMapper.map(ninjaDTO);
        NinjaModel savedNinjaModel = ninjaRepository.save(ninjaModel);

        return ninjaMapper.map(savedNinjaModel);
    }

    public void deletarNinjaPorId(Long id){
        ninjaRepository.deleteById(id);
    }


    public NinjaModel atualizarNinjaPorId(Long id, NinjaModel ninjaAtualizado){
        if (ninjaRepository.existsById(id)){
            ninjaAtualizado.setId(id);
            return ninjaRepository.save(ninjaAtualizado);
        }
        return null;
    }

}
