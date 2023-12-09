package com.apirest.api.auth;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.apirest.api.usuario.Usuario;
import com.apirest.api.usuario.UsuarioService;



@RestController
@RequestMapping(path="/auth")

public class AuthController {
    private final UsuarioService usuarioService;

    @Autowired
    public AuthController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
    
    @PostMapping
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        return usuarioService.validarCredenciales(
            usuario.getUsuario(), 
            usuario.getContraseña()
        );
    }
}
