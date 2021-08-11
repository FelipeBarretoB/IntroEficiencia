package ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class introComplejidadTemporal {

	public static Integer[] array;
	
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
	
	public static void bubbleSort() {
		boolean changed=true;
		int flag=0;
		for(int c=1;c <array.length && changed;c++) {
			changed=false;
			for(int i=0;i<array.length-c;i++) {
				if(array[i]>array[i+1]) {

					flag=array[i];
					array[i]=array[i+1];
					array[i+1]=flag;
					changed=true;
				}
			}
		}
	}
	
	public static Integer[] createArray(int n) {
		ArrayList<Integer> a = new ArrayList<>();
		for(int i=0; i <n;i++) {
			a.add(i+1);
		}
		Collections.shuffle(a);
		return a.toArray(new Integer[0]);
	}
	
	public static void insertionSort() {
		for (int i = 1; i < array.length; i++) {
			for (int j=i;j>0 && array[j-1]>array[j];j--) {
				int temp=array[j];
				array[j]=array[j-1];
				array[j-1]=temp;
			}
		}
	}
	
	public static void main(String[]  args) {
		
		for(int c=1;c<30;c++) {
			long start=System.nanoTime();
			fibonacci_rec(c);
			long time = System.nanoTime()-start;
			System.out.println("Tiempo en nanosegundos de fibonacci rec para "+c+":  "+time);
			start=System.nanoTime();
			fibonacci_iter(c);
			time = System.nanoTime()-start;
			System.out.println("Tiempo en nanosegundos de fibonacci iter para "+c+": "+time);
			
		}
		
		for(int c=100;c<1001;c+=100) {
			array= createArray(c);
			
			Integer[] copyArray=Arrays.copyOf(array, array.length);
			
			long start=System.nanoTime();
			insertionSort();
			long time = System.nanoTime()-start;
			System.out.println("Tiempo en nanosegundos de insertionSort para organizar un arreglo de longitud "+c+": 	"+time);
			
			array = copyArray;

			start=System.nanoTime();
			bubbleSort();
			time = System.nanoTime()-start;
			System.out.println("Tiempo en nanosegundos de bubbleSort para organizar un arreglo de longitud "+c+":   	"+time);
		}
		
		
		
		
	}
	
	
}


