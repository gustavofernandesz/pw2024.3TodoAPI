package br.edu.ufersa.pw.todo.todoAPI.domain.repositories;

import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Venda;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface VendaRepository extends JpaRepository<Venda,Long> {
    public List<Venda> findByUsuario(Usuario usu);
    public Venda save(Venda t);
    @Query(
            value = "select t.id, t.id_usuario, t.item, t.prazo from tb_todos t INNER JOIN tb_usuarios user "
                    + "ON user.id=t.id_usuario and user.email= :email",
            nativeQuery = true)
     List<Venda> findByUsuario(String email);


}
