package src.computor;

public class InstructionPointer {

	private int value;
	
	public InstructionPointer() {
		this.value = 0;
	}
	
	protected int value() {
		return value;
	}
	
	public void jumpTo(int n) {
		value = n;
	}
}
