import java.util.Scanner;

public class Sample3 {


public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	long binary=0,decimal=0;
	long  j=1,reminder;
	System.out.println("Enter a binary number:");
	binary=sc.nextLong();
	while(binary!=0) {
		reminder=binary%10;
		decimal=decimal+reminder*j;
		j=j*2;
		binary=binary/10;
		
	}
	System.out.println("Decimal Number is :"+decimal);
}
}
