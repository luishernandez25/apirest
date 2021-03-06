package com.api.rest.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "usuarios")
public class Usuario {

    @Column(name="id")
    @Id
    private String idUsuario;



    private String password;

    private String nombre;

    private String apellidos;

    @Column(name = "num_telefonico")
    private Long numTelefonico;

    private String direccion;

    @Column(name = "correo_electronico")
    private String correoElectronico;

    @OneToMany(mappedBy = "usuario")
    private List<Compra> compras;


    //G&S
    public String getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(String idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Long getNumTelefonico() {
        return numTelefonico;
    }

    public void setNumTelefonico(Long numTelefonico) {
        this.numTelefonico = numTelefonico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
