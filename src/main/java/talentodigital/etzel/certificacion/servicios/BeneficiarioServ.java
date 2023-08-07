package talentodigital.etzel.certificacion.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talentodigital.etzel.certificacion.modelos.Beneficiario;
import talentodigital.etzel.certificacion.repositorios.IBeneficiarioRepo;

@Service
public class BeneficiarioServ {

	@Autowired
	private IBeneficiarioRepo beneficiarioRepo;

	public BeneficiarioServ() {
		super();
	}

	public List<Beneficiario> getAll() {
		return beneficiarioRepo.findAll();
	}

	public Beneficiario getOne(int id) {
		return beneficiarioRepo.getOne(id);
	}

	public void create(Beneficiario beneficiario) {
		beneficiarioRepo.save(beneficiario);
	}

	public void update(Beneficiario beneficiario) {
		beneficiarioRepo.save(beneficiario);
	}

	public void delete(int id) {
		beneficiarioRepo.delete(beneficiarioRepo.getOne(id));
	}
}
