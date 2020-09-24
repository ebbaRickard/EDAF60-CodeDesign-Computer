package computor;

public abstract class BinaryOp implements Instruction {
	public void execute(Memory m, InstructionPointer p) {
		
		this.evaluate(w1, w2, w3);
	}
	protected abstract void evaluate(Word w1, Word w2, Word w3);
}
