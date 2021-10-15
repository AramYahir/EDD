/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.modelo;

/**
 *
 * @author aramy
 */
public class Empleado {
    private int id;
    private String nombre;
    private String Paterno;
    private String materno;
    private float sueldoBas;
    private int anioIngreso;
    private int horasExtra;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String Paterno, String materno, float sueldoBas, int anioIngreso, int horasExtra) {
        this.id = id;
        this.nombre = nombre;
        this.Paterno = Paterno;
        this.materno = materno;
        this.sueldoBas = sueldoBas;
        this.anioIngreso = anioIngreso;
        this.horasExtra = horasExtra;
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public float getSueldoBas() {
        return sueldoBas;
    }

    public void setSueldoBas(float sueldoBas) {
        this.sueldoBas = sueldoBas;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", Paterno=" + Paterno + ", materno=" + materno + ", sueldoBas=" + sueldoBas + ", anioIngreso=" + anioIngreso + ", horasExtra=" + horasExtra + '}';
    }
    
    
    
    
}
