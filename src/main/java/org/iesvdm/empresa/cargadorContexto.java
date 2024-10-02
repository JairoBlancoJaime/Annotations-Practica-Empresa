package org.iesvdm.empresa;

import org.iesvdm.anotacion.Empleado;
import java.util.List;

public class cargadorContexto {

    public static Empresa cargaContextoEmpresa() {

        Empleado[] empleadosAnotacion = Empresa.class.getAnnotationsByType(Empleado.class);


        return null;
    };
}
