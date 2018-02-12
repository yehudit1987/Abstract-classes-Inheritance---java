//CompundExpression class is an abstract class
public abstract class CompoundExpression extends Expression
{
protected Expression exp1;//left expression of complicated expression
protected Expression exp2;//right expression of complicated expression

public CompoundExpression(Expression x, Expression y)//constructor initialized coplicated expression
{
	this.exp1=x;
	this.exp2=y;
}



}//end of class
