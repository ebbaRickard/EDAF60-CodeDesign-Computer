package computor;
public class Add extends BinaryOp {
	
	public Add(Operand op1, Operand op2, Address a) {
		evaluate(op1.getWord(), op2.getWord(), a.getWord());
	}
	protected void evaluate(Word w1, Word w2, Word w3) {
		w3 = w1.add(w2);
	}
}
