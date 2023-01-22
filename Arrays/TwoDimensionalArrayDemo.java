
public class TwoDimensionalArrayDemo {

	public static void main(String[] args) {
		int[][] matrix1 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		for(int row[]: matrix1){
			for(int cell: row){
				System.out.print(cell+" ");
			}
			System.out.println();
		}
		System.out.println("");
		int[][] matrix2 = {{11, 12, 13}, {14, 15, 16}};
		for(int row[] : matrix2){
			for(int cell : row){
				System.out.print(cell+" ");
			}
			System.out.println();
		}
	}

}
