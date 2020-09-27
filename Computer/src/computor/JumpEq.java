package src.computor;

import src.words.*;

public class JumpEq extends JumpInstruction {
    private Operand a, b;

    public JumpEq(int i, Operand a, Operand b) {
        super(i);
        this.a = a;
        this.b = b;
    }

    public String toString() {
        return super.toString() + " if " + a.toString() + " == " + b.toString(); // Ngt mer
    }

    @Override
    protected boolean setInstruction(Memory m, InstructionPointer p) {
        return a.getWord(m).equals(b.getWord(m));
    }

}
