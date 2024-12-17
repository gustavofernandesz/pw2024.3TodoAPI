package br.edu.ufersa.pw.todo.todoAPI.domain.services;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoCreateDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoDTO;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;
import br.edu.ufersa.pw.todo.todoAPI.domain.repositories.VeiculoRepository;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VeiculoService {

    private final VeiculoRepository veiculoRepository;

    public VeiculoService(VeiculoRepository veiculoRepository) {
        this.veiculoRepository = veiculoRepository;
    }

    // Método para obter todos os veículos
    public List<VeiculoDTO> getAllVeiculos() {
        List<Veiculo> veiculos = veiculoRepository.findAll();
        return veiculos.stream().map(VeiculoDTO::new).toList();
    }

    // Método para obter um veículo por ID
    public VeiculoDTO getVeiculoById(Long id) {
        Optional<Veiculo> veiculo = veiculoRepository.findById(id);
        return veiculo.map(VeiculoDTO::new).orElse(null);
    }

    // Método para adicionar um novo veículo
    public VeiculoDTO addVeiculo(VeiculoCreateDTO dto) throws DataIntegrityViolationException {
        Veiculo veiculoExistente = (Veiculo) veiculoRepository.findByChassi(dto.getChassi());
        if (veiculoExistente != null) {
            throw new DataIntegrityViolationException("Já existe um veículo cadastrado com este chassi!");
        }

        Veiculo novoVeiculo = new Veiculo();
        novoVeiculo.setMarca(dto.getMarca());
        novoVeiculo.setModelo(dto.getModelo());
        novoVeiculo.setAno(dto.getAno());
        novoVeiculo.setCor(dto.getCor());
        novoVeiculo.setPreco(dto.getPreco());
        novoVeiculo.setDescricao(dto.getDescricao());
        novoVeiculo.setChassi(dto.getChassi()); // Certifique-se de que o campo 'chassi' foi adicionado corretamente
        novoVeiculo.setStatus(dto.getStatus());

        Veiculo veiculoSalvo = veiculoRepository.save(novoVeiculo);
        return new VeiculoDTO(veiculoSalvo);
    }

    // Método para atualizar um veículo existente
    public VeiculoDTO updateVeiculo(Long id, VeiculoCreateDTO dto) {
        Optional<Veiculo> veiculoExistente = veiculoRepository.findById(id);
        if (veiculoExistente.isEmpty()) {
            return null; // Retorna null caso o veículo não seja encontrado
        }

        Veiculo veiculo = veiculoExistente.get();
        veiculo.setMarca(dto.getMarca());
        veiculo.setModelo(dto.getModelo());
        veiculo.setAno(dto.getAno());
        veiculo.setCor(dto.getCor());
        veiculo.setPreco(dto.getPreco());
        veiculo.setDescricao(dto.getDescricao());
        veiculo.setChassi(dto.getChassi()); // Atualizando o chassi
        veiculo.setStatus(dto.getStatus());

        Veiculo veiculoAtualizado = veiculoRepository.save(veiculo);
        return new VeiculoDTO(veiculoAtualizado);
    }

    // Método para excluir um veículo
    public boolean deleteVeiculo(Long id) {
        if (veiculoRepository.existsById(id)) {
            veiculoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
