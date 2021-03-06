package src.computer;

public abstract class JumpInstruction implements Instruction {
    private int newPointer;

    public JumpInstruction(int i) {
        newPointer = i;
    }

    @Override
    public void execute(Memory m, InstructionPointer p) {
        if (setInstruction(m, p)) {
            p.jumpTo(newPointer);
        } else {
            p.jumpTo(p.value() + 1);
        }

    }

    protected abstract boolean setInstruction(Memory m, InstructionPointer p);

    @Override
    public String toString() {
        return "Jump to " + newPointer;
    }

}
