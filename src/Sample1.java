
import java.util.Scanner;

public class Sample1 {

	public static void main(String[] args) {
		System.out.println("Enter any no....");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=n;j++) {
				
				if(j==0 ||j+i==(n/2)+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
