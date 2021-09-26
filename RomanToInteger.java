/*
 * Uses hash map to access Roman numeral values, computes value given
 * Roman numeral string
 */

import java.util.HashMap;

public class RomanToInteger {
	public static void main(String[] args) {
		//Exclude from LeetCode, used for testing purposes
		String s = "MCMXCIV";
		
		int num = 0;
		HashMap<Character, Integer> romVal = new HashMap<>();
		
		romVal.put('I', 1);
		romVal.put('V', 5);
		romVal.put('X', 10);
		romVal.put('L', 50);
		romVal.put('C', 100);
		romVal.put('D', 500);
		romVal.put('M', 1000);
		
        for (int i = 0; i < s.length(); i++) {
        	
        		//Checks if next value is out of bounds
            	if (!(i+1 >= s.length())) {
            		
            		//subtracts if next value is greater, else adds
            		if((romVal.get(s.charAt(i+1)) > romVal.get(s.charAt(i)))) {
            			num -= romVal.get(s.charAt(i));
            		}
            		else {
            			num += romVal.get(s.charAt(i));
            		}
            	}
            	//if value is out of bounds, adds
            	else {
        			num += romVal.get(s.charAt(i));
        		}
        }
        //Exclude from LeetCode, and add return statement
        System.out.println(num);
	}
}
