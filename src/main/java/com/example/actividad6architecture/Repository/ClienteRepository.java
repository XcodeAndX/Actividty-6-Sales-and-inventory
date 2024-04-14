package com.example.actividad6architecture.Repository;

import com.example.actividad6architecture.Entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    // Métodos de consulta personalizados si es necesario
}
