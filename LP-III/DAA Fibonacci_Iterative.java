import java.util.Scanner;
public class Fibonacci {
	

	public void fibonacciIterative(int n) 
	{
		int fib1 = 0;
		int fib2 = 1;
		int fib3;
		if(n == 1) {
			System.out.print(fib1);
		}
		else if(n == 2) {
			System.out.print(fib1+" "+fib2);
		}
		else
		{
	        System.out.print(fib1+" "+fib2+" ");
		    for(int i=3; i<=n; i++) 
		    {
		    
			    fib3=fib1+fib2;    
                System.out.print(fib3+" ");    
                fib1=fib2;    
                fib2=fib3;   
		    }
		}
	}
	public static void main(String args[]) {
		Fibonacci fib = new Fibonacci();
		Scanner s = new Scanner(System.in);
		
		System.out.println("Iterative version:");
		System.out.print("\nEnter no of terms to be generated in fibonacci sequence:");
		int n=Integer.parseInt(s.nextLine());
		fib.fibonacciIterative(n);
	}
}