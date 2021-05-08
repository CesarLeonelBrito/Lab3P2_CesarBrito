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
public class Supervisor extends Empleado {

    private ArrayList<Cajero> cajerosSupervisando = new ArrayList();
    private int salarioPromedio;
    private int metaPromedio;

    public Supervisor() {
        super();
    }

    public Supervisor(int salarioPromedio, int metaPromedio, String nombre, String apellido, int salario, String nacionalidad, String username, String password) {
        super(nombre, apellido, salario, nacionalidad, username, password);
        this.salarioPromedio = salarioPromedio;
        this.metaPromedio = metaPromedio;
    }

    public ArrayList<Cajero> getCajerosSupervisando() {
        return cajerosSupervisando;
    }

    public void setCajerosSupervisando(ArrayList<Cajero> cajerosSupervisando) {
        this.cajerosSupervisando = cajerosSupervisando;
    }

    public int getSalarioPromedio() {
        return salarioPromedio;
    }

    public void setSalarioPromedio(int salarioPromedio) {
        this.salarioPromedio = salarioPromedio;
    }

    public int getMetaPromedio() {
        return metaPromedio;
    }

    public void setMetaPromedio(int metaPromedio) {
        this.metaPromedio = metaPromedio;
    }

    @Override
    public String toString() {
        return "Supervisor{" + super.toString() + ", salarioPromedio=" + salarioPromedio + ", metaPromedio=" + metaPromedio + "\ncajerosSupervisando=" + cajerosSupervisando ;
    }

}
