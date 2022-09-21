package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Up to what number do you want to find primes?");
		int n = in.nextInt();
		boolean[] sieve = new boolean[n+1];
		for (int i= 2; i < n + 1; i++)
		{
		for (int j = 2; j < n + 1; j++)
		{
		//	sieve[i+i*j]=false;
			if (j% i == 0 && j != i)
			{
				sieve[j] = true;
			}
		}
		if (sieve[i] == false)
		{
			System.out.println(i);
		}
			
		}
	}

}
