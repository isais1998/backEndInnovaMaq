package com.mx.InnovaMaqBack.servicios;

import java.util.List;

import com.mx.InnovaMaqBack.dominio.Usuarios;


public interface UsuariosServ {
	
	public void guardar(Usuarios usuarios);
	public void editar(Usuarios usuarios);
	public void eliminar(Usuarios usuarios);
	
	public Usuarios buscar(Usuarios usuarios);
	public List listar();

}
