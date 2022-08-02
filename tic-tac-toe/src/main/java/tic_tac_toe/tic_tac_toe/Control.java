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
	public Player createPlayer(String name, boolean cpu, boolean playing, int num) {
		Player player = new Player(name, cpu, playing, num);
		return player;
	}
	
	/**
	 * Sets the first player
	 * 
	 * @param player
	 */
	public void setPlayer1(Player player) {
		this.player1 = player;
	}
	
	/**
	 * Sets the second player
	 * 
	 * @param player
	 */
	public void setPlayer2(Player player) {
		this.player2 = player;
	}
}
