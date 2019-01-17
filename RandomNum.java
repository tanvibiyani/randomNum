/*Tanvi Biyani
 * Net id: txb160430
 * ITSS 3311.002
 * Hw 10 - random number
 */

public class RandomNum {
	
	public static void main (String args[]) {
		
		int[] randomNums = new int[6]; 
		int value = 0;
		
		for(int i = 0; i < randomNums.length; i++) { 
			
			value = (int) (Math.random() * 100); // generates random number
			randomNums[i] = value; // adds number in array
			
			for(int j = 0; j < i; j++) { //traverse array
				if(randomNums[i] == randomNums[j]) // checks to see if number exists in array
					randomNums[i] = (int)(Math.random()*100); // if number exists, assigns a new random number
			}
			
			System.out.println(randomNums[i]);
			
			}
			
		}	
		
	}


