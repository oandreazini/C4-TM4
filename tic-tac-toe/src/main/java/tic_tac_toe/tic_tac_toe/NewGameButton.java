package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class NewGameButton implements ActionListener {

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
	
	/**
	 * Action ...
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO boton nueva partida poner todo en blanco
	}
	
	
}