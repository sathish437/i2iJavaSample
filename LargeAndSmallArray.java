import java.util.Scanner;

class LargeAndSmallArray {
	public static void main(String[] args) {
		int largestNumber=0,smallestNumber=0; 
		Scanner input = new Scanner(System.in);
		System.out.print("Largest & Smallest Number In A Array!\nPlease Enter Array Size:");
		int arraySize = input.nextInt();
		int arrayNumbers[] = new int[arraySize];
		System.out.print("Array Elements:");
		for(int i=0;i<arraySize;i++) {
			arrayNumbers[i] = input.nextInt();
			if(i==0) {
				largestNumber = smallestNumber = arrayNumbers[i];
			}
			else if(arrayNumbers[i]>largestNumber) {
				largestNumber = arrayNumbers[i];
			}
			else if(arrayNumbers[i]<smallestNumber) {
				smallestNumber = arrayNumbers[i];
			}
		}
		System.out.print("\nSmallest Number In List:"+smallestNumber+"\n");
		System.out.print("Largest Number In List:"+largestNumber);
	}
}