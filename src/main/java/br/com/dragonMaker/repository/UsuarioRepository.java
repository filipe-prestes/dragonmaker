package br.com.dragonMaker.repository;

import br.com.dragonMaker.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, String> {
    UserDetails findByLogin(String login);
}
