/*
 * Name: Sean Xiong
 * Site: Project Euler
 * Problem 1 - Multiples of 3 and 5
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
 * The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 */
public class Problem01 {

	public static void main(String[] args) {
		
		//Variables for multiples
		int threes = 0;
		int fives = 0;
		int fifteens = 0;

		//Arrays to hold all multiples
		int[] allThrees = new int[9999];
		int[] allFives = new int[9999];
		int[] allFifteens = new int[9999];
		
		//Arrays to hold sums
		int[] sumOfThrees = new int[1];
		int[] sumOfFives = new int[1];
		int[] sumOfFifteens = new int[1];
		
		//Variable for calculated sum
		int sumOfAll = 0;
		
		//Multiples of 3s
		System.out.println("Multiples of 3s below 1000:");
		for(int a = 3; a < 1000; a += 3) {
			threes = a;
			System.out.print(threes + " ");
			allThrees[a] = threes;
		}
		System.out.println();
		
		//Multiples of 5s
		System.out.println("Multiples of 5s below 1000:");
		for(int b = 5; b < 1000; b += 5) {
			fives = b;
			System.out.print(fives + " ");
			allFives[b] = fives;
		}
		System.out.println();
		
		//Sum of all 3s
		for(int n = 0; n < allThrees.length - 1; n++) {
			sumOfThrees[0] = sumOfThrees[0] + allThrees[n];
		}
		System.out.println("Sum of all multiples of 3s below 1000:\n" + sumOfThrees[0]);
		
		//Sum of all 5s
		for(int n = 0; n < allFives.length - 1; n++) {
			sumOfFives[0] = sumOfFives[0] + allFives[n];
		}
		System.out.println("Sum of all multiples of 5s below 1000:\n" + sumOfFives[0]);
				
		//Multiples of 15s (Duplicates)
		for(int c = 15; c < 1000; c += 15) {
			fifteens = c;
			allFifteens[c] = fifteens;
		}
				
		//Sum of all 15s (Duplicates)
		for(int d = 0; d < allFifteens.length - 1; d++) {
			sumOfFifteens[0] = sumOfFifteens[0] + allFifteens[d];
		}
		System.out.println("Sum of all duplicate multiples of 3s or 5s below 1000:\n" + sumOfFifteens[0]);
				
		//Sum of all multiples of 3s or 5s below 1000
		sumOfAll = sumOfThrees[0] + sumOfFives[0] - sumOfFifteens[0]; //Sum of 3s + Sum of 5s - Sum of 15s
		System.out.println("Sum of all multiples of 3s or 5s below 1000:\n" + sumOfAll);
		
		//Condensed version calculating ONLY the sum of all multiples of 3s or 5s below 1000
		//************************************************************************************************
		int sum = 0;
		
		for(int i = 0; i < 1000; i++) {
			if(i % 3 == 0 || i % 5 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("\nSum of all multiples of 3s or 5s below 1000:\n" + sum);
		//************************************************************************************************
		
	}
	
}