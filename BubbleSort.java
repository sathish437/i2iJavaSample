import java.util.Scanner;

class BubbleSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insertion Sort!\nArray Size:");
		int arraySize = input.nextInt();
		int arrayElement[] = new int[arraySize];
		boolean status = true;
		System.out.print("Array Element:");
		for(int i=0;i<arraySize;i++) {
			arrayElement[i] = input.nextInt();
		}
		while(status) {
			for(int j=0;j<arraySize-1;j++) {
				if(arrayElement[j] >arrayElement[j+1]) {
					arrayElement[j] = arrayElement[j] + arrayElement[j+1];
					arrayElement[j+1] = arrayElement[j] - arrayElement[j+1];
					arrayElement[j] = arrayElement[j] - arrayElement[j+1];
					status = false;
				}
			}
			if (status) {
				break;
			}
			status = true;
		}
		System.out.println("Result:");
		for(int i=0;i<arraySize;i++) {
			System.out.println(arrayElement[i]+"	");
		}
	}
}