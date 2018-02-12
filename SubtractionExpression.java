//SubtractionExpression class extends CompundExpression class, define Addition Expressions
public class SubtractionExpression  extends CompoundExpression
{
	
	public SubtractionExpression(Expression x, Expression y)//constructor not changed
	{
		super(x,y);
	}
	
	public double calculate()//calculate method, return the value of the expression
	{
		double ans;
		ans=exp1.calculate()-exp2.calculate();
		return ans;
	}
	public String toString()
	{
		return "("+exp1.toString()+") - ("+exp2.toString()+")";
	}
}//end of class
