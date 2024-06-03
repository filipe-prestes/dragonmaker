package br.com.dragonMaker.entity;

import br.com.dragonMaker.dto.ContatoRequestDTO;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity(name="cliente")
@Table(name="cliente")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class ContatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String telefone;

    @Column(nullable = false)
    private String endereco;

    public ContatoEntity(ContatoRequestDTO data){
        this.nome = data.nome();
        this.telefone = data.telefone();
        this.endereco = data.endereco();
    }
}
