package tic_tac_toe.tic_tac_toe;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DashboardButton implements ActionListener {

	private JButton btn;
	private GraphicApp window;

	public static String startGame ="X";

	/**
	 * Constructor
	 * 
	 * @param btn
	 */
	public DashboardButton (JButton btn, GraphicApp window) {
		this.btn = btn;
		this.window = window;
	}

	/**
	 * Action ...
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO completar mover ficha / quitar ficha de otro lado
		// Miramos si el juego ha empezado, en caso que los listeners estan activos
		if(window.isStarted()) {
			// Miramos que el jugador esta jugando en el turno que le toca
			if ((window.getTurn()==1 && window.getPlayer1().isPlaying()) || (window.getTurn()==2 && window.getPlayer2().isPlaying())) {
				// Comprovamos que el buton esta vacio
				if(btn.getText().compareTo("")==0) {
					btn.setText(startGame);
					// Jugador 2, juega con las X
					if(startGame.equalsIgnoreCase("X")){
						if(window.getPlayer2().maxTokens() == false) {
							btn.setForeground(Color.RED);
							startGame = "O";
							window.setStatusLabel(window.getPlayer1().getName() + " es tu turno XD");
							window.getPlayer1().addToken();
						} else {
							System.out.println("Fichas jugador 2 maximo");
						}
					}
					// Jugador 1, juega con las O
					else if (window.getPlayer1().maxTokens() == false) {
						btn.setForeground(Color.BLUE);
						startGame = "X";
						window.setStatusLabel(window.getPlayer2().getName() + " es tu turno XD");
						window.getPlayer2().addToken();
					}else {
						System.out.println("Fichas jugador 1 maximo");
					}
				} else {
					JOptionPane.showMessageDialog(null, "EPA! Que esta ocupadoo", "ERROR", 0);
				}
			} else {
				JOptionPane.showMessageDialog(null, "EPA! No es tu turno aunque nunca vas a ver esto.", "ERROR", 0);
			}
		} else {
			JOptionPane.showMessageDialog(null, "EPA! La partida no ha empezado aun.", "ERROR", 0);
		}
	}
}