package talentodigital.etzel.certificacion.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Etzel M. Valderrama
 */
@Entity
@Table(name="beneficiario")
public class Beneficiario {

	@Id
	private int id;
	private int cuenta_id;
	private String nombre;

	public Beneficiario() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param cuenta_id
	 * @param nombre
	 */
	public Beneficiario(int id, int cuenta_id, String nombre) {
		super();
		this.id = id;
		this.cuenta_id = cuenta_id;
		this.nombre = nombre;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the cuenta_id
	 */
	public int getCuenta_id() {
		return cuenta_id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param cuenta_id the cuenta_id to set
	 */
	public void setCuenta_id(int cuenta_id) {
		this.cuenta_id = cuenta_id;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Beneficiario [id=" + id + ", cuenta_id=" + cuenta_id + ", nombre=" + nombre + "]";
	}
}
