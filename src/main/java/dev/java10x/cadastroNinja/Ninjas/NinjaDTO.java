package dev.java10x.cadastroNinja.Ninjas;

import dev.java10x.cadastroNinja.Missoes.MissoesModel;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NinjaDTO {

    private Long id;
    private String nome;
    private String email;
    private String imgUrl;
    private String rank;
    private int idade;
    private MissoesModel missoes;
}
