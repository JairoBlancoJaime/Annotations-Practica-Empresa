package org.iesvdm.empresa;

import org.iesvdm.anotacion.Empleado;
import org.iesvdm.anotacion.Empleados;

@Empleados({
        @Empleado(nombre = "Amancio", dni = "66554433F", direccion = "LA CORUÑA", telefono = "981185596", clase = "Directivo", numDespacho = 1),
        @Empleado(nombre = "Daniel", dni = "99887744S", direccion = "Madrid", telefono = "", clase = "Tecnico", numDespacho = 3),
        @Empleado(nombre = "Ricardo", dni = "11223344N", direccion = "", telefono = "985462225", clase = "Oficial", numDespacho = 8)
})

public class Empresa {



}
