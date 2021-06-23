package agenda;

import java.util.List;
import java.util.stream.Collectors;

public class Usuarios implements ObterUsuario, ObtenerUsuarios {
	public List<Datos> getH(List<Datos> list) {
		return list.stream().collect(Collectors.toList());	
	}
	
	
        
        public Datos getMPersona(List<Datos> lista) {
		return lista.stream().min((a,b) -> a.getEdad() - b.getEdad()).get();
	}
}