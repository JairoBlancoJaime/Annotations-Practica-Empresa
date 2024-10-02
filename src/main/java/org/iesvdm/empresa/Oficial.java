package org.iesvdm.empresa;

public class Oficial extends Operario{

    String categoria;

    public Oficial(String nombre, String dni, String direccion, String telefono, String clase, int numDespacho, Integer codigoTaller, String categoria) {
        super(nombre, dni, direccion, telefono, clase, numDespacho, codigoTaller);
        this.categoria = categoria;
    }



    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
