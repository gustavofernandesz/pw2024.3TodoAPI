package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

public enum FuncaoUser {
    FUNCIONARIO("admin"),
    GERENTE("user");

    private String funcao;

    FuncaoUser(String funcao) {this.funcao = funcao;}

    public String getFuncao() {return funcao;}
}
