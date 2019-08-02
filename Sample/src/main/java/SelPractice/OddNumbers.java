package SelPractice;

public class OddNumbers {

	public static void main(String[] args) {


		int num = 1 ;
		for (int i = 1; i <= 100000; i++) {
//			if(!(i%2 ==0)) {
//				
//				for (int j = 1; j <= i; j++) {
//					if(num==j) {
//						System.out.println(j);
//						num = num+i ;
//						continue;
//						}
//					
//				}
//			}
			System.out.println(i);
			i = i+ (i * 2)+1;
		}
	}

}

//1,5,17,53