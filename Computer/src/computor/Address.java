package src.computor;

import src.words.Operand;
import src.words.Word;

public class Address implements Operand {
	private int index;
	
	public Address(int i) {
		index = i;
	}
	
	public Word getWord(Memory m) {
		return m.read(this);
	}
	protected int getIndex() {
		return index;
	}
}
