package com.apirest.api.usuario;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(path = "api/usuarios")
@CrossOrigin(origins = "http://localhost:4200/")

public class UsuarioController {
    @Autowired
	private UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }
	
	@GetMapping
    public List<Usuario> getUsuarios(){
        return this.usuarioService.getUsuarios();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewUsuario(@RequestBody Usuario usuario){
       return this.usuarioService.addUsuario(usuario); 
    }
    
    @PutMapping
    public ResponseEntity<Object> UpdateUsuario(@RequestBody Usuario usuario){
       return this.usuarioService.addUsuario(usuario); 
    }
}
