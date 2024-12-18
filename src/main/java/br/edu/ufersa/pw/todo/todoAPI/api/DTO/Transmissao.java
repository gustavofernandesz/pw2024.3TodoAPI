package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

public enum Transmissao {
    MANUAL("Manual"),
    AUTOMATICA("Automática"),
    SEM_TRANSMISSAO("Sem transmissão");

    /// Descrição adicionada para escrever na interface
    private final String descricao;

    Transmissao(String transmissao) { this.descricao = transmissao; }

    public String getTransmissao() { return descricao; }
}
