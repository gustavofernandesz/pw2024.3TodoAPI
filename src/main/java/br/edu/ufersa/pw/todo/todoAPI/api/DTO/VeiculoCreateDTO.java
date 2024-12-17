package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

public class VeiculoCreateDTO {
    private String marca;
    private String modelo;
    private Integer ano;
    private String cor;
    private Double preco;
    private String descricao;
    private String status;  // 'disponível' ou 'vendido'
    private String chassi;  // Adicionando o campo chassi

    // Construtores
    public VeiculoCreateDTO() {}

    public VeiculoCreateDTO(String marca, String modelo, Integer ano, String cor, Double preco, String descricao, String status, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.preco = preco;
        this.descricao = descricao;
        this.status = status;
        this.chassi = chassi;
    }

    // Getters e Setters
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
