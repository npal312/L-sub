package com.example.ntlwordmath;

public class WordMatrix {
	public String[][] createMatrix(int rows, int cols) {
		//– Creates a matrix with the specified dimensions, filled with initial words.
		return new String[2][2];
	}
	public String[] addMatrices(String[][] matrix1, String[][] matrix2) {
		//– Adds corresponding elements from two word matrices.
		return new String[2];
	}
	public String[][] multiplyMatrices(String[][] matrix1, String[][] matrix2) {
		//– Multiplies two matrices of words based on their numeric values.
		return new String[2][2];
	}
	public String[][] transposeMatrix(String[][] matrix) {
		//– Transposes a given matrix of words.
		return new String[2][2];
	}
	public String[][] fillMatrix(String[][] matrix, String word) {
		//– Fills a given matrix with a given word.
		return new String[2][2];
	}
	public String[][] clearMatrix(String[][] matrix) {
		//– Clears a given matrix of all values.
		return new String[2][2];
	}
	public String[][] resize(String[][] matrix, int row, int col) {
		//– Resizes a given matrix into any non-negative size (has a max of [MAX].
		return new String[2][2];
	}
	public String[][] mesh(String[][] matrix1, String[][] matrix2, boolean vert) { //vert is for if they go on top or next to each other (could use other data type)
		//– Meshes two matrices together.
		return new String[2][2];
	}
	public String[][] unmesh(String[][] matrix1, String[][] matrix2, boolean vert, int index) {
		//– Unmeshes two matrices at a given index.
		return new String[2][2];
	}
	public String[][] sentenceToMatrix(String sentence) {
		//– Turns a sentence into a matrix (unsure if they should specify dimensions or if I should generate them or if they provide one.
		return new String[2][2];
	}
}
