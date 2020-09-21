package words;

public class LongWord extends Word{

	private long value;
	
	public LongWord(String value) {
		this.value = Long.parseLong(value);
	}
	
	public void add(Word word) {
		LongWord w = (LongWord) word;
		this.value = (long) this.getValue() + w.getValue();
		
	}

	public void mul(Word word) {
		LongWord w = (LongWord) word;
		this.value = (long) this.getValue() * w.getValue();
	}

	public void write(Word word) {
		LongWord w = (LongWord) word;
		this.value = w.getValue();		
	}

	public boolean equals(Word word) {
		LongWord w = (LongWord) word;
		return this.getValue() == w.getValue();
	}

	public Word getWord() {
		return this;
	}

	public String toString() {
		return Long.toString(this.value);
	}
	
	public long getValue() {
		return this.value;
	}

}
