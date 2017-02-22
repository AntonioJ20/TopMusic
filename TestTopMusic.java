package listadoEstructuras3SanchezSantacruzAntonioJesus;

import utiles.Menu;
import utiles.Teclado;

/**
 * TopMusic. Implementa un programa que gestione una lista de las canciones m�s
 * escuchadas. El usuario podr�: a. A�adir una canci�n (en una posici�n) al
 * TopMusic. b. Sacar un elemento del TopMusic. c. Subir un puesto en el
 * TopMusic. d. Bajar un puesto en el TopMusic. e. Mostrar la lista TopMusic. f.
 * Mostrar la canci�n m�s escuchada. Sobre la canci�n se almacenar� el t�tulo,
 * artista o grupo y a�o de grabaci�n.
 * 
 * @author Antonio Jes�s S�nchez Santacruz
 * @version 1.0
 *
 */
public class TestTopMusic {

	static TopMusic lista = new TopMusic();

	public static void main(String[] args) {
		String[] opciones = { "A�dir cancion (en una posicion) al TopMusic", "Sacar elemento del TopMusic",
				"Subir un puesto en el TopMusic", "Bajar un puesto en el TopMusic", "Mostrar la lista del TopMusic",
				"Mostrar la cancion mas escuchada", "Salir" };

		Menu menu = new Menu("\n---TOP MUSIC---", opciones);
		int opcion;

		do {
			opcion = menu.gestionar();

			switch (opcion) {
			case 1:
				addSong();
				break;

			case 2:
				deleteSong();

				break;

			case 3:
				upSong();
				break;

			case 4:
				downSong();
				break;

			case 5:
				showList();
				break;

			case 6:
				topList();
				break;

			default:
				System.out.println("Adios");
				break;
			}
		} while (opcion != 7);

	}// main()

	/**
	 * Muestra la cancion top de la lista. No la muestra si esta vacia
	 */
	private static void topList() {
		if (lista.isEmpty()) {
			System.out.println("La lista esta vacia. Por favor introduzca elementos.");
		} else {
			System.out.println("\nEl top de la lista es: " + lista.topLista());
		}
	}

	/**
	 * Muestra la lista si no esta vacia
	 */
	private static void showList() {
		if (lista.isEmpty()) {
			System.out.println("La lista esta vacia. Por favor introduzca elementos.");
		} else {
			System.out.println(lista.mostrarLista());
		}
	}

	/**
	 * Baja la cancion un puesto
	 */
	private static void downSong() {

		System.out.println(lista.bajarPuesto(lista.listarCanciones()));

	}

	/**
	 * Sube la cancion un puesto
	 */
	private static void upSong() {
		System.out.println(lista.subirPuesto(lista.listarCanciones()));
		
	}

	/**
	 * Si la lista no esta vacia, borra una cancion indicada por posicion
	 */
	private static void deleteSong() {
		if (lista.isEmpty()) {
			System.out.println("La lista esta vacia. Por favor introduzca elementos.");
		} else {
			System.out.println(lista.eliminarCancion(lista.listarCanciones()));
		}
	}

	/**
	 * A�ade una cancion a la lista siempre que la posicion sea valida
	 */
	private static void addSong() {
		int posicion;
		do {
			posicion = Teclado.leerEntero("\nIntroduzca la posicion deseada entre 1 y " + (lista.size() + 1) + ": ");
		} while (!lista.esPosicionValida(posicion - 1));
		System.out.println(lista.aniadirCancion(posicion - 1, crearCancion()));
	}

	/**
	 * Crea una nueva cancion
	 * 
	 * @return cancion creada
	 */
	private static Cancion crearCancion() {
		return new Cancion(Teclado.leerCadena("\nIntroduzca el titulo de la cancion: "),
				Teclado.leerCadena("\nIntroduzca el nombre del artista/grupo: "),
				Teclado.leerEntero("\nIntroduzca el a�o de la grabacion: "));
	}

}
