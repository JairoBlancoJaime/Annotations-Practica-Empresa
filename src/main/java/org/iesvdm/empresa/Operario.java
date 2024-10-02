package org.iesvdm.empresa;

public class Operario extends Empleado {

    Integer codigoTaller;

    public Operario(String nombre, String dni, String direccion, String telefono, String clase, int numDespacho, Integer codigoTaller) {
        super(nombre, dni, direccion, telefono, clase, numDespacho);
        this.codigoTaller = codigoTaller;
    }



    public Integer getCodigoTaller() {
        return codigoTaller;
    }

    public void setCodigoTaller(Integer codigoTaller) {
        this.codigoTaller = codigoTaller;
    }
}
