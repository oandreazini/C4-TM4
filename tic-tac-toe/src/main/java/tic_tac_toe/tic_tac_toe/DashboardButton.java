package tic_tac_toe.tic_tac_toe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class DashboardButton implements ActionListener {

	private JButton btn;
	private GraphicApp window;
	
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
		if(window.isStarted()) {
			if ((window.getTurn()==1 && window.getPlayer1().isPlaying()) || (window.getTurn()==2 && window.getPlayer2().isPlaying())) {
				if(btn.getText().compareTo("")==0) {
					System.out.println("Boton apretado.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "EPA! No es tu turno aunque nunca vas a ver esto.", "ERROR", 0);
			}
		} else {
			JOptionPane.showMessageDialog(null, "EPA! La partida no ha empezado aun.", "ERROR", 0);
		}
	}
	
	
}