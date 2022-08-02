package tic_tac_toe.tic_tac_toe;

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
		
		if(this.tokens==3) {
			max = true;
		}
		
		return max;
	}
}
