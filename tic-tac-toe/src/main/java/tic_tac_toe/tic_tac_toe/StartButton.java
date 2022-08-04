package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class StartButton implements ActionListener {

	private GraphicApp window;

	/**
	 * Constructor
	 * 
	 * @param btn
	 */
	public StartButton(GraphicApp window) {
		this.window = window;
	}

	/**
	 * Action create the 2 players with the data introduced and start the turn
	 */
	public void actionPerformed(ActionEvent e) {
		// Check de si se ha seleccionado Humano o CPU (obligatorio antes de empezar la
		// partida)
		if ((!window.getCpu1RadioButton().isSelected() && !window.getHuman1RadioButton().isSelected())
				|| (!window.getCpu2RadioButton().isSelected() && !window.getHuman2RadioButton().isSelected())) {

			JOptionPane.showMessageDialog(null, "ERROR! Has de seleccionar mínimo una opción entre Humano o CPU.",
					"ERROR", 0);
		} else {
			// We initialize variables to create a player
			String name;
			boolean cpu = false;
			boolean playing = false;
			int num = 0;
			Player player1;
			Player player2;

			// We create the first player
			if (window.getCpu1RadioButton().isSelected()) {
				cpu = true;
			}
			// Si no se ha introducido ningun nombre, el nombre por defecto sera Jugador 1
			if (window.getName1textField().getText().compareTo("") == 0) {
				player1 = new Player("Jugador 1", cpu, playing, num);
			} else {
				name = window.getName1textField().getText();
				player1 = new Player(name, cpu, playing, num);
			}

			// We create the second player
			if (window.getCpu2RadioButton().isSelected()) {
				cpu = true;
			}
			// Si no se ha introducido ningun nombre, el nombre por defecto sera Jugador 2
			if (window.getName2textField().getText().compareTo("") == 0) {
				player2 = new Player("Jugador 2", cpu, playing, num);
			} else {
				name = window.getName2textField().getText();
				player2 = new Player(name, cpu, playing, num);
			}

			// Quien empieza?
			int rn = (int) (Math.random() * ((2 - 1) + 1)) + 1;

			if (rn == 1) {
				player1.setPlaying(true);
				DashboardButton.startGame = "O";
			} else {
				player2.setPlaying(true);
				DashboardButton.startGame = "X";

			}
			window.setTurn(rn);

			// Guardamos los jugadores creados
			window.setPlayer1(player1);
			window.setPlayer2(player2);

			// Cambiamos mensaje de estado
			if (player1.isPlaying()) {
				window.setStatusLabel(player1.getName() + " es tu turno xD.");
			} else {
				window.setStatusLabel(player2.getName() + " es tu turno xD.");
			}

			// Empieza el juego
			window.setStarted(true);
		}

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