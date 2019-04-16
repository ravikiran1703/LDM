package SelPractice;

public class Palidrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String str = "There is a string in this Sentence is mom"; 
	        String[] arrOfStr = str.split(" "); 
	        for(String Wrd : arrOfStr) {
	        	
	        	char[] arrChar = Wrd.toCharArray();    
	        	
	        	
	        	for (int i = arrChar.length-1 ; i >= 0; i--) {
					System.out.print(arrChar[i]);
					
				}
	        	System.out.print(" ");
	        }
	        
	}

}
