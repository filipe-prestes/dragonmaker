package br.com.dragonMaker.dto;

import br.com.dragonMaker.entity.ContatoEntity;

public record ContatoResponseDTO(Long id, String nome, String telefone, String endereco) {
    public ContatoResponseDTO(ContatoEntity contatoEntity){
        this(contatoEntity.getId(), contatoEntity.getNome(), contatoEntity.getTelefone(), contatoEntity.getEndereco());
    }
}
