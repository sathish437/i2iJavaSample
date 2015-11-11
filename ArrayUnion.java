import java.util.Scanner;

class ArrayUnion {
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
		ArrayUnion arrayUnionObj = new ArrayUnion();
		boolean status = true;
		System.out.print("Array Union!\nEnter size of first array:");
		int firstArraySize = input.nextInt();
		int firstArrayElement[] = new int[firstArraySize];
		System.out.print("Enter First Array Elements:");
		firstArrayElement = arrayUnionObj.getArrayElement(firstArraySize);
		System.out.print("Enter Size of second array:");
		int secondArraySize = input.nextInt();
		int secondArrayElement[] = new int[secondArraySize];
		System.out.print("Enter Second Array Elements:");
		secondArrayElement = arrayUnionObj.getArrayElement(secondArraySize);
		System.out.println("Resulting data:");
		for(int i=0;i<firstArraySize;i++) {
			System.out.println(firstArrayElement[i]);
		}
		for(int i=0;i<secondArraySize;i++) {
			for(int j=0;j<firstArraySize;j++) {
				if(secondArrayElement[i] == firstArrayElement[j]) {
					status = false;
				}
			}
			if(status) {
				System.out.println(secondArrayElement[i]);
			}
			status = true;
		}
	}
}