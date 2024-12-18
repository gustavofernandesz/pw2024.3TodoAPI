package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;
import jakarta.validation.constraints.NotBlank;

public class VeiculoCreateDTO {
    @NotBlank(message = "Nome do veículo é mandatório")
    private String nome;
    @NotBlank(message = "Preço do veículo é mandatório")
    private double preco;
    @NotBlank(message = "Número do chassi é mandatório")
    private String chassi;
    private String anoModelo;
    private int quilometragem;
    private String cor;
    private String motor;
    private Combustivel combustivel;
    private Transmissao cambio;
    private String caminhoImagem;


    public VeiculoCreateDTO() {}

    public VeiculoCreateDTO(Veiculo veiculo) {
        this.nome = veiculo.getNome();
        this.preco = veiculo.getPreco();
        this.chassi = veiculo.getNumeroChassi();
        this.anoModelo = veiculo.getAnoModelo();
        this.quilometragem = veiculo.getQuilometragem();
        this.cor = veiculo.getCor();
        this.motor = veiculo.getMotor();
        this.cambio = veiculo.getCambio();
    }


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

    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
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

    public Combustivel getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(Combustivel combustivel) {
        this.combustivel = combustivel;
    }

    public Transmissao getCambio() {
        return cambio;
    }
    public void setCambio(Transmissao cambio) {
        this.cambio = cambio;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }
    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }


    //classe veícul create DTO
}
