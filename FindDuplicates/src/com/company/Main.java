package com.company;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
	 // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        //Get the size of the array, check if it is an integer
        System.out.println("\nPlease enter the amount of data (numbers) in the array and press enter key, the system will only accept the number as an integer:");
        while(!sc.hasNextInt()){
            sc.next();
            System.err.println("This is not an integer, please try again:");
        }
        int length = sc.nextInt();

        //Initialize array
        int[] arrs = new int[length];

        //Get the elements of the array, check if they are an integer
        System.out.println("\nPlease enter the elements of the array and press enter key, the system will only accept the number as integer:");
        for (int i = 0; i < length; i++) {
            while(!sc.hasNextInt()){
                sc.next();
                System.err.println("This is not an integer, please try again:");
            }
                arrs[i]= sc.nextInt();
        }

        //For maintenance purposes only. Displays the elements of an array
//        System.out.println("\nArray elements:");
//        for (int i = 0; i < length; i++) {
//            System.out.println(arrs[i]);
//        }

        //Initialize collections
        System.out.println("\nDuplicate elements from array:");
        Set<Integer> store = new HashSet<>();

        //Print duplicates
        int sum = 0;
        for (int arr : arrs) {
            if (store.add(arr) == false) {
                System.out.println("Found a duplicate element: " + arr);
                sum = sum + arr;
            }

        }
        //Print SUM
        System.out.println("\nSum of duplicate numbers in the collection: " + sum);
    }
}
