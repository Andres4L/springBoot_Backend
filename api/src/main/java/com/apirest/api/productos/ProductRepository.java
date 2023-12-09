package com.apirest.api.productos;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends JpaRepository<Productos, Long> {
    Optional<Productos> findProductByNombre(String nombre);
}
