package br.edu.ufersa.pw.todo.todoAPI.domain.repositories;

import br.edu.ufersa.pw.todo.todoAPI.api.DTO.Combustivel;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Todo;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Usuario;
import br.edu.ufersa.pw.todo.todoAPI.domain.entities.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VeiculoRepository extends JpaRepository<Veiculo,Long> {

    public Veiculo save(Veiculo v);

    List<Veiculo> findAllByCombustivel(Combustivel combustivel);

//    @Query(
//            value = "select v.id, v.id_usuario, v.item, v.prazo from tb_veiculos v INNER JOIN tb_usuarios user "
//                    + "ON user.id=t.id_usuario and user.email= :email",
//            nativeQuery = true)
//    List<Veiculo> findByUsuario(String email);

}
