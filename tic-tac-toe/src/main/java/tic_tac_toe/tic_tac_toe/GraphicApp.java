package tic_tac_toe.tic_tac_toe;

import javax.swing.*;
import java.awt.Font;
import java.awt.Window;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

public class GraphicApp extends JFrame{
	
	private JPanel contentPane;
	private JTextField name1textField;
	private JTextField name2textField;
	
	private JRadioButton human1RadioButton;
	private JRadioButton cpu1RadioButton;
	private JRadioButton human2RadioButton;
	private JRadioButton cpu2RadioButton;
	
	private JButton btn_7;
	private JButton btn_8;
	private JButton btn_9;
	private JButton btn_4;
	private JButton btn_5;
	private JButton btn_6;
	private JButton btn_1;
	private JButton btn_2;
	private JButton btn_3;
	
	//Creo un nuevo grupo de botones
	private ButtonGroup ButtonGroup_1 = new ButtonGroup();
	private ButtonGroup ButtonGroup_2 = new ButtonGroup();
	

	
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
		
		btn_7 = new JButton("");
		btn_7.setBounds(30, 54, 85, 75);
		contentPane.add(btn_7);
		
		btn_8 = new JButton("");
		btn_8.setBounds(130, 54, 85, 75);
		contentPane.add(btn_8);
		
		btn_9 = new JButton("");
		btn_9.setBounds(234, 54, 85, 75);
		contentPane.add(btn_9);
		
		btn_4 = new JButton("");
		btn_4.setBounds(30, 139, 85, 75);
		contentPane.add(btn_4);
		
		btn_5 = new JButton("");
		btn_5.setBounds(130, 139, 85, 75);
		contentPane.add(btn_5);
		
		btn_6 = new JButton("");
		btn_6.setBounds(234, 139, 85, 75);
		contentPane.add(btn_6);
		
		btn_1 = new JButton("");
		btn_1.setBounds(30, 226, 85, 75);
		contentPane.add(btn_1);
		
		btn_2 = new JButton("");
		btn_2.setBounds(130, 224, 85, 75);
		contentPane.add(btn_2);
		
		btn_3 = new JButton("");
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
		
		human1RadioButton = new JRadioButton("Humano");
		human1RadioButton.setBounds(468, 157, 85, 21);
		contentPane.add(human1RadioButton);
		ButtonGroup_1.add(human1RadioButton);
		
		cpu1RadioButton = new JRadioButton("CPU");
		cpu1RadioButton.setBounds(567, 157, 85, 21);
		contentPane.add(cpu1RadioButton);
		ButtonGroup_1.add(cpu1RadioButton);
		
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
		
		human2RadioButton = new JRadioButton("Humano");
		human2RadioButton.setBounds(468, 280, 85, 21);
		contentPane.add(human2RadioButton);
		ButtonGroup_2.add(human2RadioButton);
		
		
		cpu2RadioButton = new JRadioButton("CPU");
		cpu2RadioButton.setBounds(567, 281, 85, 21);
		contentPane.add(cpu2RadioButton);
		ButtonGroup_2.add(cpu2RadioButton);
		
		/** Action Listeners */
		
		btn_1.addActionListener(new DashboardButton(btn_1));
		btn_2.addActionListener(new DashboardButton(btn_2));
		btn_3.addActionListener(new DashboardButton(btn_3));
		btn_4.addActionListener(new DashboardButton(btn_4));
		btn_5.addActionListener(new DashboardButton(btn_5));
		btn_6.addActionListener(new DashboardButton(btn_6));
		btn_7.addActionListener(new DashboardButton(btn_7));
		btn_8.addActionListener(new DashboardButton(btn_8));
		btn_9.addActionListener(new DashboardButton(btn_9));
		
		btnNewGame.addActionListener(new NewGameButton(this));

	}

	/**
	 * Pone los campos de los 2 jugadores en blanco
	 */
	public void setAllDefault() {
				
		ButtonGroup_1.clearSelection();
		ButtonGroup_2.clearSelection();

		name1textField.setText(null);
		name2textField.setText(null);

		btn_1.setText(null);
		btn_2.setText(null);
		btn_3.setText(null);
		btn_4.setText(null);
		btn_5.setText(null);
		btn_6.setText(null);
		btn_7.setText(null);
		btn_8.setText(null);
		btn_9.setText(null);
	}
	
	
	/**
	 * @return the contentPane
	 */
	public JPanel getContentPane() {
		return contentPane;
	}

	/**
	 * @return the name1textField
	 */
	public JTextField getName1textField() {
		return name1textField;
	}

	/**
	 * @return the name2textField
	 */
	public JTextField getName2textField() {
		return name2textField;
	}

	/**
	 * @return the human1RadioButton
	 */
	public JRadioButton getHuman1RadioButton() {
		return human1RadioButton;
	}

	/**
	 * @return the cpu1RadioButton
	 */
	public JRadioButton getCpu1RadioButton() {
		return cpu1RadioButton;
	}

	/**
	 * @return the human2RadioButton
	 */
	public JRadioButton getHuman2RadioButton() {
		return human2RadioButton;
	}

	/**
	 * @return the cpu2RadioButton
	 */
	public JRadioButton getCpu2RadioButton() {
		return cpu2RadioButton;
	}
	
	public JButton getBtn_7() {
		return btn_7;
	}

	public void setBtn_7(JButton btn_7) {
		this.btn_7 = btn_7;
	}

	public JButton getBtn_8() {
		return btn_8;
	}

	public void setBtn_8(JButton btn_8) {
		this.btn_8 = btn_8;
	}

	public JButton getBtn_9() {
		return btn_9;
	}

	public void setBtn_9(JButton btn_9) {
		this.btn_9 = btn_9;
	}

	public JButton getBtn_4() {
		return btn_4;
	}

	public void setBtn_4(JButton btn_4) {
		this.btn_4 = btn_4;
	}

	public JButton getBtn_5() {
		return btn_5;
	}

	public void setBtn_5(JButton btn_5) {
		this.btn_5 = btn_5;
	}

	public JButton getBtn_6() {
		return btn_6;
	}

	public void setBtn_6(JButton btn_6) {
		this.btn_6 = btn_6;
	}

	public JButton getBtn_1() {
		return btn_1;
	}

	public void setBtn_1(JButton btn_1) {
		this.btn_1 = btn_1;
	}

	public JButton getBtn_2() {
		return btn_2;
	}

	public void setBtn_2(JButton btn_2) {
		this.btn_2 = btn_2;
	}

	public JButton getBtn_3() {
		return btn_3;
	}

	public void setBtn_3(JButton btn_3) {
		this.btn_3 = btn_3;
	}
	
	
}
