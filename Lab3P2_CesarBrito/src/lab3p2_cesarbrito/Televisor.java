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
public class Televisor extends Articulo{
    
    private int pantalla;
    private boolean smart;
    private String marca;
    private int conexiones;
    private int grosor;

    public Televisor() {
        super();
    }

    public Televisor(int pantalla, boolean smart, String marca, int conexiones, int grosor, int serie, int precio, String color, String garantia) {
        super(serie, precio, color, garantia);
        this.pantalla = pantalla;
        this.smart = smart;
        this.marca = marca;
        this.conexiones = conexiones;
        this.grosor = grosor;
    }

    public int getPantalla() {
        return pantalla;
    }

    public void setPantalla(int pantalla) {
        this.pantalla = pantalla;
    }

    public boolean isSmart() {
        return smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones = conexiones;
    }

    public int getGrosor() {
        return grosor;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    @Override
    public String toString() {
        return "Televisor{" + super.toString() + "pantalla=" + pantalla + " pulgadas, smart=" + smart + ", marca=" + marca + ", conexiones=" + conexiones + ", grosor=" + grosor + "\n";
    }
    
    
    
    
}
