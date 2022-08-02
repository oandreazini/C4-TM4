package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class DashboardButton implements ActionListener {

	private JButton btn;
	private Player player;
	
	/**
	 * Constructor
	 * 
	 * @param btn
	 */
	public DashboardButton (JButton btn) {
		this.btn = btn;
	}
	
	/**
	 * Action ...
	 */
	public void actionPerformed(ActionEvent e) {
		// TODO completar mover ficha / quitar ficha de otro lado
		if (btn.getText().compareTo("")==0) {
			if(player.isPlaying()) {
				//TODO
			}
		}
	}
	
	
}