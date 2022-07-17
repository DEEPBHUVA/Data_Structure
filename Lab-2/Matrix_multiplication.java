// Read two matrices, first 3x2 and second 2x3, perform multiplication operation and store result in 
// third matrix and print it.
import java.util.Scanner;
public class Matrix_multiplication{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Rows For 1st Matrix:");
		int r1=sc.nextInt();
		System.out.print("Enter column For 1st Matrix:");
		int c1=sc.nextInt();
		System.out.print("Enter Rows For 2nd Matrix:");
		int r2=sc.nextInt();
		System.out.print("Enter column For 2nd Matrix:");
		int c2=sc.nextInt();

		if(c1!=r2){
			System.out.print("--Multiplication is not possible--");
		}
		else{
			int matrix1[][]=new int[r1][c1];
			int matrix2[][]=new int[r2][c2];
			int multi[][]=new int[r1][c2];

			//Enter First Matrix//
			System.out.println("Enter Frist Matrix:");
				for (int i=0;i<r1;i++){
					for (int j=0;j<c1;j++){
						matrix1[i][j]=sc.nextInt();
					}
					//System.out.println();
				}

			//Enter Second Matrix//
			System.out.println("//--------------------//");
			System.out.println("Enter Second Matrix:");
				for (int i=0;i<r2;i++){
					for (int j=0;j<c2;j++){
						matrix2[i][j]=sc.nextInt();
					}
				}

			//--Multiplication--//
			System.out.println("//--------------------//");
			System.out.println("Multiplication Above Tow Matrix");
			for(int i=0;i<r1;i++){
				for(int j=0;j<c2;j++){
					multi[i][j]=0;
						for(int k=0;k<c1;k++){
							multi[i][j]+=matrix1[i][k]*matrix2[k][j];
						}
						System.out.print(multi[i][j]+" ");
				}
				System.out.println();
			}
		}
	}
}