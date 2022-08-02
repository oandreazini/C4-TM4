package tic_tac_toe.tic_tac_toe;

public class Control {
	private Player player1;
	private Player player2;
	
	/**
	 * Empty constructor
	 */
	public Control () {
		GraphicApp ventanaTictactoe = new GraphicApp();
	}
	
	/**
	 * Crear jugador
	 * 
	 * @param name
	 * @param cpu
	 * @param playing
	 * @param num
	 */
	public Player setPlayer(String name, boolean cpu, boolean playing, int num) {
		Player player = new Player(name, cpu, playing, num);
		return player;
	}
}
