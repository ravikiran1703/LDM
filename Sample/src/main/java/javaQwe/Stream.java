package javaQwe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.TreeSet;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Random random = new Random();
//		random.longs().limit(10).forEach(System.out::println);
//		
		HashSet<String>strings474 = new HashSet<String>();
		strings474.add("bdbfk");
		strings474.add("123231");
		strings474.add("yuifk45");

						

		//get count of empty string
//		long count = strings474.stream().filter(string -> string.trim().isEmpty()).count();
		System.out.println(strings474.toString().substring(2, 6));
	}

}
