package talentodigital.etzel.certificacion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import talentodigital.etzel.certificacion.modelos.Transaccion;

@Repository
public interface ITransaccionRepo extends JpaRepository<Transaccion, Integer> {

}
