package computor;

public interface Instruction {
	
	public void execute(Memory m, InstructionPointer p);
	public String toString();
}
