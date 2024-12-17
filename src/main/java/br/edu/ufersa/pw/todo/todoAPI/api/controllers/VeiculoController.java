package br.edu.ufersa.pw.todo.todoAPI.api.controllers;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoCreateDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoDTO;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;
import br.edu.ufersa.pw.todo.todoAPI.domain.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @GetMapping
    public List<VeiculoDTO> getAllVeiculos() {
        return veiculoService.getAllVeiculos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<VeiculoDTO> getVeiculoById(@PathVariable Long id) {
        VeiculoDTO veiculoDTO = veiculoService.getVeiculoById(id);
        return veiculoDTO != null ? ResponseEntity.ok(veiculoDTO) : ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<VeiculoDTO> addVeiculo(@RequestBody VeiculoCreateDTO veiculoCreateDTO) {
        VeiculoDTO veiculoDTO = veiculoService.addVeiculo(veiculoCreateDTO);
        return ResponseEntity.status(201).body(veiculoDTO);
    }

    @PutMapping("/{id}")
    public ResponseEntity<VeiculoDTO> updateVeiculo(@PathVariable Long id, @RequestBody VeiculoCreateDTO veiculoCreateDTO) {
        VeiculoDTO veiculoDTO = veiculoService.updateVeiculo(id, veiculoCreateDTO);
        return veiculoDTO != null ? ResponseEntity.ok(veiculoDTO) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteVeiculo(@PathVariable Long id) {
        boolean isDeleted = veiculoService.deleteVeiculo(id);
        return isDeleted ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}
