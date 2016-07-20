package cubic_matrix;

public class CubicMatrix {

	public static void main(String[] args) {

		int[][][] matrix = new int[2][2][2];
		// first layer
		matrix[0][0][0] = 1;
		matrix[0][0][1] = 2;
		matrix[0][1][0] = 3;
		matrix[0][1][1] = 4;

		// second layer
		matrix[1][0][0] = 5;
		matrix[1][0][1] = 6;
		matrix[1][1][0] = 7;
		matrix[1][1][1] = 8;

		for (int row = 0; row < matrix.length; row++) {
			for (int column = 0; column < matrix[row].length; column++) {
				for (int layer = 0; layer < matrix[column].length; layer++) {
					System.out.print(matrix[row][column][layer] + " ");
				}
				System.out.println();
			}
			System.out.println();
		}
	}

}
