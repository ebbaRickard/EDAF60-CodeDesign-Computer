package src.words;

import src.computor.Memory;

public abstract class Word implements Operand{
	
	public abstract void add(Word word);
	
	public abstract void mul(Word word);
	
	public abstract void write(Word word);
	
	public abstract boolean equals(Word word);
	
	public Word getWord(Memory m) {
		return this;
	}
	
	public abstract String toString();
	
	
}