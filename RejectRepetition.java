import java.util.Scanner;

class RejectRepetition {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int array_size;
		boolean status=true;
		System.out.print("Repetition Eliminator!\nEnter Input Count:");
		array_size = input.nextInt();
		int array_elements[] = new int[array_size];
		System.out.print("Enter elements:");
		for(int i=0;i<array_size;i++) {
			array_elements[i] = input.nextInt();
		}
		System.out.println("Result:");
		for(int i=0;i<array_size;i++) {
			for(int j=0;j<i;j++) {
				if(array_elements[i] == array_elements[j]) {
					status = false;
				}
			}
			if(status) {
				System.out.println(array_elements[i]);
			}
			status = true;
		}
	}
}