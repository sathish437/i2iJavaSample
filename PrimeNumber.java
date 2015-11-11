import java.util.Scanner;

class PrimeNumber {
	public static void main(String[] args) {
		int input_data[] = new int[10];
		boolean status=true;
		Scanner input = new Scanner(System.in);
		System.out.print("Prime Checker!\nInput(provide 10 elements):");
		for(int i=0;i<10;i++) {
			input_data[i] = input.nextInt();
		}
		System.out.println("Prime Numbers:");
		for(int i=0;i<10;i++) {
			if (input_data[i] == 0) {
				System.out.println("Error:Input can't have 0.");
			}
			else if(input_data[i] == 1) {
				System.out.println(input_data[i]);
			}
			else {
				for(int j=2;j<input_data[i];j++) {
					if(input_data[i]%j==0) {
						status = false;
					}
				}
				if(status) {
					System.out.println(input_data[i]);
				}
			}
			status = true;
		}
	}
}