package BlackJack.src.BlackJack;

public class Card {
	private String pattern;
	private String denomiantion;
	
	public Card() {
	}
	
	public Card(String pattern, String denomination) {
		this.pattern = pattern;
		this.denomiantion = denomination;
	}
	
	@Override
	public String toString() {
		return "Card [pattern=" + pattern + ", denomiantion=" + denomiantion + "]";
	}

	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getDenomiantion() {
		return denomiantion;
	}
	public void setDenomiantion(String denomiantion) {
		this.denomiantion = denomiantion;
	}
	
}
