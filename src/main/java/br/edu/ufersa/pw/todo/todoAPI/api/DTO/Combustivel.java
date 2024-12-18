package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

public enum Combustivel {
    GASOLINA("Gasolina"),
    DIESEL("Diesel"),
    ETANOL("Etanol"),
    ELETRICO("Elétrico"),
    GAS_NATURAL("Gás Natural"),
    HIBRIDO("Híbrido");

    /// Descrição adicionada para escrever na interface
    private final String descricao;

    Combustivel(String descricao) { this.descricao = descricao; }

    public String getDescricao() { return descricao; }

}
