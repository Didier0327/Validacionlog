package com.log.validarlog;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IniciarSesion {
	
	Usuario nusuario = new Usuario ();
	
	@PostMapping("/registro")
	public String registro(@RequestBody Usuario usuario) {
		
		String respuesta="";
		
		nusuario.setUsuario(usuario.getUsuario());
		nusuario.setContrasena(usuario.getContrasena());
		
		return respuesta;		
		
	}
	@PostMapping("/validar")
	public String validarUsuario(@RequestBody Usuario usuario) {
		String respuesta="";
		Usuario usuario_m=usuario;
		
		String n_usurio=usuario_m.getUsuario();
		String n_contrasena=usuario_m.getContrasena();
		
		if(n_usurio.equals(nusuario.getUsuario()) && n_contrasena.equals(nusuario.getContrasena())) {
			respuesta="Autenticacion Sactifactoria";
		}else {
			respuesta="Error de autenticacion";
		}
		
		return respuesta;		
	}
}

