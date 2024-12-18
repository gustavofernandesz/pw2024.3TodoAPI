package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;

public class VeiculoDTO {
    //classe veículo DTO

    private String nome;
    private double preco;
    private long chassi;
    private String anoModelo;
    private int quilometragem;
    private String cor;
    private String motor;
    private Combustivel combustivel;
    private String cambio;
    private String caminhoImagem;

    public VeiculoDTO(Veiculo veiculo) {
        this.nome = nome;
        this.preco = preco;
        this.chassi = chassi;
        this.anoModelo = anoModelo;
        this.quilometragem = quilometragem;
        this.cor = cor;
        this.motor = motor;
        this.cambio = cambio;
        this.caminhoImagem = caminhoImagem;
    }

    public VeiculoDTO() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public long getNumeroChassi() {
        return chassi;
    }

    public void setNumeroChassi(long Chassi) {
        this.chassi = chassi;
    }

    public String getAnoModelo() {
        return anoModelo;
    }

    public void setAnoModelo(String anoModelo) {
        this.anoModelo = anoModelo;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMotor() {
        return motor;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public String getCambio() {
        return cambio;
    }

    public void setCambio(String cambio) {
        this.cambio = cambio;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public Combustivel getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }
}
