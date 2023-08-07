package talentodigital.etzel.certificacion.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import talentodigital.etzel.certificacion.modelos.Usuario;
import talentodigital.etzel.certificacion.repositorios.IUsuarioRepo;

@Service
public class UsuarioServ {

	@Autowired
	private IUsuarioRepo usuarioRepo;

	public UsuarioServ() {
		super();
	}

	public List<Usuario> getAll() {
		return usuarioRepo.findAll();
	}
	
	public Usuario getOne(int id) {
		return usuarioRepo.getOne(id);
	}
	
	public void create(Usuario usuario) {
		usuarioRepo.save(usuario);
	}
	
	public void update(Usuario usuario) {
		usuarioRepo.save(usuario);
	}
	
	public void delete(int id) {
		usuarioRepo.delete(usuarioRepo.getOne(id));
	}
}
