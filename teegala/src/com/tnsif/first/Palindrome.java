package com.tnsif.first;

public class Palindrome {
		    public static void main(String[] args) {
		        int num = 123;
		        int original = num;
		        int reversed = 0;

		        while (num != 0) {
		            int digit = num % 10;
		            reversed = reversed * 10 + digit;
		            num = num / 10;
		        }

		        if (original == reversed) {
		            System.out.println("Palindrome Number !!");
		        } else {
		            System.out.println("Not a Palindrome!!");
		        }
		    }
		

		// TODO Auto-generated method stub

	}
