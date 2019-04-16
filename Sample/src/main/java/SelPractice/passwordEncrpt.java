package SelPractice;


public class passwordEncrpt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TestNG has an inbuilt reporting ability in it";
		String[] arrstr = str.split(" ");
		if(arrstr.length > 0) {
			// System.out.println(arrstr[arrstr.length-1] + " " + arrstr[arrstr.length-2]) ;
			String s  = ""; 
			for(int i = 0; i < arrstr.length ;i++) {
				if(i == arrstr.length - 2) {
					s= arrstr[i];
				}
				else if(i == arrstr.length -1) {
					s = arrstr[i] + " "+s;
				}
				//	System.out.println(arrstr[i]);
			}
			System.out.println(s);
			
		}

	}

}
