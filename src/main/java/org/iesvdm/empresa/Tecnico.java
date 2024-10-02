package org.iesvdm.empresa;

public class Tecnico extends Operario{

    String perfil;

    public Tecnico(String nombre, String dni, String direccion, String telefono, String clase, int numDespacho, Integer codigoTaller, String perfil) {
        super(nombre, dni, direccion, telefono, clase, numDespacho, codigoTaller);
        this.perfil = perfil;
    }



    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }
}
