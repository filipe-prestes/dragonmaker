package br.com.dragonMaker.dto;

import br.com.dragonMaker.role.UsuarioRole;

public record RegistroUsuarioDTO(String login, String password, UsuarioRole role) {}
