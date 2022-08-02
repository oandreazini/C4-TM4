package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class ButtonAction implements ActionListener {

	private JButton btn;
	private Player player;
	
	public ButtonAction (JButton btn) {
		this.btn = btn;
	}
	
	public void actionPerformed(ActionEvent e) {
		// TODO completar
		if (btn.getText().compareTo("")==0) {
			if(player.isPlaying()) {
				
			}
		}

	}

}
