package com.mx.InnovaMaqBack.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.InnovaMaqBack.dao.UsuariosDao;
import com.mx.InnovaMaqBack.dominio.Usuarios;

@Service
public class UsuariosServImp implements UsuariosServ{
	
	@Autowired
	UsuariosDao usuariosDao;
	
	//http://localhost:9000//UsuariosWs/listar

	@Override
	public void guardar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		
		try {
			usuariosDao.save(usuarios);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LO SENTIMOS, HUBO UN ERROR AL IMPACTAR A BASE DE DATOS" + e.getMessage());
		}
		
		
	}

	@Override
	public void editar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		try {
			usuariosDao.save(usuarios);
			System.out.println("USUARIO EDITADO CORRECTAMENTE");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LO SENTIMOS, HUBO UN ERROR AL EDITAR AL USUARIO");
		}
		
		
	}

	@Override
	public void eliminar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		
		try {
			
			Usuarios usuario = usuariosDao.findById(usuarios.getId()).orElse(null); 
			System.out.println("Usuario eliminar " + usuario);
			
			usuariosDao.save(usuario);
			
			System.out.println("USUARIO ELIMINADO CORRECTAMENT");
		} catch (Exception e) {
			// TODO: handle exception
		}
		

		
	}

	@Override
	public Usuarios buscar(Usuarios usuarios) {
		// TODO Auto-generated method stub
		return usuariosDao.findById(usuarios.getId()).orElse(null);
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return (List) usuariosDao.findAll();
	}

}
