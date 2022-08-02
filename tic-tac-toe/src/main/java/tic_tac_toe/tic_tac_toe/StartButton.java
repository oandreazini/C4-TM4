package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartButton implements ActionListener {

	private GraphicApp window;
	private Player player1;
	private Player player2;
	private boolean pressed = false;
	
	/**
	 * Constructor
	 * 
	 * @param btn
	 */
	public StartButton (GraphicApp window) {
		this.window = window;
	}
	
	/**
	 * Action create the 2 players with the data introduced and start the turn
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO boton empezar (crear 2 jugadores con los datos)
		buttonPressed();
		
		// We initialize variables to create a player
		String name;
		boolean cpu = false;
		boolean playing = false;
		int num = 0;
		
		// We create the first player
		if(window.getCpu1RadioButton().isSelected()) {
			cpu = true;
		}
		name = window.getName1textField().getText();
		Player player = new Player(name, cpu, playing, num);
		this.player1 = player;
		
		// We create the second player
		if(window.getCpu2RadioButton().isSelected()) {
			cpu = true;
		}
		name = window.getName2textField().getText();
		
		player = new Player(name, cpu, playing, num);
		this.player2 = player;
	}
	
	/**
	 * Sets the attribute pressed to true
	 */
	public void buttonPressed() {
		this.pressed = true;
	}
	
	/**
	 * Returns pressed status
	 * 
	 * @return
	 */
	public boolean isPressed() {
		return this.pressed;
	}
	
	/**
	 * Sets the attribute pressed to false
	 */
	public void buttonNotPressed() {
		this.pressed = false;
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
}