package CodeWars;
import java.lang.StringBuilder;
public class Mumbling {
    
    public static String accum(String s) {
     // your code
     int lengde = s.length();
     String output;
     StringBuilder s2 = new StringBuilder();
     for (int i = 0; i <= lengde ; i+=1){
       char bokstav = s.charAt(i);
       s2.append(Character.toUpperCase(bokstav));
       for (int j = 0; j <= i; j+=1){
       s2.append(Character.toLowerCase(bokstav));
     }
     }
     output = s2.toString();
     
    System.out.println(output);
    return output;
    }
    
    public void main(String[] args) {
    	accum("abcd");
    }
}


