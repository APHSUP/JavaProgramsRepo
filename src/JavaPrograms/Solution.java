package JavaPrograms;
import java.util.BitSet;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    Scanner sc = new Scanner(System.in);
    int bitSize, seriesOfOps;
    String Operation ="";
    int set1, set2;
    
    bitSize = sc.nextInt();
    seriesOfOps = sc.nextInt();
    sc.nextLine();
    
    BitSet B1 = new BitSet(bitSize);
    BitSet B2 = new BitSet(bitSize);
    
     
    for(int i=0; i<seriesOfOps; i++) {
    	
    	
    	
    	Operation = sc.next();
    	set1 = sc.nextInt();
    	set2=sc.nextInt();
    	
    
    	
    	if(Operation.equalsIgnoreCase("AND")) {
    		if(set1==1 &  set2==2) {
    			B1.and(B2);
    		}
    		else {
    			B2.and(B1);
    		}
    		
    	}
    	else if(Operation.equalsIgnoreCase("OR")) {
   
    		if(set1==1 &  set2==2) {
    			B1.or(B2);
    		}
    		else {
    			
    			B2.or(B1);
    		}
    		
    	}
    	else if(Operation.equalsIgnoreCase("XOR")) {
    		if(set1==1 &  set2==2) {
    			B1.xor(B2);
    		}
    		else {
    			B2.xor(B1);
    		}
    		
    	}
    	else if(Operation.equalsIgnoreCase("FLIP")) {
    		if(set1==1) {
    			B1.flip(set2);
    		}
    		else {
    			B2.flip(set2);
    		}
    		
    	}
    	else if(Operation.equalsIgnoreCase("SET")) {
    		if(set1==1) {
    			B1.set(set2);
    		}
    		else {
    			B2.set(set2);
    		}
    		
    	}
    	System.out.println(B1.cardinality()+" "+B2.cardinality());
    	Operation = "";
    	set1 = 0;
    	set2=0;
    }
    
       
    }
}