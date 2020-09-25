package src.computor;

import src.words.Word;

public abstract class BinaryOp implements Instruction {
	public void execute(Memory m, InstructionPointer p) {
		
		
	}
	protected abstract void evaluate(Word w1, Word w2, Word w3);
}
