package com.juan.curso.springboot.webapp.saep.model;

import jakarta.persistence.*;

@Entity
@Table(name="empresas")
public class Empresas
{
    @Id
    @GeneratedValue(strategy = GenerationType. IDENTITY) // Auto-incremental
    //Long para reconocerlo como llave primaria
    private Long ID_Empresas;
    private  Integer ID_Usuarios;
    private String nit;
    private String nombre_empresa;
    private String direccion;
    private String area;
    private String contacto;
    private String email;
    private String departamento;
    private String ciudad;
    private String estado;

    public Long getID_Empresa() {
        return ID_Empresas;
    }

    public void setID_Empresa(Long ID_Empresa) {
        this.ID_Empresas = ID_Empresa;
    }

    public Integer getID_Usuarios() {
        return ID_Usuarios;
    }

    public void setID_Usuarios(Integer ID_Usuarios) {
        this.ID_Usuarios = ID_Usuarios;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
