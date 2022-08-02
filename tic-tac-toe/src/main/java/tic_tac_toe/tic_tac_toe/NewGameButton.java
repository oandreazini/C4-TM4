package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NewGameButton implements ActionListener {
	
	private GraphicApp window;
	private JButton btn;
	private Player player;
	
	/**
	 * Constructor
	 * 
	 * @param btn
	 */
	public NewGameButton (JButton btn) {
		this.btn = btn;
	}
	
	public NewGameButton (GraphicApp window) {
		this.window = window;
		
	}
	/**
	 * Accion de resetear la partida a 0
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO boton nueva partida poner todo en blanco
		
		if(this.window == e.getSource()) {
			window.setAllDefault();
		}
	}
	
	
}