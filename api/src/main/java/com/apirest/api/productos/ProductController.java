package com.apirest.api.productos;
import java.util.List;

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
@RequestMapping(path = "api/products")
@CrossOrigin(origins = "http://localhost:4200/")
public class ProductController {

    private final ProductService productService;
    
    //@Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Productos> getProducts(){
        return productService.getProducts();
    }
    

    @PostMapping
    public ResponseEntity<Object> registerNewProduct(@RequestBody Productos product){
       return this.productService.addNewProduct(product); 
    }

    @PutMapping
    public ResponseEntity<Object> UpdateProduct(@RequestBody Productos product){
       return this.productService.addNewProduct(product); 
    } 
	
}
