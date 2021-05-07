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
public class Tienda {

    private String identificador;
    private String ubicacion;
    private int empleadosMax;
    private int cantidadCajas;
    private String productoMasVendido;
    private int cantidadArticulo;
    private ArrayList<Articulo> articulos = new ArrayList();
    private ArrayList<Empleado> empleados = new ArrayList();
    private ArrayList<Cliente> clientes = new ArrayList();

    public Tienda() {
    }

    public Tienda(String identificador, String ubicacion, int empleadosMax, int cantidadCajas, String productoMasVendido, int cantidadArticulo) {
        this.identificador = identificador;
        this.ubicacion = ubicacion;
        this.empleadosMax = empleadosMax;
        this.cantidadCajas = cantidadCajas;
        this.productoMasVendido = productoMasVendido;
        this.cantidadArticulo = cantidadArticulo;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getEmpleadosMax() {
        return empleadosMax;
    }

    public void setEmpleadosMax(int empleadosMax) {
        this.empleadosMax = empleadosMax;
    }

    public int getCantidadCajas() {
        return cantidadCajas;
    }

    public void setCantidadCajas(int cantidadCajas) {
        this.cantidadCajas = cantidadCajas;
    }

    public String getProductoMasVendido() {
        return productoMasVendido;
    }

    public void setProductoMasVendido(String productoMasVendido) {
        this.productoMasVendido = productoMasVendido;
    }

    public int getCantidadArticulo() {
        return cantidadArticulo;
    }

    public void setCantidadArticulo(int cantidadArticulo) {
        this.cantidadArticulo = cantidadArticulo;
    }

    public ArrayList<Articulo> getArticulos() {
        return articulos;
    }

    public void setArticulos(ArrayList<Articulo> articulos) {
        if (articulos.size() < getCantidadArticulo()) {
            this.articulos = articulos;
        }
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        if (empleados.size() < getEmpleadosMax()) {
            this.empleados = empleados;
        }
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Tienda{" + "Identificador=" + identificador + ", Ubicacion=" + ubicacion + ", EmpleadosMax=" + empleadosMax + ", CantidadCajas=" + cantidadCajas
                + ", ProductoMasVendido=" + productoMasVendido + ", CantidadArticulo=" + cantidadArticulo + ", Articulos=" + articulos + ", Empleados=" + 
                empleados + ", Clientes=" + clientes;
    }

}
