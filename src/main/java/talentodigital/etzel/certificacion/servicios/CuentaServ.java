package talentodigital.etzel.certificacion.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talentodigital.etzel.certificacion.modelos.Cuenta;
import talentodigital.etzel.certificacion.repositorios.ICuentaRepo;

@Service
public class CuentaServ {

	@Autowired
	private ICuentaRepo cuentaRepo;

	public CuentaServ() {
		super();
	}

	public List<Cuenta> getAll() {
		return cuentaRepo.findAll();
	}

	public Cuenta getOne(int id) {
		return cuentaRepo.getOne(id);
	}

	public void create(Cuenta cuenta) {
		cuentaRepo.save(cuenta);
	}

	public void update(Cuenta cuenta) {
		cuentaRepo.save(cuenta);
	}

	public void delete(int id) {
		cuentaRepo.delete(cuentaRepo.getOne(id));
	}
}
