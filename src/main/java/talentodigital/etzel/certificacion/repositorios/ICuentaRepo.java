package talentodigital.etzel.certificacion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import talentodigital.etzel.certificacion.modelos.Cuenta;

@Repository
public interface ICuentaRepo extends JpaRepository<Cuenta, Integer> {

}
