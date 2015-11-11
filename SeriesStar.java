import java.util.Scanner;

class SeriesStar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows_count;
		System.out.print("Series OF Numbers!\nEnter Number Of Rows:");
		rows_count = input.nextInt();
		for(int i=1;i<=rows_count;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*	");
			}
			System.out.println();
		}
	}
}