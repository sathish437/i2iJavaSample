import java.util.Scanner;

class InsertionSort {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Insertion Sort!\nArray Size:");
		int arraySize = input.nextInt();
		int arrayElements[] = new int[arraySize];
		boolean status = true;
		System.out.print("Array Element:");
		for(int i=0;i<arraySize;i++) {
			arrayElements[i] = input.nextInt();
		}
		while(status) {
			for(int i=0;i<arraySize;i++) {
				for(int j=0;j<i;j++) {
					if(arrayElements[j] >arrayElements[j+1]) {
						arrayElements[j] = arrayElements[j] + arrayElements[j+1];
						arrayElements[j+1] = arrayElements[j] - arrayElements[j+1];
						arrayElements[j] = arrayElements[j] - arrayElements[j+1];
						status = false;
					}
				}
			}
			if (status) {
				break;
			}
			status = true;
		}
		System.out.println("Result:");
		for(int i=0;i<arraySize;i++) {
			System.out.println(arrayElements[i]+"	");
		}
	}
}