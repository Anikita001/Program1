
public class Sample2 {

	public static void main(String[] args) {
		int lines=5;
		int numcount=1;
		int spacecount=4;
		int mid=(lines+1)/2;
		
		for(int i=1;i<=lines;i++) {
			for(int j=1;j<=spacecount;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=numcount;k++) {
				if(k%2==0)
				System.out.print(1);
				else
					System.out.print(0);
			}
			System.out.println();
		    if(i<mid) {
			spacecount--;
			numcount+=2;
		    }
		    else {
		    	spacecount++;
		    	numcount-=2;
		    }
		    	
		}
		
	}
}
