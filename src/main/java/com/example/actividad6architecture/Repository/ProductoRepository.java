package com.example.actividad6architecture.Repository;

import com.example.actividad6architecture.Entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos de consulta personalizados si es necesario
}
