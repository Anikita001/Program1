
public class Sample6 {
	public static void main(String[] args) {
		int lines=5;
		int numcount=1;
		int spacecount=2;
		int mid=(lines+1)/2;
		int n=1;
		
		for(int i=1;i<=lines;i++) {
			
			for(int k=1;k<=numcount;k++) {		
				System.out.print("*");
					System.out.print(n++);
			}
			for(int j=1;j<=spacecount;j++) {
				System.out.print(" ");
			}
			n=1;
			System.out.println();
			spacecount--;
		   
		}
		
	}
}
