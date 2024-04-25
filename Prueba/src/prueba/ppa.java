package prueba;

import java.util.ArrayList;
import java.util.List;

public class ppa {

	public static void main(String[] args) {

		List<PuedeSaltar> lista = new ArrayList<PuedeSaltar>();

		saltarTodos(lista);
	}

	public static void saltarTodos(List<PuedeSaltar> lista) {
		for (PuedeSaltar puedeSaltar : lista) {
			puedeSaltar.saltarHaciaAdelante();
		}
	}
}
