package br.com.dragonMaker.controller;

import br.com.dragonMaker.dto.ContatoRequestDTO;
import br.com.dragonMaker.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/contato")
@CrossOrigin
public class ContatoController {

    @Autowired
    private ContatoService contatoService;

    @GetMapping
    public ResponseEntity listarTodos(){
        return ResponseEntity.ok(contatoService.listarTodos());
    }

    @PostMapping
    public void inserir(@RequestBody ContatoRequestDTO contatoRequestDTO){
        contatoService.inserir(contatoRequestDTO);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> exlcuir(@PathVariable("id") Long id){
        contatoService.excluir(id);
        return ResponseEntity.ok().build();

    }
}
