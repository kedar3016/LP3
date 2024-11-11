//Using Recursion
import java.util.Scanner;
public class FibonacciCalc{
	public static int fibonacciRecursion(int n){
		if(n == 0){
			return 0;
		}
		if(n == 1 || n == 2){
			return 1;
		}
		return fibonacciRecursion(n-2) + fibonacciRecursion(n-1);
	}
	public static void main(String args[]) {
    
	Scanner s = new Scanner(System.in);
    	System.out.print("Enter no of terms to be generated in fibonacci sequence:");
	int n=Integer.parseInt(s.nextLine());
	
	System.out.print("Fibonacci Series of "+n+" numbers: ");
	for(int i = 0; i < n; i++)
		System.out.print(fibonacciRecursion(i) +" ");
		
	}
}