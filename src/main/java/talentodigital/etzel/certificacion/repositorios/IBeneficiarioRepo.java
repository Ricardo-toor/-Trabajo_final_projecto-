package talentodigital.etzel.certificacion.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import talentodigital.etzel.certificacion.modelos.Beneficiario;

@Repository
public interface IBeneficiarioRepo extends JpaRepository<Beneficiario, Integer> {

}
