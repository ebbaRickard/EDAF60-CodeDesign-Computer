package src.computer;

import src.words.*;

public abstract class BinaryOp implements Instruction {
    private Operand left, right;
    private Address a;

    public BinaryOp(Operand l, Operand r, Address a) {
        left = l;
        right = r;
        this.a = a;
    }

    public void execute(Memory m, InstructionPointer p) {
        evaluate(left.getWord(m), right.getWord(m), a.getWord(m));
        p.jumpTo(p.value() + 1);

    }

    protected abstract void evaluate(Word w1, Word w2, Word w3);

    public String toString() {
        return this.left.toString() + " and " + right.toString() + " into " + a.toString();
    }
}
