package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;

public class VeiculoDTO {
    private Long id;
    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
    private Double preco;
    private String descricao;
    private String status;
    private String chassi;  // Adicionando o campo chassi

    // Construtores
    public VeiculoDTO() {}

    public VeiculoDTO(Veiculo veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.ano = veiculo.getAno();
        this.cor = veiculo.getCor();
        this.preco = veiculo.getPreco();
        this.descricao = veiculo.getDescricao();
        this.status = veiculo.getStatus();
        this.chassi = veiculo.getChassi();  // Preenchendo o campo chassi
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
}
