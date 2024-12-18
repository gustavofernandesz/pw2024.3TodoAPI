package br.edu.ufersa.pw.todo.todoAPI.domain.entities;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.Combustivel;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.Transmissao;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VeiculoCreateDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

import java.util.Objects;

import java.util.Objects;

@Entity
@Table(name="tb_veiculos")
public class Veiculo {


    @NotNull
    private String nome;

    @PositiveOrZero
    @NotNull
    private Double preco;

    @Id
    @Column(unique = true)
    private long chassi;

    private String anoModelo;

    @PositiveOrZero
    private Integer quilometragem;

    private String cor;

    private String motor;

    private Combustivel combustivel;

    private Transmissao cambio;

    private boolean vendido;

    private String caminhoImagem;
    @OneToOne (mappedBy="veiculo")
    private Venda venda;


    public Veiculo() {}
    public Veiculo(long chassi){
        this.chassi = chassi;
    }

    public Veiculo(long chassi) {
        this.chassi = chassi;
    }

    public Veiculo(VeiculoCreateDTO veiculo) {
        setAnoModelo(veiculo.getAnoModelo());
        setNome(veiculo.getNome());
        setPreco(veiculo.getPreco());
        setQuilometragem(veiculo.getQuilometragem());
        setCor(veiculo.getCor());
        setMotor(veiculo.getMotor());
        setCombustivel(veiculo.getCombustivel());
        setCambio(veiculo.getCambio());
        setCaminhoImagem(veiculo.getCaminhoImagem());

    }


    public String getNome() { return nome; }
    public void setNome(String nomeVeiculo) { this.nome = nomeVeiculo; }

    public Double getPreco() { return preco; }
    public void setPreco(Double valor) { this.preco = valor; }

    public long getChassi() { return chassi; }
    public void setChassi(long numeroChassi) { this.chassi = numeroChassi; }

    public String getAnoModelo() { return anoModelo; }
    public void setAnoModelo(String anoModelo) { this.anoModelo = anoModelo; }

    public Integer getQuilometragem() { return quilometragem; }
    public void setQuilometragem(Integer quilometragem) { this.quilometragem = quilometragem; }

    public String getCor() { return cor; }
    public void setCor(String cor) { this.cor = cor; }

    public String getMotor() { return motor; }
    public void setMotor(String motor) { this.motor = motor; }

    public Combustivel getCombustivel() { return combustivel; }
    public void setCombustivel(Combustivel combustivel) { this.combustivel = combustivel; }

    public Transmissao getCambio() { return cambio; }
    public void setCambio(Transmissao cambio) { this.cambio = cambio; }

    public boolean isVendido() { return vendido; }
    public void setVendido(boolean vendido) { this.vendido = vendido; }

    public String getCaminhoImagem() { return caminhoImagem; }
    public void setCaminhoImagem(String caminhoImagem) { this.caminhoImagem = caminhoImagem; }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Double.compare(preco, veiculo.preco) == 0 &&
                Objects.equals(chassi, veiculo.chassi) &&
                Objects.equals(quilometragem, veiculo.quilometragem) &&
                Objects.equals(nome, veiculo.nome) &&
                Objects.equals(anoModelo, veiculo.anoModelo) &&
                Objects.equals(cor, veiculo.cor) &&
                Objects.equals(motor, veiculo.motor) &&
                Objects.equals(combustivel, veiculo.combustivel) &&
                Objects.equals(cambio, veiculo.cambio) &&
                Objects.equals(caminhoImagem, veiculo.caminhoImagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, chassi, anoModelo, quilometragem, cor, motor, combustivel, cambio, caminhoImagem);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Veiculo veiculo = (Veiculo) o;
        return Double.compare(preco, veiculo.preco) == 0 && chassi == veiculo.chassi && quilometragem == veiculo.quilometragem && Objects.equals(nome, veiculo.nome) && Objects.equals(anoModelo, veiculo.anoModelo) && Objects.equals(cor, veiculo.cor) && Objects.equals(motor, veiculo.motor) && combustivel == veiculo.combustivel && Objects.equals(cambio, veiculo.cambio) && Objects.equals(caminhoImagem, veiculo.caminhoImagem);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, preco, chassi, anoModelo, quilometragem, cor, motor, combustivel, cambio, caminhoImagem);
    }

    //classe veículo
}
