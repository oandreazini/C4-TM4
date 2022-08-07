package tic_tac_toe.tic_tac_toe;

import java.awt.Color;

public class Player {

	private String name;
	private boolean cpu;
	private boolean playing;
	private String token;
	private int num;
	private int tokens = 0;

	/**
	 * @param name
	 * @param cpu
	 * @param playing
	 * @param num
	 */
	public Player(String name, boolean cpu, boolean playing, int num, String token) {
		this.name = name;
		this.cpu = cpu;
		this.playing = playing;
		this.num = num;
		this.token = token;
	}

	/* Methods of the class */

	/**
	 * Return if the player has the max number of tokens playing in the game or not
	 * 
	 * @return
	 */
	public boolean maxTokens() {
		boolean max = false;
		if (this.tokens == 3) {
			max = true;
		}
		return max;
	}

	/* CPU Movements */
	/**
	 * Movimiento de la CPU de manera aleatoria entre las 9 casillas. Es recursiva
	 * hasta que encuentra una casilla libre.
	 * 
	 * @param window
	 */
	public void movementCpu(GraphicApp window) {
		// Si el juego ha empezado y el jugador es CPU
		if (window.isStarted() && this.isCpu() == true && this.isPlaying()) {

			// Generamos un número aleatorio del 1 al 9 para saber cual boton pulsara la CPU
			int rn = (int) (Math.random() * ((9 - 1) + 1)) + 1;

			// Tenemos un case para cada numero aleatorio generado (boton del 1 al 9)
			switch (rn) {
			case 1:
				// Se comprueba si el boton aleatorio está libre y el jugador no tiene el maximo
				// de tokens
				if (window.getBtn_1().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					// Hace click en la casilla
					window.getBtn_1().doClick();
					// Sale del condicional
					break;
				}
				// Se comprueba si el aleatorio generado es una casilla con un token del jugador
				// y se ha alcanzado el maximo de tokens
				if (window.getBtn_1().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					// Se hace click en la casilla O para eliminar el token del boton
					window.getBtn_1().doClick();
					break;
				}
				movementCpu(window);
			case 2:
				if (window.getBtn_2().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_2().doClick();
					break;
				}
				if (window.getBtn_2().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_2().doClick();
					break;
				}
				movementCpu(window);
			case 3:
				if (window.getBtn_3().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_3().doClick();
					break;
				}
				if (window.getBtn_3().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_3().doClick();
					break;
				}
				movementCpu(window);
			case 4:
				if (window.getBtn_4().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_4().doClick();
					break;
				}
				if (window.getBtn_4().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_4().doClick();
					break;
				}
				movementCpu(window);
			case 5:
				if (window.getBtn_5().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_5().doClick();
					break;
				}
				if (window.getBtn_5().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_5().doClick();
					break;
				}
				movementCpu(window);
			case 6:
				if (window.getBtn_6().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_6().doClick();
					break;
				}
				if (window.getBtn_6().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_6().doClick();
					break;
				}
				movementCpu(window);
			case 7:
				if (window.getBtn_7().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_7().doClick();
					break;
				}
				if (window.getBtn_7().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_7().doClick();
					break;
				}
				movementCpu(window);
			case 8:
				if (window.getBtn_8().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_8().doClick();
					break;
				}
				if (window.getBtn_8().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_8().doClick();
					break;
				}
				movementCpu(window);
			case 9:
				if (window.getBtn_9().getText().compareToIgnoreCase("") == 0 && this.maxTokens() == false) {
					window.getBtn_9().doClick();
					break;
				}
				if (window.getBtn_9().getText().compareToIgnoreCase(this.getToken()) == 0 && this.maxTokens() == true) {
					window.getBtn_9().doClick();
					break;
				}
				movementCpu(window);
			}
		}
	}

	/* Getters and Setters */
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the cpu
	 */
	public boolean isCpu() {
		return cpu;
	}

	/**
	 * @param cpu the cpu to set
	 */
	public void setCpu(boolean cpu) {
		this.cpu = cpu;
	}

	/**
	 * @return the playing
	 */
	public boolean isPlaying() {
		return playing;
	}

	/**
	 * @param playing the playing to set
	 */
	public void setPlaying(boolean playing) {
		this.playing = playing;
	}

	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}

	/**
	 * Adds 1 token
	 */
	public void addToken() {
		this.tokens++;
	}

	/**
	 * Minus 1 token
	 */
	public void subToken() {
		this.tokens--;
	}

	/**
	 * @return the tokens
	 */
	public int getTokens() {
		return tokens;
	}

	/**
	 * @param tokens the tokens to set
	 */
	public void setTokens(int tokens) {
		this.tokens = tokens;
	}

	/**
	 * @return the token
	 */
	public String getToken() {
		return token;
	}

	/**
	 * @param token the token to set
	 */
	public void setToken(String token) {
		this.token = token;
	}
}