

public class FibonacciSeries {
	public static void main(String[] args) {
		//Fibonacci series  1,1,2,3,5,8,13.....
		
		int a = 1;
		int b = 1;
		int n = 10;
		System.out.print(a);
		System.out.print(","+b);
		for(int i=1;i<=n-2;i++) {
			int c = a+b;
			System.out.print(","+c);
			a=b;
			b=c;
			
		}
	} 
}
