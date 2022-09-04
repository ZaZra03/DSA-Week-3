import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int n, lowestNum, secondLowestNum;	
		
		System.out.println("How many numbers?");
		n = Integer.parseInt(in.readLine());
		
		int[] numArr = new int[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Enter a number: ");
			numArr[i] = Integer.parseInt(in.readLine());
		}
		
		if(numArr[0] < numArr[1]) {
			lowestNum = numArr[0];
			secondLowestNum = numArr[1];
		} 
		
		else {
			lowestNum = numArr[1];
			secondLowestNum = numArr[0];
		}
		
		for(int i = 2; i < numArr.length; i++) {
			if(numArr[i] < lowestNum) {
				secondLowestNum = lowestNum;
				lowestNum = numArr[i];
			}
			
			else if(numArr[i] < secondLowestNum && numArr[i] > lowestNum) {
				secondLowestNum = numArr[i];
			}
		}
		
		System.out.println("The second Lowest Number is: " + secondLowestNum);	
		
	}
}
