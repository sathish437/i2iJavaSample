import java.util.Scanner;

class StringConcat {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("String Concatenation!\nFirst String:");
		String first_string = input.nextLine();
		System.out.print("Second String:");
		String second_string = input.nextLine();
		StringBuffer concatenated_string = new StringBuffer(first_string.length()+second_string.length());

		for(int i=0;i<first_string.length();i++) {
			concatenated_string.append(first_string.charAt(i));
		}
		for(int i=0;i<second_string.length();i++) {
			concatenated_string.append(second_string.charAt(i));
		}
		System.out.println("Result:"+concatenated_string);
	}
}