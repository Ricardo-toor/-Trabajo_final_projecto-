package talentodigital.etzel.certificacion.controladores;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

/**
 * @author Etzel M. Valderrama
 */
@Controller
@RequestMapping(path = "/")
public class HomeController {

    // Constantes
    // -----------------------------------------------------------------------------------------

    /** Objeto {@link Logger} que contiene los métodos de depuración */
    private static final Logger logger = LogManager.getLogger(HomeController.class);

    // Solicitudes GET
    // -----------------------------------------------------------------------------------------

    /**
     * Muestra la Página de Inicio
     * @param request objeto {@link HttpServletRequest} que contiene la información
     *                de la solicitud que le hace el cliente al {@link HttpServlet}
     * @param modelo  objeto {@link Model} con el modelo de la vista
     *
     * @return un objeto {@link String} con la respuesta a la solicitud
     */
    @GetMapping(path = { "/", "/home" })
    public String home(HttpServletRequest request, Model modelo) {
    	logger.info("Etzel M. Valderrama te da la bienvenida a la página de inicio.");
    	
    	modelo.addAttribute("contenido", "home.jsp");

        // Mostrar página
        return "plantillaGeneral";
    }
    
	@RequestMapping(value = "/login")
	public String login(Locale locale, Model model) {
		logger.info("Mostrando formulario para inicio de sesion");
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "login.jsp");
		
		return "plantillaGeneral";
	}
	
	@RequestMapping(value = "/loginerror")
	public String loginError(Locale locale, Model model) {
		logger.info("Mostrando que ha ocurrido un error al iniciar sesión.");
		
		model.addAttribute("error", "true");
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "login.jsp");
		
		return "plantillaGeneral";
	}
	
	@RequestMapping(value = "/logout")
	public String logout(Locale locale, Model model) {
		logger.info("Se ha cerrado la sesión.");
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if(auth != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		
		// Establecer la pagina a incluir en la plantilla
		model.addAttribute("contenido", "login.jsp");
		
		return "plantillaGeneral";
	}
}
