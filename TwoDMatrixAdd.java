import java.util.Scanner;

class TwoDMatrixAdd {
	int[][] get_matrix_element() {
		Scanner input = new Scanner(System.in);
		int temp_matrix[][] = new int[2][2];
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				temp_matrix[i][j] = input.nextInt();
			}
		}
		return temp_matrix;
	}
	public static void main(String[] args) {
		int matrix1[][] = new int[2][2];
		int matrix2[][] = new int[2][2];
		int resulting_matrix[][] = new int[2][2];
		TwoDMatrixAdd twoDMatrixAddObj = new TwoDMatrixAdd();
		System.out.print("2D Matrix Addition!\nEnter First Matrix(row wise):");
		matrix1 = twoDMatrixAddObj.get_matrix_element();
		System.out.print("2D Matrix Addition!\nEnter Second Matrix(row wise):");
		matrix2 = twoDMatrixAddObj.get_matrix_element();
		System.out.println("Resulting Matrix:");
		for(int i=0;i<2;i++) {
			for (int j=0;j<2;j++) {
				resulting_matrix[i][j] = matrix1[i][j]+matrix2[i][j];
				System.out.print(resulting_matrix[i][j]+"	");
			}
			System.out.println();
		}
	}
}