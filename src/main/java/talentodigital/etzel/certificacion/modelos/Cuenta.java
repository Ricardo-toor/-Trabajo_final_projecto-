package talentodigital.etzel.certificacion.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Etzel M. Valderrama
 */
@Entity
@Table(name="cuenta")
public class Cuenta {
	
	@Id
	private int id;
	private int usuario_id;
	private String tipo;
	private float saldo;

	public Cuenta() {
		super();
	}

	/**
	 * @param id
	 * @param usuario_id
	 * @param tipo
	 * @param saldo
	 */
	public Cuenta(int id, int usuario_id, String tipo, float saldo) {
		super();
		this.id = id;
		this.usuario_id = usuario_id;
		this.tipo = tipo;
		this.saldo = saldo;
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return the usuario_id
	 */
	public int getUsuario_id() {
		return usuario_id;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @return the saldo
	 */
	public float getSaldo() {
		return saldo;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param usuario_id the usuario_id to set
	 */
	public void setUsuario_id(int usuario_id) {
		this.usuario_id = usuario_id;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	/**
	 * @param saldo the saldo to set
	 */
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [id=" + id + ", usuario_id=" + usuario_id + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}
}
