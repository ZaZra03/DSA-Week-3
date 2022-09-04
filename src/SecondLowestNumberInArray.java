import java.io.*;

public class SecondLowestNumberInArray {
	static int n, lowestNum, secondLowestNum;
	
	static void secondlowestNumber (int numArr[], int arrSize) {
		
		//Get the lowest and second lowest number
		if(numArr[0] < numArr[1]) {
			lowestNum = numArr[0];
			secondLowestNum = numArr[1];
		} 
		
		else {
			lowestNum = numArr[1];
			secondLowestNum = numArr[0];
		}
		
		/*
		 * Check the other elements stored in array and compare it to the lowest number.
		 * The value of lowest and second lowest number might change if the condition
		 * has met
		 */
		for(int i = 2; i < numArr.length; i++) {
			if(numArr[i] < lowestNum) {
				secondLowestNum = lowestNum;
				lowestNum = numArr[i];
			}
			
			else if(numArr[i] < secondLowestNum && numArr[i] > lowestNum) {
				secondLowestNum = numArr[i];
			}
		}
		
		System.out.println("\nThe second lowest number is: " + secondLowestNum);
	}
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		try {
			//Asks the user's prefer size that will be allocated in array
			System.out.println("How many numbers?");
			n = Integer.parseInt(in.readLine());
			
			if(n != 2) {
				//Gets the user's input that will be stored in array
				int[] numArr = new int[n];
				for(int i = 0; i < n; i++) {
					System.out.print("Enter a number: ");
					numArr[i] = Integer.parseInt(in.readLine());
				}
				secondlowestNumber(numArr, n);
			} 
			else System.out.println("Invalid input.");
		} 
		
		catch (Exception e){
			System.out.println("Please enter a number.");
			return;
		}
	}
}
