package inheritance;

public class Methodoverloadind {
public static void main(String[]args) {
	int[][] matrix = new int[5][2];
	matrix[0][0]=1;
	matrix[0][1]=2;
	matrix[4][0]=5;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<2;j++) {
			System.out.print(matrix[i][j]);
		}
		System.out.print(true );
	}
	
	
}
}
