import java.util.Scanner;

class SwapWithTwoVariable {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Swapping Witout Third Variable!\nEnter First Number:");
		int first_variable = input.nextInt();
		System.out.print("Enter Second Number:");
		int second_variable = input.nextInt();

		first_variable = first_variable + second_variable;
		second_variable = first_variable - second_variable;
		first_variable = first_variable - second_variable;
		System.out.println("Swapped Number:"+first_variable+","+second_variable);
	}
}