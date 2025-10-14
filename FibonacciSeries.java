package week1.day2;

import java.util.Iterator;

public class FibonacciSeries {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
	 int n= 8;
	 int first = 0;
	 int second = 1;
	 for (int i = 0; i < n; i++) {
		 System.out.println(first);
		 int third = first + second;
		 first = second;
		 second = third;
		 
		 
		
	}

	}

}
