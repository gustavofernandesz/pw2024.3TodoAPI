package br.edu.ufersa.pw.todo.todoAPI.api.controllers;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VendaCreateDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VendaDTO;
import br.edu.ufersa.pw.todo.todoAPI.domain.services.VendaService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/todos")
public class VendaController {
    @Autowired
    private ModelMapper mapper;
    private final VendaService service;
    public VendaController(VendaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<?> listar(){
       ResponseEntity<List<VendaDTO>> response = new
               ResponseEntity<List<VendaDTO>>(service.buscarTodos(), HttpStatus.OK);
        return response;
    }
   /* public ResponseEntity<?> listar(){
        List<Todo> l = repository.findAll();
        List<TodoDTO> lreturn = l.stream().map(todo-> new TodoDTO(todo))
                                .collect(Collectors.toList());
        ResponseEntity<List<TodoDTO>> response = new
                ResponseEntity<List<TodoDTO>>(lreturn, HttpStatus.OK);
        return response;
    }*/
    @GetMapping("/{userId}")
    public ResponseEntity<?> listarPorUsuario(@PathVariable long userId){
        ResponseEntity<List<VendaDTO>> response =
                new ResponseEntity<List<VendaDTO>>(service.buscarPorUsuario(userId),
                        HttpStatus.OK);
        return response;
    }

    @PostMapping
    public ResponseEntity<VendaDTO> criar(@RequestBody VendaCreateDTO todo){
        System.out.println("Chegou aqui : " + todo.getIdUsu());
        ResponseEntity<VendaDTO> response = new ResponseEntity<VendaDTO>(
                service.criar(todo), HttpStatus.OK);
        return response;
    }

    @DeleteMapping("/todos/{todoId}")
    public ResponseEntity<VendaDTO> RemoverUsuario(@PathVariable Long todoId){return null;}

    @PutMapping("/todos")
    public ResponseEntity<VendaCreateDTO> alterar (@RequestBody VendaCreateDTO todo){return null;}

    @PatchMapping("/todos")
    public ResponseEntity<VendaCreateDTO> concluir (){return null;}
}
