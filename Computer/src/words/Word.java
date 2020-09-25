package src.words;

import src.computor.Memory;

public abstract class Word implements Operand{
	
	public abstract void add(Word word1, Word word2);
	
	public abstract void mul(Word word1, Word word2);
	
	public abstract void write(Word word);
	
	public abstract boolean equals(Word word);
	
	public Word getWord(Memory m) {
		return this;
	}
	
	public abstract String toString();
	
	
}