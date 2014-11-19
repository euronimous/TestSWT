
public class Question2 {
	
	static String[] Hex = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"}; 
	
	public static String convert(int number){
		
		return Hex[number/16] + Hex[number%16];
		
	}

}
