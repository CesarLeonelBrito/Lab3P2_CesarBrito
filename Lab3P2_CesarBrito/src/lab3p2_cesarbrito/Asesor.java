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
public class Asesor extends Empleado {

    private ArrayList<Cliente> clientesAtendido = new ArrayList();
    private int productos;
    private int creditos;

    public Asesor() {
    }

    public Asesor(int productos, int creditos, String nombre, String apellido, int salario, String nacionalidad, String username, String password) {
        super(nombre, apellido, salario, nacionalidad, username, password);
        this.productos = productos;
        this.creditos = creditos;
    }

    public ArrayList<Cliente> getClientesAtendido() {
        return clientesAtendido;
    }

    public void setClientesAtendido(ArrayList<Cliente> clientesAtendido) {
        this.clientesAtendido = clientesAtendido;
    }

    public int getProductos() {
        return productos;
    }

    public void setProductos(int productos) {
        this.productos = productos;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    @Override
    public String toString() {
        return "Asesor{" + super.toString() + "clientesAtendido=" + clientesAtendido + ", productos=" + productos + ", creditos=" + creditos + "\n";
    }

}
