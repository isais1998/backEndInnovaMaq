package com.mx.InnovaMaqBack.controller;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.InnovaMaqBack.dominio.Usuarios;
import com.mx.InnovaMaqBack.servicios.UsuariosServ;

@RestController
@RequestMapping("UsuariosWs")
@CrossOrigin
public class UsuariosWs {
	
	Logger logger = Logger.getLogger("MyLog");

	@Autowired
	UsuariosServ usuariosServ;
	// http://localhost:9000//MusicaWs/listar
	
	//http://localhost:9000/UsuariosWs/listar
	@GetMapping("listar")
	public List<Usuarios> listar() {
		var lista = usuariosServ.listar();
		System.out.println("lista ->" + lista);
		return lista;
	}

	//http://localhost:9000/UsuariosWs/buscar
	@PostMapping("buscar")
	public Usuarios buscar(@RequestBody Usuarios usuarios) {

		usuarios = usuariosServ.buscar(usuarios);
		return usuarios;

	}

	//http://localhost:9000/UsuariosWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Usuarios usuarios) {
		
		try {
			
			usuariosServ.guardar(usuarios);
			System.out.println("EL USUARIO SE HA GUARDADO CORRECTAMENTE EN WS.");
			
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LO SENTIMOS, HUBO UN ERROR AL GUARDAR EL USUARIO. " + e.getStackTrace());
		}

		

	}
	
	//http://localhost:9000/UsuariosWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Usuarios usuarios) {
		
		try {
			usuariosServ.editar(usuarios);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LO SENTIMOS, HUBO UN ERROR AL EDITAR AL USAURIO" + e.getStackTrace());
		}
		

	}
	
	//http://localhost:9000/UsuariosWs/eliminar 
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Usuarios usuarios) {
		
		try {
			usuariosServ.eliminar(usuarios);
			System.out.println("SE HA ELIMINADO CORRECTAMENTE AL USUARIO.");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("LO SENTIMOS, HUBO UN ERROR AL ELIMINAR AL USUARIO.");
		}



	}

}
