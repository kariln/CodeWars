package CodeWars;

import java.util.*;
import java.lang.Math;
public class DescendingOrder {

 public static int sortDesc(final int num) {
		    //Your code
		      
		    String numstring = String.valueOf(num);
		    System.out.println("numstring " +numstring);
		    int lengde = numstring.length();
		    System.out.println("lengde "+lengde);
		    int out = 0;
		    List <Integer> liste = new ArrayList<Integer>(lengde);
		    
		    
		    for (int i = 0;i < lengde;i ++){
		    	char tall1 = numstring.charAt(i);
		    	System.out.println("tall1 " +tall1);
		    	int tall2 = Character.getNumericValue(tall1);
		    	System.out.println(tall2);
		    	liste.add(i,tall2);
		    	System.out.println(liste);
		    	
		    }
        Collections.sort(liste,Collections.reverseOrder());
        System.out.println(out);
        int var = lengde;
        for (int i = 0; i < lengde; i++){
          int max = liste.get(i);
          System.out.println("max: " + max);
          out += max * Math.pow(10, var-1);
          System.out.println("out: " + out);
          var -= 1;
         
        }
        System.out.println(out);
		  return out;
		}
 public static void main(String [] Args) {
	 sortDesc(123456789);
 }
}