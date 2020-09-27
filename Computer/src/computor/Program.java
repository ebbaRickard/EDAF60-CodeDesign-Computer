package src.computor;

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
        int j = 0;
        String tot = "";
        for (Instruction i : instructions) {
            tot = tot + j + ": ";
            tot = tot + i.toString() + "\n";
            j++;
        }
        return tot;
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
