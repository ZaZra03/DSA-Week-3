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
		secondLowestNum = numArr[0];
		
		for(int j = 1; j < n; j++) {
			if(numArr[j] < lowestNum) {
				lowestNum = numArr[j];
			}
		}
		
		for(int k = 0; k < n; k++) {
			if(numArr[k] > lowestNum) {
				for(int l = 0; l < n; l++) {
					if(numArr[k] < numArr[l]) {
						secondLowestNum = numArr[k];
					}
				}
			}
		}
		
		System.out.println("\nSecond lowest number is " + secondLowestNum + ".");
		
	}

}