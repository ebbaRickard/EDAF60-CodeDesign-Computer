
public abstract class Program {
	List<Instruction> instructions;
	
	public Program() {
		instructions = new ArrayList<>();
	}
	
	public void add(Intruction i) {
		instructions.add(i);
	}
	public String toString() {
		int j = 0;
		String tot;
		for(Instruction i : instructions) {
			tot = tot + j + ": "
			tot = tot + i.toString() + \n;
			j++;
		}
		return tot;
	}
	public void get(InstructionPointer p) {
		instructions.get(p.value());
	}
	
}
