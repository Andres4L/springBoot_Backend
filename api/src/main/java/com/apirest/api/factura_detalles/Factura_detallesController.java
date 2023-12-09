package com.apirest.api.factura_detalles;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
@RestController
@RequestMapping(path = "api/factura_detalles")
public class Factura_detallesController {
 private final Factura_detallesService factura_detallesService;


    public Factura_detallesController(Factura_detallesService factura_detallesService) {
        this.factura_detallesService = factura_detallesService;
    }

    @GetMapping
    public List<Factura_detalles> getFactura_detalles(){
        return factura_detallesService.getFactura_detalles();
       
    }

    @PostMapping
    public ResponseEntity<Object> registerNewFactura_detalles(@RequestBody Factura_detalles factura_detalles){
       return this.factura_detallesService.addFactura_detalles(factura_detalles); 
    }

    @PutMapping
    public ResponseEntity<Object> UpdateFactura_detalles(@RequestBody Factura_detalles factura_detalles){
     return this.factura_detallesService.addFactura_detalles(factura_detalles); 
    }





    
}
