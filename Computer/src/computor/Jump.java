package src.computor;
public class Jump extends JumpInstruction{
	

	public Jump(int i) {
		super(i);
	}

	@Override
	protected boolean setInstruction(Memory m, InstructionPointer p) {
		return true;
	}
	
}
