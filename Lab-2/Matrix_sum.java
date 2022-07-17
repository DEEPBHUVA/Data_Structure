// Read two 2x2 matrices and perform addition of matrices into third matrix and print it.
import java.util.Scanner;
public class Matrix_sum{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[2][2];
		int b[][]=new int[2][2];
		int sum[][]=new int[2][2];

		//-----First Matrix-----//
		System.out.println("Enter Frist Matrix:");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Element Of The First Array");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}

		//-----Second Matrix-----//
		System.out.println("Enter Second Matrix:");
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b.length;j++){
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Element Of The First Array");
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

		//-----Sum Of Tow Matrix-----//
		System.out.println("Sum Of given Tow Matrix:");
		for(int i=0;i<sum.length;i++){
			for(int j=0;j<sum.length;j++){
				sum[i][j]=a[i][j]+b[i][j];
			}
		}
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a.length;j++){
				System.out.print(sum[i][j] + " ");
			}
			System.out.println();
		}
	}
}