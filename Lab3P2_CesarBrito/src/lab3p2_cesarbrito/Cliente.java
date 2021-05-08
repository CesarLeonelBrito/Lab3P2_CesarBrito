/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_cesarbrito;

import java.util.ArrayList;

/**
 *
 * @author cesar
 */
public class Cliente {

    private String nombre;
    private String apellido;
    private int salario;
    private String nacionalidad;
    private int credito;
    private ArrayList<Articulo> articulosComprado = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, int salario, String nacionalidad, int credito) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.credito = credito;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public ArrayList<Articulo> getArticulosComprado() {
        return articulosComprado;
    }

    public void setArticulosComprado(ArrayList<Articulo> articulosComprado) {
        this.articulosComprado = articulosComprado;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", credito=" + credito + ", articulosComprado=" + articulosComprado + '}';
    }

}
