import java.util.*;
public class Main
{
    static void undoom_dice(int[] die1,int[] die2){
        Random rand = new Random();
        int[] new_die_A = {1,2,3,4,0,0};
        for(int i = 4; i <6 ; i++){
	        new_die_A[i] = rand.nextInt(3)+1;
           
	    }
	    int[] new_die_B = new int[6];
	    for(int i = 0; i < new_die_B.length; i++){
	        int x = die1[i] - new_die_A[i] + die2[i];
	        if (x>0)   
	            new_die_B[i]=x;
	        else{
	           int y = new_die_A[i] -die1[i];
	           new_die_A[i] = y;
	           new_die_B[i] = die2[i];
	       }
	    }
	   for(int j = 0; j <new_die_A.length  ; j++){
	     System.out.print(new_die_A[j]+ " ");
	     }
	    System.out.println();
	   for(int k = 0; k <new_die_B.length  ; k++){
	     System.out.print(new_die_B[k]+ " ");
	     }
	     
	  
	        
	    
    
        
    }
	public static void main(String[] args) {
	int[] die1 ={1,2,3,4,5,6};
	int[] die2 = {1,2,3,4,5,6};
	undoom_dice(die1,die2);
}
}
