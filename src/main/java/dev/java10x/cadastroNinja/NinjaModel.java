package dev.java10x.cadastroNinja;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.batch.BatchTaskExecutor;

@Entity
@Table(name = "tb_cadastro_ninja")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nome;
    String email;
    int idade;

    public NinjaModel() {

    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
