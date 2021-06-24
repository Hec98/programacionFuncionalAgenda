package agenda;

import java.util.Arrays;
import java.util.List;

public class Agenda {

    public static void main(String[] args) {

        Usuarios u = new Usuarios();
        Altas al = new Altas();

        List<Datos> list = Arrays.asList(new Datos("Uriel", 555555555, "RTEO34567", 30),
                                         new Datos("Jorge", 222222233, "RTEO34564", 34),
                                         new Datos("Martha", 333333333, "5TEO34562", 50),
                                         new Datos("Azul", 444444433, "MTEO33567", 34),
                                         new Datos("Eduardo", 555555555, "RTEO34567", 30),
                                         new Datos("Juanes", 222222233, "RTEO34564", 34),
                                         new Datos("Hector", 333333333, "RTEO34562", 50),
                                         new Datos("Lina", 444444433, "ZTEO36567", 34));

        List<Datos> lista = u.getH(list);

        lista.stream().forEach(l -> System.out.println(l));
        
        lista.stream().forEach(l -> al.insertar(l.getNombre(), l.getTelefono(), l.getRfc(), l.getEdad()));
        
        System.out.println("Datos enviados a la base de datos");
    }
}
