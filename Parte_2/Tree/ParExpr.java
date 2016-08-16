package Tree;

public class ParExpr extends ExprTree
{
    private ASTree expression;

	public ParExpr (ASTree expression) {
        this.expression = expression;
    }

    public void accept (TreeVisitor visitor) {
        visitor.enter (this);
        expression.accept(visitor);
        visitor.exit (this);
    }
}