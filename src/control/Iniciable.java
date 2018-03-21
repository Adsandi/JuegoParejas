package control;

public interface Iniciable {
	/**
	 * Desordena el tablero.
	 */
	public void desordenarTablero(Carta[][] tablero);
	
	/**
	 * Crea el tablero seg�n el n�mero de parejas.
	 * @param parejas n�mero de parejas.
	 */
	public void crearTablero(int parejas);
}
