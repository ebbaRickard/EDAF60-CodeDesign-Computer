
public abstract class Program {
	List<Instruction> instructions;
	
	public Program() {
		instructions = new ArrayList<>();
	}
	
	public void add(Intruction i) {
		instructions.add(i);
	}
	public String toString() {
		for(Instruction i : instructions) {
			i.toString();
		}
	}
	public void get(InstructionPointer p) {
		instructions.get(p.value());
	}
	
}
