package br.com.dragonMaker.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ContatoRequestDTO(
        @NotBlank
        String nome,

        @NotNull
        String telefone,

         @NotNull
         String endereco
) {
}