package listadoEstructuras3SanchezSantacruzAntonioJesus;

/**
 * 
 * @author Antonio Jesús Sánchez Santacruz
 * @version 1.0
 *
 */
public class Cancion {

	/**
	 * Titulo de la cancion
	 */
	private String titulo;

	/**
	 * Artista de la cancion
	 */
	private String artista;

	/**
	 * Año de la cancion
	 */
	private int anioGrabacion;

	/**
	 * Constructor de la clase cancion
	 * 
	 * @param titulo
	 * @param artista
	 * @param anioGrabacion
	 */
	public Cancion(String titulo, String artista, int anioGrabacion) {
		setTitulo(titulo);
		setArtista(artista);
		setAnioGrabacion(anioGrabacion);
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	private void setArtista(String artista) {
		this.artista = artista;
	}

	private void setAnioGrabacion(int anioGrabacion) {
		this.anioGrabacion = anioGrabacion;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", artista=" + artista + ", anioGrabacion=" + anioGrabacion + "]";
	}

}
