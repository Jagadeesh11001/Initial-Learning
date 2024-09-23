package hello;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Fruits {
	//lists & sets
	public static void main(String[] args) {
//		//<generic>
//		List<Integer> intList = new ArrayList<Integer>();
//		intList.add(1);
//		
//		
//		List<String> list = new ArrayList<String>();
//		//list
//		list.add("apple");
//		list.add("mango");
//		list.add("apple");
//		list.add("grape");
//		list.add("pine");
//		
//		//isEmpty
//		boolean empty = list.isEmpty();
//		System.out.println(empty);
//		
//		//clear
//		list.clear();
//		boolean empty1 = list.isEmpty();
//		System.out.println(empty1);
//		
//		//get
//		String value1 = list.get(4);
//		System.out.println(value1);
//		
//		//total
//		for (String eachFruit : list) {
//			System.out.println(eachFruit);
//		}
//		
//		//contains
//		boolean pine = list.contains("pine");
//		System.out.println("has fruit:" +pine);
//		
//		//remove
//		list.remove("apple");
//		int size = list.size();
//		System.out.println("Size=" +size);
		

		///HashSet - jumbled order
		///TreeSet - Alphabetic order
		///LinkedHashSet - same order as given
		
		Set<String> set = new HashSet<String>();
		set.add("apple");
		set.add("mango");
		set.add("apple");
		set.add("grape");
		set.add("pine");
		
		//to acheive get option
		List<String> list = new ArrayList<String>(set);
		for (String myList : list) {
			System.out.println(myList);
		}
		String strng = list.get(0);
		System.out.println(strng);
		
		
		
		
//		for (String oneFruit : set) {
//			System.out.println(oneFruit);
//		}
//		
//		//contains
//		//clear
//		//isEmpty
//		//no get option(bcoz of diff collection)
		
	}

}
