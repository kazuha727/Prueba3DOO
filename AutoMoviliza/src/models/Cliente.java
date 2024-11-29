/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;


/**
 *
 * @author Cetecom
 */
public class Cliente {
    private int rut;
    private String nombre;
    private int nContacto;
    private String direccion;
    private int estadoCliente;

    public Cliente() {
    }

    public Cliente(int rut, String nombre, int nContacto, String direccion, int estadoCliente) {
        this.rut = rut;
        this.nombre = nombre;
        this.nContacto = nContacto;
        this.direccion = direccion;
        this.estadoCliente = estadoCliente;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getnContacto() {
        return nContacto;
    }

    public void setnContacto(int nContacto) {
        this.nContacto = nContacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEstadoCliente() {
        return estadoCliente;
    }

    public void setEstadoCliente(int estadoCliente) {
        this.estadoCliente = estadoCliente;
    }
    
   
}
