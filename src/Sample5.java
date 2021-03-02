import java.util.Scanner;
//Fabonacci series
public class Sample5 {
public static void main(String[] args) {
	int x=0,y=1,z=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number ");
	int r=sc.nextInt();
	for(int k=1;k<=r;k++) {
		if(x<=r) {
			System.out.print(x+" ");
			z=x+y;
			x=y;
			y=z;
		}
	}
}
}
