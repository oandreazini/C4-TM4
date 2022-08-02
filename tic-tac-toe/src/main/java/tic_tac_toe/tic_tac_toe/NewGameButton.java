package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NewGameButton implements ActionListener {
	
	private GraphicApp window;
	
	/**
	 * Contructor para panel
	 * @param window
	 */
	public NewGameButton (GraphicApp window) {
		this.window = window;
		
	}
	/**
	 * Accion de resetear la partida a 0
	 */
	public void actionPerformed(ActionEvent e) {
		window.setAllDefault();
	}
	
	
}