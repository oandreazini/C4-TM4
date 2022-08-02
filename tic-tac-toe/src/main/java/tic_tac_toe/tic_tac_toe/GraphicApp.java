package tic_tac_toe.tic_tac_toe;

import java.text.DecimalFormat;

import javax.swing.*;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class GraphicApp extends JFrame{
	
	private JPanel contentPane;
	private JTextField name1textField;
	private JTextField name2textField;

	
	/**
	 * Constructor ventana en blanco que llama a los otros elementos
	 */
	public GraphicApp() {
		
		setTitle("Tic Tac Toe");

		setBounds(700, 400, 697, 405);

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		setVisible(true);

		contentPane = new JPanel();

		contentPane.setLayout(null);

		setContentPane(contentPane);
		
		// Se llama a los otros elementos
		tictactoeElements();
	}
	
	public void tictactoeElements() {
		
		/* Botones cuadricula */
		
		JButton btn_7 = new JButton("O");
		btn_7.setToolTipText("");
		btn_7.setFont(new Font("Arial", Font.PLAIN, 55));
		btn_7.setBounds(30, 54, 85, 75);
		contentPane.add(btn_7);
		
		JButton btn_8 = new JButton("");
		btn_8.setBounds(130, 54, 85, 75);
		contentPane.add(btn_8);
		
		JButton btn_9 = new JButton("");
		btn_9.setBounds(234, 54, 85, 75);
		contentPane.add(btn_9);
		
		JButton btn_4 = new JButton("");
		btn_4.setBounds(30, 139, 85, 75);
		contentPane.add(btn_4);
		
		JButton btn_5 = new JButton("");
		btn_5.setBounds(130, 139, 85, 75);
		contentPane.add(btn_5);
		
		JButton btn_6 = new JButton("");
		btn_6.setBounds(234, 139, 85, 75);
		contentPane.add(btn_6);
		
		JButton btn_1 = new JButton("");
		btn_1.setBounds(30, 226, 85, 75);
		contentPane.add(btn_1);
		
		JButton btn_2 = new JButton("");
		btn_2.setBounds(130, 224, 85, 75);
		contentPane.add(btn_2);
		
		JButton btn_3 = new JButton("");
		btn_3.setBounds(234, 224, 85, 75);
		contentPane.add(btn_3);
		
		/* Boton nueva partida */
		
		JButton btnNewGame = new JButton("Nueva Partida");
		btnNewGame.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnNewGame.setBounds(176, 10, 132, 21);
		contentPane.add(btnNewGame);
		
		/* Boton empezar */
		
		JButton btnStart = new JButton("Empezar");
		btnStart.setFont(new Font("Arial Black", Font.PLAIN, 12));
		btnStart.setBounds(323, 11, 132, 21);
		contentPane.add(btnStart);
		
		
		/* Status */
		
		JLabel statusLabel = new JLabel("Rellena los campos y dale a empezar: ");
		statusLabel.setFont(new Font("Arial Black", Font.PLAIN, 11));
		statusLabel.setBounds(410, 54, 253, 13);
		contentPane.add(statusLabel);
		
		/* Jugador 1 */
		
		JLabel player1Label = new JLabel("Jugador 1");
		player1Label.setFont(new Font("Arial Black", Font.PLAIN, 11));
		player1Label.setBounds(410, 83, 64, 21);
		contentPane.add(player1Label);
		
		JLabel oLabel = new JLabel("O");
		oLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		oLabel.setBounds(613, 87, 28, 13);
		contentPane.add(oLabel);
		
		JLabel name1Label = new JLabel("Nombre:");
		name1Label.setFont(new Font("Arial Black", Font.PLAIN, 10));
		name1Label.setBounds(410, 114, 64, 21);
		contentPane.add(name1Label);
		
		name1textField = new JTextField();
		name1textField.setBounds(468, 114, 173, 19);
		contentPane.add(name1textField);
		name1textField.setColumns(10);
		
		JLabel tipe1Label = new JLabel("Tipo:");
		tipe1Label.setFont(new Font("Arial Black", Font.PLAIN, 10));
		tipe1Label.setBounds(410, 161, 45, 13);
		contentPane.add(tipe1Label);
		
		JRadioButton human1RadioButton = new JRadioButton("Humano");
		human1RadioButton.setBounds(468, 157, 85, 21);
		contentPane.add(human1RadioButton);
		
		JRadioButton cpu1RadioButton = new JRadioButton("CPU");
		cpu1RadioButton.setBounds(567, 157, 85, 21);
		contentPane.add(cpu1RadioButton);
		
		/* Jugador 2 */
		
		JLabel player2Label = new JLabel("Jugador 2");
		player2Label.setFont(new Font("Arial Black", Font.PLAIN, 11));
		player2Label.setBounds(410, 209, 64, 21);
		contentPane.add(player2Label);
		
		JLabel xLabel = new JLabel("X");
		xLabel.setEnabled(false);
		xLabel.setFont(new Font("Arial Black", Font.PLAIN, 12));
		xLabel.setBounds(613, 214, 28, 13);
		contentPane.add(xLabel);
		
		JLabel name2Label = new JLabel("Nombre:");
		name2Label.setFont(new Font("Arial Black", Font.PLAIN, 10));
		name2Label.setBounds(410, 240, 64, 21);
		contentPane.add(name2Label);
		
		name2textField = new JTextField();
		name2textField.setColumns(10);
		name2textField.setBounds(468, 241, 173, 19);
		contentPane.add(name2textField);
		
		JLabel tipe2Label = new JLabel("Tipo:");
		tipe2Label.setFont(new Font("Arial Black", Font.PLAIN, 10));
		tipe2Label.setBounds(410, 285, 45, 13);
		contentPane.add(tipe2Label);
		
		JRadioButton human2RadioButton = new JRadioButton("Humano");
		human2RadioButton.setBounds(468, 280, 85, 21);
		contentPane.add(human2RadioButton);
		
		JRadioButton cpu2RadioButton = new JRadioButton("CPU");
		cpu2RadioButton.setBounds(567, 281, 85, 21);
		contentPane.add(cpu2RadioButton);
		
		btn_7.addActionListener(new DashboardButton(btn_7));

	}
}
