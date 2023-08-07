package talentodigital.etzel.certificacion.controladores;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import talentodigital.etzel.certificacion.modelos.Usuario;
import talentodigital.etzel.certificacion.servicios.UsuarioServ;

/**
 * @author Etzel M. Valderrama
 */
@Controller
public class UsuarioController {

	@Autowired
	private UsuarioServ usuarioServ;

	@GetMapping(value="usuarios")
	public String mostrarUsuarios(HttpServletRequest request, Model model) {
		
		List<Usuario> usuarios = usuarioServ.getAll();
		
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("contenido", "listaUsuarios.jsp");

        // Mostrar página
        return "plantillaGeneral";
	}
}
