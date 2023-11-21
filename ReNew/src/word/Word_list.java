package word;

public class Word_list {
	
	private String word;
	private String mean;
	
	public Word_list () {}
	public Word_list (String word, String mean) {
		this.word = word;
		this.mean = mean;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMean() {
		return mean;
	}
	public void setMean(String mean) {
		this.mean = mean;
	}
	
	@Override
	public String toString() {
		return word + " : " + mean;
	}
	
	
}
