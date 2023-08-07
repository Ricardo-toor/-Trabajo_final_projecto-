package talentodigital.etzel.certificacion.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Etzel M. Valderrama
 */
@Entity
@Table(name="transaccion")
public class Transaccion {

	@Id
	private int id;
	private int cuenta_id;
	private String tipo;
	private float monto;
	private String fecha;

	public Transaccion() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param id
	 * @param cuenta_id
	 * @param tipo
	 * @param monto
	 * @param fecha
	 */
	public Transaccion(int id, int cuenta_id, String tipo, float monto, String fecha) {
		super();
		this.id = id;
		this.cuenta_id = cuenta_id;
		this.tipo = tipo;
		this.monto = monto;
		this.fecha = fecha;
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
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the monto
	 */
	public float getMonto() {
		return monto;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
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
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @param monto the monto to set
	 */
	public void setMonto(float monto) {
		this.monto = monto;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Transaccion [id=" + id + ", cuenta_id=" + cuenta_id + ", tipo=" + tipo + ", monto=" + monto + ", fecha="
				+ fecha + "]";
	}
}
