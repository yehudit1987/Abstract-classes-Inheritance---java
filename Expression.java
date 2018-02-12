//abstract class Expression define simple mathematical expressions
public abstract class Expression 
{
	public abstract double calculate();//abstract method calculate the value of an expression
	public boolean equals(Expression x)//Override method compare this expression to another one return true if their values are equal
	{
		if (this.calculate()==x.calculate())
			return true;
		else
			return false;
	}
}
