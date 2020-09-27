package src.computor;

import src.words.Operand;

public class Copy implements Instruction{
	private Operand left, right;
	public Copy(Operand a, Operand b) {
		left = a;
		right = b;
	}
	
	public void execute(Memory m, InstructionPointer p) {
		right.getWord(m).write(left.getWord(m));
	}
	
	@Override
	public String toString() {
		return "Copy " + left.toString() + " to " + right.toString();
	}

}
