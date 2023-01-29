/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class GFG {

	
	static int gcd(int a, int b)
	{
		if(b==0)
			return a;

		return gcd(b, a % b);
	}

	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
		//int a = 12, b = 15;
		System.out.println(gcd(a, b));

	}
}