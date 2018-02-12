//AtomicExpression is a class which define an expressions which is just a number (of type double)
public class AtomicExpression extends Expression
{
	private double num;
	public AtomicExpression(double number)//constructor, gets double initialize the expression 
	{
		this.num=number; 
	}
	public double calculate()//calculate method, for this type return the value of the number
	{
		return this.num;
	}
	public String toString()
	{
		return String.valueOf(this.num);
	}
}//end class
