import java.util.Arrays;

class setMatrixZeroes {
    public void setMatrixZeroes(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        boolean firstRowZero = false;
        boolean firstColZero = false;

        // Check if the first row has any zeros
        for (int j = 0; j < cols; j++) {
            if (mat[0][j] == 0) {
                firstRowZero = true;
                break;
            }
        }

        // Check if the first column has any zeros
        for (int i = 0; i < rows; i++) {
            if (mat[i][0] == 0) {
                firstColZero = true;
                break;
            }
        }

        // Use first row and first column to mark zeroes
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][j] == 0) {
                    mat[i][0] = 0;
                    mat[0][j] = 0;
                }
            }
        }

        // Set matrix cells to zero based on markers
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (mat[i][0] == 0 || mat[0][j] == 0) {
                    mat[i][j] = 0;
                }
            }
        }

        // Set the first row to zero if needed
        if (firstRowZero) {
            for (int j = 0; j < cols; j++) {
                mat[0][j] = 0;
            }
        }

        // Set the first column to zero if needed
        if (firstColZero) {
            for (int i = 0; i < rows; i++) {
                mat[i][0] = 0;
            }
        }
    }

    public static void main(String[] args) {
        setMatrixZeroes solution = new setMatrixZeroes();

        int[][] mat = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 9}
        };

        System.out.println("Original Matrix:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }

        solution.setMatrixZeroes(mat);

        System.out.println("\nMatrix after setting zeroes:");
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
}
