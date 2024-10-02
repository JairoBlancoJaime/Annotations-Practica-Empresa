package org.iesvdm.anotacion;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(Empleados.class)
@Documented

public @interface Empleado {

    String nombre();
    String dni();
    String direccion() default "NO_ESPECIFICA";
    String telefono();
    String clase();
    int numDespacho();

}
