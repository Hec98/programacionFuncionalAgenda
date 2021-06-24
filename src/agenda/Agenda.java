package agenda;

import java.util.Arrays;
import java.util.List;

public class Agenda {

    public static void main(String[] args) {

        Usuarios u = new Usuarios();
        Insert in = new Insert();

        List<Datos> list = Arrays.asList(new Datos("Uriel", 555555555, "RTEO34567", 30),
                                         new Datos("Jorge", 222222233, "RTEO34564", 34),
                                         new Datos("Martha", 333333333, "RTEO34562", 50),
                                         new Datos("Azul", 444444433, "RTEO3ñ567", 34),
                                         new Datos("Eduardo", 555555555, "RTEO34567", 30),
                                         new Datos("Juanes", 222222233, "RTEO34564", 34),
                                         new Datos("Hector", 333333333, "RTEO34562", 50),
                                         new Datos("Lina", 444444433, "RTEO3ñ567", 34));

        // Datos p = u.getMPersona(list);

        List<Datos> l = u.getH(list);

        l.stream().forEach(x -> System.out.println(x));
        
        l.stream().forEach(x -> in.insertar(x.getNombre(), x.getTelefono(), x.getRfc(), x.getEdad()));
        
        System.out.println("Datos enviados a la base de datos");
        
        // System.out.println("\nUsuario: " + p.toString());
    }
}
