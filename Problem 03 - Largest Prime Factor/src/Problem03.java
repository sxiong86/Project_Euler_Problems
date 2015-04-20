/*
 * Name: Sean Xiong
 * Site: Project Euler
 * Problem 3 - Largest Prime Factor
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class Problem03 {

	public static void main(String[] args) {
		
		//The number being calculated
		long number = 600851475143L;	
		//Prime factor; Starting with the smallest (2)
		int factor = 2;
		
		//Searches for the largest prime factor
		System.out.println("The largest prime factor for the number " + number + " is:");
		while(factor != number) {	
			//If the number remainder the current prime factor is 0...
			if(number % factor == 0) {		
				//... Then divide the number by the current prime factor
				number = number / factor; 
			}	
			//Otherwise increment the prime factor by 1 and repeat
			else {
				factor ++;
			}			
		}
		//Prints largest prime factor when found
		System.out.println(factor);
		
	}

}
