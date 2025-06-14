package com.juan.curso.springboot.webapp.saep.model;

import jakarta.persistence.*;

@Entity
@Table(name="rol")
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY)
    private Long ID_rol;
    private String roles;

    public Long getID_rol() {
        return ID_rol;
    }

    public void setID_rol(Long ID_rol) {
        this.ID_rol = ID_rol;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }
}
