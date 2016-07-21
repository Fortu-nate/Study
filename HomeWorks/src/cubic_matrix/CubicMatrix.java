package cubic_matrix;

public class CubicMatrix {

	public static void main(String[] args) {

		int[][][] matrix = { { { 1, 0 }, { 3, 4 } }, { { 5, 0 }, { 0, 8 } } };
		// first layer
		// matrix[0][0][0] = 1;
		// matrix[0][0][1] = 0;
		// matrix[0][1][0] = 3;
		// matrix[0][1][1] = 4;

		// second layer
		// matrix[1][0][0] = 5;
		// matrix[1][0][1] = 0;
		// matrix[1][1][0] = 0;
		// matrix[1][1][1] = 8;

		OUTER: for (int layer = 0; layer < matrix.length; layer++) {
			for (int column = 0; column < matrix[layer].length; column++) {
				for (int row = 0; row < matrix[column].length; row++) {
					if (matrix[layer][column][row] == 0) {
						System.out.println(layer);
						continue OUTER;
					}

					// System.out.print(matrix[layer][column][row] + " ");
				}
				// System.out.println();
			}
			// System.out.println();
		}
	}

}
