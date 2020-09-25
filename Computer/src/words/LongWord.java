package src.words;

public class LongWord extends Word{

	private long value;
	
	public LongWord(String value) {
		this.value = Long.parseLong(value);
	}
	
	public void add(Word word1, Word word2) {
		LongWord w1 = (LongWord) word1;
		LongWord w2 = (LongWord) word2;
		this.value = (long) w1.getValue() + w2.getValue();
		
	}

	public void mul(Word word1, Word word2) {
		LongWord w1 = (LongWord) word1;
		LongWord w2 = (LongWord) word2;
		this.value = (long) w1.getValue() * w2.getValue();
	}

	public void write(Word word) {
		LongWord w = (LongWord) word;
		this.value = w.getValue();		
	}

	public boolean equals(Word word) {
		LongWord w = (LongWord) word;
		return this.getValue() == w.getValue();
	}


	public String toString() {
		return Long.toString(this.value);
	}
	
	public long getValue() {
		return this.value;
	}


}
