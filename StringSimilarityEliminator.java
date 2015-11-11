import java.util.Scanner;

class StringSimilarityEliminator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean status=true;
		System.out.print("String Similarity Eliminator!\nFirst String:");
		String first_string = input.nextLine();
		System.out.print("Second String:");
		String second_string = input.nextLine();
		System.out.print("Result:");
		for(int i=0;i<second_string.length();i++) {
			for(int j=0;j<first_string.length();j++) {
				if(second_string.charAt(i) == first_string.charAt(j)) {
					status = false;
				}
			}
			if(status) {
				System.out.print(second_string.charAt(i));
			}
			status = true;
		}
		System.out.println();
	}
}