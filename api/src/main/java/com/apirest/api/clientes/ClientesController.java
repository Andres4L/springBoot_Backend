package com.apirest.api.clientes;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@RequestMapping(path = "api/clientes")
@CrossOrigin(origins = "http://localhost:4200/")
public class ClientesController {
    @Autowired
    private ClientesService clientesService;

    public ClientesController(ClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @GetMapping
    public List<Clientes> getClientes(){
        return this.clientesService.getClientes();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewCliente(@RequestBody Clientes cliente){
       return this.clientesService.addCliente(cliente); 
    }

    @PutMapping
    public ResponseEntity<Object> UpdateCliente(@RequestBody Clientes cliente){
       return this.clientesService.addCliente(cliente); 
    }
}
