package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Historico;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Usuario;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;
import jakarta.persistence.*;

import java.text.SimpleDateFormat;

public class HistoricoCreateDTO {

    String pattern = "kk:mm dd/MM/yyyy";

    SimpleDateFormat dataHora = new SimpleDateFormat(pattern);
    Atividade tipo;
    Veiculo veiculoAlterado;
    Usuario usuario;


    public SimpleDateFormat getDataHora() { return dataHora; }
    public void setDataHora(SimpleDateFormat dataHora) { this.dataHora = dataHora; }

    public Atividade getTipo() { return tipo; }
    public void setTipo(Atividade tipo) { this.tipo = tipo; }

    public Veiculo getVeiculoAlterado() { return veiculoAlterado; }
    public void setVeiculoAlterado(Veiculo veiculoAlterado) { this.veiculoAlterado = veiculoAlterado; }

    public Usuario getUsuario() { return usuario; }
    public void setUsuario(Usuario usuario) { this.usuario = usuario; }
}
