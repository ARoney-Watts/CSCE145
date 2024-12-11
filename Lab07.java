//Ahmir Roney-Watts

import java.util.Scanner;

public class Lab07 {

	public static void main(String[] args) {
		
		Scanner key = new Scanner(System.in);
		
		System.out.println("Please enter the number of rows in matrix 1.");
		
		int mat1_rows = key.nextInt();
		
		System.out.println("Please enter the number of columns in matrix 1.");
		
		int mat1_cols = key.nextInt();
		
		System.out.println("Please enter the number of rows in matrix 2.");
		
		int mat2_rows = key.nextInt();
	
		System.out.println("Please enter the number of columns in matrix 2.");
	
		int mat2_cols = key.nextInt();
		
		//input validation
		while(mat2_rows != mat1_rows || mat2_cols != mat1_cols)
		{
			System.out.println("Dimension mismatch detected! Please re-enter the dimesions of matrix 2 so they match those of matrix 1! (For example if you put down \"5\" for rows in matrix 1, please put down \"5\" for the amount of rows in matrix 2).");
		
			System.out.println("Please re-enter the number of rows in matrix 2.");
		
			mat2_rows = key.nextInt();
		
			System.out.println("Please re-enter the number of columns in matrix 2.");
		
			mat2_cols = key.nextInt();
		}
		
			int[][] matrix1 = new int[mat1_rows][mat1_cols];
			
			int[][] matrix2 = new int[mat2_rows][mat2_cols];
			
			int[][] sumMatrix = new int[mat1_rows][mat2_cols];
			
			//building the first matrix
			for(int i = 0; i < mat1_rows; i++)
			{
				for(int j = 0; j < mat1_cols; j++)
				{
					System.out.println("Enter the value of Matrix 1 at position ("+i+","+j+"): ");
					
					matrix1[i][j] = key.nextInt();
				}
			}
			
			//second matrix
			for(int i = 0; i < mat2_rows; i++)
			{
				for(int j = 0; j < mat2_cols; j++)
				{
					System.out.println("Enter the value of Matrix 2 at position ("+i+","+j+"): ");
					
					matrix2[i][j] = key.nextInt();
				}
			}
			
			//sum matrix
			for(int i = 0; i < mat1_rows; i++)
			{
				for(int j = 0; j < mat1_cols; j++)
				{
					//adding the numbers from each index spot in both matrices
					sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
					
					//displaying the sum matrix
					System.out.print(sumMatrix[i][j]+" ");
				}
				
				System.out.println();
				
			}
	
	}

}
