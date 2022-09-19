public class Assignment1_1_2 {

    public void spiralTraversal(int[][] matrix, int startRow, 
  			int startCol, int endRow, int endCol, int element)
	{
		// Left to right
		for (int i = startCol; i <= endCol && element > 0; i++)
		{
			element--;
			System.out.print("  " + matrix[startRow][i]);
		}
		// Top to down
		for (int i = startRow + 1; i <= endRow && element > 0; i++)
		{
			element--;
			System.out.print("  " + matrix[i][endCol]);
		}
		// Bottom right to bottom-left
		for (int i = endCol - 1; i >= startCol && element > 0; i--)
		{
			element--;
			System.out.print("  " + matrix[endRow][i]);
		}
		// Bottom left to top
		for (int i = endRow - 1; i > startRow && element > 0; i--)
		{
			element--;
			System.out.print("  " + matrix[i][startRow]);
		}
		if (startRow + 1 <= endRow - 1 && element > 0)
		{
			// Recursive call
			spiralTraversal(matrix, startRow + 1, 
                   startCol + 1, endRow - 1, endCol - 1, element);
        };
	}
        public static void main(String[] args)
	{
		Assignment1_1_2 task = new Assignment1_1_2();
		
		int [][]matrix ={
          {1, 2, 3, 4} , 
          {5, 6, 7, 8} , 
          {9, 10, 11, 12} , 
          {13, 14, 15, 16} , 
          {17, 18, 19, 20}  
        }; 
		int row = matrix.length;
		int col = matrix[0].length;
		
		int element = row * col;
		task.spiralTraversal(matrix, 0, 0, row - 1, col - 1, element);
	}
    
}
