package com.apirest.api.usuario;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    public List<Usuario> getUsuarios() {
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> getUsuarioById(Long id) {
        return usuarioRepository.findById(id);
    }

    public ResponseEntity<Object> addUsuario(Usuario nuevoUsuario) {
    
        if (usuarioRepository.findByUsuario(nuevoUsuario.getUsuario()).isPresent()) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("Ya existe un usuario con el mismo nombre de usuario: " + nuevoUsuario.getUsuario());
        }

        
        if (nuevoUsuario.getIdusuario() != null && usuarioRepository.existsById(nuevoUsuario.getIdusuario())) {
            return updateUsuario(nuevoUsuario.getIdusuario(), nuevoUsuario);
        }

        Usuario usuarioGuardado = usuarioRepository.save(nuevoUsuario);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioGuardado);
    }

    public ResponseEntity<Object> updateUsuario(Long id, Usuario nuevoUsuario) {
        Optional<Usuario> usuarioExistente = usuarioRepository.findById(id);

        if (usuarioExistente.isPresent()) {
            Usuario usuarioActual = usuarioExistente.get();
            usuarioActual.setNombre(nuevoUsuario.getNombre());
            usuarioActual.setApellido(nuevoUsuario.getApellido());
            usuarioActual.setUsuario(nuevoUsuario.getUsuario());
            usuarioActual.setContraseña(nuevoUsuario.getContraseña());
            usuarioActual.setId_perfil(nuevoUsuario.getId_perfil());

            
            Usuario usuarioActualizado = usuarioRepository.save(usuarioActual);

            return ResponseEntity.status(HttpStatus.OK).body(usuarioActualizado);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("No se encontró un usuario con la ID: " + id);
        }
    }

    public ResponseEntity<String> validarCredenciales(String nombreUsuario, String contraseña) {
        Optional<Usuario> usuarioOptional = usuarioRepository.findByUsuario(nombreUsuario);

        if (usuarioOptional.isPresent()) {
            Usuario usuario = usuarioOptional.get();
            if (usuario.getContraseña().equals(contraseña)) {
                return ResponseEntity.ok("Inicio de sesión exitoso para el usuario: " + nombreUsuario);
            } else {
                return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Contraseña incorrecta");
            }
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Usuario no encontrado");
        }
    }



    /* public void deleteUsuario(Long id) {
        usuarioRepository.deleteById(id);
    } */
}
