package talentodigital.etzel.certificacion.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talentodigital.etzel.certificacion.modelos.Transaccion;
import talentodigital.etzel.certificacion.repositorios.ITransaccionRepo;

@Service
public class TransaccionServ {

	@Autowired
	private ITransaccionRepo transaccionRepo;

	public TransaccionServ() {
		super();
	}

	public List<Transaccion> getAll() {
		return transaccionRepo.findAll();
	}

	public Transaccion getOne(int id) {
		return transaccionRepo.getOne(id);
	}

	public void create(Transaccion transaccion) {
		transaccionRepo.save(transaccion);
	}

	public void update(Transaccion transaccion) {
		transaccionRepo.save(transaccion);
	}

	public void delete(int id) {
		transaccionRepo.delete(transaccionRepo.getOne(id));
	}
}
