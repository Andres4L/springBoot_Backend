package com.apirest.api.clientes;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
@Service
public class ClientesService {
    private final ClientesRepository clientesRepository;

    public ClientesService(ClientesRepository clientesRepository) {
        this.clientesRepository = clientesRepository;
    }

    public List<Clientes> getClientes(){
        return clientesRepository.findAll();
    }

    public Optional<Clientes> getClienteById(Long id){
        return clientesRepository.findById(id);
    }

    public ResponseEntity<Object> addCliente(Clientes cliente){ 
        Optional<Clientes> clienteOptional = clientesRepository.findByidentificacion(cliente.getIdentificacion());
        if(clienteOptional.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).body("Cliente ya existe");
        }else{
            clientesRepository.save(cliente);
            return ResponseEntity.ok().body("Cliente creado");
        }
        
    }

    public ResponseEntity<Object> updateCliente(long id,Clientes cliente){ 
        Optional<Clientes> clienteOptional = clientesRepository.findById(id);
        if(clienteOptional.isPresent()){
            Clientes clienteActual = clienteOptional.get();
            
            clienteActual.setIdentificacion(cliente.getIdentificacion());
            clienteActual.setTipo_identificacion(cliente.getTipo_identificacion());
            clienteActual.setFecha_registro(cliente.getFecha_registro());
            clienteActual.setEstado(cliente.getEstado());
            clienteActual.setRazon_social(cliente.getRazon_social());

            Clientes clienteActualizado = clientesRepository.save(clienteActual);
            return ResponseEntity.status(HttpStatus.OK).body(clienteActualizado);
    }else{
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Cliente no encontrado");
    }
    }
        
}
