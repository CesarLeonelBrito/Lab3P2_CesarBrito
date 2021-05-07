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
public class EquipoSonido extends Articulo {
    
    private int altavoces;
    private int potencia;
    private int puertosAuxiliares;
    private int discos;
    private int puertosUSB;

    public EquipoSonido() {
        super();
    }

    public EquipoSonido(int altavoces, int potencia, int puertosAuxiliares, int discos, int puertosUSB, int serie, int precio, String color, String garantia) {
        super(serie, precio, color, garantia);
        this.altavoces = altavoces;
        this.potencia = potencia;
        this.puertosAuxiliares = puertosAuxiliares;
        this.discos = discos;
        this.puertosUSB = puertosUSB;
    }

    public int getAltavoces() {
        return altavoces;
    }

    public void setAltavoces(int altavoces) {
        this.altavoces = altavoces;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getPuertosAuxiliares() {
        return puertosAuxiliares;
    }

    public void setPuertosAuxiliares(int puertosAuxiliares) {
        this.puertosAuxiliares = puertosAuxiliares;
    }

    public int getDiscos() {
        return discos;
    }

    public void setDiscos(int discos) {
        this.discos = discos;
    }

    public int getPuertosUSB() {
        return puertosUSB;
    }

    public void setPuertosUSB(int puertosUSB) {
        this.puertosUSB = puertosUSB;
    }

    @Override
    public String toString() {
        return "EquipoSonido{" + super.toString() + "altavoces=" + altavoces + ", potencia=" + potencia + ", puertosAuxiliares=" + puertosAuxiliares + ", discos=" + discos + ", puertosUSB=" + puertosUSB + "\n";
    }
    
    
}
