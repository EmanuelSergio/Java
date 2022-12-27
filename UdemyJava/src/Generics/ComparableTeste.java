package Generics;

import java.util.TreeSet;

public class ComparableTeste {

	public static void main(String[] args) {
		
		TreeSet<Integer> nums = new TreeSet<Integer>();
		
		nums.add(10);
		nums.add(2);
		nums.add(3);
		nums.add(11);
		nums.add(23);
		nums.add(10);
		nums.add(123);
		nums.add(-10);
		
		for (Integer integer : nums) {
			System.out.println(integer);
		}
		
	}
	
}
