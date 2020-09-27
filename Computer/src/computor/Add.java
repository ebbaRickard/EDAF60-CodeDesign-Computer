package src.computor;

import src.words.*;

public class Add extends BinaryOp {
	
	public Add(Operand op1, Operand op2, Address a) {
		super(op1, op2, a);
	}
	protected void evaluate(Word w1, Word w2, Word w3) {
		w3.add(w1, w2);
	}
	@Override
	public String toString() {
		return "Add " + super.toString();
	}
	
}
