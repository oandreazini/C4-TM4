package tic_tac_toe.tic_tac_toe;

public class Control {
	private Player player;
	
	/**
	 * Empty constructor
	 */
	public Control () {
		
	}
	
	/**
	 * Crear jugador
	 * 
	 * @param name
	 * @param cpu
	 * @param playing
	 * @param num
	 */
	public void setPlayer(String name, boolean cpu, boolean playing, int num) {
		Player player = new Player(name, cpu, playing, num);
		this.player = player;
	}
}
