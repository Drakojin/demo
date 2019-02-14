package operator;

public class TryOperator implements Operator {

	private final Operator protectedBlock;
	private final Operator catchBlock;
	private final Operator finallyBlock;
	
	public TryOperator ( Operator protectedBlock, Operator catchBlock, Operator finallyBlock ) {
		this.protectedBlock = protectedBlock;
		this.catchBlock = catchBlock;
		this.finallyBlock = finallyBlock;
	}

	public void evaluate() throws EvaluationException {
		this.protectedBlock.evaluate();
		this.finallyBlock.evaluate();
	}
}
