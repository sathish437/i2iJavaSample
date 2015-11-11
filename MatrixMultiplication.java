import java.util.Scanner;

class MatrixMultiplication {
	int[][] get_matrix_data() {
		Scanner input = new Scanner(System.in);
		int temp_data[][] = new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				temp_data[i][j] = input.nextInt();
			}
		}
		return temp_data;
	}
	public static void main(String[] args) {
		int first_matrix[][] = new int[3][3];
		int second_matrix[][] = new int[3][3];
		int resulting_matrix[][] = new int[3][3];
		int total_helping_variable=0;
		MatrixMultiplication matrixMultiplicationObj = new MatrixMultiplication();
		System.out.print("Matrix Multiplication!\nEnter Matrix1(row wise):");
		first_matrix = matrixMultiplicationObj.get_matrix_data();
		System.out.print("Enter Matrix2(row wise):");
		second_matrix = matrixMultiplicationObj.get_matrix_data();
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				total_helping_variable = 0;
				for(int k=0;k<3;k++) {
					total_helping_variable=total_helping_variable+first_matrix[i][k]*second_matrix[k][j];
				}
				resulting_matrix[i][j]=total_helping_variable;
			}
		}
		System.out.println("Result:");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(resulting_matrix[i][j]+"	");
			}
			System.out.println();
		}
	}
}