package br.edu.ufersa.pw.todo.todoAPI.domain.entities;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.Estado;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VendaCreateDTO;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="tb_todos")
public class Venda {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    Usuario usuario;
    String item;
    LocalDate prazo;
    Estado estado;
    LocalDate conclusao;
    public Venda(){}
    public Venda(VendaCreateDTO todo){
        setUsuario(new Usuario(todo.getIdUsu()));
        setEstado(todo.getEstado());
        setItem(todo.getItem());
        setPrazo(todo.getPrazo());
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getPrazo() {
        return prazo;
    }

    public void setPrazo(LocalDate prazo) {
        this.prazo = prazo;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public LocalDate getConclusao() {
        return conclusao;
    }

    public void setConclusao(LocalDate conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Venda venda = (Venda) o;
        return Objects.equals(id, venda.id) && Objects.equals(usuario, venda.usuario) && Objects.equals(item, venda.item);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, usuario, item);
    }
}
