package com.mx.InnovaMaqBack.dominio;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="USUARIOS")
public class Usuarios {
	@Id
	int id;
	int nempleados;
	String nomcomempleado;
	String fechanacimiento;
	long nocelular;
	int estatus;
	
	public Usuarios() {
		
	}
	public Usuarios(int id, int nempleados, String nomcomempleado, String fechanacimiento, long nocelular,
			int estatus) {
		this.id = id;
		this.nempleados = nempleados;
		this.nomcomempleado = nomcomempleado;
		this.fechanacimiento = fechanacimiento;
		this.nocelular = nocelular;
		this.estatus = estatus;
	}
	@Override
	public String toString() {
		return "Usuarios [id=" + id + ", nempleados=" + nempleados + ", nomcomempleado=" + nomcomempleado
				+ ", fechanacimiento=" + fechanacimiento + ", nocelular=" + nocelular + ", estatus=" + estatus + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNempleados() {
		return nempleados;
	}
	public void setNempleados(int nempleados) {
		this.nempleados = nempleados;
	}
	public String getNomcomempleado() {
		return nomcomempleado;
	}
	public void setNomcomempleado(String nomcomempleado) {
		this.nomcomempleado = nomcomempleado;
	}
	public String getFechanacimiento() {
		return fechanacimiento;
	}
	public void setFechanacimiento(String fechanacimiento) {
		this.fechanacimiento = fechanacimiento;
	}
	public long getNocelular() {
		return nocelular;
	}
	public void setNocelular(long nocelular) {
		this.nocelular = nocelular;
	}
	public int getEstatus() {
		return estatus;
	}
	public void setEstatus(int estatus) {
		this.estatus = estatus;
	}
	

}
