package src.computer;

public class Halt implements Instruction {

    public void execute(Memory m, InstructionPointer p) {
        p.jumpTo(-1);

    }

    @Override
    public String toString() {
        return "Halt";
    }

}
