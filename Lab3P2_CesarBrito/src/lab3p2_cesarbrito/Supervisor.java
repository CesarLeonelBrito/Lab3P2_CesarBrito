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
        this.setSalarioPromedio(salarioPromedio);
        this.setMetaPromedio(metaPromedio);
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
        int cont = 0;
        for (int i = 0; i < cajerosSupervisando.size(); i++) {
            cont += cajerosSupervisando.get(i).getSalario();
        }
        cont = cont / cajerosSupervisando.size();
        this.salarioPromedio = cont;
    }

    public int getMetaPromedio() {
        return metaPromedio;
    }

    public void setMetaPromedio(int metaPromedio) {
        int cont = 0;
        for (int i = 0; i < cajerosSupervisando.size(); i++) {
            cont += cajerosSupervisando.get(i).getMeta();
        }
        cont = cont / cajerosSupervisando.size();
        this.metaPromedio = cont;
    }

    @Override
    public String toString() {
        return "Supervisor{" + super.toString() + "cajerosSupervisando=" + cajerosSupervisando + ", salarioPromedio=" + salarioPromedio + ", metaPromedio=" + metaPromedio + '}';
    }
    
    
    
    
}
