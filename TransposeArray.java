package day7;

public class TransposeArray {

	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3},
				{4,5,6}
				
		};
		int rows = matrix.length;
	    int cols = matrix[0].length;
		for (int i = 0; i < cols; i++) {
	        for (int j = 0; j < rows; j++) {
	       // int[][] transposed[j][i] = matrix[i][j];
		        System.out.print( matrix[j][i] + " ");
		    }
		    System.out.println(); // New line after each row
		}
		
		}
		

}
