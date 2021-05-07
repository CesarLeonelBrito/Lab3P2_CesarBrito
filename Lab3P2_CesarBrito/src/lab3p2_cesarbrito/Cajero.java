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
public class Cajero extends Empleado {

    private int years;
    private String horario;
    private String horaAlmuerzo;
    private int meta;
    private int cantidadEmpleados;

    public Cajero() {
        super();
    }

    public Cajero(int years, String horario, String horaAlmuerzo, int meta, int cantidadEmpleados, String nombre, String apellido, int salario, String nacionalidad, String username, String password) {
        super(nombre, apellido, salario, nacionalidad, username, password);
        this.years = years;
        this.horario = horario;
        this.horaAlmuerzo = horaAlmuerzo;
        this.meta = meta;
        this.cantidadEmpleados = cantidadEmpleados;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getHoraAlmuerzo() {
        return horaAlmuerzo;
    }

    public void setHoraAlmuerzo(String horaAlmuerzo) {
        this.horaAlmuerzo = horaAlmuerzo;
    }

    public int getMeta() {
        return meta;
    }

    public void setMeta(int meta) {
        this.meta = meta;
    }

    public int getCantidadEmpleados() {
        return cantidadEmpleados;
    }

    public void setCantidadEmpleados(int cantidadEmpleados) {
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public String toString() {
        return "Cajero{" + super.toString() + "years=" + years + ", horario=" + horario + ", horaAlmuerzo=" + horaAlmuerzo + ", meta=" + meta + ", cantidadEmpleados=" + cantidadEmpleados + '}';
    }

}