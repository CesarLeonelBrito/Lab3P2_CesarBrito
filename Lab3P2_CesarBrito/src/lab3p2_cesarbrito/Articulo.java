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
public class Articulo {
    
    private int serie;
    private int precio;
    private String color;
    private String garantia;

    public Articulo() {
    }

    public Articulo(int serie, int precio, String color, String garantia) {
        this.serie = serie;
        this.precio = precio;
        this.color = color;
        this.garantia = garantia;
    }

    public int getSerie() {
        return serie;
    }

    public void setSerie(int serie) {
        this.serie = serie;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getGarantia() {
        return garantia;
    }

    public void setGarantia(String garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "Articulo{" + "serie=" + serie + ", precio=" + precio + ", color=" + color + ", garantia=" + garantia + " - ";
    }
    
    
}
