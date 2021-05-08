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
public class Empleado {

    private String nombre;
    private String apellido;
    private int salario;
    private String nacionalidad;
    private String username;
    private String password;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, int salario, String nacionalidad, String username, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.nacionalidad = nacionalidad;
        this.username = username;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", nacionalidad=" + nacionalidad + ", username=" + username + ", password=" + password ;
    }

}
