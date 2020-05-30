package com.collection;

import java.util.Arrays;

public class Lesson1 {

    public static void convertCharArrayToString(char[] chs){
        System.out.println("string format from character array: " + new String(chs));
    }

    public static void palindromeString(String string){

        // using StringBuilder
        System.out.println("Palindrome using StringBuilder: " + new StringBuilder(string).reverse());

        // without using build in library
        char[] ch = string.toCharArray();
        System.out.print("Palindrome without StringBuilder: ");
        for(char c: ch){
            System.out.print(c);
        }
        System.out.println("");
    }

    public static void copyArrayByRange(int[] arr){
        // copy elements from index 5 up to 7 but excluding 7th's index value
        int[] newArray = Arrays.copyOfRange(arr, 5, 7);
        System.out.println("new array length: " + newArray.length);
        for(int i: newArray){
            System.out.print(i + " ");
        }
    }

    public static void copyArrayByLength(int[] arr){
        // copy elements by length
        int[] a = Arrays.copyOf(arr, 3);
        System.out.println("Length of the copied array: " + a.length);
        for(int i: a){
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args){
        char[] chars = {'a', 'b', 'c'};
        int[] intArray = {11, 22, 33, 44, 55, 66};
        String string = "racecar";

        palindromeString(string);
        convertCharArrayToString(chars);
        copyArrayByRange(intArray);
        copyArrayByLength(intArray);
    }
}
