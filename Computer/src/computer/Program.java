package src.computer;

import java.util.ArrayList;
import java.util.List;

public abstract class Program {
    private List<Instruction> instructions;

    public Program() {
        instructions = new ArrayList<Instruction>();
    }

    public void add(Instruction i) {
        instructions.add(i);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int j = 0;
        
        for (Instruction i : instructions) {
            sb.append(j + ": ");
            sb.append(i.toString() + "\n");
            j++;
        }
        return sb.toString();
    }

    public Instruction get(InstructionPointer p) {
        return instructions.get(p.value());
    }

    public void run(Memory m) {
        InstructionPointer p = new InstructionPointer();
        while (p.value() != -1) {
            get(p).execute(m, p);
        }
    }

}
