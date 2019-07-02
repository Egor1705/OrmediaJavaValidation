package main;

public class Matrix {

	private int[][] matrix;

	public void create() {
		int n = 5;

		matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = 0;
			}
		}

	}

	public void show() {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println("\n");
	}

	public void insert() {
		int rows2 = (int) (Math.random() * 4);
		int columns2 = (int) (Math.random() * 4);
		

		for (int i = rows2; i < rows2 + 2; i++) {
			for (int j = columns2; j < columns2 + 2; j++) {
				matrix[i][j] = 2;
			}
		}

		int rows1 = (int) (Math.random() * 4);
		int columns1 = (int) (Math.random() * 4);

		
		if (rows2 < 2 && columns2 < 2) {

			if (rows1 == rows2 || rows1 == rows2 + 1 || rows1 == rows2 - 1) {
				columns1 = 2 + (int) (Math.random() * (columns2 + 1));
			}
			if (columns1 == columns2 || columns1 == columns2 + 1 || columns1 == columns2 - 1) {
				rows1 = 2 + rows2;
			}
		}

		if (rows2 < 2 && columns2 > 1) {

			if (rows1 == rows2 || rows1 == rows2 - 1 || rows1 == rows2 + 1) {
				columns1 = (int) (Math.random() * (columns2 - 1));
			}
			if (columns1 == columns2 || columns1 == columns2 + 1 || columns1 == columns2 - 1) {
				rows1 = 2 + rows2;
			}
		}

		if (rows2 > 1 && columns2 > 1) {

			if (rows1 == rows2 || rows1 == rows2 + 1 || rows1 == rows2 - 1) {
				columns1 = (int) (Math.random() * (columns2 - 1));
			}
			if (columns1 == columns2 || columns1 == columns2 + 1 || columns1 == columns2 - 1) {
				rows1 = (int) (Math.random() * (rows2 - 1));
			}
		}

		if (rows2 > 1 && columns2 < 2) {

			if (rows1 == rows2 || rows1 == rows2 + 1 || rows1 == rows2 - 1) {
				columns1 = 2 + (int) (Math.random() * (columns2 + 1));
			}
			if (columns1 == columns2 || columns1 == columns2 + 1 || columns1 == columns2 - 1) {
				rows1 = (int) (Math.random() * (rows2 - 1));
			}
		}

		for (int i = rows1; i < rows1 + 2; i++) {
			for (int j = columns1; j < columns1 + 2; j++) {
				matrix[i][j] = 1;
			}
		}
	}

}
