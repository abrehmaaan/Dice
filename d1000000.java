import java.util.*;

public class d1000000 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int noOfTests, noOfDice;
		int[] faces;
	    noOfTests = scan.nextInt();
	    for (int i = 1; i <= noOfTests;i++) {
	    	noOfDice = scan.nextInt();
	        faces = new int [noOfDice];
	    	for(int j = 0; j < noOfDice; j++) {
	        	faces[j] = scan.nextInt();
	        }
	        Arrays.sort(faces);
	        int straight = 0;
	        for(int j = 0; j<noOfDice; j++) {
	        	if(straight + 1 <= faces[j]) {
	        		straight++;
	        	}
	        	else {
	        		continue;
	        	}
	        }
	        System.out.println("Case #"+i+": "+straight);
	    }
	}
}
