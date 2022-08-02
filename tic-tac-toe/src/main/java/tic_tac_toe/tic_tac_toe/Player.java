package tic_tac_toe.tic_tac_toe;

public class Player {
	
	private String name;
	private boolean cpu;
	private boolean playing;
	private int num;
	
	
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
}
