/*
Question 202 - Happy Number

Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
*/

import java.util.Set;
import java.util.HashSet;

public class Q202_HappyNumber {
    public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();

		while(!set.contains(n)) {
			set.add(n);
			n = sumOfSquaredDigits(n);

			if(n == 1) {
				return true;
			}
		}
		
		return false;
    }
    
    private static int sumOfSquaredDigits(int n) {
		int sum = 0;
		int temp = 0;
		while(n > 0) {
			temp = n%10;
			 sum += temp*temp;
			 n /= 10;
		}
		return sum;
	}
}
