package jinyoung.submit12;

public class AudioBoard extends Board{
	public AudioBoard(String audio) {
		super();
		this.audio = audio;
	}

	private String audio;
	
	public AudioBoard() {
		
	}

	public String getAudio() {
		return audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	
	
}
