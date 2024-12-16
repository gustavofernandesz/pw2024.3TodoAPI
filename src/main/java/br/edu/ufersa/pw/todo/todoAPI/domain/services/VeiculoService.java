package main.java.br.edu.ufersa.pw.todo.todoAPI.domain.services;


import br.edu.ufersa.pw.todo.todoAPI.api.DTO.UsuarioCreateDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.UsuarioDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoCreateDTO;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoDTO;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Usuario;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;
import br.edu.ufersa.pw.todo.todoAPI.domain.repositories.UsuarioRepository;
import br.edu.ufersa.pw.todo.todoAPI.domain.repositories.VeiculoRepository;
import br.edu.ufersa.pw.todo.todoAPI.domain.services.UsuarioService;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {
    private final VeiculoRepository repo;
    public VeiculoService(VeiculoRepository repo){this.repo = repo;}
    public VeiculoDTO criar (VeiculoCreateDTO dto)
            throws DataIntegrityViolationException {
        Veiculo veiculo = repo.findByChassi(dto.getChassi());
        if (veiculo != null) throw new DataIntegrityViolationException(
                "Já existe um veículo cadastrado com este nome!");
        return new VeiculoDTO(repo.save(new Veiculo(dto)));
    }


//    private String nome;
//    private double preco;
//    private String numeroChassi;
//    private String anoModelo;
//    private int quilometragem;
//    private String cor;
//    private String motor;
//    private enum combustivel;
//    private String cambio;
//    private String caminhoImagem;
//
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public double getPreco() {
//        return preco;
//    }
//
//    public void setPreco(double preco) {
//        this.preco = preco;
//    }
//
//    public String getNumeroChassi() {
//        return numeroChassi;
//    }
//
//    public void setNumeroChassi(String numeroChassi) {
//        this.numeroChassi = numeroChassi;
//    }
//
//    public String getAnoModelo() {
//        return anoModelo;
//    }
//
//    public void setAnoModelo(String anoModelo) {
//        this.anoModelo = anoModelo;
//    }
//
//    public int getQuilometragem() {
//        return quilometragem;
//    }
//
//    public void setQuilometragem(int quilometragem) {
//        this.quilometragem = quilometragem;
//    }
//
//    public String getCor() {
//        return cor;
//    }
//
//    public void setCor(String cor) {
//        this.cor = cor;
//    }
//
//    public String getMotor() {
//        return motor;
//    }
//
//    public void setMotor(String motor) {
//        this.motor = motor;
//    }
//
//    public String getCambio() {
//        return cambio;
//    }
//
//    public void setCambio(String cambio) {
//        this.cambio = cambio;
//    }
//
//    public String getCaminhoImagem() {
//        return caminhoImagem;
//    }
//
//    public void setCaminhoImagem(String caminhoImagem) {
//        this.caminhoImagem = caminhoImagem;
//    }
}
