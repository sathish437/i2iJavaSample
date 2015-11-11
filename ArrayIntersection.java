import java.util.Scanner;

class ArrayIntersection {
	int[] getArrayElement(int arraySize) {
		Scanner input = new Scanner(System.in);
		int arrayElement[] = new int[arraySize];
		for(int i=0;i<arraySize;i++) {
			arrayElement[i] = input.nextInt();
		}
		return(arrayElement);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayIntersection arrayIntersectionObj = new ArrayIntersection();
		boolean status = false;
		System.out.print("Array Intersection!\nEnter size of first array:");
		int firstArraySize = input.nextInt();
		int firstArrayElement[] = new int[firstArraySize];
		System.out.print("Enter First Array Elements:");
		firstArrayElement = arrayIntersectionObj.getArrayElement(firstArraySize);
		System.out.print("Enter Size of second array:");
		int secondArraySize = input.nextInt();
		int secondArrayElement[] = new int[secondArraySize];
		System.out.print("Enter Second Array Elements:");
		secondArrayElement = arrayIntersectionObj.getArrayElement(secondArraySize);
		System.out.println("Resulting data:");
		for(int i=0;i<firstArraySize;i++) {
			for(int j=0;j<secondArraySize;j++) {
				if(firstArrayElement[i] == secondArrayElement[j]) {
					System.out.println(firstArrayElement[i]);
				}
			}
			status = false;
		}
	}
}