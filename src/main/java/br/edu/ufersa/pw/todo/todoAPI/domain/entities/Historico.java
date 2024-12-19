package br.edu.ufersa.pw.todo.todoAPI.domain.entities;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.Atividade;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.HistoricoCreateDTO;
import jakarta.persistence.*;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

@Entity
@Table(name="tb_historico")
public class Historico {

    String pattern = "kk:mm dd/MM/yyyy"; /// Formatação da data e hora(não sei se é necessário tava seguindo o protótipo)


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id; /// Id da alteração (necessário no banco, fica escondido na interface)

    SimpleDateFormat dataHora = new SimpleDateFormat(pattern); /// Data e Hora em que a alteração foi feita.

    Atividade tipo;

    @ManyToOne
    @JoinColumn(name="id_veiculo")
    Veiculo veiculoAlterado; /// Número do chassi do veículo que foi alterado

    @ManyToOne
    @JoinColumn(name="id_usuario")
    Usuario usuario;
    // Id do funcionário vai ser obtido pela classe (interface)


    public Historico() {}

    public Historico(HistoricoCreateDTO historico) {
        setDataHora(historico.getDataHora());
        setTipo(historico.getTipo());
        setVeiculoAlterado(historico.getVeiculoAlterado());
        setUsuario(historico.getUsuario());
    }


    public String getPattern() { return pattern; } 
    public void setPattern(String pattern) { this.pattern = pattern; }

    public Long getId() { return id; } 
    public void setId(Long id) { this.id = id; }

    public SimpleDateFormat getDataHora() { return dataHora; }
    public void setDataHora(SimpleDateFormat dataHora) { this.dataHora = dataHora; }

    public Atividade getTipo() { return tipo; } 
    public void setTipo(Atividade tipo) { this.tipo = tipo; }

    public Veiculo getVeiculoAlterado() { return veiculoAlterado; }
    public void setVeiculoAlterado(Veiculo veiculoAlterado) { this.veiculoAlterado = veiculoAlterado; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }


    // classe de histórico de alterações
}
