package com.apirest.api.productos;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;
     
    //@Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public List<Productos> getProducts(){
		return this.productRepository.findAll();
	}
    public ResponseEntity<Object> addNewProduct(Productos product) {
       Optional<Productos> res = productRepository.findProductByNombre(product.getNombre());
       HashMap <String, Object> datos = new HashMap<>();
     

       if(res.isPresent()){
        datos.put("error", true);
        datos.put("message", "ya existe un producto con ese nombre");
            return new ResponseEntity<>(
                datos,
                HttpStatus.CONFLICT
            );
       }  
       datos.put("message", "Se guardo correctamente");
       
       if (product.getId_producto() == productRepository.save(product).getId_producto()){
        datos.put("message", "Se actualizo correctamente");
       }
       
       productRepository.save(product);
       datos.put("datos", product);
       return new ResponseEntity<>(
                datos,
                HttpStatus.CREATED
        );
        
        
        
    }
}
