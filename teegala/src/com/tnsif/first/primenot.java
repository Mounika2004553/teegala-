package com.tnsif.first;

public class primenot {

    public static void main(String[] args) {
       // Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = 56;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num + " is prime.");
        } else {
            System.out.println(num + " is not prime.");
        }
    }
		// TODO Auto-generated method stub

	}


