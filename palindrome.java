import java.util.Scanner;

class palindrome {
	public static void main(String[] args) {
		System.out.print("Palindrome Checker!\nInput:");
		Scanner input = new Scanner(System.in);
		String input_data = input.nextLine();
		String reverse_input_data = new StringBuffer(input_data).reverse().toString();
		if(input_data.equals(reverse_input_data)) {
			System.out.println("Result: It Is A Palindrome!");
		}
		else {
			System.out.println("Result: It Is Not A Palindrome!");
		}
	}
}