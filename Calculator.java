import java.util.*;
public class Calculator{
	public static void main(String []args){
		Scanner s=new Scanner(System.in);
		double a,b,c,selection;
		System.out.println("Enter the digits");
		a=s.nextDouble();
		b=s.nextDouble();
		
		System.out.println("Choose any operation,make your selection");	
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		
		selection=s.nextDouble();
		while(selection>4){
			System.out.println("Please enter the correct option for selection");
			selection=s.nextDouble();
		}
		Calculator2 cal=new Calculator2();
		if(selection==1){
			c=cal.add(a,b);
			System.out.println("Answer is:"+c);
		}
		else if(selection==2){
			c=cal.sub(a,b);
			System.out.println("Answer is:"+c);
		}
		else if(selection==3){
			c=cal.mul(a,b);
			System.out.println("Answer is:"+c);
		}
		else if(selection==4){
			c=cal.div(a,b);
			System.out.println("Answer is:"+c);
		}
	}
}
