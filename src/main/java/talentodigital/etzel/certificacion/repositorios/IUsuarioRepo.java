package talentodigital.etzel.certificacion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import talentodigital.etzel.certificacion.modelos.Usuario;

@Repository
public interface IUsuarioRepo extends JpaRepository<Usuario, Integer> {

}
