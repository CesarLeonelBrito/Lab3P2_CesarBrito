/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3p2_cesarbrito;

/**
 *
 * @author cesar
 */
public class Consola extends Articulo {

    private String marca;
    private int almacenamiento;
    private int controles;
    private int accesorios;
    private String informacionTarjeta;

    public Consola() {
        super();
    }

    public Consola(String marca, int almacenamiento, int controles, int accesorios, String informacionTarjeta, int serie, int precio, String color, String garantia) {
        super(serie, precio, color, garantia);
        this.marca = marca;
        this.almacenamiento = almacenamiento;
        this.controles = controles;
        this.accesorios = accesorios;
        this.informacionTarjeta = informacionTarjeta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int getControles() {
        return controles;
    }

    public void setControles(int controles) {
        this.controles = controles;
    }

    public int getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(int accesorios) {
        this.accesorios = accesorios;
    }

    public String getInformacionTarjeta() {
        return informacionTarjeta;
    }

    public void setInformacionTarjeta(String informacionTarjeta) {
        this.informacionTarjeta = informacionTarjeta;
    }

    @Override
    public String toString() {
        return "Consola{" + super.toString() + "marca=" + marca + ", almacenamiento=" + almacenamiento + " GB, controles=" + controles + ", accesorios=" + accesorios
                + ", informacionTarjeta=" + informacionTarjeta + "\n";
    }

}
