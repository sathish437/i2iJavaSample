import java.util.Scanner;

class MatrixDiagonalDisplay {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int input_matrix[][] = new int[3][3];
		System.out.print("Matrix Diagonal element Display!\nEnter Matrix(row wise):");
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				input_matrix[i][j] = input.nextInt();
			}
		}
		System.out.println("Result:");
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) {
				if(i==j) {
					System.out.println(input_matrix[i][j]);
				}
			}
		}
	}
}