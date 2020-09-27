package src.computor;

import src.words.*;

public class Mul extends BinaryOp {
	public Mul(Operand op1, Operand op2, Address a) {
		super(op1, op2, a);
	}
	protected void evaluate(Word w1, Word w2, Word w3) {
		w3.mul(w1, w2);
	
		
	}
	@Override
	public String toString() {
		return "Multipy " + super.toString();
	}

}
