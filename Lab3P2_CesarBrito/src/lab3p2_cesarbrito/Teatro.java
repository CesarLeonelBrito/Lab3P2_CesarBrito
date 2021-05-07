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
public class Teatro extends Articulo {

    private int altavoces;
    private int discosCantidad;
    private String informacion;

    public Teatro() {
        super();
    }

    public Teatro(int altavoces, int discosCantidad, String informacion, int serie, int precio, String color, String garantia) {
        super(serie, precio, color, garantia);
        this.altavoces = altavoces;
        this.discosCantidad = discosCantidad;
        this.informacion = informacion;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getDiscosCantidad() {
        return discosCantidad;
    }

    public void setDiscosCantidad(int discosCantidad) {
        this.discosCantidad = discosCantidad;
    }

    public String getInformacion() {
        return informacion;
    }

    public void setInformacion(String informacion) {
        this.informacion = informacion;
    }

    @Override
    public String toString() {
        return "Teatro{" + super.toString() + "altavoces=" + altavoces + ", discosCantidad=" + discosCantidad + ", informacion=" + informacion + "\n";
    }
    
    
}
