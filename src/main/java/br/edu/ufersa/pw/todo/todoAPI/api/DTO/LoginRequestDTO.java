package br.edu.ufersa.pw.todo.todoAPI.api.DTO;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public class LoginRequestDTO {
    @NotBlank(message = "O email não pode estar em branco!")
    @Email(message = "Formato de email inválido!")
    private String email;

    @NotBlank(message = "A senha não pode estar em branco!")
    private String password;

    public LoginRequestDTO() {
    }

    public LoginRequestDTO(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}