package br.edu.ufersa.pw.todo.todoAPI.api.controllers;


import br.edu.ufersa.pw.todo.todoAPI.api.DTO.*;
import br.edu.ufersa.pw.todo.todoAPI.domain.services.UsuarioService;
import br.edu.ufersa.pw.todo.todoAPI.domain.services.VeiculoService;
import br.edu.ufersa.pw.todo.todoAPI.domain.services.VendaService;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/veiculos")
public class VeiculoController {
    public final VeiculoService service;
    public VeiculoController(VeiculoService service) {
        this.service = service;
    }
    @PostMapping
    public ResponseEntity<VeiculoDTO> criar(@Valid @RequestBody VeiculoCreateDTO dto){
        return new ResponseEntity<VeiculoDTO>(service.criar(dto), HttpStatus.OK);
    }
}


