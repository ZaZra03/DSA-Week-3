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
		
		lowestNum = numArr[0];
		
		//Find the lowest number in the array
		for (int i = 0; i < numArr.length; i++) {
			
			if (lowestNum > numArr[i])
				lowestNum = numArr[i];
		}
		
		secondLowestNum = numArr[0];
		
		//Find the second lowest number in the array
		for (int i = 0; i < numArr.length; i++) {
			if (numArr[i] != lowestNum) {
				
				if (secondLowestNum > numArr[i])
					secondLowestNum = numArr[i];
			} 
		}
		System.out.println("\nSecond lowest number is " + secondLowestNum);
	}
}
