package practice;

public class MatrixOperations {

	public static void main(String[] args) {
		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 } };
		int b[][] = { { 1, 3, 4 }, { 2, 4, 3 }, { 3, 4, 5 } };
		MatrixOperations obj = new MatrixOperations();
		obj.multiplyMatrix(a, b);
		obj.addMatrix(a, b);
		obj.transpose(b);
	}

	public void multiplyMatrix(int[][] a, int[][] b) {
		int c[][] = new int[3][3];
		System.out.println("Multiplication of Two matrix is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}

	public void addMatrix(int[][] a, int[][] b) {
		int c[][] = new int[3][3];
		System.out.println("Addition of Two matrix is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public void transpose(int[][] a) {
		int c[][] = new int[3][3];
		System.out.println("Transpose of matrix is :");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				c[i][j] = a[j][i];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
