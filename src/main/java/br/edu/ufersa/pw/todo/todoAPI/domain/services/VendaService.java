package br.edu.ufersa.pw.todo.todoAPI.domain.services;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VendaCreateDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VendaDTO;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Venda;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Usuario;
import br.edu.ufersa.pw.todo.todoAPI.domain.repositories.VendaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VendaService {
    private final VendaRepository repository;
    public VendaService(final VendaRepository repository){
        this.repository = repository;
    }

    public List<VendaDTO> buscarTodos(){
        List<VendaDTO> result = repository.findAll()
                .stream().map(todo -> new VendaDTO(todo))
                .collect(Collectors.toList());
        return result;
    }
    public List<VendaDTO> buscarPorUsuario(long id){
        List<VendaDTO> result = repository.findByUsuario(new Usuario(id))
                .stream()
                .map(todo -> new VendaDTO(todo))
                .collect(Collectors.toList());
        return result;
    }
    public VendaDTO criar (VendaCreateDTO todo){
        return new VendaDTO(repository.save(new Venda(todo)));
    }
}
