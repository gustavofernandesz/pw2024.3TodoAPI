package br.edu.ufersa.pw.todo.todoAPI.domain.entities;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.FuncaoUser;
import br.edu.ufersa.pw.todo.todoAPI.api.DTO.UsuarioCreateDTO;
import jakarta.persistence.*;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="tb_usuarios")
public class Usuario implements UserDetails {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    Long id;
    @Column(unique = true)
    @NotNull
    String email;
    @NotNull
    String senha;
    @NotNull
    FuncaoUser funcao;
    @OneToMany(mappedBy="usuario")
    private List<Todo> todoList;

    public Usuario(UsuarioCreateDTO dto) {
        this.email = dto.getEmail();
        this.senha = dto.getSenha();
        this.id=null;
    }

    public Long getId() {
        return id;
    }
    public Usuario(){}
    public Usuario(Long id){this.id = id;}
    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Todo> getTodoList() {
        return todoList;
    }

    public void setTodoList(List<Todo> todoList) {
        this.todoList = todoList;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(id, usuario.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        if(this.funcao == FuncaoUser.GERENTE) return List.of( new SimpleGrantedAuthority("ROLE_USUARIO"), new SimpleGrantedAuthority("ROLE_ADMIN") );
        else return List.of( new SimpleGrantedAuthority("ROLE_USUARIO") );
    }

    @Override
    public String getPassword() {
        return senha;
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
