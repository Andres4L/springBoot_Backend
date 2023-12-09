package com.apirest.api.facturas;
import java.util.List;

import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/facturas")
public class FacturasController {
    private final FacturasService facturasService;

    //@Autowired
    public FacturasController(FacturasService facturasService) {
        this.facturasService = facturasService;
    }

    @GetMapping
    public List<Facturas> getFacturas(){
        return facturasService.getFacturas();
    }

    @PostMapping
    public ResponseEntity<Object> registerNewFactura(@RequestBody Facturas factura){
       return this.facturasService.addFactura(factura); 
    }

    @PutMapping
    public ResponseEntity<Object> UpdateFactura(@RequestBody Facturas factura){
     return this.facturasService.addFactura(factura); 
    } 

}
