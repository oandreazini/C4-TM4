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
	 * Logica de cuando el boton es apretado: - Realiza diversas comprobaciones de
	 * la partida - Cambia las acciones segun el jugador que ha apretado el botón
	 */
	public void actionPerformed(ActionEvent e) {
		// Miramos si el juego ha empezado
		if (window.isStarted()) {

			// Miramos que el jugador esta jugando en el turno que le toca
			if ((window.getTurn() == 1 && window.getPlayer1().isPlaying())
					|| (window.getTurn() == 2 && window.getPlayer2().isPlaying())) {

				// Jugador 2, (X)
				if (startGame.equalsIgnoreCase("X")) {

					// Miramos si Jugador 2 tiene maximo de fichas (3)
					if (window.getPlayer2().maxTokens() == false) {

						// Comprobamos que el button esta vacio
						if (btn.getText().compareTo("") == 0) {
							// Se añade texto al boton igual al texto del jugador jugando (O o X)
							btn.setText(startGame);
							btn.setForeground(Color.RED);

							// Se añade un token al jugador
							window.getPlayer2().addToken();

							// Se cambia al otro jugador la letra de turno (en este se pasa de X a O)
							startGame = "O";
							window.setTurn(1);
							window.getPlayer1().setPlaying(true);
							window.getPlayer2().setPlaying(false);

							// Se cambia el label de status
							window.setStatusLabel(window.getPlayer1().getName() + " es tu turno.");

							// Se comprueba si se ha ganado
							boolean winner = window.winner();

							// Comprobamos si el siguiente jugador es CPU y aún no hay ganador
							if (!winner && window.getPlayer1().isCpu()) {
								// En ese caso se ejecuta el movimiento del jugador
								window.getPlayer1().movementCpu(window);
							}

						} else {
							// Si se toca una casilla ya ocupada por una ficha
							JOptionPane.showMessageDialog(null, "EPA! Que esta ocupaoo", "ERROR", 0);
						}
					} else {
						// Maximo de fichas alcanzado, hay que mover las ya existentes
						deleteToken(window.getPlayer2());

						// Ahora que el jugador ha borrado una ficha ya puede colocar otra
						// Comprobamos si el jugador que acaba de apretar el boton es CPU
						if (window.getPlayer2().isCpu()) {
							// En ese caso se ejecuta el movimiento del jugador CPU
							window.getPlayer2().movementCpu(window);
						}
					}

					// Jugador 1, (O) (mismo procedimiento que para el jugador 2 pero contrario)
				} else {

					if (window.getPlayer1().maxTokens() == false) {

						if (btn.getText().compareTo("") == 0) {
							btn.setText(startGame);
							btn.setForeground(Color.BLUE);
							window.getPlayer1().addToken();

							startGame = "X";
							window.setTurn(2);
							window.getPlayer1().setPlaying(false);
							window.getPlayer2().setPlaying(true);
							window.setStatusLabel(window.getPlayer2().getName() + " es tu turno.");
							boolean winner = window.winner();

							if (!winner && window.getPlayer2().isCpu()) {
								window.getPlayer2().movementCpu(window);
							}

						} else {
							JOptionPane.showMessageDialog(null, "EPA! Que esta ocupaoo", "ERROR", 0);
						}
					} else {
						deleteToken(window.getPlayer1());
						if (window.getPlayer1().isCpu()) {
							window.getPlayer1().movementCpu(window);
						}

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
		// Se comprueba que el boton que se quiere limpiar contiene un token del jugador
		// que esta jugando
		if (btn.getText().compareToIgnoreCase(startGame) == 0) {
			btn.setText("");
			player.subToken();
		}
	}
}