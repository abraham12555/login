package com.abraham.sistema.model;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Calendariopagos generated by hbm2java
 */
@Entity
@Table(name = "calendariopagos", schema = "public")
public class Calendariopagos implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idcp;
	private Tanda tanda;
	private Integer pagon;
	private Date fip;
	private Date ffp;
	private Set<Pago> pagos = new HashSet<Pago>(0);

	public Calendariopagos() {
	}

	public Calendariopagos(int idcp) {
		this.idcp = idcp;
	}

	public Calendariopagos(int idcp, Tanda tanda, Integer pagon, Date fip, Date ffp, Set<Pago> pagos) {
		this.idcp = idcp;
		this.tanda = tanda;
		this.pagon = pagon;
		this.fip = fip;
		this.ffp = ffp;
		this.pagos = pagos;
	}

	@Id

	@Column(name = "idcp", unique = true, nullable = false)
	public int getIdcp() {
		return this.idcp;
	}

	public void setIdcp(int idcp) {
		this.idcp = idcp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idtanda")
	public Tanda getTanda() {
		return this.tanda;
	}

	public void setTanda(Tanda tanda) {
		this.tanda = tanda;
	}

	@Column(name = "pagon")
	public Integer getPagon() {
		return this.pagon;
	}

	public void setPagon(Integer pagon) {
		this.pagon = pagon;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "fip", length = 13)
	public Date getFip() {
		return this.fip;
	}

	public void setFip(Date fip) {
		this.fip = fip;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "ffp", length = 13)
	public Date getFfp() {
		return this.ffp;
	}

	public void setFfp(Date ffp) {
		this.ffp = ffp;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "calendariopagos")
	public Set<Pago> getPagos() {
		return this.pagos;
	}

	public void setPagos(Set<Pago> pagos) {
		this.pagos = pagos;
	}

}
