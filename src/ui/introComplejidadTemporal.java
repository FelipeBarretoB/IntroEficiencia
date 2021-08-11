package ui;

public class introComplejidadTemporal {

	public static long fibonacci_rec(int n) {
		if(n<=1)
			return n;
		else return fibonacci_rec(n-1)+fibonacci_rec(n-2);
	}
	
	public static long fibonacci_iter(int n) {
		if(n<=1) {
			return n;
		}
	
		long fib=1;
		long prevFib=1;
		for(long i=2;i<n;i++) {
			long temp =fib;
			fib+=prevFib;
			prevFib=temp;
		}
		return fib;
	}
	
	
	
	
}


