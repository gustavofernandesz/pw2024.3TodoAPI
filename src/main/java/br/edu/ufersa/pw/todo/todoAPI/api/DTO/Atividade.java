package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

public enum Atividade {
    VENDA("Venda"),
    ADICAO("Adição"),
    REMOCAO("Remoção"),
    EDICAO("Edição");

    /// Descrição adicionada para escrever na interface
    private final String descricao;

    Atividade(String descricao) { this.descricao = descricao; }

    public String getDescricao() { return descricao; }
}
