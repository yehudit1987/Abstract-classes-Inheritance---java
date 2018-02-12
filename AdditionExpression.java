
public class AdditionExpression extends CompoundExpression
{
	
	
	public AdditionExpression(Expression x, Expression y)
	{
		super(x,y);
	}
	
	public double calculate()
	{
		double ans;
		ans=exp1.calculate()+exp2.calculate();
		return ans;
	}
	public String toString()
	{
		return "("+exp1.toString()+") + ("+exp2.toString()+")";
	}
}
