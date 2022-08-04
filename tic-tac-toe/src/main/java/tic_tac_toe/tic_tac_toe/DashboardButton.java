package tic_tac_toe.tic_tac_toe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DashboardButton implements ActionListener {

	private JButton btn;
	private GraphicApp window;

	public static String startGame = "X";

	/**
	 * Constructor
	 * 
	 * @param btn
	 */
	public DashboardButton(JButton btn, GraphicApp window, int numButton) {
		this.btn = btn;
		this.window = window;
	}

	/**
	 * Action ...
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO completar mover ficha / quitar ficha de otro lado
		// Miramos si el juego ha empezado
		if (window.isStarted()) {

			// Miramos que el jugador esta jugando en el turno que le toca
			if ((window.getTurn() == 1 && window.getPlayer1().isPlaying())
					|| (window.getTurn() == 2 && window.getPlayer2().isPlaying())) {

				// Comprueba Jugador 2, (X)
				if (startGame.equalsIgnoreCase("X")) {

					// Miramos si Jugador 2 tiene maximo de fichas (3)
					if (window.getPlayer2().maxTokens() == false ) {

						// Comprobamos que el buton esta vacio
						if (btn.getText().compareTo("") == 0) {
							btn.setText(startGame);
							btn.setForeground(Color.RED);
							window.getPlayer2().addToken();
							startGame = "O";
							window.setStatusLabel(window.getPlayer1().getName() + " es tu turno.");
							boolean winner = window.winner();
							
							// Comprobamos si el siguiente jugador es CPU y no hay ganador
							if(!winner && window.getPlayer1().isCpu()) {
								window.getPlayer1().movementCpu(window);
							}

						} else {
							// Si se toca una casilla ya ocupada por una ficha
							JOptionPane.showMessageDialog(null, "EPA! Que esta ocupaoo", "ERROR", 0);
						}
					} else {
						// Maximo de fichas alcanzado, hay que mover las ya existentes
						deleteToken(window.getPlayer2());
					}

					// Comprueba Jugador 1, (O)
				} else {

					// Miramos si jugador 1 tiene maximo de fichas
					if (window.getPlayer1().maxTokens() == false) {

						if (btn.getText().compareTo("") == 0) {
							btn.setText(startGame);
							btn.setForeground(Color.BLUE);
							window.getPlayer1().addToken();
							startGame = "X";
							window.setStatusLabel(window.getPlayer2().getName() + " es tu turno.");
							boolean winner = window.winner();
							
							if(!winner && window.getPlayer2().isCpu()) {
								window.getPlayer2().movementCpu(window);
							}

						} else {
							JOptionPane.showMessageDialog(null, "EPA! Que esta ocupaoo", "ERROR", 0);
						}
					} else {
						deleteToken(window.getPlayer1());
					}
				}

			} else {
				// En caso que algun jugador juegue en un turno que no le toca
				JOptionPane.showMessageDialog(null, "EPA! No es tu turno aunque nunca vas a ver esto.", "ERROR", 0);
			}
		} else {
			// En caso que la partida no haya empezado
			JOptionPane.showMessageDialog(null, "EPA! La partida no ha empezado aun.", "ERROR", 0);
		}
		
	}

	/**
	 * Cuando cada jugador ya tiene 3 fichas en juego, se tiene que borrar una para
	 * poder colocarla en otra casilla
	 * 
	 * @param player
	 */
	public void deleteToken(Player player) {
		if (btn.getText().compareToIgnoreCase(startGame) == 0) {
			btn.setText("");
			player.subToken();
		}
	}
}