package com.example.actividad6architecture.Entity;

import jakarta.persistence.*;
@Entity
public class Cliente {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private String nombre;
        private String apellido;
        private String correo;
        // Otros atributos, getters y setters

        // Constructores
        public Cliente() {
        }

        public Cliente(String nombre, String apellido, String correo) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.correo = correo;
        }

        // Getters y setters
        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }
}

