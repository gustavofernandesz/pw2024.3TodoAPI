package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

import java.time.LocalDate;

public class VendaCreateDTO {
    long idUsu;
    String item;
    LocalDate dataVenda;
    Estado estado;

    public long getIdUsu() {
        return idUsu;
    }

    public void setIdUsu(long usu) {
        this.idUsu = usu;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
