package javaQwe;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

import org.apache.commons.collections4.list.TreeList;
import org.apache.commons.collections4.map.LinkedMap;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		LinkedHashSet <String> hash_Set = new LinkedHashSet <String>(); 
		hash_Set.add("Set"); 
		hash_Set.add("interface"); 
		hash_Set.add("1"); 
		hash_Set.add("remove"); 
		hash_Set.add("2"); 
		hash_Set.add("Geeks"); 
		hash_Set.add("5"); 
		hash_Set.add("Geeks"); 
		hash_Set.add("3"); 
		hash_Set.add("Set"); 
		hash_Set.add(null); 
		hash_Set.add(null); 
		hash_Set.add(null); 
		hash_Set.add(null);
		//System.out.print("Set output without the duplicates"); 

		//System.out.println(hash_Set); 

		List<String>  hello = new Vector<String>(); 
		hello.add("Set"); 
		hello.add("interface"); 
		hello.add("1"); 
		hello.add("remove"); 
		hello.add("2"); 
		hello.add("Geeks"); 
		hello.add("5"); 
		hello.add("Geeks"); 
		hello.add("3"); 
		hello.add("Set"); 
		hello.add(null); 
		hello.add(null);
		hello.add(null); 
		hello.add(null);
		hello.add(null); 
		hello.add(null);
		hello.add(null); 
		hello.add(null);

		//System.out.print("Set output without the duplicates"); 

		//System.out.println(hello);   

		LinkedMap<String,Integer> hash_S = new LinkedMap<String,Integer>();
		hash_S.put("qwe", 1);
		hash_S.put("tyu", 2);
		hash_S.put("qwe1", 1);
		hash_S.put("tyu2", 2);
		System.out.println(hash_S);  
		
	

	}

}
