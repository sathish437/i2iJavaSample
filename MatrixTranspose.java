import java.util.Scanner;

class MatrixTranspose {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Matrix Transpose!\nEnter No.Of.Rows:");
		int rows = input.nextInt();
		System.out.print("Enter No.Of.Columns:");
		int columns = input.nextInt();
		int input_matrix[][] = new int[rows][columns];
		System.out.println("Matrix Element:");
		for(int i=0;i<rows;i++) {
			for (int j=0;j<columns;j++) {
				input_matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Result:");
		for(int j=0;j<columns;j++) {
			for(int i=0;i<rows;i++) {
				System.out.print(input_matrix[i][j]+"	");
			}
			System.out.println();
		}
	}
}