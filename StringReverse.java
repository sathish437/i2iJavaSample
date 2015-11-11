import java.util.Scanner;

class StringReverse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("String Reverse Operation!\nEnter Input String:");
		String input_string = input.nextLine();
		StringBuffer reverse_string = new StringBuffer(input_string.length());
		for(int i=0;i<input_string.length();i++) {
			reverse_string.append(input_string.charAt(input_string.length()-i-1));
		}
		System.out.println("Reverse:"+reverse_string);
	}
}