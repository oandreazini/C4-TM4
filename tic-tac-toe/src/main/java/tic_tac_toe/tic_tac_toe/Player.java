package tic_tac_toe.tic_tac_toe;

import java.awt.Color;

public class Player {

	private String name;
	private boolean cpu;
	private boolean playing;
	private int num;
	private int tokens = 0;

	/**
	 * @param name
	 * @param cpu
	 * @param playing
	 * @param num
	 */
	public Player(String name, boolean cpu, boolean playing, int num) {
		this.name = name;
		this.cpu = cpu;
		this.playing = playing;
		this.num = num;
	}

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

	/**
	 * Movimiento de la CPU de manera aleatoria entre las 9 casillas. Es recursiva
	 * hasta que encuentra un casilla libre.
	 * 
	 * @param window
	 */
	public void movementCpu(GraphicApp window) {
		// Generamos un número aleatorio del 1 al 9 para saber cual boton pulsara la CPU
		if (window.isStarted() && (window.getPlayer1().isCpu() == true || window.getPlayer2().isCpu() == true)) {

			int rn = (int) (Math.random() * ((9 - 1) + 1)) + 1;
			System.out.println(rn);
			switch (rn) {
			case 1:
				if (window.getBtn_1().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_1().doClick();
					break;
				}else if (window.getBtn_1().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
						window.getBtn_1().doClick();
						break;
				}
				if(window.getBtn_1().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
					window.getBtn_1().doClick();
					removeCpu(window);
					break;
				} else if (window.getBtn_1().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
					window.getBtn_1().doClick(); 
					removeCpu(window);
					break;
				} 
				movementCpu(window);
				break;
			case 2:
				if (window.getBtn_2().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_2().doClick();
					break;
				} else if (window.getBtn_2().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
					window.getBtn_2().doClick();
					break;
				}
				if(window.getBtn_2().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
					window.getBtn_2().doClick();
					removeCpu(window);
					break;
				} else if (window.getBtn_2().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
					window.getBtn_2().doClick(); 
					removeCpu(window);
					break;
				}
				movementCpu(window);
				break;
			case 3:
				if (window.getBtn_3().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_3().doClick();
					break;
				}else if (window.getBtn_3().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
						window.getBtn_3().doClick();
						break;
				}
				if(window.getBtn_3().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
					window.getBtn_3().doClick();
					removeCpu(window);
					break;
				} else if (window.getBtn_3().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
					window.getBtn_3().doClick(); 
					removeCpu(window);
					break;
				} 
				movementCpu(window);
				break;
			case 4:
				if (window.getBtn_4().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_4().doClick();
					break;
				} else if (window.getBtn_4().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
						window.getBtn_4().doClick();
						break;
				}
				if(window.getBtn_4().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
					window.getBtn_4().doClick();
					removeCpu(window);
					break;
				} else if (window.getBtn_4().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
					window.getBtn_4().doClick(); 
					removeCpu(window);
					break;
				} 
				movementCpu(window);
				break;
			case 5:
				if (window.getBtn_5().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_5().doClick();
					break;
				} else if (window.getBtn_5().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
					window.getBtn_5().doClick();
					break;
				}
					if(window.getBtn_5().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
						window.getBtn_5().doClick();
						removeCpu(window);
						break;
					} else if (window.getBtn_5().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
						window.getBtn_5().doClick(); 
						removeCpu(window);
				} 
				movementCpu(window);
				break;
			case 6:
				if (window.getBtn_6().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_6().doClick();
					break;
				}else if (window.getBtn_6().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
					window.getBtn_6().doClick();
					break;
				}
					if(window.getBtn_6().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
						window.getBtn_6().doClick();
						removeCpu(window);
						break;
					} else if (window.getBtn_6().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
						window.getBtn_6().doClick(); 
						removeCpu(window);
						break;
					} 
				movementCpu(window);
				break;
				
			case 7:
				if (window.getBtn_7().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_7().doClick();
					break;
				} else if (window.getBtn_7().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
					window.getBtn_7().doClick();
					break;
				}
					if(window.getBtn_7().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
						window.getBtn_7().doClick();
						removeCpu(window);
						break;
					} else if (window.getBtn_7().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
						window.getBtn_7().doClick(); 
						removeCpu(window);
						break;
					} 
				movementCpu(window);
				break;
			case 8:
				if (window.getBtn_8().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_8().doClick();
					break;
				} else if (window.getBtn_8().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
					window.getBtn_8().doClick();
					break;
				}
				if(window.getBtn_8().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
					window.getBtn_8().doClick();
					removeCpu(window);
					break;
					} else if (window.getBtn_8().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
						window.getBtn_8().doClick(); 
						removeCpu(window);
						break;
					} 
				movementCpu(window);
				break;
			case 9:
				if (window.getBtn_9().getText().compareToIgnoreCase("") == 0 && window.getPlayer1().maxTokens() == false) {
					window.getBtn_9().doClick();
					break;
				} else if (window.getBtn_9().getText().compareToIgnoreCase("") == 0 && window.getPlayer2().maxTokens() == false) {
					window.getBtn_9().doClick();
					break;
				}
				if(window.getBtn_9().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().maxTokens() == true) {
					window.getBtn_9().doClick();
					removeCpu(window);
					break;
					} else if (window.getBtn_9().getText().compareToIgnoreCase("X") == 0 && window.getPlayer2().maxTokens() == true) {
						window.getBtn_9().doClick(); 
						removeCpu(window);
						break;
				}
				movementCpu(window);
				break;
			}
		}
	}

	public void removeCpu(GraphicApp window) {
		// Generamos un número aleatorio del 1 al 9 para saber cual boton pulsara la CPU
		// y eliminarlo cuando esta lleno
		if (window.isStarted() && (window.getPlayer1().isCpu() == true || window.getPlayer2().isCpu() == true)) {

			int rn = (int) (Math.random() * ((9 - 1) + 1)) + 1;
			System.out.println("remove " + rn);

			switch (rn) {
			case 1:
				if (window.getBtn_1().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_1().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_1().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_1().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 2:
				if (window.getBtn_2().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_2().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_2().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_2().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 3:
				if (window.getBtn_3().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_3().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_3().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_3().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 4:
				if (window.getBtn_4().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_4().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_4().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_4().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 5:
				if (window.getBtn_5().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_5().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_5().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_5().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				}  
				break;

			case 6:
				if (window.getBtn_6().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_6().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_6().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_6().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 7:
				if (window.getBtn_7().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_7().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_7().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_7().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 8:
				if (window.getBtn_8().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_8().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;

				} else if (window.getBtn_8().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_8().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 
				break;

			case 9:
				if (window.getBtn_9().getText().compareToIgnoreCase("O") == 0 && window.getPlayer1().isPlaying() == true
						&& window.getPlayer1().maxTokens() == true) {
					window.getBtn_9().doClick();
					window.getPlayer1().tokens = 2;
					movementCpu(window);
					break;
				} else if (window.getBtn_9().getText().compareToIgnoreCase("X") == 0
						&& window.getPlayer2().isPlaying() == true && window.getPlayer2().maxTokens() == true) {
					window.getBtn_9().doClick();
					window.getPlayer2().tokens = 2;
					movementCpu(window);
					break;
				} 	
				break;
			default: 
				removeCpu(window);
			} 
		}
	}
}
