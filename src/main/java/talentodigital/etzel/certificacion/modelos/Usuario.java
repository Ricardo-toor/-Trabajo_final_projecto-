package talentodigital.etzel.certificacion.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Etzel M. Valderrama
 */
@Entity
@Table(name="usuario")
public class Usuario {
	
	@Id
	@Column(name="id")
	private int id;
	
	private String nombre;
	private String email;
	private String fecha_registro;
	
	// Constructores
	
	public Usuario() {
		super();
	}

	/**
	 * @param id
	 * @param nombre
	 * @param email
	 * @param fecha_registro
	 */
	public Usuario(int id, String nombre, String email, String fecha_registro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.email = email;
		this.fecha_registro = fecha_registro;
	}
	
	// Accesores

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return the fecha_registro
	 */
	public String getFecha_registro() {
		return fecha_registro;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param fecha_registro the fecha_registro to set
	 */
	public void setFecha_registro(String fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + ", email=" + email + ", fecha_registro=" + fecha_registro
				+ "]";
	}
}
