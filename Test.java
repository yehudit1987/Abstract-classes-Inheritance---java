import java.util.*;

public class Test
{
	private static ArrayList <Expression> exp=new ArrayList <Expression>();
	public static void main(String[] args) 
	{
		createNumbers();
		printArray();
		checkForEquals();
	}
	
	//this method is for creating 15 random expressions and another expression which his value is already exist
	public static void createNumbers() {

		int num=15;
		double x;
		Expression y;
		for (int i=0; i<num; i++)
		{
			if (i<5)
			{
				x=((Math.random()*(10-0+1))+0);
				x=Math.ceil(x);
				y=new AtomicExpression (x);
				exp.add(i, y);	
			}
			else if (i>=5 && i<10)
			{
				y=new AdditionExpression(exp.get(i-5), exp.get(i-4));
				exp.add(i, y);
			}
			else if (i>=10)
			{
				y=new SubtractionExpression(exp.get(i-5), exp.get(i-4));
				exp.add(i, y);
			}
		}
		x=exp.get(10).calculate();
		y=new AtomicExpression(x);
		exp.add(y);
	}
	
	//prints all expressions in the array
	public static void printArray() {
		for (int i=0; i<exp.size(); i++)
		{
			System.out.println(exp.get(i).toString()+"="+exp.get(i).calculate()+"\n");
		}
	}
	
	//search for 2 equals expressions and prints if exist
	public static void checkForEquals() {
		for (int i=0; i<exp.size(); i++)
			for (int j=i+1; j<exp.size(); j++)
			{
				if (exp.get(i).equals(exp.get(j)))
					System.out.println("the value of " + exp.get(i).toString() + " equals to the value of "+exp.get(j).toString()+"\n");
			}
	}

}
