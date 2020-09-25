package src.computor;
public abstract class JumpInstruction implements Instruction{

	@Override
	public void execute(Memory m, InstructionPointer p) {
		// TODO Auto-generated method stub
		
	}
	protected abstract void setInstruction(Memory m, InstructionPointer p);

}
