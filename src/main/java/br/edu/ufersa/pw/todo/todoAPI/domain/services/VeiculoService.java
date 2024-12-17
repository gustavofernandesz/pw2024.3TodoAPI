package br.edu.ufersa.pw.todo.todoAPI.domain.services;


import br.edu.ufersa.pw.todo.todoAPI.api.DTO.*;
import br.edu.ufersa.pw.todo.todoAPI.domain.repositories.VeiculoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class VeiculoService {
    private final VeiculoRepository repo;


    public VeiculoService(final VeiculoRepository repo){this.repo = repo;}

    public List<VeiculoDTO> buscarTodos(){
        List<VeiculoDTO> result = repo.findAll()
                .stream().map(veiculo -> new VeiculoDTO(veiculo))
                .collect(Collectors.toList());
        return result;
    }
    public VeiculoDTO criar (VeiculoCreateDTO veiculo){
        return new VeiculoDTO();
    }
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

