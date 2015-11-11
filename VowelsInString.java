import java.util.Scanner;

class VowelsInString {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean status = false;
		System.out.print("Vowels Finder!\nEnter Your Text:");
		String input_data = input.nextLine();
		String vowels_list = "aeiou";
		for(int i=0;i<input_data.length();i++) {
			for(int j=0;j<vowels_list.length();j++) {
				if(input_data.charAt(i) == vowels_list.charAt(j)) {
					status = true;
				}
				if(status) {
					System.out.println(input_data.charAt(i));
				}
				status = false;
			}
		}
	}
}