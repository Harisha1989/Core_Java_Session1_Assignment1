public class Operators 
{
	public static void main(String[] args) 
	{
		int a=20, b=10; //provided in the statement
		//problem starts
		b=a-- - --a;// post decrement and pre decrement 20-18, so b=2 and a=18
		System.out.println("value of a= "+a+" and value of b ="+b);
		int c=a--;//here first we have to assign a value to c and then do post decrement for a; so c=18,a=17
		System.out.println("value of a= "+a+" and value of c ="+c);
		int d=a>>2;//use of shift operator, this is bitwise right shift
		/* a=17 convert to bits 17= 10001. now we have to shift to bits towards right, then it is 100, 
		 * the integer value for 100 bits = 2, so the value of d variable is 2*/
		System.out.println("value of a= "+a+" and value of d ="+d);
		int e=a&b; // use bitwise AND operator on a and b values
		/* a=17, b=2 in bits a= 10001, b=00010 after performing AND operation the result is 0
		 * so the value in e is 0*/
		System.out.println("value of a= "+a+" ; value of b ="+b+" and value of e= "+e);
		System.out.println("The final result:");
		System.out.println("Value of a= "+a);
		System.out.println("Value of b= "+b);
		System.out.println("Value of c= "+c);
		System.out.println("Value of d= "+d);
		System.out.println("Value of e= "+e);
	}
}
