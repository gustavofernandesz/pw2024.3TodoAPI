package br.edu.ufersa.pw.todo.todoAPI.domain.entities;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.Estado;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.VendaCreateDTO;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name="tb_vendas")
public class Venda {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JoinColumn(name="id_usuario")
    Usuario usuario;
    @OneToOne
    @JoinColumn(name="chassi_veiculo")
    Veiculo veiculo;
    String item;
    LocalDate dataVenda;
    Estado estado;
    LocalDate conclusao;
    public Venda(){}
    public Venda(VendaCreateDTO todo){
        setUsuario(new Usuario(todo.getIdUsu()));
        setEstado(todo.getEstado());
        setItem(todo.getItem());
        setdataVenda(todo.getDataVenda());
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

    public LocalDate getdataVenda() {
        return dataVenda;
    }

    public void setdataVenda(LocalDate prazo) {
        this.dataVenda = prazo;
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
