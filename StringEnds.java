package CodeWars;

public class StringEnds {
	public static boolean solution(String str, String ending) {

	    int l_end = ending.length();
	    int l_str = str.length();
	    int tall_start = l_str-l_end;
	    int tall_slutt = l_str;
	    
	    if (l_str < l_end){
	    	return false;
	    }
	
	    if (str.substring(tall_start,tall_slutt).equals(ending)){
	    	return true;
	    }
    
	    else{
	    	return false;
	    }
   }
}
