package com.tnsif.first;

public class Armstrong {

	public static void main(String[] args) {
		        int num=947;
		        int num_digits = String.valueOf(num).length();
		        int original=num;
		        int sum=0;
		        while (num!=0){
		            int last_digit=num % 10;
		            sum += (int)Math.pow(last_digit,num_digits);  
		            num=num/10;
		        }
		        if(sum==original){
		            System.out.println("ArmStrong Number !!");
		        }else{
		            System.out.println("Not Armstrong !!");
		        }
		    }
	}


