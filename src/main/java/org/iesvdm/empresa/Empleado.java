package org.iesvdm.empresa;

public class Empleado {

    private String nombre;
    private String dni;
    private String direccion;
    private String telefono;
    private String clase;
    private int numDespacho;

    public Empleado(String nombre, String dni, String direccion, String telefono, String clase, int numDespacho) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.clase = clase;
        this.numDespacho = numDespacho;
    }
}
