package br.com.dragonMaker.service;

import br.com.dragonMaker.dto.ContatoRequestDTO;
import br.com.dragonMaker.dto.ContatoResponseDTO;
import br.com.dragonMaker.entity.ContatoEntity;
import br.com.dragonMaker.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    private ContatoRepository contatoRepository;

    public List<ContatoResponseDTO>  listarTodos(){
        List<ContatoEntity> clientes = contatoRepository.findAll();
        return clientes.stream().map(ContatoResponseDTO::new).toList();
    }

    public void inserir(ContatoRequestDTO contatoRequestDTO){
        ContatoEntity contatoEntity = new ContatoEntity(contatoRequestDTO);
        contatoRepository.save(contatoEntity);
    }

    public void excluir(Long id){
        ContatoEntity contatoEntity = contatoRepository.findById(id).get();
        contatoRepository.delete(contatoEntity);

    }

    public ContatoResponseDTO buscarPorId(Long id){
        return new ContatoResponseDTO(contatoRepository.findById(id).get());
    }

}
