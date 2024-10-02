package org.iesvdm.empresa;

public class Directivo extends Empleado {

    Integer codigoDespacho;

    public Directivo(String nombre, String dni, String direccion, String telefono, String clase, int numDespacho, Integer codigoDespacho) {
        super(nombre, dni, direccion, telefono, clase, numDespacho);
        this.codigoDespacho = codigoDespacho;
    }



    public Integer getCodigoDespacho() {
        return codigoDespacho;
    }

    public void setCodigoDespacho(Integer codigoDespacho) {
        this.codigoDespacho = codigoDespacho;
    }
}
