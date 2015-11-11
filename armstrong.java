import java.util.Scanner;

class armstrong {
	public static void main(String[] args) {
		int input_data,temp_data,resulting_data=0;
		Scanner input = new Scanner(System.in);
		System.out.print("Armstrong Checker!\nInput:");
		temp_data = input_data = input.nextInt();
		while(temp_data >=1) {
			resulting_data = resulting_data+(int)Math.pow(temp_data%10,3);
			temp_data = temp_data/10;
		}
		if(input_data == resulting_data) {
			System.out.println("Result:It Is A Armstrong Number!");
		}
		else {
			System.out.println("Result:It Is Not A Armstrong Number!");
		}
	}
}