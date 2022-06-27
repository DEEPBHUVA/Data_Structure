import java.util.Scanner;
public class Prime_demo{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Cheak Prime Or Not:");
		int n=sc.nextInt();
		int count=0;
		for(int i=2;i<=n/2;i++){
			if(n%i==0){
				count++;
				break;
			}
		}
			if(count==1){
				System.out.println("Given number is not prime");
			}
			else{
				System.out.println("Given number is prime");
			}
	}
}